/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senior_project.LogIn.ForgotPassword;

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
public class ForgotPasswordModel {
    
    static Database myDatabase = Senior_Project.getDatabase();
    Connection connection = myDatabase.getMyConnection();
    
    private int identity;
    private String un;
    private int q1_id;
    private int q2_id;
    private int q3_id;
    private String q1;
    private String q2;
    private String q3;
    private String q1A;
    private String q2A;
    private String q3A;
    
    ForgotPasswordModel(String un, int q1_id, int q2_id, int q3_id, String q1,
                        String q2, String q3, String q1A, String q2A, String q3A){
        this.un = un;
        this.q1_id = q1_id;
        this.q2_id = q2_id;
        this.q3_id = q3_id;
        this.q1 = q1;
        this.q2 = q2;
        this.q3 = q3;
        this.q1A = q1A;
        this.q2A = q2A;
        this.q3A = q3A;
    }
    
    ForgotPasswordModel(){
        // hard-coded for testing
    }
    
    public void done(int id, String npw){
        try{
            PreparedStatement users = connection.prepareStatement(
            "UPDATE `seniorproject`.`users` "
                    + "SET `password` = '" + npw + "' WHERE (`id` = '" + id + "')");
            users.execute();
        }catch(SQLException e){ System.out.println("Error with changing password");}; 
    }
    
    public void getInfo(String id){
        try (PreparedStatement statement = connection.prepareStatement(
                "SELECT * FROM seniorproject.users WHERE username = '" + id + "'"))
        {
            try (ResultSet set = statement.executeQuery())
            {
                while(set.next()){
                    q1_id = (set.getInt("que1"));
                    q2_id = (set.getInt("que2"));
                    q3_id = (set.getInt("que3"));
                    q1A = (set.getString("Ans1"));
                    q2A = (set.getString("Ans2"));
                    q3A = (set.getString("Ans3"));
                }
            }
        }catch(SQLException e){ System.out.println("User not in the database");};
        //System.out.println("Question ids: " + q1_id + ", " + q2_id + ", " + q3_id);
        try (PreparedStatement statement = connection.prepareStatement(
                "SELECT * FROM seniorproject.security_questions"))
        {
            try (ResultSet set = statement.executeQuery())
            {
                while(set.next()){
                    int i = (set.getInt("id"));
                    String temp = (set.getString("q"));
                    if(i == q1_id){
                        q1 = temp;
                    }
                    else if(i == q2_id){
                        q2 = temp;
                    }
                    else if(i == q3_id){
                        q3 = temp;
                    }
                }
            }
        }catch(SQLException e){ System.out.println("User not in the database");};
    }

    /**
     * @param id
     * @return the un
     */
    public String getUn(String id) {
        un = "NO";
        try (PreparedStatement statement = connection.prepareStatement(
                "SELECT * FROM seniorproject.users WHERE username = '" + id + "'"))
        {
            try (ResultSet set = statement.executeQuery())
            {
                while(set.next()){
                    identity = (set.getInt("id"));
                    un = (set.getString("username"));
                }
            }
        }catch(SQLException e){ System.out.println("User not in the database");};
        return un;
    }

    /**
     * @param un the un to set
     */
    public void setUn(String un) {
        this.un = un;
    }

    /**
     * @return the q1_id
     */
    public int getQ1_id() {
        return q1_id;
    }

    /**
     * @param q1_id the q1_id to set
     */
    public void setQ1_id(int q1_id) {
        this.q1_id = q1_id;
    }

    /**
     * @return the q2_id
     */
    public int getQ2_id() {
        return q2_id;
    }

    /**
     * @param q2_id the q2_id to set
     */
    public void setQ2_id(int q2_id) {
        this.q2_id = q2_id;
    }

    /**
     * @return the q3_id
     */
    public int getQ3_id() {
        return q3_id;
    }

    /**
     * @param q3_id the q3_id to set
     */
    public void setQ3_id(int q3_id) {
        this.q3_id = q3_id;
    }

    /**
     * @return the q1
     */
    public String getQ1() {
        return q1;
    }

    /**
     * @param q1 the q1 to set
     */
    public void setQ1(String q1) {
        this.q1 = q1;
    }

    /**
     * @return the q2
     */
    public String getQ2() {
        return q2;
    }

    /**
     * @param q2 the q2 to set
     */
    public void setQ2(String q2) {
        this.q2 = q2;
    }

    /**
     * @return the q3
     */
    public String getQ3() {
        return q3;
    }

    /**
     * @param q3 the q3 to set
     */
    public void setQ3(String q3) {
        this.q3 = q3;
    }

    /**
     * @return the q1A
     */
    public String getQ1A() {
        return q1A;
    }

    /**
     * @param q1A the q1A to set
     */
    public void setQ1A(String q1A) {
        this.q1A = q1A;
    }

    /**
     * @return the q2A
     */
    public String getQ2A() {
        return q2A;
    }

    /**
     * @param q2A the q2A to set
     */
    public void setQ2A(String q2A) {
        this.q2A = q2A;
    }

    /**
     * @return the q3A
     */
    public String getQ3A() {
        return q3A;
    }

    /**
     * @param q3A the q3A to set
     */
    public void setQ3A(String q3A) {
        this.q3A = q3A;
    }

    /**
     * @return the identity
     */
    public int getIdentity() {
        return identity;
    }

    /**
     * @param identity the identity to set
     */
    public void setIdentity(int identity) {
        this.identity = identity;
    }
}
