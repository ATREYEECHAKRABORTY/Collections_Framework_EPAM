package com.EPAM_Collections.Collections_Framework;


import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in) ;
        DataList<Object> obj = new DataList<Object>() ;
        obj.add(9118) ;
        obj.add(2336) ;
        obj.add(2109) ;
        obj.add(1885) ;
        obj.add(8344) ;
        obj.add("INDRANI");
        obj.add("ATREYEE");
        obj.add("UPALI");
        obj.add("SHAMIRA");
        obj.add("ASISH");
        obj.display() ;
        int x = sc.nextInt() ;
        System.out.println("Element retrived from custom array list which is at index "+x+" is : "+obj.get(x)) ;
        int y = sc.nextInt() ;
        System.out.println("Element removed from custom array list present at particular index "+y+" is :"+obj.remove(y)) ;
        System.out.println("After performing all array list operations the final array list is :") ;
        obj.display() ;
    }
}