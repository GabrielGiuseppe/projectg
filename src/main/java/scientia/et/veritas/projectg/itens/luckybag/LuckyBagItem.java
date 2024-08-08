package scientia.et.veritas.projectg.itens.luckybag;

import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import scientia.et.veritas.projectg.itens.tiers.TierType;

import java.util.Random;

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
        Item[] items = new Item[]{Items.DIAMOND, Items.GOLD_INGOT, Items.IRON_INGOT, Items.EMERALD};
        Item[] rareItems = new Item[]{Items.DIAMOND, Items.GOLD_INGOT, Items.IRON_INGOT, Items.EMERALD};
        Item[] epicItems = new Item[]{Items.DIAMOND, Items.GOLD_INGOT, Items.IRON_INGOT, Items.EMERALD};
        return switch (tier) {
            case RARE -> new ItemStack(rareItems[random.nextInt(items.length)]);
            case EPIC -> new ItemStack(epicItems[random.nextInt(items.length)]);
            default -> new ItemStack(items[random.nextInt(items.length)]);
        };
    }
}

