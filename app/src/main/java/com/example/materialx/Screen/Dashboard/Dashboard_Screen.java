package com.example.materialx.Screen.Dashboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.materialx.R;

public class Dashboard_Screen extends AppCompatActivity {

    CardView statistic_btn, finance_btn, pay_btn, wallet_btn, green_btn, crypto_btn;
    ImageView back_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard_screen);

        binding();

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                onBackPressed();

            }
        });

        statistic_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard_Screen.this, Statistic_Screen.class);
                startActivity(intent);
            }
        });

        finance_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard_Screen.this, Finance_Screen.class);
                startActivity(intent);
            }
        });

        pay_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard_Screen.this, Pay_Bill_Screen.class);
                startActivity(intent);
            }
        });

        wallet_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard_Screen.this, Wallet_Screen.class);
                startActivity(intent);
            }
        });

        green_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard_Screen.this, Wallet_Screen_green.class);
                startActivity(intent);
            }
        });

        crypto_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard_Screen.this, Crypto_Screen.class);
                startActivity(intent);
            }
        });

    }

    void binding() {
        statistic_btn = findViewById(R.id.statistic_btn);
        finance_btn = findViewById(R.id.finance_btn);
        pay_btn = findViewById(R.id.pay_btn);
        wallet_btn = findViewById(R.id.wallet_btn);
        green_btn = findViewById(R.id.green_btn);
        crypto_btn = findViewById(R.id.crypto_btn);
        back_btn = findViewById(R.id.back_btn);
    }

}