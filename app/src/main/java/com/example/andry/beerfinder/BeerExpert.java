package com.example.andry.beerfinder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andry on 08.05.2017.
 */

public class BeerExpert {

    //  создаем  метод который создает лист брендов пива который
    // будет формироаться взависимости от выбора в выпадающем списке
    List<String> getBrends(String colorOfBeer) {
        List<String> brands = new ArrayList<String>();
        switch (colorOfBeer){
            case "Темненька півашка":
                brands.add("1.Львівський Дункель");
                brands.add("2.Staropramen");
                brands.add("3.Slata Praha(Dunkle)");
                brands.add("4.Біла ніч");
                break;
            case "Світлоє півло":
                brands.add("1.Оболонь світле");
                brands.add("2.Хайк");
                brands.add("3.Чернігівсье світле");
                brands.add("4.Біле");
                break;
            case "Ельчик с британіі":
                brands.add("1.Оболонь(Ель)");
                brands.add("2.Британський Ель");
                brands.add("3.Ель з пригороду франції");
                brands.add("4.Білий Ель");
                break;
            case "Сідр яблуневий":
                brands.add("1.Сидр яблуневий (кєжуал)");
                brands.add("2.Сидр вишневий");
                brands.add("3.Сидр сливовий");
                brands.add("4.Сидр з ківі");
                break;
            case "Шайтан шмурділло":
                brands.add("1.Десант- рєдка півашка");
                brands.add("2.Арсенал");
                brands.add("3.Арсенал Міцне(для хардкорщіков");
                brands.add("4.Шмурдяк 777");
                break;
        }

        return  brands;
    }
}
