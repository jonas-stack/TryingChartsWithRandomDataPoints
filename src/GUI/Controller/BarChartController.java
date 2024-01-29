package GUI.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.Axis;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;

import java.util.Random;

public class BarChartController {


    public BarChart barChart;

    public void drawBarChart(ActionEvent actionEvent) {
        Axis<String> xAxis = barChart.getXAxis();
        xAxis.setLabel("Day");

        Axis<Number> yAxis = barChart.getYAxis();
        yAxis.setLabel("Amount");


        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            XYChart.Series<String, Number> series = new XYChart.Series();
            series.setName("Week " + (i + 12));
            series.getData().add(new XYChart.Data<>("Monday", r.nextInt(90) + 10));
            series.getData().add(new XYChart.Data<>("Tuesday", r.nextInt(90) + 10));
            series.getData().add(new XYChart.Data<>("Wednesday", r.nextInt(90) + 10));
            series.getData().add(new XYChart.Data<>("Thursday", r.nextInt(90) + 10));
            series.getData().add(new XYChart.Data<>("Friday", r.nextInt(90) + 10));

            barChart.getData().add(series);
        }
    }
}
