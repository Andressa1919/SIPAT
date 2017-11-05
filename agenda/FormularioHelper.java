package br.com.alura.agenda;

import android.widget.EditText;
import android.widget.RatingBar;

import br.com.alura.agenda.modelo.Aluno;

/**
 * Created by andressa on 04/11/2017.
 */

public class FormularioHelper {

    private final EditText campoNome;
    private final EditText campoEndereço;
    private final EditText campoTelefone;
    private final EditText campoEmail;
    private final RatingBar campoNota;

    public FormularioHelper (FormularioActivity activity){
        activity.findViewById(R.id.formulario_nome);
        //pegando as referencias para recuperar os dados digitados no formulario

         campoNome = (EditText) activity.findViewById(R.id.formulario_nome);

         campoEndereço = (EditText) activity.findViewById(R.id.formulario_endereço);

         campoTelefone = (EditText) activity.findViewById(R.id.formulario_telefone);

         campoEmail = (EditText) activity.findViewById(R.id.formulario_email);

         campoNota = (RatingBar) activity.findViewById(R.id.fomrulario_nota);

    }

    public Aluno pegaAluno() {
        Aluno aluno =new Aluno();

        aluno.setNome(campoNome.getText().toString());
        aluno.setEndereço(campoEndereço.getText().toString());
        aluno.setTelefne(campoTelefone.getText().toString());
        aluno.setEmail(campoEmail.getText().toString());
        aluno.setNota(Double.valueOf(campoNota.getProgress()));

        return aluno;
    }
}
