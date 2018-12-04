/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senior_project.LogIn.CreateAccount;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.control.ComboBox;
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
public class CreateAccountView extends VBox{
    
    private Label w = new Label();
    private HBox heading = new HBox(); 
    private VBox dis = new VBox();
    private VBox dis2 = new VBox();
    ObservableList<String> options = FXCollections.observableArrayList(
        "Who is your favorite author?",
        "What was the make of your first car?",
        "Who is your all-time favorite movie character?",
        "What is the last name of your favorite musician?",
        "What is the name of your favorite book?",
        "What was your first pet's name?",
        "What is the street name on which you grew up?",
        "What was your favorite food as a child?",
        "What was the last name of your favorite teacher?",
        "Where did you spend your childhood summers?"
    );
    private GridPane ac = new GridPane();
    private Label un = new Label("Username: ");
    private TextField current_un = new TextField();
    private Label pw = new Label("Password: ");
    private TextField current_pw = new TextField();
    private Label cpw = new Label("Confirm Password: ");
    private TextField current_cpw = new TextField();
    private Label q1 = new Label("Security Question 1: ");
    private ComboBox q1M = new ComboBox(options);
    private TextField q1A = new TextField();
    private Label q2 = new Label("Security Question 2: ");
    private ComboBox q2M = new ComboBox(options);
    private TextField q2A = new TextField();
    private Label q3 = new Label("Security Question 3: ");
    private ComboBox q3M = new ComboBox(options);
    private TextField q3A = new TextField();
    private Label msg = new Label();
    
    public CreateAccountView(){
        this.getChildren().clear();
        ac.setHgap(10);
        ac.setVgap(10);
        ac.add(msg, 1, 0);
        ac.add(un, 0, 1);
        ac.add(current_un, 1, 1);
        ac.add(pw, 0, 2);
        ac.add(current_pw, 1, 2);
        ac.add(cpw, 0, 3);
        ac.add(current_cpw, 1, 3);
        ac.add(q1, 0, 4);
        ac.add(q1M, 1, 4);
        ac.add(q1A, 1, 5);
        ac.add(q2, 0, 6);
        ac.add(q2M, 1, 6);
        ac.add(q2A, 1, 7);
        ac.add(q3, 0, 8);
        ac.add(q3M, 1, 8);
        ac.add(q3A, 1, 9);
        dis.getChildren().add(ac);
        dis.setAlignment(Pos.CENTER);
        dis.setMaxSize(650, 1000);
        dis.setStyle("-fx-background-color: whitesmoke;" + 
                        "-fx-border-width: 5;" +
                        "-fx-border-color: #cc5500;" +
                        "-fx-padding: 40;");
        dis2.setAlignment(Pos.CENTER);
        dis2.getChildren().add(dis);
        dis2.setStyle("-fx-padding: 100;");
        w.setText("Create Account");
        w.setFont(Font.font("Tahoma", FontWeight.BOLD, 80));
        w.setTextFill(Color.web("#ffffff"));
        heading.getChildren().add(w);
        heading.setAlignment(Pos.CENTER);
        heading.setStyle("-fx-background-color: #cc5500;");
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
     * @return the ac
     */
    public GridPane getAc() {
        return ac;
    }

    /**
     * @param ac the ac to set
     */
    public void setAc(GridPane ac) {
        this.ac = ac;
    }

    /**
     * @return the un
     */
    public Label getUn() {
        return un;
    }

    /**
     * @param un the un to set
     */
    public void setUn(Label un) {
        this.un = un;
    }

    /**
     * @return the current_un
     */
    public TextField getCurrent_un() {
        return current_un;
    }

    /**
     * @param current_un the current_un to set
     */
    public void setCurrent_un(TextField current_un) {
        this.current_un = current_un;
    }

    /**
     * @return the pw
     */
    public Label getPw() {
        return pw;
    }

    /**
     * @param pw the pw to set
     */
    public void setPw(Label pw) {
        this.pw = pw;
    }

    /**
     * @return the current_pw
     */
    public TextField getCurrent_pw() {
        return current_pw;
    }

    /**
     * @param current_pw the current_pw to set
     */
    public void setCurrent_pw(TextField current_pw) {
        this.current_pw = current_pw;
    }

    /**
     * @return the cpw
     */
    public Label getCpw() {
        return cpw;
    }

    /**
     * @param cpw the cpw to set
     */
    public void setCpw(Label cpw) {
        this.cpw = cpw;
    }

    /**
     * @return the current_cpw
     */
    public TextField getCurrent_cpw() {
        return current_cpw;
    }

    /**
     * @param current_cpw the current_cpw to set
     */
    public void setCurrent_cpw(TextField current_cpw) {
        this.current_cpw = current_cpw;
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
     * @return the q1M
     */
    public ComboBox getQ1M() {
        return q1M;
    }

    /**
     * @param q1M the q1M to set
     */
    public void setQ1M(ComboBox q1M) {
        this.q1M = q1M;
    }

    /**
     * @return the q2M
     */
    public ComboBox getQ2M() {
        return q2M;
    }

    /**
     * @param q2M the q2M to set
     */
    public void setQ2M(ComboBox q2M) {
        this.q2M = q2M;
    }

    /**
     * @return the q3M
     */
    public ComboBox getQ3M() {
        return q3M;
    }

    /**
     * @param q3M the q3M to set
     */
    public void setQ3M(ComboBox q3M) {
        this.q3M = q3M;
    }

    /**
     * @return the msg
     */
    public Label getMsg() {
        return msg;
    }

    /**
     * @param msg the msg to set
     */
    public void setMsg(Label msg) {
        this.msg = msg;
    }
    
}
