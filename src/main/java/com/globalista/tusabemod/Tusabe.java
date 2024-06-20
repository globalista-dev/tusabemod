package com.globalista.tusabemod;

import com.globalista.tusabemod.additions.TusabeBlocks;
import com.globalista.tusabemod.additions.TusabeItems;
import com.globalista.tusabemod.util.TusabeRegister;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Tusabe implements ModInitializer {

	public static final String MODID = "tusabemod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);
	public static final RegistryKey<PlacedFeature> HALLOWED_DEBRIS_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, TusabeRegister.id("ore_hallowed_debris_large"));

	@Override
	public void onInitialize() {

		BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, HALLOWED_DEBRIS_PLACED_KEY);

		TusabeItems.callItems();
		TusabeBlocks.callBlocks();

		LOGGER.info("[Tusabe] Mod carregado.");
	}
}