package assignments;

public class StepTracker 
{
    private int steps;

    public StepTracker(int initial_steps) {
        this.steps = initial_steps;
    }
    public double activeDays() {

        // tr.activeDays(); returns 0
        // tr.activeDays(); returns 0
        // tr.activeDays(); returns 1
        // tr.activeDays(): returns 2
        return 0.0;
    }
    public String addDailySteps(int number_Of_Steps)
    {
        // tr.addDailySteps(9000); returns This is too few steps for the day to be considered active.
        // tr.addDailySteps(5000); This is too few steps for the day to be considered active.
        // tr.addDailySteps(13000); The represents an active day.
        // tr.addDailySteps(23000); The represents an active day.
        // tr.addDailySteps(1111); This is too few steps for the day to be considered active.
        return "invoked addDailySteps() function";
    }

    // averageSteps() Method takes a double?
    public String averageSteps(int number_Of_Steps)
    {
        // tr.averageSteps(); // 7000.0 The average number of steps per day is (14000 / 2).
        // tr.averageSteps(); // 0.0 When no step data have been recorded, the averageSteps method returns 0.0.
        // tr.averageSteps(); // 9000.0 The average number of steps per day is (27000 / 3).
        // tr.averageSteps(); // 10222.2  The average number of steps per day is (51111 / 5).
        return "invoked averageSteps() function";
    }
  
     
}