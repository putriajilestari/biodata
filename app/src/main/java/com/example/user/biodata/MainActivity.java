package com.example.user.biodata;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calling (View view){
        Uri uri = Uri.parse("tel:085212904972");
        Intent it = new Intent (Intent.ACTION_VIEW, uri);
        startActivity(it);
    }

    public void showMaps (View view){
        Uri uri = Uri.parse("geo:-6.974655, 110.408179");
        Intent it = new Intent (android.content.Intent.ACTION_VIEW, uri);
        startActivity(it);
    }

    public void email (View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] {"putriajil57@gmail.com"});
        intent.putExtra(Intent.EXTRA_SUBJECT, "Email dari Aplikasi Android Studio");

        try {
            startActivity(Intent.createChooser(intent, "Ingin Mengirim Email?"));
        } catch (android.content.ActivityNotFoundException ex) {

        }
    }
}
