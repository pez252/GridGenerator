package GridGenerator;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.Material;
import org.bukkit.Location;
import org.bukkit.block.data.BlockData;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.configuration.file.FileConfiguration;
import java.util.Random;
import java.util.logging.Logger;

public class CustomChunkGenerator extends ChunkGenerator {
    private Logger log = Logger.getLogger("Minecraft");

    @Override
    public ChunkData generateChunkData(World world, Random random, int chunkX, int chunkZ, BiomeGrid biome) {
        FileConfiguration config = Util.getConfig();
        ChunkData chunk = createChunkData(world);
	Material edge;
	int height;
//	log.info("[GridGenerator] " + world.getName() +" : " +config.getInt(world.getName()+".height"));
//	log.info("[GridGenerator] world : "+ config.getInt("world.height"));
        height = ((height = config.getInt(world.getName()+".height")) != 0 ) ? height : config.getInt("world.height");
	if ( (chunkX+chunkZ)%2 == 0 ) {
            edge = ((edge = Material.getMaterial(config.getString(world.getName()+".edgeMat1"))) != null) ? edge : Material.getMaterial(config.getString("world.edgeMat1"));
        } else {
            edge = ((edge = Material.getMaterial(config.getString(world.getName()+".edgeMat2"))) != null) ? edge : Material.getMaterial(config.getString("world.edgeMat2"));
        }
        for (int X = 0; X < 16; X++)
            for (int Z = 0; Z < 16; Z++) {
                for (int i = height; i > 0; i--) {
                    if ( X == 0 || X == 15 || Z == 0 || Z == 15 ) {
                        chunk.setBlock(X, i, Z, edge);
                    } else {
                        chunk.setBlock(X, i, Z, Material.getMaterial(config.getString("world.fillMat")));
                    }
                }
            }
        return chunk;
    }
}
