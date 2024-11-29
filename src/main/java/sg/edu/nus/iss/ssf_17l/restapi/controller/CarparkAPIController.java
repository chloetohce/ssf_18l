package sg.edu.nus.iss.ssf_17l.restapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.json.JsonArray;
import jakarta.json.JsonObject;
import sg.edu.nus.iss.ssf_17l.model.Carpark;
import sg.edu.nus.iss.ssf_17l.restapi.service.CarparkAPIService;

@RestController
@RequestMapping("/api/carparks")
public class CarparkAPIController {
    
    @Autowired
    private CarparkAPIService carparkAPIService;

    public List<Carpark> getAll() {
        JsonArray carparkRecords = carparkAPIService.getAllRecords();

        // Parsing records
        List<Carpark> carparks = new ArrayList<>();
        for (int i = 0; i < carparkRecords.size(); i++) {
            JsonObject record = carparkRecords.getJsonObject(i);
            
            Carpark carpark = new Carpark(
                record.getInt("_id"),
                record.getString("carpark"),
                record.getString("category"),
                record.getString("weekdays_rate_1"),
                record.getString("weekdays_rate_2"),
                record.getString("saturday_rate"),
                record.getString("sunday_publicholiday_rate")
            );

            carparks.add(carpark);
        }

        return carparks;
    }
}
