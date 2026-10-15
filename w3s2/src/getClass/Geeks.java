/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package getClass;

/**
 *
 * @author dianp
 */
public class Geeks {
    public static void main (String[] args)
    {
        Object o =new String("GeeksForGeeks");
        Class c = o.getClass();
        System.out.println("Class of object o is: " + c.getName());
    }
}
