package pl.baksza.pracadpmowa_t5_1.Model;

public class AdresseData {
    private String city;
    private String postcode;
    private String street;
    private String label;

    public AdresseData(String city, String postcode, String street, String label) {
        this.city = city;
        this.postcode = postcode;
        this.street = street;
        this.label = label;
    }

    public AdresseData() {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "AdresseData{" +
                "city='" + city + '\'' +
                ", postcode='" + postcode + '\'' +
                ", street='" + street + '\'' +
                ", label='" + label + '\'' +
                '}';
    }
}
//System.out.println("C: " + city);
//        System.out.println("P: " + postcode);
//        System.out.println("S: " + street);
//        System.out.println("L: " + label);
