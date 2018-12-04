/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senior_project.Info;

import java.util.ArrayList;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javafx.event.ActionEvent;

/**
 *
 * @author yessi
 */
public class InfoController {
    ArrayList<SourceInfo> myList = new ArrayList(); 
    private InfoModel infoModel; 
    private InfoView infoView;

    public InfoController(InfoModel infoModel, InfoView infoView) 
    {
        this.infoModel = infoModel;
        this.infoView = infoView;
        setupHandlers();
    }
    
    public void setupHandlers()
    {
        myList = infoModel.getSources();
        //Hyperlinks
        infoView.getHyperlink1().setText(myList.get(0).getWebsiteURL());
        infoView.getHyperlink2().setText(myList.get(1).getWebsiteURL());
        infoView.getHyperlink3().setText(myList.get(2).getWebsiteURL());
        infoView.getHyperlink4().setText(myList.get(3).getWebsiteURL());
        infoView.getHyperlink5().setText(myList.get(4).getWebsiteURL());
        infoView.getHyperlink6().setText(myList.get(5).getWebsiteURL());
        infoView.getHyperlink7().setText(myList.get(6).getWebsiteURL());
        infoView.getHyperlink8().setText(myList.get(7).getWebsiteURL());
        infoView.getHyperlink9().setText(myList.get(8).getWebsiteURL());
        //buttons
        infoView.getHyperlink1().setOnAction((ActionEvent event) -> {
            OPENwebsite(myList.get(0).getWebsiteURL());
        });
        infoView.getHyperlink2().setOnAction((ActionEvent event) -> {
            OPENwebsite(myList.get(1).getWebsiteURL());
        });
        infoView.getHyperlink3().setOnAction((ActionEvent event) -> {
            OPENwebsite(myList.get(2).getWebsiteURL());
        });
        infoView.getHyperlink4().setOnAction((ActionEvent event) -> {
            OPENwebsite(myList.get(3).getWebsiteURL());
        });
        infoView.getHyperlink5().setOnAction((ActionEvent event) -> {
            OPENwebsite(myList.get(4).getWebsiteURL());
        });
        infoView.getHyperlink6().setOnAction((ActionEvent event) -> {
            OPENwebsite(myList.get(5).getWebsiteURL());
        });
        infoView.getHyperlink7().setOnAction((ActionEvent event) -> {
            OPENwebsite(myList.get(6).getWebsiteURL());
        });
        infoView.getHyperlink8().setOnAction((ActionEvent event) -> {
            OPENwebsite(myList.get(7).getWebsiteURL());
        });
        infoView.getHyperlink9().setOnAction((ActionEvent event) -> {
            OPENwebsite(myList.get(8).getWebsiteURL());
        });
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
     * @return the infoModel
     */
    public InfoModel getModel() {
        return infoModel;
    }

    /**
     * @param infoModel the infoModel to set
     */
    public void setModel(InfoModel infoModel) {
        this.infoModel = infoModel;
    }

    /**
     * @return the infoView
     */
    public InfoView getView() {
        return infoView;
    }

    /**
     * @param infoView the infoView to set
     */
    public void setView(InfoView infoView) {
        this.infoView = infoView;
    }
}
