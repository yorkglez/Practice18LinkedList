package com.practice18linkedlist.app;

import java.lang.reflect.Array;
import java.util.*;

public class LinkedListApp
{
    public static void main(String[] args)
    {
        //Constant declaration
        final int ELEMENTS = 100;

        //Variable declaration
        Byte number = 2;

        LinkedList<Byte> myList = new LinkedList<Byte>();
        ArrayList<Short> myArray = new ArrayList<Short>();
        Stack<Integer> miPilita = new Stack<Integer>();
        PriorityQueue<Double> miColita = new PriorityQueue<Double>();
        HashMap<Integer, String> miDiccionaritu = new HashMap<Integer, String>();

        Random random = new Random();

        myList.add((byte) 5);
        myList.add((byte) 10);
        myList.add((byte) 20);
        myList.add((byte) 30);
        myList.add((byte) 40);
        myList.set(0, (byte) 2); //This is slower than arraylist

        System.out.println(myList.get(1));//This method is better in arraylist too
        System.out.println(myList);

        /*System.out.println(miListita.remove());
		System.out.println(miListita.remove());
		System.out.println(miListita.remove());
		System.out.println(miListita.remove());*/

        System.out.println(myList.size());
        System.out.println(myList.isEmpty());
        System.out.println(myList.contains(number));

        myList.clear();

        System.out.println(myList);

        for(int i = 0;i < ELEMENTS;i++)
        {
            myList.add((byte) random.nextInt(100));
        }

        System.out.println(myList);

        Iterator miIteradorcitu = myList.iterator();

        while(miIteradorcitu.hasNext())
        {
            System.out.println(miIteradorcitu.next());
        }

        for(Byte miNumber : myList)
        {
            System.out.println(miNumber);
        }

        myArray.add((short) 5);
        myArray.add((short) 10);
        myArray.add((short) 20);
        myArray.add((short) 30);
        myArray.add((short) 40);
        System.out.println(myArray);

        myArray.set(0, (short) 2);

        System.out.println(myArray.get(2));
        System.out.println(myArray);
        System.out.println(myArray.remove(2));
        System.out.println(myArray);

        miIteradorcitu = myArray.iterator();

        while(miIteradorcitu.hasNext())
        {
            System.out.println(miIteradorcitu.next());
        }

        for(Short miShort:myArray)
        {
            System.out.println(miShort);
        }
    }
}
