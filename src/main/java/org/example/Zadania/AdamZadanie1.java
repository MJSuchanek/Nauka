package org.example.Zadania;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class AdamZadanie1 {
  public static void main(String[] args) {
    try {
      PrintWriter liczby = new PrintWriter("liczby.txt");
      for (int i = 100; i >= 0; i--) {
        if (i % 2 == 0) {
          liczby.print(Integer.toString(i));
          liczby.print("\n");
        }

        if (i == 50) {
          liczby.print("BMW");
          liczby.print("\n");
        }
      }
      liczby.close();
    } catch (FileNotFoundException e) {
      System.out.println("Nie znaleziono pliku");
      ;
    }
  }
}
