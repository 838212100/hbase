package gson.to.java.model;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * Auto-generated: 2020-09-15 10:11:25
 *
 * @author http://www.itjson.com 
 * @website http://www.itjson.com/itjson/json2java.html 
 */
public class Seginfo {

    @JsonProperty("avgDisc")
    private String avgdisc;
    @JsonProperty("avgPrice")
    private String avgprice;
    @JsonProperty("fltEqt")
    private String flteqt;
    @JsonProperty("segCtyPair")
    private String segctypair;
    @JsonProperty("segDptTm")
    private String segdpttm;
    @JsonProperty("supClazz")
    private List<Supclazz> supclazz;
    @JsonProperty("ttlBkd")
    private String ttlbkd;
    @JsonProperty("ttlRev")
    private String ttlrev;
    public void setAvgdisc(String avgdisc) {
         this.avgdisc = avgdisc;
     }
     public String getAvgdisc() {
         return avgdisc;
     }

    public void setAvgprice(String avgprice) {
         this.avgprice = avgprice;
     }
     public String getAvgprice() {
         return avgprice;
     }

    public void setFlteqt(String flteqt) {
         this.flteqt = flteqt;
     }
     public String getFlteqt() {
         return flteqt;
     }

    public void setSegctypair(String segctypair) {
         this.segctypair = segctypair;
     }
     public String getSegctypair() {
         return segctypair;
     }

    public void setSegdpttm(String segdpttm) {
         this.segdpttm = segdpttm;
     }
     public String getSegdpttm() {
         return segdpttm;
     }

    public void setSupclazz(List<Supclazz> supclazz) {
         this.supclazz = supclazz;
     }
     public List<Supclazz> getSupclazz() {
         return supclazz;
     }

    public void setTtlbkd(String ttlbkd) {
         this.ttlbkd = ttlbkd;
     }
     public String getTtlbkd() {
         return ttlbkd;
     }

    public void setTtlrev(String ttlrev) {
         this.ttlrev = ttlrev;
     }
     public String getTtlrev() {
         return ttlrev;
     }

}