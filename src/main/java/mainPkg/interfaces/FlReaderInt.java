package mainPkg.interfaces;

import mainPkg.reader.UserData;

import java.util.List;

/**
 * Created by Denis on 12.04.2017.
 */
public interface FlReaderInt {
    List<UserData> FlRead(String fileName);
}
