package no.woact.stud.smaola14.egentrening02;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.immortaltools.pg4600.egentrening02.R;

public class Oppgave2 extends AppCompatActivity {

    private Layout container;
    private ImageView img;
    private Button btnVisible;
    private Button btnHidden;
    private Button btnRemove;
    private Button btnIncreaseMargin;
    private Button btnDecreaseMargin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oppgave2);


        img = (ImageView) findViewById(R.id.imgView);
        btnVisible = (Button) findViewById(R.id.btnVisible);
        btnHidden = (Button) findViewById(R.id.btnHidden);
        btnRemove = (Button) findViewById(R.id.btnRemove);
        btnIncreaseMargin = (Button) findViewById(R.id.btnIncreaseMargin);
        btnDecreaseMargin = (Button) findViewById(R.id.btnDecreaseMargin);

        btnVisible.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setBtnHighlighted(btnVisible);
                img.setVisibility(View.VISIBLE);
            }
        });

        btnHidden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setBtnHighlighted(btnHidden);
                img.setVisibility(View.INVISIBLE);
            }
        });

        btnRemove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setBtnHighlighted(btnRemove);
                img.setVisibility(View.GONE);
            }
        });

        btnIncreaseMargin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setBtnHighlighted(btnIncreaseMargin);
                RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(img.getLayoutParams());
                lp.setMargins(lp.leftMargin + 10, lp.rightMargin + 10, 0, 0);
                img.setLayoutParams(lp);
            }
        });

        btnDecreaseMargin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setBtnHighlighted(btnDecreaseMargin);
                RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(img.getLayoutParams());
                lp.setMargins(lp.leftMargin - 10, lp.rightMargin - 10, 0, 0);
                img.setLayoutParams(lp);
            }
        });
    }

    private void setBtnHighlighted (Button btn) {
        btnVisible.setBackgroundColor(Color.LTGRAY);
        btnHidden.setBackgroundColor(Color.LTGRAY);
        btnRemove.setBackgroundColor(Color.LTGRAY);
        btnIncreaseMargin.setBackgroundColor(Color.LTGRAY);
        btnDecreaseMargin.setBackgroundColor(Color.LTGRAY);
        btn.setBackgroundColor(Color.GREEN);
    }
}
