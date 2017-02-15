package com.iastemesem.myfirstapplication;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Gianfranco on 10/02/2017.
 */

public class RubricaActivity extends Activity implements View.OnClickListener{

    Button call;
    Button go;
    Button send;
    TextView numero;
    TextView posizione;
    private TextView emailTE;
    Intent intent;
    String email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rubrica);
        emailTE = (TextView) findViewById(R.id.rubrica_email_tv);

        intent = getIntent();
        email = intent.getStringExtra("email");
        if (!email.equals("")) {
            emailTE.setText(email);
        }
        call = (Button) findViewById(R.id.rubrica_call_btn);
        call.setOnClickListener(this);

        go = (Button) findViewById(R.id.rubrica_go_btn);
        go.setOnClickListener(this);

        send = (Button) findViewById(R.id.rubrica_send_btn);
        send.setOnClickListener(this);

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
        }else {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_SEND);
            intent.putExtra(intent.EXTRA_EMAIL, email);
            intent.putExtra(intent.EXTRA_SUBJECT, "Cortesia");
            intent.putExtra(intent.EXTRA_TEXT, "SCIAOO BELLOOO");
            intent.setType("text/plain");
            startActivity(intent);
        }
    }
}