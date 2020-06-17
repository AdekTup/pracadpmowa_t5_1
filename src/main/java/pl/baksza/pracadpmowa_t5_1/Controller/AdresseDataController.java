package pl.baksza.pracadpmowa_t5_1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
import pl.baksza.pracadpmowa_t5_1.Model.AdresseData;
import pl.baksza.pracadpmowa_t5_1.Model.Feature;
import pl.baksza.pracadpmowa_t5_1.Model.FrApiAdresse;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AdresseDataController {

    private List<AdresseData> getFrApiAdresse() {
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

    @GetMapping("/fradr")
    public String getfr (Model model) {
        List<AdresseData> adresseDataList = getFrApiAdresse();
        if (!adresseDataList.isEmpty()) {
            model.addAttribute("adresseDataList", adresseDataList);
            return "fradresseDataList";
        }
        return "hello";

    }
}

//            System.out.println(f.getProperties().toString());
//            String city = f.getProperties().getProperty("city");
//            String postcode = f.getProperties().getProperty("postcode");
//            String street =  f.getProperties().getProperty("street");
//            String label = f.getProperties().getProperty("label");
//            System.out.println("C: " + city);
//            System.out.println("P: " + postcode);
//            System.out.println("S: " + street);
//            System.out.println("L: " + label);
