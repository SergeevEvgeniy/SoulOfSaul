package by.putseta.task01.controller;

import by.putseta.task01.entity.Data;
import by.putseta.task01.service.ArithmeticService;
import by.putseta.task01.service.ExpressionService;
import by.putseta.task01.view.IoData;

public class RunnerBranchingTasks {

    public void runBranchingTask() {

        Data data = new Data();
        IoData ioData = new IoData();

        System.out.println("Now you can choose which of 5 branching tasks ( Available tasks : № 5 , 7, 19, 21, 33) " +
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

                    ExpressionService smallerNumber = new ExpressionService();
                    System.out.println("The smaller number = " + smallerNumber.findSmallerNumber(data.get(0), data.get(1)));

                    data.remove(0);  // remove the first entered numbers from collection
                    data.remove(0);  // remove the second entered numbers from collection

                    break;
                case (7):
                    System.out.print("Enter the value of 'a': ");
                    data.add(ioData.inPutInt());
                    System.out.print("Enter the value of 'b': ");
                    data.add(ioData.inPutInt());
                    System.out.print("Enter the value of 'c': ");
                    data.add(ioData.inPutInt());
                    System.out.print("Enter the value of 'x': ");
                    data.add(ioData.inPutInt());

                    ArithmeticService module = new ArithmeticService();
                    System.out.println("The result of expression module = " + module.countExpressionModule(data.get(0),
                            data.get(1), data.get(2), data.get(3)));


                    data.remove(0);
                    data.remove(0);
                    data.remove(0);
                    data.remove(0);
                    break;
                case (19):
                    System.out.print("Enter the value of 'a': ");
                    data.add(ioData.inPutInt());
                    System.out.print("Enter the value of 'b': ");
                    data.add(ioData.inPutInt());
                    System.out.print("Enter the value of 'c': ");
                    data.add(ioData.inPutInt());

                    ExpressionService positiveCount = new ExpressionService();
                    System.out.println("The number of positive numbers = " + positiveCount.countPositiveNumbers(data.get(0),
                            data.get(1), data.get(2)));


                    data.remove(0);
                    data.remove(0);
                    data.remove(0);
                    break;
                case (21):
                    System.out.println("Who are you: boy or girl? Enter B or G");
                    data.addString(ioData.inPutSymbol());

                    ExpressionService flatterer = new ExpressionService();
                    System.out.println(flatterer.determineGender(data.getString(0)));

                    data.removeString(0);  // remove the entered numbers from collection
                    break;
                case (33):
                    System.out.println("Enter the password: ");
                    data.add(ioData.inPutDouble());

                    ExpressionService levelAcces = new ExpressionService();
                    System.out.println("Your level of acces = " + levelAcces.definitionOfAccessLevel(data.get(0)));

                    data.remove(0);  // remove the entered numbers from collection
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
