package com.example.andry.beerfinder;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private BeerExpert expert = new BeerExpert();

    //создаем активность
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //указываем активность которая будет создаваться по xml файлу
        setContentView(R.layout.activity_main);
    }

    //создаем метод для кнопки при нажатии на которую будет происходить действие
    @SuppressLint("SetTextI18n")
    public void onClickBeerFinder(View view) {

        //создаем текстовое поле и приявзываем его к элементу  в xml файле по id
        TextView brands = (TextView)findViewById(R.id.brands);

        //созаем віпадающий список и приявзываем его к элементу  в xml файле по id
        Spinner colorOfBeer = (Spinner)findViewById(R.id.color_of_beer);

        //созадем строку и переводим ее из списка брендов в строковом ресурсе
        String beerChosen = String.valueOf(colorOfBeer.getSelectedItem());

        //формируем лист єлементов исходя из вібраной в списке категории
        List<String> brandList = expert.getBrends(beerChosen);

        //содаем строку
        StringBuilder brandsFormated = new StringBuilder();


        // добавляем по очередно єлементы листа в строку и добавляем их с новой строки каждый
        for (String brand:brandList) {
            brandsFormated.append(brand).append("\n");

        }

        //выводим на текстовое поле список
        brands.setText("Можу тобі предложить:\n" + brandsFormated);

    }
}
