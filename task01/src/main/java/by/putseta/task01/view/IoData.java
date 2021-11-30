package by.putseta.task01.view;

import java.util.Scanner;

public class IoData {

    public int inPutInt() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public double inPutDouble() {
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }

    public String inPutSymbol() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
