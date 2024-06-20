package com.globalista.tusabemod.mixin;

import net.minecraft.block.Block;
import net.minecraft.block.ComposterBlock;
import net.minecraft.item.ItemConvertible;
import org.apache.commons.lang3.NotImplementedException;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import static net.minecraft.item.Items.*;

@Mixin(ComposterBlock.class)
public class CompostingMixin extends Block {
	public CompostingMixin(Settings settings) {
		super(settings);
	}

	@Invoker
	private static void invokeRegisterCompostableItem(float levelIncreaseChance, ItemConvertible item)    {
		throw new NotImplementedException("The invoke failed.");
	}

	@Inject(at = @At("HEAD"), method = "registerDefaultCompostableItems()V")
	private static void injectCompostable(CallbackInfo info) {

		invokeRegisterCompostableItem(0.1f, BAMBOO);

		invokeRegisterCompostableItem(0.3f, ROTTEN_FLESH);
		invokeRegisterCompostableItem(0.3f, CHORUS_FRUIT);
		invokeRegisterCompostableItem(0.3f, CHORUS_FLOWER);
		invokeRegisterCompostableItem(0.3f, CHORUS_PLANT);
		invokeRegisterCompostableItem(0.3f, POISONOUS_POTATO);
		invokeRegisterCompostableItem(0.3f, SPIDER_EYE);

		invokeRegisterCompostableItem(0.5f, SLIME_BALL);
		invokeRegisterCompostableItem(0.5f, TURTLE_SCUTE);
		invokeRegisterCompostableItem(0.5f, ARMADILLO_SCUTE);
		invokeRegisterCompostableItem(0.5f, INK_SAC);
		invokeRegisterCompostableItem(0.5f, GLOW_INK_SAC);
		invokeRegisterCompostableItem(0.5f, FERMENTED_SPIDER_EYE);

		invokeRegisterCompostableItem(0.65f, RABBIT_FOOT);
		invokeRegisterCompostableItem(0.65f, EGG);
		invokeRegisterCompostableItem(0.65f, TURTLE_EGG);

		invokeRegisterCompostableItem(0.85f, POPPED_CHORUS_FRUIT);
		invokeRegisterCompostableItem(0.85f, HONEYCOMB);

		invokeRegisterCompostableItem(1f, GLISTERING_MELON_SLICE);
		invokeRegisterCompostableItem(1f, GOLDEN_CARROT);
	}

}