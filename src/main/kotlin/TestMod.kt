package org.testmod

import net.minecraft.block.Block
import net.minecraft.block.material.Material
import net.minecraft.block.state.IBlockState
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.item.Item
import net.minecraft.item.ItemBlock
import net.minecraft.item.ItemStack
import net.minecraft.util.ResourceLocation
import net.minecraftforge.fml.common.FMLLog
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent
import org.apache.logging.log4j.Logger
import java.util.*

var  logger:Logger? = null

    const val VERSION = "@VERSION@"
    const val MOD_NAME = "TestMod"
    const val MOD_ID = "test_mod"


@Mod(
    version = VERSION,
    name = MOD_NAME,
    modid = MOD_ID,
    modLanguageAdapter="net.shadowfacts.forgelin.KotlinAdapter"/*,
    dependencies = "@dependencies@"*/
)
object TestMod {


    @Mod.EventHandler
    fun preInit(event: FMLPreInitializationEvent)
    {
        logger = event.modLog
        logger?.info("test_mod initialized")
    }
}
val objEx = object:Item(){
    init {
        unlocalizedName = "test"
        registryName = ResourceLocation(MOD_ID,"test")
        creativeTab = tabEx
    }
}

val blockEx = object:Block(Material.ROCK)
{
    init
    {
        unlocalizedName = "test_block"
        registryName = ResourceLocation(MOD_ID,"test_block")
        setCreativeTab(tabEx)
    }

    override fun getItemDropped(p_getItemDropped_1_: IBlockState?, p_getItemDropped_2_: Random?, p_getItemDropped_3_: Int): Item {
        return objEx
    }
}

val itemBlockEx = object:ItemBlock(blockEx){init {
    registryName=blockEx.registryName
}}
