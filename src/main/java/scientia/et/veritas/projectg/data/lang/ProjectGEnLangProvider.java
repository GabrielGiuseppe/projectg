package scientia.et.veritas.projectg.data.lang;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;
import scientia.et.veritas.projectg.ProjectGMod;
import scientia.et.veritas.projectg.creativemode.tab.CreativeModeTabCatalyst;
import scientia.et.veritas.projectg.itens.ItemCatalyst;

public class ProjectGEnLangProvider extends LanguageProvider {

    public ProjectGEnLangProvider(PackOutput output) {
        super(output, ProjectGMod.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        addItem(ItemCatalyst.PHILOSOPHERS_STONE_ITEM, ItemCatalyst.PHILOSOPHERS_STONE_ITEM_NAME);
        add(CreativeModeTabCatalyst.PROJECT_G_TAB_ID, CreativeModeTabCatalyst.PROJECT_G_TAB_NAME);
    }
}
