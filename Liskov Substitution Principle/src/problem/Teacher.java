package problem;

public abstract class Teacher {
    public abstract void teach();

    private void makeAnnouncement(){
        System.out.println("Making Announcement");
    }

    private void takeAttendance(){
        System.out.println("Taking Attendance");
    }

    private void collectPaperWork(){
        System.out.println("Collecting paper work");
    }

    public void performOtherDuties(){
        makeAnnouncement();
        collectPaperWork();
        takeAttendance();
    }


}
