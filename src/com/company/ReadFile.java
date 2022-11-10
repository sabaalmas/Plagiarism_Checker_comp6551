package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ReadFile {
    public void takeInput()
    {
        String absolute_path = "C:\\Users\\14386\\Desktop\\Plagiarism Checker comp6551\\";
        ArrayList<String> file_names = new ArrayList<>();
        file_names.add("1.txt");
        file_names.add("2.txt");
        for(int i = 0; i < file_names.size(); i++) {
            try {
                File file = new File(absolute_path +file_names.get(i));
                Scanner reader = null;
                reader = new Scanner(file);
                while (reader.hasNextLine()) {
                    String data = reader.nextLine();
                    System.out.println(data);
                }
                reader.close();
            }
            catch (FileNotFoundException e)
            {
                System.out.println("Error occured");
                e.printStackTrace();
            }
            System.out.println("File read \n");
        }
    }
}
