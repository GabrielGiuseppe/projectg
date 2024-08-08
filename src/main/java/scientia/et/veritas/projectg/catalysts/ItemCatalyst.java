package scientia.et.veritas.projectg.catalysts;

import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import scientia.et.veritas.projectg.ProjectGMod;
import scientia.et.veritas.projectg.itens.luckybag.LuckyBagItem;

import static scientia.et.veritas.projectg.data.lang.TranslationUtils.*;
import static scientia.et.veritas.projectg.itens.tiers.TierType.*;


public class ItemCatalyst {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ProjectGMod.MOD_ID);

    public static final DeferredItem<Item> PHILOSOPHERS_STONE_ITEM = ITEMS.register(PHILOSOPHERS_STONE_ITEM_ID,
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final DeferredItem<Item> NORMAL_TIER_LUCKY_BAG_ITEM = ITEMS.register(NORMAL.suffix + LUCKY_BAG_ITEM_ID,
            () -> new LuckyBagItem(NORMAL_TIER_LUCKY_BAG_ITEM_PROPERTIES, NORMAL));
    public static final DeferredItem<Item> RARE_TIER_LUCKY_BAG_ITEM = ITEMS.register(RARE.suffix + LUCKY_BAG_ITEM_ID,
            () -> new LuckyBagItem(NORMAL_TIER_LUCKY_BAG_ITEM_PROPERTIES, RARE));
    public static final DeferredItem<Item> EPIC_TIER_LUCKY_BAG_ITEM = ITEMS.register(EPIC.suffix + LUCKY_BAG_ITEM_ID,
            () -> new LuckyBagItem(NORMAL_TIER_LUCKY_BAG_ITEM_PROPERTIES, EPIC));
}
