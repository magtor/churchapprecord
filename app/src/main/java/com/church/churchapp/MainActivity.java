package com.church.churchapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.church.churchapp.uichurch.miembros;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbarmain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbarmain = (Toolbar) findViewById(R.id.toolbar);
        toolbarmain.setTitle("Lenin");
        setSupportActionBar(toolbarmain);

    }

    private void showSnackBar(int pantalla) {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menutoolbar, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id) {
            case R.id.action_settings:

                return true;
            case R.id.action_add:
                llamaragregar();
                return true;
            case R.id.action_search:
                showSnackBar(3);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }


    }
    private void llamaragregar(){

        Intent intentMain = new Intent(MainActivity.this, miembros.class);
        intentMain.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intentMain);

    }



}
