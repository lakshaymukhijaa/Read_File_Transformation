package com.knoldus.KUP;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

// created public type class for implementing a read file
public class ReadFileTransformImplementation {
    // main class called
    public static void main(String[] args) throws IOException {
        File file = new File("/home/knoldus/IdeaProjects/Read_File_Transformation/src/com/knoldus/KUP/file.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));
        // Hash Map used for taking Input as Integer as well string
        HashMap<String,Integer> map=new HashMap<String,Integer>();

        String st;
     //    loop started here for reading line one by one
        while ((st = br.readLine()) != null) {
            String[] arr=st.split("\\s");
            for (String s : arr) {
          if (!map.containsKey(s))
                map.put(s, 1);
                else
                  map.put(s, map.get(s) + 1);
            }
        }
        // output
        System.out.println(map);

    }
}
