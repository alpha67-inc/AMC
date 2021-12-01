package com.alpha67.amc;


import com.alpha67.amc.koda.ItemInitKoda;
import com.alpha67.amc.vultorio.ItemInitVultorio;
import net.minecraft.client.MainWindow;
import net.minecraft.client.Minecraft;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(amc.MODID)
public class amc {

    public static final String MODID ="amc";

    public amc()
    {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
        FMLJavaModLoadingContext.get().getModEventBus().register(this);
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        //décracation class de vultorio
        ItemInitVultorio.register(eventBus);

        //déclaration class de koda
        ItemInitKoda.register(eventBus);

    }

    public void setup(FMLCommonSetupEvent e)
    {

    }

    @SubscribeEvent
    public void clientSetup(FMLClientSetupEvent e)
    {

    }

    @SubscribeEvent
    public void onClientSetup(final FMLClientSetupEvent e){
        e.getMinecraftSupplier().get().execute(this::updateTitle);
    }

    private void updateTitle(){
        String Name = "Alpha67";
        final MainWindow window = Minecraft.getInstance().getWindow();
        window.setTitle(Name);


    }



}

