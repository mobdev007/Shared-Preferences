package com.pinku.sharedpreferences;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by mine on 2/3/2016.
 */
//Retrieve data from shared preference
public class DisplayActivity extends Activity{
    TextView display,dis;
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_activity);

        display=(TextView)findViewById(R.id.display);
        dis=(TextView)findViewById(R.id.pw);

        SharedPreferences sp = getSharedPreferences("prefs",0);
        String name = sp.getString("entername","no name found");
        String pass = sp.getString("pass","password incorrect");

        display.setText(name);
        dis.setText(pass);

    }
}
