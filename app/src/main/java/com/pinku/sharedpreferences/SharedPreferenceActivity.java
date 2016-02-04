package com.pinku.sharedpreferences;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
//stored data from shared preference
public class SharedPreferenceActivity extends Activity implements View.OnClickListener {
    EditText un,ps;
    Button sb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preference);

        un = (EditText)findViewById(R.id.username);
        ps = (EditText)findViewById(R.id.pass);
        sb = (Button)findViewById(R.id.save);
        sb.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        SharedPreferences sp = getSharedPreferences("prefs", 0);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("entername", un.getText().toString());
        editor.putString("pass", ps.getText().toString());

        editor.commit();

        Intent i = new Intent(SharedPreferenceActivity.this,DisplayActivity.class);
        startActivity(i);
    }
}