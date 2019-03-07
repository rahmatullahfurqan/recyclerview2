package com.example.recyclerview.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.recyclerview.Adapter.MovieAdapter;
import com.example.recyclerview.Model.MovieModel;
import com.example.recyclerview.Presenter.MoviePresenter;
import com.example.recyclerview.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MainView{
    RecyclerView recyclerView; // deklarasi recycelerview
    MovieAdapter adapter; // deklarasi adapter
    MoviePresenter presenter; //deklarasi presenter
    List<MovieModel> movieModels = new ArrayList<>(); //dekalrasi model list
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // menghubungkan MainActivity degan layout activity_main
        recyclerView = findViewById(R.id.recycler_view); // hubungkan ke activity main
        recyclerView.setLayoutManager(new LinearLayoutManager(this)); // set layout untuk recycler
        adapter = new MovieAdapter(this,movieModels); //inisialisasi MovieAdapter
        recyclerView.setAdapter(adapter); // set adapter ke recycler view
        presenter = new MoviePresenter(this,this); // inisialisasi MoviePresenter, mengirim MainView dan context
        presenter.setData(); // untuk manggil method setData di MoviePresenter
    }

    @Override
    public void onSucsess(List<MovieModel> movieModels) {
        this.movieModels.clear(); // clear list model
        this.movieModels.addAll(movieModels); // add all list model dengan model list baru
        this.adapter.notifyDataSetChanged(); // update data adapter
    }
}
