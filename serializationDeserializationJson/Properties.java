
package nikitinaalexandra.serializationDeserializationJson;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "age",
    "salary"
})

public class Properties implements Serializable {

    @JsonProperty("age")
    private String age;
    @JsonProperty("salary")
    private String salary;

    private final static long serialVersionUID = -4625265557924708874L;

    public Properties() {}

    public Properties(String age, String salary) {
        super();
        this.age = age;
        this.salary = salary;
    }

    @JsonProperty("age")
    public String getAge() {
        return age;
    }

    @JsonProperty("age")
    public void setAge(String age) {
        this.age = age;
    }

    @JsonProperty("salary")
    public String getSalary() {
        return salary;
    }

    @JsonProperty("salary")
    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Properties{" +
                "age='" + age + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
