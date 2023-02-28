package com.example.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirDialog(View view){

        //Instanciar AlertDialog
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);

        //Configurar Titulo
        dialog.setTitle("Título da dialog");
        dialog.setMessage("Mensagem do Dialog");

        //Configurar ações para sim e não

        dialog.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Toast.makeText(
                        getApplicationContext(),
                        "Executar ação ao clicarr no botão sim",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });

        //Criar e exibir AlertDialog
        dialog.create();
        dialog.show();

    }


}