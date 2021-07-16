package net.guizhanss.minecraft.infinityexpansion.presets;

import io.github.thebusybiscuit.slimefun4.utils.ChestMenuUtils;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

/**
 * This is preset is translated to Simplified Chinese by ybw0014
 * Original: {@see io.github.mooy1.infinitylib.presets.MenuPreset}
 */
public final class MenuPreset {
    public static final ItemStack BACKGROUND = ChestMenuUtils.getBackground();
    public static final ItemStack INVALID_INPUT;
    public static final ItemStack NO_INPUT;
    public static final ItemStack INVALID_RECIPE;
    public static final ItemStack NO_ENERGY;
    public static final ItemStack NO_ROOM;
    public static final ItemStack INPUT_ITEM;
    public static final ItemStack STATUS_ITEM;
    public static final ItemStack OUTPUT_ITEM;
    public static final ItemStack NO_NETWORK;
    public static final ItemStack LOADING;
    public static final int INPUT = 10;
    public static final int[] INPUT_BORDER;
    public static final int STATUS = 13;
    public static final int[] STATUS_BORDER;
    public static final int OUTPUT = 16;
    public static final int[] OUTPUT_BORDER;
    public static final int[] CRAFTING_INPUT;
    public static final int[] CRAFTING_INPUT_BORDER;
    public static final int CRAFTING_OUTPUT = 25;
    public static final int[] CRAFTING_OUTPUT_BORDER;
    public static final int[] CRAFTING_BACKGROUND;

    private MenuPreset() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    static {
        INVALID_INPUT = new CustomItem(Material.BARRIER, "&c无效输入!", new String[0]);
        NO_INPUT = new CustomItem(Material.BLUE_STAINED_GLASS_PANE, "&9放入一个物品", new String[0]);
        INVALID_RECIPE = new CustomItem(Material.BARRIER, "&c无效的配方!", new String[0]);
        NO_ENERGY = new CustomItem(Material.RED_STAINED_GLASS_PANE, "&c电量不足!", new String[0]);
        NO_ROOM = new CustomItem(Material.ORANGE_STAINED_GLASS_PANE, "&6空间不足!", new String[0]);
        INPUT_ITEM = new CustomItem(Material.BLUE_STAINED_GLASS_PANE, "&9输入", new String[0]);
        STATUS_ITEM = new CustomItem(Material.CYAN_STAINED_GLASS_PANE, "&3状态", new String[0]);
        OUTPUT_ITEM = new CustomItem(Material.ORANGE_STAINED_GLASS_PANE, "&6输出", new String[0]);
        NO_NETWORK = new CustomItem(Material.RED_STAINED_GLASS_PANE, "&c需要连接到能量网络!", new String[0]);
        LOADING = new CustomItem(Material.RED_STAINED_GLASS_PANE, "&c加载中...", new String[0]);
        INPUT_BORDER = new int[]{0, 1, 2, 9, 11, 18, 19, 20};
        STATUS_BORDER = new int[]{3, 4, 5, 12, 14, 21, 22, 23};
        OUTPUT_BORDER = new int[]{6, 7, 8, 15, 17, 24, 25, 26};
        CRAFTING_INPUT = new int[]{10, 11, 12, 19, 20, 21, 28, 29, 30};
        CRAFTING_INPUT_BORDER = new int[]{0, 1, 2, 3, 4, 9, 13, 18, 22, 27, 31, 36, 37, 38, 39, 40};
        CRAFTING_OUTPUT_BORDER = new int[]{24, 26, 15, 16, 17, 33, 34, 35};
        CRAFTING_BACKGROUND = new int[]{5, 6, 7, 14, 8, 23, 41, 42, 43, 44, 32};
    }
}
