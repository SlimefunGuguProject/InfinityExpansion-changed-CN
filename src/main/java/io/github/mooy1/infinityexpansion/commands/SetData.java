package io.github.mooy1.infinityexpansion.commands;

import java.util.List;

import javax.annotation.Nonnull;

import org.bukkit.ChatColor;
import org.bukkit.FluidCollisionMode;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import io.github.mooy1.infinityexpansion.items.storage.StorageUnit;
import io.github.mooy1.infinitylib.commands.AbstractCommand;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.BlockStorage;

public final class SetData extends AbstractCommand {

    public SetData() {
        super("setdata", "设置你指向的 Slimefun 方块的数据", true);
    }

    @Override
    public void onExecute(@Nonnull CommandSender commandSender, @Nonnull String[] strings) {
        if (!(commandSender instanceof Player)) {
            commandSender.sendMessage("只有玩家可以使用该指令!");
            return;
        }

        if (strings.length != 3) {
            commandSender.sendMessage(ChatColor.RED + "你必须指定键和值!");
            return;
        }

        Player p = (Player) commandSender;

        Block target = p.getTargetBlockExact(8, FluidCollisionMode.NEVER);

        if (target == null || target.getType() == Material.AIR) {
            p.sendMessage(ChatColor.RED + "你必须指着一个方块才能执行该指令!");
            return;
        }

        String id = BlockStorage.getLocationInfo(target.getLocation(), "id");

        if (id == null) {
            p.sendMessage(ChatColor.RED + "你必须指着一个 Slimefun 方块才能执行该指令!");
            return;
        }

        if (strings[1].equals("id")) {
            p.sendMessage(ChatColor.RED + "你不能更改方块的 id，这可能会导致内部问题!");
            return;
        }

        if (strings[2].equals("\\remove")) {
            p.sendMessage(ChatColor.GREEN + "已移除 " + id + "中 '" + strings[1] + "' 的值");
            BlockStorage.addBlockInfo(target, strings[1], null);
        } else {
            p.sendMessage(ChatColor.GREEN + "已设置 " + id + "中 '" + strings[1] + "' 的值为 '" + strings[2] + "'");
            BlockStorage.addBlockInfo(target, strings[1], strings[2]);
        }

        SlimefunItem unit = SlimefunItem.getByID(id);
        if (unit instanceof StorageUnit) {
            ((StorageUnit) unit).reloadCache(target);
        }
    }

    @Override
    public void onTab(@Nonnull CommandSender commandSender, @Nonnull String[] strings, @Nonnull List<String> list) {
        if (!(commandSender instanceof Player)) {
            return;
        }

        Player p = (Player) commandSender;

        Block target = p.getTargetBlockExact(8, FluidCollisionMode.NEVER);

        if (target == null || target.getType() == Material.AIR) {
            return;
        }

        if (strings.length == 2) {
            if (BlockStorage.hasBlockInfo(target)) {
                list.addAll(BlockStorage.getLocationInfo(target.getLocation()).getKeys());
                list.remove("id");
            }
        } else if (strings.length == 3 && !strings[1].equals("id")) {
            String current = BlockStorage.getLocationInfo(target.getLocation(), strings[1]);
            if (current != null) {
                list.add(current);
                list.add("\\remove");
            }
        }
    }

}
