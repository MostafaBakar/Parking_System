package parkingguidancesystem;
import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Integer.valueOf;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class exit {
    private final static double MINUTES_PRICE = 10;
    private static  LocalDateTime exitTime;
    private double totalMinutes = 0;
    private double cash;
    private int sh;

    public exit(int sh,Integer entryID) throws FileNotFoundException, IOException{
       File f = new File("customers.txt");
       String line = search(entryID, f);
       double totalMinutes = calculateTotalTime(line);
       String shift = line.substring(38);
       String spot = line.substring(36,37);
       Integer s = valueOf(spot);
       spots.free(s);
        FileWriter file = new FileWriter("exit.txt", true);
        PrintWriter p = new PrintWriter(file);
        p.println(entryID + " " + exitTime + " " + totalMinutes + " " + shift);
        p.close();
        File f2 = new File("inParke.txt");
        removeLine(f2,line);
        this.sh = sh;
    }
    
    public double getTotalMinutes(){
        return totalMinutes;
    }
    
    public double getCash() throws IOException{
       double cash = totalMinutes*MINUTES_PRICE;
       shifts.setBalance(sh,cash);
        return (cash);
    }
    
    public static String search(Integer entryID, File file) throws FileNotFoundException {
        String line = null;     
        Scanner scanner = new Scanner(file).useDelimiter( " ,");
        while(scanner.hasNext()){
            final String lineFromFile = scanner.nextLine();
            if (lineFromFile.contains(entryID.toString())) {
                line = lineFromFile;
                break;
            }else
                line = null;
        }
        return line;
    }
    
    private double calculateTotalTime(String line) {
       exitTime =  LocalDateTime.now();
       Integer Y_Exit = valueOf(exitTime.toString().substring(0,4));
       Integer M_Exit = valueOf(exitTime.toString().substring(5,7));
       Integer D_Exit = valueOf(exitTime.toString().substring(8,10));
       Integer H_Exit = valueOf(exitTime.toString().substring(11,13));
       Integer ME_Exit = valueOf(exitTime.toString().substring(14,16));
       Integer Y_Entry = valueOf(line.substring(12,16));
       Integer M_Entry = valueOf(line.substring(17,19));
       Integer D_Entry = valueOf(line.substring(20,22));
       Integer H_Entry = valueOf(line.substring(23,25));
       Integer ME_Entry = valueOf(line.substring(26,28));
       Integer Y_Total = 0;
       Integer M_Total = 0;
       Integer D_Total = 0;
       Integer H_Total = 0;
       if(!Objects.equals(Y_Exit, Y_Entry)){
           int i = Y_Exit - Y_Entry;
           Y_Total = i*525600; //525600 = total minutes in year
       } 
        if(!Objects.equals(M_Exit, M_Entry)){
           int i = M_Exit - M_Entry;
           M_Total = i*43800; //43800 = total minutes in month
       } 
        if(!Objects.equals(D_Exit, D_Entry)){
           int i = D_Exit - D_Entry;
           D_Total = i*1436; //1436 = total minutes in Day
       }
        if(!Objects.equals(H_Exit, H_Entry)){
           int i = H_Exit - H_Entry;
           H_Total = i*60; //60 = total minutes in Hour
       }
        int total = 0; 
        if(Objects.equals(H_Entry, H_Exit))
            total = ME_Exit - ME_Entry;
        else{
            H_Total = H_Total - ME_Entry;
            total = H_Total + ME_Exit;
        } 
       totalMinutes = Y_Total + M_Total + D_Total + total;
       return totalMinutes;
    }

    public static void removeLine(File input ,String line) throws FileNotFoundException, IOException{
        File temp = new File("temp.txt");
        BufferedReader reader = new BufferedReader(new FileReader(input));
        BufferedWriter writer = new BufferedWriter(new FileWriter(temp));
        String currentLine;
      
        while((currentLine = reader.readLine()) != null) {
            if(!currentLine.trim().equals(line))
                writer.write(currentLine +     "\n");
            }
        writer.close();
        reader.close();
        temp.renameTo(input);
        BufferedReader reader2 = new BufferedReader(new FileReader(temp));
        BufferedWriter writer2 = new BufferedWriter(new FileWriter(input));
        while((currentLine = reader2.readLine()) != null) {
            writer2.write(currentLine +     "\n");
        }
        writer2.close();
        reader2.close();
        input.renameTo(temp);
    }
    
//    public static void removeLine(File file, File inputeFile ,String line) throws FileNotFoundException, IOException{
//        File inputFile = file;
//        File tempFile = inputeFile;
//
//        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
//        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
//        String currentLine;
//
//        while((currentLine = reader.readLine()) != null) {
//            if(!currentLine.trim().equals(line)){
//                writer.write(currentLine +     "\n");
//            }
//        }
//        writer.close();
//        reader.close();
//        file.delete();
//        tempFile.renameTo(file);
//
//    }
    
}


