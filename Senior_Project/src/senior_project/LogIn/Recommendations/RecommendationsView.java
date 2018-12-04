/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senior_project.LogIn.Recommendations;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.*;

/**
 *
 * @author yessi
 */
public class RecommendationsView extends VBox{

    private Label w = new Label();
    private HBox heading = new HBox(); 
    private VBox dis = new VBox();
    private VBox dis2 = new VBox();
    private Label msg = new Label("You have not entered any information on diseases, gender, or age.");
    private Image im_cm = new Image("/resources/images/Dietary_Recommendations_M.PNG");
    private Image im_cf = new Image("/resources/images/Dietary_Recommendations_F.PNG");
    private Image im_e = new Image("/resources/images/Physical_Activity_Recommendations.PNG");
    private ImageView iv_cm = new ImageView(im_cm);
    private ImageView iv_cf = new ImageView(im_cf);
    private ImageView iv_e = new ImageView(im_e);
    private Label cal_msg = new Label("Calories Per Day: ");
    private Label ex_msg = new Label("Exercise Time: ");
    private Label dis_msg = new Label("Foods Recommended based on Diseases:");
    private Label warning = new Label("This should not be taken as absolute fact. "
            + "It is advised to see a doctor for more detailed and well-informed "
            + "recommendations on physical activity and diet.");
    private ScrollPane sc = new ScrollPane();
    private VBox dis0 = new VBox();
    private HBox dB = new HBox();
    
      
    public RecommendationsView()     
    {
        this.getChildren().clear();
        w.setText("Recommendations");
        w.setFont(Font.font("Tahoma", FontWeight.BOLD, 80));
        w.setTextFill(Color.web("#ffffff"));
        heading.getChildren().add(w);
        heading.setAlignment(Pos.CENTER);
        heading.setStyle("-fx-background-color: #cc5500;");
        warning.setTextFill(Color.web("#ff0000"));
        msg.setFont(Font.font("Tahoma", FontWeight.BOLD, 20));
        cal_msg.setFont(Font.font("Tahoma", FontWeight.BOLD, 20));
        ex_msg.setFont(Font.font("Tahoma", FontWeight.BOLD, 20));
        dis_msg.setFont(Font.font("Tahoma", FontWeight.BOLD, 20));
        warning.setFont(Font.font("Tahoma", FontWeight.BOLD, 20));
        dB.setSpacing(10);
        dis0.setStyle("-fx-background-color: whitesmoke;" +
                          "-fx-border-width: 5;" +
                          "-fx-border-color: #cc5500;");
        dis.setStyle("-fx-padding: 20;");
        sc.setContent(dis);
        dis0.getChildren().add(sc);
        dis2.getChildren().add(dis0);
        dis2.setAlignment(Pos.CENTER);
        dis2.setStyle("-fx-padding: 40;");
        this.setSpacing(10);
        this.getChildren().addAll(heading, dis2);
    }
    
     public void updateRecommendationsView(){
        this.getChildren().clear();
        //sc.setContent().clear();
        dis2.getChildren().clear();
        dis2.getChildren().add(getSc());
        this.getChildren().addAll(heading, dis2);
    }
    
    public void C_G(String s){
        HBox Cpic = new HBox();
        Cpic.setSpacing(10);
        if(s.compareTo("") == 0)
            Cpic.getChildren().addAll(getIv_cm(), getIv_cf());
        else if(s.compareTo("F") == 0)
            Cpic.getChildren().addAll(getIv_cf());
        else
            Cpic.getChildren().addAll(getIv_cm());
        dis.getChildren().add(Cpic);
    }
    
    public void C_A(String Ms, String Fs){
        HBox C = new HBox();
        C.setSpacing(30);
        Label cm = new Label("M: " + Ms);
        Label cf = new Label("F: " + Fs);
        C.getChildren().addAll(cm, cf);
        dis.getChildren().add(C);
    }
    
     public void C_GA(String s){
        HBox C = new HBox();
        C.setSpacing(30);
        Label c = new Label(s);
        C.getChildren().addAll(c);
        dis.getChildren().add(C);
    }
    
