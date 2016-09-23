package org.ssa.ironyard.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.InternalResourceView;

@RestController
@RequestMapping("/weatherservice")
public class WeatherController {
    
    @Autowired
    WeatherService weatherService;
    
    public WeatherController(WeatherService ws)
    {
        this.weatherService = ws;
    }
    
    
    @RequestMapping(value = "")
    public View weatherView() {
    return new InternalResourceView("Weather-Angular.html");
    }
    
    
    @RequestMapping(value="{state}/{city}", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    @ResponseBody
    public Weather getWeather(@PathVariable String state, @PathVariable String city){
        return weatherService.getWeather(state,city);
    }
    


}
