package com.amberzile.magnusfernandes.virtualwaiter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;

public class Settings extends AppCompatActivity {

    private Toolbar toolbar;
    private final String TOOLBAR_TITLE = "Settings";
    private Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(TOOLBAR_TITLE);
    }

    public void getItem(View v){
        i = new Intent(Settings.this, EditItems.class);
        startActivity(i);
    }
    public void getCategories(View v){
        i = new Intent(Settings.this, EditCategories.class);
        startActivity(i);
    }
}
