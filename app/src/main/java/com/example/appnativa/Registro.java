package com.example.appnativa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Registro extends AppCompatActivity {

    private TextView tv1;
    private TextView tv2;
    private TextView tv3;
    private TextView tv4;
    private TextView tv5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        tv1 =(TextView)findViewById(R.id.tv1);
        tv2 =(TextView)findViewById(R.id.tv2);
        tv3 =(TextView)findViewById(R.id.tv3);
        tv4 =(TextView)findViewById(R.id.tv4);
        tv5 = (TextView)findViewById(R.id.tv5);

        String nombre = getIntent().getStringExtra("nombre");
        tv1.setText(nombre);
        String telefono = getIntent().getStringExtra("telefono");
        tv2.setText(telefono);
        String carrera = getIntent().getStringExtra("carrera");
        tv3.setText(carrera);
        String direccion = getIntent().getStringExtra("direccion");
        tv4.setText(direccion);
        String checkedChosen = getIntent().getStringExtra("checkedChosen");
        tv5.setText(checkedChosen);

    }

    public void salir(View view){
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}