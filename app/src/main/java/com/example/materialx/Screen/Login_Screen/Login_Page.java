package com.example.materialx.Screen.Login_Screen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.materialx.R;

public class Login_Page extends AppCompatActivity {

    private ImageView back_img;
    LinearLayout simple_light_lnr,simple_green_lnr,image_teal_lnr,card_light_lnr,card_overlap_lnr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);

        binding();

        back_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                onBackPressed();

            }
        });

        simple_light_lnr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Login_Page.this, Simple_Light.class);
                startActivity(i);

            }
        });
        simple_green_lnr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Login_Page.this, Simple_Green.class);
                startActivity(i);

            }
        });
        image_teal_lnr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Login_Page.this, Image_Teal.class);
                startActivity(i);

            }
        });
        card_light_lnr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Login_Page.this, Card_Light.class);
                startActivity(i);

            }
        });
        card_overlap_lnr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Login_Page.this, Card_Overlap.class);
                startActivity(i);

            }
        });


    }

    private void binding() {

        back_img = findViewById(R.id.back_img);
        simple_light_lnr = findViewById(R.id.simple_light_lnr);
        simple_green_lnr = findViewById(R.id.simple_green_lnr);
        image_teal_lnr = findViewById(R.id.image_teal_lnr);
        card_light_lnr = findViewById(R.id.card_light_lnr);
        card_overlap_lnr = findViewById(R.id.card_overlap_lnr);


    }
}