package me.tokyojack.mcmarket.acommand.test.subCommands;

import java.util.Arrays;

import org.bukkit.command.CommandSender;

import me.tokyojack.mcmarket.acommand.Kommand.Kommand;

public class Skywars extends Kommand {

	public Skywars() {
		super("Main gamemode command", Arrays.asList("skywar", "sw"));
	}

	@Override
	public boolean execute(CommandSender commandSender, String label, String[] args) {
		// Won't run this if you have the auto-generated help menu
		commandSender.sendMessage("help menu");
		return true;
	}

}
