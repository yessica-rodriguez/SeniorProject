/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senior_project.LogIn.Home;

import java.io.ByteArrayInputStream;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
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
public class HomeView extends BorderPane{
    private Label w = new Label();
    private Label current_un = new Label();
    private HBox heading = new HBox();
    private VBox pInfo = new VBox();
    private VBox pImage = new VBox();
    private Image img01 = new Image("/resources/images/edit.png");
    private ImageView iv1 = new ImageView(img01);
    private ImageView iv2 = new ImageView(img01);
    private ImageView iv3 = new ImageView(img01);
    private Button o = new Button("OK");
    private Button o2 = new Button("OK");
    private Button o3 = new Button("OK");
    private Button c3 = new Button("Cancel");
    private Button re = new Button("Recommendations");
    private Button b = new Button("Back");
    private HBox bBox = new HBox();
    //Profile Info
        //Personal
            private GridPane personal = new GridPane();
            private VBox pBox = new VBox();
            private Label headingP = new Label("Personal");
            private Label fname = new Label("First");
            private Label lname = new Label("Last");
            private Label gender = new Label("Gender");
            private Label add = new Label("Address");
            private Label st = new Label("State");
            private Label city = new Label("City");
            private Label zip = new Label("Zip Code");
            private Label email = new Label("Email: ");
            private Label DOB = new Label("DOB");
            private Label current_fname = new Label();
            private Label current_lname = new Label();
            private Label current_gender = new Label();
            private Label current_add = new Label();
            private Label current_st = new Label();
            private Label current_city = new Label();
            private Label current_zip = new Label();
            private Label current_email = new Label();
            private Label current_DOB = new Label();
            private Button ePersonal = new Button("Edit", getIv1());
        //Medical
            private GridPane medical = new GridPane();
            private VBox mBox = new VBox();
            private Label headingM = new Label("Medical");
            private Label height = new Label("Height");
            private Label hFt = new Label("ft");
            private Label hIn = new Label("in");
            private Label weight = new Label("Weight");
            private Label wLbs = new Label("lbs");
            private Label current_hFt = new Label();
            private Label current_hIn = new Label();
            private Label current_weight = new Label();
            private HBox mesurements = new HBox();
            private HBox current_h = new HBox();
            private VBox hBox = new VBox();
            private HBox current_w = new HBox();
            private VBox wBox = new VBox();
            private Label disHead = new Label("Diseases");
            private Label allHead = new Label("Allergies");
            private HBox disList = new HBox();
            private HBox allList = new HBox();
            private Button eMedical = new Button("Edit", getIv2());
    
    //Profile Image
        private VBox right = new VBox();
        private Button eImage = new Button("Edit Image", getIv3());
        
        private Image img00;
        private ImageView iv0;
        private byte[] im;
            
