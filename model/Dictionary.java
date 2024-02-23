/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.HashMap;

/**
 *
 * @author 84898
 */
public class Dictionary {
    private HashMap<String, String> dictionary = new HashMap<String, String>();
    
    public String addWord(String English, String Vietnamese)
    {
        return this.dictionary.put(English, Vietnamese);
    }
    
    public String removeWord(String English)
    {
        return this.dictionary.remove(English);
    }
    
    public String getWord(String English)
    {
        
        return this.dictionary.get(English);
    }
    
    public boolean findWord(String English)
    {
        return this.dictionary.containsKey(English);
    }
    
    public static void main(String[] args) {
        Dictionary d = new Dictionary();
        d.addWord("Hello", "xinchao");
        if (d.findWord("Hello"))
            System.out.println("Co");
    }
}