package net.guizhanss.minecraft.infinityexpansion.presets;

import io.github.thebusybiscuit.slimefun4.implementation.SlimefunPlugin;
import java.text.DecimalFormat;
import javax.annotation.Nonnull;

/**
 * This is preset is translated to Simplified Chinese by ybw0014
 * Original: {@see io.github.mooy1.infinitylib.presets.LorePreset}
 */
public final class LorePreset {
    private static final DecimalFormat FORMAT = new DecimalFormat("###,###,###,###,###,###.#");
    private static final double TPS = 20.0D / (double)SlimefunPlugin.getTickerTask().getTickRate();

    @Nonnull
    public static String energyPerSecond(int energy) {
        return "&8⇨ &e⚡ &7" + formatEnergy(energy) + " J/s";
    }

    @Nonnull
    public static String energyBuffer(int energy) {
        return "&8⇨ &e⚡ &7" + format((double)energy) + " J 可储存";
    }

    @Nonnull
    public static String energy(int energy) {
        return "&8⇨ &e⚡ &7" + format((double)energy) + " J ";
    }

    @Nonnull
    public static String speed(int speed) {
        return "&8⇨ &b⚡ &7速度: &b" + speed + 'x';
    }

    @Nonnull
    public static String formatEnergy(int energy) {
        return FORMAT.format((double)energy * TPS);
    }

    @Nonnull
    public static String format(double number) {
        return FORMAT.format(number);
    }

    private LorePreset() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }
}
