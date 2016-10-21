package es.vcarmen.boton2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class Boton2 extends AppCompatActivity implements OnClickListener{

    TextView mitexto;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boton2);

        mitexto=(TextView) findViewById(R.id.mitexto);
        mitexto.setText("EJEMPLO 2 BOTONES");

        View boton1=findViewById(R.id.miboton1);
        boton1.setOnClickListener(this);
        View boton2=findViewById(R.id.miboton2);
        boton2.setOnClickListener(this);
    }
    public void onClick(View v) {
        if (v.getId()==R.id.miboton1){
            mitexto.setText("BOTÓN 1 PULSADO");
        }
        else if (v.getId()==R.id.miboton2){
            mitexto.setText("BOTÓN 2 PULSADO");
        }

    }
}
