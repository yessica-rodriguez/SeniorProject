/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senior_project.Info;

import javafx.geometry.Pos;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

/**
 *
 * @author yessi
 */
public class InfoView extends BorderPane{
    
    private Label w = new Label("Additional Information");
    private HBox heading = new HBox();
    private GridPane links = new GridPane();
    
    private Label i1Label = new Label("For dietary information and tips");
    private Label i2Label = new Label("For programs and events promoting healthy living");
    private Label i3Label = new Label("For nutrition education");
    private Label i4Label = new Label("For easy access to resources on nutrition");
    private Label i5Label = new Label("For adivce and suggestions for healthy living from others in the community");
    private Label i6Label = new Label("For information on a government program that targets women and children health");
    private Label i7Label = new Label("For programs sponsored by UT that promote healthy living");
    private Label i8Label = new Label("For general health information");
    private Label i9Label = new Label("For dietary guideline");
    private Hyperlink hyperlink1 = new Hyperlink("");
    private Hyperlink hyperlink2 = new Hyperlink("");
    private Hyperlink hyperlink3 = new Hyperlink("");
    private Hyperlink hyperlink4 = new Hyperlink("");
    private Hyperlink hyperlink5 = new Hyperlink("");
    private Hyperlink hyperlink6 = new Hyperlink("");
    private Hyperlink hyperlink7 = new Hyperlink("");
    private Hyperlink hyperlink8 = new Hyperlink("");
    private Hyperlink hyperlink9 = new Hyperlink("");
    
