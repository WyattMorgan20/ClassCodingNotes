package com.example.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<MusicModel.Music> musicList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        musicList = new ArrayList<>();
        musicList.add(new MusicModel.Music("5x", "Dontoliver"));
        musicList.add(new MusicModel.Music("Careful", "Cardi B"));
        musicList.add(new MusicModel.Music("Needle", "Nicki Minaj"));

        MusicAdapter adapter = new MusicAdapter(musicList);
        recyclerView.setAdapter(adapter);
    }

    class MusicAdapter extends RecyclerView.Adapter<MusicAdapter.MusicViewHolder> {

        List<MusicModel.Music> musicList;

        public MusicAdapter(List<MusicModel.Music> musicList) {
            this.musicList = musicList;
        }

        @NonNull
        @Override
        public MusicViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.music_layout, parent, false);
            return new MusicViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull MusicViewHolder holder, int position) {
            final MusicModel.Music music = musicList.get(position); // Declare music as final here
            holder.titleTextView.setText(music.getTitle());
            holder.artistTextView.setText(music.getArtist());

            holder.playButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, PlayMusic.class);
                    // Pass the song name as an extra
                    intent.putExtra("songName", music.getTitle());
                    startActivity(intent);
                }
            });
        }



        @Override
        public int getItemCount() {
            return musicList.size();
        }

        class MusicViewHolder extends RecyclerView.ViewHolder {

            TextView titleTextView, artistTextView;
            Button playButton;

            public MusicViewHolder(@NonNull View itemView) {
                super(itemView);
                titleTextView = itemView.findViewById(R.id.titleTV);
                artistTextView = itemView.findViewById(R.id.artistTV);
                playButton = itemView.findViewById(R.id.playBTN);
            }
        }
    }
}
