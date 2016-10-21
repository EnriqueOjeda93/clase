package es.vcarmen.boton4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Boton3 extends AppCompatActivity {

    TextView mitexto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boton3);
        mitexto=(TextView) findViewById(R.id.mitexto);
        mitexto.setText("BOTÓN CONTROLADO POR XML");
    }
    public void metodo1 (View view){
        Button boton1 = (Button)findViewById(R.id.miboton1);
        boton1.setText("BOTÓN 1 PULSADO");
    }
    public void metodo2 (View view){
        Button boton2 = (Button)findViewById(R.id.miboton2);
        boton2.setText("BOTÓN 2 PULSADO");
    }
    public void metodo3 (View view){
        Button boton3 = (Button)findViewById(R.id.miboton3);
        boton3.setText("BOTÓN 3 PULSADO");
    }

}

