package es.vcarmen.actividad002;

import android.content.Intent;
import android.os.Bundle;
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