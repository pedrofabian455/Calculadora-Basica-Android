package com.pedro.calculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText val1,val2;
    Button btnSumar, btnRestar, btnDividir, btnMultiplicar;
    TextView resultado;
    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        val1 = findViewById(R.id.primerVal);
        val2 = findViewById(R.id.segundoVal);
        btnSumar = findViewById(R.id.btnSumar);
        btnRestar = findViewById(R.id.btnRestar);
        btnDividir = findViewById(R.id.btnDividir);
        btnMultiplicar = findViewById(R.id.btnMultiplicar);
        resultado = findViewById(R.id.resultado);
    }
    public void sumar(View view){
        String primerVal = val1.getText().toString();
        String segundoVal = val2.getText().toString();
        double v1 = Double.parseDouble(primerVal);
        double v2 = Double.parseDouble(segundoVal);
        resultado.setText(""+(v1+v2));


    }
    public void restar(View view){
        String primerVal = val1.getText().toString();
        String segundoVal = val2.getText().toString();
        double v1 = Double.parseDouble(primerVal);
        double v2 = Double.parseDouble(segundoVal);
        resultado.setText(""+(v1-v2));



    }
    public void dividir(View view) {
        String primerVal = val1.getText().toString();
        String segundoVal = val2.getText().toString();
        double v1 = Double.parseDouble(primerVal);
        double v2 = Double.parseDouble(segundoVal);
        resultado.setText("" + (v1 / v2));
    }
    public void multiplicar(View view) {
        String primerVal = val1.getText().toString();
        String segundoVal = val2.getText().toString();
        double v1 = Double.parseDouble(primerVal);
        double v2 = Double.parseDouble(segundoVal);
        resultado.setText("" + (v1 * v2));
    }
    public void resetear(View view ){
     val1.setText(null);
     val2.setText(null);
     resultado.setText(null);

    }
}
