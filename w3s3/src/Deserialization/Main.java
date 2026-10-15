/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deserialization;

/**
 *
 * @author dianp
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// Class Student harus mengimplementasikan Serializable
class Student implements Serializable {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "'}";
    }
}

public class Main {
    public static void main(String[] args) {
        // 1. Proses Serialisasi (Menulis objek ke file)
        try (ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("student.ser"))) {
            out.writeObject(new Student("Alice"));
            System.out.println("Objek berhasil disimpan!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 2. Proses Deserialisasi (Membaca objek dari file)
        try (ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("student.ser"))) { // Nama file disamakan ("student.ser")
            
            Student s = (Student) in.readObject();
            System.out.println(s); // Menampilkan data objek
            
        } catch (IOException | ClassNotFoundException e) { // Ditambahkan ClassNotFoundException
            e.printStackTrace();
        }
    }
}
