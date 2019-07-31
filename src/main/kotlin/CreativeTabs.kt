import net.minecraft.creativetab.CreativeTabs
import net.minecraft.item.ItemStack

object TestCreativeTab : CreativeTabs(MOD_ID)
{
    override fun getTabIconItem(): ItemStack {
        return ItemStack(objEx)
    }
}

val tabEx:TestCreativeTab = TestCreativeTab