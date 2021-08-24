package nikitinaalexandra.serializationDeserializationXml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.util.Arrays;

@JacksonXmlRootElement
public class Person {
    @JacksonXmlProperty
    private String firstName;
    @JacksonXmlProperty
    private String lastName;
    @JacksonXmlProperty(localName = "phoneNumber")
    @JacksonXmlElementWrapper(localName = "phoneNumbers")
    private String[] phoneNumbers;
    @JacksonXmlProperty(localName = "address")
    @JacksonXmlElementWrapper(localName = "addresses")
    private Address[] addresses;

    public Person() {}

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String value) {
        this.firstName = value;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String value) {
        this.lastName = value;
    }

    public String[] getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(String[] phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public Address[] getAddresses() {
        return addresses;
    }
    public void setAddresses(Address[] value) {
        this.addresses = value;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumbers=" + Arrays.toString(phoneNumbers) +
                ", addresses=" + Arrays.toString(addresses) +
                '}';
    }
}

