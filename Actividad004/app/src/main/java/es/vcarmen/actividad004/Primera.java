package es.vcarmen.actividad004;

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

    public void boton1 (View view) {
        Intent intent = new Intent(this, Segunda.class);
        startActivity(intent);
    }

}