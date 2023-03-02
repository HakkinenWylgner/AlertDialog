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

<<<<<<< HEAD
        //Instanciando AlertDialog em dialog, e referenciando o primeiro item com this
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);

        //Define o Título e a mensagem a ser reproduzida.
        dialog.setTitle("Título da dialog");
        dialog.setMessage("Mensagem do Dialog");

        //Configurando sim para alertdialog que é uma caixa com opção que poderia ser até um ok!
        //Defina um ouvinte a ser invocado quando o botão positivo da caixa de diálogo for pressionado.

        dialog.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            
            /* DialogInterface - Interface que define uma classe do tipo caixa de diálogo que pode ser mostrada,
            descartada ou cancelado e pode ter botões que podem ser clicados.*/
=======
        //Instanciar AlertDialog
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);

        //Configurar Titulo
        dialog.setTitle("Título da dialog");
        dialog.setMessage("Mensagem do Dialog");

        //Configurar ações para sim e não

        dialog.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
>>>>>>> 988e2fb (Finalização Dialog)
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


<<<<<<< HEAD
}
=======
}
>>>>>>> 988e2fb (Finalização Dialog)
