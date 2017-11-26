package me.tokyojack.mcmarket.acommand.test;

import org.bukkit.plugin.java.JavaPlugin;

import me.tokyojack.mcmarket.acommand.Kommand.KommandManager;
import me.tokyojack.mcmarket.acommand.SubKommand.SubKommandManager;
import me.tokyojack.mcmarket.acommand.test.commands.Ts;
import me.tokyojack.mcmarket.acommand.test.subCommands.Skywars;
import me.tokyojack.mcmarket.acommand.test.subCommands.subs.Start;

public class Test extends JavaPlugin {

	public void onEnable() {
		new KommandManager().addCommand(new Ts()).build();

		// The "true" is if running the command without args will generate a
		// help-menu
		new SubKommandManager(new Skywars(), true).addSubCommand(new Start()).build();
	}

}
