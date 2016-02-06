package no.woact.stud.smaola14.egentrening02;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.immortaltools.pg4600.egentrening02.R;

public class oppgave3_vis extends AppCompatActivity {

    TextView txtPhoneNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oppgave3_vis);

        txtPhoneNumber = (TextView) findViewById(R.id.txtPhonenNumber);
        String phoneNumber = getIntent().getStringExtra("PhoneNumber");
        txtPhoneNumber.setText(phoneNumber);
    }

}
