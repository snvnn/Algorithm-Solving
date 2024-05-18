import java.util.*;

public class Main {
    static int checkmonth(int year, int month){
        int temp = 0;

        switch (month) {
            case 1:
                temp = 31;
                break;
            case 3:
                temp = 31;
                break;
            case 5:
                temp = 31;
                break;
            case 7:
                temp = 31;
                break;
            case 8:
                temp = 31;
                break;
            case 10:
                temp = 31;
                break;
            case 12:
                temp = 31;
                break;
            case 4:
                temp = 30;
                break;
            case 6:
                temp = 30;
                break;
            case 9:
                temp = 30;
                break;
            case 11:
                temp = 30;
                break;
            case 2:
                temp = 28;
                if (year % 4 == 0)
                    temp = 29;
                if (year % 100 == 0)
                    temp = 28;
                if (year % 400 == 0)
                    temp = 29;
                break;
        }
        return temp;
    }


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        int year1 = scanner.nextInt();
        int month1 = scanner.nextInt();
        int day1 = scanner.nextInt();

        int year2 = scanner.nextInt();
        int month2 = scanner.nextInt();
        int day2 = scanner.nextInt();

        int temp = checkmonth(year1, month1);

        if(year2 - year1 > 1000){
            count = -1;
        }
        if(year2 - year1 == 1000){
            if(month2 > month1){
                count = -1;
            }
            else if(month2 == month1){
                if(day2 >= day1){
                    count = -1;
                }
            }
        }

        while(true){
            if(count == -1){
                break;
            }

            if(day1 == day2) {
                if(month1 == month2){
                    if(year1 == year2)
                        break;
                }
            }

            day1++;
            count++;

            if(day1 > temp) {
                day1 = 1;
                if(month1 != 12)
                    month1++;
                else{
                    month1 = 1;
                    year1++;
                }
                temp = checkmonth(year1, month1);
            }

        }

        if(count < 0)
            System.out.println("gg");
        else
            System.out.println("D-" + count);
    }
}