    public HomeView(String un, byte[] i)     
    {
        this.getChildren().clear();
        iv1.setFitHeight(50);
        iv1.setFitWidth(50);
        iv2.setFitHeight(50);
        iv2.setFitWidth(50);
        iv3.setFitHeight(50);
        iv3.setFitWidth(50);
        
        w.setFont(Font.font("Tahoma", FontWeight.BOLD, 80));
        w.setTextFill(Color.web("#ffffff"));
        w.setText("Welcome " + un);
        heading.getChildren().add(w);
        heading.setAlignment(Pos.CENTER);
        heading.setStyle("-fx-background-color: #cc5500;");
        
        bBox.setStyle("-fx-background-color: #cc5500;" 
                        + "-fx-padding: 10;");
        bBox.getChildren().add(b);
        
        //Profile Info
            //Personal
                headingP.setFont(Font.font("Tahoma", FontWeight.BOLD, 20));
                current_fname.setUnderline(true);
                current_lname.setUnderline(true);
                current_gender.setUnderline(true);
                current_add.setUnderline(true);
                current_st.setUnderline(true);
                current_city.setUnderline(true);
                current_zip.setUnderline(true);
                current_email.setUnderline(true);
                current_DOB.setUnderline(true);
                personal.add(current_fname, 0, 2);
                personal.add(current_lname, 1, 2);
                personal.add(fname, 0, 3);
                personal.add(lname, 1, 3);
                personal.add(current_add, 0, 4);
                personal.add(current_city, 1, 4);
                personal.add(current_st, 2, 4);
                personal.add(current_zip, 3, 4);
                personal.add(add, 0, 5);
                personal.add(city, 1, 5);
                personal.add(st, 2, 5);
                personal.add(zip, 3, 5);
                personal.add(current_gender, 0, 6);
                personal.add(current_email, 1, 6);
                personal.add(current_DOB, 2, 6);
                personal.add(gender, 0, 7);
                personal.add(email, 1, 7);
                personal.add(DOB, 2, 7);
                personal.setHgap(50);
                personal.setVgap(10);
                pBox.setStyle("-fx-background-color: whitesmoke;" +
                                  "-fx-border-width: 5;" +
                                  "-fx-border-color: #cc5500;" +
                                  "-fx-padding: 15;");
                pBox.getChildren().addAll(headingP, personal, ePersonal);
                pBox.setSpacing(10);
            //Medical
                headingM.setFont(Font.font("Tahoma", FontWeight.BOLD, 20));
                current_hFt.setUnderline(true);
                current_hIn.setUnderline(true);
                current_weight.setUnderline(true);
                disHead.setFont(Font.font("Tahoma", FontWeight.BOLD, 15));
                disList.setSpacing(30);
                allHead.setFont(Font.font("Tahoma", FontWeight.BOLD, 15));
                allList.setSpacing(30);
                mesurements.setSpacing(40); current_h.setSpacing(10); current_w.setSpacing(10);
                current_h.getChildren().addAll(current_hFt, hFt, current_hIn, hIn);
                current_w.getChildren().addAll(current_weight, wLbs);
                hBox.setSpacing(10); wBox.setSpacing(10);
                hBox.getChildren().addAll(current_h, height);
                wBox.getChildren().addAll(current_w, weight);
                mesurements.getChildren().addAll(hBox, wBox);
                medical.add(mesurements, 0, 2);
                medical.add(disHead, 0, 4);
                medical.add(disList, 0, 5);
                medical.add(allHead, 0, 6);
                medical.add(allList, 0, 7);
                medical.setHgap(50);
                medical.setVgap(10);
                mBox.setStyle("-fx-background-color: whitesmoke;" +
                                  "-fx-border-width: 5;" +
                                  "-fx-border-color: #cc5500;" +
                                  "-fx-padding: 15;");
                mBox.getChildren().addAll(headingM, medical, eMedical);
                mBox.setSpacing(10);
            pInfo.getChildren().addAll(pBox, mBox);
            pInfo.setSpacing(10);
            pInfo.setStyle("-fx-padding: 25;");
        
        //Profile Image
            pImage.setSpacing(10);
            if(i != null)
                    img00 = (new Image (new ByteArrayInputStream(i)));
                else
                    img00 = (new Image("/resources/images/profile.png")); 
            iv0 = new ImageView(img00);
            iv0.setFitHeight(300);
            iv0.setFitWidth(300);
            pImage.getChildren().addAll(iv0, eImage);
            pImage.setAlignment(Pos.CENTER);
            pImage.setStyle("-fx-background-color: whitesmoke;" +
                                  "-fx-border-width: 5;" +
                                  "-fx-border-color: #cc5500;" +
                                  "-fx-padding: 10;");
            re.setMaxSize(800, 800);
            re.setStyle("-fx-background-color: #cc5500;" +
                    "-fx-font-size: 2em; " +
                    "-fx-text-fill: #ffffff;" +
                    "-fx-font-weight: BOLD");
            right.setSpacing(20);
            right.getChildren().addAll(pImage, re);
            right.setStyle("-fx-padding: 25;");
        this.setCenter(pInfo);
        this.setRight(right);
        this.setTop(heading);
    }
    
    public void updateHomeView() {
        this.getChildren().clear();
        this.setCenter(pInfo);
        this.setRight(right);
        this.setTop(heading);
    }
    
    public void updateHomeView2(VBox e, Button but) {
        this.getChildren().clear();
        this.setCenter(e);
        this.setBottom(but);
    }
    
    public void updateHomeView3(VBox e, Button but, Button but2) {
        this.getChildren().clear();
        HBox buts = new HBox();
        buts.setStyle("-fx-padding:10;");
        buts.setSpacing(10);
        buts.getChildren().addAll(but, but2);
        this.setCenter(e);
        this.setBottom(buts);
    }
    
