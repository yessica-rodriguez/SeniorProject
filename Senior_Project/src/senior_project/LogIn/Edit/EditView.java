/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senior_project.LogIn.Edit;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.*;

/**
 *
 * @author yessi
 */
public class EditView extends VBox{

    /**
     * @return the pPic
     */
    public VBox getpPic() {
        return pPic;
    }

    /**
     * @param pPic the pPic to set
     */
    public void setpPic(VBox pPic) {
        this.pPic = pPic;
    }

    /**
     * @return the u
     */
    public Button getU() {
        return u;
    }

    /**
     * @param u the u to set
     */
    public void setU(Button u) {
        this.u = u;
    }

    /**
     * @return the image
     */
    public Image getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(Image image) {
        this.image = image;
    }

    /**
     * @return the iv
     */
    public ImageView getIv() {
        return iv;
    }

    /**
     * @param iv the iv to set
     */
    public void setIv(ImageView iv) {
        this.iv = iv;
    }
    
    VBox dis = new VBox();
    VBox dis2 = new VBox();
    private Label w = new Label();
    private HBox heading = new HBox(); 
    
    //Personal
        private GridPane personal = new GridPane();
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
        private TextField current_fname = new TextField();
        private TextField current_lname = new TextField();
        private TextField current_gender = new TextField();
        private TextField current_add = new TextField();
        private TextField current_st = new TextField();
        private TextField current_city = new TextField();
        private TextField current_zip = new TextField();
        private TextField current_email = new TextField();
        private TextField current_DOB = new TextField();
    //Medical
        private GridPane medical = new GridPane();
        private VBox mBox = new VBox();
        private Label headingM = new Label("Medical");
        private Label height = new Label("Height");
        private Label hFt = new Label("ft");
        private Label hIn = new Label("in");
        private Label weight = new Label("Weight");
        private Label wLbs = new Label("lbs");
        private TextField current_hFt = new TextField();
        private TextField current_hIn = new TextField();
        private TextField current_weight = new TextField();
        private HBox mesurements = new HBox();
        private HBox current_h = new HBox();
        private VBox hBox = new VBox();
        private HBox current_w = new HBox();
        private VBox wBox = new VBox();
        private Label disHead = new Label("Diseases");
        private Label allHead = new Label("Allergies");
        private HBox disList = new HBox();
            private GridPane Disease = new GridPane();
            private CheckBox dise1 = new CheckBox("Diabetes");
            private CheckBox dise2 = new CheckBox("Celiac");
            private CheckBox dise3 = new CheckBox("High Cholesterol");
            private CheckBox dise4 = new CheckBox("Chronic Kidney");
            private CheckBox dise5 = new CheckBox("Gout");
            private CheckBox dise6 = new CheckBox("High Blood Pressure");
        private HBox allList = new HBox();
            private GridPane Allergy = new GridPane();
            private CheckBox all1 = new CheckBox("Diary");
            private CheckBox all2 = new CheckBox("Soy");
            private CheckBox all3 = new CheckBox("Egg");
            private CheckBox all4 = new CheckBox("Peanut");
            private CheckBox all5 = new CheckBox("Fish");
            private CheckBox all6 = new CheckBox("Wheat");
            private CheckBox all7 = new CheckBox("Fructans");
            private CheckBox all8 = new CheckBox("Sesame");
            private CheckBox all9 = new CheckBox("Gluten");
            private CheckBox all10 = new CheckBox("Lactose");
            private CheckBox all11 = new CheckBox("Fructose");
            private CheckBox all12 = new CheckBox("Sulfites");
            private CheckBox all13 = new CheckBox("Histamines");
            private CheckBox all14 = new CheckBox("Nitrites");
            private CheckBox all15 = new CheckBox("Night Shades");
    //New Profile Picture
        private VBox pPic = new VBox();
        private Button u = new Button("Upload Image");
        private Image image;
        private ImageView iv;
            
            
    public EditView(String m)     
    {
        this.getChildren().clear();
        w.setText("Edit Account Information");
        w.setFont(Font.font("Tahoma", FontWeight.BOLD, 80));
        w.setTextFill(Color.web("#ffffff"));
        heading.getChildren().add(w);
        heading.setAlignment(Pos.CENTER);
        heading.setStyle("-fx-background-color: #cc5500;");
        dis.getChildren().clear();
        dis.setStyle("-fx-background-color: whitesmoke;" +
                          "-fx-border-width: 5;" +
                          "-fx-border-color: #cc5500;" +
                          "-fx-padding: 20;");
        headingP.setFont(Font.font("Tahoma", FontWeight.BOLD, 20));
        headingM.setFont(Font.font("Tahoma", FontWeight.BOLD, 20));
        if(m.compareTo("P") == 0){
            PersonalEdit();
            dis.getChildren().addAll(headingP, personal);
        }
        else if(m.compareTo("M") == 0){
            MedicalEdit();
            dis.getChildren().addAll(headingM, medical);
        }
        else{
            PPicEdit();
            dis.getChildren().addAll(pPic);
        }
        dis.setSpacing(10);
        dis.setMaxSize(1250, 1000);
        dis2.getChildren().add(dis);
        dis2.setAlignment(Pos.CENTER);
        dis2.setStyle("-fx-padding: 150;");
        this.setSpacing(10);
        this.getChildren().addAll(heading, dis2);
    }
    
