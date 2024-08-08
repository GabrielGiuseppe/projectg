package scientia.et.veritas.projectg;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import scientia.et.veritas.projectg.catalysts.CreativeModeTabCatalyst;
import scientia.et.veritas.projectg.data.DataTransmutators;
import scientia.et.veritas.projectg.catalysts.ItemCatalyst;

import static scientia.et.veritas.projectg.loot.ProjectGLootModifier.LOOT_MODIFIER_SERIALIZERS;

@Mod(ProjectGMod.MOD_ID)
public class ProjectGMod {

    public static final String MOD_ID = "projectg";
    public static final Logger LOGGER = LoggerFactory.getLogger(ProjectGMod.class);


    public ProjectGMod(IEventBus bus) {
        ItemCatalyst.ITEMS.register(bus);
        CreativeModeTabCatalyst.TABS.register(bus);
        LOOT_MODIFIER_SERIALIZERS.register(bus);

        bus.addListener(DataTransmutators::gatherData);
        bus.addListener(this::setup);
        bus.addListener(this::onClientSetup);

    }

    @SubscribeEvent
    private void setup(final FMLCommonSetupEvent event) {
    }

    private void onClientSetup(final FMLClientSetupEvent event) {
    }
}
