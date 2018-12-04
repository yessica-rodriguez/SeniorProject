/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senior_project.LogIn.CreateAccount;

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
public class CreateAccountModel {
    
   static Database myDatabase = Senior_Project.getDatabase();
   Connection connection = myDatabase.getMyConnection();
   
   private int id;
   private int q;
   
   public CreateAccountModel(int id){
       this.id = id;
   }
   
   public CreateAccountModel(){
       //hard-coded for testing
   }
   
   public void newU(String current_un, String current_pw, String q1A, String q2A, String q3A, int q1, int q2, int q3){
       int numU = 0;
       try (PreparedStatement statement = connection.prepareStatement(
                "SELECT * FROM seniorproject.users"))
        {
            try (ResultSet set = statement.executeQuery())
            {
                while(set.next()){
                    int temp = (set.getInt("id"));
                    if(temp > numU)
                        numU = temp;
                }
            }
        }catch(SQLException e){ System.out.println("Error with the database");};
        id = numU + 1;
        try{
            PreparedStatement users = connection.prepareStatement(
            "INSERT INTO `seniorproject`.`users` (`id`, `username`, `password`, `que1`, `que2`, `que3`, `Ans1`, `Ans2`, `Ans3`) "
                + "VALUES ('" + id + "', '" + current_un + "', '" + current_pw + "', '" + q1 + "', '" + q2 + "', '" + q3 + "', '" + q1A + "', '" + q2A + "', '" + q3A + "')");
            users.execute();
        }catch(SQLException e){ System.out.println("Error with Users table");};
        try{
            PreparedStatement users = connection.prepareStatement(
            "INSERT INTO `seniorproject`.`userdis` (`userID`) VALUES ('" + id + "')");
            users.execute();
        }catch(SQLException e){ System.out.println("Error with UserDis table");};
        try{
            PreparedStatement users = connection.prepareStatement(
            "INSERT INTO `seniorproject`.`userallergies` (`userID`) VALUES ('" + id + "')");
            users.execute();
        }catch(SQLException e){ System.out.println("Error with Users table");};
        try{
            PreparedStatement users = connection.prepareStatement(
            "INSERT INTO `seniorproject`.`profilepicture` (`userID`) VALUES ('" + id + "')");
            users.execute();
        }catch(SQLException e){ System.out.println("Error with ProfilePictures table");};
        try{
            PreparedStatement users = connection.prepareStatement(
            "INSERT INTO `seniorproject`.`personal` (`userID`) VALUES ('" + id + "')");
            users.execute();
        }catch(SQLException e){ System.out.println("Error with Personal table");};
        try{
            PreparedStatement users = connection.prepareStatement(
            "INSERT INTO `seniorproject`.`medical` (`userID`) VALUES ('" + id + "');");
            users.execute();
        }catch(SQLException e){ System.out.println("Error with Medical table");};
   }
   

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the q
     */
    public int getQ(String id) {
        q = 0;
        if(id != null){
            try (PreparedStatement statement = connection.prepareStatement(
                    "SELECT * FROM seniorproject.security_questions WHERE q = '" + id + "'"))
            {
                try (ResultSet set = statement.executeQuery())
                {
                    while(set.next()){
                        q = (set.getInt("id"));
                    }
                }
            }catch(SQLException e){ System.out.println("User not in the database");};
        }
        return q;
    }

    /**
     * @param q the q to set
     */
    public void setQ(int q) {
        this.q = q;
    }
   
}
