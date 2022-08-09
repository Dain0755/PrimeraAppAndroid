package com.ClaseLayOuts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText lado1, lado2, lado3;
    RadioButton triangulo, cuadrado;
    TextView resultado;
    Button calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lado1 = findViewById(R.id.lado1);
        lado2 = findViewById(R.id.lado2);
        lado3 = findViewById(R.id.lado3);
        triangulo = findViewById(R.id.triangulo);
        cuadrado = findViewById(R.id.cuadrado);
        resultado = findViewById(R.id.resultado);
        calcular  = findViewById(R.id.calcular);
    }

    public void calcular(View view) {

            if (!lado1.getText().toString().isEmpty() && !lado2.getText().toString().isEmpty() && !lado3.getText().toString().isEmpty()){
                float ladoUno = Float.parseFloat(lado1.getText().toString());
                float ladoDos = Float.parseFloat(lado2.getText().toString());
                float ladoTres = Float.parseFloat(lado3.getText().toString());


                if (triangulo.isChecked() && !cuadrado.isChecked()){

                    String area = String.valueOf(ladoUno*ladoDos/2);
                    resultado.setText(area);
                }else if (cuadrado.isChecked ()){

                    String area = String.valueOf(ladoUno*ladoDos);
                    resultado.setText(area);
                }

            }
    }

    public void isCheckedCuadrado(View view) {
        triangulo.setChecked(false);
    }

    public void isCheckedTriangulo(View view) {
        cuadrado.setChecked(false);
    }
}