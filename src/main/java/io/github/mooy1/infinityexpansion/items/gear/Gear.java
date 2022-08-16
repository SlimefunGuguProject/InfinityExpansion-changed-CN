package io.github.mooy1.infinityexpansion.items.gear;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Level;

import lombok.experimental.UtilityClass;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import io.github.mooy1.infinityexpansion.InfinityExpansion;
import io.github.mooy1.infinityexpansion.categories.Groups;
import io.github.mooy1.infinityexpansion.items.blocks.InfinityWorkbench;
import io.github.mooy1.infinityexpansion.items.materials.Materials;
import io.github.mooy1.infinityexpansion.utils.Util;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;

@UtilityClass
public final class Gear {

    public static final SlimefunItemStack ENDER_FLAME = new SlimefunItemStack(
            "ENDER_FLAME",
            Material.ENCHANTED_BOOK,
            "&c末影之焰"
    );
    public static final SlimefunItemStack CROWN = new SlimefunItemStack(
            "INFINITY_CROWN",
            Material.NETHERITE_HELMET,
            "&b无尽头盔",
            "&7夜视 I",
            "&7潮涌能量 I",
            "&7力量 V",
            "&7鞘翅动能免疫"
    );
    public static final SlimefunItemStack CHESTPLATE = new SlimefunItemStack(
            "INFINITY_CHESTPLATE",
            Material.NETHERITE_CHESTPLATE,
            "&b无尽胸甲",
            "&7力量 II",
            "&7生命提升 I",
            "&7火焰抗性 I",
            "&7伤害吸收 II",
            "&7蜜蜂毒针保护"
    );
    public static final SlimefunItemStack LEGGINGS = new SlimefunItemStack(
            "INFINITY_LEGGINGS",
            Material.NETHERITE_LEGGINGS,
            "&b无尽护腿",
            "&7急迫 III",
            "&7生命恢复 I",
            "&7力量 V",
            "&7饱和 I",
            "&7抗辐射"
    );
    public static final SlimefunItemStack BOOTS = new SlimefunItemStack(
            "INFINITY_BOOTS",
            Material.NETHERITE_BOOTS,
            "&b无尽靴子",
            "&7力量 V",
            "&7幸运",
            "&7速度 III",
            "&7海豚的恩惠 I"
    );
    public static final SlimefunItemStack INFINITY_MATRIX = new SlimefunItemStack(
            "INFINITY_MATRIX",
            Material.NETHER_STAR,
            "&f无尽飞行器",
            "&6给予你像创造模式一样的飞行能力",
            "&7右键 启用/关闭飞行并且绑定自己",
            "&7蹲下右键移除自己的绑定",
            "&b灵魂绑定"
    );
    public static final SlimefunItemStack SHIELD = new SlimefunItemStack(
            "INFINITY_SHIELD",
            Material.SHIELD,
            "&b宇宙神盾"
    );
    public static final SlimefunItemStack BLADE = new SlimefunItemStack(
            "INFINITY_BLADE",
            Material.NETHERITE_SWORD,
            "&b寰宇支配之剑"
    );
    public static final SlimefunItemStack PICKAXE = new SlimefunItemStack(
            "INFINITY_PICKAXE",
            Material.NETHERITE_PICKAXE,
            "&9世界崩解之镐"
    );
    public static final SlimefunItemStack AXE = new SlimefunItemStack(
            "INFINITY_AXE",
            Material.NETHERITE_AXE,
            "&4自然荒芜之斧"
    );
    public static final SlimefunItemStack SHOVEL = new SlimefunItemStack(
            "INFINITY_SHOVEL",
            Material.NETHERITE_SHOVEL,
            "&a星球吞噬之铲"
    );
    public static final SlimefunItemStack BOW = new SlimefunItemStack(
            "INFINITY_BOW",
            Material.BOW,
            "&6天堂陨落长弓"
    );
    public static final SlimefunItemStack VEIN_MINER_RUNE = new SlimefunItemStack(
            "VEIN_MINER_RUNE",
            Material.DIAMOND,
            "&b矿脉符文",
            "&7升级工具以开采某些材料",
            "&7将此符文与工具融合"
    );

