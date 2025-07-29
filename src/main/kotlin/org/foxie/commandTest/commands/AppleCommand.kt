package org.foxie.commandTest.commands

import net.kyori.adventure.text.Component
import net.kyori.adventure.text.format.TextColor
import org.bukkit.Material
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import org.bukkit.inventory.ItemStack

class AppleCommand : CommandExecutor {
    override fun onCommand(
        p0: CommandSender,
        p1: Command,
        p2: String,
        p3: Array<out String>
    ): Boolean {
        if (p0 is Player) {
            if (p0.isOp) {
                p0.sendMessage(Component.text("You have been blessed with an apple!").color(TextColor.color(0, 255, 75)))
                p0.inventory.addItem(ItemStack(Material.APPLE, 1))
            }
            else {
                p0.sendMessage(Component.text(p1.permission ?: "You do not have permission to use this command.").color(TextColor.color(255, 0, 0)))
            }
        }

        return false
    }

}