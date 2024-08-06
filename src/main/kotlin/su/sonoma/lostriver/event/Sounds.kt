package su.sonoma.lostriver.event

import net.minecraft.resources.ResourceLocation
import net.minecraft.sounds.SoundEvent
import net.minecraftforge.registries.DeferredRegister
import net.minecraftforge.registries.ForgeRegistries
import net.minecraftforge.registries.RegistryObject
import su.sonoma.lostriver.Lostriver.MODID

object Sounds {
    val SOUNDS: DeferredRegister<SoundEvent> = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MODID)

    private fun registerSoundEvent(name: String): RegistryObject<SoundEvent> {
        val id: ResourceLocation = ResourceLocation(MODID, name)
        return SOUNDS.register(name) { SoundEvent.createVariableRangeEvent(id) }
    }

    val PEEPER: RegistryObject<SoundEvent> = registerSoundEvent("peeper")
}