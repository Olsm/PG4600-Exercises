package no.woact.stud.smaola14.egentrening02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.immortaltools.pg4600.egentrening02.R;

public class Oppgave4_Kalkulator extends AppCompatActivity {

    private TextView txtResult;

    private Button btnZero;
    private Button btnOne;
    private Button btnTwo;
    private Button btnThree;
    private Button btnFour;
    private Button btnFive;
    private Button btnSix;
    private Button btnSeven;
    private Button btnEight;
    private Button btnNine;

    private Button btnPlus;
    private Button btnSubtract;
    private Button btnDivide;
    private Button btnMultiply;

    private Button btnDecimal;
    private Button btnReset;
    private Button btnSum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oppgave4_kalkulator);

        getButtonObjects();
        addOnClickListeners();
    }

    private void getButtonObjects() {
        txtResult = (TextView) findViewById(R.id.txtResult);

        btnZero = (Button) findViewById(R.id.btnZero);
        btnOne = (Button) findViewById(R.id.btnOne);
        btnTwo = (Button) findViewById(R.id.btnTwo);
        btnThree = (Button) findViewById(R.id.btnThree);
        btnFour = (Button) findViewById(R.id.btnFour);
        btnFive = (Button) findViewById(R.id.btnFive);
        btnSix = (Button) findViewById(R.id.btnSix);
        btnSeven = (Button) findViewById(R.id.btnSeven);
        btnEight = (Button) findViewById(R.id.btnEight);
        btnNine = (Button) findViewById(R.id.btnNine);

        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnSubtract = (Button) findViewById(R.id.btnSubtract);
        btnDivide = (Button) findViewById(R.id.btnDivide);
        btnMultiply = (Button) findViewById(R.id.btnMultiply);
        btnDecimal = (Button) findViewById(R.id.btnDecimal);
        btnSum = (Button) findViewById(R.id.btnSum);
        btnReset = (Button) findViewById(R.id.btnReset);
    }

    private void addOnClickListeners () {
        addOnClickListener(btnZero, "0");
        addOnClickListener(btnOne, "1");
        addOnClickListener(btnTwo, "2");
        addOnClickListener(btnThree, "3");
        addOnClickListener(btnFour, "4");
        addOnClickListener(btnFive, "5");
        addOnClickListener(btnSix, "6");
        addOnClickListener(btnSeven, "7");
        addOnClickListener(btnEight, "8");
        addOnClickListener(btnNine, "9");

        addOnClickListener(btnPlus, "+");
        addOnClickListener(btnSubtract, "-");
        addOnClickListener(btnDivide, "/");
        addOnClickListener(btnMultiply, "*");
        addOnClickListener(btnDecimal, ".");
        addOnClickListener(btnSum, "=");

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText("");
            }
        });
    }

    private void addOnClickListener(Button btn, final String symbol) {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (symbol == "=")
                    doCalculation();
                else
                    txtResult.setText(txtResult.getText() + symbol);
            }
        });
    }

    private void doCalculation () {
        String input = txtResult.getText().toString();
        float result = 0;

        String[] parts;
        if (input.contains("*")) {
            parts = input.split("\\*");
            float part1 = Float.parseFloat(parts[0]);
            float part2 = Float.parseFloat(parts[1]);
            result = part1 * part2;
        } else if (input.contains("/")) {
            parts = input.split("/");
            float part1 = Float.parseFloat(parts[0]);
            float part2 = Float.parseFloat(parts[1]);
            result = part1 / part2;
        } else if (input.contains("+")) {
            parts = input.split("\\+");
            float part1 = Float.parseFloat(parts[0]);
            float part2 = Float.parseFloat(parts[1]);
            result = part1 + part2;
        } else if (input.contains("-")) {
            parts = input.split("-");
            float part1 = Float.parseFloat(parts[0]);
            float part2 = Float.parseFloat(parts[1]);
            result = part1 - part2;
        }

        txtResult.setText(result + "");
    }
}
