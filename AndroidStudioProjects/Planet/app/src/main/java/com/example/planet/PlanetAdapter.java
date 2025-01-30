package com.example.planet;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PlanetAdapter extends RecyclerView.Adapter<PlanetAdapter.PlanetViewHolder>{

    //private ArrayList<String> model;

    public PlanetAdapter(){

    }

    //Auto Generated v
    @NonNull
    @Override
    public PlanetViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.planet_view, parent, false);
        PlanetViewHolder vh = new PlanetViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull PlanetViewHolder holder, int position) {
        TextView nameTV = holder.itemView.findViewById(R.id.nameTV);
        TextView distTV = holder.itemView.findViewById(R.id.distanceTV);
        nameTV.setText(Model.getModel().thePlanets.get(position).getName());
        distTV.setText(String.valueOf(Model.getModel().thePlanets.get(position).getDist()));
    }

    @Override
    public int getItemCount() {
        return 0;
    }
    //Auto Generated ^

    public static class PlanetViewHolder extends RecyclerView.ViewHolder{
        public PlanetViewHolder(View v){
            super(v);
        }
    }
}
