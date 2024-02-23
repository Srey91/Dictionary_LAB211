/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import menu.Menu;
import view.DictionaryView;

/**
 *
 * @author 84898
 */
public class DictionaryController{
    public void menu (DictionaryView dv)
    {
        String[] content = {"Add Word", "Delete Word", "Translate", "Exit"};
        Menu m = new Menu("======== Dictionary program ========", content) {
            @Override
            public void execute(int ch) {
                switch (ch)
                {
                    case 1: dv.add(); break;
                    case 2: dv.delete(); break;
                    case 3: dv.translate(); break;
                }
            }
        };
        m.run();
    }
}
