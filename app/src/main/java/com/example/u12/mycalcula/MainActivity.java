package com.example.u12.mycalcula;

import android.content.SyncStatusObserver;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView Resultado;
    private Button Clean;
    private Button Divide;
    private Button Multiplica;
    private Button Borrar;
    private Button Siete;
    private Button Ocho;
    private Button Nueve;
    private Button Resta;
    private Button Cuatro;
    private Button Cinco;
    private Button Seis;
    private Button Suma;
    private Button Uno;
    private Button Dos;
    private Button Tres;
    private Button Igual;
    private Button Cero;
    private Button Punto;


    double resultado;
    String operador, mostrar , reserva;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resultado=findViewById(R.id.Etiqueta);
        Clean=findViewById(R.id.Clean);
        Divide=findViewById(R.id.Divide);
        Multiplica=findViewById(R.id.Multiplica);
        Borrar=findViewById(R.id.Borrar);
         Siete=findViewById(R.id.Siete);
        Ocho=findViewById(R.id.Ocho);
        Nueve=findViewById(R.id.Nueve);
         Resta=findViewById(R.id.Resta);
        Cuatro=findViewById(R.id.Cuatro);
        Cinco=findViewById(R.id.Cinco);
        Seis=findViewById(R.id.Seis);
        Suma=findViewById(R.id.Suma);
        Uno=findViewById(R.id.Uno);
         Dos=findViewById(R.id.Dos);
        Tres=findViewById(R.id.Tres);
        Igual=findViewById(R.id.Igual);
        Cero=findViewById(R.id.Cero);
        Punto=findViewById(R.id.Punto);


         Cero.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 mostrar = Resultado.getText().toString();
                 mostrar = mostrar + "0";
                 Resultado.setText(mostrar);
             }
         });

        Uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "1";
                Resultado.setText(mostrar);
            }
        });

        Dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "2";
                Resultado.setText(mostrar);
            }
        });

        Tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "3";
                Resultado.setText(mostrar);
            }
        });


        Cuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "4";
                Resultado.setText(mostrar);
            }
        });

        Cinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "5";
                Resultado.setText(mostrar);
            }
        });

        Seis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "6";
                Resultado.setText(mostrar);
            }
        });


        Siete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "7";
                Resultado.setText(mostrar);
            }
        });

        Ocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "8";
                Resultado.setText(mostrar);
            }
        });

        Nueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "9";
                Resultado.setText(mostrar);
            }
        });

        Dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "2";
                Resultado.setText(mostrar);
            }
        });

        Suma.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                reserva = Resultado.getText().toString();
                operador = "+";
                Resultado.setText("");
            }
        });

        Resta.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                reserva = Resultado.getText().toString();
                operador = "-";
                Resultado.setText("");
            }
        });

        Multiplica.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                reserva = Resultado.getText().toString();
                operador = "*";
                Resultado.setText("");
            }
        });

        Divide.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                reserva = Resultado.getText().toString();
                operador = "/";
                Resultado.setText("");
            }
        });

        Punto.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + ".";
                Resultado.setText(mostrar);
            }
        });

        Clean.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = "";
                Resultado.setText(mostrar);
                reserva = "";
                operador = "";
            }
        });

        Borrar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = Resultado.getText().toString();

                if(mostrar.length()>0){
                    mostrar = mostrar.substring(0,mostrar.length()-1);
                    Resultado.setText(mostrar);
                }



            }
        });

        Igual.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = Resultado.getText().toString();

                if(mostrar.length()>0) {
                    mostrar = mostrar + "1";
                    if (operador.equals("-")) {
                        resultado = Double.parseDouble(reserva) - Double.parseDouble(Resultado.getText().toString());
                        Resultado.setText(String.valueOf(resultado));
                    }
                    if (operador.equals("+")) {
                        resultado = Double.parseDouble(reserva) + Double.parseDouble(Resultado.getText().toString());
                        Resultado.setText(String.valueOf(resultado));
                    }
                    if (operador.equals("/")) {
                        resultado = Double.parseDouble(reserva) / Double.parseDouble(Resultado.getText().toString());
                        Resultado.setText(String.valueOf(resultado));
                    }
                    if (operador.equals("*")) {
                        resultado = Double.parseDouble(reserva) * Double.parseDouble(Resultado.getText().toString());
                        Resultado.setText(String.valueOf(resultado));
                    }
                }
            }
        });
    }




}
