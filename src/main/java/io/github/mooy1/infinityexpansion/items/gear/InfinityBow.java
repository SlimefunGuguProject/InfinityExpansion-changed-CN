package io.github.mooy1.infinityexpansion.items.gear;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;

import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import io.github.thebusybiscuit.slimefun4.api.MinecraftVersion;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.attributes.Soulbound;
import io.github.thebusybiscuit.slimefun4.core.handlers.BowShootHandler;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun4.implementation.items.weapons.ExplosiveBow;

public final class InfinityBow extends ExplosiveBow implements NotPlaceable, Soulbound {

    @ParametersAreNonnullByDefault
    public InfinityBow(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipe);
        setRecipeType(recipeType);
    }

    @Nonnull
    @Override
    public BowShootHandler onShoot() {
        BowShootHandler explosive = super.onShoot();
        return (e, target) -> {
            explosive.onHit(e, target);

            // 魔改: 10点伤害打底，3倍伤害
            if (e.getDamage() > 0) {
                if (e.getDamage() < 10) {
                    e.setDamage(30);
                } else {
                    e.setDamage(e.getDamage() * 3);
                }
            } else {
                return;
            }

            if (target instanceof Player) {
                Player p = (Player) target;

                // Fixes #3060 - Don't apply effects if the arrow was successfully blocked.
                if (p.isBlocking() && e.getFinalDamage() <= 0) {
                    return;
                }

                if (Slimefun.getMinecraftVersion().isAtLeast(MinecraftVersion.MINECRAFT_1_17)) {
                    p.setFreezeTicks(60);
                }
            }

            target.getWorld().playEffect(target.getLocation(), Effect.STEP_SOUND, Material.ICE);
            target.getWorld().playEffect(target.getEyeLocation(), Effect.STEP_SOUND, Material.ICE);

            // 魔改: 增加命中目标获得的药水效果
            target.addPotionEffect(new PotionEffect(PotionEffectType.GLOWING, 20 * 30, 1));
            target.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 20 * 6, 10));
            target.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 20 * 6, 2));
            target.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 20 * 2, -10));
        };
    }

}
