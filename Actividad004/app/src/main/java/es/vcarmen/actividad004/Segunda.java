package es.vcarmen.actividad004;

import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Segunda extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.caso2);
    }
    public void boton2 (View view) {
        Intent intent = new Intent(this, Tercera.class);
        startActivity(intent);
    }

}