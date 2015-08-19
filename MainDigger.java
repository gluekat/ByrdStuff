/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testapp;

import java.io.*;

public class MainDigger {

    public static void main(String[] args) {
        // TODO code application logic here
        
        //Initialize CharacterInfo class (Create a new character)
        CharacterInfo X = new CharacterInfo();
        
        //Create new Reader for Keyboard input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Variable to store user input
        String UserInput;  
        
try{
        System.out.println("Enter Character Name: ");
        UserInput = br.readLine();
        
        //Set character name
       // X.SetName(UserInput);
        
        //Print Character name to screen
        System.out.println("Your name is " + X.GetName());
        
    }
catch (IOException e)
        {
            System.out.println(e);
        }
    


    
}
   
}

