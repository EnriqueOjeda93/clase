package es.vcarmen.actividad005;

import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Primera extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.caso1);
    }
    @Override
    protected void onPause(){
    	super.onPause();
    	finish(); //termina la actividad
    	}
    public void boton1 (View view) {
        Intent intent = new Intent(this, Segunda.class);
        startActivity(intent);
    }
    public void boton2(View view) {
        Intent intent = new Intent(this, Tercera.class);
        startActivity(intent);
    }
}