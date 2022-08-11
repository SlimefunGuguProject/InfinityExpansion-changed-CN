package io.github.mooy1.infinityexpansion.commands;

import java.util.List;
import java.util.UUID;

import javax.annotation.Nonnull;

import io.github.mooy1.infinitylib.common.PersistentType;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import io.github.mooy1.infinityexpansion.InfinityExpansion;
import io.github.mooy1.infinityexpansion.items.storage.StorageUnit;
import io.github.mooy1.infinitylib.commands.SubCommand;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;

import net.guizhanss.guizhanlib.common.Cooldown;

import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

public final class UpgradeItem extends SubCommand {

    private final Cooldown<UUID> cooldown = new Cooldown<>();

    public UpgradeItem() {
        super("upgradeitem", "升级手中物品", false);
    }

    @Override
    protected void execute(@Nonnull CommandSender commandSender, @Nonnull String[] strings) {
        if (!(commandSender instanceof Player)) {
            commandSender.sendMessage(ChatColor.RED + "只有玩家才能执行该指令!");
            return;
        }

        Player p = (Player) commandSender;

        // 使用频率限制
        if (!cooldown.check(p.getUniqueId())) {
            p.sendMessage(ChatColor.RED + "该指令使用过于频繁，请稍后再试!");
            return;
        }
        cooldown.set(p.getUniqueId(), 5000);

        ItemStack item = p.getInventory().getItemInMainHand();

        if (item.getType() == Material.AIR) {
            p.sendMessage(ChatColor.RED + "你必须手持一个物品!");
            return;
        }

        // 无尽贪婪物品检测
        SlimefunItem sfItem = SlimefunItem.getByItem(item);
        if (sfItem == null || !(sfItem.getAddon() instanceof InfinityExpansion)) {
            p.sendMessage(ChatColor.RED + "你手持的不是无尽贪婪的物品!");
            return;
        }

        if (sfItem instanceof StorageUnit) {
            upgradeItem(p, item, sfItem);

            ItemMeta meta = item.getItemMeta();
            PersistentDataContainer pdc = meta.getPersistentDataContainer();
            int amount = pdc.getOrDefault(StorageUnit.AMOUNT_KEY(), PersistentDataType.INTEGER, 0);
            if (amount > 0) {
                ItemStack displayItem = pdc.get(StorageUnit.ITEM_KEY(), PersistentType.ITEM_STACK_OLD);
                SlimefunItem displaySfItem = SlimefunItem.getByItem(displayItem);
                if (displaySfItem == null || !(sfItem.getAddon() instanceof InfinityExpansion)) {
                    p.sendMessage(ChatColor.RED + "存储单元内的物品不是无尽贪婪物品, 不需要更新!");
                    return;
                }
                p.sendMessage(ChatColor.YELLOW + "正在检测存储单元内的物品...");
                upgradeItem(p, displayItem, displaySfItem);

                ItemMeta newMeta = sfItem.getItem().getItemMeta();
                // 更新存储单元
                StorageUnit.saveToStack(newMeta, displayItem, displaySfItem.getItemName(), amount);
                item.setItemMeta(newMeta);
                p.sendMessage(ChatColor.GREEN + "已更新存储单元内的物品");
            }
        } else {
            upgradeItem(p, item, sfItem);
        }
    }

    @Override
    protected void complete(@Nonnull CommandSender commandSender, @Nonnull String[] strings, @Nonnull List<String> list) {

    }

    public static void upgradeItem(Player p, ItemStack item, SlimefunItem sfItem) {
        ItemMeta meta = item.getItemMeta();
        ItemMeta newMeta = sfItem.getItem().getItemMeta();

        if (meta.getDisplayName().equals(sfItem.getItemName())) {
            if (newMeta.hasLore()) {
                if (meta.getLore().equals(newMeta.getLore())) {
                    p.sendMessage(ChatColor.RED + "该物品名称与说明不需要更新!");
                    return;
                }
            } else {
                p.sendMessage(ChatColor.RED + "该物品名称与说明不需要更新!");
                return;
            }
        }

        meta.setDisplayName(newMeta.getDisplayName());
        if (newMeta.hasLore()) {
            meta.setLore(newMeta.getLore());
        }

        item.setItemMeta(meta);
        p.sendMessage(ChatColor.GREEN + "已更新物品名称与说明!");
    }
}
