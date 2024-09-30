package net.foi1y.seakings.config;

import io.wispforest.owo.config.annotation.Config;
import io.wispforest.owo.config.annotation.Modmenu;

//@Modmenu(modId = "seakings")
@Config(name = "seakings-config", wrapperName = "seakingsconfig")
public class SeaKingsConfig {
    public int anIntOption = 16;
    public boolean aBooleanToggle = false;

}