// PARTNER NAME: Michelle Mendoza
// PARTNER NAME: None
// CS111 SECTION #: 3033
// DATE: 5/5/25


public class Main
{
    public static void main(String[] args)
    {
        //DECLARATION/INITIALIZATION
        int month = 0; 
        int day = 0; 
        int year = 0;
        int jdnDate;
        //CALCULATION
        month = 1;
        day = 16;
        year = 2006;
        jdnDate = Main.calculateJulianDate(month, day, year);

        //OUTPUT
        System.out.println("The calculated Julian Date for my birthday is: " + jdnDate);
        month = 07;
        day = 04;
        year = 1776;
        jdnDate = Main.calculateJulianDate(month, day, year);
        System.out.println("The calculated Julian Date for Independence Day in the United States is: " + jdnDate);

        month = 07;
        day = 20;
        year = 1969;
        jdnDate = Main.calculateJulianDate(month, day, year);
        System.out.println("The calculated Julian Date for the day we landed on the moon is: " + jdnDate);
    }
//Description: calculate the julian date using month, day, and year
//Precondition: valid integers for month, day and year. months < 12, day <31
// Postcondition: return an integer = julian day
public static int calculateJulianDate(int month, int day, int year){
    int a = 0;
    int m = 0;
    int y = 0;
    int jdnDate = 0;
    a = (14 - month) / 12;
    m = month + 12*a - 3;
    y = year + 4800 - a;
       
    jdnDate = day + (153*m + 2)/5 +
    365*(y) + (y/4) - (y/100) + (y/400) - 32045;

    return jdnDate;
    }
}