    private void PersonalEdit(){
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
    }
    
    private void MedicalEdit() {
        disHead.setFont(Font.font("Tahoma", FontWeight.BOLD, 15));
        disList.setSpacing(30);
        Disease.setHgap(50);
        Disease.setVgap(10);
        Disease.add(getDise1(), 0, 0); Disease.add(getDise2(), 1, 0); Disease.add(getDise3(), 2, 0);
        Disease.add(getDise4(), 0, 1); Disease.add(getDise5(), 1, 1); Disease.add(getDise6(), 2, 1);        
        disList.getChildren().add(Disease);
        allHead.setFont(Font.font("Tahoma", FontWeight.BOLD, 15));
        allList.setSpacing(30);
        Allergy.setHgap(50);
        Allergy.setVgap(10);
        Allergy.add(getAll1(), 0, 0);    getAllergy().add(getAll8(), 0, 1);
        Allergy.add(getAll2(), 1, 0);    getAllergy().add(getAll9(), 1, 1);
        Allergy.add(getAll3(), 2, 0);    getAllergy().add(getAll10(), 2, 1);
        Allergy.add(getAll4(), 3, 0);    getAllergy().add(getAll11(), 3, 1);
        Allergy.add(getAll5(), 4, 0);    getAllergy().add(getAll12(), 4, 1);
        Allergy.add(getAll6(), 5, 0);    getAllergy().add(getAll13(), 5, 1);
        Allergy.add(getAll7(), 6, 0);    getAllergy().add(getAll14(), 6, 1);
        Allergy.add(getAll15(), 7, 0);
        allList.getChildren().add(getAllergy());
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
    }
    
    public void PPicEdit(){
        pPic.getChildren().clear();
        pPic.getChildren().add(u);
        pPic.setSpacing(20);
    }
    
