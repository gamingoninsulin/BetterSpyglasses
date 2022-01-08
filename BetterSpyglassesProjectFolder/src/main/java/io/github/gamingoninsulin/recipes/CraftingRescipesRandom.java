package io.github.gamingoninsulin.recipes;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;

public class CraftingRescipesRandom {

    public static ShapelessRecipe AmethystToBlock;
    public static ShapelessRecipe QuartzToBlock;

    public static ShapedRecipe LogToStick1;
    public static ShapedRecipe LogToStick2;
    public static ShapedRecipe LogToStick3;
    public static ShapedRecipe LogToStick4;
    public static ShapedRecipe LogToStick5;
    public static ShapedRecipe LogToStick6;
    public static ShapedRecipe StrippedLogToStick1;
    public static ShapedRecipe StrippedLogToStick2;
    public static ShapedRecipe StrippedLogToStick3;
    public static ShapedRecipe StrippedLogToStick4;
    public static ShapedRecipe StrippedLogToStick5;
    public static ShapedRecipe StrippedLogToStick6;

    static NamespacedKey NSKAmethystConvert = NamespacedKey.minecraft("convert_amethyst_block");
    static NamespacedKey NSKQuartzConvert = NamespacedKey.minecraft("convert_quartz_block");

    static NamespacedKey NSKLogConvert1 = NamespacedKey.minecraft("convert_log_block1");
    static NamespacedKey NSKLogConvert2 = NamespacedKey.minecraft("convert_log_block2");
    static NamespacedKey NSKLogConvert3 = NamespacedKey.minecraft("convert_log_block3");
    static NamespacedKey NSKLogConvert4 = NamespacedKey.minecraft("convert_log_bloc4");
    static NamespacedKey NSKLogConvert5 = NamespacedKey.minecraft("convert_log_block5");
    static NamespacedKey NSKLogConvert6 = NamespacedKey.minecraft("convert_log_block6");

    static NamespacedKey NSKStrippedLogConvert1 = NamespacedKey.minecraft("convert_stripped_log_block1");
    static NamespacedKey NSKStrippedLogConvert2 = NamespacedKey.minecraft("convert_stripped_log_block2");
    static NamespacedKey NSKStrippedLogConvert3 = NamespacedKey.minecraft("convert_stripped_log_block3");
    static NamespacedKey NSKStrippedLogConvert4 = NamespacedKey.minecraft("convert_stripped_log_bloc4");
    static NamespacedKey NSKStrippedLogConvert5 = NamespacedKey.minecraft("convert_stripped_log_block5");
    static NamespacedKey NSKStrippedLogConvert6 = NamespacedKey.minecraft("convert_stripped_log_block6");

    public static void init() {
        createAmethystToBlock();
        createQuartzToBlock();
        createLogtoSticks1();
        createLogtoSticks2();
        createLogtoSticks3();
        createLogtoSticks4();
        createLogtoSticks5();
        createLogtoSticks6();
        createStrippedLogtoSticks1();
        createStrippedLogtoSticks2();
        createStrippedLogtoSticks3();
        createStrippedLogtoSticks4();
        createStrippedLogtoSticks5();
        createStrippedLogtoSticks6();


    }

    public static void createQuartzToBlock() {
        ShapelessRecipe QuartzConvert = new ShapelessRecipe(NSKQuartzConvert, new ItemStack(Material.QUARTZ, 4));

        QuartzConvert.addIngredient(Material.QUARTZ_BLOCK);

        Bukkit.addRecipe(QuartzConvert);
        QuartzToBlock = QuartzConvert;
    }

    public static void createAmethystToBlock() {
        ShapelessRecipe AmethystConvert = new ShapelessRecipe(NSKAmethystConvert, new ItemStack(Material.AMETHYST_CLUSTER, 4));

        AmethystConvert.addIngredient(Material.AMETHYST_BLOCK);

        Bukkit.addRecipe(AmethystConvert);
        AmethystToBlock = AmethystConvert;
    }
    //#### NORMAL LOGS
    // oak log
    public static void createLogtoSticks1(){
        ShapedRecipe LogConvert1 = new ShapedRecipe(NSKLogConvert1, new ItemStack(Material.STICK, 16));
        LogConvert1.shape(
                "L",
                "L"
        );

        LogConvert1.setIngredient('L',Material.OAK_LOG);
        Bukkit.addRecipe(LogConvert1);
        LogToStick1 = LogConvert1;
    }

    // birch log
    public static void createLogtoSticks2(){
        ShapedRecipe LogConvert2 = new ShapedRecipe(NSKLogConvert2, new ItemStack(Material.STICK, 16));
        LogConvert2.shape(
                "L",
                "L"
        );

        LogConvert2.setIngredient('L',Material.BIRCH_LOG);
        Bukkit.addRecipe(LogConvert2);
        LogToStick2 = LogConvert2;
    }

