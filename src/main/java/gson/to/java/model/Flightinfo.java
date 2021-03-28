package gson.to.java.model;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Auto-generated: 2020-09-15 10:11:25
 *
 * @author http://www.itjson.com 
 * @website http://www.itjson.com/itjson/json2java.html 
 */
public class Flightinfo {

    @JsonProperty("cbnSeq")
    private String cbnseq;
    @JsonProperty("dptArvAirpt")
    private String dptarvairpt;
    @JsonProperty("fltDptDt")
    private String fltdptdt;
    @JsonProperty("fltNbr")
    private String fltnbr;
    @JsonProperty("fltOffc")
    private String fltoffc;
    @JsonProperty("fltSubOffc")
    private String fltsuboffc;
    @JsonProperty("segInfo")
    private List<Seginfo> seginfo;
    public void setCbnseq(String cbnseq) {
         this.cbnseq = cbnseq;
     }
     public String getCbnseq() {
         return cbnseq;
     }

    public void setDptarvairpt(String dptarvairpt) {
         this.dptarvairpt = dptarvairpt;
     }
     public String getDptarvairpt() {
         return dptarvairpt;
     }

    public void setFltdptdt(String fltdptdt) {
         this.fltdptdt = fltdptdt;
     }
     public String getFltdptdt() {
         return fltdptdt;
     }

    public void setFltnbr(String fltnbr) {
         this.fltnbr = fltnbr;
     }
     public String getFltnbr() {
         return fltnbr;
     }

    public void setFltoffc(String fltoffc) {
         this.fltoffc = fltoffc;
     }
     public String getFltoffc() {
         return fltoffc;
     }

    public void setFltsuboffc(String fltsuboffc) {
         this.fltsuboffc = fltsuboffc;
     }
     public String getFltsuboffc() {
         return fltsuboffc;
     }

    public void setSeginfo(List<Seginfo> seginfo) {
         this.seginfo = seginfo;
     }
     public List<Seginfo> getSeginfo() {
         return seginfo;
     }

}