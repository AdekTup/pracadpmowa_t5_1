package pl.baksza.pracadpmowa_t5_1.Model;

import com.fasterxml.jackson.annotation.*;
import org.springframework.ui.Model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "title",
        "version",
        "href",
        "results"
})
public class RecipePuppy {

    @JsonProperty("title")
    private String title;
    @JsonProperty("version")
    private Double version;
    @JsonProperty("href")
    private String href;
    @JsonProperty("results")
    private List<Result> results = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public RecipePuppy withTitle(String title) {
        this.title = title;
        return this;
    }

    @JsonProperty("version")
    public Double getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(Double version) {
        this.version = version;
    }

    public RecipePuppy withVersion(Double version) {
        this.version = version;
        return this;
    }

    @JsonProperty("href")
    public String getHref() {
        return href;
    }

    @JsonProperty("href")
    public void setHref(String href) {
        this.href = href;
    }

    public RecipePuppy withHref(String href) {
        this.href = href;
        return this;
    }

    @JsonProperty("results")
    public List<Result> getResults() {
        return results;
    }

    @JsonProperty("results")
    public void setResults(List<Result> results) {
        this.results = results;
    }

    public RecipePuppy withResults(List<Result> results) {
        this.results = results;
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

    public RecipePuppy withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return "RecipePuppy{" +
                "title='" + title + '\'' +
                ", version=" + version +
                ", href='" + href + '\'' +
                ", results=" + results +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
