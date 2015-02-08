package com.example.juantorres.currencycalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Juan Torres on 1/29/2015.
 */
public class DollarsToPesos extends CurrencySelect {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dollarstopesos);}

        @Override
        protected void onStart()
        {
            final double officialDollarValue = 8.50;
            final double blueDollarValue = 13.50;

            super.onStart();

            Button btndone = (Button)findViewById(R.id.btndone);



            btndone.setOnClickListener(
                    new Button.OnClickListener() {
                        public void onClick(View v) {
                            //blue dollar
                            EditText value = (EditText) findViewById(R.id.txtusrinput);
                            TextView total = (TextView) findViewById(R.id.txtbluetotal);
                            double i = Integer.parseInt(value.getText().toString());
                            double totalBlue = (i*blueDollarValue);
                            total.setText(""+totalBlue);
                            //official dollar
                            EditText value1 = (EditText) findViewById(R.id.txtusrinput);
                            TextView total1 = (TextView) findViewById(R.id.txtofficialtotal);
                            double e = Integer.parseInt(value.getText().toString());
                            double totalofficial = (i*officialDollarValue);
                            total1.setText(""+totalofficial);
                        }
                    }
            );
        }



}
