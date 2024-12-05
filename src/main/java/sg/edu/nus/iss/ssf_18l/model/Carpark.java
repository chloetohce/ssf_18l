package sg.edu.nus.iss.ssf_18l.model;

public class Carpark {
    private int id;
    private String name;
    private String location;
    private String rateWeekdayMorning;
    private String rateWeekdayNight;
    private String rateSaturday;
    private String rateSundayPH;

    public Carpark() {
    }

    public Carpark(int id, String name, String location, String rateWeekdayMorning, String rateWeekdayNight,
            String rateSaturday, String rateSundayPH) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.rateWeekdayMorning = rateWeekdayMorning;
        this.rateWeekdayNight = rateWeekdayNight;
        this.rateSaturday = rateSaturday;
        this.rateSundayPH = rateSundayPH;
    }

    @Override
    public String toString() {
        return String.format("%d,%s,%s,%s,%s,%s,%s",
                id, name, location, rateWeekdayMorning, rateWeekdayNight, rateSaturday, rateSundayPH 
        );
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getLocation() {return location;}
    public void setLocation(String location) {this.location = location;}

    public String getRateWeekdayMorning() {return rateWeekdayMorning;}
    public void setRateWeekdayMorning(String rateWeekdayMorning) {this.rateWeekdayMorning = rateWeekdayMorning;}

    public String getRateWeekdayNight() {return rateWeekdayNight;}
    public void setRateWeekdayNight(String rateWeekdayNight) {this.rateWeekdayNight = rateWeekdayNight;}

    public String getRateSaturday() {return rateSaturday;}
    public void setRateSaturday(String rateSaturday) {this.rateSaturday = rateSaturday;}

    public String getRateSundayPH() {return rateSundayPH;}
    public void setRateSundayPH(String rateSundayPH) {this.rateSundayPH = rateSundayPH;}

    
}
