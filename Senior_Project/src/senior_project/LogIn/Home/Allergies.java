/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senior_project.LogIn.Home;

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
public class Allergies {
    static Database myDatabase = Senior_Project.getDatabase();
    Connection connection = myDatabase.getMyConnection();
    
    String state = "SELECT * FROM seniorproject.allergy WHERE ID = '";

    private int numDis;
    private String name;
    private String description;
    
    
    public Allergies(int numDis, String name, String description) {
        this.numDis = numDis;
        this.name = name;
        this.description = description;
    }
    
    public Allergies() {
        // hard-coded for testing
    }

    /**
     * @return the numDis
     */
    public int getNumDis() {
        numDis = 0;
        try (PreparedStatement statement = connection.prepareStatement("SELECT * FROM seniorproject.allergy"))
        {
            try (ResultSet set = statement.executeQuery())
            {
                while(set.next()){
                    //numDis = (set.getInt("ID"));
                    int temp = (set.getInt("id"));
                    if(temp > numDis)
                        numDis = temp;
                }
            }
        }catch(SQLException e){ System.out.println("No allergies in the database");};
        return numDis;
    }

    /**
     * @param numDis the numDis to set
     */
    public void setNumDis(int numDis) {
        this.numDis = numDis;
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
        }catch(SQLException e){ System.out.println("No allergies in the database");};
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param id
     * @return the description
     */
    public String getDescription(int id) {
        description = "";
        try (PreparedStatement statement = connection.prepareStatement(state + id + "'"))
        {
            try (ResultSet set = statement.executeQuery())
            {
                while(set.next()){
                    description = (set.getString("description"));
                }
            }
        }catch(SQLException e){ System.out.println("No allergies in the database");};
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    } 
}
