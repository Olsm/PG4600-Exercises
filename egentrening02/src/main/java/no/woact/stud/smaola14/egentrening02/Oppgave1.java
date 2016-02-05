package no.woact.stud.smaola14.egentrening02;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.immortaltools.pg4600.egentrening02.R;

public class Oppgave1 extends AppCompatActivity {

    private Button btnSearch;
    private EditText txtInput;
    private TextView txtView;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oppgave1);
        context = this;
        txtInput = (EditText) findViewById(R.id.txtInput);
        btnSearch = (Button) findViewById(R.id.btnSearch);
        txtView = (TextView) findViewById(R.id.txtView);

        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Editable text = txtInput.getText();
                txtView.setText(text);
                txtInput.setText("");
            }
        });
    }
}
