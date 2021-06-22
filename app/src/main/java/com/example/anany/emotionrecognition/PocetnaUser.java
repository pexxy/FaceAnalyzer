package com.example.anany.emotionrecognition;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PocetnaUser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pocetna_user);

    }

    public void pocniIspitivanje(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }


    public void showProfil(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View pogled = getLayoutInflater().inflate(R.layout.dialog_show_profile, null);
        TextView ime = pogled.findViewById(R.id.textView17);
        TextView korisnicko = pogled.findViewById(R.id.textView16);
        /*
        POSTAVI IME I KORISNICKO IZ BAZE
         */
        builder.setView(pogled);

        AlertDialog dialog = builder.create();

        dialog.show();

    }

    public void showInfo(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View uputstvo = getLayoutInflater().inflate(R.layout.uputstvo,null);
        TextView u = uputstvo.findViewById(R.id.textView14);
        builder.setView(uputstvo);
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}