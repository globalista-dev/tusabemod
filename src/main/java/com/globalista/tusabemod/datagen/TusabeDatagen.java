package com.globalista.tusabemod.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class TusabeDatagen implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		var data = fabricDataGenerator.createPack();
		data.addProvider(TusabeModelGenerator::new);
		data.addProvider(TusabeLootTableGenerator::new);
	}
}
