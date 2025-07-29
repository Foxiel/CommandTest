package org.foxie.commandTest

import org.bukkit.plugin.java.JavaPlugin
import org.foxie.commandTest.commands.AppleCommand

class CommandTest : JavaPlugin() {

    override fun onEnable() {
        registerCommands()

        logger.info("CommandTest plugin has been enabled")
    }

    fun registerCommands() {
        getCommand("apple")?.setExecutor(AppleCommand())
        logger.info("Commands registered successfully")
    }
}
