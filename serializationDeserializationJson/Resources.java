package nikitinaalexandra.serializationDeserializationJson;

import java.io.File;

public class Resources {
    public static File resourceFile(String fileName) {
        String workingFolder = System.getProperty("user.dir");
        String separator = System.getProperty("file.separator");
        String resourcesFolder = workingFolder + separator + "src" + separator + "main" + separator + "resources";
        return new File(resourcesFolder + separator + fileName);
    }
}
