package senior_project;

import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;
import senior_project.Tabs.TabManager;

/**
 *
 * @author MQ0162246
 */
public class GUI extends BorderPane{
   
    // Gui elements
    private TabManager   mvcTabs;
    
    public GUI() 
    {
        mvcTabs   = new TabManager();
        this.setCenter(mvcTabs);
    }
    public Parent getrootNode()
    { 
       return this;
    }

    /**
     * @return the root
     */
    public BorderPane getRoot() {
        return this;
    }

    /**
     * @return the mvcTabs
     */
    public TabManager getVaqPacTabs() {
        return mvcTabs;
    }

    /**
     * @param vaqPacTabs the mvcTabs to set
     */
    public void setVaqPacTabs(TabManager vaqPacTabs) {
        this.mvcTabs = vaqPacTabs;
    }
}
