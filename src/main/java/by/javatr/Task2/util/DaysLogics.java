package by.javatr.Task2.util;

public class DaysLogics {
    public int getDaysOfMonth(int month, int year){
        int days=0;
        if(month!=2) {
            switch (month) {
                case 1:
                    days = 31;
                    break;
                case 3:
                    days = 31;
                    break;
                case 4:
                    days = 30;
                    break;
                case 5:
                    days = 31;
                    break;
                case 6:
                    days = 30;
                    break;
                case 7:
                    days = 31;
                    break;
                case 8:
                    days = 31;
                    break;
                case 9:
                    days = 30;
                    break;
                case 10:
                    days = 31;
                    break;
                case 11:
                    days = 30;
                    break;
                case 12:
                    days = 31;
                    break;
            }
        }
        else {
            if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
                days = 29;
            }
            else{
                days = 28;
            }
        }
        return days;
    }
}
