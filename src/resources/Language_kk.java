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
public class Language_kk extends ListResourceBundle {
    private static final Object[][] contents = 
    {
        {"languageSet", "Тілді таңдаңыз: "},
        {"languages", new String[]{"Орыс тілі", "Қазақ тілі", "Ағылшын тілі"}},
        {"greeting", "Атыңызды енгізіңіз"},
        {"yearOfBirth", "Туған жылыңызды енгізіңіз: "},
        {"genderSelect", "Сіздің жынысыңыз"},
        {"genders", new String[]{"Еркек", "Әйел"}},
        {"result", ", Сізге зейнетке дейін қалды: "},
        {"resultN", " ҚР Заңдары бойынша сізде зейнеткерлік жасыңыз бар"},
        {"error", "Енгізу қатесі: "},
        {"prefix1", "жас"},
        {"prefix2", "жас"},
        {"prefix3", "жас"},
        {"select", "лет"},
        {"errorYear", "Туған жылы сіз қате енгіздіңіз"},
        {"startBtn", "Старт"},
        {"clearBtn", "Жою"},
        {"exitBtn", "Шығу"},
    };
    
    @Override
    public Object[][] getContents(){
        return contents;
    }
    
}
