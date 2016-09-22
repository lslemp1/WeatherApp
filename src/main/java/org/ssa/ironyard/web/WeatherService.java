package org.ssa.ironyard.web;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class WeatherService {
    
    public Weather getWeather(String state, String city)
    {
        final String uri = "http://api.wunderground.com/api/7ff9579acf87a0d2/geolookup/conditions/q/" + state + "/" + city + ".json";
        RestTemplate restTemplate = new RestTemplate();
        Weather result = restTemplate.getForObject(uri, Weather.class);
        return result;
    }
    
    
    
    
    
//    
//    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.5.1/jquery.min.js"></script>
//    <script>
//    jQuery(document).ready(function($) {
//      $.ajax({
//      url : "http://api.wunderground.com/api/7ff9579acf87a0d2/geolookup/conditions/q/IA/Cedar_Rapids.json",
//      dataType : "jsonp",
//      success : function(parsed_json) {
//      var location = parsed_json['location']['city'];
//      var temp_f = parsed_json['current_observation']['temp_f'];
//      alert("Current temperature in " + location + " is: " + temp_f);
//      }
//      });
//    });
//    </script>
    
    
    
    
    
}
