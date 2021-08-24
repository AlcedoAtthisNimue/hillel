package nikitinaalexandra.serializationDeserializationJson;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "street",
    "city",
    "zipcode"
})
public class Address implements Serializable
{
    @JsonProperty("street")
    private String street;
    @JsonProperty("city")
    private String city;
    @JsonProperty("zipcode")
    private Integer zipcode;

    private final static long serialVersionUID = 1196524960945753856L;

    public Address() {}

    public Address(String street, String city, Integer zipcode) {
        super();
        this.street = street;
        this.city = city;
        this.zipcode = zipcode;
    }

    @JsonProperty("street")
    public String getStreet() {
        return street;
    }

    @JsonProperty("street")
    public void setStreet(String street) {
        this.street = street;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("zipcode")
    public Integer getZipcode() {
        return zipcode;
    }

    @JsonProperty("zipcode")
    public void setZipcode(Integer zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", zipcode=" + zipcode +
                '}';
    }
}
