package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(2);
        list.add(1);
        list.add(8);
        list.add(6);

        System.out.println( function(list,2));


    }
    public static int function(ArrayList<Integer> arr,int k){
        int conteurs = 0;

        arr.sort(Integer::compareTo);
        List<Integer> list = new ArrayList<>(new HashSet<>(arr));
        System.out.println(list);
        for (int i = 0; i <list.size() ; i++) {
            for (int j = i; j <list.size() ; j++) {
                if (list.get(i)+k==list.get(j)){
                    System.out.println(list.get(i)+"+"+k+"=="+list.get(j));
                    conteurs++;
                }

            }

        }
        return conteurs;
    }


}

