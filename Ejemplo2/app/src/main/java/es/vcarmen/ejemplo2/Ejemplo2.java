package es.vcarmen.ejemplo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;


public class Ejemplo2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo2);
        TextView texto= (TextView) findViewById(R.id.texto1);
        texto.setText("ANIMACIÓN ROTACIÓN");

        TextView ejemplo= (TextView) findViewById(R.id.texto);
        ejemplo.setText("TEXTO GIRANDO");

        Animation td = AnimationUtils.loadAnimation(this,R.anim.rotation);

        td.setRepeatMode(Animation.RESTART);
        td.setRepeatCount(20);
        ejemplo.startAnimation(td);
    }
}
