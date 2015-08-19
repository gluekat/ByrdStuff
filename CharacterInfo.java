/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testapp;

/**
 *
 * @author olivianickles
 */
public class CharacterInfo {
    
    String name;
    int depth;
    
    //Constructor
    public CharacterInfo()
    {
        name = "The Digger";
        depth = 0; 
    }
    
    //Methods - Actions, called from Main class
    
    //Method SetName(): This class sets the character name
    //@param: input - String the character name
    public void SetName(String input)
    {
        name = input;
    }
    
    public String GetName()
    {
        return name;
    }
    
    public void SetDepth(int x)
    {
        depth = x;
    }
    
    public int GetDepth()
    {
        return depth;
    }
    
}
