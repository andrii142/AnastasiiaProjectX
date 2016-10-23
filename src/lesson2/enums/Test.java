package lesson2.enums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Test {
    private static final String xml = "XML";
    private static final String doc = "DOC";
    private static final String docs = "DOCS";
    private static final String ppt = "PPT";



    public static void main(String[] args) {
        Currency currency = new Currency(Currencies.EUR, new Date(), new ArrayList<String>());


        //Model - modelAndView
        //model.addObject("curList", Arrays.asList(Currencies.values()))


        String ext = "";

        System.out.println(Extensions.DOCS);
        Extensions.values();
    }

}
