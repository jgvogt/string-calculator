package com.daugherty.calculator;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {
	
    public static void main (String args[]) throws IOException {        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Please enter numbers to add: ");
        
        int sum = new StringCalculator().add(reader.readLine());
        
        System.out.println(sum);
    }
}
