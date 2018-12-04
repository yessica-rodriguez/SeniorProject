/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senior_project.LogIn.Edit;

import java.io.File;
import javafx.event.ActionEvent;
import javafx.scene.image.Image;
import javafx.stage.FileChooser;

/**
 *
 * @author yessi
 */
public class EditController {
    private EditModel editModel; 
    private EditView editView;
    
    private File selectedFile;
    private Image i;

    public EditController(EditModel editModel, EditView editView) 
    {
        this.editModel = editModel;
        this.editView = editView;
        setupHandlers();
    }
    
    public EditController(String m) 
    {
        this.editModel = new EditModel();
        this.editView  = new EditView(m);
        setupHandlers();
    }
    
    public void setupHandlers()
    {
        //buttons
        editView.getU().setOnAction((ActionEvent event) -> {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Select PDF files");
            fileChooser.getExtensionFilters().addAll(
                    new FileChooser.ExtensionFilter("All Images", "*.*"),
                    new FileChooser.ExtensionFilter("JPG", "*.jpg"),
                    new FileChooser.ExtensionFilter("PNG", "*.png")
            );
            setSelectedFile(fileChooser.showOpenDialog(null));
            if (getSelectedFile() != null) {
                setI(new Image(getSelectedFile().toURI().toString()));
                //editView.setIv(new ImageView(editView.getImage()));
                editView.updatePPicEdit(getI());
            }
            else {
                System.out.println("File selection cancelled.");
            }
        });
    }

    /**
     * @return the editModel
     */
    public EditModel getEditModel() {
        return editModel;
    }

    /**
     * @param editModel the editModel to set
     */
    public void setEditModel(EditModel editModel) {
        this.editModel = editModel;
    }

    /**
     * @return the editView
     */
    public EditView getEditView() {
        return editView;
    }

    /**
     * @param editView the editView to set
     */
    public void setEditView(EditView editView) {
        this.editView = editView;
    }

    /**
     * @return the selectedFile
     */
    public File getSelectedFile() {
        return selectedFile;
    }

    /**
     * @param selectedFile the selectedFile to set
     */
    public void setSelectedFile(File selectedFile) {
        this.selectedFile = selectedFile;
    }

    /**
     * @return the i
     */
    public Image getI() {
        return i;
    }

    /**
     * @param i the i to set
     */
    public void setI(Image i) {
        this.i = i;
    }
}
