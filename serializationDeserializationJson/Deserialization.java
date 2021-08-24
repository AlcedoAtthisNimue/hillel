package nikitinaalexandra.serializationDeserializationJson;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

public class Deserialization {
    public static void main(String[] args) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        Person person = objectMapper.readValue(Resources.resourceFile("example1.json"), Person.class);
        System.out.println(person);
    }
}
