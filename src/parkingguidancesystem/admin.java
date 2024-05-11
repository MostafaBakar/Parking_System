 package parkingguidancesystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class admin {
    /*data fields*/
    private int ID;
    private String password;
    
    /*constructors*/
    public admin(){ }
    public admin(int ID, String password){
        this.ID = ID;
        this.password = password;
    }
    
    /*methods*/
    public boolean checkLoginDetails(int ID, String pass) throws FileNotFoundException{
        boolean flag = false;
        File file = new File("admin.txt");
        String line = exit.search(ID, file);
        if (line != null){
            if (line.contains(pass))
                flag = true;
        } else
            flag = false;
        return flag;
    }

    public void setPassword(String password){
        this.password = password;
    }
    
    public void setSpots(int Spots) throws IOException{
        spots s = new spots();
        s.setSpotsNumber(Spots) ;
    }

    public void addUser(){}
    public void deleteUser(){}
    public void updateUser(){}
    public void viewParkiedCars(){}
    
    public static boolean checkID(int ID) throws FileNotFoundException{
        boolean flag = false;
        File file = new File("inParke.txt");
        String line = exit.search(ID, file);
        if (line != null){
                flag = true;
        } else
            flag = false;
        return flag;
    }
    
}
