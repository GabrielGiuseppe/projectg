package scientia.et.veritas.projectg.data.lang;

import net.minecraft.world.item.Item;

public class TranslationUtils {

    public static final String INSTANCE = "generatedInstance";

    /*----------------------------------------------ITENS--------------------------------------------------------*/ 
                
    /*             ------------Key Itens------------            */
    public static final String PHILOSOPHERS_STONE_ITEM_ID = "philosophers_stone_item";
    public static final String PHILOSOPHERS_STONE_ITEM_NAME = "Philosopher's Stone";
    public static final Item.Properties PHILOSOPHERS_STONE_ITEM_PROPERTIES = new Item.Properties().stacksTo(1);

    /*             ------------Loot Itens------------           */
    public static final String LUCKY_BAG_ITEM_ID = "lucky_bag_item";
    public static final String LUCKY_BAG_ITEM_NAME = "Mystery loot bag";
    public static final String RARE_TIER_LUCKY_BAG_ITEM_NAME = "~RARE~ Mystery loot bag";
    public static final String EPIC_TIER_LUCKY_BAG_ITEM_NAME = "~EPIC~ Mystery loot bag";
    public static final Item.Properties NORMAL_TIER_LUCKY_BAG_ITEM_PROPERTIES = new Item.Properties().stacksTo(64);

    /*------------------------------------------CREATIVE MODE----------------------------------------------------*/
    public static final String PROJECT_G_TAB_NAME = "Project G";
    public static final String PROJECT_G_TAB_ID = "projectg_tab";


}
