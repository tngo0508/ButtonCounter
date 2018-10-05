package edu.fullerton.cpsc411.buttoncounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Integer i = 0;
    TextView tv;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        TextView tv = findViewById(R.id.textViewCount);
//        tv.setText(R.string.message);
        tv = findViewById((R.id.textViewCount));
        tv.setText((i.toString()));
        tv.setOnClickListener(this);

        tv.setOnClickListener(this);

        b = findViewById(R.id.buttonIncrement);
        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == tv) {
            i = 0;
        } else if (v == b){
            i++;
        }
        tv.setText(i.toString());
    }
}