    public void updatePPicEdit(Image i){
        pPic.getChildren().clear();
        iv = new ImageView(i);
        iv.setFitHeight(300);
        iv.setFitWidth(300);
        pPic.getChildren().addAll(iv, u);
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
    public TextField getCurrent_fname() {
        return current_fname;
    }

    /**
     * @param current_fname the current_fname to set
     */
    public void setCurrent_fname(TextField current_fname) {
        this.current_fname = current_fname;
    }

    /**
     * @return the current_lname
     */
    public TextField getCurrent_lname() {
        return current_lname;
    }

    /**
     * @param current_lname the current_lname to set
     */
    public void setCurrent_lname(TextField current_lname) {
        this.current_lname = current_lname;
    }

    /**
     * @return the current_gender
     */
    public TextField getCurrent_gender() {
        return current_gender;
    }

    /**
     * @param current_gender the current_gender to set
     */
    public void setCurrent_gender(TextField current_gender) {
        this.current_gender = current_gender;
    }

    /**
     * @return the current_add
     */
    public TextField getCurrent_add() {
        return current_add;
    }

    /**
     * @param current_add the current_add to set
     */
    public void setCurrent_add(TextField current_add) {
        this.current_add = current_add;
    }

    /**
     * @return the current_st
     */
    public TextField getCurrent_st() {
        return current_st;
    }

    /**
     * @param current_st the current_st to set
     */
    public void setCurrent_st(TextField current_st) {
        this.current_st = current_st;
    }

    /**
     * @return the current_city
     */
    public TextField getCurrent_city() {
        return current_city;
    }

    /**
     * @param current_city the current_city to set
     */
    public void setCurrent_city(TextField current_city) {
        this.current_city = current_city;
    }

    /**
     * @return the current_zip
     */
    public TextField getCurrent_zip() {
        return current_zip;
    }

    /**
     * @param current_zip the current_zip to set
     */
    public void setCurrent_zip(TextField current_zip) {
        this.current_zip = current_zip;
    }

    /**
     * @return the current_email
     */
    public TextField getCurrent_email() {
        return current_email;
    }

    /**
     * @param current_email the current_email to set
     */
    public void setCurrent_email(TextField current_email) {
        this.current_email = current_email;
    }

    /**
     * @return the current_DOB
     */
    public TextField getCurrent_DOB() {
        return current_DOB;
    }

    /**
     * @param current_DOB the current_DOB to set
     */
    public void setCurrent_DOB(TextField current_DOB) {
        this.current_DOB = current_DOB;
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
    public Label getHei() {
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
    public TextField getCurrent_hFt() {
        return current_hFt;
    }

    /**
     * @param current_hFt the current_hFt to set
     */
    public void setCurrent_hFt(TextField current_hFt) {
        this.current_hFt = current_hFt;
    }

    /**
     * @return the current_hIn
     */
    public TextField getCurrent_hIn() {
        return current_hIn;
    }

    /**
     * @param current_hIn the current_hIn to set
     */
    public void setCurrent_hIn(TextField current_hIn) {
        this.current_hIn = current_hIn;
    }

    /**
     * @return the current_weight
     */
    public TextField getCurrent_weight() {
        return current_weight;
    }

    /**
     * @param current_weight the current_weight to set
     */
    public void setCurrent_weight(TextField current_weight) {
        this.current_weight = current_weight;
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
     * @return the Disease
     */
    public GridPane getDisease() {
        return Disease;
    }

    /**
     * @param Disease the Disease to set
     */
    public void setDisease(GridPane Disease) {
        this.Disease = Disease;
    }

    /**
     * @return the dise1
     */
    public CheckBox getDise1() {
        return dise1;
    }

    /**
     * @param dise1 the dise1 to set
     */
    public void setDise1(CheckBox dise1) {
        this.dise1 = dise1;
    }

    /**
     * @return the dise2
     */
    public CheckBox getDise2() {
        return dise2;
    }

    /**
     * @param dise2 the dise2 to set
     */
    public void setDise2(CheckBox dise2) {
        this.dise2 = dise2;
    }

    /**
     * @return the dise3
     */
    public CheckBox getDise3() {
        return dise3;
    }

    /**
     * @param dise3 the dise3 to set
     */
    public void setDise3(CheckBox dise3) {
        this.dise3 = dise3;
    }

    /**
     * @return the dise4
     */
    public CheckBox getDise4() {
        return dise4;
    }

    /**
     * @param dise4 the dise4 to set
     */
    public void setDise4(CheckBox dise4) {
        this.dise4 = dise4;
    }

    /**
     * @return the dise5
     */
    public CheckBox getDise5() {
        return dise5;
    }

    /**
     * @param dise5 the dise5 to set
     */
    public void setDise5(CheckBox dise5) {
        this.dise5 = dise5;
    }

    /**
     * @return the dise6
     */
    public CheckBox getDise6() {
        return dise6;
    }

    /**
     * @param dise6 the dise6 to set
     */
    public void setDise6(CheckBox dise6) {
        this.dise6 = dise6;
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
     * @return the Allergy
     */
    public GridPane getAllergy() {
        return Allergy;
    }

    /**
     * @param Allergy the Allergy to set
     */
    public void setAllergy(GridPane Allergy) {
        this.Allergy = Allergy;
    }

    /**
     * @return the all1
     */
    public CheckBox getAll1() {
        return all1;
    }

    /**
     * @param all1 the all1 to set
     */
    public void setAll1(CheckBox all1) {
        this.all1 = all1;
    }

    /**
     * @return the all2
     */
    public CheckBox getAll2() {
        return all2;
    }

    /**
     * @param all2 the all2 to set
     */
    public void setAll2(CheckBox all2) {
        this.all2 = all2;
    }

    /**
     * @return the all3
     */
    public CheckBox getAll3() {
        return all3;
    }

    /**
     * @param all3 the all3 to set
     */
    public void setAll3(CheckBox all3) {
        this.all3 = all3;
    }

    /**
     * @return the all4
     */
    public CheckBox getAll4() {
        return all4;
    }

    /**
     * @param all4 the all4 to set
     */
    public void setAll4(CheckBox all4) {
        this.all4 = all4;
    }

    /**
     * @return the all5
     */
    public CheckBox getAll5() {
        return all5;
    }

    /**
     * @param all5 the all5 to set
     */
    public void setAll5(CheckBox all5) {
        this.all5 = all5;
    }

    /**
     * @return the all6
     */
    public CheckBox getAll6() {
        return all6;
    }

    /**
     * @param all6 the all6 to set
     */
    public void setAll6(CheckBox all6) {
        this.all6 = all6;
    }

    /**
     * @return the all7
     */
    public CheckBox getAll7() {
        return all7;
    }

    /**
     * @param all7 the all7 to set
     */
    public void setAll7(CheckBox all7) {
        this.all7 = all7;
    }

    /**
     * @return the all8
     */
    public CheckBox getAll8() {
        return all8;
    }

    /**
     * @param all8 the all8 to set
     */
    public void setAll8(CheckBox all8) {
        this.all8 = all8;
    }

    /**
     * @return the all9
     */
    public CheckBox getAll9() {
        return all9;
    }

    /**
     * @param all9 the all9 to set
     */
    public void setAll9(CheckBox all9) {
        this.all9 = all9;
    }

    /**
     * @return the all10
     */
    public CheckBox getAll10() {
        return all10;
    }

    /**
     * @param all10 the all10 to set
     */
    public void setAll10(CheckBox all10) {
        this.all10 = all10;
    }

    /**
     * @return the all11
     */
    public CheckBox getAll11() {
        return all11;
    }

    /**
     * @param all11 the all11 to set
     */
    public void setAll11(CheckBox all11) {
        this.all11 = all11;
    }

    /**
     * @return the all12
     */
    public CheckBox getAll12() {
        return all12;
    }

    /**
     * @param all12 the all12 to set
     */
    public void setAll12(CheckBox all12) {
        this.all12 = all12;
    }

    /**
     * @return the all13
     */
    public CheckBox getAll13() {
        return all13;
    }

    /**
     * @param all13 the all13 to set
     */
    public void setAll13(CheckBox all13) {
        this.all13 = all13;
    }

    /**
     * @return the all14
     */
    public CheckBox getAll14() {
        return all14;
    }

    /**
     * @param all14 the all14 to set
     */
    public void setAll14(CheckBox all14) {
        this.all14 = all14;
    }

    /**
     * @return the all15
     */
    public CheckBox getAll15() {
        return all15;
    }

    /**
     * @param all15 the all15 to set
     */
    public void setAll15(CheckBox all15) {
        this.all15 = all15;
    }
    
    
}
