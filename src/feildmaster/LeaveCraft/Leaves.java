package feildmaster.LeaveCraft;

import org.bukkit.event.Event;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Leaves extends JavaPlugin {
    private blockListener BlockListener = new blockListener();
    
    public void onDisable() {}
    
    public void onEnable() {
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvent(Event.Type.BLOCK_PLACE, BlockListener, Event.Priority.Normal, this);
        pm.registerEvent(Event.Type.LEAVES_DECAY, BlockListener, Event.Priority.Normal, this);
        
        System.out.println("LeaveCraft "+getDescription().getVersion()+": Enabled");
    }
}
