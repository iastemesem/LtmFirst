package com.iastemesem.myfirstapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Gianfranco on 08/02/2017.
 */

public class MainActivity extends Activity implements View.OnClickListener {

    Button login;
    EditText username;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        login = (Button)findViewById(R.id.register_login_btn);
        username = (EditText) findViewById(R.id.register_email_et);
        password = (EditText) findViewById(R.id.register_psw_et);

        login.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.register_login_btn){
            Toast.makeText(MainActivity.this,"Logged successfully",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(MainActivity.this,RubricaActivity.class);
            startActivity(intent);
            finish();
        }

    }
}
