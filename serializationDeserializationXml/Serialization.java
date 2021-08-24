package nikitinaalexandra.serializationDeserializationXml;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import nikitinaalexandra.serializationDeserializationJson.Resources;

import java.io.IOException;

public class Serialization {
    public static void main(String[] args) throws IOException {
        Person person = new Person();
        Address address1 = new Address();
        Address address2 = new Address();
        String[] phoneNumbers1 = {"258741", "369852"};
        person.setPhoneNumbers(phoneNumbers1);

        person.setFirstName("Vasya");
        person.setLastName("Pupkin");
        Address[] addresses1 = {address1, address2};
        address1.setStreetName("Stroiteley");
        address1.setCity("Leningrad");
        address2.setStreetName("Mendeleeva");
        address2.setCity("Shepetivka");
        person.setAddresses(addresses1);

        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.writeValue(Resources.resourceFile("HometaskXML2.xml"), person);
    }
}


