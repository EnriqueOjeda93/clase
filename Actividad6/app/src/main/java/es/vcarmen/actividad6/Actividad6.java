package es.vcarmen.actividad6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Actividad6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad6);
        TextView ejemplo=new TextView (this);
        ejemplo.setTextColor(Color.argb(255, 0, 0, 0));
        ejemplo.setTextSize(20);
        ejemplo.setText("NUEVO MÉTODO DE TEXTO");
        LinearLayout ll = (LinearLayout) findViewById(R.id.nuevoLayout);
        ll.addView(ejemplo);
    }
}
