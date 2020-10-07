package com.example.darabinding_recyclerview.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.darabinding_recyclerview.R;
import com.example.darabinding_recyclerview.adapter.CloneAdapter;
import com.example.darabinding_recyclerview.data.Clone;
import com.example.darabinding_recyclerview.data.CloneFactory;


public class MainActivity extends AppCompatActivity {
    //ссылка на адаптер, класс который знает всё о модели и дёргает методы холдера
    private CloneAdapter cloneAdapter;
    //ссылка на вьюшку из представления
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Заполняем лайаут Activity контейнером с единственным виджетом RecyclerView
        setContentView(R.layout.activity_main);
        //Находим ссылку на контейнер - виджет
        recyclerView = findViewById(R.id.recyclerView);
        //LinearLayoutManager занимается размещением объектов на экране и прокруткой
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //Подготавливаем список данных и заполняем его
        List<Clone> personList = CloneFactory.getCloneList();

        //Создаём экземпляр адаптера и передаём ему список данных. Далее руководит ими он
        cloneAdapter = new CloneAdapter(personList);

        //Назначаем вьюхе адаптером наш экземпляр cloneAdapter
        recyclerView.setAdapter(cloneAdapter);
    }


}