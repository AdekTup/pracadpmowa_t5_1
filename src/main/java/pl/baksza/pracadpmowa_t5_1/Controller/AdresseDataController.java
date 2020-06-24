package pl.baksza.pracadpmowa_t5_1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.baksza.pracadpmowa_t5_1.Model.AdresseData;
import pl.baksza.pracadpmowa_t5_1.Service.AderssDataService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AdresseDataController {

    AderssDataService aderssDataService;

    @Autowired
    public AdresseDataController(AderssDataService aderssDataService) {
        this.aderssDataService = aderssDataService;
    }

    @GetMapping("/fradr")
    public String getfr (Model model) {
        List<AdresseData> adresseDataList = aderssDataService.getFrApiAdresse();
        if (!adresseDataList.isEmpty()) {
            model.addAttribute("adresseDataList", adresseDataList);
            return "fradresseDataList";
        }
        return "hello";

    }
}

