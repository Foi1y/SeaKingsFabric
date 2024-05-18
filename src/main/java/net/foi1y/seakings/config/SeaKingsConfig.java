package net.foi1y.seakings.config;

import eu.midnightdust.lib.config.MidnightConfig;

public class SeaKingsConfig extends MidnightConfig {

    @Comment(category = "settings", centered = true) public static Comment comment_1;

    @Entry(category = "settings") public static boolean showTooltips = true;
}