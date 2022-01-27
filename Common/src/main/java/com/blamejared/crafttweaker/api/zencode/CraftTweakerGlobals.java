package com.blamejared.crafttweaker.api.zencode;


import com.blamejared.crafttweaker.api.CraftTweakerAPI;
import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import org.openzen.zencode.java.ZenCodeGlobals;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@ZenCodeType.Name("crafttweaker.api.Globals")
public class CraftTweakerGlobals {
    
    @ZenCodeGlobals.Global
    public static void println(String msg) {
        
        CraftTweakerAPI.LOGGER.info(msg);
    }
    
    @ZenCodeGlobals.Global
    public static void print(String msg) {
        
        println(msg);
    }
    
}