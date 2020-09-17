package gson.to.java.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated: 2020-09-15 10:11:25
 *
 * @author http://www.itjson.com 
 * @website http://www.itjson.com/itjson/json2java.html 
 */
public class Response {

    @JsonProperty("fveResult")
    private Fveresult fveResult;

	/**
	 * @return the fveResult
	 */
	public Fveresult getFveResult() {
		return fveResult;
	}

	/**
	 * @param fveResult the fveResult to set
	 */
	public void setFveResult(Fveresult fveResult) {
		this.fveResult = fveResult;
	}

}