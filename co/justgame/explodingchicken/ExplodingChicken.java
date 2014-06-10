package co.justgame.explodingchicken;

import org.bukkit.plugin.java.JavaPlugin;

public class ExplodingChicken extends JavaPlugin{
	
	 	@Override
	    public void onEnable(){
	 		getLogger().info("ExplodingChicken has been enabled");
	 		
	 		
	 		getServer().getPluginManager().registerEvents(new Explosion(), this);
	 	}
	 	@Override
		public void onDisable() {
		    getLogger().info("ExplodingChicken has been disabled");
		}
	 
	

}