    // acacia log
    public static void createLogtoSticks3(){
        ShapedRecipe LogConvert3 = new ShapedRecipe(NSKLogConvert3, new ItemStack(Material.STICK, 16));
        LogConvert3.shape(
                "L",
                "L"
        );

        LogConvert3.setIngredient('L',Material.ACACIA_LOG);
        Bukkit.addRecipe(LogConvert3);
        LogToStick3 = LogConvert3;
    }

    // spruce log
    public static void createLogtoSticks4(){
        ShapedRecipe LogConvert4 = new ShapedRecipe(NSKLogConvert4, new ItemStack(Material.STICK, 16));
        LogConvert4.shape(
                "L",
                "L"
        );

        LogConvert4.setIngredient('L',Material.SPRUCE_LOG);
        Bukkit.addRecipe(LogConvert4);
        LogToStick4 = LogConvert4;
    }

    // jungle log
    public static void createLogtoSticks5(){
        ShapedRecipe LogConvert5 = new ShapedRecipe(NSKLogConvert5, new ItemStack(Material.STICK, 16));
        LogConvert5.shape(
                "L",
                "L"
        );

        LogConvert5.setIngredient('L',Material.JUNGLE_LOG);
        Bukkit.addRecipe(LogConvert5);
        LogToStick5 = LogConvert5;
    }

    // dark oak log
    public static void createLogtoSticks6(){
        ShapedRecipe LogConvert6 = new ShapedRecipe(NSKLogConvert6, new ItemStack(Material.STICK, 16));
        LogConvert6.shape(
                "L",
                "L"
        );

        LogConvert6.setIngredient('L',Material.DARK_OAK_LOG);
        Bukkit.addRecipe(LogConvert6);
        LogToStick6 = LogConvert6;
    }

    //#### STRIPPED LOGS
    // oak log
    public static void createStrippedLogtoSticks1(){
        ShapedRecipe StrippedLogConvert1 = new ShapedRecipe(NSKStrippedLogConvert1, new ItemStack(Material.STICK, 16));
        StrippedLogConvert1.shape(
                "L",
                "L"
        );

        StrippedLogConvert1.setIngredient('L',Material.STRIPPED_OAK_LOG);
        Bukkit.addRecipe(StrippedLogConvert1);
        StrippedLogToStick1 = StrippedLogConvert1;
    }

    // brich log
    public static void createStrippedLogtoSticks2(){
        ShapedRecipe StrippedLogConvert2 = new ShapedRecipe(NSKStrippedLogConvert2, new ItemStack(Material.STICK, 16));
        StrippedLogConvert2.shape(
                "L",
                "L"
        );

        StrippedLogConvert2.setIngredient('L',Material.STRIPPED_BIRCH_LOG);
        Bukkit.addRecipe(StrippedLogConvert2);
        StrippedLogToStick2 = StrippedLogConvert2;
    }

    // acacia log
    public static void createStrippedLogtoSticks3(){
        ShapedRecipe StrippedLogConvert3 = new ShapedRecipe(NSKStrippedLogConvert3, new ItemStack(Material.STICK, 16));
        StrippedLogConvert3.shape(
                "L",
                "L"
        );

        StrippedLogConvert3.setIngredient('L',Material.STRIPPED_ACACIA_LOG);
        Bukkit.addRecipe(StrippedLogConvert3);
        StrippedLogToStick3 = StrippedLogConvert3;
    }

    // spruce log
    public static void createStrippedLogtoSticks4(){
        ShapedRecipe StrippedLogConvert4 = new ShapedRecipe(NSKStrippedLogConvert4, new ItemStack(Material.STICK, 16));
        StrippedLogConvert4.shape(
                "L",
                "L"
        );

        StrippedLogConvert4.setIngredient('L',Material.STRIPPED_SPRUCE_LOG);
        Bukkit.addRecipe(StrippedLogConvert4);
        StrippedLogToStick4 = StrippedLogConvert4;
    }

    // jungle log
    public static void createStrippedLogtoSticks5(){
        ShapedRecipe StrippedLogConvert5 = new ShapedRecipe(NSKStrippedLogConvert5, new ItemStack(Material.STICK, 16));
        StrippedLogConvert5.shape(
                "L",
                "L"
        );

        StrippedLogConvert5.setIngredient('L',Material.STRIPPED_JUNGLE_LOG);
        Bukkit.addRecipe(StrippedLogConvert5);
        StrippedLogToStick5 = StrippedLogConvert5;
    }

    // dark oak log
    public static void createStrippedLogtoSticks6(){
        ShapedRecipe StrippedLogConvert6 = new ShapedRecipe(NSKStrippedLogConvert6, new ItemStack(Material.STICK, 16));
        StrippedLogConvert6.shape(
                "L",
                "L"
        );

        StrippedLogConvert6.setIngredient('L',Material.STRIPPED_DARK_OAK_LOG);
        Bukkit.addRecipe(StrippedLogConvert6);
        StrippedLogToStick6 = StrippedLogConvert6;
    }


}
