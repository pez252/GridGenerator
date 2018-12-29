package GridGenerator;

import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.configuration.file.FileConfiguration;
import java.util.logging.Logger;

public final class GridGenerator extends JavaPlugin {
    private Logger log = Logger.getLogger("Minecraft");

    @Override
    public void onEnable() {
	this.saveDefaultConfig();
	Util.setConfig(this.getConfig());
   }
    
    @Override
    public void onDisable() {
    }

    @Override
    public ChunkGenerator getDefaultWorldGenerator(String worldName, String id) {
        return new CustomChunkGenerator();
    }
}
