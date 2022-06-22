package com.example.appnativa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void irPaginaInstitucional(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://umb.edu.co/"));
        startActivity(i);
    }

    public void irBuscador(View view){
        Intent i = new Intent(this, Buscador.class);
        startActivity(i);
    }

    public void irFormulario(View view){
        Intent i = new Intent(this, Formulario.class);
        startActivity(i);
    }
}