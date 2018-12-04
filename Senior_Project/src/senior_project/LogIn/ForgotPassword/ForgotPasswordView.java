/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senior_project.LogIn.ForgotPassword;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

/**
 *
 * @author yessi
 */
public class ForgotPasswordView extends VBox{
    private Label w = new Label();
    private HBox heading = new HBox(); 
    private VBox dis = new VBox();
    private VBox dis2 = new VBox();
    private Label Ean0 = new Label();
    private Label Ean = new Label();
    private Label Ean2 = new Label();
    
    private GridPane cp0 = new GridPane();
    private Label username = new Label("Username: ");
    private TextField c_un = new TextField();

    private GridPane cp = new GridPane();
    private Label q1 = new Label();
    private TextField q1A = new TextField();
    private Label q2 = new Label();
    private TextField q2A = new TextField();
    private Label q3 = new Label();
    private TextField q3A = new TextField();
    
    private GridPane cp2 = new GridPane();
    private Label npw = new Label("New Password: ");
    private TextField current_nwp = new TextField();
    private Label cnpw = new Label("Confirm New Password: ");
    private TextField current_cnwp = new TextField();
    
    public ForgotPasswordView(String n){
        this.getChildren().clear();
        
        cp0.setHgap(10);
        cp0.setVgap(10);
        cp0.add(Ean0, 1, 0);
        cp0.add(username, 0, 1);
        cp0.add(c_un, 1, 1);
        
        cp.setHgap(10);
        cp.setVgap(10);
        cp.add(Ean, 0, 0);
        cp.add(q1, 0, 1);
        cp.add(q1A, 0, 2);
        cp.add(q2, 0, 3);
        cp.add(q2A, 0, 4);
        cp.add(q3, 0, 5);
        cp.add(q3A, 0, 6);
        
        cp2.setHgap(10);
        cp2.setVgap(10);
        cp2.add(Ean2, 1, 0);
        cp2.add(npw, 0, 1);
        cp2.add(current_nwp, 1, 1);
        cp2.add(cnpw, 0, 2);
        cp2.add(current_cnwp, 1, 2);
        
        if(n.compareTo("SQ") == 0)
            updateForgotPasswordView();
        else if(n.compareTo("UN") == 0)
            updateForgotPasswordView3();
        else
            updateForgotPasswordView2();
        dis.setAlignment(Pos.CENTER);
        dis.setMaxSize(650, 500);
        dis.setStyle("-fx-background-color: whitesmoke;" + 
                        "-fx-border-width: 5;" +
                        "-fx-border-color: #cc5500;" +
                        "-fx-padding: 40;");
        dis2.setAlignment(Pos.CENTER);
        dis2.getChildren().add(dis);
        dis2.setStyle("-fx-padding: 100;");
        w.setText("Change Password");
        w.setFont(Font.font("Tahoma", FontWeight.BOLD, 80));
        w.setTextFill(Color.web("#ffffff"));
        heading.getChildren().add(w);
        heading.setAlignment(Pos.CENTER);
        heading.setStyle("-fx-background-color: #cc5500;");
        this.setSpacing(10);
        this.getChildren().addAll(heading, dis2);
    }
    
    private void updateForgotPasswordView(){
        dis.getChildren().clear();
        dis.getChildren().add(cp);
    }
    
    private void updateForgotPasswordView2(){
        dis.getChildren().clear();
        dis.getChildren().add(cp2);
    }
    
