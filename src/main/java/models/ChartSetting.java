package models;

public class ChartSetting {
    private String caption;
    private String subCaption;
    private String xAxisName;
    private String yAxisName;
    private String numberSuffix;
    private String theme;
    private String palettecolors;
    private String chartLeftMargin;
    private String chartTopMargin;
    private String chartRightMargin;
    private String chartBottomMargin;
    private String canvasPadding;


    
    public ChartSetting() {
    }



    public ChartSetting(String caption, String subCaption, String xAxisName, String yAxisName, String numberSuffix,
            String theme, String palettecolors, String chartLeftMargin, String chartTopMargin, String chartRightMargin,
            String chartBottomMargin, String canvasPadding) {
        this.caption = caption;
        this.subCaption = subCaption;
        this.xAxisName = xAxisName;
        this.yAxisName = yAxisName;
        this.numberSuffix = numberSuffix;
        this.theme = theme;
        this.palettecolors = palettecolors;
        this.chartLeftMargin = chartLeftMargin;
        this.chartTopMargin = chartTopMargin;
        this.chartRightMargin = chartRightMargin;
        this.chartBottomMargin = chartBottomMargin;
        this.canvasPadding = canvasPadding;
    }



    public String getCaption() {
        return caption;
    }



    public void setCaption(String caption) {
        this.caption = caption;
    }



    public String getSubCaption() {
        return subCaption;
    }



    public void setSubCaption(String subCaption) {
        this.subCaption = subCaption;
    }



    public String getxAxisName() {
        return xAxisName;
    }



    public void setxAxisName(String xAxisName) {
        this.xAxisName = xAxisName;
    }



    public String getyAxisName() {
        return yAxisName;
    }



    public void setyAxisName(String yAxisName) {
        this.yAxisName = yAxisName;
    }



    public String getNumberSuffix() {
        return numberSuffix;
    }



    public void setNumberSuffix(String numberSuffix) {
        this.numberSuffix = numberSuffix;
    }



    public String getTheme() {
        return theme;
    }



    public void setTheme(String theme) {
        this.theme = theme;
    }



    public String getPalettecolors() {
        return palettecolors;
    }



    public void setPalettecolors(String palettecolors) {
        this.palettecolors = palettecolors;
    }



    public String getChartLeftMargin() {
        return chartLeftMargin;
    }



    public void setChartLeftMargin(String chartLeftMargin) {
        this.chartLeftMargin = chartLeftMargin;
    }



    public String getChartTopMargin() {
        return chartTopMargin;
    }



    public void setChartTopMargin(String chartTopMargin) {
        this.chartTopMargin = chartTopMargin;
    }



    public String getChartRightMargin() {
        return chartRightMargin;
    }



    public void setChartRightMargin(String chartRightMargin) {
        this.chartRightMargin = chartRightMargin;
    }



    public String getChartBottomMargin() {
        return chartBottomMargin;
    }



    public void setChartBottomMargin(String chartBottomMargin) {
        this.chartBottomMargin = chartBottomMargin;
    }



    public String getCanvasPadding() {
        return canvasPadding;
    }



    public void setCanvasPadding(String canvasPadding) {
        this.canvasPadding = canvasPadding;
    }

    
    
    
}