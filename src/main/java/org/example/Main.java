package org.example;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        User me = new User("Maria","Vasylieva");
        Gson gson = new Gson();
        String jsonObj = gson.toJson(me);
        System.out.println(jsonObj);
    }
}