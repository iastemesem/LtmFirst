package com.iastemesem.myfirstapplication;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Gianfranco on 10/02/2017.
 */

public class RubricaActivity extends Activity implements View.OnClickListener{

    Button call;
    Button go;
    TextView numero;
    TextView posizione;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rubrica);
        call = (Button) findViewById(R.id.rubrica_call_btn);
        call.setOnClickListener(this);
        go = (Button) findViewById(R.id.rubrica_go_btn);
        go.setOnClickListener(this);
        numero = (TextView) findViewById(R.id.rubrica_numero_tv);
        posizione = (TextView) findViewById(R.id.rubrica_position_tv);

    }

    @Override
    public void onClick(View v) {
        if (v.getId()== R.id.rubrica_call_btn){
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            Uri uri = Uri.parse("tel:" + numero.getText());
            intent.setData(uri);
            startActivity(intent);
        } else if (v.getId() == R.id.rubrica_go_btn){
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            Uri uri = Uri.parse("geo:0,0?q="+posizione.getText());
            intent.setData(uri);
            startActivity(intent);
        }
    }
}