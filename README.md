# GridGenerator
Multiverse compatible world generator for Minecraft that creates a chunk aligned grid.

![Sample world with light gray and gray wool edges, filled with iron blocks.](https://imgur.com/lC3ICzt.png)

### Building
```
git clone https://github.com/pez252/GridGenerator.git
cd GridGenerator
mvn
```

### Configuration
The config file `plugins/GridGenerator/config.yml` will be created on first run of the plugin if it does not already exist. Below is a sample config file.
```
world:
  height: 64
  edgeMat1: WHITE_WOOL
  edgeMat2: GRAY_WOOL
  fillMat: IRON_BLOCK
  size: 1
```

`height` - The world height. This block and all those below it will be filled in.  
`edgeMat1` - One of two materials used to outline chunks.  
`edgeMat2` - The second material used to outline chunks.  
`fillMat` - The material used for the blocks on the inside of a chunk.  
`size` - Does nothing for now. Planned to allow you to outline not just 1x1 chunk but 2x2+ chunk areas.

See [this](https://hub.spigotmc.org/javadocs/spigot/org/bukkit/Material.html) list of valid materials.
There is no error checking currently.

Quick and dirty 1.13.2 compatible replacement for [FlatlandsBuilder](https://github.com/DomanoSV/FlatlandsBuilder)
