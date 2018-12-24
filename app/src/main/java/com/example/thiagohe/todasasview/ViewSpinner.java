package com.example.thiagohe.todasasview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ViewSpinner extends AppCompatActivity {


    //As views da Activity
    private Spinner spinner2;
    private Spinner spinner3;
    private ImageView imagem;

    private ArrayAdapter<String> adapter2;
    private ArrayAdapter<Estado> adapter3;
    //Array String para spinner2
    private String[] estados = new String[]{"Rio Grande do Sul", "Santa Catarina", "Paraná", "São Paulo"};
    //Usando List para spinner3
    private List<Estado> listaEstados; //Não pode ser instanciada aqui.



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_spinner);

        carregar();//Carregar componentes e atribuiões

        ouvir();//carregar ouvintes e tratamentos




    }





    private void carregar(){

        /**
         * SPINNER2 USANDO ARRAY DE STRINGS
         */
        this.spinner2 = (Spinner) findViewById( R.id.spinner_spinner_estado2); //capturando a view Spinner
        this.adapter2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, estados);//passando o array estados para o ArrayAdapter
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_item); //definindo o layout novamente, apesar de já ter sido definido dentro do constrtrutor.
        //atribuindo o adapter à spinner.
        spinner2.setAdapter(adapter2);


        /*
        * SPINNER3 USANDO LIST DE objetos ESTADOS
        * */

        //Uma list só pode ser instanciada dentro do OnCreat. Também só pode ser manipulada ali dentro. Por quê?
        this.listaEstados = new ArrayList<>();
        listaEstados.add(new Estado("Mato Grosso do Sul" ,"MT", R.drawable.binopenarchigraphs) );
        listaEstados.add(new Estado("Bahia" ,"BA", R.drawable.cake ) );
        listaEstados.add(new Estado("Amazonas" ,"AM", R.drawable.coffee) );
        listaEstados.add(new Estado("Paraíba" ,"PB",R.drawable.coffee_archigraphs) );
        listaEstados.add(new Estado("Santa Catarinas" ,"SC", R.drawable.game));



        this.spinner3 = (Spinner) findViewById( R.id.spinner_spinner_estado3); //Capturando a spinner3
        this.adapter3 = new ArrayAdapter<>( this, android.R.layout.simple_spinner_dropdown_item, listaEstados);//passando a List para o ArrayAdapter
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);//definido o layout novamente, apesar de já ter sido feio dentro do próprio construtor.
        //Atribuindo o adapter à spinner
        spinner3.setAdapter( adapter3 );//aqui a Spinner chama o toString de cada elemento do adapter. Por isso deve-se implementar o método dentro da classe.



        /*FIGURA
        * */
        this.imagem = ( ImageView ) findViewById( R.id.spinner_imageView_figuraEstado);
    }

    public void ouvir(){

        /*TRATAMENTO PARA A SPINNER 3 em tempo de execução.
        * */
        spinner3.setOnItemSelectedListener( new Spinner.OnItemSelectedListener(){

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                //Recuperando o item selecionado. Casting necessário pois o método retorno um OBJECT
                Estado uf = (Estado) spinner3.getSelectedItem();
                Toast.makeText(getBaseContext(), "UF Selecionada : " + uf.getSigla(), Toast.LENGTH_LONG).show(); //Exibindo-o

                //Mudando a imageView , conforme o item selecionado:
                imagem.setImageResource( uf.getIdFigura() ); //Aqui a figura foi chamada pelo seu ID( int ).

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }


    //Ao cliclar a imagem, este método será chamado
    public void enviar(View view) {

        Estado uf = (Estado) spinner3.getSelectedItem(); //retorna o objeto
        long  ufID = spinner3.getSelectedItemId(); //retorna o id selecionado;
        int ufPosition = spinner3.getSelectedItemPosition(); //retorna a posição do intem dentro do array.

        Toast.makeText( getApplication(), uf + " / Id:" + ufID + " / Pos:" + ufPosition , Toast.LENGTH_LONG).show();

    }
}
