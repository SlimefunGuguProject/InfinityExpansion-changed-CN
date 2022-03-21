package io.github.mooy1.infinityexpansion.items.machines;

import java.util.EnumMap;
import java.util.concurrent.ThreadLocalRandom;

import javax.annotation.Nonnull;

import lombok.experimental.UtilityClass;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.github.mooy1.infinityexpansion.InfinityExpansion;
import io.github.mooy1.infinityexpansion.categories.Groups;
import io.github.mooy1.infinityexpansion.items.SlimefunExtension;
import io.github.mooy1.infinityexpansion.items.blocks.InfinityWorkbench;
import io.github.mooy1.infinityexpansion.items.materials.Materials;
import io.github.mooy1.infinitylib.machines.MachineBlock;
import io.github.mooy1.infinitylib.machines.MachineLore;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;

@UtilityClass
public final class Machines {

    public static final SlimefunItemStack COBBLE_PRESS = new SlimefunItemStack(
            "COBBLE_PRESS",
            Material.SMOOTH_STONE,
            "&8原石压缩机",
            "&7高效压缩原石",
            "",
            MachineLore.energyPerSecond(120)
    );
    public static final SlimefunItemStack RESOURCE_SYNTHESIZER = new SlimefunItemStack(
            "RESOURCE_SYNTHESIZER",
            Material.LODESTONE,
            "&6资源合成器",
            "&7通过两种材料合成资源",
            "",
            MachineLore.energy(10_000) + "每次使用"
    );
    public static final SlimefunItemStack BASIC_GROWER = new SlimefunItemStack(
            "BASIC_VIRTUAL_FARM",
            Material.GRASS_BLOCK,
            "&9基础 &a自动农场",
            "&7自动种植、收获和再种植作物",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(18)
    );
    public static final SlimefunItemStack ADVANCED_GROWER = new SlimefunItemStack(
            "ADVANCED_VIRTUAL_FARM",
            Material.CRIMSON_NYLIUM,
            "&c高级 &a自动农场",
            "&7自动种植、收获和再种植作物",
            "",
            MachineLore.speed(5),
            MachineLore.energyPerSecond(90)
    );
    public static final SlimefunItemStack INFINITY_GROWER = new SlimefunItemStack(
            "INFINITY_VIRTUAL_FARM",
            Material.WARPED_NYLIUM,
            "&b无尽 &a自动农场",
            "&7自动种植、收获和再种植作物",
            "",
            MachineLore.speed(25),
            MachineLore.energyPerSecond(900)
    );
    public static final SlimefunItemStack BASIC_TREE = new SlimefunItemStack(
            "BASIC_TREE_GROWER",
            Material.STRIPPED_OAK_WOOD,
            "&9基础 &2自动植树机",
            "&7自动种植、收获和再种植树木",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(36)
    );
    public static final SlimefunItemStack ADVANCED_TREE = new SlimefunItemStack(
            "ADVANCED_TREE_GROWER",
            Material.STRIPPED_ACACIA_WOOD,
            "&c高级 &2自动植树机",
            "&7自动种植、收获和再种植树木",
            "",
            MachineLore.speed(5),
            MachineLore.energyPerSecond(180)
    );
    public static final SlimefunItemStack INFINITY_TREE = new SlimefunItemStack(
            "INFINITY_TREE_GROWER",
            Material.STRIPPED_WARPED_HYPHAE,
            "&b无尽 &2自动植树机",
            "&7自动种植、收获和再种植树木",
            "",
            MachineLore.speed(25),
            MachineLore.energyPerSecond(1200)
    );
    private static final int BEDROCK_ENERGY = 10_000;
    public static final SlimefunItemStack POWERED_BEDROCK = new SlimefunItemStack(
            "POWERED_BEDROCK",
            Material.NETHERITE_BLOCK,
            "&4充能基岩",
            "&7当被红石充能时会变成基岩",
            "&7失去充能后会被破坏",
            "",
            MachineLore.energyPerSecond(BEDROCK_ENERGY)
    );
    private static final int GEO_QUARRY_INTERVAL = 400;
    private static final int GEO_QUARRY_ENERGY = 450;
    public static final SlimefunItemStack GEO_QUARRY = new SlimefunItemStack(
            "GEO_QUARRY",
            Material.QUARTZ_BRICKS,
            "&fGeo 矿机",
            "&7利用电力缓慢从生产资源",
            "",
            MachineLore.energyPerSecond(GEO_QUARRY_ENERGY)
    );
    public static final SlimefunItemStack EXTREME_FREEZER = new SlimefunItemStack(
            "EXTREME_FREEZER",
            Material.LIGHT_BLUE_CONCRETE,
            "&b无尽冰柜",
            "&7将冰转化为冷却剂",
            "",
            MachineLore.energyPerSecond(90)
    );
    public static final SlimefunItemStack DUST_EXTRACTOR = new SlimefunItemStack(
            "DUST_EXTRACTOR",
            Material.FURNACE,
            "&8磨粉机",
            "&7将原石变为矿粉",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(240)
    );
    public static final SlimefunItemStack INFINITY_DUST_EXTRACTOR = new SlimefunItemStack(
            "INFINITY_DUST_EXTRACTOR",
            Material.FURNACE,
            "&b无尽 &8磨粉机",
            "&7将原石变为矿粉",
            "",
            MachineLore.speed(16),
            MachineLore.energyPerSecond(7200)
    );
    public static final SlimefunItemStack INGOT_FORMER = new SlimefunItemStack(
            "INGOT_FORMER",
            Material.FURNACE,
            "&8铸锭机",
            "&7将矿粉变为锭",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(240)
    );
    public static final SlimefunItemStack INFINITY_INGOT_FORMER = new SlimefunItemStack(
            "INFINITY_INGOT_FORMER",
            Material.FURNACE,
            "&b无尽 &8铸锭机",
            "&7将矿粉变为锭",
            "",
            MachineLore.speed(16),
            MachineLore.energyPerSecond(7200)
    );
    public static final SlimefunItemStack URANIUM_EXTRACTOR = new SlimefunItemStack(
            "URANIUM_EXTRACTOR",
            Material.LIME_CONCRETE,
            "&a铀提取器",
            "&7将原石变为铀",
            "",
            MachineLore.energyPerSecond(240)
    );
    public static final SlimefunItemStack DECOMPRESSOR = new SlimefunItemStack(
            "DECOMPRESSOR",
            Material.TARGET,
            "&7分解机",
            "&7将方块还原成基础材料",
            "",
            MachineLore.energyPerSecond(60)
    );
    private static final int GEAR_TRANSFORMER_ENERGY = 12000;
    public static final SlimefunItemStack GEAR_TRANSFORMER = new SlimefunItemStack(
            "GEAR_TRANSFORMER",
            Material.EMERALD_BLOCK,
            "&7装备材质转换器",
            "&7改变原版工具或装备的材质",
            "",
            MachineLore.energy(GEAR_TRANSFORMER_ENERGY) + "每次使用"
    );
    public static final SlimefunItemStack BASIC_COBBLE = new SlimefunItemStack(
            "BASIC_COBBLE_GEN",
            Material.SMOOTH_STONE,
            "&9基础 &8原石生成器",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(24)
    );
    public static final SlimefunItemStack ADVANCED_COBBLE = new SlimefunItemStack(
            "ADVANCED_COBBLE_GEN",
            Material.SMOOTH_STONE,
            "&c高级 &8原石生成器",
            "",
            MachineLore.speed(4),
            MachineLore.energyPerSecond(120)
    );
    public static final SlimefunItemStack INFINITY_COBBLE = new SlimefunItemStack(
            "INFINITY_COBBLE_GEN",
            Material.SMOOTH_STONE,
            "&c无尽 &8原石生成器",
            "",
            MachineLore.speed(64),
            MachineLore.energyPerSecond(800)
    );
    public static final SlimefunItemStack BASIC_OBSIDIAN = new SlimefunItemStack(
            "BASIC_OBSIDIAN_GEN",
            Material.SMOOTH_STONE,
            "&8黑曜石生成器",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(240)
    );
    public static final SlimefunItemStack SINGULARITY_CONSTRUCTOR = new SlimefunItemStack(
            "SINGULARITY_CONSTRUCTOR",
            Material.QUARTZ_BRICKS,
            "&f结构转换器",
            "&7凝聚大量资源",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(120)
    );
    public static final SlimefunItemStack INFINITY_CONSTRUCTOR = new SlimefunItemStack(
            "INFINITY_CONSTRUCTOR",
            Material.CHISELED_QUARTZ_BLOCK,
            "&b无尽 &f结构转换器",
            "&7快速凝聚大量资源",
            "",
            MachineLore.speed(64),
            MachineLore.energyPerSecond(1200)
    );
	public static final SlimefunItemStack BIO_DIGESTION = new SlimefunItemStack(
            "BIO_DIGESTION",
            Material.MYCELIUM,
            "&f生物酵解机",
            "&7将常见的各种肉类或农产品酵解转化",
			"&7可将生物质二次发酵转化为原油",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(60)
    );
    public static final SlimefunItemStack STONEWORKS_FACTORY = new SlimefunItemStack(
            "STONEWORKS_FACTORY",
            Material.BLAST_FURNACE,
            "&8石材厂",
            "&7生成圆石并将其加工成各种材料",
            "",
            MachineLore.energyPerSecond(240)
    );
    public static final SlimefunItemStack VOID_HARVESTER = new SlimefunItemStack(
            "VOID_HARVESTER",
            Material.OBSIDIAN,
            "&8虚空收集者",
            "&7从虚无中缓慢收集&8虚空粒",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(120)
    );
	public static final SlimefunItemStack LUMINA_HARVESTER = new SlimefunItemStack(
            "LUMINA_HARVESTER",
            Material.GLOWSTONE,
            "&8光隙棱镜",
            "&7从时光的间隙中捕获&8光能",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(3000)
    );
    public static final SlimefunItemStack INFINITE_VOID_HARVESTER = new SlimefunItemStack(
            "INFINITE_VOID_HARVESTER",
            Material.CRYING_OBSIDIAN,
            "&b无尽 &8虚空收集者",
            "&7从虚无中缓慢收集&8虚空粒",
            "",
            MachineLore.speed(64),
            MachineLore.energyPerSecond(12000)
    );

