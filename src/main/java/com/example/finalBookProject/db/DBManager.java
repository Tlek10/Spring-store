package com.example.finalBookProject.db;

import java.util.ArrayList;

public class DBManager {

    private static ArrayList<Items> items = new ArrayList<>();

//    static {
//        items.add(new Items(1L, "dsa", 3200, 7));
//        items.add(new Items(2L, "ppp", 400, 2));
//        items.add(new Items(3L, "d1111111sa", 900, 13));
//        items.add(new Items(4L, "dsdsada", 1400, 31));
//    }

    private static Long id = 5L;

    public static ArrayList<Items> getItems() {
        return items;
    }

    public static void addItem(Items item) {
        item.setId(id);
        items.add(item);
        id++;
    }

    public static Items getItem(Long id) {
        for (Items it : items) {
            if (it.getId() == id) return it;
        }
        return null;
    }
}
