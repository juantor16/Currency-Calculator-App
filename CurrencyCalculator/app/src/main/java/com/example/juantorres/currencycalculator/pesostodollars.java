package com.example.juantorres.currencycalculator;

import android.content.Intent;
import android.os.Bundle;
import android.renderscript.Sampler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Juan Torres on 1/29/2015.
 */
public class pesostodollars extends calculator {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pesostodollars);}

        @Override
        protected void onStart()
        {
            final double officialDollarValue, blueDollarValue;
            blueDollarValue = 8.50;

            super.onStart();

            Button button = (Button)findViewById(R.id.button3);



            button.setOnClickListener(
                    new Button.OnClickListener() {
                        public void onClick(View v) {

                            EditText value = (EditText) findViewById(R.id.editText);
                            TextView total = (TextView) findViewById(R.id.total);
                            double i = Integer.parseInt(value.getText().toString());
                            double totalBlue = (i*blueDollarValue);
                            total.setText(totalBlue+"");
                            //total.setText(i);

                        }
                    }
            );
        }



}
