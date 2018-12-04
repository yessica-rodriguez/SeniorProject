/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senior_project.LogIn.Home;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import senior_project.LogIn.Edit.EditController;
import senior_project.LogIn.Recommendations.RecommendationsController;

/**
 *
 * @author yessi
 */
public class HomeController {
    private HomeModel HomeModel; 
    private HomeView HomeView;
    
    Diseases dis = new Diseases();
    Allergies all = new Allergies();
    
    EditController eP = new EditController("P");
    EditController eM = new EditController("M");
    EditController eI = new EditController("I");
    
    RecommendationsController rec = new RecommendationsController();

    public HomeController(HomeModel HomeModel, HomeView HomeView, int u) 
    {
        this.HomeModel = HomeModel;
        this.HomeView = HomeView;
        setupHandlers(u);
    }
    
    public HomeController(int u, String un, byte[] i) 
    {
        this.HomeModel = new HomeModel();
        this.HomeView = new HomeView(un, i);
        setupHandlers(u);
    }
    
    public void setupHandlers(int u)
    {
        setInfo(u);
        HomeView.updateHomeView();
        getHomeView().getePersonal().setOnAction((ActionEvent event) ->{
            String Hf = HomeModel.getFname();
            String Hl = HomeModel.getLname();
            String Hg = HomeModel.getGender();
            String Ha = HomeModel.getAdd();
            String Hs = HomeModel.getSt();
            String Hc = HomeModel.getCity();
            String Hz = HomeModel.getZip();
            String He = HomeModel.getEmail();
            String Hb = HomeModel.getDOB();
            if(Hf != null)
                eP.getEditView().getCurrent_fname().setText(Hf);
            else
                eP.getEditView().getCurrent_fname().setText("");
            if(Hl != null)
                eP.getEditView().getCurrent_lname().setText(Hl);
            else
                eP.getEditView().getCurrent_lname().setText("");
            if(Hg != null)
                eP.getEditView().getCurrent_gender().setText(Hg);
            else
                eP.getEditView().getCurrent_gender().setText("");
            if(Ha != null)
                eP.getEditView().getCurrent_add().setText(Ha);
            else
                eP.getEditView().getCurrent_add().setText("");
            if(Hs != null)
                eP.getEditView().getCurrent_st().setText(Hs);
            else
                eP.getEditView().getCurrent_st().setText("");
            if(Hc != null)
                eP.getEditView().getCurrent_city().setText(Hc);
            else
                eP.getEditView().getCurrent_city().setText("");
            if(Hz != null)
                eP.getEditView().getCurrent_zip().setText(Hz);
            else
                eP.getEditView().getCurrent_zip().setText("");
            if(He != null)
                eP.getEditView().getCurrent_email().setText(He);
            else
                eP.getEditView().getCurrent_email().setText("");
            if(Hb != null)
                eP.getEditView().getCurrent_DOB().setText(Hb);
            else
                eP.getEditView().getCurrent_DOB().setText("");
            getHomeView().updateHomeView2(eP.getEditView(), HomeView.getO());
        });
        getHomeView().getO().setOnAction((ActionEvent event) -> {
            String f = eP.getEditView().getCurrent_fname().getText();
            String l = eP.getEditView().getCurrent_lname().getText();
            String g = eP.getEditView().getCurrent_gender().getText();
            String a = eP.getEditView().getCurrent_add().getText();
            String s = eP.getEditView().getCurrent_zip().getText();
            String c = eP.getEditView().getCurrent_city().getText();
            String z = eP.getEditView().getCurrent_zip().getText();
            String e = eP.getEditView().getCurrent_email().getText();
            String b = eP.getEditView().getCurrent_DOB().getText();
            System.out.println(u + f + l + g + a + s + c + z + e + b);
            eP.getEditModel().p(u, f, l, g, a, s, c, z, e, b);
            HomeView.getDisList().getChildren().clear();
            HomeView.getAllList().getChildren().clear();
            setInfo(u);
            getHomeView().updateHomeView();
        });
        getHomeView().getO2().setOnAction((ActionEvent event) -> {
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
            eM.getEditModel().m(u, feet, weight, inches,
                d1, d2, d3, d4, d5, d6,
                a1, a2, a3, a4, a5, 
                a6, a7, a8, a9, a10, 
                a11, a12, a13, a14, a15);
            HomeView.getDisList().getChildren().clear();
            HomeView.getAllList().getChildren().clear();
            setInfo(u);
            getHomeView().updateHomeView();
        });
        getHomeView().geteMedical().setOnAction((ActionEvent event) -> {
            eM.getEditView().getCurrent_hFt().setText(Integer.toString(HomeModel.gethFt()));
            eM.getEditView().getCurrent_hIn().setText(Integer.toString(HomeModel.gethIn()));
            eM.getEditView().getCurrent_weight().setText(Integer.toString(HomeModel.getWeight()));
            eM.getEditView().getDise1().setSelected(HomeModel.getDis()[5]);
            eM.getEditView().getDise2().setSelected(HomeModel.getDis()[4]);
            eM.getEditView().getDise3().setSelected(HomeModel.getDis()[3]);
            eM.getEditView().getDise4().setSelected(HomeModel.getDis()[2]);
            eM.getEditView().getDise5().setSelected(HomeModel.getDis()[1]);
            eM.getEditView().getDise6().setSelected(HomeModel.getDis()[0]);
            eM.getEditView().getAll1().setSelected(HomeModel.getAll()[0]);
            eM.getEditView().getAll2().setSelected(HomeModel.getAll()[1]);
            eM.getEditView().getAll3().setSelected(HomeModel.getAll()[2]);
            eM.getEditView().getAll4().setSelected(HomeModel.getAll()[3]);
            eM.getEditView().getAll5().setSelected(HomeModel.getAll()[4]);
            eM.getEditView().getAll6().setSelected(HomeModel.getAll()[5]);
            eM.getEditView().getAll7().setSelected(HomeModel.getAll()[6]);
            eM.getEditView().getAll8().setSelected(HomeModel.getAll()[7]);
            eM.getEditView().getAll9().setSelected(HomeModel.getAll()[8]);
            eM.getEditView().getAll10().setSelected(HomeModel.getAll()[9]);
            eM.getEditView().getAll11().setSelected(HomeModel.getAll()[10]);
            eM.getEditView().getAll12().setSelected(HomeModel.getAll()[11]);
            eM.getEditView().getAll13().setSelected(HomeModel.getAll()[12]);
            eM.getEditView().getAll14().setSelected(HomeModel.getAll()[13]);
            eM.getEditView().getAll15().setSelected(HomeModel.getAll()[14]);
            getHomeView().updateHomeView2(eM.getEditView(), HomeView.getO2()); 
        });
        getHomeView().geteImage().setOnAction((ActionEvent event) -> {
            eI.getEditView().PPicEdit();
            getHomeView().updateHomeView3(eI.getEditView(), HomeView.getO3(), HomeView.getC3());
        });
        getHomeView().getO3().setOnAction((ActionEvent event) -> {
            eI.getEditModel().pIm(u, eI.getSelectedFile());
            HomeView.getDisList().getChildren().clear();
            HomeView.getAllList().getChildren().clear();
            setInfo(u);
            byte[] i = HomeView.getIm();
            System.out.println("\nHomeController - Image:\n" + i);
            HomeView.updateHomeView5(eI.getI());
            getHomeView().updateHomeView(); 
        });
        getHomeView().getC3().setOnAction((ActionEvent event) -> {
            getHomeView().updateHomeView(); 
        });
        getHomeView().getB().setOnAction((ActionEvent event) -> {
            getHomeView().updateHomeView(); 
        });
        getHomeView().getRe().setOnAction((ActionEvent event) -> {
            rec.getRecommendationsView().getDis().getChildren().clear();
            String gender = HomeModel.getGender();
            String age = HomeModel.getDOB();
            if(age == null && gender == null)
                rec.getRecommendationsView().getDis().getChildren().addAll(
                    rec.getRecommendationsView().getMsg());
            String parts[] = null;
            if(age != null){
                parts = age.split("-");
            }
            rec.getRecommendationsView().getDis().getChildren().addAll(
                rec.getRecommendationsView().getWarning(), rec.getRecommendationsView().getCal_msg());
            if(age == null && gender != null)
                rec.getRecommendationsView().C_G(gender);
            else if(age != null && gender == null){
                String part1 = parts[0]; // Year
                String part2 = parts[1]; // Month
                String part3 = parts[2];
                int numA = rec.getRecommendationsModel().AgeCalculator(Integer.parseInt(part1), Integer.parseInt(part2), 
                        Integer.parseInt(part3));
                rec.getRecommendationsModel().getCal(numA, "");
                String m = "         Sedentary: " + String.valueOf(rec.getRecommendationsModel().getCal_s()) + "         " +
                        "Moderately Active: " + String.valueOf(rec.getRecommendationsModel().getCal_m()) + "         " +
                        "Active: " + String.valueOf(rec.getRecommendationsModel().getCal_a());
                rec.getRecommendationsModel().getCal(numA, "F");
                String f = "         Sedentary: " + String.valueOf(rec.getRecommendationsModel().getCal_s()) + "         " +
                        "Moderately Active: " + String.valueOf(rec.getRecommendationsModel().getCal_m()) + "         " +
                        "Active: " + String.valueOf(rec.getRecommendationsModel().getCal_a());
                rec.getRecommendationsView().C_A(m, f);
            }
            else if(age != null && gender != null){
                String part1 = parts[0]; // Year
                String part2 = parts[1]; // Month
                String part3 = parts[2];
                int numA = rec.getRecommendationsModel().AgeCalculator(Integer.parseInt(part1), Integer.parseInt(part2), 
                        Integer.parseInt(part3));
                rec.getRecommendationsModel().getCal(numA, gender);
                String m = "         Sedentary: " + String.valueOf(rec.getRecommendationsModel().getCal_s()) + "         " +
                        "Moderately Active: " + String.valueOf(rec.getRecommendationsModel().getCal_m()) + "         " +
                        "Active: " + String.valueOf(rec.getRecommendationsModel().getCal_a());
                rec.getRecommendationsView().C_GA(m);
            }
            else
                rec.getRecommendationsView().C_G("");
            rec.getRecommendationsView().getDis().getChildren().addAll(
                rec.getRecommendationsView().getEx_msg());
            if(age != null){
                String part1 = parts[0]; // Year
                String part2 = parts[1]; // Month
                String part3 = parts[2];
                int numA = rec.getRecommendationsModel().AgeCalculator(Integer.parseInt(part1), Integer.parseInt(part2), 
                        Integer.parseInt(part3));
                rec.getRecommendationsModel().getEx(numA);
                int low = rec.getRecommendationsModel().getEx_low();
                int high = rec.getRecommendationsModel().getEx_high();
                String m = "         ";
                if(low == high)
                    m = m + String.valueOf(low) + " minutes daily";
                else
                    m = m + String.valueOf(low) + " to " + String.valueOf(high) + " minutes a week " + rec.getRecommendationsModel().getEx_msg();
                rec.getRecommendationsView().E_A(m);
            }
            else
               rec.getRecommendationsView().E_A(""); 
            int in = 0;
            Boolean uDis = false;
            while(in < 6){
                if(HomeModel.getDis()[in]){
                    uDis = true;
                    break;
                }
                in++;
            }
            int count = 0;
            if(uDis){
                rec.getRecommendationsView().getDis().getChildren().addAll(
                    rec.getRecommendationsView().getDis_msg());
                while(count < 6){
                    if(HomeModel.getDis()[count]){
                        String d = dis.getName(count+1);
                        rec.getRecommendationsModel().getD(count+1);
                        String f1 = rec.getRecommendationsModel().getF1();
                        String f2 = rec.getRecommendationsModel().getF2();
                        String f3 = rec.getRecommendationsModel().getF3();
                        String f4 = rec.getRecommendationsModel().getF4();
                        String f5 = rec.getRecommendationsModel().getF5();
                        rec.getRecommendationsView().D(d, f1, f2, f3, f4, f5);
                    }
                    count++;
                }
                rec.getRecommendationsView().DD();
            }
            getHomeView().updateHomeView4(rec.getRecommendationsView()); 
        });
    }
    
