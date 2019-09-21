package com.company;

////---------------------------------------------------------
////Zadanie 1
////---------------------------------------------------------
//
//public class Main {
//
//    public static void main(String[] args) {
//        System.out.println(metoda(-1));
//    }
//
//
//    public static int metoda(int liczba) {
//        if (liczba < 0) return -1;
//        else {
//            String sliczba = Integer.toString(liczba);
//            String n1 = Character.toString(sliczba.charAt(0));
//            String n2 = Character.toString(sliczba.charAt(sliczba.length() - 1));
//            return (Integer.valueOf(n1) + Integer.valueOf(n2));
//        }
//
//    }
//
//}

////---------------------------------------------------------
////Zadanie 2
////---------------------------------------------------------
//public class Main {
//
//    public static void main(String[] args) {
//        try {
//            double tab[] = {3, 6, 4, 3, 5/0, 21, 33};
//            System.out.println(tab[-1]);
//        } catch (ArithmeticException ae) {
//            System.out.println("Division by zero occurred");
//        } catch (ArrayIndexOutOfBoundsException ae){
//            System.out.println("Out of table occurred");
//        }
//    }
//}

////---------------------------------------------------------
////Zadanie 3
////---------------------------------------------------------
//
//interface Animal {
//    public void eat();
//
//    public void sleep();
//}
//
//interface Bird {
//    public void fly();
//}
//
//class Eagle implements Animal, Bird {
//    public void eat() {
//        System.out.println("Eagle have eaten the food.");
//    }
//
//    public void sleep() {
//        System.out.println("Eagle have slept well");
//    }
//
//    public void fly() {
//        System.out.println("Eagle fly hight");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Eagle whiteEagle = new Eagle();
//        whiteEagle.sleep();
//    }
//}

//---------------------------------------------------------
//Zadanie 4
//---------------------------------------------------------

import java.util.ArrayList;

class Menu {
    private ArrayList<String> meals = new ArrayList<>();

    public void addMeal(String meal) {
        if (!meals.contains(meal)) {
            meals.add(meal);
            System.out.println("Dodaje nowy posilek: " + meal);
        } else {
            System.out.println("Posilek juz istneije");
        }

        System.out.println("Ilosc posilkow" + this.meals.size());
    }

    public void removeMeal(String meal) {
        this.meals.remove(meal);
    }
}

public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();
        menu.addMeal("ciasto");
        menu.addMeal("zupa");
        menu.addMeal("ciasto");

    }
}