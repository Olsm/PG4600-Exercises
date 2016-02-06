package no.woact.stud.smaola14.egentrening02;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.immortaltools.pg4600.egentrening02.R;

public class Oppgave3 extends AppCompatActivity {

    private EditText txtPhone;
    private Button btnCall;
    private Button btnShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oppgave3);

        txtPhone = (EditText) findViewById(R.id.txtPhone);
        btnCall = (Button) findViewById(R.id.btnCall);
        btnShow = (Button) findViewById(R.id.btnShow);

        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + getPhoneNumber()));
                startActivity(intent);
            }
        });

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Oppgave3.this, oppgave3_vis.class);
                intent.putExtra("PhoneNumber", getPhoneNumber());
                startActivity(intent);
            }
        });
    }

    private String getPhoneNumber () {
        return txtPhone.getText().toString();
    }
}
