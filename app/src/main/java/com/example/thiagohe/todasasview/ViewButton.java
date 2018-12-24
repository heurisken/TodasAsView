package com.example.thiagohe.todasasview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ViewButton extends AppCompatActivity {


    private ImageButton imBotao1, imBotao2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_button);

        carregar();
    }



    //fazer aparecer e desaparecer um imageButton
    public void magica(View view) {

        ImageButton imagemBotao = ( ImageButton) view;

        if( imagemBotao.getId() == imBotao1.getId() ){
            imBotao2.setVisibility(View.VISIBLE); //Ascende botão2
            imBotao1.setVisibility(View.INVISIBLE); //Apaga botão01
        }
        else{
            imBotao1.setVisibility(View.VISIBLE); //Ascende botao1
            imBotao2.setVisibility(View.INVISIBLE); //Apaga o botão2
        }
    }

    private void carregar(){

        this.imBotao1 = (ImageButton) findViewById( R.id.imageButton_ImButton1);
        this.imBotao2 = (ImageButton) findViewById( R.id.imageButton_imButton2);


    }


}