    public void updateHomeView4(VBox rec) {
        this.getChildren().clear();
        this.setCenter(rec);
        this.setTop(bBox);
    }
    
    public void updateHomeView5(Image i){
        System.out.println("\nHomeView5 - Image:\n" + i);
        pImage.getChildren().clear();
        Image Nimg = (new Image("/resources/images/profile.png")); ImageView Niv;
        if(i != null)
                Niv = new ImageView(i);
        else
            Niv = new ImageView(Nimg); 
        Niv.setFitHeight(300);
        Niv.setFitWidth(300);
        pImage.getChildren().addAll(Niv, eImage);
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
     * @return the current_un
     */
    public Label getCurrent_un() {
        return current_un;
    }

    /**
     * @param current_un the current_un to set
     */
    public void setCurrent_un(Label current_un) {
        this.current_un = current_un;
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
     * @return the pInfo
     */
    public VBox getpInfo() {
        return pInfo;
    }

    /**
     * @param pInfo the pInfo to set
     */
    public void setpInfo(VBox pInfo) {
        this.pInfo = pInfo;
    }

    /**
     * @return the pImage
     */
    public VBox getpImage() {
        return pImage;
    }

    /**
     * @param pImage the pImage to set
     */
    public void setpImage(VBox pImage) {
        this.pImage = pImage;
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
     * @return the iv3
     */
    public ImageView getIv3() {
        return iv3;
    }

    /**
     * @param iv3 the iv3 to set
     */
    public void setIv3(ImageView iv3) {
        this.iv3 = iv3;
    }

    /**
     * @return the o
     */
    public Button getO() {
        return o;
    }

    /**
     * @param o the o to set
     */
    public void setO(Button o) {
        this.o = o;
    }

    /**
     * @return the personal
     */
    public GridPane getPersonal() {
        return personal;
    }

    /**
     * @param personal the personal to set
     */
    public void setPersonal(GridPane personal) {
        this.personal = personal;
    }

    /**
     * @return the pBox
     */
    public VBox getpBox() {
        return pBox;
    }

    /**
     * @param pBox the pBox to set
     */
    public void setpBox(VBox pBox) {
        this.pBox = pBox;
    }

    /**
     * @return the headingP
     */
    public Label getHeadingP() {
        return headingP;
    }

    /**
     * @param headingP the headingP to set
     */
    public void setHeadingP(Label headingP) {
        this.headingP = headingP;
    }

    /**
     * @return the fname
     */
    public Label getFname() {
        return fname;
    }

    /**
     * @param fname the fname to set
     */
    public void setFname(Label fname) {
        this.fname = fname;
    }

    /**
     * @return the lname
     */
    public Label getLname() {
        return lname;
    }

    /**
     * @param lname the lname to set
     */
    public void setLname(Label lname) {
        this.lname = lname;
    }

    /**
     * @return the gender
     */
    public Label getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(Label gender) {
        this.gender = gender;
    }

    /**
     * @return the add
     */
    public Label getAdd() {
        return add;
    }

    /**
     * @param add the add to set
     */
    public void setAdd(Label add) {
        this.add = add;
    }

    /**
     * @return the st
     */
    public Label getSt() {
        return st;
    }

    /**
     * @param st the st to set
     */
    public void setSt(Label st) {
        this.st = st;
    }

    /**
     * @return the city
     */
    public Label getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(Label city) {
        this.city = city;
    }

    /**
     * @return the zip
     */
    public Label getZip() {
        return zip;
    }

    /**
     * @param zip the zip to set
     */
    public void setZip(Label zip) {
        this.zip = zip;
    }

    /**
     * @return the email
     */
    public Label getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(Label email) {
        this.email = email;
    }

    /**
     * @return the DOB
     */
    public Label getDOB() {
        return DOB;
    }

    /**
     * @param DOB the DOB to set
     */
    public void setDOB(Label DOB) {
        this.DOB = DOB;
    }

    /**
     * @return the current_fname
     */
    public Label getCurrent_fname() {
        return current_fname;
    }

    /**
     * @param current_fname the current_fname to set
     */
    public void setCurrent_fname(Label current_fname) {
        this.current_fname = current_fname;
    }

    /**
     * @return the current_lname
     */
    public Label getCurrent_lname() {
        return current_lname;
    }

    /**
     * @param current_lname the current_lname to set
     */
    public void setCurrent_lname(Label current_lname) {
        this.current_lname = current_lname;
    }

    /**
     * @return the current_gender
     */
    public Label getCurrent_gender() {
        return current_gender;
    }

    /**
     * @param current_gender the current_gender to set
     */
    public void setCurrent_gender(Label current_gender) {
        this.current_gender = current_gender;
    }

    /**
     * @return the current_add
     */
    public Label getCurrent_add() {
        return current_add;
    }

    /**
     * @param current_add the current_add to set
     */
    public void setCurrent_add(Label current_add) {
        this.current_add = current_add;
    }

    /**
     * @return the current_st
     */
    public Label getCurrent_st() {
        return current_st;
    }

    /**
     * @param current_st the current_st to set
     */
    public void setCurrent_st(Label current_st) {
        this.current_st = current_st;
    }

    /**
     * @return the current_city
     */
    public Label getCurrent_city() {
        return current_city;
    }

    /**
     * @param current_city the current_city to set
     */
    public void setCurrent_city(Label current_city) {
        this.current_city = current_city;
    }

    /**
     * @return the current_zip
     */
    public Label getCurrent_zip() {
        return current_zip;
    }

    /**
     * @param current_zip the current_zip to set
     */
    public void setCurrent_zip(Label current_zip) {
        this.current_zip = current_zip;
    }

    /**
     * @return the current_email
     */
    public Label getCurrent_email() {
        return current_email;
    }

    /**
     * @param current_email the current_email to set
     */
    public void setCurrent_email(Label current_email) {
        this.current_email = current_email;
    }

    /**
     * @return the current_DOB
     */
    public Label getCurrent_DOB() {
        return current_DOB;
    }

    /**
     * @param current_DOB the current_DOB to set
     */
    public void setCurrent_DOB(Label current_DOB) {
        this.current_DOB = current_DOB;
    }

    /**
     * @return the ePersonal
     */
    public Button getePersonal() {
        return ePersonal;
    }

    /**
     * @param ePersonal the ePersonal to set
     */
    public void setePersonal(Button ePersonal) {
        this.ePersonal = ePersonal;
    }

    /**
     * @return the medical
     */
    public GridPane getMedical() {
        return medical;
    }

    /**
     * @param medical the medical to set
     */
    public void setMedical(GridPane medical) {
        this.medical = medical;
    }

    /**
     * @return the mBox
     */
    public VBox getmBox() {
        return mBox;
    }

    /**
     * @param mBox the mBox to set
     */
    public void setmBox(VBox mBox) {
        this.mBox = mBox;
    }

    /**
     * @return the headingM
     */
    public Label getHeadingM() {
        return headingM;
    }

    /**
     * @param headingM the headingM to set
     */
    public void setHeadingM(Label headingM) {
        this.headingM = headingM;
    }

    /**
     * @return the height
     */
    public Label getLHeight(){
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(Label height) {
        this.height = height;
    }

    /**
     * @return the hFt
     */
    public Label gethFt() {
        return hFt;
    }

    /**
     * @param hFt the hFt to set
     */
    public void sethFt(Label hFt) {
        this.hFt = hFt;
    }

    /**
     * @return the hIn
     */
    public Label gethIn() {
        return hIn;
    }

    /**
     * @param hIn the hIn to set
     */
    public void sethIn(Label hIn) {
        this.hIn = hIn;
    }

    /**
     * @return the weight
     */
    public Label getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(Label weight) {
        this.weight = weight;
    }

    /**
     * @return the wLbs
     */
    public Label getwLbs() {
        return wLbs;
    }

    /**
     * @param wLbs the wLbs to set
     */
    public void setwLbs(Label wLbs) {
        this.wLbs = wLbs;
    }

    /**
     * @return the current_hFt
     */
    public Label getCurrent_hFt() {
        return current_hFt;
    }

    /**
     * @param current_hFt the current_hFt to set
     */
    public void setCurrent_hFt(Label current_hFt) {
        this.current_hFt = current_hFt;
    }

    /**
     * @return the current_hIn
     */
    public Label getCurrent_hIn() {
        return current_hIn;
    }

    /**
     * @param current_hIn the current_hIn to set
     */
    public void setCurrent_hIn(Label current_hIn) {
        this.current_hIn = current_hIn;
    }

    /**
     * @return the current_weight
     */
    public Label getCurrent_weight() {
        return current_weight;
    }

    /**
     * @param current_weight the current_weight to set
     */
    public void setCurrent_weight(Label current_weight) {
        this.current_weight = current_weight;
    }

    /**
     * @return the eMedical
     */
    public Button geteMedical() {
        return eMedical;
    }

    /**
     * @param eMedical the eMedical to set
     */
    public void seteMedical(Button eMedical) {
        this.eMedical = eMedical;
    }

    /**
     * @return the right
     */
    public VBox getR() {
        return right;
    }

    /**
     * @param right the right to set
     */
    public void setR(VBox right) {
        this.right = right;
    }

    /**
     * @return the eImage
     */
    public Button geteImage() {
        return eImage;
    }

    /**
     * @param eImage the eImage to set
     */
    public void seteImage(Button eImage) {
        this.eImage = eImage;
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
     * @return the disHead
     */
    public Label getDisHead() {
        return disHead;
    }

    /**
     * @param disHead the disHead to set
     */
    public void setDisHead(Label disHead) {
        this.disHead = disHead;
    }

    /**
     * @return the disList
     */
    public HBox getDisList() {
        return disList;
    }

    /**
     * @param disList the disList to set
     */
    public void setDisList(HBox disList) {
        this.disList = disList;
    }

    /**
     * @return the allList
     */
    public HBox getAllList() {
        return allList;
    }

    /**
     * @param allList the allList to set
     */
    public void setAllList(HBox allList) {
        this.allList = allList;
    }

    /**
     * @return the allHead
     */
    public Label getAllHead() {
        return allHead;
    }

    /**
     * @param allHead the allHead to set
     */
    public void setAllHead(Label allHead) {
        this.allHead = allHead;
    }

    /**
     * @return the mesurements
     */
    public HBox getMesurements() {
        return mesurements;
    }

    /**
     * @param mesurements the mesurements to set
     */
    public void setMesurements(HBox mesurements) {
        this.mesurements = mesurements;
    }

    /**
     * @return the current_h
     */
    public HBox getCurrent_h() {
        return current_h;
    }

    /**
     * @param current_h the current_h to set
     */
    public void setCurrent_h(HBox current_h) {
        this.current_h = current_h;
    }

    /**
     * @return the hBox
     */
    public VBox gethBox() {
        return hBox;
    }

    /**
     * @param hBox the hBox to set
     */
    public void sethBox(VBox hBox) {
        this.hBox = hBox;
    }

    /**
     * @return the current_w
     */
    public HBox getCurrent_w() {
        return current_w;
    }

    /**
     * @param current_w the current_w to set
     */
    public void setCurrent_w(HBox current_w) {
        this.current_w = current_w;
    }

    /**
     * @return the wBox
     */
    public VBox getwBox() {
        return wBox;
    }

    /**
     * @param wBox the wBox to set
     */
    public void setwBox(VBox wBox) {
        this.wBox = wBox;
    }

    /**
     * @param re the r to set
     */
    public void setRe(Button re) {
        this.re = re;
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
     * @return the re
     */
    public Button getRe() {
        return re;
    }

    /**
     * @return the im
     */
    public byte[] getIm() {
        return im;
    }

    /**
     * @param im the im to set
     */
    public void setIm(byte[] im) {
        this.im = im;
    }

    /**
     * @return the o2
     */
    public Button getO2() {
        return o2;
    }

    /**
     * @param o2 the o2 to set
     */
    public void setO2(Button o2) {
        this.o2 = o2;
    }

    /**
     * @return the bBox
     */
    public HBox getbBox() {
        return bBox;
    }

    /**
     * @param bBox the bBox to set
     */
    public void setbBox(HBox bBox) {
        this.bBox = bBox;
    }

    /**
     * @return the o3
     */
    public Button getO3() {
        return o3;
    }

    /**
     * @param o3 the o3 to set
     */
    public void setO3(Button o3) {
        this.o3 = o3;
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
     
}
