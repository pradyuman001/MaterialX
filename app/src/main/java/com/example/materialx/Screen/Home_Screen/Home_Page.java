package com.example.materialx.Screen.Home_Screen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.materialx.Screen.Article_Screen.Article_Page;
import com.example.materialx.Screen.Dashboard.Dashboard_Screen;
import com.example.materialx.Screen.Login_Screen.Login_Page;
import com.example.materialx.R;

public class Home_Page extends AppCompatActivity {

    private CardView login_btn,dashboard_btn,article_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);

        binding();

        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Home_Page.this, Login_Page.class);
                startActivity(intent);

            }
        });

        dashboard_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Home_Page.this, Dashboard_Screen.class);
                startActivity(intent);


            }
        });

        article_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Home_Page.this, Article_Page.class);
                startActivity(intent);

            }
        });


    }

    private void binding() {

        dashboard_btn = findViewById(R.id.dashboard_btn);
        login_btn = findViewById(R.id.login_btn);
        article_btn = findViewById(R.id.article_btn);

    }
}