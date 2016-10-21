package es.vcarmen.actividad003;

import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.util.Log;

public class Primera extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.caso1);
        Log.v("test", "Create");
    }

    public void boton (View view) {
        Intent intent = new Intent(this, Segunda.class);
        startActivity(intent);
    }

    @Override
    public void onStart(){
    	super.onStart();
        Log.v("test", "Activity 1 Start");
    }

    @Override
    public void onRestart(){
    	super.onRestart();
        Log.v("test", "Activity 1 Restart");
    }

    @Override
    public void onResume(){
    	super.onResume();
        Log.v("test", "Activity 1 Resume");
    }

    @Override
    public void onPause(){
    	super.onPause();
        Log.v("test", "Activity 1 Pause");
    }

    @Override
    public void onStop(){
    	super.onStop();
        Log.v("test", "Activity 1 Stop");
    }

    @Override
    public void onDestroy(){
    	super.onDestroy();
        Log.v("test", "Activity 1 Destroy");
    }

}