/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senior_project.Diet.Search;

import senior_project.Database;
import senior_project.Senior_Project;
import java.sql.*;
import java.sql.ResultSet;


/**
 *
 * @author yessi
 */
public class SearchModel {
    
    static Database myDatabase = Senior_Project.getDatabase();
    static Connection connection = myDatabase.getMyConnection();
    String state = "SELECT * FROM seniorproject.foods WHERE name = '";

    private int id;
    
    
    public SearchModel(int id) {
        this.id = id;
    }
    
    public SearchModel() {
        // hard-coded for testing
    }

    /**
     * @param n
     * @return the id
     */
    public int getId(String n) {
        id = 0;
        try (PreparedStatement statement = connection.prepareStatement(state + n + "'"))
        {
            try (ResultSet set = statement.executeQuery())
            {
                while(set.next()){
                    id = (set.getInt("id"));
                }
            }
        }catch(SQLException e){ System.out.println("Food is not in the database");};
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    
}