    public void E_A(String s){
        HBox Epic = new HBox();
        Epic.setSpacing(10);
        Label e = new Label(s);
        if(s.compareTo("") == 0)
            Epic.getChildren().add(getIv_e());
        else
            Epic.getChildren().add(e);
        dis.getChildren().add(Epic);
    }
    
    public void D(String d, String f1, String f2, String f3, String f4, String f5){
        VBox DF = new VBox();
        DF.setSpacing(10);
        Label msgD = new Label(d + ": ");
        msgD.setFont(Font.font("Tahoma", FontWeight.BOLD, 15));
        Label msg1 = new Label(f1);
        Label msg2 = new Label(f2);
        Label msg3 = new Label(f3);
        Label msg4 = new Label(f4);
        Label msg5 = new Label(f5);
        DF.getChildren().addAll(msgD, msg1, msg2, msg3, msg4, msg5);
        dB.getChildren().add(DF);
    }
    
    public void DD(){
        dis.getChildren().add(dB);
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

    /**
     * @return the im_cm
     */
    public Image getIm_cm() {
        return im_cm;
    }

    /**
     * @param im_cm the im_cm to set
     */
    public void setIm_cm(Image im_cm) {
        this.im_cm = im_cm;
    }

    /**
     * @return the im_cf
     */
    public Image getIm_cf() {
        return im_cf;
    }

    /**
     * @param im_cf the im_cf to set
     */
    public void setIm_cf(Image im_cf) {
        this.im_cf = im_cf;
    }

    /**
     * @return the im_e
     */
    public Image getIm_e() {
        return im_e;
    }

    /**
     * @param im_e the im_e to set
     */
    public void setIm_e(Image im_e) {
        this.im_e = im_e;
    }

    /**
     * @return the iv_cm
     */
    public ImageView getIv_cm() {
        return iv_cm;
    }

    /**
     * @param iv_cm the iv_cm to set
     */
    public void setIv_cm(ImageView iv_cm) {
        this.iv_cm = iv_cm;
    }

    /**
     * @return the iv_cf
     */
    public ImageView getIv_cf() {
        return iv_cf;
    }

    /**
     * @param iv_cf the iv_cf to set
     */
    public void setIv_cf(ImageView iv_cf) {
        this.iv_cf = iv_cf;
    }

    /**
     * @return the iv_e
     */
    public ImageView getIv_e() {
        return iv_e;
    }

    /**
     * @param iv_e the iv_e to set
     */
    public void setIv_e(ImageView iv_e) {
        this.iv_e = iv_e;
    }

    /**
     * @return the cal_msg
     */
    public Label getCal_msg() {
        return cal_msg;
    }

    /**
     * @param cal_msg the cal_msg to set
     */
    public void setCal_msg(Label cal_msg) {
        this.cal_msg = cal_msg;
    }

    /**
     * @return the ex_msg
     */
    public Label getEx_msg() {
        return ex_msg;
    }

    /**
     * @param ex_msg the ex_msg to set
     */
    public void setEx_msg(Label ex_msg) {
        this.ex_msg = ex_msg;
    }

    /**
     * @return the dis_msg
     */
    public Label getDis_msg() {
        return dis_msg;
    }

    /**
     * @param dis_msg the dis_msg to set
     */
    public void setDis_msg(Label dis_msg) {
        this.dis_msg = dis_msg;
    }

    /**
     * @return the warning
     */
    public Label getWarning() {
        return warning;
    }

    /**
     * @param warning the warning to set
     */
    public void setWarning(Label warning) {
        this.warning = warning;
    }

    /**
     * @return the sc
     */
    public ScrollPane getSc() {
        return sc;
    }

    /**
     * @param sc the sc to set
     */
    public void setSc(ScrollPane sc) {
        this.sc = sc;
    }

    /**
     * @return the dis0
     */
    public VBox getDis0() {
        return dis0;
    }

    /**
     * @param dis0 the dis0 to set
     */
    public void setDis0(VBox dis0) {
        this.dis0 = dis0;
    }

    /**
     * @return the dB
     */
    public HBox getDB() {
        return dB;
    }

    /**
     * @param dB the d to set
     */
    public void setDB(HBox dB) {
        this.dB = dB;
    }
    
}
