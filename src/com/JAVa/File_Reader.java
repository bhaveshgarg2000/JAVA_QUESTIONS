package com.JAVa;
import java.io.*;

public class File_Reader {

        public static void main(String args[])throws Exception{
          FileReader fr=new FileReader("testout.txt");
            int ch;
             while((ch =fr.read())!=-1)
             System.out.print((char) ch);
             fr.close();
    }
}
