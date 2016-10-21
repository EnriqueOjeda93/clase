package es.vcarmen.boton3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Boton3 extends AppCompatActivity implements OnClickListener{

    TextView mitexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boton3);

        mitexto=(TextView) findViewById(R.id.mitexto);
        mitexto.setText("BOTÓN CAMBIANTE");

        View boton1=findViewById(R.id.miboton1);
        boton1.setOnClickListener(this);
        View boton2=findViewById(R.id.miboton2);
        boton2.setOnClickListener(this);
        View boton3=findViewById(R.id.miboton3);
        boton3.setOnClickListener(this);
    }

    int p1=0;
    int p2=0;
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.miboton1:
                p1=p1+1;
                ((TextView)v).setText("PULSADO "+p1+" VECES");
                mitexto.setText("SUMANDO BOTON 1");
                break;
            case R.id.miboton2:
                p2=p2+1;
                ((TextView)v).setText("PULSADO "+p2+" VECES");
                mitexto.setText("SUMANDO BOTON 2");
                break;
            case R.id.miboton3:
                p2=p2+1;
                ((TextView)v).setText("RESETEAR TITULO Y BOTONES");
                mitexto.setText("BOTÓN CAMBIANTE");

                break;
        }
    }


}
