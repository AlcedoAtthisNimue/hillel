package nikitinaalexandra.lesson02082021.homework.file;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class FileWrite {
    public static final String WORK_DIRECTORY = "src/main/java/nikitinaalexandra/lesson02082021/homework/file";
    public static final String PROPS_FILE = "data.properties";
    public static final String SAMPLE_DIR = "newdir";

    public static void main(String[] args) throws IOException {
        Path propsPath = Paths.get(WORK_DIRECTORY + "/" + PROPS_FILE);
        File propsFile = new File(propsPath.toString());//returned path string uses the default system separator
        Properties properties = new Properties();
        properties.load(new FileReader(propsFile));
        String sampleFile = properties.getProperty("fileName");

        Path filePath = Paths.get(WORK_DIRECTORY + "/" + sampleFile);
        if (!Files.exists(filePath)){
            Files.createFile(filePath);
        }
        Path dirPath = Paths.get(WORK_DIRECTORY + "/" + SAMPLE_DIR);
        if (!Files.exists(dirPath)){
            Files.createDirectory(dirPath);
        }

        String text = "Hello!\nMy name is Alexandra Nikitina. I live in Kyiv. I love Java!";
        byte[] buffer = text.getBytes();
        Files.write(filePath, buffer);

        Path targetPath = Paths.get(dirPath.toString() + "\\" + sampleFile);
        if (Files.exists(targetPath)){
            Files.delete(targetPath);
        }
        Files.move(filePath, targetPath);

        FileReader fileReader = new FileReader(targetPath.toString());
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while (bufferedReader.ready()) {
            System.out.println(bufferedReader.readLine());
        }
    }
}
