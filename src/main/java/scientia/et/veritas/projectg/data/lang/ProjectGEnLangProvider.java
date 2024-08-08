package scientia.et.veritas.projectg.data.lang;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;
import scientia.et.veritas.projectg.ProjectGMod;
import scientia.et.veritas.projectg.catalysts.CreativeModeTabCatalyst;
import scientia.et.veritas.projectg.catalysts.ItemCatalyst;

import static scientia.et.veritas.projectg.data.lang.TranslationUtils.*;
import static scientia.et.veritas.projectg.itens.tiers.TierType.EPIC;
import static scientia.et.veritas.projectg.itens.tiers.TierType.RARE;

public class ProjectGEnLangProvider extends LanguageProvider {

    public ProjectGEnLangProvider(PackOutput output) {
        super(output, ProjectGMod.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add(CreativeModeTabCatalyst.PROJECT_G_TAB_ID, CreativeModeTabCatalyst.PROJECT_G_TAB_NAME);

        addItem(ItemCatalyst.PHILOSOPHERS_STONE_ITEM, PHILOSOPHERS_STONE_ITEM_NAME);

        addItem(ItemCatalyst.NORMAL_TIER_LUCKY_BAG_ITEM, LUCKY_BAG_ITEM_NAME);
        addItem(ItemCatalyst.RARE_TIER_LUCKY_BAG_ITEM, RARE.nameSuffix + LUCKY_BAG_ITEM_NAME);
        addItem(ItemCatalyst.EPIC_TIER_LUCKY_BAG_ITEM, EPIC.nameSuffix + LUCKY_BAG_ITEM_NAME);
    }
}
