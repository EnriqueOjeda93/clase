package es.vcarmen.actividad25;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ToggleButton;

public class Actividad25 extends ActionBarActivity {
	TextView texto;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_actividad25);
		texto=(TextView) findViewById(R.id.mitexto);
		texto.setText("BOTONES PULSADOS");
	}
	public void metodo1 (View view){
		texto.setText("BOT�N 1 PULSADO");
	}
	public void metodo2 (View view){
		texto.setText("BOT�N 2 PULSADO");
	}
	public void metodo3 (View view){
		texto.setText("BOT�N 3 PULSADO");
	}
	public void metodo4 (View view){
		ToggleButton boton= (ToggleButton) findViewById(R.id.miboton2);
		boton.setChecked(false);
		texto.setText("BOT�N 4 PULSADO");
	}
	public void metodo5 (View view){
		texto.setText("BOT�N 5 PULSADO");
	}
	public void metodo6 (View view){
		texto.setText("BOT�N 6 PULSADO");
	}
	public void metodo7 (View view){
		texto.setText("BOT�N 7 PULSADO");
	}
	public void metodo8 (View view){
		texto.setText("BOT�N 8 PULSADO");
	}
	public void metodo9 (View view){
		texto.setText("BOT�N 9 PULSADO");
	}
	public void metodo10 (View view){
		texto.setText("BOT�N 10 PULSADO");
	}
	public void metodo11 (View view){
		texto.setText("BOT�N 11 PULSADO");
	}
	public void metodo12 (View view){
		texto.setText("BOT�N 12 PULSADO");}
	
	public void metodo13 (View view){
		texto.setText("BOT�N 13 PULSADO");
	}
	public void metodo14 (View view){
		texto.setText("BOT�N 14 PULSADO");}
	
}