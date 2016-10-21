package es.vcarmen.boton1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class Boton1 extends AppCompatActivity implements OnClickListener{

    TextView mitexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boton1);
        mitexto=(TextView) findViewById(R.id.mitexto);
        mitexto.setText("EJEMPLO DE BOTÓN");

        View boton=findViewById(R.id.miboton);
        boton.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        mitexto.setText("BOTÓN PULSADO");
    }
}


