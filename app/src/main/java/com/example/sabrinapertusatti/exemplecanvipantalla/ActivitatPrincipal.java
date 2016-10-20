package com.example.sabrinapertusatti.exemplecanvipantalla;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;

public class ActivitatPrincipal extends AppCompatActivity {
    EditText  txtNom;
    EditText txtCognom;
    EditText txtEdat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitat_principal);

       final Button btnCanvi = (Button)findViewById(R.id.btnCanvi);
        txtNom = (EditText)findViewById(R.id.txtEntraNom);
        txtCognom = (EditText)findViewById(R.id.txtEntraCog);
        txtEdat  = (EditText)findViewById(R.id.txtEntraEdat);
        final CheckBox cbOk = (CheckBox)findViewById(R.id.checkBox);


        btnCanvi.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Bundle b=new Bundle();
                b.putString("Nom",txtNom.getText().toString());
                b.putString("Cognom",txtCognom.getText().toString());
                b.putString("Edat",txtEdat.getText().toString());

                Boolean checkBox = cbOk.isChecked();

                if (checkBox == true){
                    b.putString("marcado","Es permet mostrar les dades");
                }
                else{
                    b.putString("marcado","No s'ha permet mostrar les dades");
                }

                Intent intencioA = new Intent(ActivitatPrincipal.this, segonaActivitat.class);
                intencioA.putExtras(b);//el que s'enviarà sera un container
                startActivity(intencioA);
                                               //Origen            Desti


            }
            //public void premerBoto(View v){ hay que agregar el metodo al boton
            //Intent intencio = new Intent(ActivitatPrincipal.this, segonaActivitat.class);
           // startActivity(intencio);
            //}
        });
    }
}
