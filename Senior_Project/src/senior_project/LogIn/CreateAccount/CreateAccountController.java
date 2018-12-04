/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senior_project.LogIn.CreateAccount;

/**
 *
 * @author yessi
 */
public class CreateAccountController {

    private CreateAccountModel createAccountModel; 
    private CreateAccountView createAccountView;

    public CreateAccountController(CreateAccountModel createAccountModel, CreateAccountView createAccountView) 
    {
        this.createAccountModel = createAccountModel;
        this.createAccountView = createAccountView;
        setupHandlers();
    }
    
    public CreateAccountController() 
    {
        this.createAccountModel = new CreateAccountModel();
        this.createAccountView  = new CreateAccountView();
        setupHandlers();
    }
    
    public void setupHandlers()
    {
        //buttons
    }

    /**
     * @return the createAccountModel
     */
    public CreateAccountModel getCreateAccountModel() {
        return createAccountModel;
    }

    /**
     * @param createAccountModel the createAccountModel to set
     */
    public void setCreateAccountModel(CreateAccountModel createAccountModel) {
        this.createAccountModel = createAccountModel;
    }

    /**
     * @return the createAccountView
     */
    public CreateAccountView getCreateAccountView() {
        return createAccountView;
    }

    /**
     * @param createAccountView the createAccountView to set
     */
    public void setCreateAccountView(CreateAccountView createAccountView) {
        this.createAccountView = createAccountView;
    }
}
