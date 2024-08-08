package scientia.et.veritas.projectg.catalysts;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import scientia.et.veritas.projectg.ProjectGMod;
import scientia.et.veritas.projectg.catalysts.ItemCatalyst;

import java.util.HashSet;
import java.util.Set;

public class CreativeModeTabCatalyst {

    public static final String PROJECT_G_TAB_NAME = "Project G";
    public static final String PROJECT_G_TAB_ID = "projectg_tab";

    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ProjectGMod.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> PROJECT_G_TAB = TABS.register(PROJECT_G_TAB_ID, () -> {
        CreativeModeTab.Builder builder = CreativeModeTab.builder();
            builder.displayItems((itemDisplay, output) -> {
                Set<Item> addedItems = new HashSet<>();

                ItemCatalyst.ITEMS.getEntries()
                        .stream()
                        .map((item) -> item.get().asItem())
                        .filter(addedItems::add)
                        .forEach(output::accept);
            });

        builder.icon(() -> new ItemStack(ItemCatalyst.PHILOSOPHERS_STONE_ITEM.get()));
        builder.title(Component.translatable(PROJECT_G_TAB_NAME));
        return builder.build();
    });

}
