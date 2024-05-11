package parkingguidancesystem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class shifts {
    private static int shiftNum;
    private static Double balance;
    
    public shifts(int shift){
        shiftNum = shift;
        balance = 0.0;
    }
    
    public static void setBalance(int shift ,double cash) throws IOException{
        if (shift == 1){
            FileReader total = new FileReader("shift1.txt");
            BufferedReader r = new BufferedReader(total);
            balance = Double.parseDouble(r.readLine());
            r.close();
            balance += cash;
            FileWriter file = new FileWriter("shift1.txt");
            file.write(balance.toString());
            file.close();
        }
        
        if (shift == 2){
            FileReader total = new FileReader("shift2.txt");
            BufferedReader r = new BufferedReader(total);
            balance = Double.parseDouble(r.readLine());
            r.close();
            balance += cash;
            FileWriter file = new FileWriter("shift2.txt");
            file.write(balance.toString());
            file.close();
        }
        
    }
    
    public double getBalance(){
        return balance;
    }
    
}
