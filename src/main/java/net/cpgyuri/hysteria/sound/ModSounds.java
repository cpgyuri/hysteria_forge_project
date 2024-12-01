package net.cpgyuri.hysteria.sound;

import net.cpgyuri.hysteria.Hysteria;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Hysteria.MOD_ID);

    private static RegistryObject<SoundEvent> registerSoundEvents(String name){
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(Hysteria.MOD_ID, name)));
    }

    public static final RegistryObject<SoundEvent> QQZ_BFH_MUSIC_DISC = registerSoundEvents("qqz_bfh_music_disc");

    public static void register(IEventBus eventBus){
        SOUND_EVENTS.register(eventBus);
    }
}
