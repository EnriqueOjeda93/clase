package es.vcarmen.ejemplo5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.*;
import android.widget.TextView;

public class Ejemplo5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo5);

        TextView tv1= (TextView) findViewById(R.id.texto1);
        tv1.setText("ANIMACIÓN EN JAVA");

        TextView tv= (TextView) findViewById(R.id.texto2);
        tv.setText("SERIE EN JAVA");

        AnimationSet animacion = new AnimationSet(true);
        // APARICIÓN
        AlphaAnimation aparicion = new AlphaAnimation(0,1);
        aparicion.setDuration(3000);
        // ESCALADO
        int rs=ScaleAnimation.RELATIVE_TO_SELF;
        ScaleAnimation escala= new ScaleAnimation(1,2,1,5,rs,0.5f,rs,0.5f);
        escala.setDuration(3000);
        escala.setStartOffset(3000);
        // ROTACIÓN
        rs=RotateAnimation.RELATIVE_TO_SELF;
        RotateAnimation rotacion = new RotateAnimation(0,45,rs,0.5f,rs,0.5f);
        rotacion.setDuration(3000);
        rotacion.setStartOffset(6000);
        // TRANSLACCIÓN
        int rp=TranslateAnimation.RELATIVE_TO_PARENT;
        TranslateAnimation traslacion = new TranslateAnimation(rp,0f,rp,0f,rp,0f,rp,0.25f);
        traslacion.setDuration(3000);
        traslacion.setStartOffset(9000);

        // AGRUPACIÓN DE LAS ANIMACIONES
        animacion.addAnimation(aparicion);
        animacion.addAnimation(escala);
        animacion.addAnimation(rotacion);
        animacion.addAnimation(traslacion);

        animacion.setFillAfter(true);
        animacion.setRepeatMode(Animation.RESTART);
        animacion.setRepeatCount(20);
        tv.startAnimation(animacion);
    }
}
