package lang.classes.ProcessBuilder.ProcessBuilder_Example;


// Java code illustrating command() method

import java.io.*;
import java.lang.*;
import java.util.*;

class ProcessBuilder_App {
    public static void main(String[] arg) throws IOException {

        // creating list of process
        List<String> list = new ArrayList<String>();
        list.add("C:\\Users\\crist\\eclipse\\jee-2020-03\\eclipse\\eclipse.exe");
        list.add("notepad.exe");

        // create the process
        ProcessBuilder build = new ProcessBuilder(list);

        build.start();
        // checking the command i list
        System.out.println("command: " + build.command());
    }
}
