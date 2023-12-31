//class-less implementation
import java.util.*;
import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner f = new Scanner(new File("liza.dat"));
        int n = f.nextInt();
        f.nextLine();

        while (n-- > 0) {
            System.out.println(f.nextLine());
            int studentCount = f.nextInt(); f.nextLine();
            double sum = 0;
            String[][] students = new String[studentCount][3];

            for (int i = 0; i < studentCount; i++) {
                students[i] = f.nextLine().split(",");
                sum += Double.parseDouble((students[i][2]));
            }

            Arrays.sort(students, Comparator
            .comparingInt((String[] student) -> Integer.parseInt(student[2])).reversed()
            .thenComparing((String[] student) -> student[0])
            .thenComparing((String[] student) -> student[1])
            );

            for(int i = 0; i < 3; i++){
                System.out.println(students[i][1] + " " + students[i][0] + ": " + students[i][2]);
            }
            System.out.printf("Mean: %.2f\n", sum/studentCount);
            double median = (studentCount%2==0) 
            ? (Double.parseDouble(students[studentCount/2 - 1][2]) + Double.parseDouble(students[studentCount/2][2]))/2.0 
            : Double.parseDouble(students[studentCount/2][2]);
            System.out.printf("Median: %.1f\n", median);
            System.out.println();
        }
    }
}
//class implementation
import java.util.*;
import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner f = new Scanner(new File("liza.dat"));
        int n = f.nextInt();
        f.nextLine();
        while (n-- > 0) {
            double sum = 0;
            System.out.println(f.nextLine());
            int studentCount = Integer.parseInt(f.nextLine());
            Info[] arr = new Info[studentCount];

            for(int i = 0; i < studentCount; i++) {
                String[] student = f.nextLine().split(",");
                sum += Integer.parseInt(student[2]);
                arr[i] = (new Info(student));
            }
            //Decending order sort of the students' grades then LastNames then FirstNames
            Comparator<Info> customComparator = Comparator
                .comparingInt(Info::getGrade).reversed()
                .thenComparing(Info::getLName)
                .thenComparing(Info::getFName);
            Arrays.sort(arr, customComparator);

            for (int j = 0; j < 3; j++) {
                System.out.println(arr[j]);
            }

            System.out.printf("MEAN SCORE: %.2f\n", sum / studentCount); 
            double med = (studentCount % 2 == 0) ? (arr[studentCount/2 - 1].grade + arr[studentCount/2].grade)/2.0 : arr[studentCount/2].grade;
            System.out.printf("MEDIAN SCORE: %.1f\n", med);
            System.out.println();
        }
    }
}

class Info {
    String name, firstName, lastName;
    int grade;

    public Info(String[] s) {
        name = s[1] + " " + s[0];
        firstName = s[1];
        lastName = s[0];
        grade = Integer.parseInt(s[2]);
    }

    public int getGrade() {return grade;}
    public String getLName() {return lastName;}
    public String getFName() {return firstName;}

    @Override
    public String toString() {
        return name + ": " + grade;
    }
}
