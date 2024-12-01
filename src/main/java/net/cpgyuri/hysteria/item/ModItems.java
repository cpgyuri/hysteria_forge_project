package net.cpgyuri.hysteria.item;

import net.cpgyuri.hysteria.Hysteria;
import net.cpgyuri.hysteria.sound.ModSounds;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Hysteria.MOD_ID);

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

    public static final RegistryObject<Item> QQZ_BFH_MUSIC_DISC = ITEMS.register("qqz_bfh_music_disc",
            () -> new RecordItem(1, ModSounds.QQZ_BFH_MUSIC_DISC, new Item.Properties().rarity(Rarity.RARE).stacksTo(1), 4800));

}
