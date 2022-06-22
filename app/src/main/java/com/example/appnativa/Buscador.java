package com.example.appnativa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class Buscador extends AppCompatActivity {

    private EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscador);

        et1 =(EditText)findViewById(R.id.txt_web);
    }

    public void NavegarPaginas(View view){
        Intent i = new Intent(this, webView1.class);
        i.putExtra("paginaWeb", et1.getText().toString());
        startActivity(i);
    }

}