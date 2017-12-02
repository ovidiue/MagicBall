package com.example.enesc.magicball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button button;
    ImageView image;
    final int[] arr = {
            R.drawable.better_not,
            R.drawable.no_idea,
            R.drawable.not,
            R.drawable.wonderful,
            R.drawable.yes
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        image = findViewById(R.id.image);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int r = new Random().nextInt(5);
                Log.d("MAGIC_BALL", "RND: "+r);
                image.setImageResource(arr[r]);
            }
        });
    }
}
