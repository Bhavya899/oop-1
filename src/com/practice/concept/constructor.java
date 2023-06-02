
//constructor demo

package com.practice.concept;

public class constructor {
    public static void main(String[] args) {
        constructor c=new constructor();
        System.out.println(c.id);
        System.out.println(c.name);
        constructor c1=new constructor(4,"hello");
        System.out.println(c1.id);
        System.out.println(c1.name);
    }
    int id;
    String name;
    constructor()
    {
        this.id=1;
        this.name="bhavya";
    }
    constructor(int id,String name)
    {
        this.id=id;
        this.name=name;
    }

}
