package explodingChicken;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class Explosion implements Listener{
	
	@EventHandler(priority=EventPriority.HIGH)
	public void onEntityDamageByEntityEvent(EntityDamageByEntityEvent event){
	  if(event.getDamager() instanceof Player){
		  Player player = (Player) event.getDamager();
			if(player.getItemInHand().getType() == Material.FLINT_AND_STEEL){
				if(event.getEntity().getType() == EntityType.CHICKEN){
					Double number = Math.random();
					if(number < .05){
						
						 player.getWorld().createExplosion(event.getEntity().getLocation(), 3, false);
						 player.sendMessage(ChatColor.RED + "Due to the dangerous nature of quantum physics, this chicken met an untimely end.");
						
					}
					
				}
		}
	}
  }

}
