package GUI.Controller;

import javafx.event.ActionEvent;
import javafx.scene.chart.Axis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

import java.util.Random;

public class LineChartController {


    public LineChart lineChart;

    public void drawLineChart(ActionEvent actionEvent) {
        Axis<Number> xAxis = lineChart.getXAxis();
        xAxis.setLabel("Month");

        Axis<Number> yAxis = lineChart.getYAxis();
        yAxis.setLabel("Sold Drinks");

        XYChart.Series<Number, Number> series = new XYChart.Series<Number, Number>();
        series.setName("Drinks sold in January");

        Random r = new Random();
        for (int i = 0; i < 31; i++) {
            series.getData().add(new XYChart.Data<>(i+1, r.nextInt(350)+250));
        }
      //series.getData().add(new XYChart.Data<>(1, 354));
      //series.getData().add(new XYChart.Data<>(2, 234));
      //series.getData().add(new XYChart.Data<>(3, 77));
      //series.getData().add(new XYChart.Data<>(4, 600));
      //series.getData().add(new XYChart.Data<>(5, 298));
      //series.getData().add(new XYChart.Data<>(6, 544));
      //series.getData().add(new XYChart.Data<>(7, 404));
      //series.getData().add(new XYChart.Data<>(8, 367));

        lineChart.getData().add(series);
    }

}
