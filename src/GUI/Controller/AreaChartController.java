package GUI.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.Axis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;

import java.util.Random;

public class AreaChartController {
    @FXML
    public Button btnDrawAreaChart;
    @FXML
    private javafx.scene.chart.AreaChart<Number, Number> areaChart;


    public void drawAreaChart(ActionEvent actionEvent) {
        Axis<Number> xAxis = areaChart.getXAxis();
        xAxis.setLabel("Month");

        Axis<Number> yAxis = areaChart.getYAxis();
        yAxis.setLabel("Sold Drinks");

        XYChart.Series<Number, Number> series = new XYChart.Series<>();
        series.setName("Drinks sold in January");

        populateSeriesWithData(series);

        //areaChart.getData().clear(); // Clear existing data if i want to use it, so data does not overlay
        areaChart.getData().add(series);
    }

    private void populateSeriesWithData(XYChart.Series<Number, Number> series) {
        Random r = new Random();
        for (int i = 0; i < 31; i++) {
            series.getData().add(new XYChart.Data<>(i + 1, r.nextInt(350) + 250));
        }
    }
}