    public InfoView()     
    {
        this.getChildren().clear();
        links.setHgap(10);
        links.setVgap(10);
        
        w.setFont(Font.font("Tahoma", FontWeight.BOLD, 80));
        w.setTextFill(Color.web("#ffffff"));
        heading.getChildren().add(w);
        heading.setAlignment(Pos.CENTER);
        heading.setStyle("-fx-background-color: #cc5500;");
        
        Font myF = Font.font("Verdana", FontWeight.BOLD, 24);
        i1Label.setFont(myF);
        i1Label.setTextFill(Color.MIDNIGHTBLUE);
        i2Label.setFont(myF);
        i2Label.setTextFill(Color.MIDNIGHTBLUE);
        i3Label.setFont(myF);
        i3Label.setTextFill(Color.MIDNIGHTBLUE);
        i4Label.setFont(myF);
        i4Label.setTextFill(Color.MIDNIGHTBLUE);
        i5Label.setFont(myF);
        i5Label.setTextFill(Color.MIDNIGHTBLUE);
        i6Label.setFont(myF);
        i6Label.setTextFill(Color.MIDNIGHTBLUE);
        i7Label.setFont(myF);
        i7Label.setTextFill(Color.MIDNIGHTBLUE);
        i8Label.setFont(myF);
        i8Label.setTextFill(Color.MIDNIGHTBLUE);
        i9Label.setFont(myF);
        i9Label.setTextFill(Color.MIDNIGHTBLUE);
        
        hyperlink1.setStyle("-fx-text-fill: #ffffff;" + "-fx-font-size: 1.5em;");
        hyperlink2.setStyle("-fx-text-fill: #ffffff;" + "-fx-font-size: 1.5em;");
        hyperlink3.setStyle("-fx-text-fill: #ffffff;" + "-fx-font-size: 1.5em;");
        hyperlink4.setStyle("-fx-text-fill: #ffffff;" + "-fx-font-size: 1.5em;");
        hyperlink5.setStyle("-fx-text-fill: #ffffff;" + "-fx-font-size: 1.5em;");
        hyperlink6.setStyle("-fx-text-fill: #ffffff;" + "-fx-font-size: 1.5em;");
        hyperlink7.setStyle("-fx-text-fill: #ffffff;" + "-fx-font-size: 1.5em;");
        hyperlink8.setStyle("-fx-text-fill: #ffffff;" + "-fx-font-size: 1.5em;");
        hyperlink9.setStyle("-fx-text-fill: #ffffff;" + "-fx-font-size: 1.5em;");
        
        links.addRow(1, i1Label);  
        links.addRow(2, hyperlink1);
        links.addRow(3, i2Label);
        links.addRow(4, hyperlink2);
        links.addRow(5, i3Label);
        links.addRow(6, hyperlink3);
        links.addRow(7, i4Label);
        links.addRow(8, hyperlink4);
        links.addRow(9, i5Label);
        links.addRow(10, hyperlink5);
        links.addRow(11, i6Label);
        links.addRow(12, hyperlink6);
        links.addRow(13, i7Label);
        links.addRow(14, hyperlink7);
        links.addRow(15, i8Label);
        links.addRow(16, hyperlink8);
        links.addRow(17, i9Label);
        links.addRow(18, hyperlink9);
        links.setStyle("-fx-padding: 20;");
        
        this.setTop(heading);
        this.setCenter(links);
        
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
     * @return the links
     */
    public GridPane getLinks() {
        return links;
    }

    /**
     * @param links the links to set
     */
    public void setLinks(GridPane links) {
        this.links = links;
    }

    /**
     * @return the i1Label
     */
    public Label getI1Label() {
        return i1Label;
    }

    /**
     * @param i1Label the i1Label to set
     */
    public void setI1Label(Label i1Label) {
        this.i1Label = i1Label;
    }

    /**
     * @return the i2Label
     */
    public Label getI2Label() {
        return i2Label;
    }

    /**
     * @param i2Label the i2Label to set
     */
    public void setI2Label(Label i2Label) {
        this.i2Label = i2Label;
    }

    /**
     * @return the i3Label
     */
    public Label getI3Label() {
        return i3Label;
    }

    /**
     * @param i3Label the i3Label to set
     */
    public void setI3Label(Label i3Label) {
        this.i3Label = i3Label;
    }

    /**
     * @return the i4Label
     */
    public Label getI4Label() {
        return i4Label;
    }

    /**
     * @param i4Label the i4Label to set
     */
    public void setI4Label(Label i4Label) {
        this.i4Label = i4Label;
    }

    /**
     * @return the i5Label
     */
    public Label getI5Label() {
        return i5Label;
    }

    /**
     * @param i5Label the i5Label to set
     */
    public void setI5Label(Label i5Label) {
        this.i5Label = i5Label;
    }

    /**
     * @return the i6Label
     */
    public Label getI6Label() {
        return i6Label;
    }

    /**
     * @param i6Label the i6Label to set
     */
    public void setI6Label(Label i6Label) {
        this.i6Label = i6Label;
    }

    /**
     * @return the i7Label
     */
    public Label getI7Label() {
        return i7Label;
    }

    /**
     * @param i7Label the i7Label to set
     */
    public void setI7Label(Label i7Label) {
        this.i7Label = i7Label;
    }

    /**
     * @return the i8Label
     */
    public Label getI8Label() {
        return i8Label;
    }

    /**
     * @param i8Label the i8Label to set
     */
    public void setI8Label(Label i8Label) {
        this.i8Label = i8Label;
    }

    /**
     * @return the i9Label
     */
    public Label getI9Label() {
        return i9Label;
    }

    /**
     * @param i9Label the i9Label to set
     */
    public void setI9Label(Label i9Label) {
        this.i9Label = i9Label;
    }

    /**
     * @return the hyperlink1
     */
    public Hyperlink getHyperlink1() {
        return hyperlink1;
    }

    /**
     * @param hyperlink1 the hyperlink1 to set
     */
    public void setHyperlink1(Hyperlink hyperlink1) {
        this.hyperlink1 = hyperlink1;
    }

    /**
     * @return the hyperlink2
     */
    public Hyperlink getHyperlink2() {
        return hyperlink2;
    }

    /**
     * @param hyperlink2 the hyperlink2 to set
     */
    public void setHyperlink2(Hyperlink hyperlink2) {
        this.hyperlink2 = hyperlink2;
    }

    /**
     * @return the hyperlink3
     */
    public Hyperlink getHyperlink3() {
        return hyperlink3;
    }

    /**
     * @param hyperlink3 the hyperlink3 to set
     */
    public void setHyperlink3(Hyperlink hyperlink3) {
        this.hyperlink3 = hyperlink3;
    }

    /**
     * @return the hyperlink4
     */
    public Hyperlink getHyperlink4() {
        return hyperlink4;
    }

    /**
     * @param hyperlink4 the hyperlink4 to set
     */
    public void setHyperlink4(Hyperlink hyperlink4) {
        this.hyperlink4 = hyperlink4;
    }

    /**
     * @return the hyperlink5
     */
    public Hyperlink getHyperlink5() {
        return hyperlink5;
    }

    /**
     * @param hyperlink5 the hyperlink5 to set
     */
    public void setHyperlink5(Hyperlink hyperlink5) {
        this.hyperlink5 = hyperlink5;
    }

    /**
     * @return the hyperlink6
     */
    public Hyperlink getHyperlink6() {
        return hyperlink6;
    }

    /**
     * @param hyperlink6 the hyperlink6 to set
     */
    public void setHyperlink6(Hyperlink hyperlink6) {
        this.hyperlink6 = hyperlink6;
    }

    /**
     * @return the hyperlink7
     */
    public Hyperlink getHyperlink7() {
        return hyperlink7;
    }

    /**
     * @param hyperlink7 the hyperlink7 to set
     */
    public void setHyperlink7(Hyperlink hyperlink7) {
        this.hyperlink7 = hyperlink7;
    }

    /**
     * @return the hyperlink8
     */
    public Hyperlink getHyperlink8() {
        return hyperlink8;
    }

    /**
     * @param hyperlink8 the hyperlink8 to set
     */
    public void setHyperlink8(Hyperlink hyperlink8) {
        this.hyperlink8 = hyperlink8;
    }

    /**
     * @return the hyperlink9
     */
    public Hyperlink getHyperlink9() {
        return hyperlink9;
    }

    /**
     * @param hyperlink9 the hyperlink9 to set
     */
    public void setHyperlink9(Hyperlink hyperlink9) {
        this.hyperlink9 = hyperlink9;
    }
    
}
