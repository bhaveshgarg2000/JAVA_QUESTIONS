
package com.practice;
import java.io.FileOutputStream;
public class example1 {
    public static void main(String[] args) {
        try{
        FileOutputStream fout = new FileOutputStream("D://first.txt");
        String S = "Java is a general-purpose computer programming language that\n" +
                "is concurrent, class-based, object-oriented, and specifically designed to have as\n" +
                "few implementation dependencies as possible. It is intended to let application\n" +
                "developers \"write once, run anywhere\" (WORA), meaning that compiled Java\n" +
                "code can run on all platforms that support Java without the need for\n" +
                "recompilation. Java applications are typically compiled to bytecode that can run\n" +
                "on any Java virtual machine (JVM) regardless of computer architecture. As of\n" +
                "2016, Java is one of the most popular programming languages in use particularly\n" +
                "for client-server web applications, with a reported 9 million developers. Java was\n" +
                "originally developed by James Gosling at Sun Microsystems(which has since\n" +
                "been acquired by Oracle Corporation) and released in 1995 as a core component\n" +
                "of Sun Microsystems' Java platform. The language derives much of\n" +
                "its syntax from C and C++, but it has fewer low-level facilities than either of them.";
        byte b[] = S.getBytes();
        fout.write(b);
        fout.close();
            System.out.println("Success");
        }catch(Exception e){
            System.out.println(e);

        }
    }
}
