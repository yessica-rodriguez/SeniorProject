/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senior_project.LogIn;

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
public class LoginModel {
    
    static Database myDatabase = Senior_Project.getDatabase();
    Connection connection = myDatabase.getMyConnection();
    
    private String un;
    private String pw;
    private Boolean li;
    private int Uid;
    private byte[] pImage;
    
    public LoginModel(String un, String pw, Boolean li, int Uid){
        this.un = un;
        this.pw = pw;
        this.li = li;
        this.Uid = Uid;
    }
    
    public LoginModel(){
        //
    }

    /**
     * @return the un
     */
    public String getUn() {
        return un;
    }

    /**
     * @param un the un to set
     */
    public void setUn(String un) {
        this.un = un;
    }

    /**
     * @return the pw
     */
    public String getPw() {
        return pw;
    }

    /**
     * @param pw the pw to set
     */
    public void setPw(String pw) {
        this.pw = pw;
    }

    /**
     * @return the li
     */
    public Boolean getLi() {
        li = false;
        try (PreparedStatement statement = connection.prepareStatement(
                "SELECT * FROM seniorproject.users WHERE username = '" + un + "'"))
        {
            try (ResultSet set = statement.executeQuery())
            {
                while(set.next()){
                    int i = (set.getInt("id"));
                    String password = (set.getString("password"));
                    if(password.compareTo(pw) == 0){
                        li = true;
                        Uid = i;
                        break;
                    }
                }
            }
        }catch(SQLException e){ System.out.println("User not in the database");};
        return li;
    }

    /**
     * @param li the li to set
     */
    public void setLi(Boolean li) {
        this.li = li;
    }

    /**
     * @return the Uid
     */
    public int getUid() {
        return Uid;
    }

    /**
     * @param Uid the Uid to set
     */
    public void setUid(int Uid) {
        this.Uid = Uid;
    }

    /**
     * @return the pImage
     */
    public byte[] getpImage() {
        try (PreparedStatement statement = connection.prepareStatement(
                "SELECT * FROM seniorproject.profilepicture WHERE userID = '" + Uid + "'"))
        {
            try (ResultSet set = statement.executeQuery())
            {
                while(set.next()){
                    Blob b = set.getBlob("image"); //retrieving the blob
                    if(b != null)
                        pImage = b.getBytes(1, (int)b.length()); //getting al the bytes of the blob
                }
            }
        }catch(SQLException e){ System.out.println("User not in the database");};
        return pImage;
    }

    /**
     * @param pImage the pImage to set
     */
    public void setpImage(byte[] pImage) {
        this.pImage = pImage;
    }
    
    
    
}
