package org.lanzoz.hGEssentials.commands

import org.bukkit.Bukkit
import org.bukkit.GameMode
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import org.lanzoz.hGCore.AdventureTranslate
import org.lanzoz.hGCore.ChangeGamemode
import org.lanzoz.hGEssentials.HGEssentials.Companion.log
import org.lanzoz.hGEssentials.PREFIX

class GameModeChange : CommandExecutor {
    override fun onCommand(
        sender: CommandSender,
        cmd: Command,
        arg: String,
        args: Array<out String>
    ): Boolean {
        if (args[0].equals("c", ignoreCase = true)) {
            if (args[1].isNotEmpty()) {
                Bukkit.getPlayer(args[1])?.let { target ->
                    ChangeGamemode(target, GameMode.CREATIVE)
                    sender.sendMessage { AdventureTranslate("$PREFIX <green>เปลี่ยนเกมโหมดให้ ${target.name} แล้ว") }
                } ?: sender.sendMessage { AdventureTranslate("$PREFIX <red>ไม่พบผู้เล่น") }
            } else {
                (sender as? Player)?.let {
                    ChangeGamemode(it, GameMode.CREATIVE)
                } ?: log.info { "ต้องระบุชื่อผู้เล่น" }
            }
        }
        if (args[0].equals("a", ignoreCase = true)) {
            if (args[1].isNotEmpty()) {
                Bukkit.getPlayer(args[1])?.let { target ->
                    ChangeGamemode(target, GameMode.ADVENTURE)
                    sender.sendMessage { AdventureTranslate("$PREFIX <green>เปลี่ยนเกมโหมดให้ ${target.name} แล้ว") }
                } ?: sender.sendMessage { AdventureTranslate("$PREFIX <red>ไม่พบผู้เล่น") }
            } else {
                (sender as? Player)?.let {
                    ChangeGamemode(it, GameMode.ADVENTURE)
                } ?: log.info { "ต้องระบุชื่อผู้เล่น" }
            }
        }
        if (args[0].equals("s", ignoreCase = true)) {
            if (args[1].isNotEmpty()) {
                Bukkit.getPlayer(args[1])?.let { target ->
                    ChangeGamemode(target, GameMode.SURVIVAL)
                    sender.sendMessage { AdventureTranslate("$PREFIX <green>เปลี่ยนเกมโหมดให้ ${target.name} แล้ว") }
                } ?: sender.sendMessage { AdventureTranslate("$PREFIX <red>ไม่พบผู้เล่น") }
            } else {
                (sender as? Player)?.let {
                    ChangeGamemode(it, GameMode.SURVIVAL)
                } ?: log.info { "ต้องระบุชื่อผู้เล่น" }
            }
        }
        if (args[0].equals("sp", ignoreCase = true)) {
            if (args[1].isNotEmpty()) {
                Bukkit.getPlayer(args[1])?.let { target ->
                    ChangeGamemode(target, GameMode.SPECTATOR)
                    sender.sendMessage { AdventureTranslate("$PREFIX <green>เปลี่ยนเกมโหมดให้ ${target.name} แล้ว") }
                } ?: sender.sendMessage { AdventureTranslate("$PREFIX <red>ไม่พบผู้เล่น") }
            } else {
                (sender as? Player)?.let {
                    ChangeGamemode(it, GameMode.SPECTATOR)
                } ?: log.info { "ต้องระบุชื่อผู้เล่น" }
            }
        }
        return true
    }


}