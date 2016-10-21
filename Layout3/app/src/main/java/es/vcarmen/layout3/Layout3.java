package es.vcarmen.layout3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

public class Layout3 extends AppCompatActivity {

    private TextView text1;
    private TextView text2;
    private FrameLayout frame;
    private View boton = findViewById(R.id.miboton1);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout3);
        frame = (FrameLayout) findViewById(R.id.framelayout);
        text1 = (TextView) findViewById(R.id.texto1);
        text2 = (TextView) findViewById(R.id.texto2);
        text1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.setVisibility(View.GONE);
                text2.setVisibility(View.VISIBLE);}
        });

       // boton.setOnClickListener();

    }
}
