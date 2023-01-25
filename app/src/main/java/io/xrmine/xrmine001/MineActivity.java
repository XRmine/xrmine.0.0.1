package io.xrmine.xrmine001;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;

public class MineActivity extends AppCompatActivity {

    Button btn_tkn_social_mine, btn_tkn_web_mine, btn_tkn_stats_mine, btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mine);

        btn_tkn_social_mine=findViewById(R.id.btn_tkn_social_mine);
        btn_tkn_web_mine=findViewById(R.id.btn_tkn_web_mine);
        btn_tkn_stats_mine=findViewById(R.id.btn_tkn_stats_mine);
        btn_back=findViewById(R.id.btn_back);

        btn_tkn_social_mine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                golink("https://twitter.com/XRmine_info");
                btn_tkn_social_mine.setText("+0%");
                btn_tkn_social_mine.setClickable(false);

                new CountDownTimer(86400000, 10){
                    public void onTick(long millisUntilFinished) {
                    }

                    @Override
                    public void onFinish(){
                        btn_tkn_social_mine.setClickable(true);
                    }

                }.start();


            }
        });

        btn_tkn_web_mine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                golink("https://xrmine.io/");
                btn_tkn_web_mine.setText("+0%");
                btn_tkn_web_mine.setClickable(false);

                new CountDownTimer(86400000, 10){
                    public void onTick(long millisUntilFinished) {
                    }

                    @Override
                    public void onFinish(){
                        btn_tkn_web_mine.setClickable(true);
                    }

                }.start();



            }
        });

        btn_tkn_stats_mine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                golink("https://xrpl.win/token/XRMine/rfXMq3BMX2dTzJtG4pnhr49u6sHkVQXpWL");
                btn_tkn_stats_mine.setText("+0%");
                btn_tkn_stats_mine.setClickable(false);

                new CountDownTimer(86400000, 10){
                    public void onTick(long millisUntilFinished) {
                    }

                    @Override
                    public void onFinish(){
                        btn_tkn_stats_mine.setClickable(true);
                    }

                }.start();
            }
        });

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MineActivity.this, TrustlineActivity.class));
            }
        });

    }

    private void golink(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
    }