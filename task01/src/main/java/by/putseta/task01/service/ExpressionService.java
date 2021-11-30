package by.putseta.task01.service;

import by.putseta.task01.entity.Data;

public class ExpressionService {
    Data data = new Data();

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
        if (x > y) {
            return y;
        } else {
            return x;
        }
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
        if (x.equals("B")) {    // TODO: проверка входных данных
            return "I like girls";
        } else {
            return "I like boys";
        }
    }

    public String definitionOfAccessLevel(double x) {
        if (x == 9583 || x == 1747) {
            return "A,B,C";
        } else if (x == 3331 || x == 7922) {
            return "B,C";
        } else if (x == 9455 || x == 8997) {
            return "C";
        } else {
            return "No any acces";
        }
    }
}
