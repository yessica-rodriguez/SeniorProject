/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senior_project.LogIn.Recommendations;

/**
 *
 * @author yessi
 */
public class RecommendationsController {

    private RecommendationsModel recommendationsModel; 
    private RecommendationsView recommendationsView;

    public RecommendationsController(RecommendationsModel recommendationsModel, RecommendationsView recommendationsView) 
    {
        this.recommendationsModel = recommendationsModel;
        this.recommendationsView = recommendationsView;
        setupHandlers();
    }
    
    public RecommendationsController() 
    {
        this.recommendationsModel = new RecommendationsModel();
        this.recommendationsView  = new RecommendationsView();
        setupHandlers();
    }
    
    public void setupHandlers()
    {
        //buttons
    }

    /**
     * @return the recommendationsModel
     */
    public RecommendationsModel getRecommendationsModel() {
        return recommendationsModel;
    }

    /**
     * @param recommendationsModel the recommendationsModel to set
     */
    public void setRecommendationsModel(RecommendationsModel recommendationsModel) {
        this.recommendationsModel = recommendationsModel;
    }

    /**
     * @return the recommendationsView
     */
    public RecommendationsView getRecommendationsView() {
        return recommendationsView;
    }

    /**
     * @param recommendationsView the recommendationsView to set
     */
    public void setRecommendationsView(RecommendationsView recommendationsView) {
        this.recommendationsView = recommendationsView;
    }

}
