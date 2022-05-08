package com.example.materialx.Screen.Article_Screen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.materialx.R;

public class Food_Review extends AppCompatActivity {

    private ImageView back_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_review);
        
        binding();

        back_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                onBackPressed();

            }
        });
        
    }

    private void binding() {

        back_img = findViewById(R.id.back_img);
        
    }
}