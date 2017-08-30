package app;

import stage.PerformanceStage;

public class Application {
    public static void main(String[] args) {
        PerformanceStage stage = PerformanceStage.getInstance();
        stage.turnLightsOn();
        System.out.println(stage.getCounter());

        //even though we getting the instance twice we are getting the same instance
        //the private constructor is called only one time
        PerformanceStage stage2 = PerformanceStage.getInstance();
        System.out.println(stage.getCounter());

    }
}
