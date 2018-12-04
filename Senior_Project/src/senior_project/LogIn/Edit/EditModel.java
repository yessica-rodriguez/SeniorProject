/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senior_project.LogIn.Edit;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import senior_project.Database;
import senior_project.Senior_Project;

/**
 *
 * @author yessi
 */
public class EditModel {
    
    static Database myDatabase = Senior_Project.getDatabase();
    Connection connection = myDatabase.getMyConnection();
    
    int countD;
    
    //UPDATE seniorproject.personal SET birthday = '1988-02-29 00:00:00.000' WHERE userID = 1;
    
    public EditModel(){    
        //hard-coded for testing
    }
    
    public void m(int id, int hF, int w, int hI,
            Boolean d1, Boolean d2, Boolean d3, Boolean d4, Boolean d5, Boolean d6,
                Boolean a1, Boolean a2, Boolean a3, Boolean a4, Boolean a5, 
                Boolean a6, Boolean a7, Boolean a8, Boolean a9, Boolean a10, 
                Boolean a11, Boolean a12, Boolean a13, Boolean a14, Boolean a15){
        mIn(id, hF, w, hI);
        Boolean[] d = {d1, d2, d3, d4, d5, d6};
        Udis(id, d);
        Boolean[] a = {a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15};
        Uall(id, a);
    }
    
    public void Udis(int id, Boolean[] d){
        countD = 0;
        int index = 0;
        String s = "SET ";
        while(index < 6)
        {
            s = DoA(s, "dis", index, d[index]);
            index++;
        }
        try{
            PreparedStatement users = connection.prepareStatement(
            "UPDATE `seniorproject`.`userdis` "
                    + s
                    + " WHERE (`userID` = '" + id + "')");
            users.execute();
        }catch(SQLException e){ System.out.println("Error with UserDis table");}; 
    }
    
    public String DoA(String s, String t, int i, Boolean n){
        if(n){
            if(countD == 1)
                s = s + ", ";
            else
               countD++; 
            s = s + "`" + t + (i + 1) + "` = '" + 1 + "'";
        }
        return s;
    }
    
    public void Uall(int id, Boolean[] a){
        countD = 0;
        int index = 0;
        String s = "SET ";
        while(index < 15)
        {
            s = DoA(s, "all", index, a[index]);
            index++;
        }
        try{
            PreparedStatement users = connection.prepareStatement(
            "UPDATE `seniorproject`.`userallergies` "
                    + s
                    + " WHERE (`userID` = '" + id + "')");
            users.execute();
        }catch(SQLException e){ System.out.println("Error with UserAll table");};
    }
    
    public void pIm(int id, File filename){
        /*
        try{
            PreparedStatement users = connection.prepareStatement(
            "UPDATE `seniorproject`.`profilepicture` "
                    + "SET `image` = ? "
                    + "WHERE (`userID` = '" + id + "')");
            users.execute();
        }catch(SQLException e){ System.out.println("Error with ProfilePictures table");};
        */
         // update sql
        String updateSQL = "UPDATE `seniorproject`.`profilepicture` "
                + "SET `image` = ? "
                + "WHERE `userID`=?";
 
        try (PreparedStatement pstmt = connection.prepareStatement(updateSQL)) {
 
            // set parameters
            pstmt.setBytes(1, readFile(filename));
            pstmt.setInt(2, id);
 
            pstmt.executeUpdate();
            System.out.println("Stored the file in the BLOB column.");
 
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    private byte[] readFile(File f) {
        ByteArrayOutputStream bos = null;
        try {
            FileInputStream fis = new FileInputStream(f);
            byte[] buffer = new byte[1024];
            bos = new ByteArrayOutputStream();
            for (int len; (len = fis.read(buffer)) != -1;) {
                bos.write(buffer, 0, len);
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException e2) {
            System.err.println(e2.getMessage());
        }
        return bos != null ? bos.toByteArray() : null;
    }
    
    public void p(int id, String fn, String ln, String g, String a, String st, String c, String z, String em, String b){
        String s = "SET ";
        int count = 0;
        if(fn.compareTo("") != 0){
            s = s + "`firstName` = '" + fn + "'";
            count++;
        }
        if(ln.compareTo("") != 0){
            if(count == 1)
                s = s + ", ";
            else
               count++; 
            s = s + "`lastName` = '" + ln + "'";
        }
        if(g.compareTo("") != 0){
            if(count == 1)
                s = s + ", ";
            else
               count++; 
            s = s + "`sex` = '" + g + "'";
        }
        if(a.compareTo("") != 0){
            if(count == 1)
                s = s + ", ";
            else
               count++; 
            s = s + "`address` = '" + a + "'";
        }
        if(st.compareTo("") != 0){
            if(count == 1)
                s = s + ", ";
            else
               count++; 
            s = s + "`state` = '" + st + "'";
        }
        if(c.compareTo("") != 0){
            if(count == 1)
                s = s + ", ";
            else
               count++; 
            s = s + "`city` = '" + c + "'";
        }
        if(z.compareTo("") != 0){
            if(count == 1)
                s = s + ", ";
            else
               count++; 
            s = s + "`zipcode` = '" + z + "'";
        }
        if(em.compareTo("") != 0){
            if(count == 1)
                s = s + ", ";
            else
               count++; 
            s = s + "`email` = '" + em + "'";
        }
        if(b.compareTo("") != 0){
            if(count == 1)
                s = s + ", ";
            else
               count++; 
            s = s + "`birthday` = '" + b + "'";
        }
        try{
            PreparedStatement users = connection.prepareStatement(
            "UPDATE `seniorproject`.`personal` "
                    + s
                    + " WHERE (`userID` = '" + id + "')");
            users.execute();
        }catch(SQLException e){ System.out.println("Error with Personal table");};
    }
    
    public void mIn(int id, int hF, int w, int hI){
        int count = 0;
        String s = "SET "; 
        if(hF != 0){ 
            s = s + "`heightFt` = '" + hF + "'";
            count++;
        }
        if(w != 0){
            if(count == 1)
               s = s + ", ";
            else
                count++;
            s = s + "`weight` = '" + w + "'";
        }
        if(hI != 0){
            if(count == 1)
                s = s + ", ";
            else
                count++;
            s = s + "`heightInches` = '" + hI + "'";
        }
        try{
            PreparedStatement users = connection.prepareStatement(
            "UPDATE `seniorproject`.`medical` "
                    + s
                    + " WHERE (`userID` = '" + id + "')");
            users.execute();
        }catch(SQLException e){ System.out.println("Error with Medical table");};
    }
    
}
