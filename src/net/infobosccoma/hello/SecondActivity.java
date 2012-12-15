package net.infobosccoma.hello;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends Activity {
	
	private Persona p;
    private TextView lblMissatge;
    
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    
        lblMissatge = (TextView) findViewById(R.id.lblMissatge);
        mostrarDades();
    }

    private void mostrarDades() {
    	p = (Persona) getIntent().getSerializableExtra("persona");
    	if( p!= null) {
    		lblMissatge.setText("Hola " + p.getNomCognoms() + 
    							"\nEl teu mail és " + p.getEmail() + 
    							" i el teu telefon " + p.getTelefon() +
    							"\nVols que et truqui o que t'enviï un correu?");
    		
    	}
    }
    
    public void trucar(View v) {
    	Intent i = new Intent(Intent.ACTION_CALL);
    	i.setData(Uri.parse("tel:"+p.getTelefon()));
    	startActivity(i);
    }
    
    public void enviarMail(View v) {
    	String[] llistaAdreces = {p.getEmail()};
    	Intent i = new Intent(Intent.ACTION_SEND);
    	
    	i.setType("plain/text");
    	i.putExtra(Intent.EXTRA_EMAIL, llistaAdreces );
    	i.putExtra(Intent.EXTRA_SUBJECT, "Títol del missatge");
    	i.putExtra(Intent.EXTRA_TEXT, "Text del missatge");
    	startActivity(i);    	
    }
}
