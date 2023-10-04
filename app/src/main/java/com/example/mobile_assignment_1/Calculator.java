package com.example.mobile_assignment_1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {

    //intialize the  input and text views
    public EditText principalInput;
    public EditText interestRateInput;
    public EditText amortizationInput;
    public TextView totalPaymentTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);

        // Initialize references to EditText and TextView widgets
        principalInput = findViewById(R.id.editText1);
        interestRateInput = findViewById(R.id.editText2);
        amortizationInput = findViewById(R.id.editTextP);
        totalPaymentTextView = findViewById(R.id.textView5);
    }

    //function below to calculate the mortgage
    public void CalculateMortgage(View view) {
        try {
            //take input from the user
            double principal = Double.parseDouble(principalInput.getText().toString());
            double interestRate = Double.parseDouble(interestRateInput.getText().toString());
            int amortizationPeriod = Integer.parseInt(amortizationInput.getText().toString());
            double monthlyInterestRate = (interestRate / 100) / 12;
            int amortizationPeriodMonths = amortizationPeriod * 12;
            // final equation
            double mortgagePayment = (principal * monthlyInterestRate) /
                    (1 - Math.pow(1 + monthlyInterestRate, -amortizationPeriodMonths));

            String totalPayment = String.format(getString(R.string.total_payment), mortgagePayment);
            totalPaymentTextView.setText(totalPayment);
            }
        catch (NumberFormatException e) {
            totalPaymentTextView.setText("Invalid input");
        }
    }
}
