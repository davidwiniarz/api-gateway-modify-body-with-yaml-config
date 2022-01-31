package pl.santander.apigateway.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class JsonHeaders {

    @JsonProperty("Accept")
    public String accept;
    @JsonProperty("Accept-Encoding")
    public String acceptEncoding;
    @JsonProperty("Content-Length")
    public String contentLength;
    @JsonProperty("Forwarded")
    public String forwarded;

}
