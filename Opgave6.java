package Kap11Exercise6;

import java.util.*;

public class Opgave6
{
    /*
    Write a method countUnique that accepts a list of integers
    as a parameter and returns the number of unique integer values
    in the list. Use a set as auxiliary storage to help you solve
    this problem. For example, if a list contains the values
    [3, 7, 3, –1, 2, 3, 7, 2, 15, 15], your method should return 5.
    The empty list contains 0 unique values.
    */


    public static void main(String[] args)
    {
        List<Integer> listOfIntegers = new LinkedList<>();
        listOfIntegers.add(0,3);
        listOfIntegers.add(1,7);
        listOfIntegers.add(2,3);
        listOfIntegers.add(3,-1);
        listOfIntegers.add(4,2);
        listOfIntegers.add(5,3);
        listOfIntegers.add(6,7);
        listOfIntegers.add(7,2);
        listOfIntegers.add(8,15);
        listOfIntegers.add(9,15);

        countUnique(listOfIntegers);

    }

    public static Set<Integer> countUnique(List<Integer> integerList)
    {
        Set<Integer> hashSet = new HashSet<>(integerList);
        hashSet.addAll(integerList);
        System.out.println(hashSet.size());
        return hashSet;
    }
}


