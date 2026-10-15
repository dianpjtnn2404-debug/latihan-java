/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConstuctorOverloading;

/**
 *
 * @author dianp
 */
public class Geeks {
    Geeks(String name)
    {
        System.out.println("Constructor with one " + "argument - String: " + name);
    }
    
    Geeks (String name, int age)
    {
        System.out.println("Constructor with two arguments: " + " String and Integer: " + name + " " + age);
    }
    
    Geeks (long id)
    {
        System.out.println ("Constuctor with one argument: " + "long: " + id);
    }
}
