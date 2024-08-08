package scientia.et.veritas.projectg.data;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import scientia.et.veritas.projectg.ProjectGMod;
import scientia.et.veritas.projectg.data.lang.ProjectGEnLangProvider;
import scientia.et.veritas.projectg.data.lang.ProjectGPtBRLangProvider;
import scientia.et.veritas.projectg.data.texture.ProjectGItemStateProvider;
import scientia.et.veritas.projectg.loot.ProjectGLootModifierProvider;

import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, modid = ProjectGMod.MOD_ID)
public class DataTransmutators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        try {
            DataGenerator transmutator = event.getGenerator();
            PackOutput output = transmutator.getPackOutput();
            ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
            CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

            transmutator.addProvider(true, new ProjectGEnLangProvider(output));
            transmutator.addProvider(true, new ProjectGPtBRLangProvider(output));
            transmutator.addProvider(true, new ProjectGItemStateProvider(output, existingFileHelper));
            transmutator.addProvider(true, new ProjectGLootModifierProvider(output, lookupProvider ));

        }catch (RuntimeException e){
            ProjectGMod.LOGGER.error("Faled to gather data", e);
        }
    }
}
