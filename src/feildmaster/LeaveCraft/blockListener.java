package feildmaster.LeaveCraft;

import org.bukkit.Material;
import org.bukkit.event.block.BlockListener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.block.LeavesDecayEvent;

class blockListener extends BlockListener {
    public void onBlockPlace(BlockPlaceEvent event) {
        if(event.getBlock().getType() == Material.LEAVES) {
            event.getBlock().setData((byte)8); // Player Placed Flag
        }
    }
    
    public void onLeavesDecay(LeavesDecayEvent event) {
        if(!event.isCancelled() && (((int)event.getBlock().getData()) == 8)) { // Player Placed Flag
            event.setCancelled(true);
        }
    }
}