    public static void setup(InfinityExpansion plugin) {
        new VoidHarvester(Groups.ADVANCED_MACHINES, VOID_HARVESTER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                Materials.TITANIUM, Materials.TITANIUM, Materials.TITANIUM,
                Materials.MACHINE_PLATE, SlimefunItems.GEO_MINER, Materials.MACHINE_PLATE,
                Materials.MACHINE_CIRCUIT, Materials.MACHINE_CORE, Materials.MACHINE_CIRCUIT
        }, 1).energyPerTick(120).register(plugin);
		new LuminaHarvester(Groups.ADVANCED_MACHINES, LUMINA_HARVESTER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                Materials.LUMINA_GLASS, Materials.MACHINE_CORE, Materials.LUMINA_GLASS,
                Materials.MACHINE_PLATE, VOID_HARVESTER, Materials.MACHINE_PLATE,
                Materials.LUMINA_GLASS, Materials.MACHINE_CORE, Materials.LUMINA_GLASS
        }, 1).energyPerTick(3000).register(plugin);
        new VoidHarvester(Groups.INFINITY_CHEAT, INFINITE_VOID_HARVESTER, InfinityWorkbench.TYPE, new ItemStack[] {
                Materials.MACHINE_PLATE, Materials.MACHINE_PLATE, Materials.MACHINE_PLATE, Materials.MACHINE_PLATE, Materials.MACHINE_PLATE, Materials.MACHINE_PLATE,
                Materials.MAGNONIUM, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.MAGNONIUM,
                Materials.MAGNONIUM, Materials.VOID_INGOT, Materials.INFINITE_CIRCUIT, Materials.INFINITE_CIRCUIT, Materials.VOID_INGOT, Materials.MAGNONIUM,
                Materials.MAGNONIUM, Materials.VOID_INGOT, VOID_HARVESTER, VOID_HARVESTER, Materials.VOID_INGOT, Materials.MAGNONIUM,
                Materials.MAGNONIUM, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.MAGNONIUM,
                Materials.MACHINE_PLATE, Materials.MACHINE_PLATE, Materials.MACHINE_PLATE, Materials.MACHINE_PLATE, Materials.MACHINE_PLATE, Materials.MACHINE_PLATE
        }, 64).energyPerTick(12000).register(plugin);
        new StoneworksFactory(Groups.ADVANCED_MACHINES, STONEWORKS_FACTORY, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                Materials.MAGSTEEL_PLATE, BASIC_COBBLE, Materials.MAGSTEEL_PLATE,
                SlimefunItems.ELECTRIC_FURNACE_3, Materials.MACHINE_CIRCUIT, SlimefunItems.ELECTRIC_ORE_GRINDER,
                Materials.MAGSTEEL_PLATE, SlimefunItems.ELECTRIC_PRESS, Materials.MAGSTEEL_PLATE
        }).energyPerTick(240).register(plugin);

        new SingularityConstructor(Groups.ADVANCED_MACHINES, SINGULARITY_CONSTRUCTOR, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                Materials.MAGSTEEL, Materials.MAGSTEEL, Materials.MAGSTEEL,
                Materials.MACHINE_PLATE, SlimefunItems.CARBON_PRESS_3, Materials.MACHINE_PLATE,
                Materials.MACHINE_CIRCUIT, Materials.MACHINE_CORE, Materials.MACHINE_CIRCUIT
        }).speed(1).energyPerTick(120).register(plugin);
        new SingularityConstructor(Groups.INFINITY_CHEAT, INFINITY_CONSTRUCTOR, InfinityWorkbench.TYPE, new ItemStack[] {
                null, Materials.MACHINE_PLATE, Materials.MACHINE_PLATE, Materials.MACHINE_PLATE, Materials.MACHINE_PLATE, null,
                null, Materials.VOID_INGOT, Materials.INFINITE_CIRCUIT, Materials.INFINITE_CIRCUIT, Materials.VOID_INGOT, null,
                null, Materials.VOID_INGOT, SINGULARITY_CONSTRUCTOR, SINGULARITY_CONSTRUCTOR, Materials.VOID_INGOT, null,
                null, Materials.VOID_INGOT, SINGULARITY_CONSTRUCTOR, SINGULARITY_CONSTRUCTOR, Materials.VOID_INGOT, null,
                null, Materials.INFINITE_INGOT, Materials.INFINITE_CORE, Materials.INFINITE_CORE, Materials.INFINITE_INGOT, null,
                Materials.INFINITE_INGOT, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT, Materials.INFINITE_INGOT
        }).speed(64).energyPerTick(1200).register(plugin);

        new ResourceSynthesizer(Groups.ADVANCED_MACHINES, RESOURCE_SYNTHESIZER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                Materials.ADAMANTITE, Materials.ADAMANTITE, Materials.ADAMANTITE,
                Materials.MACHINE_PLATE, SlimefunItems.REINFORCED_FURNACE, Materials.MACHINE_PLATE,
                Materials.MACHINE_PLATE, Materials.MACHINE_CORE, Materials.MACHINE_PLATE
        }).recipes(new SlimefunItemStack[] {
                Materials.IRON_SINGULARITY, Materials.COAL_SINGULARITY, new SlimefunItemStack(SlimefunItems.REINFORCED_ALLOY_INGOT, 64),
                Materials.IRON_SINGULARITY, Materials.REDSTONE_SINGULARITY, new SlimefunItemStack(SlimefunItems.REDSTONE_ALLOY, 64),
                Materials.DIAMOND_SINGULARITY, Materials.COAL_SINGULARITY, new SlimefunItemStack(SlimefunItems.CARBONADO, 64),
                Materials.GOLD_SINGULARITY, Materials.EMERALD_SINGULARITY, new SlimefunItemStack(SlimefunItems.BLISTERING_INGOT_3, 64),
                Materials.COPPER_SINGULARITY, Materials.ZINC_SINGULARITY, new SlimefunItemStack(SlimefunItems.ELECTRO_MAGNET, 64),
                Materials.IRON_SINGULARITY, Materials.QUARTZ_SINGULARITY, new SlimefunItemStack(SlimefunItems.SOLAR_PANEL, 64),
				Materials.IRON_SINGULARITY, Materials.MAGNESIUM_SINGULARITY, new SlimefunItemStack(Materials.MAGSTEEL_PLATE, 16),
				Materials.IRON_SINGULARITY, Materials.GOLDEN_MASS, new SlimefunItemStack(Materials.GOLD_SINGULARITY, 1),
				Materials.APPLE_MASS, Materials.GOLDEN_MASS, new SlimefunItemStack(Materials.GOLDEN_APPLE_MASS, 1),
				Materials.GOLDEN_APPLE_MASS, Materials.ENCHANTED_MASS, new SlimefunItemStack(Materials.ENCHANTED_APPLE_MASS, 1),
				Materials.QUARTZ_SINGULARITY, Materials.QUARTZ_SINGULARITY, new SlimefunItemStack(Materials.LUMINA_DUST, 4),  //新增
				Materials.VOID_SINGULARITY, Materials.REDSTONE_SINGULARITY, new SlimefunItemStack(Materials.LUMINA_DUST, 64),
				Materials.VOID_SINGULARITY, Materials.DIAMOND_SINGULARITY, new SlimefunItemStack(Materials.LUMINA_DUST, 64),
				Materials.VOID_SINGULARITY, Materials.EMERALD_SINGULARITY, new SlimefunItemStack(Materials.LUMINA_DUST, 64),
				Materials.VOID_SINGULARITY, Materials.LAPIS_SINGULARITY, new SlimefunItemStack(Materials.LUMINA_DUST, 64),
				Materials.VOID_SINGULARITY, Materials.VOID_SINGULARITY, new SlimefunItemStack(Materials.LUMINA_SINGULARITY, 1), //
				Materials.LUMINA_SINGULARITY, Materials.COAL_SINGULARITY, new SlimefunItemStack(Materials.COAL_SINGULARITY, 3),
				Materials.LUMINA_SINGULARITY, Materials.NETHERITE_SINGULARITY, new SlimefunItemStack(Materials.NETHERITE_SINGULARITY, 2),
				Materials.LUMINA_SINGULARITY, Materials.IRON_SINGULARITY, new SlimefunItemStack(Materials.IRON_SINGULARITY, 3),
				Materials.LUMINA_SINGULARITY, Materials.COPPER_SINGULARITY, new SlimefunItemStack(Materials.COPPER_SINGULARITY, 3),
				Materials.LUMINA_SINGULARITY, Materials.ZINC_SINGULARITY, new SlimefunItemStack(Materials.ZINC_SINGULARITY, 3),
				Materials.LUMINA_SINGULARITY, Materials.TIN_SINGULARITY, new SlimefunItemStack(Materials.TIN_SINGULARITY, 3),
				Materials.LUMINA_SINGULARITY, Materials.ALUMINUM_SINGULARITY, new SlimefunItemStack(Materials.ALUMINUM_SINGULARITY, 3),
				Materials.LUMINA_SINGULARITY, Materials.SILVER_SINGULARITY, new SlimefunItemStack(Materials.SILVER_SINGULARITY, 3),
				Materials.LUMINA_SINGULARITY, Materials.MAGNESIUM_SINGULARITY, new SlimefunItemStack(Materials.MAGNESIUM_SINGULARITY, 3),
				Materials.LUMINA_SINGULARITY, Materials.LEAD_SINGULARITY, new SlimefunItemStack(Materials.LEAD_SINGULARITY, 3),
				Materials.LUMINA_SINGULARITY, Materials.QUARTZ_SINGULARITY, new SlimefunItemStack(Materials.QUARTZ_SINGULARITY, 3),
				Materials.LUMINA_SINGULARITY, Materials.GOLD_SINGULARITY, new SlimefunItemStack(Materials.GOLD_SINGULARITY, 3),
				Materials.LUMINA_SINGULARITY, Materials.REDSTONE_SINGULARITY, new SlimefunItemStack(Materials.REDSTONE_SINGULARITY, 3),
				Materials.LUMINA_SINGULARITY, Materials.DIAMOND_SINGULARITY, new SlimefunItemStack(Materials.DIAMOND_SINGULARITY, 3),
				Materials.LUMINA_SINGULARITY, Materials.EMERALD_SINGULARITY, new SlimefunItemStack(Materials.EMERALD_SINGULARITY, 3),
				Materials.LUMINA_SINGULARITY, Materials.LAPIS_SINGULARITY, new SlimefunItemStack(Materials.LAPIS_SINGULARITY, 3),
				Materials.COBBLE_HEART, Materials.LUMINA_SINGULARITY, new SlimefunItemStack(Materials.INFINITE_INGOT, 1),
				Materials.VOID_SINGULARITY, Materials.INFINITY_SINGULARITY, new SlimefunItemStack(Materials.LUMINA_SINGULARITY, 64),
        }).energyPerTick(10_000).register(plugin);

        new PoweredBedrock(Groups.INFINITY_CHEAT, POWERED_BEDROCK, InfinityWorkbench.TYPE, new ItemStack[] {
                Materials.COBBLE_5, Materials.COBBLE_5, Materials.COBBLE_5, Materials.COBBLE_5, Materials.COBBLE_5, Materials.COBBLE_5,
                Materials.COBBLE_5, Materials.MACHINE_PLATE, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.MACHINE_PLATE, Materials.COBBLE_5,
                Materials.COBBLE_5, Materials.VOID_INGOT, SlimefunItems.ENERGIZED_CAPACITOR, SlimefunItems.ENERGIZED_CAPACITOR, Materials.VOID_INGOT, Materials.COBBLE_5,
                Materials.COBBLE_5, Materials.VOID_INGOT, Materials.INFINITE_CORE, Materials.INFINITE_CIRCUIT, Materials.VOID_INGOT, Materials.COBBLE_5,
                Materials.COBBLE_5, Materials.MACHINE_PLATE, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.MACHINE_PLATE, Materials.COBBLE_5,
                Materials.COBBLE_5, Materials.COBBLE_5, Materials.COBBLE_5, Materials.COBBLE_5, Materials.COBBLE_5, Materials.COBBLE_5
        }, BEDROCK_ENERGY).register(plugin);
        new MaterialGenerator(Groups.BASIC_MACHINES, BASIC_COBBLE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                Materials.MAGSTEEL, new ItemStack(Material.DIAMOND_PICKAXE), Materials.MAGSTEEL,
                new ItemStack(Material.WATER_BUCKET), Materials.COBBLE_2, new ItemStack(Material.LAVA_BUCKET),
                Materials.MAGSTEEL, Materials.MACHINE_CIRCUIT, Materials.MAGSTEEL
        }).material(Material.COBBLESTONE).speed(1).energyPerTick(24).register(plugin);
        new MaterialGenerator(Groups.ADVANCED_MACHINES, ADVANCED_COBBLE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                Materials.MAGSTEEL_PLATE, BASIC_COBBLE, Materials.MAGSTEEL_PLATE,
                new ItemStack(Material.WATER_BUCKET), Materials.COBBLE_3, new ItemStack(Material.LAVA_BUCKET),
                Materials.MACHINE_CIRCUIT, BASIC_COBBLE, Materials.MACHINE_CIRCUIT
        }).material(Material.COBBLESTONE).speed(4).energyPerTick(75).register(plugin);
        new MaterialGenerator(Groups.INFINITY_CHEAT, INFINITY_COBBLE, InfinityWorkbench.TYPE, new ItemStack[] {
                Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT,
                Materials.VOID_INGOT, ADVANCED_COBBLE, ADVANCED_COBBLE, ADVANCED_COBBLE, ADVANCED_COBBLE, Materials.VOID_INGOT,
                Materials.VOID_INGOT, ADVANCED_COBBLE, ADVANCED_COBBLE, ADVANCED_COBBLE, ADVANCED_COBBLE, Materials.VOID_INGOT,
                Materials.VOID_INGOT, ADVANCED_COBBLE, ADVANCED_COBBLE, ADVANCED_COBBLE, ADVANCED_COBBLE, Materials.VOID_INGOT,
                Materials.VOID_INGOT, ADVANCED_COBBLE, ADVANCED_COBBLE, ADVANCED_COBBLE, ADVANCED_COBBLE, Materials.VOID_INGOT,
                Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT
        }).material(Material.COBBLESTONE).speed(64).energyPerTick(800).register(plugin);
        new MaterialGenerator(Groups.ADVANCED_MACHINES, BASIC_OBSIDIAN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SlimefunItems.FLUID_PUMP, SlimefunItems.PROGRAMMABLE_ANDROID_MINER, SlimefunItems.FLUID_PUMP,
                new ItemStack(Material.DISPENSER), Materials.VOID_INGOT, new ItemStack(Material.DISPENSER),
                Materials.MACHINE_CIRCUIT, ADVANCED_COBBLE, Materials.MACHINE_CIRCUIT
        }).material(Material.OBSIDIAN).speed(1).energyPerTick(240).register(plugin);

        EnumMap<Material, ItemStack[]> crops = new EnumMap<>(Material.class);
        crops.put(Material.WHEAT_SEEDS, new ItemStack[] { new ItemStack(Material.WHEAT, 2) });
        crops.put(Material.CARROT, new ItemStack[] { new ItemStack(Material.CARROT, 2) });
        crops.put(Material.POTATO, new ItemStack[] { new ItemStack(Material.POTATO, 2) });
        crops.put(Material.BEETROOT_SEEDS, new ItemStack[] { new ItemStack(Material.BEETROOT, 2) });
        crops.put(Material.PUMPKIN_SEEDS, new ItemStack[] { new ItemStack(Material.PUMPKIN) });
        crops.put(Material.MELON_SEEDS, new ItemStack[] { new ItemStack(Material.MELON) });
        crops.put(Material.SUGAR_CANE, new ItemStack[] { new ItemStack(Material.SUGAR_CANE, 2) });
        crops.put(Material.COCOA_BEANS, new ItemStack[] { new ItemStack(Material.COCOA_BEANS, 2) });
        crops.put(Material.CACTUS, new ItemStack[] { new ItemStack(Material.CACTUS, 2) });
        crops.put(Material.BAMBOO, new ItemStack[] { new ItemStack(Material.BAMBOO, 6) });
        crops.put(Material.CHORUS_FLOWER, new ItemStack[] { new ItemStack(Material.CHORUS_FRUIT, 6) });
        crops.put(Material.NETHER_WART, new ItemStack[] { new ItemStack(Material.NETHER_WART, 2) });

        new GrowingMachine(Groups.BASIC_MACHINES, BASIC_GROWER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                new ItemStack(Material.GLASS), new ItemStack(Material.GLASS), new ItemStack(Material.GLASS),
                Materials.MAGSTEEL, new ItemStack(Material.DIAMOND_HOE), Materials.MAGSTEEL,
                Materials.MACHINE_CIRCUIT, new ItemStack(Material.GRASS_BLOCK), Materials.MACHINE_CIRCUIT
        }).recipes(crops).ticksPerOutput(150).energyPerTick(18).register(plugin);
        new GrowingMachine(Groups.ADVANCED_MACHINES, ADVANCED_GROWER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SlimefunItems.HARDENED_GLASS, SlimefunItems.HARDENED_GLASS, SlimefunItems.HARDENED_GLASS,
                Materials.MAGNONIUM, BASIC_GROWER, Materials.MAGNONIUM,
                Materials.MACHINE_CIRCUIT, Materials.MACHINE_CORE, Materials.MACHINE_CIRCUIT
        }).recipes(crops).ticksPerOutput(30).energyPerTick(90).register(plugin);
        new GrowingMachine(Groups.INFINITY_CHEAT, INFINITY_GROWER, InfinityWorkbench.TYPE, new ItemStack[] {
                new ItemStack(Material.GLASS), new ItemStack(Material.GLASS), new ItemStack(Material.GLASS), new ItemStack(Material.GLASS), new ItemStack(Material.GLASS), new ItemStack(Material.GLASS),
                new ItemStack(Material.GLASS), null, null, null, null, new ItemStack(Material.GLASS),
                new ItemStack(Material.GLASS), null, null, null, null, new ItemStack(Material.GLASS),
                new ItemStack(Material.GLASS), new ItemStack(Material.GRASS_BLOCK), new ItemStack(Material.GRASS_BLOCK), new ItemStack(Material.GRASS_BLOCK), new ItemStack(Material.GRASS_BLOCK), new ItemStack(Material.GLASS),
                Materials.MACHINE_PLATE, SlimefunItems.CROP_GROWTH_ACCELERATOR_2, ADVANCED_GROWER, ADVANCED_GROWER, SlimefunItems.CROP_GROWTH_ACCELERATOR_2, Materials.MACHINE_PLATE,
                Materials.MACHINE_PLATE, Materials.INFINITE_CIRCUIT, Materials.INFINITE_CORE, Materials.INFINITE_CORE, Materials.INFINITE_CIRCUIT, Materials.MACHINE_PLATE
        }).recipes(crops).ticksPerOutput(6).energyPerTick(600).register(plugin);

        EnumMap<Material, ItemStack[]> trees = new EnumMap<>(Material.class);

        trees.put(Material.OAK_SAPLING, new ItemStack[] {
                new ItemStack(Material.OAK_LEAVES, 8), new ItemStack(Material.OAK_LOG, 6), new ItemStack(Material.STICK), new ItemStack(Material.APPLE)
        });
        trees.put(Material.SPRUCE_SAPLING, new ItemStack[] {
                new ItemStack(Material.SPRUCE_LEAVES, 8), new ItemStack(Material.SPRUCE_LOG, 6), new ItemStack(Material.STICK, 2)
        });
        trees.put(Material.DARK_OAK_SAPLING, new ItemStack[] {
                new ItemStack(Material.DARK_OAK_LEAVES, 8), new ItemStack(Material.DARK_OAK_LOG, 6), new ItemStack(Material.APPLE)
        });
        trees.put(Material.BIRCH_SAPLING, new ItemStack[] {
                new ItemStack(Material.BIRCH_LEAVES, 8), new ItemStack(Material.BIRCH_LOG, 6)
        });
        trees.put(Material.ACACIA_SAPLING, new ItemStack[] {
                new ItemStack(Material.ACACIA_LEAVES, 8), new ItemStack(Material.ACACIA_LOG, 6)
        });
        trees.put(Material.JUNGLE_SAPLING, new ItemStack[] {
                new ItemStack(Material.JUNGLE_LEAVES, 8), new ItemStack(Material.JUNGLE_LOG, 6), new ItemStack(Material.COCOA_BEANS)
        });
        trees.put(Material.WARPED_FUNGUS, new ItemStack[] {
                new ItemStack(Material.WARPED_HYPHAE, 8), new ItemStack(Material.WARPED_STEM, 6), new ItemStack(Material.SHROOMLIGHT)
        });
        trees.put(Material.CRIMSON_FUNGUS, new ItemStack[] {
                new ItemStack(Material.CRIMSON_HYPHAE, 8), new ItemStack(Material.CRIMSON_STEM, 6), new ItemStack(Material.WEEPING_VINES)
        });
		trees.put(Material.BROWN_MUSHROOM, new ItemStack[] {   //新增蘑菇
                new ItemStack(Material.BROWN_MUSHROOM, 8), new ItemStack(Material.BROWN_MUSHROOM_BLOCK, 6), new ItemStack(Material.MUSHROOM_STEM, 4)
        });
		trees.put(Material.RED_MUSHROOM, new ItemStack[] {
                new ItemStack(Material.RED_MUSHROOM, 8), new ItemStack(Material.RED_MUSHROOM_BLOCK, 6), new ItemStack(Material.MUSHROOM_STEM, 4)
        });

        new GrowingMachine(Groups.BASIC_MACHINES, BASIC_TREE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                new ItemStack(Material.GLASS), new ItemStack(Material.GLASS), new ItemStack(Material.GLASS),
                Materials.MAGSTEEL, new ItemStack(Material.PODZOL), Materials.MAGSTEEL,
                Materials.MACHINE_CIRCUIT, BASIC_GROWER, Materials.MACHINE_CIRCUIT
        }).recipes(trees).ticksPerOutput(600).energyPerTick(36).register(plugin);
        new GrowingMachine(Groups.ADVANCED_MACHINES, ADVANCED_TREE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SlimefunItems.HARDENED_GLASS, SlimefunItems.HARDENED_GLASS, SlimefunItems.HARDENED_GLASS,
                Materials.MAGNONIUM, BASIC_TREE, Materials.MAGNONIUM,
                Materials.MACHINE_CIRCUIT, Materials.MACHINE_CORE, Materials.MACHINE_CIRCUIT
        }).recipes(trees).ticksPerOutput(120).energyPerTick(180).register(plugin);
        new GrowingMachine(Groups.INFINITY_CHEAT, INFINITY_TREE, InfinityWorkbench.TYPE, new ItemStack[] {
                new ItemStack(Material.GLASS), new ItemStack(Material.GLASS), new ItemStack(Material.GLASS), new ItemStack(Material.GLASS), new ItemStack(Material.GLASS), new ItemStack(Material.GLASS),
                new ItemStack(Material.GLASS), SlimefunItems.TREE_GROWTH_ACCELERATOR, null, null, SlimefunItems.TREE_GROWTH_ACCELERATOR, new ItemStack(Material.GLASS),
                new ItemStack(Material.GLASS), ADVANCED_TREE, null, null, ADVANCED_TREE, new ItemStack(Material.GLASS),
                new ItemStack(Material.GLASS), SlimefunItems.TREE_GROWTH_ACCELERATOR, null, null, SlimefunItems.TREE_GROWTH_ACCELERATOR, new ItemStack(Material.GLASS),
                Materials.MACHINE_PLATE, new ItemStack(Material.PODZOL), new ItemStack(Material.PODZOL), new ItemStack(Material.PODZOL), new ItemStack(Material.PODZOL), Materials.MACHINE_PLATE,
                Materials.MACHINE_PLATE, Materials.INFINITE_CIRCUIT, Materials.INFINITE_CORE, Materials.INFINITE_CORE, Materials.INFINITE_CIRCUIT, Materials.MACHINE_PLATE
        }).recipes(trees).ticksPerOutput(24).energyPerTick(1800).register(plugin);

        new MachineBlock(Groups.ADVANCED_MACHINES, EXTREME_FREEZER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SlimefunItems.FREEZER_2, SlimefunItems.FREEZER_2, SlimefunItems.FREEZER_2,
                new ItemStack(Material.WATER_BUCKET), SlimefunItems.FLUID_PUMP, new ItemStack(Material.WATER_BUCKET),
                Materials.MACHINE_CIRCUIT, Materials.MACHINE_CORE, Materials.MACHINE_CIRCUIT
        }).addRecipe(SlimefunItems.NETHER_ICE_COOLANT_CELL, new ItemStack(Material.MAGMA_BLOCK, 2))
                .ticksPerOutput(1)
                .addRecipe(SlimefunItems.REACTOR_COOLANT_CELL, new ItemStack(Material.ICE, 2))
                .energyPerTick(90).register(plugin);

        RandomizedItemStack twoDust = new RandomizedItemStack(
                new SlimefunItemStack(SlimefunItems.COPPER_DUST, 2),
                new SlimefunItemStack(SlimefunItems.ZINC_DUST, 2),
                new SlimefunItemStack(SlimefunItems.TIN_DUST, 2),
                new SlimefunItemStack(SlimefunItems.ALUMINUM_DUST, 2),
                new SlimefunItemStack(SlimefunItems.LEAD_DUST, 2),
                new SlimefunItemStack(SlimefunItems.SILVER_DUST, 2),
                new SlimefunItemStack(SlimefunItems.GOLD_DUST, 2),
                new SlimefunItemStack(SlimefunItems.IRON_DUST, 2),
                new SlimefunItemStack(SlimefunItems.MAGNESIUM_DUST, 2)
        );
        new MachineBlock(Groups.ADVANCED_MACHINES, DUST_EXTRACTOR, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SlimefunItems.ELECTRIC_ORE_GRINDER_2, SlimefunItems.ELECTRIC_GOLD_PAN_3, SlimefunItems.ELECTRIC_DUST_WASHER_3,
                SlimefunItems.ELECTRIC_ORE_GRINDER_2, SlimefunItems.ELECTRIC_GOLD_PAN_3, SlimefunItems.ELECTRIC_DUST_WASHER_3,
                Materials.MACHINE_CIRCUIT, Materials.MACHINE_CORE, Materials.MACHINE_CIRCUIT,
        }).ticksPerOutput(1).addRecipe(twoDust, new ItemStack(Material.COBBLESTONE, 4))
                .addRecipe(twoDust, new ItemStack(Material.ANDESITE, 4))
                .addRecipe(twoDust, new ItemStack(Material.STONE, 4))
                .addRecipe(twoDust, new ItemStack(Material.DIORITE, 4))
                .addRecipe(twoDust, new ItemStack(Material.GRANITE, 4))
                .energyPerTick(240).register(plugin);

        RandomizedItemStack sixtyFourDust = new RandomizedItemStack(
                new SlimefunItemStack(SlimefunItems.COPPER_DUST, 64),
                new SlimefunItemStack(SlimefunItems.ZINC_DUST, 64),
                new SlimefunItemStack(SlimefunItems.TIN_DUST, 64),
                new SlimefunItemStack(SlimefunItems.ALUMINUM_DUST, 64),
                new SlimefunItemStack(SlimefunItems.LEAD_DUST, 64),
                new SlimefunItemStack(SlimefunItems.SILVER_DUST, 64),
                new SlimefunItemStack(SlimefunItems.GOLD_DUST, 64),
                new SlimefunItemStack(SlimefunItems.IRON_DUST, 64),
                new SlimefunItemStack(SlimefunItems.MAGNESIUM_DUST, 64)
        );
        new MachineBlock(Groups.INFINITY_CHEAT, INFINITY_DUST_EXTRACTOR, InfinityWorkbench.TYPE, new ItemStack[] {
                Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT,
                Materials.VOID_INGOT, Materials.INFINITE_INGOT, Materials.INFINITE_CIRCUIT, Materials.INFINITE_CIRCUIT, Materials.INFINITE_INGOT, Materials.VOID_INGOT,
                Materials.VOID_INGOT, Materials.INFINITE_INGOT, DUST_EXTRACTOR, DUST_EXTRACTOR, Materials.INFINITE_INGOT, Materials.VOID_INGOT,
                Materials.VOID_INGOT, Materials.INFINITE_INGOT, DUST_EXTRACTOR, DUST_EXTRACTOR, Materials.INFINITE_INGOT, Materials.VOID_INGOT,
                Materials.VOID_INGOT, Materials.INFINITE_INGOT, DUST_EXTRACTOR, DUST_EXTRACTOR, Materials.INFINITE_INGOT, Materials.VOID_INGOT,
                Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT,
        }).addRecipe(sixtyFourDust, new ItemStack(Material.COBBLESTONE, 64))
                .addRecipe(sixtyFourDust, new ItemStack(Material.ANDESITE, 64))
                .addRecipe(sixtyFourDust, new ItemStack(Material.STONE, 64))
                .addRecipe(sixtyFourDust, new ItemStack(Material.DIORITE, 64))
                .addRecipe(sixtyFourDust, new ItemStack(Material.GRANITE, 64))
                .ticksPerOutput(1).energyPerTick(7200).register(plugin);

        new MachineBlock(Groups.ADVANCED_MACHINES, COBBLE_PRESS, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                Materials.MACHINE_PLATE, Materials.COBBLE_3, Materials.MACHINE_PLATE,
                SlimefunItems.ELECTRIC_PRESS_2, SlimefunItems.ELECTRIC_PRESS_2, SlimefunItems.ELECTRIC_PRESS_2,
                Materials.MACHINE_PLATE, Materials.COBBLE_3, Materials.MACHINE_PLATE
        }).addRecipe(new SlimefunItemStack(Materials.COBBLE_1, 1), new ItemStack(Material.COBBLESTONE, 8))
                .addRecipe(new SlimefunItemStack(Materials.COBBLE_2, 1), new SlimefunItemStack(Materials.COBBLE_1, 8))
                .addRecipe(new SlimefunItemStack(Materials.COBBLE_3, 1), new SlimefunItemStack(Materials.COBBLE_2, 8))
                .addRecipe(new SlimefunItemStack(Materials.COBBLE_4, 1), new SlimefunItemStack(Materials.COBBLE_3, 8))
                .addRecipe(new SlimefunItemStack(Materials.COBBLE_5, 1), new SlimefunItemStack(Materials.COBBLE_4, 9))
                .ticksPerOutput(1).energyPerTick(120).register(plugin);

        new MachineBlock(Groups.ADVANCED_MACHINES, INGOT_FORMER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SlimefunItems.ELECTRIC_INGOT_FACTORY_2, SlimefunItems.ELECTRIC_INGOT_FACTORY_2, SlimefunItems.ELECTRIC_INGOT_FACTORY_2,
                SlimefunItems.ELECTRIC_INGOT_FACTORY_2, SlimefunItems.ELECTRIC_INGOT_FACTORY_2, SlimefunItems.ELECTRIC_INGOT_FACTORY_2,
                Materials.MACHINE_CIRCUIT, Materials.MACHINE_CORE, Materials.MACHINE_CIRCUIT,
        }).addRecipe(new SlimefunItemStack(SlimefunItems.COPPER_INGOT, 8), new SlimefunItemStack(SlimefunItems.COPPER_DUST, 8))
                .addRecipe(new SlimefunItemStack(SlimefunItems.ZINC_INGOT, 8), new SlimefunItemStack(SlimefunItems.ZINC_DUST, 8))
                .addRecipe(new SlimefunItemStack(SlimefunItems.TIN_INGOT, 8), new SlimefunItemStack(SlimefunItems.TIN_DUST, 8))
                .addRecipe(new SlimefunItemStack(SlimefunItems.ALUMINUM_INGOT, 8), new SlimefunItemStack(SlimefunItems.ALUMINUM_DUST, 8))
                .addRecipe(new SlimefunItemStack(SlimefunItems.LEAD_INGOT, 8), new SlimefunItemStack(SlimefunItems.LEAD_DUST, 8))
                .addRecipe(new SlimefunItemStack(SlimefunItems.SILVER_INGOT, 8), new SlimefunItemStack(SlimefunItems.SILVER_DUST, 8))
                .addRecipe(new SlimefunItemStack(SlimefunItems.GOLD_24K, 1), new SlimefunItemStack(SlimefunItems.GOLD_DUST, 8))
                .addRecipe(new ItemStack(Material.IRON_INGOT, 8), new SlimefunItemStack(SlimefunItems.IRON_DUST, 8))
                .addRecipe(new SlimefunItemStack(SlimefunItems.MAGNESIUM_INGOT, 8), new SlimefunItemStack(SlimefunItems.MAGNESIUM_DUST, 8))
                .ticksPerOutput(1).energyPerTick(240).register(plugin);

        new MachineBlock(Groups.INFINITY_CHEAT, INFINITY_INGOT_FORMER, InfinityWorkbench.TYPE, new ItemStack[] {
                Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT,
                Materials.VOID_INGOT, Materials.INFINITE_INGOT, Materials.INFINITE_CIRCUIT, Materials.INFINITE_CIRCUIT, Materials.INFINITE_INGOT, Materials.VOID_INGOT,
                Materials.VOID_INGOT, Materials.INFINITE_INGOT, INGOT_FORMER, INGOT_FORMER, Materials.INFINITE_INGOT, Materials.VOID_INGOT,
                Materials.VOID_INGOT, Materials.INFINITE_INGOT, INGOT_FORMER, INGOT_FORMER, Materials.INFINITE_INGOT, Materials.VOID_INGOT,
                Materials.VOID_INGOT, Materials.INFINITE_INGOT, INGOT_FORMER, INGOT_FORMER, Materials.INFINITE_INGOT, Materials.VOID_INGOT,
                Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT, Materials.VOID_INGOT,
        }).addRecipe(new SlimefunItemStack(SlimefunItems.COPPER_INGOT, 64), new SlimefunItemStack(SlimefunItems.COPPER_DUST, 64))
                .addRecipe(new SlimefunItemStack(SlimefunItems.ZINC_INGOT, 64), new SlimefunItemStack(SlimefunItems.ZINC_DUST, 64))
                .addRecipe(new SlimefunItemStack(SlimefunItems.TIN_INGOT, 64), new SlimefunItemStack(SlimefunItems.TIN_DUST, 64))
                .addRecipe(new SlimefunItemStack(SlimefunItems.ALUMINUM_INGOT, 64), new SlimefunItemStack(SlimefunItems.ALUMINUM_DUST, 64))
                .addRecipe(new SlimefunItemStack(SlimefunItems.LEAD_INGOT, 64), new SlimefunItemStack(SlimefunItems.LEAD_DUST, 64))
                .addRecipe(new SlimefunItemStack(SlimefunItems.SILVER_INGOT, 64), new SlimefunItemStack(SlimefunItems.SILVER_DUST, 64))
                .addRecipe(new SlimefunItemStack(SlimefunItems.GOLD_24K, 8), new SlimefunItemStack(SlimefunItems.GOLD_DUST, 64))
                .addRecipe(new ItemStack(Material.IRON_INGOT, 64), new SlimefunItemStack(SlimefunItems.IRON_DUST, 64))
                .addRecipe(new SlimefunItemStack(SlimefunItems.MAGNESIUM_INGOT, 64), new SlimefunItemStack(SlimefunItems.MAGNESIUM_DUST, 64))
                .ticksPerOutput(1).energyPerTick(7200).register(plugin);

        new MachineBlock(Groups.ADVANCED_MACHINES, URANIUM_EXTRACTOR, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SlimefunItems.ELECTRIC_ORE_GRINDER_2, SlimefunItems.ELECTRIC_ORE_GRINDER_2, SlimefunItems.ELECTRIC_ORE_GRINDER_2,
                SlimefunItems.ELECTRIC_GOLD_PAN_3, SlimefunItems.ELECTRIC_DUST_WASHER_3, SlimefunItems.ENHANCED_AUTO_CRAFTER,
                Materials.MACHINE_CIRCUIT, Materials.MACHINE_CORE, Materials.MACHINE_CIRCUIT,
        }).addRecipe(SlimefunItems.SMALL_URANIUM, new ItemStack(Material.COBBLESTONE, 4))
                .addRecipe(SlimefunItems.SMALL_URANIUM, new ItemStack(Material.ANDESITE, 4))
                .addRecipe(SlimefunItems.SMALL_URANIUM, new ItemStack(Material.STONE, 4))
                .addRecipe(SlimefunItems.SMALL_URANIUM, new ItemStack(Material.DIORITE, 4))
                .addRecipe(SlimefunItems.SMALL_URANIUM, new ItemStack(Material.GRANITE, 4))
                .ticksPerOutput(1).energyPerTick(240).register(plugin);

        new MachineBlock(Groups.ADVANCED_MACHINES, DECOMPRESSOR, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                Materials.MAGSTEEL_PLATE, Materials.MAGSTEEL_PLATE, Materials.MAGSTEEL_PLATE,
                new ItemStack(Material.STICKY_PISTON), SlimefunItems.ELECTRIC_PRESS_2, new ItemStack(Material.STICKY_PISTON),
                Materials.MACHINE_CIRCUIT, Materials.MACHINE_CORE, Materials.MACHINE_CIRCUIT,
        }).addRecipe(new ItemStack(Material.EMERALD, 9), new ItemStack(Material.EMERALD_BLOCK))
                .addRecipe(new ItemStack(Material.DIAMOND, 9), new ItemStack(Material.DIAMOND_BLOCK))
                .addRecipe(new ItemStack(Material.GOLD_INGOT, 9), new ItemStack(Material.GOLD_BLOCK))
                .addRecipe(new ItemStack(Material.IRON_INGOT, 9), new ItemStack(Material.IRON_BLOCK))
                .addRecipe(new ItemStack(Material.NETHERITE_INGOT, 9), new ItemStack(Material.NETHERITE_BLOCK))
                .addRecipe(new ItemStack(Material.REDSTONE, 9), new ItemStack(Material.REDSTONE_BLOCK))
                .addRecipe(new ItemStack(Material.QUARTZ, 4), new ItemStack(Material.QUARTZ_BLOCK))
                .addRecipe(new ItemStack(Material.LAPIS_LAZULI, 9), new ItemStack(Material.LAPIS_BLOCK))
                .addRecipe(new ItemStack(Material.COAL, 9), new ItemStack(Material.COAL_BLOCK))
				.addRecipe(new ItemStack(Material.PAPER, 8), new SlimefunItemStack(Materials.FIBRE_BLOCK, 1))
                .addRecipe(new SlimefunItemStack(Materials.FIBRE, 6), new ItemStack(Material.OAK_LOG, 1))
				.addRecipe(new SlimefunItemStack(Materials.FIBRE, 6), new ItemStack(Material.SPRUCE_LOG, 1))
				.addRecipe(new SlimefunItemStack(Materials.FIBRE, 6), new ItemStack(Material.DARK_OAK_LOG, 1))
				.addRecipe(new SlimefunItemStack(Materials.FIBRE, 6), new ItemStack(Material.BIRCH_LOG, 1))
				.addRecipe(new SlimefunItemStack(Materials.FIBRE, 6), new ItemStack(Material.ACACIA_LOG, 1))
				.addRecipe(new SlimefunItemStack(Materials.FIBRE, 6), new ItemStack(Material.JUNGLE_LOG, 1))
				.addRecipe(new SlimefunItemStack(Materials.FIBRE, 3), new ItemStack(Material.MUSHROOM_STEM, 1))
				.addRecipe(new ItemStack(Material.LEATHER, 6), new SlimefunItemStack(Materials.FEATHER_MASS, 1))
                .addRecipe(new SlimefunItemStack(Materials.COBBLE_4, 8), Materials.COBBLE_5)
                .addRecipe(new SlimefunItemStack(Materials.COBBLE_3, 8), Materials.COBBLE_4)
                .addRecipe(new SlimefunItemStack(Materials.COBBLE_2, 8), Materials.COBBLE_3)
                .addRecipe(new SlimefunItemStack(Materials.COBBLE_1, 8), Materials.COBBLE_2)
                .addRecipe(new ItemStack(Material.COBBLESTONE, 8), Materials.COBBLE_1)
				.addRecipe(new ItemStack(Material.APPLE, 64), Materials.APPLE_MASS)
				.addRecipe(new ItemStack(Material.GOLDEN_APPLE, 64), Materials.GOLDEN_APPLE_MASS)
				.addRecipe(new ItemStack(Material.ENCHANTED_GOLDEN_APPLE, 64), Materials.ENCHANTED_APPLE_MASS)
                .ticksPerOutput(1).energyPerTick(60).register(plugin);

		new MachineBlock(Groups.ADVANCED_MACHINES, BIO_DIGESTION, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {    //		酵解机
                SlimefunItems.BLISTERING_INGOT_3, SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.BLISTERING_INGOT_3,
                new ItemStack(Material.MYCELIUM), new ItemStack(Material.BREWING_STAND), new ItemStack(Material.MYCELIUM),
                Materials.MACHINE_CIRCUIT, Materials.MACHINE_CORE, Materials.MACHINE_CIRCUIT,
        }).addRecipe(new SlimefunItemStack(Materials.BIO_MASS, 1), new ItemStack(Material.APPLE, 6))
                .addRecipe(new SlimefunItemStack(Materials.BIO_MASS, 1), new ItemStack(Material.POTATO, 6))
				.addRecipe(new SlimefunItemStack(Materials.BIO_MASS, 1), new ItemStack(Material.BAKED_POTATO, 6))
				.addRecipe(new SlimefunItemStack(Materials.BIO_MASS, 1), new ItemStack(Material.BEETROOT, 6))
				.addRecipe(new SlimefunItemStack(Materials.BIO_MASS, 1), new ItemStack(Material.BREAD, 3))
				.addRecipe(new SlimefunItemStack(Materials.BIO_MASS, 1), new ItemStack(Material.CARROT, 9))
				.addRecipe(new SlimefunItemStack(Materials.BIO_MASS, 1), new ItemStack(Material.BEEF, 3))
				.addRecipe(new SlimefunItemStack(Materials.BIO_MASS, 1), new ItemStack(Material.COOKED_BEEF, 3))
				.addRecipe(new SlimefunItemStack(Materials.BIO_MASS, 1), new ItemStack(Material.CHICKEN, 3))
				.addRecipe(new SlimefunItemStack(Materials.BIO_MASS, 1), new ItemStack(Material.COOKED_CHICKEN, 3))
				.addRecipe(new SlimefunItemStack(Materials.BIO_MASS, 1), new ItemStack(Material.MUTTON, 3))
				.addRecipe(new SlimefunItemStack(Materials.BIO_MASS, 1), new ItemStack(Material.COOKED_MUTTON, 3))
				.addRecipe(new SlimefunItemStack(Materials.BIO_MASS, 1), new ItemStack(Material.MELON_SLICE, 8))
				.addRecipe(new SlimefunItemStack(Materials.BIO_MASS, 1), new ItemStack(Material.GLOW_BERRIES, 9))
				.addRecipe(new SlimefunItemStack(Materials.BIO_MASS, 1), new ItemStack(Material.SWEET_BERRIES, 9))
				.addRecipe(new SlimefunItemStack(Materials.BIO_MASS, 1), new ItemStack(Material.DRIED_KELP, 9))
				.addRecipe(new SlimefunItemStack(Materials.BIO_MASS, 1), new ItemStack(Material.KELP, 9))
				.addRecipe(new SlimefunItemStack(Materials.BIO_MASS, 1), new ItemStack(Material.DRIED_KELP_BLOCK, 1))
				.addRecipe(new SlimefunItemStack(Materials.BIO_MASS, 1), new ItemStack(Material.BROWN_MUSHROOM, 15))
				.addRecipe(new SlimefunItemStack(Materials.BIO_MASS, 1), new ItemStack(Material.BROWN_MUSHROOM_BLOCK, 6))
				.addRecipe(new SlimefunItemStack(Materials.BIO_MASS, 1), new ItemStack(Material.RED_MUSHROOM, 15))
				.addRecipe(new SlimefunItemStack(Materials.BIO_MASS, 1), new ItemStack(Material.RED_MUSHROOM_BLOCK, 6))
				.addRecipe(new SlimefunItemStack(Materials.BIO_MASS, 1), new ItemStack(Material.COD, 6))
				.addRecipe(new SlimefunItemStack(Materials.BIO_MASS, 1), new ItemStack(Material.SALMON, 6))
				.addRecipe(new SlimefunItemStack(Materials.BIO_MASS, 1), new ItemStack(Material.ROTTEN_FLESH, 6))
				.addRecipe(new SlimefunItemStack(Materials.BIO_MASS, 1), new SlimefunItemStack(Materials.FIBRE, 6))
				.addRecipe(new SlimefunItemStack(Materials.BIO_MASS, 1), new SlimefunItemStack(Materials.FIBRE_BLOCK, 1))
				.addRecipe(new SlimefunItemStack(Materials.BIO_MASS, 1), new ItemStack(Material.TROPICAL_FISH, 6))
				.addRecipe(new SlimefunItemStack(Materials.BIO_MASS, 1), new ItemStack(Material.RABBIT, 6))
				.addRecipe(new SlimefunItemStack(Materials.BIO_MASS, 1), new ItemStack(Material.COOKED_RABBIT, 6))
				.addRecipe(new SlimefunItemStack(Materials.BIO_MASS, 1), new ItemStack(Material.GOLDEN_APPLE, 3))
				.addRecipe(new SlimefunItemStack(Materials.BIO_MASS, 1), new ItemStack(Material.ENCHANTED_GOLDEN_APPLE, 1))
				.addRecipe(new SlimefunItemStack(Materials.BIO_MASS, 1), new ItemStack(Material.HONEY_BOTTLE, 4))
				.addRecipe(new SlimefunItemStack(Materials.BIO_MASS, 1), new ItemStack(Material.HONEY_BLOCK, 1))
				.addRecipe(new SlimefunItemStack(Materials.BIO_MASS, 1), new ItemStack(Material.SUGAR, 12))
				.addRecipe(new SlimefunItemStack(Materials.BIO_MASS, 1), new ItemStack(Material.SUGAR_CANE, 9))
				.addRecipe(new SlimefunItemStack(Materials.BIO_MASS, 1), new ItemStack(Material.BAMBOO, 9))
				.addRecipe(new SlimefunItemStack(Materials.BIO_MASS, 1), new ItemStack(Material.BAMBOO_SAPLING, 9))
				.addRecipe(new SlimefunItemStack(Materials.BIO_MASS, 1), new ItemStack(Material.CACTUS, 9))
				.addRecipe(new SlimefunItemStack(Materials.BIO_MASS, 1), new ItemStack(Material.WHEAT, 9))
				.addRecipe(new SlimefunItemStack(Materials.BIO_MASS, 1), new ItemStack(Material.HAY_BLOCK, 1))
				.addRecipe(new SlimefunItemStack(Materials.BIO_MASS, 1), new ItemStack(Material.EGG, 6))
				.addRecipe(new SlimefunItemStack(SlimefunItems.OIL_BUCKET, 1), new SlimefunItemStack(Materials.BIO_MASS, 8))
				.ticksPerOutput(1).energyPerTick(60).register(plugin);




        new GearTransformer(Groups.ADVANCED_MACHINES, GEAR_TRANSFORMER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                Materials.MAGSTEEL_PLATE, Materials.MACHINE_CIRCUIT, Materials.MAGSTEEL_PLATE,
                Materials.MACHINE_CIRCUIT, new ItemStack(Material.SMITHING_TABLE), Materials.MACHINE_CIRCUIT,
                Materials.MAGSTEEL_PLATE, Materials.MACHINE_CIRCUIT, Materials.MAGSTEEL_PLATE
        }, GEAR_TRANSFORMER_ENERGY).register(plugin);

        new GeoQuarry(Groups.ADVANCED_MACHINES, GEO_QUARRY, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                Materials.MACHINE_PLATE, Materials.VOID_INGOT, Materials.MACHINE_PLATE,
                Materials.VOID_INGOT, SlimefunExtension.ADVANCED_GEO_MINER, Materials.VOID_INGOT,
                Materials.MACHINE_PLATE, Materials.VOID_INGOT, Materials.MACHINE_PLATE,
        }).ticksPerOutput(GEO_QUARRY_INTERVAL).energyPerTick(GEO_QUARRY_ENERGY).register(plugin);
    }

    private static final class RandomizedItemStack extends ItemStack {

        private final ItemStack[] items;

        public RandomizedItemStack(ItemStack... outputs) {
            super(outputs[0]);
            this.items = outputs;
        }

        @Nonnull
        @Override
        public ItemStack clone() {
            return this.items[ThreadLocalRandom.current().nextInt(this.items.length)].clone();
        }

    }

}
