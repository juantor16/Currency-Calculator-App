package com.example.juantorres.currencycalculator;

import android.os.Bundle;
import android.renderscript.Sampler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * Created by Juan Torres on 2/6/2015.
 */
public class PesosToDollars extends CurrencySelect{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pesostodollars);}

    @Override
    protected void onStart()
    {
        final double officialPesoValue = 8.50;
        final double bluePesoValue = 13.50;

        super.onStart();

        Button btndone = (Button)findViewById(R.id.btndone);



        btndone.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {

                        //blue pesos
                        EditText value = (EditText) findViewById(R.id.txtusrinput);
                        TextView total = (TextView) findViewById(R.id.txtbluetotal);
                        double i = Integer.parseInt(value.getText().toString());
                        double totalBlue = (i/bluePesoValue);
                        double finalvalue = Math.round( totalBlue * 100.0 ) / 100.0;
                        total.setText(""+finalvalue);


                        //official pesos
                        EditText value1 = (EditText) findViewById(R.id.txtusrinput);
                        TextView total1 = (TextView) findViewById(R.id.txtofficialtotal);
                        double e = Integer.parseInt(value1.getText().toString());
                        double totalofficial = (e/officialPesoValue);
                        double finalvalue2 = Math.round( totalofficial * 100.0 ) / 100.0;
                        total1.setText(""+ finalvalue2);
                    }
                }
        );
    }




}
