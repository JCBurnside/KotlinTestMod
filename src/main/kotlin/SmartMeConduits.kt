import net.minecraftforge.fml.common.Mod
const val VERSION = "@VERSION@"
const val MOD_NAME = "@MOD_NAME@"
const val MOD_ID = "@MOD_ID@"

@Mod(
    version = VERSION,
    name = MOD_NAME,
    modid = MOD_ID,
    modLanguageAdapter="net.shadowfacts.forgelin.KotlinAdapter"
)
object TestMod {
}