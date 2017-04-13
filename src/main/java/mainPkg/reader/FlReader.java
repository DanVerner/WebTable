package mainPkg.reader;

import mainPkg.interfaces.FlReaderInt;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Denis on 12.04.2017.
 */
@Component
public class FlReader implements FlReaderInt{
    private static final Logger log = Logger.getLogger(FlReader.class);

    private static String str = "";
    private static String[] mas;

    public List<UserData> FlRead(String fileName){
        List<UserData> personsList = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(
                                    new FileReader(fileName))) {
            while((str = reader.readLine()) != null) {
                mas = str.split(";");
                UserData userData = new UserData(mas[0],
                        Integer.parseInt(mas[1]),
                        Integer.parseInt(mas[2]),
                        Integer.parseInt(mas[3]));
                personsList.add(userData);
            }
        } catch (FileNotFoundException e) {
            log.error("File not found!");
        } catch (IOException e) {
            log.error("Exception!", e);
        }
        return personsList;
    }

}