    public static void setup(InfinityExpansion plugin) {
        addInfinityEnchants(plugin,
                CROWN, CHESTPLATE, LEGGINGS, BOOTS,
                AXE, BLADE, PICKAXE,
                SHIELD, SHOVEL, BOW
        );
        EnchantmentStorageMeta storageMeta = (EnchantmentStorageMeta) ENDER_FLAME.getItemMeta();
        Objects.requireNonNull(storageMeta).addStoredEnchant(Enchantment.FIRE_ASPECT, 10, true);
        ENDER_FLAME.setItemMeta(storageMeta);
        new SlimefunItem(Groups.MAIN_MATERIALS, ENDER_FLAME, RecipeType.MAGIC_WORKBENCH, new ItemStack[] {
                Materials.ENDER_ESSENCE, Materials.ENDER_ESSENCE, Materials.ENDER_ESSENCE,
                Materials.ENDER_ESSENCE, new ItemStack(Material.BOOK), Materials.ENDER_ESSENCE,
                Materials.ENDER_ESSENCE, Materials.ENDER_ESSENCE, Materials.ENDER_ESSENCE
        }).register(plugin);
        new InfinityArmor(CROWN, new PotionEffect[] {
                new PotionEffect(PotionEffectType.NIGHT_VISION, 600, 0, false, false, false),
                new PotionEffect(PotionEffectType.CONDUIT_POWER, 600, 0, false, false, false),
                new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 600, 1, false, false, false),
        }, new ItemStack[] {
                null, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT, null,
                Materials.INFINITE_INGOT, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT,
                Materials.INFINITE_INGOT, Materials.COBBLE_HEART, Materials.LUMINA_SINGULARITY, Materials.LUMINA_SINGULARITY, Materials.COBBLE_HEART, Materials.INFINITE_INGOT,
                null, Materials.INFINITE_INGOT, null, null, Materials.INFINITE_INGOT, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null
        }).register(plugin);
        new InfinityArmor(CHESTPLATE, new PotionEffect[] {
                new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 600, 1, false, false, false),
                new PotionEffect(PotionEffectType.REGENERATION, 600, 2, false, false, false),
                new PotionEffect(PotionEffectType.ABSORPTION, 600, 2, false, false, false),
                new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 600, 6, false, false, false),
                new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 600, 0, false, false, false),
        }, new ItemStack[] {
                null, Materials.INFINITE_INGOT, null, null, Materials.INFINITE_INGOT, null,
                Materials.INFINITE_INGOT, Materials.LUMINA_SINGULARITY, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT, Materials.LUMINA_SINGULARITY, Materials.INFINITE_INGOT,
                Materials.LUMINA_SINGULARITY, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT, Materials.LUMINA_SINGULARITY,
                Materials.COBBLE_HEART, Materials.INFINITE_INGOT, Materials.COBBLE_HEART, Materials.COBBLE_HEART, Materials.INFINITE_INGOT, Materials.COBBLE_HEART,
                null, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT, null,
                null, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT, null
        }).register(plugin);
        new InfinityArmor(LEGGINGS, new PotionEffect[] {
                new PotionEffect(PotionEffectType.FAST_DIGGING, 600, 3, false, false, false),
                new PotionEffect(PotionEffectType.REGENERATION, 600, 3, false, false, false),
                new PotionEffect(PotionEffectType.SATURATION, 600, 0, false, false, false),
                new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 600, 1, false, false, false)
        }, new ItemStack[] {
                null, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT, null,
                Materials.INFINITE_INGOT, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT,
                Materials.COBBLE_HEART, Materials.INFINITE_INGOT, null, null, Materials.INFINITE_INGOT, Materials.COBBLE_HEART,
                Materials.COBBLE_HEART, Materials.INFINITE_INGOT, null, null, Materials.INFINITE_INGOT, Materials.COBBLE_HEART,
                Materials.COBBLE_HEART, Materials.INFINITE_INGOT, null, null, Materials.INFINITE_INGOT, Materials.COBBLE_HEART,
                null, Materials.INFINITE_INGOT, null, null, Materials.INFINITE_INGOT, null
        }).register(plugin);
        new InfinityArmor(BOOTS, new PotionEffect[] {
                new PotionEffect(PotionEffectType.SPEED, 600, 4, false, false, false),
                new PotionEffect(PotionEffectType.JUMP, 600, 1, false, false, false),
                new PotionEffect(PotionEffectType.DOLPHINS_GRACE, 600, 1, false, false, false),
                new PotionEffect(PotionEffectType.LUCK, 600, 1, false, false, false),
                new PotionEffect(PotionEffectType.SLOW_FALLING, 600, 1, false, false, false),
                new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 600, 1, false, false, false),
        }, new ItemStack[] {
                null, null, null, null, null, null,
                Materials.COBBLE_HEART, Materials.INFINITE_INGOT, null, null, Materials.INFINITE_INGOT, Materials.COBBLE_HEART,
                Materials.COBBLE_HEART, Materials.INFINITE_INGOT, null, null, Materials.INFINITE_INGOT, Materials.COBBLE_HEART,
                Materials.COBBLE_HEART, Materials.COBBLE_HEART, null, null, Materials.COBBLE_HEART, Materials.COBBLE_HEART,
                Materials.COBBLE_HEART, Materials.INFINITE_INGOT, null, null, Materials.INFINITE_INGOT, Materials.COBBLE_HEART,
                Materials.COBBLE_HEART, Materials.INFINITE_INGOT, null, null, Materials.INFINITE_INGOT, Materials.COBBLE_HEART
        }).register(plugin);
        new InfinityTool(SHIELD, new ItemStack[] {
                Materials.INFINITE_INGOT, Materials.INFINITE_INGOT, null, null, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT,
                Materials.INFINITE_INGOT, Materials.COBBLE_HEART, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT, Materials.COBBLE_HEART, Materials.INFINITE_INGOT,
                Materials.INFINITE_INGOT, Materials.COBBLE_HEART, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT, Materials.COBBLE_HEART, Materials.INFINITE_INGOT,
                Materials.INFINITE_INGOT, Materials.COBBLE_HEART, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT, Materials.COBBLE_HEART, Materials.INFINITE_INGOT,
                null, Materials.INFINITE_INGOT, Materials.COBBLE_HEART, Materials.COBBLE_HEART, Materials.INFINITE_INGOT, null,
                null, Materials.INFINITE_INGOT, Materials.COBBLE_HEART, Materials.COBBLE_HEART, Materials.INFINITE_INGOT, null
        }).register(plugin);
        new InfinityBow(Groups.INFINITY_CHEAT, BOW, InfinityWorkbench.TYPE, new ItemStack[] {
                null, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT, Materials.COBBLE_HEART, null, null,
                Materials.INFINITE_INGOT, null, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT, Materials.COBBLE_HEART, null,
                Materials.COBBLE_HEART, null, null, ENDER_FLAME, Materials.INFINITE_INGOT, Materials.COBBLE_HEART,
                null, Materials.COBBLE_HEART, null, null, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT,
                null, null, Materials.COBBLE_HEART, null, null, Materials.INFINITE_INGOT,
                null, null, null, Materials.COBBLE_HEART, Materials.INFINITE_INGOT, null
        }).register(plugin);
        new InfinityTool(AXE, new ItemStack[] {
                null, Materials.COBBLE_HEART, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT, null, null,
                Materials.COBBLE_HEART, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT, Materials.COBBLE_HEART, null,
                null, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT, Materials.COBBLE_HEART, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT,
                null, null, Materials.COBBLE_HEART, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT,
                null, Materials.COBBLE_HEART, null, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT, Materials.COBBLE_HEART,
                Materials.COBBLE_HEART, null, null, null, Materials.COBBLE_HEART, null
        }).register(plugin);
        new InfinityTool(BLADE, new ItemStack[] {
                null, null, null, null, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT,
                null, null, null, Materials.INFINITE_INGOT, Materials.COBBLE_HEART, Materials.INFINITE_INGOT,
                null, null, Materials.INFINITE_INGOT, Materials.COBBLE_HEART, Materials.INFINITE_INGOT, null,
                Materials.INFINITE_INGOT, Materials.INFINITE_INGOT, Materials.COBBLE_HEART, Materials.INFINITE_INGOT, null, null,
                null, Materials.COBBLE_HEART, Materials.INFINITE_INGOT, null, null, null,
                Materials.COBBLE_HEART, null, Materials.INFINITE_INGOT, null, null, null
        }).register(plugin);
        new InfinityTool(SHOVEL, new ItemStack[] {
                null, null, null, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT,
                null, null, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT,
                null, null, Materials.INFINITE_INGOT, Materials.COBBLE_HEART, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT,
                null, null, Materials.COBBLE_HEART, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT, null,
                null, Materials.COBBLE_HEART, null, null, null, null,
                Materials.COBBLE_HEART, null, null, null, null, null
        }).register(plugin);
        new InfinityTool(PICKAXE, new ItemStack[] {
                null, Materials.COBBLE_HEART, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT, null,
                null, null, null, Materials.INFINITE_INGOT, Materials.COBBLE_HEART, Materials.INFINITE_INGOT,
                null, null, null, Materials.COBBLE_HEART, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT,
                null, null, Materials.COBBLE_HEART, null, null, Materials.INFINITE_INGOT,
                null, Materials.COBBLE_HEART, null, null, null, Materials.COBBLE_HEART,
                Materials.COBBLE_HEART, null, null, null, null, null
        }).register(plugin);
        new InfinityMatrix(Groups.INFINITY_CHEAT, INFINITY_MATRIX, InfinityWorkbench.TYPE, new ItemStack[] {
                Materials.INFINITE_INGOT, null, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT, null, Materials.INFINITE_INGOT,
                Materials.INFINITE_INGOT, Materials.COBBLE_HEART, Materials.COBBLE_HEART, Materials.COBBLE_HEART, Materials.COBBLE_HEART, Materials.INFINITE_INGOT,
                Materials.COBBLE_HEART, Materials.COBBLE_HEART, new ItemStack(Material.ELYTRA), new ItemStack(Material.ELYTRA), Materials.COBBLE_HEART, Materials.COBBLE_HEART,
                Materials.COBBLE_HEART, Materials.COBBLE_HEART, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT, Materials.COBBLE_HEART, Materials.COBBLE_HEART,
                Materials.INFINITE_INGOT, Materials.COBBLE_HEART, Materials.COBBLE_HEART, Materials.COBBLE_HEART, Materials.COBBLE_HEART, Materials.INFINITE_INGOT,
                Materials.INFINITE_INGOT, null, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT, null, Materials.INFINITE_INGOT
        }).register(plugin);
        new VeinMinerRune(Groups.MAIN_MATERIALS, VEIN_MINER_RUNE, RecipeType.MAGIC_WORKBENCH, new ItemStack[] {
                Materials.MAGSTEEL_PLATE, SlimefunItems.PICKAXE_OF_VEIN_MINING, Materials.MAGSTEEL_PLATE,
                Materials.ENDER_ESSENCE, SlimefunItems.BLANK_RUNE, Materials.ENDER_ESSENCE,
                Materials.MAGSTEEL_PLATE, SlimefunItems.PICKAXE_OF_VEIN_MINING, Materials.MAGSTEEL_PLATE,
        }).register(plugin);
    }

    private static void addInfinityEnchants(InfinityExpansion plugin, SlimefunItemStack... items) {
        ConfigurationSection typeSection = plugin.getConfig().getConfigurationSection("infinity-enchant-levels");

        if (typeSection == null) {
            InfinityExpansion.log(Level.SEVERE, "Config section \"infinity-enchant-levels\" missing, Check your config and report this!");
            return;
        }

        for (SlimefunItemStack item : items) {
            ItemMeta meta = item.getItemMeta();

            // lore
            List<String> lore;
            if (meta.hasLore()) {
                lore = meta.getLore();
            }
            else {
                lore = new ArrayList<>();
            }
            lore.add(ChatColor.AQUA + "灵魂绑定");
            meta.setLore(lore);

            // find path
            String itemPath = item.getItemId().replace("INFINITY_", "").toLowerCase();
            ConfigurationSection itemSection = typeSection.getConfigurationSection(itemPath);

            // unbreakable and enchants
            meta.setUnbreakable(Objects.requireNonNull(itemSection).getBoolean("unbreakable"));
            for (Map.Entry<Enchantment, Integer> entry : Util.getEnchants(itemSection).entrySet()) {
                meta.addEnchant(entry.getKey(), entry.getValue(), true);
            }

            item.setItemMeta(meta);
        }
    }

}
