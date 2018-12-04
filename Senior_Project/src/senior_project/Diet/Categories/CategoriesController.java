/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senior_project.Diet.Categories;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import senior_project.Diet.Food;

/**
 *
 * @author yessi
 */
public class CategoriesController {
    Food f = new Food();
    
    private CategoriesModel CategoriesModel; 
    private CategoriesView CategoriesView;

    public CategoriesController(CategoriesModel CategoriesModel, CategoriesView CategoriesView) 
    {
        this.CategoriesModel = CategoriesModel;
        this.CategoriesView = CategoriesView;
        setupHandlers();
    }
    
    public CategoriesController() 
    {
        this.CategoriesModel = new CategoriesModel();
        this.CategoriesView  = new CategoriesView();
        setupHandlers();
    }
    
    public void setupHandlers()
    {
        DrawVBox(CategoriesView.getList(), CategoriesModel.getNumC());
        CategoriesView.getB().setOnAction((ActionEvent event) -> {
            CategoriesView.updateCategoriesView();
        });
    }
    
    
    public void DrawVBox(HBox b, int num){
        while(num > 0){
            b.getChildren().add(DrawHBox(num));
            num = num - 10;
        }
    }
    
    private VBox DrawHBox(int num){
        VBox d = new VBox();
        d.setSpacing(20);
        int count = 1;
        while(count < 10){
            if(num != 0){
                d.getChildren().add(DrawB(num));
            }
            else
                break;
            num--;
            count++;
        }
        return d;
    }
    
    private Button DrawB(int num){
        Button l = new Button();
        if(num > 0){
            l.setText(CategoriesModel.getCategory(num));
            l.setOnAction((ActionEvent event) -> {
                CategoriesView.getElist().getChildren().clear();
                CategoriesView.getW().setText(CategoriesModel.getCategory(num));
                try {
                    DrawEVBox(CategoriesView.getElist(), num, CategoriesModel.getNumF(num));
                } catch (IOException | SQLException ex) {
                    Logger.getLogger(CategoriesController.class.getName()).log(Level.SEVERE, null, ex);
                }
                CategoriesView.updateCategoriesView2();
            });
        }
        l.setMaxSize(500, 500);
        l.setStyle(
                    "-fx-font-size: 2em; " +
                    "-fx-font-weight: BOLD");
        return l;
    }
    
    public void DrawEVBox(VBox b, int num, int t) throws IOException, SQLException{
        int[] id = CategoriesModel.getId(num, t);
        Image img00;
        //Image img01 = new Image("databaseImage.jpg");
        ImageView iv0;
        //ImageView iv1 = new ImageView(img01);
        int index = 0;
        while(t > 0){
            if(t != 0){
                f.getInfo(id[index]);
                byte[] bl = f.getImage();
                Label nameLabel= new Label("  Name: ");
                TextField nameText = new TextField("") ;
                Label groupLabel= new Label("  Food Group: ");
                TextField groupText = new TextField("");
                Label servingLabel= new Label("  Serving: ");
                TextField servingText = new TextField("");
                Label caloriesLabel= new Label("  Calories: ");
                TextField caloriesText = new TextField("");
                Label totalFatLabel= new Label("  Total Fat: ");
                TextField totalFatText = new TextField("");
                Label cholesterolLabel= new Label("  Cholesterol: ");
                TextField cholesterolText = new TextField("");
                Label sodiumLabel = new Label("  Sodium: ");
                TextField sodiumText = new TextField("");
                Label potassiumLabel= new Label("  Potassium: ");
                TextField potassiumText = new TextField("");
                Label carbohydratesLabel= new Label("  Carbohydrates: ");
                TextField carbohydratesText = new TextField("");
                Label proteinsLabel= new Label("  Proteins: ");
                TextField proteinsText = new TextField("");
                GridPane Nutrition_Facts = new GridPane();
                if(bl != null){
                    img00 = new Image(new ByteArrayInputStream(bl));
                }
                else
                    img00 = new Image("/resources/images/notFound.jpg");
                iv0 = new ImageView(img00);
                iv0.setFitHeight(500);
                iv0.setFitWidth(1000);
                iv0.setPreserveRatio(true);
                nameText.setText(f.getFoodName());
                groupText.setText(CategoriesModel.getCategory(f.getFoodGroup()));
                servingText.setText(Double.toString(f.getServing()));
                caloriesText.setText(Double.toString(f.getCalories()));
                totalFatText.setText(Double.toString(f.getTotalFat()));
                cholesterolText.setText(Double.toString(f.getCholesterol()));
                sodiumText.setText(Double.toString(f.getSodium()));
                potassiumText.setText(Double.toString(f.getPotassium()));
                carbohydratesText.setText(Double.toString(f.getCarbohydrates()));
                proteinsText.setText(Double.toString(f.getProteins()));
                Nutrition_Facts.add(nameLabel, 0, 0);
                Nutrition_Facts.add(nameText, 1, 0);
                Nutrition_Facts.add(groupLabel, 0, 2);
                Nutrition_Facts.add(groupText, 1, 2);
                Nutrition_Facts.add(servingLabel, 0, 3);
                Nutrition_Facts.add(servingText, 1, 3);
                Nutrition_Facts.add(caloriesLabel, 0, 4);
                Nutrition_Facts.add(caloriesText, 1, 4);
                Nutrition_Facts.add(totalFatLabel, 0, 5);
                Nutrition_Facts.add(totalFatText, 1, 5);
                Nutrition_Facts.add(cholesterolLabel, 0, 6);
                Nutrition_Facts.add(cholesterolText, 1, 6);
                Nutrition_Facts.add(sodiumLabel, 0, 7);
                Nutrition_Facts.add(sodiumText, 1, 7);
                Nutrition_Facts.add(potassiumLabel, 0, 8);
                Nutrition_Facts.add(potassiumText, 1, 8);
                Nutrition_Facts.add(carbohydratesLabel, 0, 9);
                Nutrition_Facts.add(carbohydratesText, 1, 9);
                Nutrition_Facts.add(proteinsLabel, 0, 10);
                Nutrition_Facts.add(proteinsText, 1, 10);
                Nutrition_Facts.setStyle("-fx-background-color: white");
                Nutrition_Facts.setGridLinesVisible(true);
                HBox e = new HBox();
                e.setSpacing(10);
                e.getChildren().addAll(iv0, Nutrition_Facts);
                e.setStyle(
                    "-fx-border-color: #000000;" +
                    "-fx-border-width: 3;");
                e.setPrefWidth(2500);
                b.getChildren().add(e);
                t--;
                index++;
            }
            else
                break;
        }      
    }
    

    /**
     * @return the CategoriesModel
     */
    public CategoriesModel getCategoriesModel() {
        return CategoriesModel;
    }

    /**
     * @param CategoriesModel the CategoriesModel to set
     */
    public void setCategoriesModel(CategoriesModel CategoriesModel) {
        this.CategoriesModel = CategoriesModel;
    }

    /**
     * @return the CategoriesView
     */
    public CategoriesView getCategoriesView() {
        return CategoriesView;
    }

    /**
     * @param CategoriesView the CategoriesView to set
     */
    public void setCategoriesView(CategoriesView CategoriesView) {
        this.CategoriesView = CategoriesView;
    }
    
}