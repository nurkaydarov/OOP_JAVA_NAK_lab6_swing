/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

import java.awt.*;
import java.util.ListResourceBundle;

/**
 *
 * @author Aktan
 */
public class Language_en extends ListResourceBundle {
    private static final Object[][] contents = 
    {
        {"languageSet", "Select a language:"},
        {"languages", new String[]{"Russian", "Kazakh", "English"}},
        {"greeting", "Enter your name: "},
        {"yearOfBirth", "Enter your year of birth: "},
        {"genderSelect", "What is your gender?"},
        {"genders", new String[]{"Male", "Female"}},
        {"result", ", You have until retirement "},
        {"resultN", " according to the laws of the Republic of Kazakhstan, you already have a retirement age"},
        {"error", "Error input"},
        {"prefix1", "y.o"},
        {"prefix2", "y.o"},
        {"prefix3", "y.o"},
        {"select", "Select: "},
        {"errorYear", "You entered the wrong year of birth"},
        {"startBtn", "Start"},
        {"clearBtn", "Clear"},
        {"exitBtn", "Exit"},
        
    };
    
    @Override
    public Object[][] getContents(){
        return contents;
    }
    
}
