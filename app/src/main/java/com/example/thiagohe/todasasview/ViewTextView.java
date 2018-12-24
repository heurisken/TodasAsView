package com.example.thiagohe.todasasview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ViewTextView extends AppCompatActivity {


    private EditText nome, email, senha;
    private Button enviar;
    private AutoCompleteTextView cor;

    //List de cores para o AutoCompletExtVieew :
    List<String> cores;
    ArrayAdapter<String> adaptador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_text_view);

        carregar();

    }

    public void enviar(View view) {

        String dados = nome.getText() + " / " + email.getText() + " / " + senha.getText() +" / "+ cor.getText();

        Toast.makeText( getApplicationContext(), dados, Toast.LENGTH_LONG ).show();

    }

    private void carregar(){

        //Lista de cores para AutoCompleteTExtViews
        this.cores = new ArrayList<>();
        cores.add("Azul");
        cores.add("Amarelo");
        cores.add("Vermelho");
        cores.add("Preto");
        cores.add("Branco");
        cores.add("Cinza");
        cores.add("Roxo");
        cores.add("Verde");
        cores.add("Laranja");
        cores.add("Rosa");
        cores.add("Beje");

        //Ordenando os elementos da lista cores em ordem alfabética.
        Collections.sort(cores);


        this.nome = (EditText) findViewById( R.id.editText_nome );
        this.email = (EditText) findViewById( R.id.editText_email );
        this.senha = ( EditText ) findViewById( R.id.editText_senha);
        this.cor = (AutoCompleteTextView) findViewById( R.id.autoCompleteTextView_cor );

        //passando a lista cores para dentro do adaptador
        adaptador = new ArrayAdapter<>(this,android.R.layout.simple_dropdown_item_1line, cores);
        //passando o adaptador para a view AutoCompleteTextView
        cor.setAdapter( adaptador );

    }

}
