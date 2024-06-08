package net.foi1y.seakings;

import net.minecraft.server.network.ServerPlayerEntity;

public abstract class Ability {
    private final String name;
    private final int cooldown;

    public Ability(String name, int cooldown) {
        this.name = name;
        this.cooldown = cooldown;
    }

    public String getName() {
        return name;
    }

    public int getCooldown() {
        return cooldown;
    }

    public abstract void apply(ServerPlayerEntity player);
}

// Example of specific ability classes
class TatsuMaki extends Ability {
    public TatsuMaki() {
        super("Tatsu Maki", 100);
    }

    @Override
    public void apply(ServerPlayerEntity player) {
        // Implement the ability effect here
    }
}

class IttoryuIai extends Ability {
    public IttoryuIai() {
        super("Ittoryu Iai", 100);
    }

    @Override
    public void apply(ServerPlayerEntity player) {
        // Implement the ability effect here
    }
}
class Sanjuroku_Pound_Ho extends Ability {
    public Sanjuroku_Pound_Ho() {
        super("Sanjuroku_Pound_Ho", 100);
    }

    @Override
    public void apply(ServerPlayerEntity player) {
        // Implement the ability effect here
    }
}
class Hiryu_Kaen extends Ability {
    public Hiryu_Kaen() {
        super("Hiryu_Kaen", 100);
    }

    @Override
    public void apply(ServerPlayerEntity player) {
        // Implement the ability effect here
    }
}
class Yakkodori extends Ability {
    public Yakkodori() {
        super("Yakkodori", 100);
    }

    @Override
    public void apply(ServerPlayerEntity player) {
        // Implement the ability effect here
    }
}
class Pound_Ho extends Ability {
    public Pound_Ho() {
        super("Pound_Ho", 100);
    }

    @Override
    public void apply(ServerPlayerEntity player) {
        // Implement the ability effect here
    }
}
class Daishinkan extends Ability {
    public Daishinkan() {
        super("Daishinkan", 100);
    }

    @Override
    public void apply(ServerPlayerEntity player) {
        // Implement the ability effect here
    }
}
class Taka_Nami extends Ability {
    public Taka_Nami() {
        super("Taka_Nami", 100);
    }

    @Override
    public void apply(ServerPlayerEntity player) {
        // Implement the ability effect here
    }
}
class Sai_Kuru extends Ability {
    public Sai_Kuru() {
        super("Sai_Kuru", 100);
    }

    @Override
    public void apply(ServerPlayerEntity player) {
        // Implement the ability effect here
    }
}
class Nitoryu_Iai extends Ability {
    public Nitoryu_Iai() {
        super("Nitoryu_Iai", 100);
    }

    @Override
    public void apply(ServerPlayerEntity player) {
        // Implement the ability effect here
    }
}
class Nanajuni_Pound_Ho extends Ability {
    public Nanajuni_Pound_Ho() {
        super("Nanajuni_Pound_Ho", 100);
    }

    @Override
    public void apply(ServerPlayerEntity player) {
        // Implement the ability effect here
    }
}
class Otoro extends Ability {
    public Otoro() {
        super("Otoro", 100);
    }

    @Override
    public void apply(ServerPlayerEntity player) {
        // Implement the ability effect here
    }
}
class Oni_Giri extends Ability {
    public Oni_Giri() {
        super("Oni_Giri", 100);
    }

    @Override
    public void apply(ServerPlayerEntity player) {
        // Implement the ability effect here
    }
}
class Tora_Gari extends Ability {
    public Tora_Gari() {
        super("Tora_Gari", 100);
    }

    @Override
    public void apply(ServerPlayerEntity player) {
        // Implement the ability effect here
    }
}
class Yaki_Oni_Giri extends Ability {
    public Yaki_Oni_Giri() {
        super("Yaki_Oni_Giri", 100);
    }

    @Override
    public void apply(ServerPlayerEntity player) {
        // Implement the ability effect here
    }
}
class Toro_Nagashi extends Ability {
    public Toro_Nagashi() {
        super("Toro_Nagashi", 100);
    }

    @Override
    public void apply(ServerPlayerEntity player) {
        // Implement the ability effect here
    }
}
class Santoryu_Ogi extends Ability {
    public Santoryu_Ogi() {
        super("Santoryu_Ogi", 100);
    }

    @Override
    public void apply(ServerPlayerEntity player) {
        // Implement the ability effect here
    }
}



