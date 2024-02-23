/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import controller.DictionaryController;
import view.DictionaryView;

/**
 *
 * @author 84898
 */
public class Main {
    public static void main(String[] args) {
        DictionaryView dv = new DictionaryView();
        DictionaryController dc = new DictionaryController();
        dc.menu(dv);
    }
}
