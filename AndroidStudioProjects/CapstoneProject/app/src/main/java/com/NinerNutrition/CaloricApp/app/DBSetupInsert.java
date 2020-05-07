package com.NinerNutrition.CaloricApp.app;

/**
 * Created by bruker on 19.06.2017.
 */

import android.content.Context;
import android.database.sqlite.SQLiteException;

public class DBSetupInsert {

    /* Variables */
    private final Context context;

    /* Public Class ------------------------------------------------------ */
    public DBSetupInsert(Context ctx){
        this.context = ctx;
    }



    /* Setup Insert To Categories ----------------------------------------- */
    // To insert to category table
    public void setupInsertToCategories(String values){
        try{
            DBAdapter db = new DBAdapter(context);
            db.open();
            db.insert("categories",
                    "_id, category_name, category_parent_id, category_icon, category_note",
                    values);
            db.close();
        }
        catch (SQLiteException e){
            // Toast.makeText(context, "Error; Could not insert categories.", Toast.LENGTH_SHORT).show();
        }
    }
    public void insertAllCategories(){
        setupInsertToCategories("NULL, 'Bread', '0', '', NULL");
        setupInsertToCategories("NULL, 'Bread', '1', '', NULL");
        setupInsertToCategories("NULL, 'Cereals', '1', '', NULL");
        setupInsertToCategories("NULL, 'Frozen bread and rolls', '1', '', NULL");
        setupInsertToCategories("NULL, 'Crispbread', '1', '', NULL");

        // Parent id: 6
        setupInsertToCategories("NULL, 'Dessert and baking', '0', '', NULL");
        setupInsertToCategories("NULL, 'Baking', '6', '', NULL");
        setupInsertToCategories("NULL, 'Biscuit', '6', '', NULL");


        setupInsertToCategories("NULL, 'Drinks', '0', '', NULL");
        setupInsertToCategories("NULL, 'Soda', '9', '', NULL");


        setupInsertToCategories("NULL, 'Fruit and vegetables', '0', '', NULL");
        setupInsertToCategories("NULL, 'Frozen fruits and vegetables', '11', '', NULL");
        setupInsertToCategories("NULL, 'Fruit', '11', '', NULL");
        setupInsertToCategories("NULL, 'Vegetables', '11', '', NULL");
        setupInsertToCategories("NULL, 'Canned fruits and vegetables', '11', '', NULL");


        setupInsertToCategories("NULL, 'Health', '0', '', NULL");
        setupInsertToCategories("NULL, 'Meal substitutes', '16', '', NULL");
        setupInsertToCategories("NULL, 'Protein bars', '16', '', NULL");
        setupInsertToCategories("NULL, 'Protein powder', '16', '', NULL");


        setupInsertToCategories("NULL, 'Meat, chicken and fish', '0', '', NULL");
        setupInsertToCategories("NULL, 'Meat', '20', '', NULL");
        setupInsertToCategories("NULL, 'Chicken', '20', '', NULL");
        setupInsertToCategories("NULL, 'Seafood', '20', '', NULL");


        setupInsertToCategories("NULL, 'Dairy and eggs', '0', '', NULL");
        setupInsertToCategories("NULL, 'Eggs', '24', '', NULL");
        setupInsertToCategories("NULL, 'Cream and sour cream', '24', '', NULL");
        setupInsertToCategories("NULL, 'Yogurt', '24', '', NULL");


        setupInsertToCategories("NULL, 'Dinner', '0', '', NULL");
        setupInsertToCategories("NULL, 'Ready dinner dishes', '28', '', NULL");
        setupInsertToCategories("NULL, 'Pizza', '28', '', NULL");
        setupInsertToCategories("NULL, 'Noodle', '28', '', NULL");
        setupInsertToCategories("NULL, 'Pasta', '28', '', NULL");
        setupInsertToCategories("NULL, 'Rice', '28', '', NULL");
        setupInsertToCategories("NULL, 'Taco', '28', '', NULL");


        setupInsertToCategories("NULL, 'Cheese', '0', '', NULL");
        setupInsertToCategories("NULL, 'Cream cheese', '35', '', NULL");


        setupInsertToCategories("NULL, 'On bread', '0', '', NULL");
        setupInsertToCategories("NULL, 'Cold meats', '37', '', NULL");
        setupInsertToCategories("NULL, 'Sweet spreads', '37', '', NULL");
        setupInsertToCategories("NULL, 'Jam', '37', '', NULL");


        setupInsertToCategories("NULL, 'Snacks', '0', '', NULL");
        setupInsertToCategories("NULL, 'Nuts', '41', '', NULL");
        setupInsertToCategories("NULL, 'Potato chips', '41', '', NULL");
    }




