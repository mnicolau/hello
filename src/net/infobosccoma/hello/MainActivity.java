package net.infobosccoma.hello;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	private EditText txtNomCognoms;
	private EditText txtEmail;
	private EditText txtTelefon;
	private Button btnHello;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        txtNomCognoms = (EditText) findViewById(R.id.txtNomCognoms);
        txtEmail = (EditText) findViewById(R.id.txtEmail);
        txtTelefon = (EditText) findViewById(R.id.txtTelefon);
        btnHello = (Button) findViewById(R.id.btnHello);
        
    }

    public void obrirActivity(View v) {
    	Intent i = new Intent(this, SecondActivity.class);
    	Persona p = new Persona(txtNomCognoms.getText().toString(),
    							txtEmail.getText().toString(), 
    							txtTelefon.getText().toString());
    	
    	Bundle bundle = new Bundle();
    	bundle.putSerializable("persona", p);
    	i.putExtras(bundle);
    	startActivity(i);
    }
    
}
