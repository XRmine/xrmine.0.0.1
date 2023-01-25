package io.xrmine.xrmine001;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.Button;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import io.xrmine.xrmine001.databinding.ActivityTrustlineBinding;

public class TrustlineActivity extends AppCompatActivity {

    private ActivityTrustlineBinding binding;

    Button btn_tkn_mine_wp, btn_tkn_mine_tl, btn_tkn_blank_wp, btn_tkn_blank_tl, btn_tkn_blank_wp2,
            btn_tkn_blank_tl2, btn_tkn_blank_wp3, btn_tkn_blank_tl3, btn_tkn_blank_wp4,
            btn_tkn_blank_tl4, btn_tkn_mine_mine;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityTrustlineBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        btn_tkn_mine_wp =findViewById(R.id.btn_tkn_mine_wp);
        btn_tkn_mine_tl =findViewById(R.id.btn_tkn_mine_tl);
        btn_tkn_mine_tl.setEnabled(false);
        btn_tkn_mine_mine =findViewById(R.id.btn_tkn_mine_mine);
        btn_tkn_mine_mine.setVisibility(View.INVISIBLE);
        btn_tkn_blank_wp =findViewById(R.id.btn_tkn_blank_wp);
        btn_tkn_blank_tl =findViewById(R.id.btn_tkn_blank_tl);
        btn_tkn_blank_tl.setEnabled(false);
        btn_tkn_blank_wp2 =findViewById(R.id.btn_tkn_blank_wp2);
        btn_tkn_blank_tl2 =findViewById(R.id.btn_tkn_blank_tl2);
        btn_tkn_blank_tl2.setEnabled(false);
        btn_tkn_blank_wp3 =findViewById(R.id.btn_tkn_blank_wp3);
        btn_tkn_blank_tl3 =findViewById(R.id.btn_tkn_blank_tl3);
        btn_tkn_blank_tl3.setEnabled(false);
        btn_tkn_blank_wp4 =findViewById(R.id.btn_tkn_blank_wp4);
        btn_tkn_blank_tl4 =findViewById(R.id.btn_tkn_blank_tl4);
        btn_tkn_blank_tl4.setEnabled(false);

        btn_tkn_mine_wp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                golink ("https://xrmine.io/whitepaper");
                new CountDownTimer(10000, 10){
                    public void onTick(long millisUntilFinished) {
                    }

                    @Override
                    public void onFinish(){
                        btn_tkn_mine_tl.setEnabled(true);
                    }

                }.start();
            }
        });

        btn_tkn_mine_tl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                golink ("https://xrpl.services/?issuer=rfXMq3BMX2dTzJtG4pnhr49u6sHkVQXpWL&currency=58524D696E650000000000000000000000000000&limit=10000000000");
                btn_tkn_mine_tl.setVisibility(View.INVISIBLE);
                btn_tkn_mine_mine.setVisibility(View.VISIBLE);

            }
        });

        btn_tkn_mine_mine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TrustlineActivity.this, MineActivity.class));
            }
        });

        btn_tkn_blank_wp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                golink ("https://xrmine.io/whitepaper");
                new CountDownTimer(10000, 10){
                    public void onTick(long millisUntilFinished) {
                    }

                    @Override
                    public void onFinish(){
                        btn_tkn_blank_tl.setEnabled(true);
                    }

                }.start();
            }
        });

        btn_tkn_blank_tl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                golink ("https://xrpl.services/?issuer=rfXMq3BMX2dTzJtG4pnhr49u6sHkVQXpWL&currency=58524D696E650000000000000000000000000000&limit=10000000000");
            }
        });

        btn_tkn_blank_wp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                golink ("https://xrmine.io/whitepaper");
                new CountDownTimer(10000, 10){
                    public void onTick(long millisUntilFinished) {
                    }

                    @Override
                    public void onFinish(){
                        btn_tkn_blank_tl2.setEnabled(true);
                    }

                }.start();
            }
        });

        btn_tkn_blank_tl2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                golink ("https://xrpl.services/?issuer=rfXMq3BMX2dTzJtG4pnhr49u6sHkVQXpWL&currency=58524D696E650000000000000000000000000000&limit=10000000000");
            }
        });

        btn_tkn_blank_wp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                golink ("https://xrmine.io/whitepaper");
                new CountDownTimer(10000, 10){
                    public void onTick(long millisUntilFinished) {
                    }

                    @Override
                    public void onFinish(){
                        btn_tkn_blank_tl3.setEnabled(true);
                    }

                }.start();
            }
        });

        btn_tkn_blank_tl3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                golink ("https://xrpl.services/?issuer=rfXMq3BMX2dTzJtG4pnhr49u6sHkVQXpWL&currency=58524D696E650000000000000000000000000000&limit=10000000000");
            }
        });

        btn_tkn_blank_wp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                golink ("https://xrmine.io/whitepaper");
                new CountDownTimer(10000, 10){
                    public void onTick(long millisUntilFinished) {
                    }

                    @Override
                    public void onFinish(){
                        btn_tkn_mine_tl.setEnabled(true);
                    }

                }.start();
            }
        });

        btn_tkn_blank_tl4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                golink ("https://xrpl.services/?issuer=rfXMq3BMX2dTzJtG4pnhr49u6sHkVQXpWL&currency=58524D696E650000000000000000000000000000&limit=10000000000");
            }
        });


    }

    private void golink(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}