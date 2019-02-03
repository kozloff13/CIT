package com.cit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class Directory {

    List<String> ivanov = new ArrayList<String>() {
        {
            add("+8 800 2000 500");
            add("+8 800 200 600");
        }
    };

    List<String> petrov = new ArrayList<String>() {
        {
            add("+8 800 2000 700");
        }
    };

    List<String> sidorov = new ArrayList<String>() {
        {
            add("+8 800 2000 800");
            add("+8 800 2000 900");
            add("+8 800 2000 000");
        }
    };

    Map<String, List<String>> telBook = new HashMap<String, List<String>>() {
        {
            put("Иванов И.И.", ivanov);
            put("Петров П.П.", petrov);
            put("Сидоров С.С.", sidorov);
        }
    };

    String inReturn(String message) {
        for (Map.Entry<String, List<String>> o : telBook.entrySet()) {
            Pattern pattern = Pattern.compile(o.getKey());
            if (pattern.matcher(message).find()) {
                return o.getValue().toString();
            }
        }
        return "Такого абонента не существует";
    }
}
