package parkingguidancesystem;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.time.*;

public class entry extends entryFace{
    /**dataFiled**/
    private static  LocalDateTime entryTime;
    private Integer spotNum;
    private Integer shiftNum;
    
    /**methods**/
    public entry( int entryID, String plateNumber, int spot, int shift) throws FileNotFoundException, IOException{
        this.spotNum = spot;
        this.shiftNum = shift;
        spots.use(spot);
        entryTime = LocalDateTime.now();
        FileWriter customers = new FileWriter("customers.txt", true);
        PrintWriter c = new PrintWriter(customers);
        c.println(entryID  + " " + plateNumber  + " " + entryTime  + " " + spot  + " " + shiftNum);
        c.close();
        FileWriter inParke = new FileWriter("inParke.txt", true);
        PrintWriter p = new PrintWriter(inParke);
        p.println(entryID  + " " + plateNumber  + " " + entryTime  + " " + spot  + " " + shiftNum);
        p.close();

    }

    public void setShiftNum(int shiftNum){
        this.shiftNum = shiftNum;
    }
    
    public static LocalDateTime getEntryTime() {
        return entryTime;
    }
    
    public StringBuilder monitorEntryDetails(){
        StringBuilder details = new StringBuilder("time of enter is: " + entryTime.toString() + "\n");
        details.append("the spot Number is: ").append(spotNum.toString(1) + "\n");
        details.append("the entery shift is: ").append(shiftNum.toString(1));
        return details; 
    }
    
}
