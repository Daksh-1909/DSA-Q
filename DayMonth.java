import java.util.Scanner;

public class DayMonth {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        if (s.hasNextInt()) {
            int year = s.nextInt();
            int month = s.nextInt();
            int days = 0;
            
            switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    days = 31;
                    break;
                case 4: case 6: case 9: case 11:
                    days = 30;
                    break;
                case 2:
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                        days = 29;
                    } else {
                        days = 28;
                    }
                    break;
                default:
                    return;
            }
            
            System.out.println(days + " days");
        }
        
        s.close();
    }
}