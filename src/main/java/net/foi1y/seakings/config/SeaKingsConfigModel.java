package net.foi1y.seakings.config;

import io.wispforest.owo.config.annotation.Config;
import io.wispforest.owo.config.annotation.Modmenu;
import net.foi1y.seakings.item.ModItems;

@Modmenu(modId = "seakings")
@Config(name = "seakings", wrapperName = "SeaKings")
public class SeaKingsConfigModel {
    public int anIntOption = 16;
    public boolean aBooleanToggle = false;

    public boolean localizedNames = false;
    public boolean modeledFruits = false;

}