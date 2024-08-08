package scientia.et.veritas.projectg.data.lang;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;
import scientia.et.veritas.projectg.ProjectGMod;
import scientia.et.veritas.projectg.catalysts.CreativeModeTabCatalyst;
import scientia.et.veritas.projectg.catalysts.ItemCatalyst;

import static scientia.et.veritas.projectg.data.lang.TranslationUtils.*;
import static scientia.et.veritas.projectg.itens.tiers.TierType.EPIC;
import static scientia.et.veritas.projectg.itens.tiers.TierType.RARE;

public class ProjectGPtBRLangProvider extends LanguageProvider {

    public ProjectGPtBRLangProvider(PackOutput output) {
        super(output, ProjectGMod.MOD_ID, "pt_br");
    }

    @Override
    protected void addTranslations() {
        addItem(ItemCatalyst.PHILOSOPHERS_STONE_ITEM, PHILOSOPHERS_STONE_ITEM_NAME);
        addItem(ItemCatalyst.NORMAL_TIER_LUCKY_BAG_ITEM, LUCKY_BAG_ITEM_NAME);
        addItem(ItemCatalyst.RARE_TIER_LUCKY_BAG_ITEM, RARE.nameSuffix + LUCKY_BAG_ITEM_NAME);
        addItem(ItemCatalyst.EPIC_TIER_LUCKY_BAG_ITEM, EPIC.nameSuffix + LUCKY_BAG_ITEM_NAME);

        add(CreativeModeTabCatalyst.PROJECT_G_TAB_ID, CreativeModeTabCatalyst.PROJECT_G_TAB_NAME);

    }
}
