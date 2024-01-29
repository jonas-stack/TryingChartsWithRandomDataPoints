package GUI.Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;

import java.util.Random;

public class PieChartController {

    public PieChart pieChart;

    public void drawPieChart(ActionEvent actionEvent) {

        Random r = new Random();

        ObservableList<PieChart.Data> pieData = FXCollections.observableArrayList(
                    new PieChart.Data("Monday", r.nextInt(90) + 10),
                    new PieChart.Data("Tuesday", r.nextInt(90) + 10),
                    new PieChart.Data("Wednesday", r.nextInt(90) + 10),
                    new PieChart.Data("Thursday", r.nextInt(90) + 10),
                    new PieChart.Data("Friday", r.nextInt(90) + 10)
        );

        pieChart.setData(pieData);
    }
}

