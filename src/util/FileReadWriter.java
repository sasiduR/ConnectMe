package util;
import user.HRManager;

import java.io.*;

public class FileReadWriter {
    public void WriteFile(String data){
        try{
            FileWriter Writer=new FileWriter("Report.txt",true);
            BufferedWriter BWriter=new BufferedWriter(Writer);
            BWriter.write(data);
            BWriter.close();

        }catch(IOException e){
            System.out.println("Error Writing to file");
            System.out.println(e.getMessage());
        }
    }
}
