/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CopyConstructor;

/**
 *
 * @author dianp
 */
public class Geeks {
    
    String name;
    int id;
    
    Geeks (String name, int id)
    {
        this.name = name;
        this.id = id;
    }
    
    //copy constructor
    Geeks(Geeks obj2)
    {
        this.name = obj2.name;
        this.id = obj2.id;
    }
}
