package com.exemplo.exemplomenu;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Insere o menu, e adiciona os itens na barra de ação se ela estiver presente.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Manipula com os cliques do item da barra de ação. A barra de ação irá
        // manipular automaticamente com cliques no botão Home/Up, por muito tempo
        // conforme você especifica uma atividade pai em AndroidManifest.xml.
        int id = item.getItemId();

        if (id == R.id.action_sobre) {
            // Abre uma nova activity. Usa um intent pra isso.
            startActivity(new Intent(MainActivity.this, AboutActivity.class));
        } else if (id == R.id.action_sair) {
            finish();
        }

        if (id == R.id.action_sair) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}