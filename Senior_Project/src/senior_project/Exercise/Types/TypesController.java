/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senior_project.Exercise.Types;

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
public class TypesController {
    
    Exercise ex = new Exercise();
    
    private TypesModel typesModel; 
    private TypesView typesView;

    public TypesController(TypesModel typesModel, TypesView typesView) 
    {
        this.typesModel = typesModel;
        this.typesView = typesView;
        setupHandlers();
    }
    
    public TypesController() 
    {
        this.typesModel = new TypesModel();
        this.typesView  = new TypesView();
        setupHandlers();
    }
    
    public void setupHandlers()
    {
        DrawVBox(typesView.getList(), typesModel.getNumDis());
        typesView.getB().setOnAction((ActionEvent event) -> {
            typesView.updateTypesView();
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
            l.setText(typesModel.getName(num));
            l.setOnAction((ActionEvent event) -> {
                typesView.getElist().getChildren().clear();
                typesView.getW().setText(typesModel.getName(num));
                try {
                    DrawEVBox(typesView.getElist(), num, ex.getNumEx("T", num));
                } catch (IOException ex) {
                    Logger.getLogger(TypesController.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(TypesController.class.getName()).log(Level.SEVERE, null, ex);
                }
                typesView.updateTypesView2();
            });
        }
        l.setMaxSize(500, 500);
        l.setStyle(
                    "-fx-font-size: 2em; " +
                    "-fx-font-weight: BOLD");
        return l;
    }
    
    public void DrawEVBox(VBox b, int num, int t) throws IOException, SQLException{
        int[] id = ex.getId("T", num, t);
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
     * @return the typesModel
     */
    public TypesModel getTypesModel() {
        return typesModel;
    }

    /**
     * @param typesModel the typesModel to set
     */
    public void setTypesModel(TypesModel typesModel) {
        this.typesModel = typesModel;
    }

    /**
     * @return the typesView
     */
    public TypesView getTypesView() {
        return typesView;
    }

    /**
     * @param typesView the typesView to set
     */
    public void setTypesView(TypesView typesView) {
        this.typesView = typesView;
    }
    
}
