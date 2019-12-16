package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(10);
        list.add(11);
        list.add(10);
        list.add(4);


        System.out.println("conteur "+CountnonUnique(list));


    }
    public  static  int CountnonUnique(List<Integer> numbers){
        int conteurs=0;
        int helper =0;
        List<Integer> liste= new ArrayList(new HashSet<>(numbers));
        for (int i = 0; i <liste.size() ; i++) {
            helper=0;
            for (int j = 0; j <numbers.size() ; j++) {
                if (liste.get(i)==numbers.get(j)){
                    helper++;
                    if (helper>1){
                        System.out.println(liste.get(i));
                        conteurs++;
                        break;
                    }
                }
            }
        }
        return conteurs;

    }
}
