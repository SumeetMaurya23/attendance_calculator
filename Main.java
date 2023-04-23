import java.util.Scanner;

class Attendance {
    private int[] subjects;

    public Attendance() {
        this.subjects = new int[8];
    }

    public void readSubjects() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < subjects.length; i++) {
            System.out.print("Subject " + (i+1) + " : ");
            subjects[i] = scanner.nextInt();
        }
    }

    public int calculateAggregateAttendance() {
        int sum = 0;

        for (int i = 0; i < subjects.length; i++) {
            sum += subjects[i];
        }

        return sum / subjects.length;
    }
}

public class Main {
    public static void main(String[] args) {
        Attendance attendance = new Attendance();
        attendance.readSubjects();
        System.out.println("Aggregate Attendance = " + attendance.calculateAggregateAttendance());
    }
}
