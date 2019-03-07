package com.example.recyclerview.Adapter;


import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.recyclerview.Model.MovieModel;
import com.example.recyclerview.R;
import com.example.recyclerview.View.DetailMovieActivity;

import java.util.ArrayList;
import java.util.List;


public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> {
    Context context; // deklarasi sebuah context
    List<MovieModel> movieModels = new ArrayList<>(); // deklarasi sebuah model list

    public MovieAdapter(Context context, List<MovieModel> movieModels) {
        this.context = context; // set context ke global
        this.movieModels = movieModels; // set model ke global
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_recycler, viewGroup, false); // menghubungkan ke layout item_recycler
        ViewHolder holder = new ViewHolder(view); // deklarasi class ViewHolder di baris 68
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        viewHolder.tvName.setText(movieModels.get(i).getName()); // set movieModel pada index i dan getName ke tvName
        viewHolder.imageView.setImageResource(movieModels.get(i).getGambar()); // set image dengan int dari movie pada indext i dan .getGambar
        viewHolder.overview.setText(movieModels.get(i).getOverview()); // set text overview
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // ketika recycler di click
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailMovieActivity.class);
                intent.putExtra("name", movieModels.get(i).getName());
                intent.putExtra("gambar", movieModels.get(i).getGambar());
                intent.putExtra("overview", movieModels.get(i).getOverview());
                context.startActivity(intent);
                Toast.makeText(context, movieModels.get(i).getName(), Toast.LENGTH_SHORT).show();
                // kenapa tidak this/getApplicartionContext ? karna bukan activiy,
                // jadi yg di gunain variable context yg sudah dikirim dari MainActivity pada
                // constructor di line 24
            }
        });
    }

    @Override
    public int getItemCount() {
        return movieModels.size();//return jumlah model
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        ImageView imageView;
        TextView overview;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_name); // hubungkan tvName ke tv_name di layout
            imageView = itemView.findViewById(R.id.iv_movie); //hubungkan imageView ke layoutnya
            overview = itemView.findViewById(R.id.tv_overview);
        }

    }
}
