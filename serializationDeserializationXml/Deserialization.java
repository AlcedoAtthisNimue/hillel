package nikitinaalexandra.serializationDeserializationXml;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import nikitinaalexandra.serializationDeserializationJson.Resources;

import java.io.IOException;

public class Deserialization {
    public static void main(String[] args) throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        Person person = xmlMapper.readValue(Resources.resourceFile("HometaskXML.xml"), Person.class);
        System.out.println(person);
    }
}
