package com.example.juantorres.currencycalculator;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.apache.http.client.HttpClient;


/**
 * Created by Juan Torres on 1/29/2015.
 */
public class DollarsToPesos extends CurrencySelect {
    TextView httpStuff;
    HttpClient client;
    final static String URL ="view-source:http://www.dolar-bluehoy.com/.json";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dollarstopesos);}


        @Override
        protected void onStart ()
        {
            final double dolarventaofficial = 8.66;
            final double dolarventablue = 13.20;

            super.onStart();

            Button btndone = (Button) findViewById(R.id.btndone);


            btndone.setOnClickListener(
                    new Button.OnClickListener() {
                        public void onClick(View v) {
                            EditText myEditText = (EditText) findViewById(R.id.txtusrinput);
                            InputMethodManager imm = (InputMethodManager)getSystemService(
                                    Context.INPUT_METHOD_SERVICE);
                            imm.hideSoftInputFromWindow(myEditText.getWindowToken(), 0);
                            //blue dollar
                            EditText value = (EditText) findViewById(R.id.txtusrinput);
                            TextView total = (TextView) findViewById(R.id.dlrbluesell);
                            double i = Integer.parseInt(value.getText().toString());
                            double totalBlue = (i * dolarventablue);
                            total.setText("$" + totalBlue);
                            //official dollar
                            EditText value1 = (EditText) findViewById(R.id.txtusrinput);
                            TextView total1 = (TextView) findViewById(R.id.txtofficialtotal);
                            double e = Integer.parseInt(value.getText().toString());
                            double totalofficial = (e * dolarventaofficial);
                            total1.setText("$" + totalofficial);
                        }
                    }
            );
        }


    }
