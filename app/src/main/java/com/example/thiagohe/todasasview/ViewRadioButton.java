package com.example.thiagohe.todasasview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class ViewRadioButton extends AppCompatActivity {

    private RadioButton rButton1, rButton2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_radio_button);

        carregar();

    }



    private void carregar(){
        this.rButton1 = (RadioButton) findViewById(R.id.radioButton_radioButton1);
        this.rButton2 = (RadioButton) findViewById(R.id.radioButton_radioButton2);
    }


    //Método chamado ao clicar o ImageBotton.
    //Simplesmente vai apresentar um Toast com o texto do RadioButton marcado.
    public void confirmar(View view) {

        String sexo;

        //Caso nenhum esteja marcado, já pula pro aviso.
        if( rButton1.isChecked() == true || rButton2.isChecked() == true ){

            if( rButton1.isChecked() ){
                sexo = (String) rButton1.getText();
                avisa("Sexo : "+sexo);
            }
            else{
                sexo = (String) rButton2.getText();
                avisa("Sexo : "+sexo);
            }



    }else{//Aviso :
            //Fala que nada foi selecionado.
            avisa( "Escolha o sexo porra!!!");
        }



    }

    private void avisa( String msg ){
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
    }
}
