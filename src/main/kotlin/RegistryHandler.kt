import net.minecraft.block.Block
import net.minecraft.item.Item
import net.minecraftforge.event.RegistryEvent
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent


@Mod.EventBusSubscriber(modid = TestMod.MOD_ID)
object RegistryHandler {

    @JvmStatic
    @SubscribeEvent
    fun onItemRegister(event:RegistryEvent.Register<Item>)
    {
        event.registry.registerAll(objEx,itemBlockEx)
    }

    @JvmStatic
    @SubscribeEvent
    fun onBlockRegister(event: RegistryEvent.Register<Block>)
    {
        event.registry.register(blockEx)
    }
}