package com.example.thiagohe.todasasview;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ViewImage extends AppCompatActivity {

    private ImageView img1;
    private  boolean mudou = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_image);

        carregar();
    }

    public void carregar(){
        this.img1 = (ImageView) findViewById(R.id.viewImage_imageView_imagem1);

    }


    //Ao ser clicada, troca de figura.
    //Toda vez que houve a troca de figura, o booleta altera o seu estado para desviar o caminho até
    //a a outra figura.
    public void mudar(View view) {

        if (mudou) {
            img1.setImageResource(R.drawable.keyboard);

            mudou = false;

        } else {
            img1.setImageResource(R.drawable.game);

            mudou = true;
        }



    }
}
