package GUI.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class ChartChooserController {
    public void goToAreaChart(ActionEvent actionEvent) throws IOException {
        // Creates an FXMLLoader to load the ToDoListWindow
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/AreaChartWindow.fxml"));
        // Load the FXML file and get the root node
        Parent root = loader.load();

        // Create a new stage for the ToDoListWindow
        Stage stage = new Stage();
        stage.setScene(new Scene(root)); // Set the scene to the loaded root

        stage.setTitle("AreaChart"); // Set the title of the stage
        stage.initModality(Modality.APPLICATION_MODAL); // Set the modality of the stage to application modal
        stage.show(); // Display the stage
    }

    public void goToScatterChart(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/ScatterChartWindow.fxml"));
        Parent root = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle("ScatterChart");
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();
    }

    public void goToLineChart(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/LineChartWindow.fxml"));
        Parent root = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle("LineChart");
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();
    }

    public void goToBarChart(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/BarChartWindow.fxml"));
        Parent root = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle("BarChart");
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();
    }

    public void goToPieChart(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/PieChartWindow.fxml"));
        Parent root = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle("PieChart");
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();
    }
}