    public void DrawVBox(HBox b, int num, String i){
        int total = num;
        while(num > 0){
            b.getChildren().add(DrawHBox(num, i, total));
            num = num - 2;
        }
    }
    
    private VBox DrawHBox(int num, String i, int total){
        VBox d = new VBox();
        d.setSpacing(20);
        int count = 0;
        while(count < 2){
            if(num != 0){
                HBox d2 = new HBox();
                d2.getChildren().addAll(DrawCurrentL(num, i, total), DrawL(num, i));
                d.getChildren().add(d2);
            }
            else
                break;
            num--;
            count++;
        }
        return d;
    }
    
    private Label DrawL(int num, String i){
        Label l = new Label();
        if(num > 0){
            if(i.compareTo("D")==0)
            {
                l.setText(dis.getName(num));
            }
            else
            {
                l.setText(all.getName(num));
            }
        }
        return l;
    }
    
    private Label DrawCurrentL(int num, String i, int total){
        Label current_l = new Label();
        if(num > 0){
            if(i.compareTo("D")==0)
            {
                if(HomeModel.getDis()[num-1]){
                    current_l.setText("  X  ");
                }
                else{
                    current_l.setText("      ");
                }
            }
            else
            {
                if(HomeModel.getAll()[num-1]){
                    current_l.setText("  X  ");
                }
                else{
                    current_l.setText("      ");
                }
            }
        }
        current_l.setUnderline(true);
        return current_l;
    }
    
