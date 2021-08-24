package nikitinaalexandra.serializationDeserializationJson;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Serialization {
    public static void main(String[] args) throws IOException {
        Person person = new Person();
        Address address = new Address();
        Properties properties = new Properties();
        address.setCity("Berlin");
        address.setStreet("Friedrichstraße");
        address.setZipcode(10249);
        person.setAddress(address);
        properties.setAge("45 years");
        properties.setSalary("3500 EUR");
        person.setProperties(properties);
        List<String> citiies1 = Arrays.asList("Düssel", "Frankfurt am Main");
        person.setCities(citiies1);
        List<Integer> phoneNumbers1 = Arrays.asList(987654, 321987);
        person.setPhoneNumbers(phoneNumbers1);
        person.setPermanent(false);
        person.setId(987);
        person.setName("Hans");
        person.setRole("Developer");

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(Resources.resourceFile("example2.json"), person);
    }
}
