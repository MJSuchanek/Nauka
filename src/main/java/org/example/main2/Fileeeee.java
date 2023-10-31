package org.example.main2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Fileeeee {

    public static void main(String[] args) {
//File file = new File("ala.txt");
// boolean exists = file.exists();
//        System.out.println("Czy istnieje " + exists);
//  String absolutePath = file.getAbsolutePath();
//        System.out.println("Ten plik jest w: " + absolutePath);
        PrintWriter zapis = null;
        try {
            zapis = new PrintWriter("ala.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Nie znaleziono pliku");
        }
        zapis.println("Ala ma kota, a kot ma Alę");
        zapis.close();
    }
}