    private void updateForgotPasswordView3(){
        dis.getChildren().clear();
        dis.getChildren().add(getCp0());
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
     * @return the dis
     */
    public VBox getDis() {
        return dis;
    }

    /**
     * @param dis the dis to set
     */
    public void setDis(VBox dis) {
        this.dis = dis;
    }

    /**
     * @return the dis2
     */
    public VBox getDis2() {
        return dis2;
    }

    /**
     * @param dis2 the dis2 to set
     */
    public void setDis2(VBox dis2) {
        this.dis2 = dis2;
    }

    /**
     * @return the Ean0
     */
    public Label getEan0() {
        return Ean0;
    }

    /**
     * @param Ean0 the Ean0 to set
     */
    public void setEan0(Label Ean0) {
        this.Ean0 = Ean0;
    }

    /**
     * @return the Ean
     */
    public Label getEan() {
        return Ean;
    }

    /**
     * @param Ean the Ean to set
     */
    public void setEan(Label Ean) {
        this.Ean = Ean;
    }

    /**
     * @return the Ean2
     */
    public Label getEan2() {
        return Ean2;
    }

    /**
     * @param Ean2 the Ean2 to set
     */
    public void setEan2(Label Ean2) {
        this.Ean2 = Ean2;
    }

    /**
     * @return the cp0
     */
    public GridPane getCp0() {
        return cp0;
    }

    /**
     * @param cp0 the cp0 to set
     */
    public void setCp0(GridPane cp0) {
        this.cp0 = cp0;
    }

    /**
     * @return the username
     */
    public Label getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(Label username) {
        this.username = username;
    }

    /**
     * @return the c_un
     */
    public TextField getC_un() {
        return c_un;
    }

    /**
     * @param c_un the c_un to set
     */
    public void setC_un(TextField c_un) {
        this.c_un = c_un;
    }

    /**
     * @return the cp
     */
    public GridPane getCp() {
        return cp;
    }

    /**
     * @param cp the cp to set
     */
    public void setCp(GridPane cp) {
        this.cp = cp;
    }

    /**
     * @return the q1
     */
    public Label getQ1() {
        return q1;
    }

    /**
     * @param q1 the q1 to set
     */
    public void setQ1(Label q1) {
        this.q1 = q1;
    }

    /**
     * @return the q1A
     */
    public TextField getQ1A() {
        return q1A;
    }

    /**
     * @param q1A the q1A to set
     */
    public void setQ1A(TextField q1A) {
        this.q1A = q1A;
    }

    /**
     * @return the q2
     */
    public Label getQ2() {
        return q2;
    }

    /**
     * @param q2 the q2 to set
     */
    public void setQ2(Label q2) {
        this.q2 = q2;
    }

    /**
     * @return the q2A
     */
    public TextField getQ2A() {
        return q2A;
    }

    /**
     * @param q2A the q2A to set
     */
    public void setQ2A(TextField q2A) {
        this.q2A = q2A;
    }

    /**
     * @return the q3
     */
    public Label getQ3() {
        return q3;
    }

    /**
     * @param q3 the q3 to set
     */
    public void setQ3(Label q3) {
        this.q3 = q3;
    }

    /**
     * @return the q3A
     */
    public TextField getQ3A() {
        return q3A;
    }

    /**
     * @param q3A the q3A to set
     */
    public void setQ3A(TextField q3A) {
        this.q3A = q3A;
    }

    /**
     * @return the cp2
     */
    public GridPane getCp2() {
        return cp2;
    }

    /**
     * @param cp2 the cp2 to set
     */
    public void setCp2(GridPane cp2) {
        this.cp2 = cp2;
    }

    /**
     * @return the npw
     */
    public Label getNpw() {
        return npw;
    }

    /**
     * @param npw the npw to set
     */
    public void setNpw(Label npw) {
        this.npw = npw;
    }

    /**
     * @return the current_nwp
     */
    public TextField getCurrent_nwp() {
        return current_nwp;
    }

    /**
     * @param current_nwp the current_nwp to set
     */
    public void setCurrent_nwp(TextField current_nwp) {
        this.current_nwp = current_nwp;
    }

    /**
     * @return the cnpw
     */
    public Label getCnpw() {
        return cnpw;
    }

    /**
     * @param cnpw the cnpw to set
     */
    public void setCnpw(Label cnpw) {
        this.cnpw = cnpw;
    }

    /**
     * @return the current_cnwp
     */
    public TextField getCurrent_cnwp() {
        return current_cnwp;
    }

    /**
     * @param current_cnwp the current_cnwp to set
     */
    public void setCurrent_cnwp(TextField current_cnwp) {
        this.current_cnwp = current_cnwp;
    }
    

}
