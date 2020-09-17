package gson.to.java.model;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * Auto-generated: 2020-09-15 10:11:25
 *
 * @author http://www.itjson.com 
 * @website http://www.itjson.com/itjson/json2java.html 
 */
public class Fveresult {

    @JsonProperty("flightInfoDt")
    private List<Flightinfodt> flightInfoDt;
    @JsonProperty("qryDt")
    private String qrydt;
    @JsonProperty("fltNbr")
    private String fltnbr;
    @JsonProperty("agtNbr")
    private String agtnbr;
    @JsonProperty("usrOffc")
    private String usroffc;
    @JsonProperty("qryTm")
    private String qrytm;

    /**
	 * @return the flightInfoDt
	 */
	public List<Flightinfodt> getFlightInfoDt() {
		return flightInfoDt;
	}
	/**
	 * @param flightInfoDt the flightInfoDt to set
	 */
	public void setFlightInfoDt(List<Flightinfodt> flightInfoDt) {
		this.flightInfoDt = flightInfoDt;
	}
	public void setQrydt(String qrydt) {
         this.qrydt = qrydt;
     }
     public String getQrydt() {
         return qrydt;
     }

    public void setFltnbr(String fltnbr) {
         this.fltnbr = fltnbr;
     }
     public String getFltnbr() {
         return fltnbr;
     }

    public void setAgtnbr(String agtnbr) {
         this.agtnbr = agtnbr;
     }
     public String getAgtnbr() {
         return agtnbr;
     }

    public void setUsroffc(String usroffc) {
         this.usroffc = usroffc;
     }
     public String getUsroffc() {
         return usroffc;
     }

    public void setQrytm(String qrytm) {
         this.qrytm = qrytm;
     }
     public String getQrytm() {
         return qrytm;
     }

}