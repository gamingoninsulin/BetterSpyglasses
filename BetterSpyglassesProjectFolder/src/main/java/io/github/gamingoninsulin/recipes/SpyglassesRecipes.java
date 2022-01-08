package io.github.gamingoninsulin.recipes;


import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

public class SpyglassesRecipes {

    public static ItemStack CoalSpyglass;
    public static ItemStack LapisSpyglass;
    public static ItemStack QuartzSpyglass;
    public static ItemStack IronSpyglass;
    public static ItemStack GoldSpyglass;
    public static ItemStack DiamondSpyglass;
    public static ItemStack NetheriteSpyglass;
    public static ItemStack EmeraldSpyglass;
    public static ItemStack AmethystSpyglass;
    public static ItemStack CopperSpyglass;

    // declaration for NamespacedKeys
    static NamespacedKey NSKCoal = NamespacedKey.minecraft("better_spyglass_coal");
    static NamespacedKey NSKLapis = NamespacedKey.minecraft("better_spyglass_lapis");
    static NamespacedKey NSKQuartz = NamespacedKey.minecraft("better_spyglass_quartz");
    static NamespacedKey NSKCopper = NamespacedKey.minecraft("better_spyglass_copper");
    static NamespacedKey NSKIron = NamespacedKey.minecraft("better_spyglass_iron");
    static NamespacedKey NSKGold = NamespacedKey.minecraft("better_spyglass_gold");
    static NamespacedKey NSKDiamond = NamespacedKey.minecraft("better_spyglass_diamond");
    static NamespacedKey NSKNetherite = NamespacedKey.minecraft("better_spyglass_netherite");
    static NamespacedKey NSKEmerald = NamespacedKey.minecraft("better_spyglass_emerald");
    static NamespacedKey NSKAmethyst = NamespacedKey.minecraft("better_spyglass_amethyst");

    public static void init() {
        createCoalSpyglass();
        createLapisSpyglass();
        createQuartzSpyglass();
        createIronSpyglass();
        createGoldSpyglass();
        createDiamondSpyglass();
        createNetheriteSpyglass();
        createEmeraldSpyglass();
        createAmethystSpyglass();
        createCopperSpyglass();
    }

    // coal spyglass
    public static void createCoalSpyglass() {
        ItemStack CoalStack = new ItemStack(Material.SPYGLASS);
        CoalStack.addUnsafeEnchantment(Enchantment.DURABILITY, 1);
        ItemMeta CoalMeta = CoalStack.getItemMeta();
        // color of a light-ish coal
        CoalMeta.setDisplayName(ChatColor.of("#6d7280") + "Coal spyglass");
        CoalStack.setItemMeta(CoalMeta);

        // Quartz Spyglass Recipe
        ShapedRecipe CoalRecipe = new ShapedRecipe(NSKCoal, CoalStack);
        CoalRecipe.shape(
                "CCC",
                "CSC",
                "CCC"
        );

        CoalRecipe.setIngredient('C', Material.COAL);
        CoalRecipe.setIngredient('S', Material.SPYGLASS);

        Bukkit.addRecipe(CoalRecipe);
        CoalSpyglass = CoalStack;
    }

    // lapis spyglass
    public static void createLapisSpyglass() {
        ItemStack LapisStack = new ItemStack(Material.SPYGLASS);
        LapisStack.addUnsafeEnchantment(Enchantment.DURABILITY, 1);
        ItemMeta LapisMeta = LapisStack.getItemMeta();
        // color of lapis lazuli
        LapisMeta.setDisplayName(ChatColor.of("#1761ab") + "Lapis spyglass");
        LapisStack.setItemMeta(LapisMeta);

        // Quartz Spyglass Recipe
        ShapedRecipe LapisRecipe = new ShapedRecipe(NSKLapis, LapisStack);
        LapisRecipe.shape(
                "LLL",
                "LSL",
                "LLL"
        );

        LapisRecipe.setIngredient('L', Material.LAPIS_LAZULI);
        LapisRecipe.setIngredient('S', Material.SPYGLASS);

        Bukkit.addRecipe(LapisRecipe);
        LapisSpyglass = LapisStack;
    }

