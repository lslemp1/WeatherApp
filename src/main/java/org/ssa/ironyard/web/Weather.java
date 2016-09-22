package org.ssa.ironyard.web;

public class Weather {

    CurrentObservation current_observation;
    
    public Weather() {
        // TODO Auto-generated constructor stub
    }

    public CurrentObservation getCurrent_observation() {
        return current_observation;
    }

    public void setCurrent_observation(CurrentObservation current_observation) {
        this.current_observation = current_observation;
    }

    @Override
    public String toString() {
        return "Weather [current_observation=" + current_observation + "]";
    }
    
    

    
}
