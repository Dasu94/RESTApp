package hms.dropWizardEx.domain;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by dasuni on 12/16/15.
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Response {

    String statusCode;
    String description;
    @JsonProperty
    Developer developer;

    public Response() {
    }

    public Response(String statusCode, String description, Developer developer) {
        this.statusCode = statusCode;
        this.description = description;
        this.developer = developer;
    }

    public Response(String statusCode, String description) {
        this.statusCode = statusCode;
        this.description = description;
    }

}
