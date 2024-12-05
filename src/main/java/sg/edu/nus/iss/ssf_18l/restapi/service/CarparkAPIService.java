package sg.edu.nus.iss.ssf_18l.restapi.service;

import java.io.StringReader;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import jakarta.json.Json;
import jakarta.json.JsonArray;
import jakarta.json.JsonObject;
import jakarta.json.JsonReader;
import sg.edu.nus.iss.ssf_18l.utilities.Url;

@Service
public class CarparkAPIService {
    RestTemplate restTemplate = new RestTemplate();
    
    public JsonArray getAllRecords() {
        // Getting data
        ResponseEntity<String> rawData = restTemplate.getForEntity(Url.API_CARPARK, String.class);
        String payload = rawData.getBody();

        // Reading data
        JsonReader reader = Json.createReader(new StringReader(payload));
        JsonObject jObject = reader.readObject();
        JsonArray carparkRecords = jObject.getJsonObject("result").getJsonArray("records");

        return carparkRecords; 

        
    }
}
