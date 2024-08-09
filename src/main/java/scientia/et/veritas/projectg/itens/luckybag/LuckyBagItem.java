package scientia.et.veritas.projectg.itens.luckybag;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.EnchantedBookItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.EnchantmentInstance;
import net.minecraft.world.level.Level;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import scientia.et.veritas.projectg.ProjectGMod;
import scientia.et.veritas.projectg.catalysts.ItemCatalyst;
import scientia.et.veritas.projectg.itens.keyitens.PhilosophersStoneItem;
import scientia.et.veritas.projectg.itens.tiers.TierType;

import java.util.List;
import java.util.Random;

import static net.minecraft.world.item.enchantment.Enchantments.MENDING;

public class LuckyBagItem extends Item {

    public final TierType tier;

    public LuckyBagItem(Properties properties, TierType tierType) {
        super(properties);
        this.tier = tierType;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if (!level.isClientSide && player instanceof ServerPlayer) {
            Random random = new Random();
            ItemStack randomItem = getRandomItem(random, this.tier);
            player.addItem(randomItem);
            player.getItemInHand(hand).shrink(1);
        }
        return new InteractionResultHolder<>(InteractionResult.SUCCESS, player.getItemInHand(hand));
    }

    private ItemStack getRandomItem(Random random, TierType tier) {
        //TODO implementar lista de drops
        Item[] items = new Item[]{ItemCatalyst.PHILOSOPHERS_STONE_ITEM.get()};
        Item[] rareItems = new Item[]{Items.DIAMOND, Items.GOLD_INGOT, Items.IRON_INGOT, Items.EMERALD};
        Item[] epicItems = new Item[]{Items.EMERALD_BLOCK, Items.BEACON, Items.NETHERITE_INGOT, Items.ENDER_DRAGON_SPAWN_EGG};
        return switch (tier) {
            case RARE -> new ItemStack(rareItems[random.nextInt(rareItems.length)]);
            case EPIC -> new ItemStack(epicItems[random.nextInt(epicItems.length)]);
            default -> new ItemStack(items[random.nextInt(items.length)]);
        };
    }

//    private Item getenchantedBook() {
//        var encantamento = MENDING
//       var book = new ItemStack(Items.ENCHANTED_BOOK);
//        EnchantmentHelper.
//    }
}

