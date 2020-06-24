package pl.baksza.pracadpmowa_t5_1.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.baksza.pracadpmowa_t5_1.Model.AdresseData;
import pl.baksza.pracadpmowa_t5_1.Model.Feature;
import pl.baksza.pracadpmowa_t5_1.Model.FrApiAdresse;

import java.util.ArrayList;
import java.util.List;

@Service
public class AderssDataService {
    List<AdresseData> adresseDataList;

    public AderssDataService() {
        this.adresseDataList = getFrApiAdresse();
    }

    public List<AdresseData> getAdresseDataList() {
        return adresseDataList;
    }

    public void setAdresseDataList(List<AdresseData> adresseDataList) {
        this.adresseDataList = adresseDataList;
    }

    public List<AdresseData> getFrApiAdresse() {
        RestTemplate restTemplate = new RestTemplate();

        FrApiAdresse frApiAdresse = restTemplate.getForObject("https://api-adresse.data.gouv.fr/search/?q=8+bd+du+port&limit=15",FrApiAdresse.class);
        List<Feature> featureList = frApiAdresse.getFeatures();
        AdresseData adresseData = null;
        List<AdresseData> adresseDataList = new ArrayList<>();

        for(Feature f : featureList ) {
            adresseData = new AdresseData(f.getProperties().getProperty("city"),f.getProperties().getProperty("postcode"),f.getProperties().getProperty("street"),f.getProperties().getProperty("label"));
            adresseDataList.add(adresseData);

        }

        return adresseDataList;

    }
}
