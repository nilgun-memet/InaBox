package com.example.android.inabox;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText emailAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView facebook_button = (ImageView) findViewById(R.id.facebook);

        facebook_button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.facebook.com/InaBox.ro/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        ImageView instagram_button = (ImageView) findViewById(R.id.instagram);

        instagram_button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.instagram.com/inabox.ro/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        ImageView pinterest_button = (ImageView) findViewById(R.id.pinterest);

        pinterest_button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Uri uri = Uri.parse("https://ro.pinterest.com/inabox_ro/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        emailAddress = (EditText) findViewById(R.id.emailAddress);

    }

    public void onJoinButtonPressed(View view) {
        String emailStr = emailAddress.getText().toString();
        if (TextUtils.isEmpty(emailStr)) {
            Toast.makeText(this, "You didn't enter any email address", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Thank you for subscribing", Toast.LENGTH_SHORT).show();
        }

    }
}

