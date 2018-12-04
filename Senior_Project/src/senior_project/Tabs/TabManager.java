package senior_project.Tabs;

//import Environment.Controllers.AboutController;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.geometry.Side;
import senior_project.Diet.*;
import senior_project.Exercise.*;
//import senior_project.Home.*;
import senior_project.Info.*;
import senior_project.LogIn.*;

/**
 *
 * @author MQ0162246
 */
public class TabManager extends TabPane{

    //Current USer
    private Tab tab0;
    private Tab tab1;
    private Tab tab2;
    private Tab tab3;
    private Tab tab4;
    
    private Image img00 = new Image("/resources/images/login.png");
    private Image img01 = new Image("/resources/images/profile.png");
    private Image img02 = new Image("/resources/images/diet.png");
    private Image img03 = new Image("/resources/images/exercise.png");
    private Image img04 = new Image("/resources/images/info.png");
    
    LoginView LoginRoot = new LoginView();
    LoginModel LoginModel = new LoginModel();
    LoginController LoginController = new LoginController(LoginModel, LoginRoot);
    //HomeView HomeRoot   = new HomeView();
    //HomeModel HomeModel = new HomeModel();
    //HomeController HomeController = new HomeController(HomeModel, HomeRoot);
    DietView root = new DietView();
    DietModel model = new DietModel();
    DietController DietController = new DietController(model, root);
    ExerciseView ExerciseRoot   = new ExerciseView();
    ExerciseModel ExerciseModel = new ExerciseModel();
    ExerciseController ExerciseController = new ExerciseController(ExerciseModel, ExerciseRoot);
    InfoView InfoRoot   = new InfoView();
    InfoModel InfoModel = new InfoModel();
    InfoController InfoController = new InfoController(InfoModel, InfoRoot);

    public TabManager()
    {
        this.setSide(Side.TOP);
        // Color
        this.setStyle("-fx-background-color: gray;");
        
        // Tab0:
        tab0 = new Tab("Profile");
        tab0.idProperty().set("Profile");
        tab0.setClosable(false);
        ImageView iv0 = new ImageView(img01);
        iv0.setFitHeight(32);
        iv0.setFitWidth(32);
        tab0.setGraphic(iv0);
        tab0.setStyle("-fx-border-color:gray; -fx-background-color: whitesmoke;");
        tab0.setContent(LoginRoot); 

        /*
        // Tab1: 
        tab1 = new Tab("Home");
        tab1.idProperty().set("Home");        
        tab1.setClosable(false);
        ImageView iv = new ImageView(img01);
        iv.setFitHeight(32);
        iv.setFitWidth(32);
        tab1.setGraphic(iv);
        tab1.setStyle("-fx-border-color:gray; -fx-background-color: whitesmoke;");
        tab1.setContent(HomeRoot);
        */
        
        
        // Tab2: 
        tab2 = new Tab("Diet");
        tab2.idProperty().set("Diet");
        tab2.setClosable(false);
        ImageView iv2 = new ImageView(img02);
        iv2.setFitHeight(32);
        iv2.setFitWidth(32);
        tab2.setGraphic(iv2);
        tab2.setStyle("-fx-border-color:gray; -fx-background-color: whitesmoke;");
        tab2.setContent(root);
        
        
        // Tab3:
        tab3 = new Tab("Exercise");
        tab3.idProperty().set("Exercise");
        tab3.setClosable(false);
        ImageView iv3 = new ImageView(img03);
        iv3.setFitHeight(32);
        iv3.setFitWidth(32);
        tab3.setGraphic(iv3);
        tab3.setStyle("-fx-border-color:gray; -fx-background-color: whitesmoke;");
        tab3.setContent(ExerciseRoot);     
        
  
        // Tab4:
        tab4 = new Tab("Info");
        tab4.idProperty().set("Info");
        tab4.setClosable(false);
        ImageView iv4 = new ImageView(img04);
        iv4.setFitHeight(32);
        iv4.setFitWidth(32);
        tab4.setGraphic(iv4);
        tab4.setStyle("-fx-border-color:gray; -fx-background-color: whitesmoke;");
        tab4.setContent(InfoRoot);     

        this.getTabs().addAll(tab0, tab2, tab3, tab4);
    }


    /**
     * @return the tab1
     */
    public Tab getTab1() {
        return tab1;
    }

    /**
     * @param tab1 the tab1 to set
     */
    public void setTab1(Tab tab1) {
        this.tab1 = tab1;
    }

    /**
     * @return the tab2
     */
    public Tab getTab2() {
        return tab2;
    }

    /**
     * @param tab2 the tab2 to set
     */
    public void setTab2(Tab tab2) {
        this.tab2 = tab2;
    }

    /**
     * @return the tab3
     */
    public Tab getTab3() {
        return tab3;
    }

    /**
     * @param tab3 the tab3 to set
     */
    public void setTab3(Tab tab3) {
        this.tab3 = tab3;
    }

    /**
     * @return the tab4
     */
    public Tab getTab4() {
        return tab4;
    }

    /**
     * @param tab4 the tab4 to set
     */
    public void setTab4(Tab tab4) {
        this.tab4 = tab4;
    }

    /**
     * @return the tab0
     */
    public Tab getTab0() {
        return tab0;
    }

    /**
     * @param tab0 the tab0 to set
     */
    public void setTab0(Tab tab0) {
        this.tab0 = tab0;
    }

}
