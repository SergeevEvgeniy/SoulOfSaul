package by.putseta.task01.controller;

import by.putseta.task01.entity.Data;
import by.putseta.task01.service.ArithmeticService;
import by.putseta.task01.service.ExpressionService;
import by.putseta.task01.service.GeometricService;
import by.putseta.task01.view.IoData;

public class RunnerLinearTasks {

    public void runLinearTask() {

        Data data = new Data();
        IoData ioData = new IoData();

        System.out.println("Hello! You can choose which of 5 linear tasks ( Available tasks : № 5 , 7, 19, 21, 33) " +
                "you want to solve, please enter the task number");
        int taskNumber;
        do {
            System.out.print("Enter number of task or enter the 0 to exit from program: ");
            taskNumber = ioData.inPutInt();
            switch (taskNumber) {
                case (5):
                    System.out.print("Enter the first number: ");
                    data.add(ioData.inPutInt()); // put first number in collection
                    System.out.print("Enter the second number: ");
                    data.add(ioData.inPutInt()); // put second number in collection

                    ArithmeticService average = new ArithmeticService();
                    System.out.println("The average value = " + average.countAverageValue(data.get(0), data.get(1)));
                    // count the average of two numbers

                    data.remove(0);  // remove the first entered numbers from collection
                    data.remove(0);  // remove the second entered numbers from collection

                    break;
                case (7):
                    System.out.print("Enter the length of rectangle: ");
                    data.add(ioData.inPutInt()); // put number in collection

                    GeometricService rectangle = new GeometricService();
                    System.out.println("The area of rectangle = " + rectangle.countAreaOfRectangle(data.get(0)));
                    // count the area of rectangle

                    data.remove(0);  // remove the entered numbers from collection
                    break;
                case (19):
                    System.out.println("Enter the side length of equilateral triangle: ");
                    data.add(ioData.inPutInt());  // put number in collection

                    GeometricService triangle = new GeometricService();
                    System.out.println("Equilateral triangle area = " + triangle.countAreaOfTriangle(data.get(0)) + "\n" +
                            "Equilateral triangle height = " + triangle.countHeightOfTriangle(data.get(0)) + "\n" +
                            "The radius of the inscribed circle in an equilateral triangle = " +
                            triangle.countInscribedCircleRadius(data.get(0)) + "\n" +
                            "The radius of the circumscribed circle in an equilateral triangle = "
                            + triangle.countCircumscribedCircleRadius(data.get(0)));
                    data.remove(0);  // remove the entered numbers from collection
                    break;
                case (21):
                    System.out.println("Enter the real number R of the form nnn,ddd: ");
                    data.add(ioData.inPutDouble());

                    ExpressionService swap = new ExpressionService();
                    System.out.println("The resulting number when changing the fractional and integer parts = " +
                            swap.swapFractionalAndIntegerParts(data.get(0)));
                    data.remove(0);  // remove the entered numbers from collection
                    break;
                case (33):
                    System.out.println("Enter the symbol: ");

                    ExpressionService symbol = new ExpressionService();
                    System.out.println("The ordinal number of the character in the Unicode table = " +
                            symbol.findOrdinalNumberOfSymbol(ioData.inPutSymbol()));
                    System.out.println("The previous symbol is: " + symbol.displayPreviousCharacter());
                    System.out.println("The next symbol is: " + symbol.displayNextCharacter());

                    break;
                case (0):
                    break;
                default:
                    System.out.println("This task doesn't exist");
                    break;
            }
        } while (taskNumber != 0);
        System.out.println("You had left from program");
    }
}
