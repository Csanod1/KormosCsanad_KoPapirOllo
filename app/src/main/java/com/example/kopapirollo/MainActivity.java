package com.example.kopapirollo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imageViewJatekosKo;
    private ImageView imageViewJatekosPapir;
    private ImageView imageViewJatekosOllo;
    private ImageView imageViewGepKo;
    private ImageView imageViewGepPapir;
    private ImageView imageViewGepOllo;
    private TextView textViewEmberGyozelem;
    private TextView textViewGepGyozelem;
    private Button btnKo;
    private Button btnPapir;
    private Button btnOllo;
    private Random rnd;
    private int jatekosValasza;
    int gepValasz;
    int gepGyozelmek;
    int jatekosGyozelmek;
    private AlertDialog.Builder jatekVegeDialogBuilder;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        init();
        addListener();
    }

    private void addListener(){
        btnKo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jatekosValasza = 0;
                gepValasz = rnd.nextInt(3);
                imageViewJatekosKo.setVisibility(View.VISIBLE);
                imageViewJatekosOllo.setVisibility(View.GONE);
                imageViewJatekosPapir.setVisibility(View.GONE);
                switch (gepValasz){
                    case 0:
                        Toast.makeText(MainActivity.this, "Döntetlen kör", Toast.LENGTH_SHORT).show();
                        imageViewGepKo.setVisibility(View.VISIBLE);
                        imageViewGepPapir.setVisibility(View.GONE);
                        imageViewGepOllo.setVisibility(View.GONE);
                        break;
                    case 1:
                        Toast.makeText(MainActivity.this, "Ön vesztett", Toast.LENGTH_SHORT).show();
                        imageViewGepKo.setVisibility(View.GONE);
                        imageViewGepPapir.setVisibility(View.VISIBLE);
                        imageViewGepOllo.setVisibility(View.GONE);
                        gepGyozelmek++;
                        textViewGepGyozelem.setText(String.valueOf(gepGyozelmek));
                        if (gepGyozelmek == 3){
                            jatekVegeDialogBuilder.show();
                        }
                        break;
                    case 2:
                        Toast.makeText(MainActivity.this, "Ön nyert", Toast.LENGTH_SHORT).show();
                        imageViewGepKo.setVisibility(View.GONE);
                        imageViewGepPapir.setVisibility(View.GONE);
                        imageViewGepOllo.setVisibility(View.VISIBLE);
                        jatekosGyozelmek++;
                        textViewEmberGyozelem.setText(String.valueOf(jatekosGyozelmek));
                        if (jatekosGyozelmek == 3){
                            jatekVegeDialogBuilder.show();
                        }
                        break;
                }
            }
        });
        btnPapir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jatekosValasza = 1;
                gepValasz = rnd.nextInt(3);
                imageViewJatekosKo.setVisibility(View.GONE);
                imageViewJatekosOllo.setVisibility(View.GONE);
                imageViewJatekosPapir.setVisibility(View.VISIBLE);
                switch (gepValasz){
                    case 0:
                        Toast.makeText(MainActivity.this, "Ön nyert", Toast.LENGTH_SHORT).show();
                        imageViewGepKo.setVisibility(View.VISIBLE);
                        imageViewGepPapir.setVisibility(View.GONE);
                        imageViewGepOllo.setVisibility(View.GONE);
                        jatekosGyozelmek++;
                        textViewEmberGyozelem.setText(String.valueOf(jatekosGyozelmek));
                        if (jatekosGyozelmek == 3){
                            jatekVegeDialogBuilder.show();
                        }
                        break;
                    case 1:
                        Toast.makeText(MainActivity.this, "Döntetlen kör", Toast.LENGTH_SHORT).show();
                        imageViewGepKo.setVisibility(View.GONE);
                        imageViewGepPapir.setVisibility(View.VISIBLE);
                        imageViewGepOllo.setVisibility(View.GONE);
                        break;
                    case 2:
                        Toast.makeText(MainActivity.this, "Ön vesztett", Toast.LENGTH_SHORT).show();
                        imageViewGepKo.setVisibility(View.GONE);
                        imageViewGepPapir.setVisibility(View.GONE);
                        imageViewGepOllo.setVisibility(View.VISIBLE);
                        gepGyozelmek++;
                        textViewGepGyozelem.setText(String.valueOf(gepGyozelmek));
                        if (gepGyozelmek == 3){
                            jatekVegeDialogBuilder.show();
                        }
                        break;
                }
            }

        });
        btnOllo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jatekosValasza = 2;
                gepValasz = rnd.nextInt(3);
                imageViewJatekosKo.setVisibility(View.GONE);
                imageViewJatekosOllo.setVisibility(View.VISIBLE);
                imageViewJatekosPapir.setVisibility(View.GONE);
                switch (gepValasz){
                    case 0:
                        Toast.makeText(MainActivity.this, "Ön vesztett", Toast.LENGTH_SHORT).show();
                        imageViewGepKo.setVisibility(View.VISIBLE);
                        imageViewGepPapir.setVisibility(View.GONE);
                        imageViewGepOllo.setVisibility(View.GONE);
                        gepGyozelmek++;
                        textViewGepGyozelem.setText(String.valueOf(gepGyozelmek));
                        if (gepGyozelmek == 3){
                            jatekVegeDialogBuilder.show();
                        }
                        break;
                    case 1:
                        Toast.makeText(MainActivity.this, "Ön nyert", Toast.LENGTH_SHORT).show();
                        imageViewGepKo.setVisibility(View.GONE);
                        imageViewGepPapir.setVisibility(View.VISIBLE);
                        imageViewGepOllo.setVisibility(View.GONE);
                        jatekosGyozelmek++;
                        textViewEmberGyozelem.setText(String.valueOf(jatekosGyozelmek));
                        if (jatekosGyozelmek == 3){
                            jatekVegeDialogBuilder.show();
                        }
                        break;
                    case 2:
                        Toast.makeText(MainActivity.this, "Döntetlen kör", Toast.LENGTH_SHORT).show();
                        imageViewGepKo.setVisibility(View.GONE);
                        imageViewGepPapir.setVisibility(View.GONE);
                        imageViewGepOllo.setVisibility(View.VISIBLE);
                        break;
                }
            }
        });
    }
    private void ujGame(){
        jatekosValasza = 0;
        gepValasz = 0;
        jatekosGyozelmek = 0;
        gepGyozelmek = 0;
        textViewEmberGyozelem.setText(String.valueOf(jatekosGyozelmek));
        textViewGepGyozelem.setText(String.valueOf(gepGyozelmek));
        imageViewJatekosKo.setVisibility(View.VISIBLE);
        imageViewJatekosOllo.setVisibility(View.GONE);
        imageViewJatekosPapir.setVisibility(View.GONE);
        imageViewGepKo.setVisibility(View.VISIBLE);
        imageViewGepPapir.setVisibility(View.GONE);
        imageViewGepOllo.setVisibility(View.GONE);
    }


    public void init(){
        imageViewJatekosKo = findViewById(R.id.imageViewJatekosKo);
        imageViewJatekosPapir = findViewById(R.id.imageViewJatekosPapir);
        imageViewJatekosOllo = findViewById(R.id.imageViewJatekosOllo);
        imageViewGepKo = findViewById(R.id.imageViewGepKo);
        imageViewGepPapir = findViewById(R.id.imageViewGepPapir);
        imageViewGepOllo = findViewById(R.id.imageViewGepOllo);
        textViewEmberGyozelem = findViewById(R.id.textViewEmberGyozelem);
        textViewGepGyozelem = findViewById(R.id.textViewGepGyozelem);
        btnKo = findViewById(R.id.btnKo);
        btnPapir = findViewById(R.id.btnPapir);
        btnOllo = findViewById(R.id.btnOllo);
        rnd = new Random();
        jatekosValasza = 0;
        gepValasz = rnd.nextInt(3);
        gepGyozelmek = 0;
        jatekosGyozelmek = 0;
        jatekVegeDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        jatekVegeDialogBuilder.setMessage("Szeretne új jatekot kezdeni?");
        jatekVegeDialogBuilder.setNegativeButton("nem", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        jatekVegeDialogBuilder.setPositiveButton("Igen", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                ujGame();
            }
        });
    }
}