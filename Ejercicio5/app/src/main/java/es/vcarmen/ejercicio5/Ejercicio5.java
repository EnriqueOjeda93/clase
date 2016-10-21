package es.vcarmen.ejercicio5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.graphics.Color;

public class Ejercicio5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio5);
        TextView mitexto= (TextView) findViewById(R.id.mitexto);
        mitexto.setTextColor(Color.argb(100,50,0,0));
        mitexto.setText("NUEVO TEXTO/ACTIVIDAD 5");
    }
}
