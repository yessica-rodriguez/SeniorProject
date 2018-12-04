/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senior_project;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author yessi
 */
public class Senior_Project extends Application {

    Scene Mainscene;
    
    private static Database                 database;
    private static GUI                      gui;
    //public static Profile                  profile;
    
    @Override
    public void start(Stage primaryStage) {
        Mainscene = new Scene(gui.getrootNode()); 
        primaryStage.setScene(Mainscene);
        primaryStage.setMaximized(true);      
        primaryStage.setTitle("Channeling Hygieia");
        primaryStage.getIcons().addAll(new Image("/resources/images/hygieia.png"));
        // Set Windows properties
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
        {
            database = new Database();
            //profile = new Profile();
            gui = new GUI();
            System.out.println("Main Application -> START");
            launch(args);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
    /**
    * @return The Database
    */
    public static Database getDatabase()
    {
        return database;
    }
    
    public static void prepareShutdown()
    {
        System.exit(0);
    }    
    
}
