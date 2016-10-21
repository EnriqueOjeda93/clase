package es.vcarmen.ejemplo3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;


public class Ejemplo3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo3);

        TextView tv1= (TextView) findViewById(R.id.texto1);
        tv1.setText("DILATACIONES");

        TextView ejemplo= (TextView) findViewById(R.id.texto);
        ejemplo.setText("AMPLIANDO");

        Animation td = AnimationUtils.loadAnimation(this,R.anim.dilatacion);

        td.setRepeatMode(Animation.RESTART);
        td.setRepeatCount(20);
        ejemplo.startAnimation(td);

    }
}
