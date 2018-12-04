/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senior_project.Diet.Categories;

import java.sql.*;
import java.util.Arrays;
import senior_project.Database;
import senior_project.Senior_Project;

/**
 *
 * @author yessi
 */
public class CategoriesModel {
    
    static Database myDatabase = Senior_Project.getDatabase();
    Connection connection = myDatabase.getMyConnection();
    
    String state = "SELECT * FROM seniorproject.food_groups WHERE id = '";
    
    private String category;
    private int numC;
    private int[] id;
    private int numF;
    
    public CategoriesModel(String category, int numC){
        this.category = category;
        this.numC = numC;
    }
    
    public CategoriesModel(){
        // hard-coded for testing
    }

    /**
     * @return the category
     */
    public String getCategory(int id) {
        category = "";
        try (PreparedStatement statement = connection.prepareStatement(state + id + "'"))
        {
            try (ResultSet set = statement.executeQuery())
            {
                while(set.next()){
                    category = (set.getString("name"));
                }
            }
        }catch(SQLException e){ System.out.println("No food categories in the database");};
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * @return the numC
     */
    public int getNumC() {
        numC = 0;
        try (PreparedStatement statement = connection.prepareStatement("SELECT * FROM seniorproject.food_groups"))
        {
            try (ResultSet set = statement.executeQuery())
            {
                while(set.next()){
                    int temp = (set.getInt("id"));
                    if(temp > numC)
                        numC = temp;
                }
            }
        }catch(SQLException e){ System.out.println("No food categories in the database");};
        return numC;
    }

    /**
     * @param numC the numC to set
     */
    public void setNumC(int numC) {
        this.numC = numC;
    }

    /**
     * @return the id
     */
    public int[] getId(int c, int t) {
        id = new int[t];
        int count = 0;
        try (PreparedStatement statement = connection.prepareStatement("SELECT * FROM seniorproject.foods"))
        {
            try (ResultSet set = statement.executeQuery())
            {
                while(set.next()){
                    int temp2 = (set.getInt("id"));
                    int temp = (set.getInt("groupId"));
                    if(temp == c){
                        id[count] = temp2;
                        count++;
                    }
                }
            }
        }catch(SQLException e){ System.out.println("No foods in the database");};
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int[] id) {
        this.id = id;
    }

    /**
     * @return the numF
     */
    public int getNumF(int id) {
        numF = 0;
        try (PreparedStatement statement = connection.prepareStatement("SELECT * FROM seniorproject.foods"))
        {
            try (ResultSet set = statement.executeQuery())
            {
                while(set.next()){
                    int temp = (set.getInt("groupId"));
                    if(temp == id){
                        numF++;
                    }
                }
            }
        }catch(SQLException e){ System.out.println("No foods in the database");};
        return numF;
    }

    /**
     * @param numF the numF to set
     */
    public void setNumF(int numF) {
        this.numF = numF;
    }
    
}