    // quartz spyglass
    public static void createQuartzSpyglass() {
        ItemStack QuartzStack = new ItemStack(Material.SPYGLASS);
        QuartzStack.addUnsafeEnchantment(Enchantment.DURABILITY, 1);
        ItemMeta QuartzMeta = QuartzStack.getItemMeta();
        // color of quartz
        QuartzMeta.setDisplayName(ChatColor.of("#DCDCE8") + "Quartz spyglass");
        QuartzStack.setItemMeta(QuartzMeta);

        // Quartz Spyglass Recipe
        ShapedRecipe QuartzRecipe = new ShapedRecipe(NSKQuartz, QuartzStack);
        QuartzRecipe.shape(
                "QQQ",
                "QSQ",
                "QQQ"
        );

        QuartzRecipe.setIngredient('Q', Material.QUARTZ);
        QuartzRecipe.setIngredient('S', Material.SPYGLASS);

        Bukkit.addRecipe(QuartzRecipe);
        QuartzSpyglass = QuartzStack;
    }

    // Copper spyglass
    public static void createCopperSpyglass() {
        ItemStack CopperStack = new ItemStack(Material.SPYGLASS);
        CopperStack.addUnsafeEnchantment(Enchantment.DURABILITY, 1);
        ItemMeta CopperMeta = CopperStack.getItemMeta();
        //color of copper
        CopperMeta.setDisplayName(ChatColor.of("#B87333") + "Copper Spyglass");
        CopperStack.setItemMeta(CopperMeta);

        // Iron Spyglass Recipe
        ShapedRecipe CopperRecipe = new ShapedRecipe(NSKCopper, CopperStack);
        CopperRecipe.shape(
                "CCC",
                "CSC",
                "CCC"
        );

        CopperRecipe.setIngredient('C', Material.COPPER_INGOT);
        CopperRecipe.setIngredient('S', Material.SPYGLASS);

        Bukkit.addRecipe(CopperRecipe);
        CopperSpyglass = CopperStack;
    }

    // iron spyglass
    public static void createIronSpyglass() {
        ItemStack IronStack = new ItemStack(Material.SPYGLASS);
        IronStack.addUnsafeEnchantment(Enchantment.DURABILITY, 1);
        ItemMeta IronMeta = IronStack.getItemMeta();
        // color of iron
        IronMeta.setDisplayName(ChatColor.of("#a19d94") + "Iron Spyglass");
        IronStack.setItemMeta(IronMeta);

        // Iron Spyglass Recipe
        ShapedRecipe IronRecipe = new ShapedRecipe(NSKIron, IronStack);
        IronRecipe.shape(
                "III",
                "ISI",
                "III"
        );

        IronRecipe.setIngredient('I', Material.IRON_INGOT);
        IronRecipe.setIngredient('S', Material.SPYGLASS);

        Bukkit.addRecipe(IronRecipe);
        IronSpyglass = IronStack;
    }

    // gold spyglass
    public static void createGoldSpyglass() {
        ItemStack GoldStack = new ItemStack(Material.SPYGLASS);
        GoldStack.addUnsafeEnchantment(Enchantment.DURABILITY, 1);
        ItemMeta GoldMeta = GoldStack.getItemMeta();
        // color of gold
        GoldMeta.setDisplayName(ChatColor.of("#cccc33") + "Gold Spyglass");
        GoldStack.setItemMeta(GoldMeta);

        // Gold Spyglass Recipe
        ShapedRecipe GoldRecipe = new ShapedRecipe(NSKGold, GoldStack);
        GoldRecipe.shape(
                "GGG",
                "GSG",
                "GGG"
        );

        GoldRecipe.setIngredient('G', Material.GOLD_INGOT);
        GoldRecipe.setIngredient('S', Material.SPYGLASS);

        Bukkit.addRecipe(GoldRecipe);
        GoldSpyglass = GoldStack;
    }

