package io.xrmine.xrmine001;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import { XummSdk } from "xumm-sdk"

public class MainActivity extends AppCompatActivity {

    Button btn_signin, btn_website;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn_signin = findViewById(R.id.btn_signin); // this will become the sign in button that sends an xumm request to sign in
        btn_website = findViewById(R.id.btn_website); // a link to our website
        
        // send sign in payload, request xrp balance/connected r address for textview values
        // check users trustlines and search token DB if Y display token balance / mine button
        // if N show whitepaper link btn with set TL btn on a timer to display after whitepaper button clicked
        
        btn_signin.setOnClickListener(new View.OnClickListener() { 
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TrustlineActivity.class));


            }
        });

        btn_website.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                golink("https://www.xrmine.io");
            }
        });

    }

    private void golink(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}
