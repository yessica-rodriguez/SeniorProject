/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senior_project.Diet.Search;

import javafx.event.ActionEvent;
import senior_project.Diet.Food;

/**
 *
 * @author yessi
 */
public class SearchController {
    SearchModel foodModel; 
    SearchView foodView;
    
    Food f = new Food();

    public SearchController(SearchModel foodModel, SearchView foodView) 
    {
        this.foodModel = foodModel;
        this.foodView = foodView;
        setupHandlers();
    }
    
    public SearchController() 
    {
        this.foodModel = new SearchModel();
        this.foodView  = new SearchView();
        setupHandlers();
    }
    
    public void setupHandlers()
    {
       foodView.getUpdateButton().setOnAction((ActionEvent event) -> {
           //
           //view gave me name
           String name = getsearchname();
           
           //name gave me data
           int id = foodModel.getId(name);
           f.getInfo(id);
           byte[] ImageName = f.getImage();
           int group = f.getFoodGroup();
           double serving = f.getServing();
           double calories = f.getCalories();
           double totalFat = f.getTotalFat();
           double cholesterol = f.getCholesterol();
           double sodium = f.getSodium();
           double potassium = f.getPotassium();
           double carbohydrates = f.getCarbohydrates();
           double proteins = f.getProteins();
           
           //data updates the view
           foodView.setGr(group);
           foodView.setIm(ImageName);
           switch (group) {
               case 1:
                   foodView.getGroupText().setText("Fruits");
                   break;
               case 2:
                   foodView.getGroupText().setText("Grains");
                   break;
               case 3:
                   foodView.getGroupText().setText("Dairy");
                   break;
               case 4:
                   foodView.getGroupText().setText("Protein");
                   break;
               case 5:
                   foodView.getGroupText().setText("Fats and oils");
                   break;
               case 6:
                   foodView.getGroupText().setText("Vegetables");
                   break;
               default:
                   break;
           }
           foodView.getServingText().setText(Double.toString(serving));
           foodView.getCaloriesText().setText(Double.toString(calories));
           foodView.getTotalFatText().setText(Double.toString(totalFat));
           foodView.getCholesterolText().setText(Double.toString(cholesterol));
           foodView.getSodiumText().setText(Double.toString(sodium));
           foodView.getPotassiumText().setText(Double.toString(potassium));
           foodView.getCarbohydratesText().setText(Double.toString(carbohydrates));
           foodView.getProteinsText().setText(Double.toString(proteins));
           //
           foodView.updateSearchView();
       });
        
    }
    
    public String getsearchname()
    {
       String name = foodView.getNameText().getText();
       return name;
    }
    
    /**
     * @return the Model
     */
    public SearchModel getModel() {
        return foodModel;
    }

    /**
     * @param SearchModel the Model to set
     */
    public void setModel(SearchModel foodModel) {
        this.foodModel = foodModel;
    }

    /**
     * @return the View
     */
    public SearchView getView() {
        return foodView;
    }

    /**
     * @param View the View to set
     */
    public void setView(SearchView foodView) {
        this.foodView = foodView;
    }
    
}
