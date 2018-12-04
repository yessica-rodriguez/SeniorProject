/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senior_project.Exercise.Types;

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
public class TypesModel {
    
    static Database myDatabase = Senior_Project.getDatabase();
    Connection connection = myDatabase.getMyConnection();
    
    String state = "SELECT * FROM seniorproject.exercisetypes WHERE id = '";

    private int numDis;
    private String name;
    
    
    public TypesModel(int numDis, String name) {
        this.numDis = numDis;
        this.name = name;
    }
    
    public TypesModel() {
        // hard-coded for testing
    }

    /**
     * @return the numDis
     */
    public int getNumDis() {
        numDis = 0;
        try (PreparedStatement statement = connection.prepareStatement("SELECT * FROM seniorproject.exercisetypes"))
        {
            try (ResultSet set = statement.executeQuery())
            {
                while(set.next()){
                    int temp = (set.getInt("id"));
                    if(temp > numDis)
                        numDis = temp;
                }
            }
        }catch(SQLException e){ System.out.println("No exercise types in the database");};
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
        }catch(SQLException e){ System.out.println("No exercise types in the database");};
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

}
