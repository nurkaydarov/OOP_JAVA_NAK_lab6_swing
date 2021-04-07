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
public class Language extends ListResourceBundle {
    private static final Object[][] contents = 
    {
        {"languageSet", "Выберите язык"},
        {"languages", new String[]{"Русский", "Казахский", "Английский"}},
        {"greeting", "Введите ваше имя"},
        {"yearOfBirth", "Введите ваш год рождения: "},
        {"genderSelect", "Ваш пол"},
        {"genders", new String[]{"Мужской", "Женский"}},
        {"result", " , Вам осталось до пенсий:"},
        {"resultN", " по законам РК, у вас уже пенсионный возраст"},
        {"error", "Ошибка ввода"},
        {"prefix1", "год"},
        {"prefix2", "года"},
        {"prefix3", "лет"},
        {"select", "лет"},
        {"errorField", "Введите имя в поле ввода"},
        {"startBtn", "Решить"},
        {"clearBtn", "Очистить"},
        {"exitBtn", "Выход"},
        
    };
    
    @Override
    public Object[][] getContents(){
        return contents;
    }
    
}
