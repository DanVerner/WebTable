package mainPkg.controllers;

import mainPkg.interfaces.FlReaderInt;
import mainPkg.reader.FlReader;
import mainPkg.reader.UserData;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Denis on 12.04.2017.
 */
@Controller
public class IndexController {
    private static final Logger log = Logger.getLogger(IndexController.class);
    private static String fileName = "C:\\Users\\Denis\\IdeaProjects\\WebTable\\src\\ppl.txt";

    private FlReaderInt flReader;

    @Autowired
    public IndexController(FlReaderInt flReader) {
        this.flReader = flReader;
    }

    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String getIndexPage(Model model){
        List<UserData> personsList = null;
        try{
            personsList = flReader.FlRead(fileName);
        } catch (Exception e){
            log.error("Can't get data from file!", e);
        }
        model.addAttribute("personsList", personsList);
        return "index";
    }
}
