package es.vcarmen.ejemplo6;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Ejemplo6 extends AppCompatActivity {

    private Typeface fuente1;
    private Typeface fuente2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo6);

        fuente1 = Typeface.createFromAsset(getAssets(),"fonts/Umbrella.ttf");
        fuente2 = Typeface.createFromAsset(getAssets(),"fonts/actionj.ttf");

        TextView ejemplo1= (TextView) findViewById(R.id.mitexto1);
        ejemplo1.setTypeface(fuente1);
        ejemplo1.setText("PERSONALIZAR FUENTES");

        TextView ejemplo2= (TextView) findViewById(R.id.mitexto2);
        ejemplo2.setTypeface(fuente2);
        ejemplo2.setText("FUENTE VARIADA");
    }
}
