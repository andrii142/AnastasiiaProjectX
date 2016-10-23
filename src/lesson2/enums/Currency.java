package lesson2.enums;

import java.util.Date;
import java.util.List;

public class Currency {
    private Date founded;
    private List<String> country;
    private Currencies name;

    public Currency(Currencies name, Date founded, List<String> country) {
        this.name = name;
        this.founded = founded;
        this.country = country;
    }
}
