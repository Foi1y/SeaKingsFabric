package net.foi1y.seakings;

import java.util.HashMap;
import java.util.Map;

public class AbilityManager {
    private static final Map<String, Ability> abilities = new HashMap<>();

    static {
        abilities.put("Tatsu Maki", new TatsuMaki());
        abilities.put("Ittoryu Iai", new IttoryuIai());
        abilities.put("Sanjuroku_Pound_Ho", new Sanjuroku_Pound_Ho());
        abilities.put("Hiryu_Kaen", new Hiryu_Kaen());
        abilities.put("Yakkodori", new Yakkodori());
        abilities.put("Pound_Ho", new Pound_Ho());
        abilities.put("Daishinkan", new Daishinkan());
        abilities.put("Taka_Nami", new Taka_Nami());
        abilities.put("Sai_Kuru", new Sai_Kuru());
        abilities.put("Nitoryu_Iai", new Nitoryu_Iai());
        abilities.put("Nanajuni_Pound_Ho", new Nanajuni_Pound_Ho());
        abilities.put("Otoro", new Otoro());
        abilities.put("Oni_Giri", new Oni_Giri());
        abilities.put("Tora_Gari", new Tora_Gari());
        abilities.put("Yaki_Oni_Giri", new Yaki_Oni_Giri());
        abilities.put("Toro_Nagashi", new Toro_Nagashi());
        abilities.put("Santoryu_Ogi", new Santoryu_Ogi());
    }

    public static Ability getAbility(String name) {
        return abilities.get(name);
    }

    public static Ability[] getAvailableAbilities() {
        return abilities.values().toArray(new Ability[0]);
    }
}