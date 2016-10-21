package es.vcarmen.ejercicio4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Ejercicio4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio4);
        TextView mitexto= (TextView) findViewById(R.id.mitexto);
        mitexto.setText("NUEVO TEXTO");
        mitexto.append("\n OTRA LINEA 1 CON APPEND");
        mitexto.append("\n OTRA LINEA 2 CON APPEND");
    }
}
