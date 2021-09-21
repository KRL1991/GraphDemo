package com.example.graphdemo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.control.Button;

import java.util.concurrent.atomic.AtomicInteger;

public class HelloController {

    XYChart.Series series1 = new XYChart.Series<>();

    AtomicInteger countY = new AtomicInteger(0);
    AtomicInteger countX = new AtomicInteger(0);

    @FXML
    private Button StartButton;

    @FXML
    private LineChart<String,Integer> tempGraph;

    @FXML
    void startGraph(ActionEvent event) {





        for (int i = 0; i < 10; i++) {
            countY.addAndGet( 1);
            countX.addAndGet(10);

            series1.getData().add(new XYChart.Data<String,Integer>(Integer.toString(countY.intValue()),countX.intValue()));

        }
        tempGraph.getData().add(series1);


    }

}