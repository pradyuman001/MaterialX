package com.example.materialx.Screen.Article_Screen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.materialx.R;

public class Article_Page extends AppCompatActivity {


    private CardView food_review_btn;
    ImageView back_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.article_page);

        binding();

        back_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                onBackPressed();

            }
        });

        food_review_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Article_Page.this, Food_Review.class);
                startActivity(i);

            }
        });



    }

    private void binding() {

        food_review_btn = findViewById(R.id.food_review_btn);
        back_img = findViewById(R.id.back_img);

    }


}