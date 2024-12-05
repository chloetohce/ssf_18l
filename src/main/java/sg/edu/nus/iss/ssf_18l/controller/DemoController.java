package sg.edu.nus.iss.ssf_18l.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/date")
public class DemoController {

    @GetMapping()
    public String displayDateTime(Model model) throws ParseException {
        String strDate = "2004-08-09 15:30:22";
        SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        Date date = format.parse(strDate);
        model.addAttribute("date", date);
        return "date";
    }
}
