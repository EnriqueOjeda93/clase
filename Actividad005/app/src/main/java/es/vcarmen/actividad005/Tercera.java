package es.vcarmen.actividad005;

import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Tercera extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.caso3);
    }

    public void boton4 (View view) {
        Intent intent = new Intent(this, Primera.class);
        startActivity(intent);
    }

}