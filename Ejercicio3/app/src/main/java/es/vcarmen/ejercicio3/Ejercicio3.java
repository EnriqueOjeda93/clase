package es.vcarmen.ejercicio3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Ejercicio3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio3);
        TextView mitexto= (TextView) findViewById(R.id.mitexto);
        mitexto.setText("TEXTO DESDE JAVA");

    }
}
