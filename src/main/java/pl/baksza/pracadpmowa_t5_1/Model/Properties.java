package pl.baksza.pracadpmowa_t5_1.Model;

import com.fasterxml.jackson.annotation.*;
import org.springframework.ui.Model;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "label",
        "score",
        "housenumber",
        "id",
        "type",
        "x",
        "y",
        "importance",
        "name",
        "postcode",
        "citycode",
        "city",
        "context",
        "street"
})
public class Properties {

    @JsonProperty("label")
    private String label;
    @JsonProperty("score")
    private Double score;
    @JsonProperty("housenumber")
    private String housenumber;
    @JsonProperty("id")
    private String id;
    @JsonProperty("type")
    private String type;
    @JsonProperty("x")
    private Double x;
    @JsonProperty("y")
    private Double y;
    @JsonProperty("importance")
    private Double importance;
    @JsonProperty("name")
    private String name;
    @JsonProperty("postcode")
    private String postcode;
    @JsonProperty("citycode")
    private String citycode;
    @JsonProperty("city")
    private String city;
    @JsonProperty("context")
    private String context;
    @JsonProperty("street")
    private String street;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    public Properties withLabel(String label) {
        this.label = label;
        return this;
    }

    @JsonProperty("score")
    public Double getScore() {
        return score;
    }

    @JsonProperty("score")
    public void setScore(Double score) {
        this.score = score;
    }

    public Properties withScore(Double score) {
        this.score = score;
        return this;
    }

    @JsonProperty("housenumber")
    public String getHousenumber() {
        return housenumber;
    }

    @JsonProperty("housenumber")
    public void setHousenumber(String housenumber) {
        this.housenumber = housenumber;
    }

    public Properties withHousenumber(String housenumber) {
        this.housenumber = housenumber;
        return this;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Properties withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public Properties withType(String type) {
        this.type = type;
        return this;
    }

    @JsonProperty("x")
    public Double getX() {
        return x;
    }

    @JsonProperty("x")
    public void setX(Double x) {
        this.x = x;
    }

    public Properties withX(Double x) {
        this.x = x;
        return this;
    }

    @JsonProperty("y")
    public Double getY() {
        return y;
    }

    @JsonProperty("y")
    public void setY(Double y) {
        this.y = y;
    }

    public Properties withY(Double y) {
        this.y = y;
        return this;
    }

    @JsonProperty("importance")
    public Double getImportance() {
        return importance;
    }

    @JsonProperty("importance")
    public void setImportance(Double importance) {
        this.importance = importance;
    }

    public Properties withImportance(Double importance) {
        this.importance = importance;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Properties withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("postcode")
    public String getPostcode() {
        return postcode;
    }

    @JsonProperty("postcode")
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public Properties withPostcode(String postcode) {
        this.postcode = postcode;
        return this;
    }

    @JsonProperty("citycode")
    public String getCitycode() {
        return citycode;
    }

    @JsonProperty("citycode")
    public void setCitycode(String citycode) {
        this.citycode = citycode;
    }

    public Properties withCitycode(String citycode) {
        this.citycode = citycode;
        return this;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    public Properties withCity(String city) {
        this.city = city;
        return this;
    }

    @JsonProperty("context")
    public String getContext() {
        return context;
    }

    @JsonProperty("context")
    public void setContext(String context) {
        this.context = context;
    }

    public Properties withContext(String context) {
        this.context = context;
        return this;
    }

    @JsonProperty("street")
    public String getStreet() {
        return street;
    }

    @JsonProperty("street")
    public void setStreet(String street) {
        this.street = street;
    }

    public Properties withStreet(String street) {
        this.street = street;
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

    public Properties withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return "Properties{" +
                "\n label='" + label + '\'' +
                ",\n score=" + score +
                ",\n housenumber='" + housenumber + '\'' +
                ",\n id='" + id + '\'' +
                ",\n type='" + type + '\'' +
                ",\n x=" + x +
                ",\n y=" + y +
                ",\n importance=" + importance +
                ",\n name='" + name + '\'' +
                ",\n postcode='" + postcode + '\'' +
                ",\n citycode='" + citycode + '\'' +
                ",\n city='" + city + '\'' +
                ",\n context='" + context + '\'' +
                ",\n street='" + street + '\'' +
                ",\n additionalProperties=" + additionalProperties.toString() +
                '}';
    }
}
