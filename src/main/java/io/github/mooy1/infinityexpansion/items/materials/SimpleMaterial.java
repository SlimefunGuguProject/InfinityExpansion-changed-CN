package io.github.mooy1.infinityexpansion.items.materials;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;

import org.bukkit.inventory.ItemStack;

import javax.annotation.Nullable;

public class SimpleMaterial extends SlimefunItem {

    private static final String WIKI_PAGE = "Materials";

    public SimpleMaterial(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);
    }

    public SimpleMaterial(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe, @Nullable ItemStack recipeOutput) {
        super(itemGroup, item, recipeType, recipe, recipeOutput);
    }

    @Override
    public void postRegister() {
        addWikiPage(WIKI_PAGE);
    }
}
