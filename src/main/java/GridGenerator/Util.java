package GridGenerator;

import org.bukkit.configuration.file.FileConfiguration;

public class Util {
    private static FileConfiguration config;
    public static FileConfiguration getConfig() {
        return config;
    }

    public static void setConfig(FileConfiguration config) {
        Util.config = config;
    }
}
