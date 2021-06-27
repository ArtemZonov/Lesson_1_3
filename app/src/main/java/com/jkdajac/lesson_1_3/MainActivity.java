package com.jkdajac.lesson_1_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList<String> datas = new ArrayList<>();
        datas.add("ООО Феникс");
        datas.add("ОАО Метиз");
        datas.add("ЧП Иванов");
        datas.add("ОАО Метсбыт");
        datas.add("ОАО Шаурма");
        datas.add("ОАО Мебель");
        datas.add("ОАО Автобан");
        datas.add("ОАО Солнце");
        datas.add("ЧП Пупкин");
        datas.add("ООО Самоцвет");
        datas.add("ООО Газбуд");



        for (int i = 0; i<datas.size(); i++ ){
            if(datas.get(i).equals("ОАО Шаурма")) datas.set(i, "ОАО Пирожки");
            Log.d("MyLog", String.valueOf(datas));


        }
    }
}

