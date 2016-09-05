
import java.io.*;
import java.util.*;

/**
 * Created by Rafael on 05.09.2016.
 */
public class Main {


    public static void main(String[] args) throws IOException {

        if (args.length != 1) {
            System.out.println("Invalid number of arguments!");
            throw new IllegalArgumentException("Invalid number of arguments!");
        }
        String s_path = args[0];
        File input_file = new File(s_path);
        if (!input_file.exists()) {
            System.out.printf("File %s does not exist!", input_file.getPath());
            throw new FileNotFoundException(String.format("File %s does not exist!", input_file.getPath()));
        }

        String input_text = readFile(s_path);
        String output_text = mMTask(input_text);
        writeFile(s_path, output_text);

    }


    private static String readFile(String path) throws IOException {

        String content_input = new Scanner(new File(path)).useDelimiter("\\Z").next();
        return content_input;


    }


    public static String mMTask(String text) {

        text = text.replaceAll("m", "m_replace");
        text = text.replace("M", "m");
        text = text.replaceAll("m_replace", "M");
        return text;

    }

    private static void writeFile(String path, String content) throws IOException {

        FileWriter edit = new FileWriter(path);
        edit.write(content);
        edit.close();

        System.out.println(content);
    }


}
