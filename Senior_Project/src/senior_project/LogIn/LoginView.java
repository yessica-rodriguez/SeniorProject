/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senior_project.LogIn;

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
public class LoginView extends BorderPane{
    
    private Button c1 = new Button("Continue");
    private Button c2 = new Button("Continue");
    private Button c3 = new Button("Continue");
    
    private Button e0 = new Button("Enter");
    private Button e1 = new Button("Enter");
    private Button e2 = new Button("Enter");
    
    private Button b = new Button();
    private Image img00 = new Image("/resources/images/login.png");
    private ImageView iv0 = new ImageView(img00);
    
    private VBox dis = new VBox();
    private VBox signIn = new VBox();
    private Label w = new Label("Sign In");
    private Label un = new Label("Username: ");
    private TextField unTF = new TextField();
    private HBox username = new HBox();
    private Label pw = new Label("Password: ");
    private HBox password = new HBox();
    private TextField pwTF = new TextField();
    private Button li = new Button("Sign In");
    private Button ca = new Button("Create Account");
    private Button fp = new Button("Forgot Password");
    
    public LoginView()     
    {
        this.getChildren().clear();
        dis.setAlignment(Pos.CENTER);
        w.setFont(Font.font("Tahoma", FontWeight.BOLD, 80));
        w.setTextFill(Color.web("#cc5500"));
        iv0.setFitHeight(32);
        iv0.setFitWidth(32);
        li.setMaxSize(800, 800);
        li.setStyle("-fx-background-color: #cc5500;" +
                    "-fx-font-size: 2em; " +
                    "-fx-text-fill: #ffffff;" +
                    "-fx-font-weight: BOLD");
        //username
        username.getChildren().addAll(un,unTF);
        username.setSpacing(5);
        //password
        password.getChildren().addAll(pw, pwTF);
        password.setSpacing(5);
        //Sign In Box
        signIn.setStyle("-fx-background-color: whitesmoke;" + 
                        "-fx-border-width: 5;" +
                        "-fx-border-color: #cc5500;" +
                        "-fx-padding: 40;");
        signIn.getChildren().addAll(w,username,password,li, ca, fp);
        signIn.setSpacing(10);
        signIn.setMaxSize(400, 1000);
        dis.getChildren().add(signIn);
        this.setCenter(dis);
    }
    
    public void updateLoginView(){
        this.getChildren().clear();
        unTF.setText("");
        pwTF.setText("");
        this.setCenter(dis);
    }
    
    public void updateLoginView2(VBox sT, Button l){
        this.getChildren().clear();
        b.setText("Back");
        HBox buBox = new HBox();
        buBox.setStyle("-fx-padding: 5;" +
                        "-fx-background-color: #cc5500;");
        buBox.getChildren().add(b);
        HBox buBox2 = new HBox();
        buBox2.setStyle("-fx-padding: 5;" +
                        "-fx-background-color: gray;");
        buBox2.getChildren().add(l);
        this.setTop(buBox);
        this.setCenter(sT);
        this.setBottom(buBox2);
    } 
    
    public void updateLoginView3(BorderPane h){
        this.getChildren().clear();
        setB(new Button("Sign Out", getIv0()));
        //this.setTop(getB());
        this.setCenter(h);
    } 

    /**
     * @return the signIn
     */
    public VBox getSignIn() {
        return signIn;
    }

    /**
     * @param signIn the signIn to set
     */
    public void setSignIn(VBox signIn) {
        this.signIn = signIn;
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
     * @return the unTF
     */
    public TextField getUnTF() {
        return unTF;
    }

    /**
     * @param unTF the unTF to set
     */
    public void setUnTF(TextField unTF) {
        this.unTF = unTF;
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
     * @return the pwTF
     */
    public TextField getPwTF() {
        return pwTF;
    }

    /**
     * @param pwTF the pwTF to set
     */
    public void setPwTF(TextField pwTF) {
        this.pwTF = pwTF;
    }

    /**
     * @return the li
     */
    public Button getLi() {
        return li;
    }

    /**
     * @param li the li to set
     */
    public void setLi(Button li) {
        this.li = li;
    }

    /**
     * @return the ca
     */
    public Button getCa() {
        return ca;
    }

    /**
     * @param ca the ca to set
     */
    public void setCa(Button ca) {
        this.ca = ca;
    }

    /**
     * @return the fp
     */
    public Button getFp() {
        return fp;
    }

    /**
     * @param fp the fp to set
     */
    public void setFp(Button fp) {
        this.fp = fp;
    }

    /**
     * @return the username
     */
    public HBox getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(HBox username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public HBox getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(HBox password) {
        this.password = password;
    }

    /**
     * @return the c1
     */
    public Button getC1() {
        return c1;
    }

    /**
     * @param c1 the c1 to set
     */
    public void setC1(Button c1) {
        this.c1 = c1;
    }

    /**
     * @return the c2
     */
    public Button getC2() {
        return c2;
    }

    /**
     * @param c2 the c2 to set
     */
    public void setC2(Button c2) {
        this.c2 = c2;
    }

    /**
     * @return the c3
     */
    public Button getC3() {
        return c3;
    }

    /**
     * @param c3 the c3 to set
     */
    public void setC3(Button c3) {
        this.c3 = c3;
    }

    /**
     * @return the e1
     */
    public Button getE1() {
        return e1;
    }

    /**
     * @param e1 the e1 to set
     */
    public void setE1(Button e1) {
        this.e1 = e1;
    }

    /**
     * @return the e2
     */
    public Button getE2() {
        return e2;
    }

    /**
     * @param e2 the e2 to set
     */
    public void setE2(Button e2) {
        this.e2 = e2;
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
     * @return the e0
     */
    public Button getE0() {
        return e0;
    }

    /**
     * @param e0 the e0 to set
     */
    public void setE0(Button e0) {
        this.e0 = e0;
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
}
