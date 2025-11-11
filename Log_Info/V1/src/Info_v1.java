public class Info_v1 {
    void dashboard() {
        //declaring important info
        final String studentName = "Aditya Yadav";
        final String courseName = "Commerce";
        final String batchID = "2025-01";
        final String Class = "9";
        String feeStatus = "Paid";
        final String logOut = "Log Out";
        //Details
        System.out.println("Welcome, " + studentName);
        System.out.println("Enrolled: " + courseName + " | Batch: " + batchID + " Class: " + Class);
        System.out.print("Fee status: " + feeStatus);
    }

    public static void main(String[] args) {
        Log_v1 obj1 = new Log_v1();
        if (obj1.loginCheck()) {
            Info_v1 obj2 = new Info_v1();
            obj2.dashboard();
        }
    }
}