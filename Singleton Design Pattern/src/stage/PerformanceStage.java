package stage;

public class PerformanceStage {

    private static PerformanceStage performanceStage = null;
    private static int counter;

    //private constructor only can be accessed within this class
    private PerformanceStage(){
        counter++;
    }

    //this is thread safe
    public synchronized static PerformanceStage getInstance(){
        if (performanceStage == null){
            performanceStage = new PerformanceStage();
        }
        return performanceStage;
    }

    public void turnLightsOn(){
        System.out.println("Lights on");
    }

    public int getCounter() {
        return counter;
    }
}
