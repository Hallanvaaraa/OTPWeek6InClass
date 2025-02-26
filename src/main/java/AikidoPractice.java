import java.util.Date;
import java.util.Scanner;

public class AikidoPractice {

    private int totalHours;
    private int totalDays;
    private Date startDate;
    private boolean running = true;


    public AikidoPractice() {
        this.totalHours = 0;
        this.totalDays = 0;
    }

    public void addSession(int hours) {
        this.totalHours += hours;
        if (startDate == null) {
            startDate = new Date();
        }
        totalDays = (int) ((new Date().getTime() - startDate.getTime()) / (1000 * 60 * 60 * 24));
    }

    public boolean eligibleForGraduation() {
        return totalDays >= 180 || totalHours >= 100;
    }

    public int getTotalHours() {
        return totalHours;
    }

    public void runApp() {
        while (running) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("=== Aikido Practice ===");
            System.out.println("1. Add practice session");
            System.out.println("2. View total practice hours");
            System.out.println("3. Check graduation eligibility");
            System.out.println("4. Exit");
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    System.out.println("Enter the number of hours you practiced: ");
                    int hours = scanner.nextInt();
                    addSession(hours);
                    break;
                case "2":
                    System.out.println("Total practice hours: " + totalHours);
                    break;
                case "3":
                    if (eligibleForGraduation()) {
                        System.out.println("You are eligible for graduation!");
                    } else {
                        System.out.println("You are not eligible for graduation yet.");
                    }
                    break;
                case "4":
                    running = false;
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
    }
}
