package com.example.thiagohe.todasasview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button botao;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        carregar();
    }

    private void carregar() {

    }


    //conforme a view selecionada a sua respectiva activity será aberta.
    public void selecionar(View view) {

        int id = 0;
        botao = ( Button ) view;
        id = botao.getId();

        switch ( id ){

            case  R.id.button_textView:
                abrir( ViewTextView.class );
                break;

            case R.id.button_button:
                abrir( ViewButton.class);
                break;

            case R.id.button_checkBox:
                abrir( ViewCheckBox.class );
                break;

            case R.id.button_radioButton:
                abrir( ViewRadioButton.class);
                break;

            case R.id.button_spinner :
                abrir( ViewSpinner.class );
                break;

            case R.id.button_toast:
                abrir( ViewImage.class);
                break;

        }
    }


    //abrir as activitys através da Intent
    private void abrir ( Class<?> classe){

        startActivity( new Intent( getApplicationContext(), classe ));


    }
}
