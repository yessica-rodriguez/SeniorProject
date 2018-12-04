/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senior_project.LogIn;

import javafx.event.ActionEvent;
import senior_project.LogIn.Edit.EditController;
import senior_project.LogIn.Home.HomeController;
import senior_project.LogIn.CreateAccount.CreateAccountController;
import senior_project.LogIn.ForgotPassword.ForgotPasswordController;

/**
 *
 * @author yessi
 */
public class LoginController {
    
    CreateAccountController ac = new CreateAccountController();
    EditController eP = new EditController("P");
    EditController eM = new EditController("M");
    ForgotPasswordController fpc0 = new ForgotPasswordController("UN");
    ForgotPasswordController fpc = new ForgotPasswordController("SQ");
    ForgotPasswordController fpc2 = new ForgotPasswordController("NP");
    
    private int user = 0;
    
    private LoginModel LoginModel; 
    private LoginView LoginView;

    public LoginController(LoginModel LoginModel, LoginView LoginView) 
    {
        this.LoginModel = LoginModel;
        this.LoginView = LoginView;
        setupHandlers();
    }
    
    public void setupHandlers()
    {
        //buttons
        getLoginView().getLi().setOnAction((ActionEvent event) -> {
            String u = LoginView.getUnTF().getText();
            String p = LoginView.getPwTF().getText();
            if(u.compareTo("") != 0 && p.compareTo("") != 0){
                LoginModel.setUn(u); LoginModel.setPw(p);
                if(LoginModel.getLi()){
                    user = LoginModel.getUid();
                    byte[] i = LoginModel.getpImage();
                    HomeController h = new HomeController(user, u, i);
                    getLoginView().updateLoginView3(h.getHomeView());
                }
                else
                    getLoginView().updateLoginView();
            }
            else
                getLoginView().updateLoginView();
        });
        //********************************************************************************************
        //********************************************************************************************
        getLoginView().getCa().setOnAction((ActionEvent event) -> {
            ac.getCreateAccountView().getMsg().setText("");
            ac.getCreateAccountView().getCurrent_un().clear();
            ac.getCreateAccountView().getCurrent_pw().clear();
            ac.getCreateAccountView().getCurrent_cpw().clear();
            ac.getCreateAccountView().getQ1A().clear();
            ac.getCreateAccountView().getQ2A().clear();
            ac.getCreateAccountView().getQ3A().clear();
            ac.getCreateAccountView().getQ1M().setValue(null);
            ac.getCreateAccountView().getQ2M().setValue(null);
            ac.getCreateAccountView().getQ3M().setValue(null);
            getLoginView().updateLoginView2(ac.getCreateAccountView(), LoginView.getC1());
        });
        getLoginView().getC1().setOnAction((ActionEvent event) -> {
            ac.getCreateAccountView().getMsg().setText("");
            String current_un = ac.getCreateAccountView().getCurrent_un().getText();
            String current_pw = ac.getCreateAccountView().getCurrent_pw().getText(); 
            String current_cpw = ac.getCreateAccountView().getCurrent_cpw().getText();  
            String q1A = ac.getCreateAccountView().getQ1A().getText();  
            String q2A = ac.getCreateAccountView().getQ2A().getText(); 
            String q3A = ac.getCreateAccountView().getQ3A().getText();
            Boolean que1 = ac.getCreateAccountView().getQ1M().getSelectionModel().isEmpty();
            Boolean que2 = ac.getCreateAccountView().getQ2M().getSelectionModel().isEmpty();
            Boolean que3 = ac.getCreateAccountView().getQ3M().getSelectionModel().isEmpty();
            eP.getEditView().getCurrent_fname().setText("");
            eP.getEditView().getCurrent_lname().setText("");
            eP.getEditView().getCurrent_gender().setText("");
            eP.getEditView().getCurrent_add().setText("");
            eP.getEditView().getCurrent_zip().setText("");
            eP.getEditView().getCurrent_city().setText("");
            eP.getEditView().getCurrent_st().setText("");
            eP.getEditView().getCurrent_zip().setText("");
            eP.getEditView().getCurrent_email().setText("");
            eP.getEditView().getCurrent_DOB().setText("");
            eM.getEditView().getCurrent_hFt().setText("");
            eM.getEditView().getCurrent_hIn().setText("");
            eM.getEditView().getCurrent_weight().setText("");
            eM.getEditView().getDise1().setSelected(false);
            eM.getEditView().getDise2().setSelected(false);
            eM.getEditView().getDise3().setSelected(false);
            eM.getEditView().getDise4().setSelected(false);
            eM.getEditView().getDise5().setSelected(false);
            eM.getEditView().getDise6().setSelected(false);
            eM.getEditView().getAll1().setSelected(false);
            eM.getEditView().getAll2().setSelected(false);
            eM.getEditView().getAll3().setSelected(false);
            eM.getEditView().getAll4().setSelected(false);
            eM.getEditView().getAll5().setSelected(false);
            eM.getEditView().getAll6().setSelected(false);
            eM.getEditView().getAll7().setSelected(false);
            eM.getEditView().getAll8().setSelected(false);
            eM.getEditView().getAll9().setSelected(false);
            eM.getEditView().getAll10().setSelected(false);
            eM.getEditView().getAll11().setSelected(false);
            eM.getEditView().getAll12().setSelected(false);
            eM.getEditView().getAll13().setSelected(false);
            eM.getEditView().getAll14().setSelected(false);
            eM.getEditView().getAll15().setSelected(false);
            if(!que1 && !que2 && !que3){
                String Temp = ac.getCreateAccountView().getQ1M().getValue().toString();
                String Temp2 = ac.getCreateAccountView().getQ2M().getValue().toString();
                String Temp3 = ac.getCreateAccountView().getQ3M().getValue().toString();
                int q1 = ac.getCreateAccountModel().getQ(Temp);
                int q2 = ac.getCreateAccountModel().getQ(Temp2);
                int q3 = ac.getCreateAccountModel().getQ(Temp3);
                if(current_un.compareTo("") == 0 || current_pw.compareTo("") == 0 || current_cpw.compareTo("") == 0 ||
                        q1A.compareTo("") == 0 || q2A.compareTo("") == 0 || q3A.compareTo("") == 0){
                    ac.getCreateAccountView().getMsg().setText("Error - Missing Information");
                    getLoginView().updateLoginView2(ac.getCreateAccountView(), LoginView.getC1());
                }
                else{
                    if(current_pw.compareTo(current_cpw) == 0){
                        if(q1 != q2 && q1 != q3 && q2 != q3){
                            ac.getCreateAccountModel().newU(current_un, current_pw, q1A, q2A, q3A, q1, q2, q3);
                            getLoginView().updateLoginView2(eP.getEditView(), LoginView.getC2());
                        }
                        else{
                            ac.getCreateAccountView().getMsg().setText("Error - Repeated Security Question");
                            getLoginView().updateLoginView2(ac.getCreateAccountView(), LoginView.getC1()); 
                        }
                    }
                    else{
                       ac.getCreateAccountView().getMsg().setText("Error - Passwords Do NOT Match");
                       getLoginView().updateLoginView2(ac.getCreateAccountView(), LoginView.getC1()); 
                    }
                }
            }
            else{
                ac.getCreateAccountView().getMsg().setText("Error - Need to Select 3 Security Questions");
                getLoginView().updateLoginView2(ac.getCreateAccountView(), LoginView.getC1()); 
            }
        });
        getLoginView().getC2().setOnAction((ActionEvent event) -> {
            user = ac.getCreateAccountModel().getId();
            String f = eP.getEditView().getCurrent_fname().getText();
            String l = eP.getEditView().getCurrent_lname().getText();
            String g = eP.getEditView().getCurrent_gender().getText();
            String a = eP.getEditView().getCurrent_add().getText();
            String s = eP.getEditView().getCurrent_zip().getText();
            String c = eP.getEditView().getCurrent_city().getText();
            String z = eP.getEditView().getCurrent_zip().getText();
            String e = eP.getEditView().getCurrent_email().getText();
            String b = eP.getEditView().getCurrent_DOB().getText();
            eP.getEditModel().p(user, f, l, g, a, s, c, z, e, b);
            getLoginView().updateLoginView2(eM.getEditView(), LoginView.getC3());
        });
        getLoginView().getC3().setOnAction((ActionEvent event) -> {
            user = ac.getCreateAccountModel().getId();
            int feet; int inches; int weight;
            String hF = eM.getEditView().getCurrent_hFt().getText();
            String hI = eM.getEditView().getCurrent_hIn().getText();
            String w = eM.getEditView().getCurrent_weight().getText();
            Boolean d1 = eM.getEditView().getDise1().isSelected();
            Boolean d2 = eM.getEditView().getDise2().isSelected();
            Boolean d3 = eM.getEditView().getDise3().isSelected();
            Boolean d4 = eM.getEditView().getDise4().isSelected();
            Boolean d5 = eM.getEditView().getDise5().isSelected();
            Boolean d6 = eM.getEditView().getDise6().isSelected();
            Boolean a1 = eM.getEditView().getAll1().isSelected();
            Boolean a2 = eM.getEditView().getAll2().isSelected();
            Boolean a3 = eM.getEditView().getAll3().isSelected();
            Boolean a4 = eM.getEditView().getAll4().isSelected();
            Boolean a5 = eM.getEditView().getAll5().isSelected();
            Boolean a6 = eM.getEditView().getAll6().isSelected();
            Boolean a7 = eM.getEditView().getAll7().isSelected();
            Boolean a8 = eM.getEditView().getAll8().isSelected();
            Boolean a9 = eM.getEditView().getAll9().isSelected();
            Boolean a10 = eM.getEditView().getAll10().isSelected();
            Boolean a11 = eM.getEditView().getAll11().isSelected();
            Boolean a12 = eM.getEditView().getAll12().isSelected();
            Boolean a13 = eM.getEditView().getAll13().isSelected();
            Boolean a14 = eM.getEditView().getAll14().isSelected();
            Boolean a15 = eM.getEditView().getAll15().isSelected();
            if(hF.compareTo("") == 0)
                feet = 0;
            else
                feet = Integer.parseInt(hF);
            if(hI.compareTo("") == 0)
                inches = 0;
            else
                inches = Integer.parseInt(hI);
            if(w.compareTo("") == 0)
                weight = 0;
            else
                weight = Integer.parseInt(w);
            eM.getEditModel().m(user, feet, weight, inches,
            d1, d2, d3, d4, d5, d6,
                a1, a2, a3, a4, a5, 
                a6, a7, a8, a9, a10, 
                a11, a12, a13, a14, a15);
            getLoginView().updateLoginView();
        });
        
        //********************************************************************************************
        //********************************************************************************************
        getLoginView().getB().setOnAction((ActionEvent event) -> {
            getLoginView().updateLoginView();
        });
        //********************************************************************************************
        //********************************************************************************************
        getLoginView().getFp().setOnAction((ActionEvent event) -> {
            fpc0.getForgotPasswordView().getC_un().clear();
            fpc.getForgotPasswordView().getQ1().setText("");
            fpc.getForgotPasswordView().getQ2().setText("");
            fpc.getForgotPasswordView().getQ3().setText("");
            fpc.getForgotPasswordView().getQ1A().clear();
            fpc.getForgotPasswordView().getQ2A().clear();
            fpc.getForgotPasswordView().getQ3A().clear();
            fpc2.getForgotPasswordView().getCurrent_nwp().clear();
            fpc2.getForgotPasswordView().getCurrent_cnwp().clear();
            getLoginView().updateLoginView2(fpc0.getForgotPasswordView(), LoginView.getE0());
        });
        getLoginView().getE0().setOnAction((ActionEvent event) -> {
            fpc0.getForgotPasswordView().getEan0().setText("");
            String id = fpc0.getForgotPasswordView().getC_un().getText();
            if(id.compareTo("") != 0){
                String test = fpc.getForgotPasswordModel().getUn(id);
                if(test.compareTo("NO") != 0){
                    fpc.getForgotPasswordModel().getInfo(id);
                    int i = fpc.getForgotPasswordModel().getQ1_id();
                    String q = fpc.getForgotPasswordModel().getQ1();
                    fpc.getForgotPasswordView().getQ1().setText("Security Question 1: " + q);
                    q = fpc.getForgotPasswordModel().getQ2();
                    fpc.getForgotPasswordView().getQ2().setText("Security Question 2: " + q);
                    q = fpc.getForgotPasswordModel().getQ3();
                    fpc.getForgotPasswordView().getQ3().setText("Security Question 3: " + q);
                    getLoginView().updateLoginView2(fpc.getForgotPasswordView(), LoginView.getE1());
                }
                else{
                    getLoginView().updateLoginView();
                }       
            }
            else{
                fpc0.getForgotPasswordView().getEan0().setText("NEED TO ENTER A USERNAME");
                getLoginView().updateLoginView2(fpc0.getForgotPasswordView(), LoginView.getE0());
            }
        });
        getLoginView().getE1().setOnAction((ActionEvent event) -> {
            fpc.getForgotPasswordView().getEan().setText("");
            if((fpc.getForgotPasswordView().getQ1A().getText()).compareTo(fpc.getForgotPasswordModel().getQ1A()) == 0
                    && (fpc.getForgotPasswordView().getQ2A().getText()).compareTo(fpc.getForgotPasswordModel().getQ2A()) == 0
                    && (fpc.getForgotPasswordView().getQ3A().getText()).compareTo(fpc.getForgotPasswordModel().getQ3A()) == 0)
                getLoginView().updateLoginView2(fpc2.getForgotPasswordView(), LoginView.getE2());
            else{
                fpc.getForgotPasswordView().getEan().setText("ANSWERS ARE INCORRECT");
                fpc.getForgotPasswordView().getQ1A().clear();
                fpc.getForgotPasswordView().getQ2A().clear();
                fpc.getForgotPasswordView().getQ3A().clear();
                getLoginView().updateLoginView2(fpc.getForgotPasswordView(), LoginView.getE1());
            }
        });
        getLoginView().getE2().setOnAction((ActionEvent event) -> {
            fpc2.getForgotPasswordView().getEan2().setText("");
            String s1 = fpc2.getForgotPasswordView().getCurrent_nwp().getText();
            String s2 = fpc2.getForgotPasswordView().getCurrent_cnwp().getText();
            if((s1.compareTo("") != 0) || (s2.compareTo("") != 0)){
                if(s1.compareTo(s2) == 0){
                    user = fpc.getForgotPasswordModel().getIdentity();
                    fpc2.getForgotPasswordModel().done(user, s2);
                    getLoginView().updateLoginView();
                }
                else{
                    fpc2.getForgotPasswordView().getEan2().setText("PASSWORDS DON'T MATCH");
                    fpc2.getForgotPasswordView().getCurrent_nwp().clear();
                    fpc2.getForgotPasswordView().getCurrent_cnwp().clear();
                    getLoginView().updateLoginView2(fpc2.getForgotPasswordView(), LoginView.getE2());
                }
            }
            else{
                fpc2.getForgotPasswordView().getEan2().setText("PLEASE ENTER NEW PASSWORD");
                getLoginView().updateLoginView2(fpc2.getForgotPasswordView(), LoginView.getE2());
            }
        });
    }

    /**
     * @return the LoginModel
     */
    public LoginModel getLoginModel() {
        return LoginModel;
    }

    /**
     * @param LoginModel the LoginModel to set
     */
    public void setLoginModel(LoginModel LoginModel) {
        this.LoginModel = LoginModel;
    }

    /**
     * @return the LoginView
     */
    public LoginView getLoginView() {
        return LoginView;
    }

    /**
     * @param LoginView the LoginView to set
     */
    public void setLoginView(LoginView LoginView) {
        this.LoginView = LoginView;
    }

    /**
     * @return the user
     */
    public int getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(int user) {
        this.user = user;
    }
}
