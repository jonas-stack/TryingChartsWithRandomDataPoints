package GUI.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.Axis;
import javafx.scene.chart.ScatterChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;

import java.util.Random;

public class ScatterChartController {


    public ScatterChart scatterChart;

    public void drawScatterChart(ActionEvent actionEvent) {
        Axis<String> xAxis = scatterChart.getXAxis();
        xAxis.setLabel("Day");

        Axis<Number> yAxis = scatterChart.getYAxis();
        yAxis.setLabel("Amount");

        XYChart.Series<String, Number> series = new XYChart.Series();
        series.setName("Drinks sold");
        series.getData().add(new XYChart.Data<>("Monday", 10));
        series.getData().add(new XYChart.Data<>("Tuesday", 20));
        series.getData().add(new XYChart.Data<>("Wednesday", 30));
        series.getData().add(new XYChart.Data<>("Thursday", 40));
        series.getData().add(new XYChart.Data<>("Friday", 10));
        series.getData().add(new XYChart.Data<>("Saturday", 20));
        series.getData().add(new XYChart.Data<>("Sunday", 30));

        /*
        Random r = new Random();
        for (int i = 0; i < 31; i++) {
            series.getData().add(new XYChart.Data<>(i+1, r.nextInt(350)+250));
        }
        */

        scatterChart.getData().add(series);
    }
}
