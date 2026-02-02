package org.lanzoz.hGEssentials

import org.bukkit.plugin.java.JavaPlugin
import java.util.logging.Logger
import org.lanzoz.hGCore.HGCore;
import org.lanzoz.hGEssentials.commands.GameModeChange
import org.lanzoz.hGEssentials.commands.TabCompleteGM

val PREFIX = "<yellow>[HGEs]</yellow>"

class HGEssentials : JavaPlugin() {
    companion object {
        lateinit var main: HGEssentials
            private set
        lateinit var core: HGCore
            private set
        lateinit var log: Logger
            private set
    }
    override fun onEnable() {
        main = this;
        log = this.logger;
        core = HGCore.main;
        getCommand("gm")?.apply {
            setExecutor(GameModeChange())
            tabCompleter = TabCompleteGM()
        }
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
