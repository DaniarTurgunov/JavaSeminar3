package Seminar3.CW;
import java.util.*;
import java.util.Collections;
import java.util.List;

public class main {
    public static void main(String[] args) {
        ListOfCats cats = new ListOfCats();
        cats.setCatList(Arrays.asList(new Cat("Барсик"), new Cat("Архей"), new Cat("Лили")));
        Iterator<Cat> iter = cats.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
        cats.getCatList().sort(Cat::compareTo);
        for (Cat cat : cats.getCatList()){
            System.out.println(cat);
        }
    }
}