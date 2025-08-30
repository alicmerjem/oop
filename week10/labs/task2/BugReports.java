package week10.labs.task2;

public class BugReports {
    @ReportBug(reportedBy = "Diana", severity = 3)
    public void crashOnLogin() {
        System.out.println("fixing login crash");
    }

    @ReportBug(reportedBy = "Ethan", severity = 2)
    public void slowSearch() {
        System.out.println("improving search speed");
    }

    @ReportBug(reportedBy = "Fiona")
    public void typoInUI() {
        System.out.println("correcting ui typos");
    }
}
