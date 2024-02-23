/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import model.Dictionary;
import validation.Validation;

/**
 *
 * @author 84898
 */
public class DictionaryView {
    Dictionary d = new Dictionary();
    Validation v = new Validation();
    
    public void add()
    {
        System.out.println("------------- Add -------------");
        String English = v.getString("English");
        String Vietnamese = v.getString("Vietnamese");
        
        d.addWord(English, Vietnamese);
        System.out.println("Successful!!!");
    }
    
    public void delete()
    {
        System.out.println("------------ Delete ----------------");
        String english = v.getString("English");
        if (d.findWord(english))
        {
            d.removeWord(english);
            System.out.println("Successful!!!");
        }else
        {
            System.out.println("Word not exist!!!");
        }  
    }
    
    public void translate()
    {
        System.out.println("------------- Translate ------------");
        String english = v.getString("English");
        if (d.findWord(english))
        {
            System.out.println("Vietnamese: ");
            System.out.println(d.getWord(english));
        }else
        {
            System.out.println("Word not exist!!!");
        }  
    }
}
