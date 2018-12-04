/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senior_project.Diet;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import senior_project.Database;
import senior_project.Senior_Project;

/**
 *
 * @author yessi
 */
public class Food {
    
    static Database myDatabase = Senior_Project.getDatabase();
    static Connection connection = myDatabase.getMyConnection();
    
    String state = "SELECT * FROM seniorproject.foods WHERE id = '";
    
    private int fID;
    private byte[] image;
    private String foodName;
    private int foodGroup;
    private double serving;
    private double calories;
    private double totalFat;
    private double cholesterol;
    private double sodium;
    private double potassium;
    private double carbohydrates;
    private double proteins;
    
    public Food(int fID, byte[] image, String foodName, int foodGroup, double serving, double calories, double totalFat,
                double cholesterol, double sodium, double potassium, double carbohydrates, double proteins){
        this.fID = fID;
        this.image = image;
        this.foodName = foodName;
        this.foodGroup = foodGroup;
        this.serving = serving;
        this.calories = calories;
        this.totalFat = totalFat;
        this.cholesterol = cholesterol;
        this.sodium = sodium;
        this.potassium = carbohydrates;
        this.proteins = proteins; 
    }
    
    public Food(){
        //
    }
    
    public void getInfo(int id){
        try (PreparedStatement statement = connection.prepareStatement(state + id + "'"))
        {
            try (ResultSet set = statement.executeQuery())
            {
                while(set.next()){
                    foodName = (set.getString("name"));
                    foodGroup = (set.getInt("groupId"));
                    Blob test = (set.getBlob("image"));
                    image = test.getBytes(1,(int)test.length());
                    calories = (set.getDouble("calories"));
                    totalFat = (set.getDouble("fats"));
                    cholesterol = (set.getDouble("cholesterol"));
                    sodium = (set.getDouble("sodium"));
                    potassium = (set.getDouble("potassium"));
                    carbohydrates = (set.getDouble("carbohydrates"));
                    proteins = (set.getDouble("proteins"));
                    serving = (set.getDouble("serving size"));
                }
            }
        }catch(SQLException e){ System.out.println("Food "+ id + " is not in the database");};
    }

    /**
     * @param n
     * @return the fID
     */
    public int getfID(String n) {
        return fID;
    }

    /**
     * @param fID the fID to set
     */
    public void setfID(int fID) {
        this.fID = fID;
    }

    /**
     * @return the image
     */
    public byte[] getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(byte[] image) {
        this.image = image;
    }

    /**
     * @return the foodName
     */
    public String getFoodName() {
        return foodName;
    }

    /**
     * @param foodName the foodName to set
     */
    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    /**
     * @return the foodGroup
     */
    public int getFoodGroup() {
        return foodGroup;
    }

    /**
     * @param foodGroup the foodGroup to set
     */
    public void setFoodGroup(int foodGroup) {
        this.foodGroup = foodGroup;
    }

    /**
     * @return the serving
     */
    public double getServing() {
        return serving;
    }

    /**
     * @param serving the serving to set
     */
    public void setServing(double serving) {
        this.serving = serving;
    }

    /**
     * @return the calories
     */
    public double getCalories() {
        return calories;
    }

    /**
     * @param calories the calories to set
     */
    public void setCalories(double calories) {
        this.calories = calories;
    }

    /**
     * @return the totalFat
     */
    public double getTotalFat() {
        return totalFat;
    }

    /**
     * @param totalFat the totalFat to set
     */
    public void setTotalFat(double totalFat) {
        this.totalFat = totalFat;
    }

    /**
     * @return the cholesterol
     */
    public double getCholesterol() {
        return cholesterol;
    }

    /**
     * @param cholesterol the cholesterol to set
     */
    public void setCholesterol(double cholesterol) {
        this.cholesterol = cholesterol;
    }

    /**
     * @return the sodium
     */
    public double getSodium() {
        return sodium;
    }

    /**
     * @param sodium the sodium to set
     */
    public void setSodium(double sodium) {
        this.sodium = sodium;
    }

    /**
     * @return the potassium
     */
    public double getPotassium() {
        return potassium;
    }

    /**
     * @param potassium the potassium to set
     */
    public void setPotassium(double potassium) {
        this.potassium = potassium;
    }

    /**
     * @return the carbohydrates
     */
    public double getCarbohydrates() {
        return carbohydrates;
    }

    /**
     * @param carbohydrates the carbohydrates to set
     */
    public void setCarbohydrates(double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    /**
     * @return the proteins
     */
    public double getProteins() {
        return proteins;
    }

    /**
     * @param proteins the proteins to set
     */
    public void setProteins(double proteins) {
        this.proteins = proteins;
    }
    
}
