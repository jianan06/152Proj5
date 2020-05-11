package Job;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Job.fxml"));
        try {
            root = FXMLLoader.load(loc);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(-1);
            Scene windowContents = new Scene(root);
            primaryStage.setScene(windowContents);
            primaryStage.setScene(new Scene(root, 300, 275));
            primaryStage.show();
            primaryStage.setTitle("Project 5");
            primaryStage.show();
        }

        @FXML
        public void openJob (ActionEvent event){
            Parent root = null;
            var loc = getClass().getResource("Job.fxml");
            try {
                root = FXMLLoader.load(loc);
            } catch (IOException e) {
                System.out.println("FXML file not found");
            }
            //here is where we are creating the new window
            Scene windowContents = new Scene(root, 900, 400);
            Stage recipeWindow = new Stage();
            recipeWindow.setScene(windowContents);
            recipeWindow.setTitle("Recipe Finder Demo");
            recipeWindow.show();
        }
    }
}