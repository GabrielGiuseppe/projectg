package scientia.et.veritas.projectg.loot;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.neoforged.neoforge.common.conditions.ModLoadedCondition;
import net.neoforged.neoforge.common.data.GlobalLootModifierProvider;
import scientia.et.veritas.projectg.ProjectGMod;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ProjectGLootModifierProvider extends GlobalLootModifierProvider {

    public ProjectGLootModifierProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, ProjectGMod.MOD_ID);
    }

    @Override
    protected void start() {
        add("my_loot_modifier", new ProjectGLootModifier(new LootItemCondition[]{}), List.of(new ModLoadedCondition("create")));
    }
}