    private void setInfo(int u){
        HomeModel.getInfo(u, dis.getNumDis(), all.getNumDis());
            String temp;
            temp = HomeModel.getFname();
            if(temp == null)
                temp = "            ";
            HomeView.getCurrent_fname().setText("   " + temp + "    ");
            temp = HomeModel.getLname();
            if(temp == null)
                temp = "            ";
            HomeView.getCurrent_lname().setText("   " + temp + "    ");
            temp = HomeModel.getGender();
            if(temp == null)
                temp = "            ";
            HomeView.getCurrent_gender().setText("   " + temp + "    ");
            temp = HomeModel.getAdd();
            if(temp == null)
                temp = "            ";
            HomeView.getCurrent_add().setText("   " + temp + "    ");
            temp = HomeModel.getSt();
            if(temp == null)
                temp = "            ";
            HomeView.getCurrent_st().setText("   " + temp + "    ");
            temp = HomeModel.getCity();
            if(temp == null)
                temp = "            ";
            HomeView.getCurrent_city().setText("   " + temp + "    ");
            temp = HomeModel.getZip();
            if(temp == null)
                temp = "            ";
            HomeView.getCurrent_zip().setText("   " + temp + "    ");
            temp = HomeModel.getEmail();
            if(temp == null)
                temp = "            ";
            HomeView.getCurrent_email().setText("   " + temp + "    ");
            temp = HomeModel.getDOB();
            if(temp == null)
                temp = "            ";
            HomeView.getCurrent_DOB().setText("   " + temp + "    ");
            HomeView.getCurrent_hFt().setText("   " + Integer.toString(HomeModel.gethFt()) + "    ");
            HomeView.getCurrent_hIn().setText("   " + Integer.toString(HomeModel.gethIn()) + "    ");
            HomeView.getCurrent_weight().setText("   " + Integer.toString(HomeModel.getWeight()) + "    ");
            //byte[] im = HomeModel.getImage();
            //if(im != null)
                    //HomeView.setIm(im);
            DrawVBox(getHomeView().getDisList(), dis.getNumDis(), "D");
            DrawVBox(getHomeView().getAllList(), all.getNumDis(), "A");
    }

    /**
     * @return the HomeModel
     */
    public HomeModel getHomeModel() {
        return HomeModel;
    }

    /**
     * @param HomeModel the HomeModel to set
     */
    public void setHomeModel(HomeModel HomeModel) {
        this.HomeModel = HomeModel;
    }

    /**
     * @return the HomeView
     */
    public HomeView getHomeView() {
        return HomeView;
    }

    /**
     * @param HomeView the HomeView to set
     */
    public void setHomeView(HomeView HomeView) {
        this.HomeView = HomeView;
    }
    
}
