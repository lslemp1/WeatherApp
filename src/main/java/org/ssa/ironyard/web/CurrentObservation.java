package org.ssa.ironyard.web;

public class CurrentObservation {
    
    private String weather;
    private String temperature_string;
    private String relative_humidity;
    private Double wind_mph;
    
    public CurrentObservation() {
        // TODO Auto-generated constructor stub
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getTemperature_string() {
        return temperature_string;
    }

    public void setTemperature_string(String temperature_string) {
        this.temperature_string = temperature_string;
    }

    public String getRelative_humidity() {
        return relative_humidity;
    }

    public void setRelative_humidity(String relative_humidity) {
        this.relative_humidity = relative_humidity;
    }

    public Double getWind_mph() {
        return wind_mph;
    }

    public void setWind_mph(Double wind_mph) {
        this.wind_mph = wind_mph;
    }
    
    

}
