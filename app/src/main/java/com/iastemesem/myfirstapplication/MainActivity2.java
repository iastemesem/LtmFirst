package com.iastemesem.myfirstapplication;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;



/**
 * Created by Gianfranco on 15/02/2017.
 */

public class MainActivity2 extends Activity implements View.OnClickListener {

    RecyclerView businessCardsRV;
    LinearLayoutManager layoutManager;
    BusinessCardAdapter adapter;
    private static final String ELIS_ADDRESS = "via Sandro Sandri 71";
    private static final String LTM_COURSE = "LTM 11";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        businessCardsRV = (RecyclerView) findViewById(R.id.business_cards_rv);
        layoutManager = new LinearLayoutManager(this);
        adapter = new BusinessCardAdapter();
        businessCardsRV.setLayoutManager(layoutManager);
        businessCardsRV.setAdapter(adapter);
    }
    @Override
    protected void onStart() {
        super.onStart();
        adapter.setDataSet(getBusinessCards());
    }

    private ArrayList<BusinessCard> getBusinessCards() {
        ArrayList<BusinessCard> businessCards = new ArrayList<>();
        BusinessCard francescoBC = new BusinessCard("Francesco Cipolla", "francescocpll@gmail.com", "333281213", LTM_COURSE, ELIS_ADDRESS);
        BusinessCard matteoBC = new BusinessCard("Matteo Manfreda", "manfredamatteo44@gmail.com", "348974379", LTM_COURSE, ELIS_ADDRESS);
        BusinessCard micheleBC = new BusinessCard("Michele Foderaro", "michele.foderaro@virgilio.it", "3891379123", LTM_COURSE, ELIS_ADDRESS);
        BusinessCard domenicoBC = new BusinessCard("Domenico Licciardi", "licciardi.domenico98@gmail.com", "333281213", LTM_COURSE, ELIS_ADDRESS);
        BusinessCard gaetanoBC = new BusinessCard("Gaetano Ciccone", "gaetano.ciccone97@gmail.com", "333281213", LTM_COURSE, ELIS_ADDRESS);

        businessCards.add(francescoBC);
        businessCards.add(matteoBC);
        businessCards.add(micheleBC);
        businessCards.add(domenicoBC);
        businessCards.add(gaetanoBC);

        return businessCards;


    }

    @Override
    public void onClick(View v) {

    }
}
