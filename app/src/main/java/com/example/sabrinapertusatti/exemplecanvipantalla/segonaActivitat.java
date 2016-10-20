package com.example.sabrinapertusatti.exemplecanvipantalla;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class segonaActivitat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segona_activitat);

        TextView lblHola=(TextView)findViewById(R.id.labelNom);
        TextView lblCog=(TextView)findViewById(R.id.labelCog);
        TextView lblEdat=(TextView)findViewById(R.id.labelEdat);
        TextView lblMarcado=(TextView)findViewById(R.id.label5);

        Bundle b = getIntent().getExtras();
        lblHola.setText(b.getString("Nom"));

        lblCog.setText(b.getString("Cognom"));

        lblEdat.setText(b.getString("Edat"));

        lblMarcado.setText(b.getString("marcado"));



    }
}
