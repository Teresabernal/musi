package tere.algo;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.estudiantes.myapplication.R;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }
    public void escu(View view)
    {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.trapped);
        mp.start();
    }
}
