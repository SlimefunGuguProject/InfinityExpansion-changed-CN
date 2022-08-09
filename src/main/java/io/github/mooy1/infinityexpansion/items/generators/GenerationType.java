package io.github.mooy1.infinityexpansion.items.generators;

import javax.annotation.Nonnull;

import lombok.AllArgsConstructor;
import lombok.Getter;

import org.bukkit.World;
import org.bukkit.block.Block;

import io.github.mooy1.infinityexpansion.utils.Util;

@AllArgsConstructor
public enum GenerationType {

    HYDROELECTRIC("水力") {
        @Override
        protected int generate(@Nonnull World world, @Nonnull Block block, int def) {
            return Util.isWaterLogged(block) ? def : 0;
        }
    },
    GEOTHERMAL("地热") {
        @Override
        protected int generate(@Nonnull World world, @Nonnull Block block, int def) {
            switch (world.getEnvironment()) {
                case NETHER:
                    return def * 2;
                case NORMAL:
                    return def;
                default:
                    return 0;
            }
        }
    },
    SOLAR("太阳能") {
        @Override
        protected int generate(@Nonnull World world, @Nonnull Block block, int def) {
            if (world.getEnvironment() == World.Environment.NORMAL
                    && world.getTime() < 13000
                    && block.getLocation().add(0, 1, 0).getBlock().getLightFromSky() == 15) {
                return def;
            }
            return 0;
        }
    },
    LUNAR("虚空") {
        @Override
        protected int generate(@Nonnull World world, @Nonnull Block block, int def) {
            switch (world.getEnvironment()) {
                case NETHER:
                case THE_END:
                    return def;
                case NORMAL: {
                    if (world.getTime() >= 13000
                            || block.getLocation().add(0, 1, 0).getBlock().getLightFromSky() != 15) {
                        return def;
                    }
                    return 0;
                }
                default:
                    return 0;
            }
        }
    },
    INFINITY("无尽") {
        @Override
        protected int generate(@Nonnull World world, @Nonnull Block block, int def) {
            return def;
        }
    };

    @Getter
    private final String toString;

    protected abstract int generate(@Nonnull World world, @Nonnull Block block, int def);

}
