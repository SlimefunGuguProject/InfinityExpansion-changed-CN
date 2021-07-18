package io.github.mooy1.infinityexpansion.categories;

import org.bukkit.Material;

import io.github.mooy1.infinityexpansion.InfinityExpansion;
import io.github.mooy1.infinitylib.categories.MultiCategory;
import io.github.mooy1.infinitylib.categories.SubCategory;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;

/**
 * Categories for this addon
 *
 * @author Mooy1
 */
public final class Categories {
    
    public static final Category INFINITY_CATEGORY = new InfinityCategory(InfinityExpansion.inst().getKey("infinity_recipes"),
            new CustomItem(Material.RESPAWN_ANCHOR, "&b无尽 &7物品"), 3
    );
    public static final Category MAIN_MATERIALS = new SubCategory(InfinityExpansion.inst().getKey("main_materials"),
            new CustomItem(Material.NETHER_STAR, "&b无尽 &7基础材料")
    );
    public static final Category BASIC_MACHINES = new SubCategory(InfinityExpansion.inst().getKey("basic_machines"),
            new CustomItem(Material.LOOM, "&9无尽 &7基础机器")
    );
    public static final Category ADVANCED_MACHINES = new SubCategory(InfinityExpansion.inst().getKey("advanced_machines"),
            new CustomItem(Material.BLAST_FURNACE, "&c无尽 &7高级机器")
    );
    public static final Category STORAGE = new SubCategory(InfinityExpansion.inst().getKey("storage"),
            new CustomItem(Material.BEEHIVE, "&6无尽 &7存储")
    );
    public static final Category MOB_SIMULATION = new SubCategory(InfinityExpansion.inst().getKey("mob_simulation"),
            new CustomItem(Material.BEACON, "&b生物模拟")
    );
    public static final Category INFINITY_MATERIALS = new SubCategory(InfinityExpansion.inst().getKey("infinity_materials"),
            new CustomItem(Material.NETHERITE_BLOCK, "&b无尽 &a材料")
    );
    public static final Category MAIN_CATEGORY = new MultiCategory(InfinityExpansion.inst().getKey("main"),
            new CustomItem(Material.NETHER_STAR, "&b无尽 &7科技"), 3,
            MAIN_MATERIALS, BASIC_MACHINES, ADVANCED_MACHINES, STORAGE, MOB_SIMULATION, INFINITY_MATERIALS, INFINITY_CATEGORY
    );
    public static final Category INFINITY_CHEAT = new SubCategory(InfinityExpansion.inst().getKey("infinity_cheat"),
            new CustomItem(Material.RESPAWN_ANCHOR, "&b无尽 &7物品 &c- 作弊模式")
    );
    
    public static void setup(InfinityExpansion inst) {
        INFINITY_CATEGORY.register(inst);
        MAIN_CATEGORY.register(inst);
        INFINITY_CHEAT.register(inst);
    }
    
}