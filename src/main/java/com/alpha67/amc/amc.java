package com.alpha67.amc;


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
        prousxdt
    }

    public void setup(FMLCommonSetupEvent e)
    {

    }

    public void clientSetup(FMLCommonSetupEvent e)
    {

    }
}