    /* Setup Insert To Food ----------------------------------------------- */
    // To insert food to food table
    public void setupInsertToFood(String values){

        try {
            DBAdapter db = new DBAdapter(context);
            db.open();
            db.insert("food",
                    "_id, food_name, food_manufactor_name, food_serving_size_gram, food_serving_size_gram_mesurment, food_serving_size_pcs, food_serving_size_pcs_mesurment, food_energy, food_proteins, food_carbohydrates, food_fat, food_energy_calculated, food_proteins_calculated, food_carbohydrates_calculated, food_fat_calculated, food_user_id, food_barcode, food_category_id, food_thumb, food_image_a, food_image_b, food_image_c, food_notes",
                    values);
            db.close();
        }
        catch (SQLiteException e){
            // Toast.makeText(context, "Error; Could not insert food.", Toast.LENGTH_SHORT).show();
        }

    }
    // Insert all food into food database
    public void insertAllFood(){
        setupInsertToFood("NULL, 'Oatmeal', 'Quaker', '26', 'gram', '1', 'stk', '122', '3.5', '23.4', '1', '32', '1', '6', '0', NULL, NULL, '2', 'oatmeal.jpg', 'oatmeal.jpg', 'oatmeal.jpg', 'oatmeal.jpg', NULL");
        setupInsertToFood("NULL, 'Cooked Oatmeal', 'Quaker', '60', 'gram', '60', 'g', '389', '11.4', '63.1', '7.8', '233', '7', '38', '5', NULL, NULL, '3', 'axa_havregryn_lettkokt_thumb.jpg', 'axa_havregryn_lettkokt_a.jpg', 'axa_havregryn_lettkokt_b.jpg', 'axa_havregryn_lettkokt_c.jpg', NULL");
        setupInsertToFood("NULL, 'Family Size Oatmeal', 'Quaker', '80', 'gram', '80', 'g', '380', '13', '61', '7', '304', '10', '49', '6', NULL, NULL, '3', 'axa_havregryn_store_thumb.jpg', 'axa_havregryn_store_a.jpg', 'axa_havregryn_store_b.jpg', 'axa_havregryn_store_c.jpg', NULL");
        setupInsertToFood("NULL, 'Sunflower Seeds', 'Quaker', '60', 'gram', '1', 'size', '260', '10', '39', '0.5', '156', '6', '23', '0', NULL, NULL, '4', 'rema_1000_steinovnsbakte_solsikkebriks_thumb.jpg', 'rema_1000_steinovnsbakte_solsikkebriks_a.jpg', 'rema_1000_steinovnsbakte_solsikkebriks_b.jpg', 'rema_1000_steinovnsbakte_solsikkebriks_c.jpg', NULL");
        setupInsertToFood("NULL, 'Wheal Bread', 'Molles', '100', 'gram', '100', 'gram', '341', '10.2', '69.6', '1.6', '341', '10', '70', '2', NULL, NULL, '7', 'moollerens_siktet_hvetemel_thumb.jpg', 'moollerens_siktet_hvetemel_a.jpg', 'moollerens_siktet_hvetemel_b.jpg', 'moollerens_siktet_hvetemel_c.jpg', NULL");
        setupInsertToFood("NULL, 'Ritz Crackers', 'Nabisco', '200', 'gram', '1', 'pack', '490', '7.8', '61', '23', '980', '16', '122', '46', NULL, NULL, '8', 'mondelez_norge_ritz_crackers_thumb.jpg', 'mondelez_norge_ritz_crackers_a.jpg', 'mondelez_norge_ritz_crackers_b.jpg', 'mondelez_norge_ritz_crackers_c.jpg', NULL");
        setupInsertToFood("NULL, 'Gatorade', 'Pepsico', '500', 'gram', '1', 'bottle', '50', '0.4', '11.5', '0', '250', '2', '58', '0', NULL, NULL, '10', 'ringnes_battery_energy_drink_50cl_thumb.jpg', 'ringnes_battery_energy_drink_50cl_a.jpg', 'ringnes_battery_energy_drink_50cl_b.jpg', 'ringnes_battery_energy_drink_50cl_c.jpg', NULL");
        setupInsertToFood("NULL, 'Baked beans', 'Heinz', '420', 'gram', '1', 'can', '116', '5', '19', '0.5', '487', '21', '80', '2', NULL, NULL, '15', 'coop_baked_beans_thumb.jpg', 'coop_baked_beans_a.jpg', 'coop_baked_beans_b.jpg', 'coop_baked_beans_c.jpg', NULL");
        setupInsertToFood("NULL, 'Baked Chicken Frozen Meal', 'Lean Cuisine', '80', 'gram', '1', 'pack', '396', '37.5', '39.5', '9.6', '317', '30', '32', '8', NULL, NULL, '17', 'strongr_power_meal_thumb.jpg', 'strongr_power_meal_a.jpg', 'strongr_power_meal_b.jpg', 'strongr_power_meal_c.jpg', NULL");
        setupInsertToFood("NULL, 'Pure Protein Powder', 'GMP', '70', 'gram', '1', 'scoop', '382', '43.3', '43.2', '4.8', '267', '30', '30', '3', NULL, NULL, '17', 'strongr_pure_protein_meal_sjokoladesmak_thumb.jpg', 'strongr_pure_protein_meal_sjokoladesmak_a.jpg', 'strongr_pure_protein_meal_sjokoladesmak_b.jpg', 'strongr_pure_protein_meal_sjokoladesmak_c.jpg', NULL");
        setupInsertToFood("NULL, 'Chocolate peanut', 'Atkins', '60', 'gram', '1', 'scoop', '386', '29.4', '24.8', '19', '232', '18', '15', '11', NULL, NULL, '18', 'atkins_chocolate_peanut_thumb.jpg', 'atkins_chocolate_peanut_a.jpg', 'atkins_chocolate_peanut_b.jpg', 'atkins_chocolate_peanut_c.jpg', NULL");
        setupInsertToFood("NULL, 'Egg omlete', 'Daybreak', '15', 'gram', '1', 'egg', '308', '15.8', '0.2', '27.1', '46', '2', '0', '4', NULL, NULL, '25', 'first_price_egg_eggeplomme_thumb.jpg', 'first_price_egg_eggeplomme_a.jpg', 'first_price_egg_eggeplomme_b.jpg', 'first_price_egg_eggeplomme_c.jpg', NULL");
        setupInsertToFood("NULL, '8 Tortillas Whole Weat', 'Old El Paso', '41', 'gram', '1', 'size', '286', '8.3', '46.6', '6', '117', '3', '19', '2', NULL, NULL, '34', 'old_el_paso_whole_wheete_thumb.jpg', 'old_el_paso_whole_wheete_a.jpg', 'old_el_paso_whole_wheete_b.jpg', 'old_el_paso_whole_wheete_c.jpg', NULL");
    }


}
