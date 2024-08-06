package scientia.et.veritas.projectg.itens;

import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import scientia.et.veritas.projectg.ProjectGMod;


public class ItemCatalyst {

    public static final String PHILOSOPHERS_STONE_ITEM_ID = "philosophers_stone_item";
    public static final String PHILOSOPHERS_STONE_ITEM_NAME = "Philosopher's Stone";

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ProjectGMod.MOD_ID);

    public static final DeferredItem<Item> PHILOSOPHERS_STONE_ITEM = ITEMS.register(PHILOSOPHERS_STONE_ITEM_ID,
            () -> new Item(new Item.Properties().stacksTo(1)));
}
