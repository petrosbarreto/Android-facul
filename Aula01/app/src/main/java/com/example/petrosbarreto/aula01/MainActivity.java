package com.example.petrosbarreto.aula01;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button) findViewById(R.id.btn1);
        final EditText editN1 = (EditText) findViewById(R.id.editN1);
        final EditText editN2 = (EditText) findViewById(R.id.editN2);
        final TextView textResultado = (TextView) findViewById(R.id.textResultado);

        btn1.setOnClickListener(new View.OnClickListener() {   //aqui eh adicionado os efeitos do btn
            @Override
            public void onClick(View v) {
                double n1 = Integer.parseInt(editN1.getText().toString());
                double n2 = Integer.parseInt(editN2.getText().toString());
                textResultado.setText(""+(n1+n2)/2);

                Toast.makeText(getApplicationContext(), "Soma Realizada Com Sucesso",Toast.LENGTH_SHORT).show();

            }
        });
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
