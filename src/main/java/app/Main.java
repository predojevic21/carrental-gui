package app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import view.*;

public class Main extends Application {

    public static Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage=new Stage();
        Scene scene=new Scene(new ListReservationsView(),500,500);
        stage.setTitle("Car Rental");
        stage.setScene(scene);
        stage.show();
    }
}
