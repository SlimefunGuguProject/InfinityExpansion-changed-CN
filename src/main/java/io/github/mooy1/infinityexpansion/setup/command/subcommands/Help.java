package io.github.mooy1.infinityexpansion.setup.command.subcommands;

import io.github.mooy1.infinityexpansion.InfinityExpansion;
import io.github.mooy1.infinityexpansion.setup.command.InfinityCommand;
import io.github.mooy1.infinityexpansion.setup.command.SubCommand;
import org.bukkit.command.CommandSender;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.List;

public class Help extends SubCommand {
    public Help(InfinityExpansion plugin, InfinityCommand cmd) {
        super(plugin, cmd, "help", "displays this", false);
    }

    @Override
    public void onExecute(@Nonnull CommandSender sender, @Nonnull String[] args) {
        cmd.sendHelp(sender);
    }

    @Override
    @Nonnull
    public List<String> onTab(@Nonnull CommandSender sender, @Nonnull String[] args) {
        return new ArrayList<>();
    }
}