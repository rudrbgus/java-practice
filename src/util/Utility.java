package util;

import java.util.Scanner;

public class Utility {

    public static  String input(String context){
        Scanner s = new Scanner(System.in);
        System.out.print(context);
        return  s.nextLine();
    }
}
