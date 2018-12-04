/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senior_project.Diet;

import javafx.event.ActionEvent;
import senior_project.Diet.CalorieCalculator.CalorieController;
import senior_project.Diet.Categories.CategoriesController;
import senior_project.Diet.Search.SearchController;

/**
 *
 * @author yessi
 */
public class DietController {
    
    SearchController search = new SearchController();
    CalorieController calorieCal = new CalorieController();
    CategoriesController categories = new CategoriesController();
    
    private DietModel dietModel;
    private DietView  dietView; 

    public DietController(DietModel dietModel , DietView dietView) 
    {
        this.dietModel  = dietModel;
        this.dietView   = dietView;          
        setupHandlers();
    }
    
    public DietController() 
    {
        this.dietModel  = new DietModel();
        this.dietView   = new DietView();          
        setupHandlers();
    }

    private void setupHandlers()
    {
        dietView.getS().setOnAction((ActionEvent event) -> {
           dietView.updateDietView2(search.getView());
        });
        dietView.getCal().setOnAction((ActionEvent event) -> {
           dietView.updateDietView2(calorieCal.getView());
        });
        dietView.getCat().setOnAction((ActionEvent event) -> {
           dietView.updateDietView2(categories.getCategoriesView());
        });
        dietView.getB().setOnAction((ActionEvent event) -> {
           dietView.updateDietView();
        });
    }

    /**
     * @return the dietModel
     */
    public DietModel getDietModel() {
        return dietModel;
    }

    /**
     * @param dietModel the dietModel to set
     */
    public void setDietModel(DietModel dietModel) {
        this.dietModel = dietModel;
    }

    /**
     * @return the dietView
     */
    public DietView getDietView() {
        return dietView;
    }

    /**
     * @param dietView the dietView to set
     */
    public void setDietView(DietView dietView) {
        this.dietView = dietView;
    }

}
