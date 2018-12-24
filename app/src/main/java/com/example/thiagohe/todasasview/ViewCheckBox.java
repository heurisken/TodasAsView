package com.example.thiagohe.todasasview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ViewCheckBox extends AppCompatActivity {

    private CheckBox checkBox1, checkBox2;
    private ToggleButton toogle1, toogle2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_check_box);

        carregar();
    }

    private void carregar(){
        this.checkBox1 = (CheckBox) findViewById(R.id.viewCheckBox_checkBox1);
        this.checkBox2 = (CheckBox) findViewById(R.id.viewCheckBox_checkBox2);

        this.toogle1 = (ToggleButton) findViewById(R.id.viewCheckBox_toggleButton1);
        this.toogle2 = (ToggleButton) findViewById(R.id.viewCheckBox_toggleButton2);


    }


    //Após o clique no botão, mostrar as opções selecionadas pelo usuário
    public void mostrar(View view) {

        boolean cb1, cb2, tg1, tg2;

        //CheckBoxes
        //Verificar se foi marcado pelo usuário(True para marcado; False para desmarcado )
        cb1 = checkBox1.isChecked();
        cb2 = checkBox2.isChecked();

        //ToogleButtons
        //Verificar se foi alterado pelo usuário (True para ON; False para OFF )
        tg1 = toogle1.isChecked();
        tg2 = toogle2.isChecked();

        Toast.makeText(this,"CB1= " +cb1 + " CB2= " +cb2 +" TG1= " +tg1 + " TG2= " + tg2 , Toast.LENGTH_LONG).show();

    }

    //Teste para resposta em tempo de execução.
    //Ao clicar no ToogleButton , este método será chamado pelo layout.
    public void responda(View view) {

        Toast.makeText(this,"Clicou", Toast.LENGTH_LONG).show();
    }
}
