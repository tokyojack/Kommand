package me.tokyojack.mcmarket.acommand.test.commands;

import java.util.Arrays;

import org.bukkit.command.CommandSender;

import me.tokyojack.mcmarket.acommand.Kommand.Kommand;

public class Ts extends Kommand {

	public Ts() {
		super("Tells the user the servers TS", Arrays.asList("ts3", "teamspeak"));
	}

	@Override
	public boolean execute(CommandSender commandSender, String label, String[] args) {
		commandSender.sendMessage("ts.coolserver.com");
		return true;
	}

}
