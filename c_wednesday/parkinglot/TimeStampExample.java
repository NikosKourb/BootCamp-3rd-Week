package parkinglot;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeStampExample {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy.HH.mm.ss");

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        
        Timestamp tEntrance = new Timestamp(System.currentTimeMillis());
        long entranceTime=tEntrance.getTime();//return number of milliseconds since January 1, 1970, 00:00:00 GMT
        System.out.println(entranceTime); 
        String entrance = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss").format(tEntrance);
        System.out.println(entrance);
        
        
        System.out.println("Give me your license plate: ");
        String lp=sc.next();
        
        Timestamp tExit = new Timestamp(System.currentTimeMillis());
        long exitTime=tExit.getTime();
        System.out.println(exitTime);
        String exit = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss").format(tExit);
        System.out.println(exit);
       
        double Dtime=(exitTime-entranceTime)/60000;
        System.out.println("You stayed for: "+(Dtime)+" milliseconds!!!");
        
        sc.close(); 
        
        
        
    }

}
