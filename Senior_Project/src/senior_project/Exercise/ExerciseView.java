/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senior_project.Exercise;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import senior_project.Exercise.Muscles.*;
import senior_project.Exercise.Types.*;

/**
 *
 * @author yessi
 */
public class ExerciseView extends BorderPane{
    
    TypesController t = new TypesController();
    MusclesController m = new MusclesController();
    
    private Label w = new Label("Exercise");
    private HBox heading = new HBox();
    private VBox bBox = new VBox();
    private Image img00 = new Image("/resources/images/types.png");
    private ImageView iv0 = new ImageView(img00);
    private Button types = new Button("Exercise Types", iv0);
    private Image img01 = new Image("/resources/images/muscles.png");
    private ImageView iv1 = new ImageView(img01);
    private Button muscles = new Button("Muscles Exercised", iv1);
    private Button b = new Button("Back");
    private HBox backB = new HBox(b);
    
    public ExerciseView()     
    {
        this.getChildren().clear();
        iv0.setFitHeight(100);
        iv0.setFitWidth(100);
        iv1.setFitHeight(100);
        iv1.setFitWidth(100);
        
        w.setFont(Font.font("Tahoma", FontWeight.BOLD, 80));
        w.setTextFill(Color.web("#ffffff"));
        heading.getChildren().add(w);
        heading.setAlignment(Pos.CENTER);
        heading.setStyle("-fx-background-color: #cc5500;");
        types.setMaxSize(500, 500);
        types.setStyle(
                    "-fx-font-size: 2em; " +
                    "-fx-font-weight: BOLD");
        muscles.setMaxSize(500, 500);
        muscles.setStyle(
                    "-fx-font-size: 2em; " +
                    "-fx-font-weight: BOLD");
        bBox.getChildren().addAll(types, muscles);
        bBox.setSpacing(20);
        bBox.setStyle("-fx-padding: 40;");
            
        this.setTop(heading);
        this.setCenter(bBox);
    }
    
    public void updateExerciseView()     
    {
        this.getChildren().clear();
        this.setTop(heading);
        this.setCenter(bBox); 
    }
    
    public void updateExerciseView2(VBox TMe)     
    {
        backB.setStyle("-fx-background-color: #cc5500;");
        this.getChildren().clear();
        this.setTop(backB);
        this.setCenter(TMe); 
    }

    /**
     * @return the w
     */
    public Label getW() {
        return w;
    }

    /**
     * @return the heading
     */
    public HBox getHeading() {
        return heading;
    }

    /**
     * @param heading the heading to set
     */
    public void setHeading(HBox heading) {
        this.heading = heading;
    }

    /**
     * @return the bBox
     */
    public VBox getbBox() {
        return bBox;
    }

    /**
     * @param bBox the bBox to set
     */
    public void setbBox(VBox bBox) {
        this.bBox = bBox;
    }

    /**
     * @param w the w to set
     */
    public void setW(Label w) {
        this.w = w;
    }

    /**
     * @return the types
     */
    public Button getTypes() {
        return types;
    }

    /**
     * @param types the types to set
     */
    public void setTypes(Button types) {
        this.types = types;
    }

    /**
     * @return the muscles
     */
    public Button getMuscles() {
        return muscles;
    }

    /**
     * @param muscles the muscles to set
     */
    public void setMuscles(Button muscles) {
        this.muscles = muscles;
    }

    /**
     * @return the b
     */
    public Button getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(Button b) {
        this.b = b;
    }

    /**
     * @return the backB
     */
    public HBox getBackB() {
        return backB;
    }

    /**
     * @param backB the backB to set
     */
    public void setBackB(HBox backB) {
        this.backB = backB;
    }
}
