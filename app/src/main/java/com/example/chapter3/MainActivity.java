package com.example.chapter3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    double costPerTicket=79.99;
    int numberOfTickets;
    double totalCost;
    String groupChoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText Tickets = (EditText)findViewById(R.id.editTextTextPersonName);
        final Spinner group = (Spinner)findViewById(R.id.spinner);

        Button btnGo = (Button)findViewById(R.id.button);
        btnGo.setOnClickListener(new View.OnClickListener() {
            final TextView result = (TextView)findViewById(R.id.txtResult);
            @Override
            public void onClick(View view) {
                DecimalFormat currency = new DecimalFormat("$###,###.##");
                numberOfTickets = Integer.parseInt(Tickets.getText().toString());
                totalCost = costPerTicket * numberOfTickets;
                groupChoice = group.getSelectedItem().toString();
                result.setText("Cost for " + groupChoice + " is " + currency.format(totalCost));


            }
        });
    }
}