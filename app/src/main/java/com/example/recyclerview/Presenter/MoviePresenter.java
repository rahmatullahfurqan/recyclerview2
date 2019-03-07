package com.example.recyclerview.Presenter;

import android.content.Context;

import com.example.recyclerview.Model.MovieModel;
import com.example.recyclerview.R;
import com.example.recyclerview.View.MainView;

import java.util.ArrayList;
import java.util.List;

public class MoviePresenter {
    Context context; // deklarasi sebuah context
    List<MovieModel> movieModels = new ArrayList<>(); // deklarasi sebuah model list
    MainView view; // deklarasi class MainView
    public MoviePresenter(MainView view, Context context){
        this.view = view; // set view ke view global
        this.context = context; //set context ke context global
    }

    public void setData(){
        MovieModel movie; //deklarasi sebuah model

        movie= new MovieModel("Alita: Battle Angel",R.drawable.alita,"When Alita awakens with no memory of who she is in a future world she does not recognize, she is taken in by Ido, a compassionate doctor who realizes that somewhere in this abandoned cyborg shell is the heart and soul of a young woman with an extraordinary past.");//yg dikirim ada dua parameter , string name sama int, R.drawable.variable tipe datanya adalah int (di pisah pakai tanda koma)
        movieModels.add(movie);//set model ke model list
        movie = new MovieModel("Aquaman",R.drawable.aquaman,"Once home to the most advanced civilization on Earth, the city of Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people -- and then the surface world. Standing in his way is Aquaman, Orm's half-human, half-Atlantean brother and true heir to the throne. With help from royal counselor Vulko, Aquaman must retrieve the legendary Trident of Atlan and embrace his destiny as protector of the deep.");
        movieModels.add(movie);
        movie = new MovieModel("How to Train Your Dragon: The Hidden World",R.drawable.dragon,"As Hiccup fulfills his dream of creating a peaceful dragon utopia, Toothless’ discovery of an untamed, elusive mate draws the Night Fury away. When danger mounts at home and Hiccup’s reign as village chief is tested, both dragon and rider must make impossible decisions to save their kind.");
        movieModels.add(movie);
        movie = new MovieModel("Glass",R.drawable.glass,"In a series of escalating encounters, security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men.");
        movieModels.add(movie);
        movie = new MovieModel("Green Book",R.drawable.greenbook,"Tony Lip, a bouncer in 1962, is hired to drive pianist Don Shirley on a tour through the Deep South in the days when African Americans, forced to find alternate accommodations and services due to segregation laws below the Mason-Dixon Line, relied on a guide called The Negro Motorist Green Book.");
        movieModels.add(movie);
        movie = new MovieModel("Happy Death Day 2U",R.drawable.happydead,"Collegian Tree Gelbman wakes up in horror to learn that she's stuck in a parallel universe. Her boyfriend Carter is now with someone else, and her friends and fellow students seem to be completely different versions of themselves. When Tree discovers that Carter's roommate has been altering time, she finds herself once again the target of a masked killer. When the psychopath starts to go after her inner circle, Tree soon realizes that she must die over and over again to save everyone.");
        movieModels.add(movie);

        view.onSucsess(movieModels);
    }
}
