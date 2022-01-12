package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	//
        String str = "     65";
        System.out.println(stringWhite(str));
    }
    public static int stringWhite(String str){
        if(str.length()==0){
            return 0;
        }
        str = str.trim();
        return Integer.parseInt(str);
    }
}
