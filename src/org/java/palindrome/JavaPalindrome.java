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
        String userWord;//otto
        System.out.println("scrivi una parola e verificherò se è palindroma");
        userWord = scan.nextLine();
        //creo un array dalla parola dell'utente
        char[] arrayUserWord = userWord.toCharArray();//o,t,t,o
        //creo un array vuoto lungo come arrayUserWord
        char[] arrayInvertedWord = new char[arrayUserWord.length];
        //inverto la parola
        int a = 0;
        for (int i = arrayUserWord.length - 1; i >= 0 ; i--) {
           arrayInvertedWord[a] = arrayUserWord[i];
           a++;
        }
        String invertedWord = String.valueOf(arrayInvertedWord);

        if (invertedWord.equals(userWord)) {
            System.out.println("la tua parola è palindroma");
        } else {
            System.out.println("la tua parola non è palindroma");
        }
        scan.close();

        //BONUS: nello stesso progetto aggiungere le classi per risolvere Snack8 e Snack9 che non abbiamo ancora corretto in classe

        //Snack8
        //Chiedi un numero di 4 cifre all’utente e calcola la somma di tutte le cifre che compongono il numero.

        Scanner scanNumber = new Scanner(System.in);
        //faccio inserire un numero di quattro cifre
        System.out.println("inserisci un numero di quattro cifre e io sommerò quelle cifre");//1259
        String userNumber = scanNumber.nextLine();
        //divido il numero in un array composto dalle cifre del numero inserito
        char[] arrayUserNumber = userNumber.toCharArray();
        int somma = 0;
        for (int i = 0; i < arrayUserNumber.length; i++) {
           int number = arrayUserNumber[i] - '0';

            somma = somma + number;
        }

        System.out.println("la somma delle cifre del numero inserito è; " + somma);

        scanNumber.close();


    }
}
