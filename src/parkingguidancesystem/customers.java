package parkingguidancesystem;

import java.io.*;

public class customers { 

    private int entryID;
    private final String plateNumber;

    public customers(String plateNumber, int spot, int shift) throws FileNotFoundException, IOException{
        this.plateNumber = plateNumber;
        this.entryID = 1000 + (int) (Math.random() * 9000); // To get a number of 4 digits !
        entry e = new entry(entryID, plateNumber, spot, shift);
    }

    public int getID() {
        return entryID;
    }
    
}

