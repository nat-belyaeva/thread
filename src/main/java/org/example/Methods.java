package org.example;

import java.util.Locale;

public class Methods {
    public static void main(String[] args) {
        String name = "Nord";
        Integer age = 19;
        Boolean has18 = true;
        System.out.println(name);
        name = concatNameAndAge(name,age);
        System.out.println(name);

        int resMethod = sum(age,3);
        System.out.println(resMethod);
        sayHello(name);
    }

    public static String concatNameAndAge(String name, int age) {
        String result = name + " " +  age;
        result = result.toLowerCase();
        return result;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void sayHello(String name) {

        String result = concatNameAndAge(name,23);
        System.out.println(result);
        System.out.println("Helooo!");
    }
}
