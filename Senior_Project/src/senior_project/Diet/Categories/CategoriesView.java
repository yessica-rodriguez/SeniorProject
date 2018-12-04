/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senior_project.Diet.Categories;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

/**
 *
 * @author yessi
 */
public class CategoriesView extends VBox{
    private Label w = new Label();
    private HBox heading = new HBox(); 
    private HBox list = new HBox();
    private Button b = new Button("View Food Categories List");
    private ScrollPane sc = new ScrollPane(); 
    private HBox dis = new HBox();
    private VBox dis2 = new VBox();
    private VBox elist = new VBox();
    
public CategoriesView(){
        this.getChildren().clear();
        
        //Food
        //elist.setPadding(new Insets(10, 10, 10, 10));  
        elist.setSpacing(10);
        sc.setContent(elist);
        sc.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        sc.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
        sc.setFitToWidth(true);
        //sc.setPrefViewportWidth(100);
        //sc.setPrefViewportHeight(300);
        sc.setStyle("-fx-background-color: gray;");
        dis.getChildren().add(sc);
        dis2.setAlignment(Pos.CENTER);
        //dis.setMaxSize(400, 2000);
        dis2.setStyle("-fx-padding: 40;");
        dis.setStyle("-fx-background-color: gray;" +
                    "-fx-border-color: #cc5500;" +
                    "-fx-border-width: 5;");
        dis2.setSpacing(20);
        
        list.setStyle("-fx-padding: 40;");
        w.setText("Food Categories");
        w.setFont(Font.font("Tahoma", FontWeight.BOLD, 80));
        w.setTextFill(Color.web("#ffffff"));
        heading.getChildren().add(w);
        heading.setAlignment(Pos.CENTER);
        heading.setStyle("-fx-background-color: #cc5500;");
        list.setSpacing(10);
        this.setSpacing(10);
        this.getChildren().addAll(heading, list);
    }
    
    public void updateCategoriesView(){
        this.getChildren().clear();
        w.setText("Food Categories");
        this.setSpacing(10);
        this.getChildren().addAll(heading, list);
    }
    
    public void updateCategoriesView2(){
        this.getChildren().clear();
        dis2.getChildren().clear();
        dis2.getChildren().addAll(dis, b);
        this.setSpacing(10);
        this.getChildren().addAll(heading, dis2);
    }

    /**
     * @return the w
     */
    public Label getW() {
        return w;
    }

    /**
     * @param w the w to set
     */
    public void setW(Label w) {
        this.w = w;
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
     * @return the list
     */
    public HBox getList() {
        return list;
    }

    /**
     * @param list the list to set
     */
    public void setList(HBox list) {
        this.list = list;
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
     * @return the elist
     */
    public VBox getElist() {
        return elist;
    }

    /**
     * @param elist the elist to set
     */
    public void setElist(VBox elist) {
        this.elist = elist;
    }
}
