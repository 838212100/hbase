package gson.to.java.model;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * Auto-generated: 2020-09-15 10:11:25
 *
 * @author http://www.itjson.com 
 * @website http://www.itjson.com/itjson/json2java.html 
 */
public class Flightinfodt {

    @JsonProperty("dptDt")
    private String dptdt;
    @JsonProperty("flightInfo")
    private List<Flightinfo> flightinfo;
    public void setDptdt(String dptdt) {
         this.dptdt = dptdt;
     }
     public String getDptdt() {
         return dptdt;
     }

    public void setFlightinfo(List<Flightinfo> flightinfo) {
         this.flightinfo = flightinfo;
     }
     public List<Flightinfo> getFlightinfo() {
         return flightinfo;
     }

}