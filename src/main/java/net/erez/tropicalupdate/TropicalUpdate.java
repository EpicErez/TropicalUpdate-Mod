package net.erez.tropicalupdate;

import net.erez.tropicalupdate.block.ModBlocks;
import net.erez.tropicalupdate.block.custom.PineappleCakeBlock;
import net.erez.tropicalupdate.entity.ModBoats;
import net.erez.tropicalupdate.item.*;
import net.erez.tropicalupdate.tag.ModBlockTags;
import net.erez.tropicalupdate.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.block.*;
import net.minecraft.client.item.ClampedModelPredicateProvider;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.item.trim.ArmorTrim;
import net.minecraft.item.trim.ArmorTrimMaterial;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;

public class TropicalUpdate implements ModInitializer {
	public static final String MOD_ID = "tropicalupdate";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();
		ModBlockTags.registerModBlockTags();
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.AZURE_LEAVES, RenderLayer.getCutoutMipped());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.AZURE_SAPLING, RenderLayer.getCutoutMipped());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.AZURE_DOOR, RenderLayer.getCutoutMipped());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MANGO_DOOR, RenderLayer.getCutoutMipped());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.AZURE_TRAPDOOR, RenderLayer.getCutoutMipped());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TROPICAL_CARROT_BLOCK, RenderLayer.getCutoutMipped());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINEAPPLE_BLOCK, RenderLayer.getCutoutMipped());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINEAPPLE_BUSH, RenderLayer.getCutoutMipped());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CITRUS_PETAL, RenderLayer.getCutoutMipped());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TROPICAL_GRASS, RenderLayer.getCutoutMipped());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TROPICAL_POTATO_BLOCK, RenderLayer.getCutoutMipped());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_CITRUS_PETAL, RenderLayer.getCutoutMipped());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_TROPICAL_BLOOM, RenderLayer.getCutoutMipped());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TROPICAL_BLOOM, RenderLayer.getCutoutMipped());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TROPICAL_BLOOM_PLANT, RenderLayer.getCutoutMipped());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLUE_RASPBERRY_CROP, RenderLayer.getCutoutMipped());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MANGO_LEAVES, RenderLayer.getCutoutMipped());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MANGO_SAPLING, RenderLayer.getCutoutMipped());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MITHRIL_LANTERN, RenderLayer.getCutoutMipped());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MITHRIL_BARS, RenderLayer.getCutoutMipped());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MITHRIL_CHAIN, RenderLayer.getCutoutMipped());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TROPICAL_WHEAT_BLOCK, RenderLayer.getCutoutMipped());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TROPICAL_BEETROOT_BLOCK, RenderLayer.getCutoutMipped());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MITHRIL_DOOR, RenderLayer.getCutoutMipped());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MITHRIL_TRAPDOOR, RenderLayer.getCutoutMipped());

		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TURQUOISE_GLASS, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TURQUOISE_STAINED_GLASS_PANE, RenderLayer.getTranslucent());

		FuelRegistry.INSTANCE.add(ModItems.AMBER, 18000);

		ModWorldGeneration.generatedModWorldGen();
		ModArmorTrimMaterials.registerModArmorTrimMaterials();

		StrippableBlockRegistry.register(ModBlocks.AZURE_LOG, ModBlocks.STRIPPED_AZURE_LOG);
		StrippableBlockRegistry.register(ModBlocks.AZURE_WOOD, ModBlocks.STRIPPED_AZURE_WOOD);
		StrippableBlockRegistry.register(ModBlocks.MANGO_WOOD, ModBlocks.STRIPPED_MANGO_WOOD);
		StrippableBlockRegistry.register(ModBlocks.MANGO_LOG, ModBlocks.STRIPPED_MANGO_LOG);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.AZURE_LOG, 4, 4);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MANGO_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_AZURE_LOG, 4, 4);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_MANGO_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_AZURE_WOOD, 4, 4);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.AZURE_WOOD, 4, 4);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MANGO_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_MANGO_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.AZURE_LEAVES, 25, 50);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MANGO_LEAVES, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MANGO_FRUIT_LEAVES, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.AZURE_PLANKS,4, 15);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MANGO_PLANKS,5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.AZURE_STAIRS,4, 15);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MANGO_STAIRS,5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.TURQUOISE_WOOL,25, 50);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.TURQUOISE_CARPET,25, 50);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.AZURE_FENCE, 4, 15);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MANGO_FENCE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MANGO_FENCE_GATE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.TROPICAL_GRASS, 50, 80);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.TROPICAL_BLOOM, 50, 80);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CITRUS_PETAL, 60, 100);

		ClampedModelPredicateProvider clampedModelPredicateProvider = (stack, world, entity, seed) -> {
			if (!stack.isIn(ItemTags.TRIMMABLE_ARMOR)) {
				return Float.NEGATIVE_INFINITY;
			}
			if (world == null) {
				return 0.0f;
			}
			return ArmorTrim.getTrim(world.getRegistryManager(), stack).map(ArmorTrim::getMaterial).map(RegistryEntry::value).map(ArmorTrimMaterial::itemModelIndex).orElse(Float.valueOf(0.0f)).floatValue();
		};



		CompostingChanceRegistry.INSTANCE.add(ModItems.PINEAPPLE, 0.75f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.PINEAPPLE_SLICE, 0.40f);
		CompostingChanceRegistry.INSTANCE.add(ModBlocks.AZURE_LEAVES, 0.32f);
		CompostingChanceRegistry.INSTANCE.add(ModBlocks.AZURE_SAPLING, 0.40f);
		CompostingChanceRegistry.INSTANCE.add(ModBlocks.MANGO_SAPLING, 0.30f);
		CompostingChanceRegistry.INSTANCE.add(ModBlocks.MANGO_LEAVES, 0.30f);
		CompostingChanceRegistry.INSTANCE.add(ModBlocks.MANGO_FRUIT_LEAVES, 0.42f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.TROPICAL_FRUITS , 0.70f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.MANGO , 0.30f);
		CompostingChanceRegistry.INSTANCE.add(ModBlocks.PINEAPPLE_BUSH, 0.45f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.PINEAPPLE_SEEDS, 0.50f);
		CompostingChanceRegistry.INSTANCE.add(ModBlocks.TROPICAL_GRASS, 0.40f);
		CompostingChanceRegistry.INSTANCE.add(ModBlocks.CITRUS_PETAL, 0.70f);
		CompostingChanceRegistry.INSTANCE.add(ModBlocks.TROPICAL_BLOOM, 0.75f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.TROPICAL_BLOOM_SEEDS, 0.45f);

		UseBlockCallback.EVENT.register((player, world, hand, hitResult) -> {
			BlockPos pos = hitResult.getBlockPos();
			BlockState state = world.getBlockState(pos);
			ItemStack stack = player.getStackInHand(hand);


			if (stack.getItem() instanceof HoeItem && (state.isOf(ModBlocks.TROPICAL_DIRT) || state.isOf(ModBlocks.TROPICAL_GRASS_BLOCK))) {
				BlockPos blockAbovePos = pos.up();
				BlockState blockAboveState = world.getBlockState(blockAbovePos);
				if (blockAboveState.isAir()) {
					world.playSound(null, pos, SoundEvents.ITEM_HOE_TILL, SoundCategory.BLOCKS, 1.0F, 1.0F);
					world.setBlockState(pos, ModBlocks.TROPICAL_FARMLAND.getDefaultState(), Block.NOTIFY_LISTENERS);

					if (!player.isCreative()) {
						stack.damage(1, player, (p) -> p.sendToolBreakStatus(hand));
					}

					return ActionResult.SUCCESS;
				}
			}

			if (stack.getItem() == ModItems.AMBER_AND_STEEL && state.isOf(Blocks.RAW_IRON_BLOCK)) {
				world.playSound(null, pos, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 1.0F, 1.0F);
				world.setBlockState(pos, Blocks.IRON_BLOCK.getDefaultState(), Block.NOTIFY_LISTENERS);

				// Add fire particle effect
				world.addParticle(ParticleTypes.FLAME, pos.getX() + 0.5, pos.getY() + 1.0, pos.getZ() + 0.5, 0.0, 0.0, 0.0);

				if (!player.isCreative()) {
					stack.damage(1, player, (p) -> p.sendToolBreakStatus(hand));
				}

				return ActionResult.SUCCESS;
			}

			if (stack.getItem() == ModItems.AMBER_AND_STEEL && state.isOf(Blocks.RAW_GOLD_BLOCK)) {
				world.playSound(null, pos, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 1.0F, 1.0F);
				world.setBlockState(pos, Blocks.GOLD_BLOCK.getDefaultState(), Block.NOTIFY_LISTENERS);

				// Add fire particle effect
				world.addParticle(ParticleTypes.FLAME, pos.getX() + 0.5, pos.getY() + 1.0, pos.getZ() + 0.5, 0.0, 0.0, 0.0);

				if (!player.isCreative()) {
					stack.damage(1, player, (p) -> p.sendToolBreakStatus(hand));
				}

				return ActionResult.SUCCESS;
			}

			if (stack.getItem() == ModItems.AMBER_AND_STEEL && state.isOf(Blocks.RAW_COPPER_BLOCK)) {
				world.playSound(null, pos, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 1.0F, 1.0F);
				world.setBlockState(pos, Blocks.COPPER_BLOCK.getDefaultState(), Block.NOTIFY_LISTENERS);

				// Add fire particle effect
				world.addParticle(ParticleTypes.FLAME, pos.getX() + 0.5, pos.getY() + 1.0, pos.getZ() + 0.5, 0.0, 0.0, 0.0);

				if (!player.isCreative()) {
					stack.damage(1, player, (p) -> p.sendToolBreakStatus(hand));
				}

				return ActionResult.SUCCESS;
			}

			if (stack.getItem() instanceof MithrilShearsItem && state.isOf(Blocks.PUMPKIN)) {
				world.playSound((PlayerEntity)null, pos, SoundEvents.BLOCK_PUMPKIN_CARVE, SoundCategory.BLOCKS, 1.0F, 1.0F);

				// Determine the player's facing direction
				Direction direction = hitResult.getSide();
				Direction direction2 = direction.getAxis() == Direction.Axis.Y ? player.getHorizontalFacing().getOpposite() : direction;

				// Set the carved pumpkin block state with the appropriate horizontal facing
				world.setBlockState(pos, Blocks.CARVED_PUMPKIN.getDefaultState().with(Properties.HORIZONTAL_FACING, direction2), Block.NOTIFY_LISTENERS);

				// Spawn pumpkin seeds
				ItemEntity itemEntity = new ItemEntity(world, (double)pos.getX() + 0.5 + (double)direction2.getOffsetX() * 0.65, (double)pos.getY() + 0.1, (double)pos.getZ() + 0.5 + (double)direction2.getOffsetZ() * 0.65, new ItemStack(Items.PUMPKIN_SEEDS, 4));
				itemEntity.setVelocity(0.05 * (double)direction2.getOffsetX() + world.random.nextDouble() * 0.02, 0.05, 0.05 * (double)direction2.getOffsetZ() + world.random.nextDouble() * 0.02);
				world.spawnEntity(itemEntity);

				if (!player.isCreative()) {
					stack.damage(1, player, (p) -> p.sendToolBreakStatus(hand));
				}

				return ActionResult.SUCCESS;
			}





			if (stack.getItem() instanceof ShovelItem && (state.isOf(ModBlocks.TROPICAL_DIRT) || state.isOf(ModBlocks.TROPICAL_GRASS_BLOCK))) {
				BlockPos blockAbovePos = pos.up();
				BlockState blockAboveState = world.getBlockState(blockAbovePos);
				if (blockAboveState.isAir()) {
					world.playSound(null, pos, SoundEvents.ITEM_SHOVEL_FLATTEN, SoundCategory.BLOCKS, 1.0F, 1.0F);
					world.setBlockState(pos, ModBlocks.TROPICAL_DIRT_PATH.getDefaultState(), Block.NOTIFY_LISTENERS);

					if (!player.isCreative()) {
						stack.damage(1, player, (p) -> p.sendToolBreakStatus(hand));
					}

					return ActionResult.SUCCESS;
				}
			}

			if (stack.getItem() instanceof SwordItem && state.isOf(ModBlocks.PINEAPPLE_CAKE_BLOCK)) {
				// Check if the cake is fully eaten (max 6 bites)
				int remainingBites = state.get(PineappleCakeBlock.BITES);
				if (remainingBites == 0) {
					world.playSound(null, pos, SoundEvents.ENTITY_ITEM_FRAME_REMOVE_ITEM, SoundCategory.BLOCKS, 1.0F, 1.0F);
					world.setBlockState(pos, Blocks.AIR.getDefaultState(), Block.NOTIFY_LISTENERS);

					if (!player.isCreative()) {
						stack.damage(1, player, (p) -> p.sendToolBreakStatus(hand));
					}

					// Drop 4 ModItems.PINEAPPLE_CAKE_SLICE
					if (!world.isClient) {
						ItemStack cakeSliceStack = new ItemStack(ModItems.PINEAPPLE_CAKE_SLICE, 4);
						ItemEntity itemEntity = new ItemEntity(world, pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, cakeSliceStack);
						world.spawnEntity(itemEntity);
					}

					return ActionResult.SUCCESS;
				}
			}

			if (stack.getItem() == ModItems.AMBER_AND_STEEL && state.isOf(Blocks.IRON_ORE)) {
				world.playSound(null, pos, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 1.0F, 1.0F);
				world.setBlockState(pos, Blocks.STONE.getDefaultState(), Block.NOTIFY_LISTENERS);

				// Add fire particle effect
				world.addParticle(ParticleTypes.FLAME, pos.getX() + 0.5, pos.getY() + 1.1, pos.getZ() + 0.5, 0.0, 0.0, 0.0);

				if (!player.isCreative()) {
					stack.damage(1, player, (p) -> p.sendToolBreakStatus(hand));
				}

				if (!world.isClient) {
					ItemStack ironStack = new ItemStack(Items.IRON_INGOT, 1);
					double yOffset = player.getY() > pos.getY() ? 1.0 : 0.0; // Adjust the offset as needed
					ItemEntity itemEntity = new ItemEntity(world, pos.getX() + 0.5, pos.getY() + yOffset, pos.getZ() + 0.5, ironStack);

					// Calculate the direction toward the player
					double dx = player.getX() - itemEntity.getX();
					double dy = player.getY() - itemEntity.getY();
					double dz = player.getZ() - itemEntity.getZ();
					double distance = Math.sqrt(dx * dx + dy * dy + dz * dz);
					double speed = 0.1; // Adjust the speed as needed

					itemEntity.setVelocity(dx / distance * speed, dy / distance * speed, dz / distance * speed);
					world.spawnEntity(itemEntity);

				}

				return ActionResult.SUCCESS;
			}

			if (stack.getItem() == ModItems.AMBER_AND_STEEL && state.isOf(ModBlocks.MITHRIL_ORE)) {
				world.playSound(null, pos, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 1.0F, 1.0F);
				world.setBlockState(pos, ModBlocks.TROPICAL_STONE.getDefaultState(), Block.NOTIFY_LISTENERS);

				// Add fire particle effect
				world.addParticle(ParticleTypes.FLAME, pos.getX() + 0.5, pos.getY() + 1.1, pos.getZ() + 0.5, 0.0, 0.0, 0.0);

				if (!player.isCreative()) {
					stack.damage(1, player, (p) -> p.sendToolBreakStatus(hand));
				}

				if (!world.isClient) {
					ItemStack ironStack = new ItemStack(ModItems.MITHRIL_INGOT, 1);
					double yOffset = player.getY() > pos.getY() ? 1.0 : 0.0; // Adjust the offset as needed
					ItemEntity itemEntity = new ItemEntity(world, pos.getX() + 0.5, pos.getY() + yOffset, pos.getZ() + 0.5, ironStack);

					// Calculate the direction toward the player
					double dx = player.getX() - itemEntity.getX();
					double dy = player.getY() - itemEntity.getY();
					double dz = player.getZ() - itemEntity.getZ();
					double distance = Math.sqrt(dx * dx + dy * dy + dz * dz);
					double speed = 0.1; // Adjust the speed as needed

					itemEntity.setVelocity(dx / distance * speed, dy / distance * speed, dz / distance * speed);
					world.spawnEntity(itemEntity);

				}

				return ActionResult.SUCCESS;
			}

			if (stack.getItem() == ModItems.AMBER_AND_STEEL && state.isOf(Blocks.TNT)) {
				world.playSound(null, pos, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 1.0F, 1.0F);
				world.setBlockState(pos, Blocks.AIR.getDefaultState(), Block.NOTIFY_LISTENERS);
				TntBlock.primeTnt(world, pos);


				if (!player.isCreative()) {
					stack.damage(1, player, (p) -> p.sendToolBreakStatus(hand));
				}

				return ActionResult.SUCCESS;
			}

			if (stack.getItem() == ModItems.AMBER_AND_STEEL && state.isOf(ModBlocks.TROPICAL_DEEPSLATE_MITHRIL_ORE)) {
				world.playSound(null, pos, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 1.0F, 1.0F);
				world.setBlockState(pos, ModBlocks.TROPICAL_DEEPSLATE.getDefaultState(), Block.NOTIFY_LISTENERS);

				// Add fire particle effect
				world.addParticle(ParticleTypes.FLAME, pos.getX() + 0.5, pos.getY() + 1.1, pos.getZ() + 0.5, 0.0, 0.0, 0.0);

				if (!player.isCreative()) {
					stack.damage(1, player, (p) -> p.sendToolBreakStatus(hand));
				}

				if (!world.isClient) {
					ItemStack ironStack = new ItemStack(ModItems.MITHRIL_INGOT, 1);
					double yOffset = player.getY() > pos.getY() ? 1.0 : 0.0; // Adjust the offset as needed
					ItemEntity itemEntity = new ItemEntity(world, pos.getX() + 0.5, pos.getY() + yOffset, pos.getZ() + 0.5, ironStack);

					// Calculate the direction toward the player
					double dx = player.getX() - itemEntity.getX();
					double dy = player.getY() - itemEntity.getY();
					double dz = player.getZ() - itemEntity.getZ();
					double distance = Math.sqrt(dx * dx + dy * dy + dz * dz);
					double speed = 0.1; // Adjust the speed as needed

					itemEntity.setVelocity(dx / distance * speed, dy / distance * speed, dz / distance * speed);
					world.spawnEntity(itemEntity);

				}

				return ActionResult.SUCCESS;
			}

			if (stack.getItem() == ModItems.AMBER_AND_STEEL && state.isOf(ModBlocks.TROPICAL_IRON_ORE)) {
				world.playSound(null, pos, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 1.0F, 1.0F);
				world.setBlockState(pos, ModBlocks.TROPICAL_STONE.getDefaultState(), Block.NOTIFY_LISTENERS);

				// Add fire particle effect
				world.addParticle(ParticleTypes.FLAME, pos.getX() + 0.5, pos.getY() + 1.1, pos.getZ() + 0.5, 0.0, 0.0, 0.0);

				if (!player.isCreative()) {
					stack.damage(1, player, (p) -> p.sendToolBreakStatus(hand));
				}

				if (!world.isClient) {
					int randomCount = world.random.nextInt(2) + 1; // Generates a random number between 1 and 2 (inclusive)
					ItemStack ironStack = new ItemStack(Items.IRON_INGOT, randomCount);
					double yOffset = player.getY() > pos.getY() ? 1.0 : 0.0; // Adjust the offset as needed
					ItemEntity itemEntity = new ItemEntity(world, pos.getX() + 0.5, pos.getY() + yOffset, pos.getZ() + 0.5, ironStack);

					// Calculate the direction toward the player
					double dx = player.getX() - itemEntity.getX();
					double dy = player.getY() - itemEntity.getY();
					double dz = player.getZ() - itemEntity.getZ();
					double distance = Math.sqrt(dx * dx + dy * dy + dz * dz);
					double speed = 0.1; // Adjust the speed as needed

					itemEntity.setVelocity(dx / distance * speed, dy / distance * speed, dz / distance * speed);
					world.spawnEntity(itemEntity);
				}

				return ActionResult.SUCCESS;
			}

			if (stack.getItem() == ModItems.AMBER_AND_STEEL && state.isOf(ModBlocks.TROPICAL_DEEPSLATE_IRON_ORE)) {
				world.playSound(null, pos, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 1.0F, 1.0F);
				world.setBlockState(pos, ModBlocks.TROPICAL_DEEPSLATE.getDefaultState(), Block.NOTIFY_LISTENERS);

				// Add fire particle effect
				world.addParticle(ParticleTypes.FLAME, pos.getX() + 0.5, pos.getY() + 1.1, pos.getZ() + 0.5, 0.0, 0.0, 0.0);

				if (!player.isCreative()) {
					stack.damage(1, player, (p) -> p.sendToolBreakStatus(hand));
				}

				if (!world.isClient) {
					int randomCount = world.random.nextInt(2) + 1; // Generates a random number between 1 and 2 (inclusive)
					ItemStack ironStack = new ItemStack(Items.IRON_INGOT, randomCount);
					double yOffset = player.getY() > pos.getY() ? 1.0 : 0.0; // Adjust the offset as needed
					ItemEntity itemEntity = new ItemEntity(world, pos.getX() + 0.5, pos.getY() + yOffset, pos.getZ() + 0.5, ironStack);

					// Calculate the direction toward the player
					double dx = player.getX() - itemEntity.getX();
					double dy = player.getY() - itemEntity.getY();
					double dz = player.getZ() - itemEntity.getZ();
					double distance = Math.sqrt(dx * dx + dy * dy + dz * dz);
					double speed = 0.1; // Adjust the speed as needed

					itemEntity.setVelocity(dx / distance * speed, dy / distance * speed, dz / distance * speed);
					world.spawnEntity(itemEntity);
				}

				return ActionResult.SUCCESS;
			}

			if (stack.getItem() == ModItems.AMBER_AND_STEEL && state.isOf(ModBlocks.TROPICAL_DEEPSLATE_GOLD_ORE)) {
				world.playSound(null, pos, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 1.0F, 1.0F);
				world.setBlockState(pos, ModBlocks.TROPICAL_DEEPSLATE.getDefaultState(), Block.NOTIFY_LISTENERS);

				// Add fire particle effect
				world.addParticle(ParticleTypes.FLAME, pos.getX() + 0.5, pos.getY() + 1.1, pos.getZ() + 0.5, 0.0, 0.0, 0.0);

				if (!player.isCreative()) {
					stack.damage(1, player, (p) -> p.sendToolBreakStatus(hand));
				}

				if (!world.isClient) {
					int randomCount = world.random.nextInt(2) + 1; // Generates a random number between 1 and 2 (inclusive)
					ItemStack ironStack = new ItemStack(Items.GOLD_INGOT, randomCount);
					double yOffset = player.getY() > pos.getY() ? 1.0 : 0.0; // Adjust the offset as needed
					ItemEntity itemEntity = new ItemEntity(world, pos.getX() + 0.5, pos.getY() + yOffset, pos.getZ() + 0.5, ironStack);

					// Calculate the direction toward the player
					double dx = player.getX() - itemEntity.getX();
					double dy = player.getY() - itemEntity.getY();
					double dz = player.getZ() - itemEntity.getZ();
					double distance = Math.sqrt(dx * dx + dy * dy + dz * dz);
					double speed = 0.1; // Adjust the speed as needed

					itemEntity.setVelocity(dx / distance * speed, dy / distance * speed, dz / distance * speed);
					world.spawnEntity(itemEntity);
				}

				return ActionResult.SUCCESS;
			}

			if (stack.getItem() == ModItems.AMBER_AND_STEEL && state.isOf(ModBlocks.TROPICAL_GOLD_ORE)) {
				world.playSound(null, pos, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 1.0F, 1.0F);
				world.setBlockState(pos, ModBlocks.TROPICAL_STONE.getDefaultState(), Block.NOTIFY_LISTENERS);

				// Add fire particle effect
				world.addParticle(ParticleTypes.FLAME, pos.getX() + 0.5, pos.getY() + 1.1, pos.getZ() + 0.5, 0.0, 0.0, 0.0);

				if (!player.isCreative()) {
					stack.damage(1, player, (p) -> p.sendToolBreakStatus(hand));
				}

				if (!world.isClient) {
					int randomCount = world.random.nextInt(2) + 1; // Generates a random number between 1 and 2 (inclusive)
					ItemStack ironStack = new ItemStack(Items.GOLD_INGOT, randomCount);
					double yOffset = player.getY() > pos.getY() ? 1.0 : 0.0; // Adjust the offset as needed
					ItemEntity itemEntity = new ItemEntity(world, pos.getX() + 0.5, pos.getY() + yOffset, pos.getZ() + 0.5, ironStack);

					// Calculate the direction toward the player
					double dx = player.getX() - itemEntity.getX();
					double dy = player.getY() - itemEntity.getY();
					double dz = player.getZ() - itemEntity.getZ();
					double distance = Math.sqrt(dx * dx + dy * dy + dz * dz);
					double speed = 0.1; // Adjust the speed as needed

					itemEntity.setVelocity(dx / distance * speed, dy / distance * speed, dz / distance * speed);
					world.spawnEntity(itemEntity);
				}

				return ActionResult.SUCCESS;
			}

			if (stack.getItem() == ModItems.AMBER_AND_STEEL && state.isOf(Blocks.COPPER_ORE)) {
				world.playSound(null, pos, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 1.0F, 1.0F);
				world.setBlockState(pos, Blocks.STONE.getDefaultState(), Block.NOTIFY_LISTENERS);

				// Add fire particle effect
				world.addParticle(ParticleTypes.FLAME, pos.getX() + 0.5, pos.getY() + 1.1, pos.getZ() + 0.5, 0.0, 0.0, 0.0);

				if (!player.isCreative()) {
					stack.damage(1, player, (p) -> p.sendToolBreakStatus(hand));
				}

				if (!world.isClient) {
					int randomCount = world.random.nextInt(4) + 2; // Generates a random number between 2 and 5 (inclusive)
					ItemStack copperStack = new ItemStack(Items.COPPER_INGOT, randomCount);
					double yOffset = player.getY() > pos.getY() ? 1.0 : 0.0; // Adjust the offset as needed
					ItemEntity itemEntity = new ItemEntity(world, pos.getX() + 0.5, pos.getY() + yOffset, pos.getZ() + 0.5, copperStack);

					// Calculate the direction toward the player
					double dx = player.getX() - itemEntity.getX();
					double dy = player.getY() - itemEntity.getY();
					double dz = player.getZ() - itemEntity.getZ();
					double distance = Math.sqrt(dx * dx + dy * dy + dz * dz);
					double speed = 0.1; // Adjust the speed as needed

					itemEntity.setVelocity(dx / distance * speed, dy / distance * speed, dz / distance * speed);
					world.spawnEntity(itemEntity);
				}

				return ActionResult.SUCCESS;
			}

			if (stack.getItem() == ModItems.AMBER_AND_STEEL && state.isOf(Blocks.DEEPSLATE_COPPER_ORE)) {
				world.playSound(null, pos, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 1.0F, 1.0F);
				world.setBlockState(pos, Blocks.DEEPSLATE.getDefaultState(), Block.NOTIFY_LISTENERS);

				// Add fire particle effect
				world.addParticle(ParticleTypes.FLAME, pos.getX() + 0.5, pos.getY() + 1.1, pos.getZ() + 0.5, 0.0, 0.0, 0.0);

				if (!player.isCreative()) {
					stack.damage(1, player, (p) -> p.sendToolBreakStatus(hand));
				}

				if (!world.isClient) {
					int randomCount = world.random.nextInt(4) + 2; // Generates a random number between 2 and 5 (inclusive)
					ItemStack copperStack = new ItemStack(Items.COPPER_INGOT, randomCount);
					double yOffset = player.getY() > pos.getY() ? 1.0 : 0.0; // Adjust the offset as needed
					ItemEntity itemEntity = new ItemEntity(world, pos.getX() + 0.5, pos.getY() + yOffset, pos.getZ() + 0.5, copperStack);

					// Calculate the direction toward the player
					double dx = player.getX() - itemEntity.getX();
					double dy = player.getY() - itemEntity.getY();
					double dz = player.getZ() - itemEntity.getZ();
					double distance = Math.sqrt(dx * dx + dy * dy + dz * dz);
					double speed = 0.1; // Adjust the speed as needed

					itemEntity.setVelocity(dx / distance * speed, dy / distance * speed, dz / distance * speed);
					world.spawnEntity(itemEntity);
				}

				return ActionResult.SUCCESS;
			}

			if (stack.getItem() == ModItems.AMBER_AND_STEEL && state.isOf(Blocks.GOLD_ORE)) {
				world.playSound(null, pos, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 1.0F, 1.0F);
				world.setBlockState(pos, Blocks.STONE.getDefaultState(), Block.NOTIFY_LISTENERS);

				// Add fire particle effect
				world.addParticle(ParticleTypes.FLAME, pos.getX() + 0.5, pos.getY() + 1.1, pos.getZ() + 0.5, 0.0, 0.0, 0.0);

				if (!player.isCreative()) {
					stack.damage(1, player, (p) -> p.sendToolBreakStatus(hand));
				}

				if (!world.isClient) {
					ItemStack goldStack = new ItemStack(Items.GOLD_INGOT, 1);
					double yOffset = player.getY() > pos.getY() ? 1.0 : 0.0; // Adjust the offset as needed
					ItemEntity itemEntity = new ItemEntity(world, pos.getX() + 0.5, pos.getY() + yOffset, pos.getZ() + 0.5, goldStack);

					// Calculate the direction toward the player
					double dx = player.getX() - itemEntity.getX();
					double dy = player.getY() - itemEntity.getY();
					double dz = player.getZ() - itemEntity.getZ();
					double distance = Math.sqrt(dx * dx + dy * dy + dz * dz);
					double speed = 0.1; // Adjust the speed as needed

					itemEntity.setVelocity(dx / distance * speed, dy / distance * speed, dz / distance * speed);
					world.spawnEntity(itemEntity);

				}

				return ActionResult.SUCCESS;
			}

			if (stack.getItem() == ModItems.AMBER_AND_STEEL && state.isOf(Blocks.DEEPSLATE_IRON_ORE)) {
				world.playSound(null, pos, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 1.0F, 1.0F);
				world.setBlockState(pos, Blocks.DEEPSLATE.getDefaultState(), Block.NOTIFY_LISTENERS);

				// Add fire particle effect
				world.addParticle(ParticleTypes.FLAME, pos.getX() + 0.5, pos.getY() + 1.1, pos.getZ() + 0.5, 0.0, 0.0, 0.0);

				if (!player.isCreative()) {
					stack.damage(1, player, (p) -> p.sendToolBreakStatus(hand));
				}

				if (!world.isClient) {
					ItemStack ironStack = new ItemStack(Items.IRON_INGOT, 1);
					double yOffset = player.getY() > pos.getY() ? 1.0 : 0.0; // Adjust the offset as needed
					ItemEntity itemEntity = new ItemEntity(world, pos.getX() + 0.5, pos.getY() + yOffset, pos.getZ() + 0.5, ironStack);

					// Calculate the direction toward the player
					double dx = player.getX() - itemEntity.getX();
					double dy = player.getY() - itemEntity.getY();
					double dz = player.getZ() - itemEntity.getZ();
					double distance = Math.sqrt(dx * dx + dy * dy + dz * dz);
					double speed = 0.1; // Adjust the speed as needed

					itemEntity.setVelocity(dx / distance * speed, dy / distance * speed, dz / distance * speed);
					world.spawnEntity(itemEntity);

				}

				return ActionResult.SUCCESS;
			}

			if (stack.getItem() == ModItems.AMBER_AND_STEEL && state.isOf(Blocks.DEEPSLATE_GOLD_ORE)) {
				world.playSound(null, pos, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 1.0F, 1.0F);
				world.setBlockState(pos, Blocks.DEEPSLATE.getDefaultState(), Block.NOTIFY_LISTENERS);

				// Add fire particle effect
				world.addParticle(ParticleTypes.FLAME, pos.getX() + 0.5, pos.getY() + 1.1, pos.getZ() + 0.5, 0.0, 0.0, 0.0);

				if (!player.isCreative()) {
					stack.damage(1, player, (p) -> p.sendToolBreakStatus(hand));
				}

				if (!world.isClient) {
					ItemStack goldStack = new ItemStack(Items.GOLD_INGOT, 1);
					double yOffset = player.getY() > pos.getY() ? 1.0 : 0.0; // Adjust the offset as needed
					ItemEntity itemEntity = new ItemEntity(world, pos.getX() + 0.5, pos.getY() + yOffset, pos.getZ() + 0.5, goldStack);

					// Calculate the direction toward the player
					double dx = player.getX() - itemEntity.getX();
					double dy = player.getY() - itemEntity.getY();
					double dz = player.getZ() - itemEntity.getZ();
					double distance = Math.sqrt(dx * dx + dy * dy + dz * dz);
					double speed = 0.1; // Adjust the speed as needed

					itemEntity.setVelocity(dx / distance * speed, dy / distance * speed, dz / distance * speed);
					world.spawnEntity(itemEntity);

				}

				return ActionResult.SUCCESS;
			}

			if (stack.getItem() == Items.POTATO && state.isOf(ModBlocks.TROPICAL_FARMLAND)) {
				if (world.getBlockState(pos.up()).isAir()) {
					world.setBlockState(pos.up(), ModBlocks.TROPICAL_POTATO_BLOCK.getDefaultState());
					world.playSound(null, pos, SoundEvents.ITEM_CROP_PLANT, SoundCategory.BLOCKS, 1.0F, 1.0F);
					if (!player.isCreative()) {
						stack.decrement(1);
					}
					return ActionResult.SUCCESS;
				}
			}

			if (stack.getItem() == Items.CARROT && state.isOf(ModBlocks.TROPICAL_FARMLAND)) {
				if (world.getBlockState(pos.up()).isAir()) {
					world.setBlockState(pos.up(), ModBlocks.TROPICAL_CARROT_BLOCK.getDefaultState());
					world.playSound(null, pos, SoundEvents.ITEM_CROP_PLANT, SoundCategory.BLOCKS, 1.0F, 1.0F);
					if (!player.isCreative()) {
						stack.decrement(1);
					}
					return ActionResult.SUCCESS;
				}
			}

			if (stack.getItem() == Items.BEETROOT_SEEDS && state.isOf(ModBlocks.TROPICAL_FARMLAND)) {
				if (world.getBlockState(pos.up()).isAir()) {
					world.setBlockState(pos.up(), ModBlocks.TROPICAL_BEETROOT_BLOCK.getDefaultState());
					world.playSound(null, pos, SoundEvents.ITEM_CROP_PLANT, SoundCategory.BLOCKS, 1.0F, 1.0F);
					if (!player.isCreative()) {
						stack.decrement(1);
					}
					return ActionResult.SUCCESS;
				}
			}

			if (stack.getItem() == Items.WHEAT_SEEDS && state.isOf(ModBlocks.TROPICAL_FARMLAND)) {
				if (world.getBlockState(pos.up()).isAir()) {
					world.setBlockState(pos.up(), ModBlocks.TROPICAL_WHEAT_BLOCK.getDefaultState());
					world.playSound(null, pos, SoundEvents.ITEM_CROP_PLANT, SoundCategory.BLOCKS, 1.0F, 1.0F);
					if (!player.isCreative()) {
						stack.decrement(1);
					}
					return ActionResult.SUCCESS;
				}
			}

			if (stack.getItem() == Items.FLINT_AND_STEEL && state.getBlock() == ModBlocks.TURQUOISE_CANDLE && !state.get(Properties.LIT)) {
				world.setBlockState(pos, state.with(Properties.LIT, true), Block.NOTIFY_LISTENERS);
				world.playSound(null, pos, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 1.0F, 1.0F);
				if (!player.isCreative()) {
					stack.damage(1, player, (p) -> p.sendToolBreakStatus(hand));
				}
				return ActionResult.SUCCESS;
			}

			if (stack.getItem() == ModItems.AMBER_AND_STEEL && state.getBlock() == ModBlocks.TURQUOISE_CANDLE && !state.get(Properties.LIT)) {
				world.setBlockState(pos, state.with(Properties.LIT, true), Block.NOTIFY_LISTENERS);
				world.playSound(null, pos, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 1.0F, 1.0F);
				if (!player.isCreative()) {
					stack.damage(1, player, (p) -> p.sendToolBreakStatus(hand));
				}
				return ActionResult.SUCCESS;
			}


			if (stack.getItem() == Items.FLINT_AND_STEEL && state.getBlock() == ModBlocks.TURQUOISE_CANDLE_CAKE && !state.get(Properties.LIT)) {
				world.setBlockState(pos, state.with(Properties.LIT, true), Block.NOTIFY_LISTENERS);
				world.playSound(null, pos, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 1.0F, 1.0F);
				if (!player.isCreative()) {
					stack.damage(1, player, (p) -> p.sendToolBreakStatus(hand));
				}
				return ActionResult.SUCCESS;
			}

			if (stack.getItem() == ModItems.AMBER_AND_STEEL && state.getBlock() == ModBlocks.TURQUOISE_CANDLE_CAKE && !state.get(Properties.LIT)) {
				world.setBlockState(pos, state.with(Properties.LIT, true), Block.NOTIFY_LISTENERS);
				world.playSound(null, pos, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 1.0F, 1.0F);
				if (!player.isCreative()) {
					stack.damage(1, player, (p) -> p.sendToolBreakStatus(hand));
				}
				return ActionResult.SUCCESS;
			}

			if (stack.getItem() == ModItems.AMBER_AND_STEEL && state.getBlock() == Blocks.BLUE_CANDLE_CAKE && !state.get(Properties.LIT)) {
				world.setBlockState(pos, state.with(Properties.LIT, true), Block.NOTIFY_LISTENERS);
				world.playSound(null, pos, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 1.0F, 1.0F);
				if (!player.isCreative()) {
					stack.damage(1, player, (p) -> p.sendToolBreakStatus(hand));
				}
				return ActionResult.SUCCESS;
			}

			if (stack.getItem() == ModItems.AMBER_AND_STEEL && state.getBlock() == Blocks.GREEN_CANDLE_CAKE && !state.get(Properties.LIT)) {
				world.setBlockState(pos, state.with(Properties.LIT, true), Block.NOTIFY_LISTENERS);
				world.playSound(null, pos, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 1.0F, 1.0F);
				if (!player.isCreative()) {
					stack.damage(1, player, (p) -> p.sendToolBreakStatus(hand));
				}
				return ActionResult.SUCCESS;
			}

			if (stack.getItem() == ModItems.AMBER_AND_STEEL && state.getBlock() == Blocks.LIGHT_BLUE_CANDLE_CAKE && !state.get(Properties.LIT)) {
				world.setBlockState(pos, state.with(Properties.LIT, true), Block.NOTIFY_LISTENERS);
				world.playSound(null, pos, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 1.0F, 1.0F);
				if (!player.isCreative()) {
					stack.damage(1, player, (p) -> p.sendToolBreakStatus(hand));
				}
				return ActionResult.SUCCESS;
			}

			if (stack.getItem() == ModItems.AMBER_AND_STEEL && state.getBlock() == Blocks.LIME_CANDLE_CAKE && !state.get(Properties.LIT)) {
				world.setBlockState(pos, state.with(Properties.LIT, true), Block.NOTIFY_LISTENERS);
				world.playSound(null, pos, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 1.0F, 1.0F);
				if (!player.isCreative()) {
					stack.damage(1, player, (p) -> p.sendToolBreakStatus(hand));
				}
				return ActionResult.SUCCESS;
			}

			if (stack.getItem() == ModItems.AMBER_AND_STEEL && state.getBlock() == Blocks.CYAN_CANDLE_CAKE && !state.get(Properties.LIT)) {
				world.setBlockState(pos, state.with(Properties.LIT, true), Block.NOTIFY_LISTENERS);
				world.playSound(null, pos, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 1.0F, 1.0F);
				if (!player.isCreative()) {
					stack.damage(1, player, (p) -> p.sendToolBreakStatus(hand));
				}
				return ActionResult.SUCCESS;
			}

			if (stack.getItem() == ModItems.AMBER_AND_STEEL && state.getBlock() == Blocks.PURPLE_CANDLE_CAKE && !state.get(Properties.LIT)) {
				world.setBlockState(pos, state.with(Properties.LIT, true), Block.NOTIFY_LISTENERS);
				world.playSound(null, pos, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 1.0F, 1.0F);
				if (!player.isCreative()) {
					stack.damage(1, player, (p) -> p.sendToolBreakStatus(hand));
				}
				return ActionResult.SUCCESS;
			}

			if (stack.getItem() == ModItems.AMBER_AND_STEEL && state.getBlock() == Blocks.PINK_CANDLE_CAKE && !state.get(Properties.LIT)) {
				world.setBlockState(pos, state.with(Properties.LIT, true), Block.NOTIFY_LISTENERS);
				world.playSound(null, pos, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 1.0F, 1.0F);
				if (!player.isCreative()) {
					stack.damage(1, player, (p) -> p.sendToolBreakStatus(hand));
				}
				return ActionResult.SUCCESS;
			}

			if (stack.getItem() == ModItems.AMBER_AND_STEEL && state.getBlock() == Blocks.BLACK_CANDLE_CAKE && !state.get(Properties.LIT)) {
				world.setBlockState(pos, state.with(Properties.LIT, true), Block.NOTIFY_LISTENERS);
				world.playSound(null, pos, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 1.0F, 1.0F);
				if (!player.isCreative()) {
					stack.damage(1, player, (p) -> p.sendToolBreakStatus(hand));
				}
				return ActionResult.SUCCESS;
			}

			if (stack.getItem() == ModItems.AMBER_AND_STEEL && state.getBlock() == Blocks.WHITE_CANDLE_CAKE && !state.get(Properties.LIT)) {
				world.setBlockState(pos, state.with(Properties.LIT, true), Block.NOTIFY_LISTENERS);
				world.playSound(null, pos, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 1.0F, 1.0F);
				if (!player.isCreative()) {
					stack.damage(1, player, (p) -> p.sendToolBreakStatus(hand));
				}
				return ActionResult.SUCCESS;
			}

			if (stack.getItem() == ModItems.AMBER_AND_STEEL && state.getBlock() == Blocks.YELLOW_CANDLE_CAKE && !state.get(Properties.LIT)) {
				world.setBlockState(pos, state.with(Properties.LIT, true), Block.NOTIFY_LISTENERS);
				world.playSound(null, pos, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 1.0F, 1.0F);
				if (!player.isCreative()) {
					stack.damage(1, player, (p) -> p.sendToolBreakStatus(hand));
				}
				return ActionResult.SUCCESS;
			}

			if (stack.getItem() == ModItems.AMBER_AND_STEEL && state.getBlock() == Blocks.BROWN_CANDLE_CAKE && !state.get(Properties.LIT)) {
				world.setBlockState(pos, state.with(Properties.LIT, true), Block.NOTIFY_LISTENERS);
				world.playSound(null, pos, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 1.0F, 1.0F);
				if (!player.isCreative()) {
					stack.damage(1, player, (p) -> p.sendToolBreakStatus(hand));
				}
				return ActionResult.SUCCESS;
			}

			if (stack.getItem() == ModItems.AMBER_AND_STEEL && state.getBlock() == Blocks.GRAY_CANDLE_CAKE && !state.get(Properties.LIT)) {
				world.setBlockState(pos, state.with(Properties.LIT, true), Block.NOTIFY_LISTENERS);
				world.playSound(null, pos, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 1.0F, 1.0F);
				if (!player.isCreative()) {
					stack.damage(1, player, (p) -> p.sendToolBreakStatus(hand));
				}
				return ActionResult.SUCCESS;
			}

			if (stack.getItem() == ModItems.AMBER_AND_STEEL && state.getBlock() == Blocks.LIGHT_GRAY_CANDLE_CAKE && !state.get(Properties.LIT)) {
				world.setBlockState(pos, state.with(Properties.LIT, true), Block.NOTIFY_LISTENERS);
				world.playSound(null, pos, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 1.0F, 1.0F);
				if (!player.isCreative()) {
					stack.damage(1, player, (p) -> p.sendToolBreakStatus(hand));
				}
				return ActionResult.SUCCESS;
			}

			if (stack.getItem() == ModItems.AMBER_AND_STEEL && state.getBlock() == Blocks.MAGENTA_CANDLE_CAKE && !state.get(Properties.LIT)) {
				world.setBlockState(pos, state.with(Properties.LIT, true), Block.NOTIFY_LISTENERS);
				world.playSound(null, pos, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 1.0F, 1.0F);
				if (!player.isCreative()) {
					stack.damage(1, player, (p) -> p.sendToolBreakStatus(hand));
				}
				return ActionResult.SUCCESS;
			}

			if (stack.getItem() == ModItems.AMBER_AND_STEEL && state.getBlock() == Blocks.ORANGE_CANDLE_CAKE && !state.get(Properties.LIT)) {
				world.setBlockState(pos, state.with(Properties.LIT, true), Block.NOTIFY_LISTENERS);
				world.playSound(null, pos, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 1.0F, 1.0F);
				if (!player.isCreative()) {
					stack.damage(1, player, (p) -> p.sendToolBreakStatus(hand));
				}
				return ActionResult.SUCCESS;
			}

			if (stack.getItem() == ModItems.AMBER_AND_STEEL && state.getBlock() == Blocks.RED_CANDLE_CAKE && !state.get(Properties.LIT)) {
				world.setBlockState(pos, state.with(Properties.LIT, true), Block.NOTIFY_LISTENERS);
				world.playSound(null, pos, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 1.0F, 1.0F);
				if (!player.isCreative()) {
					stack.damage(1, player, (p) -> p.sendToolBreakStatus(hand));
				}
				return ActionResult.SUCCESS;
			}


			return ActionResult.PASS;


		});

		ModBoats.registerBoats();
	}
}
