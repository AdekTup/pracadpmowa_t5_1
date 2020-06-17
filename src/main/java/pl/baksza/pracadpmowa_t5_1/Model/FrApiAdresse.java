package pl.baksza.pracadpmowa_t5_1.Model;

import com.fasterxml.jackson.annotation.*;
import org.springframework.ui.Model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "type",
        "version",
        "features",
        "attribution",
        "licence",
        "query",
        "limit"
})
public class FrApiAdresse {

    @JsonProperty("type")
    private String type;
    @JsonProperty("version")
    private String version;
    @JsonProperty("features")
    private List<Feature> features = null;
    @JsonProperty("attribution")
    private String attribution;
    @JsonProperty("licence")
    private String licence;
    @JsonProperty("query")
    private String query;
    @JsonProperty("limit")
    private Integer limit;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public FrApiAdresse withType(String type) {
        this.type = type;
        return this;
    }

    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    public FrApiAdresse withVersion(String version) {
        this.version = version;
        return this;
    }

    @JsonProperty("features")
    public List<Feature> getFeatures() {
        return features;
    }

    @JsonProperty("features")
    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    public FrApiAdresse withFeatures(List<Feature> features) {
        this.features = features;
        return this;
    }

    @JsonProperty("attribution")
    public String getAttribution() {
        return attribution;
    }

    @JsonProperty("attribution")
    public void setAttribution(String attribution) {
        this.attribution = attribution;
    }

    public FrApiAdresse withAttribution(String attribution) {
        this.attribution = attribution;
        return this;
    }

    @JsonProperty("licence")
    public String getLicence() {
        return licence;
    }

    @JsonProperty("licence")
    public void setLicence(String licence) {
        this.licence = licence;
    }

    public FrApiAdresse withLicence(String licence) {
        this.licence = licence;
        return this;
    }

    @JsonProperty("query")
    public String getQuery() {
        return query;
    }

    @JsonProperty("query")
    public void setQuery(String query) {
        this.query = query;
    }

    public FrApiAdresse withQuery(String query) {
        this.query = query;
        return this;
    }

    @JsonProperty("limit")
    public Integer getLimit() {
        return limit;
    }

    @JsonProperty("limit")
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public FrApiAdresse withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public FrApiAdresse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {

        return "FrApiAdresse{" +
                "type='" + type + '\'' +
                ",\n version='" + version + '\'' +
                ",\n features=" + features +
                ",\n attribution='" + attribution + '\'' +
                ",\n licence='" + licence + '\'' +
                ",\n query='" + query + '\'' +
                ",\n limit=" + limit +
                ",\n additionalProperties=" + additionalProperties.toString() +
                '}';
    }
}
