package by.putseta.task01.controller;

public class Main {

    // Define a static logger variable so that it references the
    // Logger instance named "MyApp".
//    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        RunnerLinearTasks runnerLinearTasks = new RunnerLinearTasks();
        RunnerBranchingTasks runnerBranchingTasks = new RunnerBranchingTasks();
        RunnerCyclesTasks runnerCyclesTasks = new RunnerCyclesTasks();

        runnerLinearTasks.runLinearTask();
        runnerBranchingTasks.runBranchingTask();

    }
}
