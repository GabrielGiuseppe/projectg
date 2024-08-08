package scientia.et.veritas.projectg.loot;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.neoforged.neoforge.common.loot.IGlobalLootModifier;
import net.neoforged.neoforge.common.loot.LootModifier;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import scientia.et.veritas.projectg.ProjectGMod;
import scientia.et.veritas.projectg.catalysts.ItemCatalyst;

import java.util.function.Supplier;

public class ProjectGLootModifier extends LootModifier {

    public static final MapCodec<ProjectGLootModifier> CODEC = RecordCodecBuilder.mapCodec(inst ->
            LootModifier.codecStart(inst).apply(inst, ProjectGLootModifier::new)
    );

    public ProjectGLootModifier(LootItemCondition[] conditions) {
        super(conditions);
    }

    @Override
    protected ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot, LootContext context) {
        generatedLoot.add(new ItemStack(ItemCatalyst.NORMAL_TIER_LUCKY_BAG_ITEM.get()));
        return generatedLoot;
    }

    public static final DeferredRegister<MapCodec<? extends IGlobalLootModifier>> LOOT_MODIFIER_SERIALIZERS =
            DeferredRegister.create(NeoForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, ProjectGMod.MOD_ID);
    public static final Supplier<MapCodec<ProjectGLootModifier>> LOOT_MODIFIER =
            LOOT_MODIFIER_SERIALIZERS.register("loot_modifier", () -> ProjectGLootModifier.CODEC);

    @Override
    public MapCodec<? extends IGlobalLootModifier> codec() {
        return CODEC;
    }


}
