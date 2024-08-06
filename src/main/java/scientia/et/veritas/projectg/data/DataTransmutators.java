package scientia.et.veritas.projectg.data;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import scientia.et.veritas.projectg.ProjectGMod;
import scientia.et.veritas.projectg.data.lang.ProjectGEnLangProvider;
import scientia.et.veritas.projectg.data.texture.ProjectGItemStateProvider;

public class DataTransmutators {

    public static void gatherData(GatherDataEvent event){
        try {
            DataGenerator transmutator = event.getGenerator();
            PackOutput output = transmutator.getPackOutput();
            ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

            transmutator.addProvider(true, new ProjectGEnLangProvider(output));
            transmutator.addProvider(true, new ProjectGItemStateProvider(output, existingFileHelper));

        }catch (RuntimeException e){
            ProjectGMod.LOGGER.error("Faled to gather data", e);
        }
    }
}
