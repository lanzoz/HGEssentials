package org.lanzoz.hGEssentials.commands

import org.bukkit.Bukkit
import org.bukkit.command.Command
import org.bukkit.command.CommandSender
import org.bukkit.command.TabCompleter
import kotlin.text.startsWith

class TabCompleteGM: TabCompleter {
    override fun onTabComplete(
        sender: CommandSender,
        cmd: Command,
        arg: String,
        args: Array<out String>
    ): List<String?>? {
        return when (args.size) {
            1 -> {
                listOf("c","a","s","sp").filter {it.startsWith(args[0], ignoreCase = true)}
            }
            2 -> {
                Bukkit.getOnlinePlayers().map { it.name }
                    .filter { it.startsWith(args[1], ignoreCase = true) }
            }
            else -> null
        }
    }

}