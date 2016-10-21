package es.vcarmen.ejemplo4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class Ejemplo4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo4);

        TextView tv1= (TextView) findViewById(R.id.texto1);
        tv1.setText("ANIMACIONES EN SERIE");

        TextView ejemplo= (TextView) findViewById(R.id.texto2);
        ejemplo.setText("TEXTO ANIMADO");

        Animation td = AnimationUtils.loadAnimation(this,R.anim.conjunto);
        td.setFillAfter(true);
        td.setRepeatMode(Animation.RESTART);
        td.setRepeatCount(20);
        ejemplo.startAnimation(td);

    }
}
