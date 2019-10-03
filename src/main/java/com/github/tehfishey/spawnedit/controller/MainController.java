package com.github.tehfishey.spawnedit.controller;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.Window;

import com.github.tehfishey.spawnedit.model.Model;


public class MainController {
	private final Model model;
	private final Desktop desktop;
	private final FileChooser fileChooser;
	
	@FXML private AnchorPane root;
	@FXML private MenuItem menuLoad;
	
    public MainController(Model model) {
        this.model = model;
        this.desktop = Desktop.getDesktop();
        this.fileChooser = new FileChooser();
    }
	
    public void initialize() {
    }
    
	public void exit(ActionEvent event) {
		 java.lang.System.exit(0);
	}
	
	public void loadFile(ActionEvent event) {
		configureFileChooser(fileChooser);
		File file = fileChooser.showOpenDialog(root.getScene().getWindow());
		if (file != null) model.getFileManager().loadFile(file);
	}

	
	private static void configureFileChooser(final FileChooser fileChooser){                           
        fileChooser.setTitle("Load");
        fileChooser.setInitialDirectory(
            new File(System.getProperty("user.home"))
        ); 
        fileChooser.getExtensionFilters().addAll(
        		new FileChooser.ExtensionFilter("JSON", "*.json"),
        		new FileChooser.ExtensionFilter("All", "*.*")
            );
	}

}