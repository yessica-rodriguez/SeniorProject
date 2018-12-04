/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senior_project.Exercise.Muscles;

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
public class MusclesModel {
    
    static Database myDatabase = Senior_Project.getDatabase();
    Connection connection = myDatabase.getMyConnection();
    
    String state = "SELECT * FROM seniorproject.muscles WHERE id = '";

    private int numMus;
    private String name;
    
    
    public MusclesModel(int numMus, String name) {
        this.numMus = numMus;
        this.name = name;
    }
    
    public MusclesModel() {
        // hard-coded for testing
    }

    /**
     * @return the numMus
     */
    public int getNumMus() {
        numMus = 0;
        try (PreparedStatement statement = connection.prepareStatement("SELECT * FROM seniorproject.muscles"))
        {
            try (ResultSet set = statement.executeQuery())
            {
                while(set.next()){
                    int temp = (set.getInt("id"));
                    if(temp > numMus)
                        numMus = temp;
                }
            }
        }catch(SQLException e){ System.out.println("No exercise muscles in the database");};
        return numMus;
    }

    /**
     * @param numMus the numMus to set
     */
    public void setNumMus(int numMus) {
        this.numMus = numMus;
    }

    /**
     * @param id
     * @return the name
     */
    public String getName(int id) {
        name = "";
        try (PreparedStatement statement = connection.prepareStatement(state + id + "'"))
        {
            try (ResultSet set = statement.executeQuery())
            {
                while(set.next()){
                    name = (set.getString("name"));
                }
            }
        }catch(SQLException e){ System.out.println("No exercise muscles in the database");};
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

}
