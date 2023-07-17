package org.java.palindrome;

import java.util.Scanner;

public class JavaPalindrome {
    public static void main(String[] args) {
        /*scrivere un programma che chiede all’utente di inserire una parola
         e gli risponde se è una parola palindroma oppure no.
         Una parola palindroma è una parola che si può leggere sia da sinistra verso destra che da destra verso sinistra e mantiene stesso suono e lo stesso significato.
         Ad esempio: OTTO, RADAR, ESOSE
         */


        Scanner scan = new Scanner(System.in);
        //chiedo all'utente una parola
        String userWord;
        System.out.println("scrivi una parola e verificherò se è palindroma");
        userWord = scan.nextLine();
        //creo un array dalla parola dell'utente
        char[] arrayUserWord = userWord.toCharArray();
        //inverto la parola
        for (int i = arrayUserWord.length - 1; i >= 0 ; i--) {

        }










    }
}
