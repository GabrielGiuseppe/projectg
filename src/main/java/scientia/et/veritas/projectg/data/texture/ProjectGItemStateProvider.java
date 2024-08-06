package scientia.et.veritas.projectg.data.texture;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import scientia.et.veritas.projectg.ProjectGMod;
import scientia.et.veritas.projectg.itens.ItemCatalyst;

public class ProjectGItemStateProvider extends ItemModelProvider {

    private static final String SEPARATOR = ":";

    public ProjectGItemStateProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ProjectGMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        item(ItemCatalyst.PHILOSOPHERS_STONE_ITEM.get());
    }

    private void item(Item item){
        String name = getItemName(item);
        getBuilder(name)
                .parent(getExistingFile(mcLoc("item/generated")))
                .texture("layer0", "item/" + name);
    }

    private String getItemName(Item item){
        return BuiltInRegistries.ITEM.getKey(item).toString().replace(ProjectGMod.MOD_ID + SEPARATOR, "");
    }
}
