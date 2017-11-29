package com.example.aral.cobakalkulator;

import android.app.Activity;
import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends Activity {

    TextView showInput;
    TextView showHasil;

    Button btnsatu, btndua, btntiga, btnempat, btnlima, btnenam, btntujuh, btnlapan, btnsilan, btnnol;
    Button btnkurang, btnbagi, btntambah, btnkali, btnreset, btnsamadengan;

    int num1, num2;

    boolean kurang, tambah, bagi, kali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showInput = (TextView) findViewById(R.id.inputan);
        showHasil = (TextView) findViewById(R.id.hasil);

        btnsatu = (Button) findViewById(R.id.satu);
        btndua = (Button) findViewById(R.id.dua);
        btntiga = (Button) findViewById(R.id.tiga);
        btnempat = (Button) findViewById(R.id.empat);
        btnlima = (Button) findViewById(R.id.lima);
        btnenam = (Button) findViewById(R.id.enam);
        btntujuh = (Button) findViewById(R.id.tujuh);
        btnlapan = (Button) findViewById(R.id.delapan);
        btnsilan = (Button) findViewById(R.id.sembilan);
        btnnol = (Button) findViewById(R.id.nol);

        btnbagi = (Button) findViewById(R.id.bagi);
        btnkali = (Button) findViewById(R.id.kali);
        btntambah = (Button) findViewById(R.id.tambah);
        btnkurang = (Button) findViewById(R.id.kurang);
        btnsamadengan = (Button) findViewById(R.id.samadengan);
        btnreset = (Button) findViewById(R.id.reset);

        btnsatu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showInput.setText(showInput.getText()+ "1");

            }
        });

        btndua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showInput.setText(showInput.getText()+ "2");

            }
        });
        btntiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showInput.setText(showInput.getText()+ "3");

            }
        });
        btnempat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showInput.setText(showInput.getText()+ "4");

            }
        });
        btnlima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showInput.setText(showInput.getText()+ "5");

            }
        });
        btnenam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showInput.setText(showInput.getText()+ "6");

            }
        });
        btntujuh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showInput.setText(showInput.getText()+ "7");

            }
        });
        btnlapan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showInput.setText(showInput.getText()+ "8");

            }
        });
        btnsilan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showInput.setText(showInput.getText()+ "9");

            }
        });
        btnnol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showInput.setText(showInput.getText()+ "0");

            }
        });

        btntambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (showInput == null  ){
                    showInput.setText(showInput.getText()+"+");
                }
                else {
                    num1 = Integer.parseInt(showInput.getText() + "");
                    tambah = true;
                    showInput.setText(null);
                }
            }
        });

        btnkurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    num1 = Integer.parseInt(showInput.getText() + "");
                    kurang = true;
                    showInput.setText(null);
            }
        });

        btnbagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(showInput.getText() + "");
                bagi = true;
                showInput.setText(null);
            }
        });

        btnkali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(showInput.getText() + "");
                kali = true;
                showInput.setText(null);
            }
        });

        btnsamadengan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num2 = Integer.parseInt(showInput.getText() + "");

                if (tambah == true){
                    showHasil.setText( num1 + num2 + "");
                    tambah = false;
                }
                if (kurang == true){
                    showHasil.setText( num1 - num2 + "");
                    kurang = false;
                }
                if (bagi == true) {
                    showHasil.setText( num1 / num2 + "");
                    bagi = false;
                }
                if (kali == true) {
                    showHasil.setText( num1 * num2 +"");
                    kali = false;
                }
            }
        });

        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showInput.setText(showInput.getText()+"0");
                showHasil.setText("");
            }
        });



    }
}
