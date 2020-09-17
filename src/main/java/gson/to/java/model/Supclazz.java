package gson.to.java.model;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * Auto-generated: 2020-09-15 10:11:25
 *
 * @author http://www.itjson.com 
 * @website http://www.itjson.com/itjson/json2java.html 
 */
public class Supclazz {

    @JsonProperty("subClazz")
    private List<Subclazz> subclazz;
    @JsonProperty("supBkd")
    private String supbkd;
    @JsonProperty("supCbn")
    private String supcbn;
    @JsonProperty("supRev")
    private String suprev;
    public void setSubclazz(List<Subclazz> subclazz) {
         this.subclazz = subclazz;
     }
     public List<Subclazz> getSubclazz() {
         return subclazz;
     }

    public void setSupbkd(String supbkd) {
         this.supbkd = supbkd;
     }
     public String getSupbkd() {
         return supbkd;
     }

    public void setSupcbn(String supcbn) {
         this.supcbn = supcbn;
     }
     public String getSupcbn() {
         return supcbn;
     }

    public void setSuprev(String suprev) {
         this.suprev = suprev;
     }
     public String getSuprev() {
         return suprev;
     }

}