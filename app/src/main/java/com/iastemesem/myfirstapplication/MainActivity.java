package com.iastemesem.myfirstapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Gianfranco on 08/02/2017.
 */

public class MainActivity extends Activity implements View.OnClickListener {

    TextView login;
    EditText username;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = (TextView) findViewById(R.id.login_login_btn);
        username = (EditText) findViewById(R.id.login_mail_editText);
        password = (EditText) findViewById(R.id.login_psw_Et);
        login.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.login_login_btn){
            Toast.makeText(MainActivity.this,"Logged successfully",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(MainActivity.this,MainActivity2.class);
            intent.putExtra("email", username.getText().toString());
            startActivity(intent);
            finish();
        }

    }
}
