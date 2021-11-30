package by.putseta.task01.service;

import by.putseta.task01.entity.Data;

public class ExpressionService {

    private final Data data = new Data();

    public double swapFractionalAndIntegerParts(double x) {
        return (x * 1000) % 1000 + (int) x / 1000.0;
    }

    public int findOrdinalNumberOfSymbol(String x) {    // Determines the ordinary number of
        data.add(x.charAt(0));                   // character in the table Unicode
        return (x.charAt(0));          //TODO: сделать проверку что вводят только один символ
    }

    public char displayPreviousCharacter() {   // Determines the previous character in the table Unicode
        return (char) (data.get(0) - 1);
    }

    public char displayNextCharacter() {      // Determines the next character in the table Unicode
        return (char) (data.get(0) + 1);
    }

    public double findSmallerNumber(double x, double y) {  // TODO: написать тест
        return x > y ? y : x;
    }

    public int countPositiveNumbers(double a, double b, double c) {
        int count = 0;
        if (a > 0) {
            count++;
        }
        if (b > 0) {
            count++;
        }
        if (c > 0) {
            count++;
        }
        return count;
    }

    public String determineGender(String x) {
        return x.equals("B") ? "I like boys" : "I like girls";
    }

    public String definitionOfAccessLevel(double x) {
        return switch ((int) x) {
            case 9583, 1747 ->
                "A,B,C";
            case 3331, 7922 ->
                "B,C";
            case 9455, 8997 ->
                "C";
            default ->
                "No any acces";
        };
    }
}
