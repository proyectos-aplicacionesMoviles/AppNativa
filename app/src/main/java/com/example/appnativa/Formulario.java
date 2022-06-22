package com.example.appnativa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class Formulario extends AppCompatActivity {

    private EditText editText1, editText2, editText3, editText4;
    private CheckBox cb1, cb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
        editText3 = (EditText) findViewById(R.id.editText3);
        editText4 = (EditText) findViewById(R.id.editText4);
        cb1 = (CheckBox) findViewById(R.id.checkBox1);
        cb2 = (CheckBox) findViewById(R.id.checkBox2);
       // registro = (Button) findViewById(R.id.btnRegistrate);
    }

    public void Registrate(View view){

        String str = ""; // variable donde se almacenara el dato del checked

        if(cb1.isChecked() == true){
            str = " 17 a 25 años";
        } else if (cb2.isChecked() == true){
            str = " 26 en adelante";
        }

        Intent i = new Intent(Formulario.this,Registro.class);

        i.putExtra("nombre", editText1.getText().toString());
        i.putExtra("telefono", editText2.getText().toString());
        i.putExtra("carrera", editText3.getText().toString());
        i.putExtra("direccion", editText4.getText().toString());
        i.putExtra("checkedChosen", str);


        startActivity(i);

    }


}