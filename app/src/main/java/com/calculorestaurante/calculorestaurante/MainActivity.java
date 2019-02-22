package com.calculorestaurante.calculorestaurante;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText campoConta;
    private TextView txtResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoConta = (EditText) findViewById(R.id.valor_conta);
        txtResultado = findViewById(R.id.resultado);
    }

    public void calcTotal(View v) {
        String contaString = campoConta.getText().toString();
        double valorConta = Double.parseDouble(contaString);

        double resultado = valorConta * 1.1;

        String resultadoTxt = getResources().getString(R.string.txt_resultado);

        String msg = resultadoTxt + " " + resultado;
        txtResultado.setText(msg);

    }

}
