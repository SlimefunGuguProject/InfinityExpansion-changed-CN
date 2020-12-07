package io.github.mooy1.infinityexpansion.implementation.materials;

import io.github.mooy1.infinityexpansion.lists.Categories;
import io.github.mooy1.infinityexpansion.lists.Items;
import io.github.mooy1.infinityexpansion.lists.RecipeTypes;
import io.github.mooy1.infinityexpansion.utils.RecipeUtils;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

/**
 * Important materials
 *
 * @author Mooy1
 */
public class MainMaterial extends SlimefunItem implements NotPlaceable {

    public MainMaterial(Type type) {
        super(type.getCategory(), type.getItem(), type.getRecipetype(), type.getRecipe());
    }

    @Getter
    @AllArgsConstructor(access = AccessLevel.PRIVATE)
    public enum Type {

        INFINITY(Categories.MAIN_MATERIALS, Items.INFINITE_INGOT, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                Items.EARTH_SINGULARITY,
                Items.MYTHRIL,
                Items.FORTUNE_SINGULARITY,
                Items.MAGIC_SINGULARITY,
                Items.VOID_INGOT,
                Items.METAL_SINGULARITY,
                null, null, null
        }),
        
        BIT(Categories.MAIN_MATERIALS, Items.VOID_BIT, RecipeTypes.VOID_HARVESTER, null),
        DUST(Categories.MAIN_MATERIALS, Items.VOID_DUST, RecipeType.ENHANCED_CRAFTING_TABLE, RecipeUtils.Compress(Items.VOID_BIT)),
        INGOT(Categories.MAIN_MATERIALS, Items.VOID_INGOT, RecipeType.ENHANCED_CRAFTING_TABLE, RecipeUtils.Compress(Items.VOID_DUST)),

        FORTUNE(Categories.INFINITY_MATERIALS, Items.FORTUNE_SINGULARITY, RecipeType.SMELTERY, new ItemStack[] {
                Items.GOLD_SINGULARITY,
                Items.DIAMOND_SINGULARITY,
                Items.EMERALD_SINGULARITY,
                Items.NETHERITE_SINGULARITY,
                Items.ADAMANTITE,
                null, null, null, null
        }),
        MAGIC(Categories.INFINITY_MATERIALS, Items.MAGIC_SINGULARITY, RecipeType.SMELTERY, new ItemStack[] {
                Items.REDSTONE_SINGULARITY,
                Items.LAPIS_SINGULARITY,
                Items.QUARTZ_SINGULARITY,
                Items.MAGNESIUM_SINGULARITY,
                Items.MAGNONIUM,
                null, null, null, null
        }),
        EARTH(Categories.INFINITY_MATERIALS, Items.EARTH_SINGULARITY, RecipeType.SMELTERY, new ItemStack[] {
                Items.COMPRESSED_COBBLESTONE_4,
                Items.COAL_SINGULARITY,
                Items.IRON_SINGULARITY,
                Items.COPPER_SINGULARITY,
                Items.LEAD_SINGULARITY,
                null, null, null, null
        }),
        METAL(Categories.INFINITY_MATERIALS, Items.METAL_SINGULARITY, RecipeType.SMELTERY, new ItemStack[] {
                Items.SILVER_SINGULARITY,
                Items.ALUMINUM_SINGULARITY,
                Items.TIN_SINGULARITY,
                Items.ZINC_SINGULARITY,
                Items.TITANIUM,
                null, null, null, null
        }),
        MAGSTEEL(Categories.MAIN_MATERIALS, Items.MAGSTEEL, RecipeType.SMELTERY, new ItemStack[] {
                SlimefunItems.MAGNESIUM_INGOT,
                SlimefunItems.STEEL_INGOT,
                SlimefunItems.MAGNESIUM_DUST,
                null, null, null, null, null, null
        }),
        TITANIUM(Categories.MAIN_MATERIALS, Items.TITANIUM, RecipeType.SMELTERY, new ItemStack[] {
                SlimefunItems.REINFORCED_ALLOY_INGOT,
                SlimefunItems.DAMASCUS_STEEL_INGOT,
                SlimefunItems.HARDENED_METAL_INGOT,
                null, null, null, null, null, null
        }),
        MYTHRIL(Categories.MAIN_MATERIALS, Items.MYTHRIL, RecipeType.SMELTERY, new ItemStack[] {
                SlimefunItems.REINFORCED_ALLOY_INGOT,
                Items.IRON_SINGULARITY,
                SlimefunItems.HARDENED_METAL_INGOT,
                null, null, null, null, null, null
        }),
        ADAMANTITE(Categories.MAIN_MATERIALS, Items.ADAMANTITE, RecipeType.SMELTERY, new ItemStack[] {
                SlimefunItems.REDSTONE_ALLOY,
                Items.DIAMOND_SINGULARITY,
                Items.MAGSTEEL,
                null, null, null, null, null, null
        }),
        MAGNONIUM(Categories.MAIN_MATERIALS, Items.MAGNONIUM, RecipeType.SMELTERY, new ItemStack[] {
                Items.MAGSTEEL,
                Items.MAGNESIUM_SINGULARITY,
                Items.ENDER_ESSENCE,
                null, null, null, null, null, null
        });

        @Nonnull
        private final Category category;
        private final SlimefunItemStack item;
        private final RecipeType recipetype;
        private final ItemStack[] recipe;
    }
}