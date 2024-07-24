package net.foi1y.seakings;

import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;

public abstract class Ability {
    private final String name;
    private final int cooldown;
    private final Identifier icon;

    public Ability(String name, int cooldown, Identifier icon) {
        this.name = name;
        this.cooldown = cooldown;
        this.icon = icon;
    }

    public String getName() {
        return name;
    }
    public Identifier getIcon(){return icon;}
    public int getCooldown() {
        return cooldown;
    }

    public abstract void apply(ServerPlayerEntity player);
}

// Example of specific ability classes
class TatsuMaki extends Ability {
    public TatsuMaki() {
        super("Tatsu Maki", 100,new Identifier("seakings","this must be changed"));
    }

    @Override
    public void apply(ServerPlayerEntity player) {
        // Implement the ability effect here
    }
}

class IttoryuIai extends Ability {
    public IttoryuIai() {
        super("Ittoryu Iai", 100,new Identifier("seakings","change this"));
    }

    @Override
    public void apply(ServerPlayerEntity player) {
        // Implement the ability effect here
    }
}
class Sanjuroku_Pound_Ho extends Ability {
    public Sanjuroku_Pound_Ho() {
        super("Sanjuroku_Pound_Ho", 100,new Identifier("seakings","textures/gui/icons/Sanjuroku_Pound_HO.png"));
    }

    @Override
    public void apply(ServerPlayerEntity player) {
        // Implement the ability effect here
    }
}
class Hiryu_Kaen extends Ability {
    public Hiryu_Kaen() {
        super("Hiryu_Kaen", 100,new Identifier("seakings","textures/gui/icons/Hiryu_Kaeen.png"));
    }

    @Override
    public void apply(ServerPlayerEntity player) {
        // Implement the ability effect here
    }
}
class Yakkodori extends Ability {
    public Yakkodori() {
        super("Yakkodori", 100,new Identifier("seakings","textures/gui/icons/yakkodori.png"));
    }

    @Override
    public void apply(ServerPlayerEntity player) {
        // Implement the ability effect here
    }
}
class Pound_Ho extends Ability {
    public Pound_Ho() {
        super("Pound_Ho", 100,new Identifier("seakings","change this"));
    }

    @Override
    public void apply(ServerPlayerEntity player) {
        // Implement the ability effect here
    }
}
class Daishinkan extends Ability {
    public Daishinkan() {
        super("Daishinkan", 100,new Identifier("seakings","textures/gui/icons/daishinkan.png"));
    }

    @Override
    public void apply(ServerPlayerEntity player) {
        // Implement the ability effect here
    }
}
class Taka_Nami extends Ability {
    public Taka_Nami() {
        super("Taka_Nami", 100,new Identifier("seakings","textures/gui/icons/Taka_Nami.png"));
    }

    @Override
    public void apply(ServerPlayerEntity player) {
        // Implement the ability effect here
    }
}
class Sai_Kuru extends Ability {
    public Sai_Kuru() {
        super("Sai_Kuru", 100,new Identifier("seakings","textures/gui/icons/Sai_Kuru.png"));
    }

    @Override
    public void apply(ServerPlayerEntity player) {
        // Implement the ability effect here
    }
}
class Nitoryu_Iai extends Ability {
    public Nitoryu_Iai() {
        super("Nitoryu_Iai", 100,new Identifier("seakings","change this"));
    }

    @Override
    public void apply(ServerPlayerEntity player) {
        // Implement the ability effect here
    }
}
class Nanajuni_Pound_Ho extends Ability {
    public Nanajuni_Pound_Ho() {
        super("Nanajuni_Pound_Ho", 100,new Identifier("seakings","textures/gui/icons/Nanjuni_Pound_Ho.png"));
    }

    @Override
    public void apply(ServerPlayerEntity player) {
        // Implement the ability effect here
    }
}
class Otoro extends Ability {
    public Otoro() {
        super("Otoro", 100,new Identifier("seakings","change this"));
    }

    @Override
    public void apply(ServerPlayerEntity player) {
        // Implement the ability effect here
    }
}
class Oni_Giri extends Ability {
    public Oni_Giri() {
        super("Oni_Giri", 100,new Identifier("seakings","textures/gui/icons/OniGiri.png"));
    }

    @Override
    public void apply(ServerPlayerEntity player) {
        // Implement the ability effect here
    }
}
class Tora_Gari extends Ability {
    public Tora_Gari() {
        super("Tora_Gari", 100,new Identifier("seakings"));
    }

    @Override
    public void apply(ServerPlayerEntity player) {
        // Implement the ability effect here
    }
}
class Yaki_Oni_Giri extends Ability {
    public Yaki_Oni_Giri() {
        super("Yaki_Oni_Giri", 100,new Identifier("seakings","textures/gui/icons/Yaki_oni_giri.png"));
    }

    @Override
    public void apply(ServerPlayerEntity player) {
        // Implement the ability effect here
    }
}
class Toro_Nagashi extends Ability {
    public Toro_Nagashi() {
        super("Toro_Nagashi", 100,new Identifier("seakings","change this"));
    }

    @Override
    public void apply(ServerPlayerEntity player) {
        // Implement the ability effect here
    }
}
class Santoryu_Ogi extends Ability {
    public Santoryu_Ogi() {
        super("Santoryu_Ogi", 100,new Identifier("seakings","change this"));
    }

    @Override
    public void apply(ServerPlayerEntity player) {
        // Implement the ability effect here
    }
}



