package models;

import java.util.*;

//model that incorporates more than 1 chart model so that single api call is enough to retrive any number of chartdata. Right now only 2 is needed
public class DataSource {
    private ChartSetting chart;
    private ArrayList<ChartDataModel> data;

    public DataSource(){

    }

    public DataSource(ChartSetting chart, ArrayList<ChartDataModel> data) {
        this.chart = chart;
        this.data = data;
    }

    public ChartSetting getChart() {
        return chart;
    }

    public void setChart(ChartSetting chart) {
        this.chart = chart;
    }

    public ArrayList<ChartDataModel> getData() {
        return data;
    }

    public void setData(ArrayList<ChartDataModel> data) {
        this.data = data;
    }

    
    


    
 
    
    
}