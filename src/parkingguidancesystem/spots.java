package parkingguidancesystem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Integer.valueOf;
import java.util.Scanner;

public class spots {
    
    /**data fields**/
    private static int totalSpotsNum;
    private final static boolean[] Spots = new boolean[totalSpotsNum];

    /**methods**/
    public spots() throws FileNotFoundException, IOException{
        FileReader total = new FileReader("total.txt");
        BufferedReader r = new BufferedReader(total);
        totalSpotsNum = Integer.parseInt(r.readLine());
        r.close();
    }
    
    public void setSpotsNumber(int SpotsNum) throws IOException{
        File total = new File("total.txt");
        PrintWriter w = new PrintWriter(total);
        int prev = totalSpotsNum;
        if (SpotsNum == 1)
            totalSpotsNum = totalSpotsNum + SpotsNum;                        
        else
            totalSpotsNum = totalSpotsNum + SpotsNum-1;
        w.println(totalSpotsNum);
        w.close();
        for(Integer i = prev; i<totalSpotsNum;i++){
            FileWriter free = new FileWriter("freespots.txt", true);
            PrintWriter p = new PrintWriter(free);
            p.println(i.toString());
            p.close();        
        }
    }
    
    public int getTotalSpots(){
         return totalSpotsNum;
    }
    
    public static void use(int i) throws FileNotFoundException, IOException{
        File free = new File("freespots.txt");
        String line = exit.search(i, free);
        exit.removeLine(free, line);
    }
    
    public static void free(Integer i) throws FileNotFoundException, IOException{        
        FileWriter free = new FileWriter("freespots.txt", true);
        PrintWriter p = new PrintWriter(free);
        p.println(i.toString());
        p.close();
    }
    
    public static String[] monitorFreeSpots() throws FileNotFoundException, IOException {
        Scanner Reader = new Scanner(new File("freespots.txt"));
        spots s = new spots();
        String[] arr = new String[s.getTotalSpots()];
        int C = 0;
        while (Reader.hasNext()) {
            String Line = Reader.nextLine();
            String[] Data = Line.split(" ");      
            for (int i = 0; i < Data.length; i++) {
                arr[C] = Data[i]; C++; } }
        String[] free = new String[C];
        for (int i = 0 ; i<C ; i++)
            free[i] = arr[i];
        return free;
    }
    
    public static String[] monitorBusySpots() throws IOException{
        int A=0 ;
        spots s = new spots();        
        String[] busy = new String[s.getTotalSpots()-spots.monitorFreeSpots().length];
        for (int i = 0 ; i<s.getTotalSpots() ; i++){
            int flag = 0 ;
            for (int j = 0 ; j<spots.monitorFreeSpots().length ; j++)
                if ( i == Integer.parseInt(spots.monitorFreeSpots()[j]) ) { flag = 1; break; }
            if (flag == 0) { busy[A]= i + "" ; A++; } }
        return busy;
    }

    public static boolean[] monitorAllSpots(){
        return Spots; }
    
    //    public static int[] monitorFreeSpots(){
//        
//        String[] arr = new String[totalSpotsNum*5+1];
//        
//        Scanner Reader = null;
//        
//        try { Reader = new Scanner(new File("customers.txt")); }
//        catch (FileNotFoundException e) { System.out.println(e); }
//        
//        int C = 0;
//        
//        while (Reader.hasNext()) {
//            String Line = Reader.nextLine();
//            String[] Data = Line.split(" ");      
//            for (int i = 0; i < Data.length; i++) {
//                arr[C] = Data[i]; C++; }
//        }
//        
//        int Z = 0;
//        for(int A=3 ; arr[A]!=null ; A=A+5 ) Z++;
//        int[] busySpots = new int[Z];
//        for( int i=0, A=3 ; arr[A]!=null ; A=A+5, i++ )
//            busySpots[i] = Integer.parseInt( arr[A] );
//        
//        int[] free = new int[totalSpotsNum-Z];
//        for (int i = 0; i<totalSpotsNum-Z ; i++) {free[i]=i;}
//                
//        for (int i = 0; i<totalSpotsNum-Z ; i++){
//            for (int j = 0 ; j<Z ; j++)
//                if ( free[i] == busySpots[j]) {
//                    for (int k=i ; k<totalSpotsNum-Z ; k++)
//                        free[k]=free[k+1]; }         
//        }
//        
//        int[] freeSpots = new int[totalSpotsNum-Z];
//        for(int i=0 ; i<totalSpotsNum-Z ; i++)
//            freeSpots[i] = free[i];
//        
//        return freeSpots;
//    }
    
}
