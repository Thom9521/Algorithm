package thom9521;

import java.util.Scanner;

public class Linear_Search {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //Laver et array med 10 navne
        int[] array = new int[10];
        String[] navne = {"Bob", "Benny", "Bo", "Berit", "Bertram", "Bjarne", "Brian", "Billy", "Bent", "Buster"};

        for (int i = 0; i < array.length; i++)
            array[i] = i;

        //System.out.println("Hvem vil du finde?");
        //String find = input.nextLine();

        for (int i = 0; i <10 ; i++) {
            String navn = navne[array[i]];

            if(navn == "Bertram") {
                System.out.println(navn + " er fundet på plads " + array[i]);
                System.exit(0);

            }
            else {
                System.out.println("Prøv igen");
        }

    }}}
