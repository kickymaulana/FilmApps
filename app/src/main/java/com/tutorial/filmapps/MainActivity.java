package com.tutorial.filmapps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.tutorial.filmapps.adapter.FilmAdapter;
import com.tutorial.filmapps.model.FilmModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<FilmModel> filmModelList;
    FilmAdapter filmAdapter;
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        filmModelList = new ArrayList<>();
        filmAdapter = new FilmAdapter(MainActivity.this, filmModelList  );
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        linearLayoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(filmAdapter);

        filmModelList.add(new FilmModel("ETERNALS","MARVEL STUDIOS",
                getApplicationContext().getString(R.string.deskripsi1), R.drawable.eternals));

        filmModelList.add(new FilmModel("DEADPOOL","20th CENTURY FOX ",
                getApplicationContext().getString(R.string.deskripsi2),R.drawable.jumanji));

        filmModelList.add(new FilmModel("Naruto","Film Favorite kita semua ",
                "Naruto adalah sebuah serial animas iyang di adapatasi dari komik jepang",R.drawable.eternals));
        filmModelList.add(new FilmModel("Naruto","Film Favorite kita semua ", "Naruto adalah sebuah serial animas iyang di adapatasi dari komik jepang",R.drawable.eternals));
        filmModelList.add(new FilmModel("Naruto","Film Favorite kita semua ", "Naruto adalah sebuah serial animas iyang di adapatasi dari komik jepang",R.drawable.eternals));
        filmModelList.add(new FilmModel("Naruto","Film Favorite kita semua ", "Naruto adalah sebuah serial animas iyang di adapatasi dari komik jepang",R.drawable.eternals));


        filmAdapter.notifyDataSetChanged();

    }

}