package com.example.ricardodias.productionone;



/**

 * Created by Pedro Costa on 12/10/2015.

 */



import android.content.Intent;

import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;

import android.widget.Button;

import android.widget.TextView;



public class secondClass extends AppCompatActivity {



    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.secondview);



        //Button next = (Button) findViewById(R.id.button3);

        //next.setOnClickListener(new View.OnClickListener() {

            //@Override

//            public void onClick(View view) {
//
//                Intent myIntent = new Intent(view.getContext(), Qtd.class);
//
//                startActivityForResult(myIntent, 0);
//
//            }
//
//        });





        Bundle extras = getIntent().getExtras();

        if (extras != null) {

            String value = extras.getString("of");

            TextView a = (TextView)  findViewById(R.id.textView6);

            a.setText(value);

        }

    }

}
