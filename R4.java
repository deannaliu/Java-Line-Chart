package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class R4 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Line Chart Sample");

        final NumberAxis xAxis = new NumberAxis();
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Number of Month");
        yAxis.setLabel("Stock Price");

        final LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);

        lineChart.setTitle("Stock Monitoring, 2010");

        XYChart.Series<Number, Number> series = new XYChart.Series<>();
        series.setName("My Portfolio");

        series.getData().add(new XYChart.Data<>(1, 10));
        series.getData().add(new XYChart.Data<>(2, 14));
        series.getData().add(new XYChart.Data<>(3, 15));
        series.getData().add(new XYChart.Data<>(4, 24));
        series.getData().add(new XYChart.Data<>(5, 34));
        series.getData().add(new XYChart.Data<>(6, 36));
        series.getData().add(new XYChart.Data<>(7, 22));
        series.getData().add(new XYChart.Data<>(8, 45));
        series.getData().add(new XYChart.Data<>(9, 43));
        series.getData().add(new XYChart.Data<>(10, 17));
        series.getData().add(new XYChart.Data<>(11, 29));
        series.getData().add(new XYChart.Data<>(12, 25));


        XYChart.Series<Number, Number> series2 = new XYChart.Series<>();
        series2.setName("My Portfolio 2");
        series2.getData().add(new XYChart.Data<>(1, 1));
        series2.getData().add(new XYChart.Data<>(2, 34));
        series2.getData().add(new XYChart.Data<>(3, 25));
        series2.getData().add(new XYChart.Data<>(4, 44));
        series2.getData().add(new XYChart.Data<>(5, 39));
        series2.getData().add(new XYChart.Data<>(6, 16));
        series2.getData().add(new XYChart.Data<>(7, 55));
        series2.getData().add(new XYChart.Data<>(8, 54));
        series2.getData().add(new XYChart.Data<>(9, 48));
        series2.getData().add(new XYChart.Data<>(10, 27));
        series2.getData().add(new XYChart.Data<>(11, 37));
        series2.getData().add(new XYChart.Data<>(12, 29));

        XYChart.Series<Number, Number> series3 = new XYChart.Series<>();
        series3.setName("My Portfolio 3");
        for(int i = 0; i < series2.getData().size(); i++) {
            Number series3XValue = series2.getData().get(i).getXValue();
            Integer series3YValue = (Integer.parseInt(series2.getData().get(i).getYValue().toString())) + (Integer.parseInt(series.getData().get(i).getYValue().toString()));
            series3.getData().add(new XYChart.Data<>(series3XValue, series3YValue));
        }

        Scene scene = new Scene(lineChart, 800, 600);
        lineChart.getData().addAll(series, series2, series3);
        lineChart.setCreateSymbols(false);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}