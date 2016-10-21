package es.vcarmen.ejercicio7;

import android.support.v7.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class Ejercicio7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio7);
        TextView ejemplo=(TextView)findViewById(R.id.texto);
      /*  Animation td = AnimationUtils.loadAnimation(this,R.anim.movimiento);
        td.setFillAfter(true);
        ejemplo.startAnimation(td);*/
        ejemplo.append("\n TEXTO MOVIENDOSE");

    }
    public void imprime (LinearLayout ll, String texto, int tamaño, int
            rojo, int verde, int azul){
        TextView ejemplo=new TextView (this);
        ejemplo.setTextColor(Color.argb(255, rojo, verde, azul));
        ejemplo.setTextSize(tamaño);
        ejemplo.setText(texto);
        ll.addView(ejemplo);
    }
}

