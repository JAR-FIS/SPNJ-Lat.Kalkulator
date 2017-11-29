package com.example.aral.cobakalkulator;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class launcher extends AppCompatActivity implements OnClickListener {

    Button start;
    EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
    }

    public void calculate(View v) {
        Intent intent = new Intent(launcher.this, MainActivity.class);
        startActivity(intent);
    }

    public void mulai(View v) {
        input = (EditText) findViewById(R.id.input);
//        start = (Button) findViewById(R.id.start);
        if (input.getText().toString().length() == 0) {
            input.setError("Text not null");

        } else {
            AlertDialog.Builder builder = new AlertDialog.Builder(v.getContext());
//            AlertDialog alertDialog = new AlertDialog.Builder(launcher.this).create();
            builder.setTitle("Congratulations");
            builder.setMessage("Welcome in the new world");
            builder.show();
            builder.setCancelable(true);

            final AlertDialog closedialog= builder.create();

            closedialog.show();

            final Timer timer2 = new Timer();
            timer2.schedule(new TimerTask() {
                public void run() {
                    closedialog.dismiss();
                    timer2.cancel(); //this will cancel the timer of the system
                }
            }, 10000000); // the timer will count 5 seconds....
            Intent i = new Intent(launcher.this, cover.class);
            startActivity(i);
            Log.d("Cover","Success");
        }
    }

}
