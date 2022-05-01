package io.github.mooy1.infinityexpansion.items.mobdata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;

import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;

import io.github.mooy1.infinityexpansion.categories.Groups;
import io.github.mooy1.infinitylib.machines.MachineLore;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.libraries.dough.collections.RandomizedSet;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;

import net.guizhanss.guizhanlib.minecraft.helper.entity.EntityTypeHelper;
import net.guizhanss.guizhanlib.utils.StringUtil;

/**
 * A mob data card which will be able to be used in the {@link MobSimulationChamber}
 */
@ParametersAreNonnullByDefault
public final class MobDataCard extends SlimefunItem implements RecipeDisplayItem, NotPlaceable {

    static final Map<String, MobDataCard> CARDS = new HashMap<>();

    public static SlimefunItemStack create(String id, MobDataTier tier) {
        // 血压起来了
        String name;
        if (id.equals("Endermen"))
            name = EntityTypeHelper.getName(EntityType.ENDERMAN);
        else
            name = EntityTypeHelper.getName(EntityType.valueOf(StringUtil.dehumanize(id)));

        return new SlimefunItemStack(
                StringUtil.dehumanize(id) + "_DATA_CARD",
                tier.material,
                "&b" + name + " 生物芯片",
                "&7放在生物模拟室中使用",
                "",
                MachineLore.energyPerSecond(tier.energy)
        );
    }

    public MobDataCard(String id, MobDataTier tier, ItemStack[] recipe) {
        super(Groups.MOB_SIMULATION, create(id, tier), MobDataInfuser.TYPE, recipe);
        this.tier = tier;
        CARDS.put(getId(), this);
    }

    public MobDataCard(SlimefunItemStack item, MobDataTier tier, ItemStack[] recipe) {
        super(Groups.MOB_SIMULATION, item, MobDataInfuser.TYPE, recipe);
        this.tier = tier;
        CARDS.put(getId(), this);
    }

    final RandomizedSet<ItemStack> drops = new RandomizedSet<>();
    final MobDataTier tier;

    public MobDataCard addDrop(ItemStack drop, float chance) {
        this.drops.add(drop, 1 / chance);
        return this;
    }

    public MobDataCard addDrop(ItemStack drop, int amount, float chance) {
        return addDrop(new CustomItemStack(drop, amount), chance);
    }

    public MobDataCard addDrop(Material drop, float chance) {
        return addDrop(new ItemStack(drop), chance);
    }

    public MobDataCard addDrop(Material drop, int amount, float chance) {
        return addDrop(new ItemStack(drop, amount), chance);
    }

    @Nonnull
    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> items = new ArrayList<>();
        for (ItemStack item : this.drops) {
            items.add(null);
            items.add(item);
        }
        return items;
    }

}