    // diamond spyglass
    public static void createDiamondSpyglass() {
        ItemStack DiamondStack = new ItemStack(Material.SPYGLASS);
        DiamondStack.addUnsafeEnchantment(Enchantment.DURABILITY, 1);
        ItemMeta DiamondMeta = DiamondStack.getItemMeta();
        // color of a diamond
        DiamondMeta.setDisplayName(ChatColor.of("#008598") + "Diamond Spyglass");
        DiamondStack.setItemMeta(DiamondMeta);

        // Diamond Spyglass Recipe
        ShapedRecipe DiamondRecipe = new ShapedRecipe(NSKDiamond, DiamondStack);
        DiamondRecipe.shape(
                "DDD",
                "DSD",
                "DDD"
        );

        DiamondRecipe.setIngredient('D', Material.DIAMOND);
        DiamondRecipe.setIngredient('S', Material.SPYGLASS);

        Bukkit.addRecipe(DiamondRecipe);
        DiamondSpyglass = DiamondStack;
    }

    // netherite spyglass
    public static void createNetheriteSpyglass() {
        ItemStack NetheriteStack = new ItemStack(Material.SPYGLASS);
        NetheriteStack.addUnsafeEnchantment(Enchantment.DURABILITY, 1);
        ItemMeta NetheriteMeta = NetheriteStack.getItemMeta();
        // color of netherite
        NetheriteMeta.setDisplayName(ChatColor.of("#FFFF00") + "Netherite Spyglass");
        NetheriteStack.setItemMeta(NetheriteMeta);

        // Netherite Spyglass Recipe
        ShapedRecipe NetheriteRecipe = new ShapedRecipe(NSKNetherite, NetheriteStack);
        NetheriteRecipe.shape(
                "NNN",
                "NSN",
                "NNN"
        );


        NetheriteRecipe.setIngredient('N', Material.NETHERITE_SCRAP);
        NetheriteRecipe.setIngredient('S', Material.SPYGLASS);

        Bukkit.addRecipe(NetheriteRecipe);
        NetheriteSpyglass = NetheriteStack;
    }

    // Emerald spyglass
    public static void createEmeraldSpyglass() {
        ItemStack EmeraldStack = new ItemStack(Material.SPYGLASS);
        EmeraldStack.addUnsafeEnchantment(Enchantment.DURABILITY, 1);
        ItemMeta EmeraldMeta = EmeraldStack.getItemMeta();
        // color of emerald
        EmeraldMeta.setDisplayName(ChatColor.of("#50c878") + "Emerald Spyglass");
        EmeraldStack.setItemMeta(EmeraldMeta);

        // Emerald Spyglass Recipe
        ShapedRecipe EmeraldRecipe = new ShapedRecipe(NSKEmerald, EmeraldStack);
        EmeraldRecipe.shape(
                "EEE",
                "ESE",
                "EEE"
        );


        EmeraldRecipe.setIngredient('E', Material.EMERALD);
        EmeraldRecipe.setIngredient('S', Material.SPYGLASS);

        Bukkit.addRecipe(EmeraldRecipe);
        EmeraldSpyglass = EmeraldStack;
    }

    // amethyst spyglass
    public static void createAmethystSpyglass() {
        ItemStack AmethystStack = new ItemStack(Material.SPYGLASS);
        AmethystStack.addUnsafeEnchantment(Enchantment.DURABILITY, 1);
        ItemMeta AmethystMeta = AmethystStack.getItemMeta();
        // color of amethyst
        AmethystMeta.setDisplayName(ChatColor.of("#9966cc") + "Amethyst Spyglass");
        AmethystStack.setItemMeta(AmethystMeta);

        // Amethyst Spyglass Recipe
        ShapedRecipe AmethystRecipe = new ShapedRecipe(NSKAmethyst, AmethystStack);
        AmethystRecipe.shape(
                "AAA",
                "ASA",
                "AAA"
        );


        AmethystRecipe.setIngredient('A', Material.AMETHYST_SHARD);
        AmethystRecipe.setIngredient('S', Material.SPYGLASS);

        Bukkit.addRecipe(AmethystRecipe);
        AmethystSpyglass = AmethystStack;
    }
}
