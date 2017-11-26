package me.tokyojack.mcmarket.acommand.test.subCommands.subs;

import java.util.Arrays;

import org.bukkit.command.CommandSender;

import me.tokyojack.mcmarket.acommand.SubKommand.SubKommand;

public class Start extends SubKommand {
	public Start() {
		super("Main gamemode command", Arrays.asList("skywar", "sw"));
	}

	@Override
	public boolean execute(CommandSender commandSender, String[] args) {
		// Starting code etc etc.

		commandSender.sendMessage("Game started");
		return true;
	}

}
