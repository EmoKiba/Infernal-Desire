package kiba.infernal.proxy;

import kiba.infernal.registry.ModItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event){
        ModItems.init();

    }

    public void Init(FMLInitializationEvent event){

    }

    public void postInit(FMLPostInitializationEvent event){

    }
}