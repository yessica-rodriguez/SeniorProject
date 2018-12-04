/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senior_project.LogIn.ForgotPassword;

/**
 *
 * @author yessi
 */
public class ForgotPasswordController {
    private ForgotPasswordModel ForgotPasswordModel; 
    private ForgotPasswordView ForgotPasswordView;

    public ForgotPasswordController(ForgotPasswordModel ForgotPasswordModel, ForgotPasswordView ForgotPasswordView) 
    {
        this.ForgotPasswordModel = ForgotPasswordModel;
        this.ForgotPasswordView = ForgotPasswordView;
        setupHandlers();
    }
    
    public ForgotPasswordController(String m) 
    {
        this.ForgotPasswordModel = new ForgotPasswordModel();
        this.ForgotPasswordView  = new ForgotPasswordView(m);
        setupHandlers();
    }
    
    public void setupHandlers()
    {
        //buttons
    }

    /**
     * @return the ForgotPasswordModel
     */
    public ForgotPasswordModel getForgotPasswordModel() {
        return ForgotPasswordModel;
    }

    /**
     * @param ForgotPasswordModel the ForgotPasswordModel to set
     */
    public void setForgotPasswordModel(ForgotPasswordModel ForgotPasswordModel) {
        this.ForgotPasswordModel = ForgotPasswordModel;
    }

    /**
     * @return the ForgotPasswordView
     */
    public ForgotPasswordView getForgotPasswordView() {
        return ForgotPasswordView;
    }

    /**
     * @param ForgotPasswordView the ForgotPasswordView to set
     */
    public void setForgotPasswordView(ForgotPasswordView ForgotPasswordView) {
        this.ForgotPasswordView = ForgotPasswordView;
    }
}
