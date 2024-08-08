package scientia.et.veritas.projectg.itens.tiers;

public enum TierType {

    NORMAL("normal_", ""),
    RARE("rare_", "§a§l~RARE~§r "),
    EPIC("epic_", "§d§l~EPIC~§r ");

    TierType(String suffix, String nameSuffix) {
        this.suffix = suffix;
        this.nameSuffix = nameSuffix;
    }
    public final String suffix;
    public final String nameSuffix;
}
