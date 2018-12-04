/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senior_project.Exercise;

import javafx.event.ActionEvent;
import senior_project.Exercise.Muscles.MusclesController;
import senior_project.Exercise.Types.TypesController;

/**
 *
 * @author yessi
 */
public class ExerciseController {
    
    TypesController t = new TypesController();
    MusclesController m = new MusclesController();
    
    private ExerciseModel ExerciseModel; 
    private ExerciseView ExerciseView;

    public ExerciseController(ExerciseModel ExerciseModel, ExerciseView ExerciseView) 
    {
        this.ExerciseModel = ExerciseModel;
        this.ExerciseView = ExerciseView;
        setupHandlers();
    }
    
    public void setupHandlers()
    {
        //buttons
        ExerciseView.getTypes().setOnAction((ActionEvent event) -> {
            ExerciseView.updateExerciseView2(t.getTypesView());
        });
        ExerciseView.getMuscles().setOnAction((ActionEvent event) -> {
            ExerciseView.updateExerciseView2(m.getMusclesView());
        });
        ExerciseView.getB().setOnAction((ActionEvent event) -> {
            ExerciseView.updateExerciseView();
        });
    }

    /**
     * @return the ExerciseModel
     */
    public ExerciseModel getExerciseModel() {
        return ExerciseModel;
    }

    /**
     * @param ExerciseModel the ExerciseModel to set
     */
    public void setExerciseModel(ExerciseModel ExerciseModel) {
        this.ExerciseModel = ExerciseModel;
    }

    /**
     * @return the ExerciseView
     */
    public ExerciseView getExerciseView() {
        return ExerciseView;
    }

    /**
     * @param ExerciseView the ExerciseView to set
     */
    public void setExerciseView(ExerciseView ExerciseView) {
        this.ExerciseView = ExerciseView;
    }
}
