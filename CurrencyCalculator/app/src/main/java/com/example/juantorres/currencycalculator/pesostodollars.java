package com.example.juantorres.currencycalculator;

import android.content.Context;
import android.os.Bundle;
import android.renderscript.Sampler;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
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
        setContentView(R.layout.pesostodollars);
    }

    @Override
    protected void onStart()
    {

        final double dolarcompraofficial = 8.56;
        final double dolarcomprablue=13.00;



        super.onStart();

        Button btndone = (Button)findViewById(R.id.btndone);



        btndone.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        EditText myEditText = (EditText) findViewById(R.id.txtusrinput);
                        InputMethodManager imm = (InputMethodManager)getSystemService(
                                Context.INPUT_METHOD_SERVICE);
                        imm.hideSoftInputFromWindow(myEditText.getWindowToken(), 0);

                        //Blue dollar buy
                        EditText value2 = (EditText) findViewById(R.id.txtusrinput);
                        TextView total2 = (TextView) findViewById(R.id.dlarbluebuy);
                        double u = Integer.parseInt(value2.getText().toString());
                        double totaldollaroffbuy = (u/dolarcompraofficial);
                        double finaldollaroffbuy = Math.round( totaldollaroffbuy * 100.0 ) / 100.0;
                        total2.setText("$"+finaldollaroffbuy);


                        //Official dollar buy
                        EditText value = (EditText) findViewById(R.id.txtusrinput);
                        TextView total = (TextView) findViewById(R.id.dlroffbuy);
                        double i = Integer.parseInt(value.getText().toString());
                        double totaldollarbuyblue = (i/dolarcomprablue);
                        double finaldollarbuyblue = Math.round( totaldollarbuyblue * 100.0 ) / 100.0;
                        total.setText("$"+finaldollarbuyblue);


                    }
                }
        );
    }




}
