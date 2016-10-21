package es.vcarmen.ejemplo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;


public class Ejemplo1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo1);
        TextView ejemplo=(TextView)findViewById(R.id.texto);
        Animation td = AnimationUtils.loadAnimation(this,R.anim.movimiento);
        td.setFillAfter(true);
        ejemplo.startAnimation(td);
        ejemplo.append("\n ENRIQUE OJEDA");
    }
}
