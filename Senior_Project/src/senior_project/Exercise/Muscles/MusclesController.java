/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senior_project.Exercise.Muscles;

import java.awt.Desktop;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import senior_project.Exercise.Exercise;

/**
 *
 * @author yessi
 */
public class MusclesController {
    
    Exercise ex = new Exercise();
    
    private MusclesModel musclesModel; 
    private MusclesView musclesView;

    public MusclesController(MusclesModel musclesModel, MusclesView musclesView) 
    {
        this.musclesModel = musclesModel;
        this.musclesView = musclesView;
        setupHandlers();
    }
    
    public MusclesController() 
    {
        this.musclesModel = new MusclesModel();
        this.musclesView  = new MusclesView();
        setupHandlers();
    }
    
    public void setupHandlers()
    {
        DrawVBox(musclesView.getList(), musclesModel.getNumMus());
        musclesView.getB().setOnAction((ActionEvent event) -> {
            musclesView.updateMusclesView();
        });
    }
    
    
    public void DrawVBox(HBox b, int num){
        while(num > 0){
            b.getChildren().add(DrawHBox(num));
            num = num - 10;
        }
    }
    
    private VBox DrawHBox(int num){
        VBox d = new VBox();
        d.setSpacing(20);
        int count = 1;
        while(count < 10){
            if(num != 0){
                d.getChildren().add(DrawB(num));
            }
            else
                break;
            num--;
            count++;
        }
        return d;
    }
    
    private Button DrawB(int num){
        Button l = new Button();
        if(num > 0){
            l.setText(musclesModel.getName(num));
            l.setOnAction((ActionEvent event) -> {
                musclesView.getElist().getChildren().clear();
                musclesView.getW().setText(musclesModel.getName(num));
                try {
                    DrawEVBox(musclesView.getElist(), num, ex.getNumEx("M", num));
                } catch (IOException ex) {
                    Logger.getLogger(MusclesController.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(MusclesController.class.getName()).log(Level.SEVERE, null, ex);
                }
                musclesView.updateMusclesView2();
            });
        }
        l.setMaxSize(500, 500);
        l.setStyle(
                    "-fx-font-size: 2em; " +
                    "-fx-font-weight: BOLD");
        return l;
    }
    
    public void DrawEVBox(VBox b, int num, int t) throws IOException, SQLException{
        int[] id = ex.getId("M", num, t);
        Image img00;
        //Image img01 = new Image("databaseImage.jpg");
        ImageView iv0;
        //ImageView iv1 = new ImageView(img01);
        int index = 0;
        while(t > 0){
            if(t != 0){
                String name = ex.getName(id[index]);
                String link = ex.getIlink(id[index]);
                Hyperlink source = new Hyperlink("Source");
                    source.setOnAction((ActionEvent event) -> {
                    OPENwebsite(link); 
                });
                VBox pic = new VBox();
                byte[] bl = ex.isIm(id[index]);
                if(bl != null){
                    img00 = new Image(new ByteArrayInputStream(bl));
                }
                else
                    img00 = new Image("/resources/images/notFound.jpg");
                iv0 = new ImageView(img00);
                pic.getChildren().addAll(iv0, source);
                VBox einf = new VBox(); 
                Label bu = new Label();
                bu.setText(name);
                //bu.setMaxSize(700, 400);
                bu.setStyle(
                    "-fx-font-size: 2em; " +
                    "-fx-font-weight: BOLD");
                Label des = new Label(ex.getDescription(id[index]));
                des.setWrapText(true);
                //VBox des = new VBox();
                //des.setMaxSize(100, 2000);
                //des.getChildren().add(d);
                String link2 = ex.getDlink(id[index]);
                Hyperlink source2 = new Hyperlink("Source");
                    source2.setOnAction((ActionEvent event) -> {
                    OPENwebsite(link2); 
                });
                einf.getChildren().addAll(bu, des, source2);
                HBox e = new HBox();
                e.setSpacing(10);
                e.setPrefWidth(2500);
                e.getChildren().addAll(pic, einf);
                e.setStyle(
                    "-fx-border-color: #000000;" +
                    "-fx-border-width: 3;");
                b.getChildren().add(e);
                t--;
                index++;
            }
            else
                break;
        }      
    }
    
    public void OPENwebsite(String u){
        try {
                Desktop.getDesktop().browse(new URI(u));
            } catch (IOException e1) {
                e1.printStackTrace();
            } catch (URISyntaxException e1) {
                e1.printStackTrace();
            }
    }
    

    /**
     * @return the musclesModel
     */
    public MusclesModel getMusclesModel() {
        return musclesModel;
    }

    /**
     * @param musclesModel the musclesModel to set
     */
    public void setMusclesModel(MusclesModel MusclesModel) {
        this.musclesModel = MusclesModel;
    }

    /**
     * @return the musclesView
     */
    public MusclesView getMusclesView() {
        return musclesView;
    }

    /**
     * @param musclesView the musclesView to set
     */
    public void setMusclesView(MusclesView musclesView) {
        this.musclesView = musclesView;
    }
    
}
