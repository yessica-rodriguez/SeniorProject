/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senior_project.Diet;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

/**
 *
 * @author yessi
 */
public class DietView extends BorderPane{
    
    private Label w = new Label("Diet");
    private HBox heading = new HBox();
    private VBox bBox = new VBox();
    
    private Image img00 = new Image("/resources/images/categories.jpg");
    private ImageView iv0 = new ImageView(img00);
    private Button cat = new Button("Food Categories", iv0);
    private Image img01 = new Image("/resources/images/calculator.png");
    private ImageView iv1 = new ImageView(img01);
    private Button cal = new Button("Calorie Calculator", iv1);
    private Image img02 = new Image("/resources/images/search.png");
    private ImageView iv2 = new ImageView(img02);
    private Button s = new Button("Search", iv2);
    private VBox sbox = new VBox();
    private TextField test = new TextField();
    private Button b = new Button("Back");
    private HBox backB = new HBox(b);
    
    public DietView()     
    {
        this.getChildren().clear();
        //Title
        w.setFont(Font.font("Tahoma", FontWeight.BOLD, 80));
        w.setTextFill(Color.web("#ffffff"));
        heading.getChildren().add(w);
        heading.setAlignment(Pos.CENTER);
        heading.setStyle("-fx-background-color: #cc5500;");
        //**************************************
        //*********** Buttons ******************
        //**************************************
            //Button Sizes
            cat.setMaxSize(500, 500);
            cat.setStyle(
                    "-fx-font-size: 2em; " +
                    "-fx-font-weight: BOLD");
            cal.setMaxSize(500, 500);
            cal.setStyle(
                    "-fx-font-size: 2em; " +
                    "-fx-font-weight: BOLD");
            s.setMaxSize(500, 500);
            s.setStyle(
                    "-fx-font-size: 2em; " +
                    "-fx-font-weight: BOLD");
            //Button Color
            
            //Button Text
            
            //Button Images
            iv0.setFitHeight(100);
            iv0.setFitWidth(100);
            iv1.setFitHeight(100);
            iv1.setFitWidth(100);
            iv2.setFitHeight(100);
            iv2.setFitWidth(100);
        bBox.getChildren().addAll(cat, cal, s);
        bBox.setSpacing(20);
        bBox.setStyle("-fx-padding: 40;");    
        this.setTop(heading);
        this.setCenter(bBox);
    }
    
    public void updateDietView()     
    {
        this.getChildren().clear();  
        this.setTop(heading);
        this.setCenter(bBox); 
    }
    
    public void updateDietView2(VBox sT)     
    {
        backB.setStyle("-fx-background-color: #cc5500;");
        this.getChildren().clear();
        this.setTop(backB);
        this.setCenter(sT); 
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
     * @return the img00
     */
    public Image getImg00() {
        return img00;
    }

    /**
     * @param img00 the img00 to set
     */
    public void setImg00(Image img00) {
        this.img00 = img00;
    }

    /**
     * @return the iv0
     */
    public ImageView getIv0() {
        return iv0;
    }

    /**
     * @param iv0 the iv0 to set
     */
    public void setIv0(ImageView iv0) {
        this.iv0 = iv0;
    }

    /**
     * @return the cat
     */
    public Button getCat() {
        return cat;
    }

    /**
     * @param cat the cat to set
     */
    public void setCat(Button cat) {
        this.cat = cat;
    }

    /**
     * @return the img01
     */
    public Image getImg01() {
        return img01;
    }

    /**
     * @param img01 the img01 to set
     */
    public void setImg01(Image img01) {
        this.img01 = img01;
    }

    /**
     * @return the iv1
     */
    public ImageView getIv1() {
        return iv1;
    }

    /**
     * @param iv1 the iv1 to set
     */
    public void setIv1(ImageView iv1) {
        this.iv1 = iv1;
    }

    /**
     * @return the cal
     */
    public Button getCal() {
        return cal;
    }

    /**
     * @param cal the cal to set
     */
    public void setCal(Button cal) {
        this.cal = cal;
    }

    /**
     * @return the img02
     */
    public Image getImg02() {
        return img02;
    }

    /**
     * @param img02 the img02 to set
     */
    public void setImg02(Image img02) {
        this.img02 = img02;
    }

    /**
     * @return the iv2
     */
    public ImageView getIv2() {
        return iv2;
    }

    /**
     * @param iv2 the iv2 to set
     */
    public void setIv2(ImageView iv2) {
        this.iv2 = iv2;
    }

    /**
     * @return the s
     */
    public Button getS() {
        return s;
    }

    /**
     * @param s the s to set
     */
    public void setS(Button s) {
        this.s = s;
    }

    /**
     * @return the sbox
     */
    public VBox getSbox() {
        return sbox;
    }

    /**
     * @param sbox the sbox to set
     */
    public void setSbox(VBox sbox) {
        this.sbox = sbox;
    }

    /**
     * @return the test
     */
    public TextField getTest() {
        return test;
    }

    /**
     * @param test the test to set
     */
    public void setTest(TextField test) {
        this.test = test;
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
