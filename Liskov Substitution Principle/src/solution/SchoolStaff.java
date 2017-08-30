package solution;

public class SchoolStaff {

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
