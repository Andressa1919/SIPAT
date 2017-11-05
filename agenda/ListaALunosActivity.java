package br.com.alura.agenda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

//No android precisaremos de uma tela, e essa tela será a nossa activity

public class ListaALunosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //De onde tá vindo o conteúdo da nossa tela
        //R --> abreviação para "RES" = resoucers "recusos"

        setContentView(R.layout.activity_lista_alunos);

        String[] Alunos = {"Daniel", "Lucas", "Denner", "Berg", "Vanessa", "Deanne", "Carlos", "David", "Johnatan", "Jailson",
                "Edvania", "Bruna", "João"};
        ListView listaAlunos = (ListView) findViewById(R.id.Lista_alunos);
        //Adapter vai ficar responsavel por converter a string de Alunos para uma tView para serem colocadas dentro da lista
        ArrayAdapter<String> Adapter = new ArrayAdapter <String>(this, android.R.layout.simple_list_item_1, Alunos);
        listaAlunos.setAdapter(Adapter);

        Button novoAluno = (Button) findViewById(R.id.novo_aluno);
        //estou interessado em ouvir o click
        novoAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//vamos declarar qual a nossa intensão com o android
                //o que eu sou e para onde  quero ir
                Intent intentVaiProFormulario = new Intent(ListaALunosActivity.this, FormularioActivity.class);
                startActivity(intentVaiProFormulario);
            }
        });
    }
}
