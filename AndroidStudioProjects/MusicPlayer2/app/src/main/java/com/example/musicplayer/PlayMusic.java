package com.example.musicplayer;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.musicplayer.MusicModel;
import com.example.musicplayer.R;

import java.util.ArrayList;
import java.util.List;

public class PlayMusic extends AppCompatActivity {

    ImageButton pausePlayButton, nextButton, prevButton;
    ImageView songImageView;
    TextView songNameTextView;

    List<MusicModel.Music> musicList;
    int currentSongIndex = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_music);

        // Initialize music list (you can pass this list from MainActivity if needed)
        musicList = new ArrayList<>();
        musicList.add(new MusicModel.Music("5x", "Dontoliver"));
        musicList.add(new MusicModel.Music("Careful", "Cardi B"));
        musicList.add(new MusicModel.Music("Needle", "Nicki Minaj"));
        // Add more songs as needed

        pausePlayButton = findViewById(R.id.PausePlayIB);
        nextButton = findViewById(R.id.nextIB);
        prevButton = findViewById(R.id.prevIB);
        songImageView = findViewById(R.id.SongImageIV);
        songNameTextView = findViewById(R.id.SongNameTV);

        // Display the first song initially
        displaySong(currentSongIndex);

        pausePlayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                togglePlayPause();
            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playNextSong();
            }
        });

        prevButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playPreviousSong();
            }
        });
    }

    private void displaySong(int index) {
        // Get the current song
        MusicModel.Music song = musicList.get(index);
        // Set song name and artist
        songNameTextView.setText(song.getTitle() + " - " + song.getArtist());
        // Set song image
        // Note: You need to implement the logic for setting the song image
    }

    private void playNextSong() {
        // Increment the current song index
        currentSongIndex++;
        // Check if reached the end of the list
        if (currentSongIndex >= musicList.size()) {
            currentSongIndex = 0; // Wrap around to the beginning
        }
        // Display the next song
        displaySong(currentSongIndex);
    }

    private void playPreviousSong() {
        // Decrement the current song index
        currentSongIndex--;
        // Check if reached the beginning of the list
        if (currentSongIndex < 0) {
            currentSongIndex = musicList.size() - 1; // Wrap around to the end
        }
        // Display the previous song
        displaySong(currentSongIndex);
    }

    private boolean isPlaying = false;

    private void togglePlayPause() {
        if (isPlaying) {
            // Pause logic
            Toast.makeText(this, "Song Paused", Toast.LENGTH_SHORT).show();
            // Change the image to play song image
            pausePlayButton.setImageResource(android.R.drawable.ic_media_play);
        } else {
            // Play logic
            Toast.makeText(this, "Playing song", Toast.LENGTH_SHORT).show();
            // Change the image to pause song image
            pausePlayButton.setImageResource(android.R.drawable.ic_media_pause);
        }

        // Toggle the play/pause state
        isPlaying = !isPlaying;
    }
}
