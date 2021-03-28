package gson.to.java.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated: 2020-09-15 10:11:25
 *
 * @author http://www.itjson.com 
 * @website http://www.itjson.com/itjson/json2java.html 
 */
public class Queryflightrevenuers {

    @JsonProperty("Response")
    private Response response;
    @JsonProperty("sessionID")
    private String sessionid;
    private String version;
    @JsonProperty("requestID")
    private String requestid;
    private String success;
    @JsonProperty("transactionID")
    private String transactionid;
    public void setResponse(Response response) {
         this.response = response;
     }
     public Response getResponse() {
         return response;
     }

    public void setSessionid(String sessionid) {
         this.sessionid = sessionid;
     }
     public String getSessionid() {
         return sessionid;
     }

    public void setVersion(String version) {
         this.version = version;
     }
     public String getVersion() {
         return version;
     }

    public void setRequestid(String requestid) {
         this.requestid = requestid;
     }
     public String getRequestid() {
         return requestid;
     }

    public void setSuccess(String success) {
         this.success = success;
     }
     public String getSuccess() {
         return success;
     }

    public void setTransactionid(String transactionid) {
         this.transactionid = transactionid;
     }
     public String getTransactionid() {
         return transactionid;
     }

}