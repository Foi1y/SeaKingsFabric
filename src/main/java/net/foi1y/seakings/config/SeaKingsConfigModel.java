package net.foi1y.seakings.config;

import io.wispforest.owo.config.annotation.Config;
import io.wispforest.owo.config.annotation.Modmenu;

@Modmenu(modId = "seakings")
@Config(name = "seakings", wrapperName = "SeaKings")
public class SeaKingsConfigModel {
    public int anIntOption = 16;
    public boolean aBooleanToggle = false;

    public static boolean localizedNames = false;
    public static boolean modeledFruits = false;

}