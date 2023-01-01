package com.navegantesdaestrada.grbmotos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class testeDeTela extends AppCompatActivity {

    public Button TagendarServico, TcadastroServicos, TcadastroUsuario,TeditaAgenda, TmenuAdm, TopcoesUsuario,
                    EscolherServicos, AgendarServico, CadastroVeiculo, ExcluirData, AdicionarData, VerAgendaAdm, VerAgendaUsua;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teste_de_tela);

        TagendarServico = findViewById(R.id.TagendarServico);
        TagendarServico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), EscolherServicos.class);
                startActivity(intent);

            }
        });

        TcadastroServicos = findViewById(R.id.TcadastroServicos);
        TcadastroServicos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),CadastroServico.class);
                startActivity(intent);

            }
        });

        TcadastroUsuario = findViewById(R.id.TcadastroUsuario);
        TcadastroUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),CadastroUsuaActivity.class);
                startActivity(intent);

            }
        });

        TeditaAgenda = findViewById(R.id.TeditaAgenda);
        TeditaAgenda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),EditaAgenda.class);
                startActivity(intent);

            }
        });

        TmenuAdm = findViewById(R.id.TmenuAdm);
        TmenuAdm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MenuAdm.class);
                startActivity(intent);

            }
        });

        TopcoesUsuario = findViewById(R.id.TopcoesUsuario);
        TopcoesUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),OpcoesUsuario.class);
                startActivity(intent);

            }
        });

        AgendarServico = findViewById(R.id.AgendarServico);
        AgendarServico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),AgendarServico.class);
                startActivity(intent);

            }
        });

        CadastroVeiculo = findViewById(R.id.CadastroVeiculo);
        CadastroVeiculo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),CadastroVeiculo.class);
                startActivity(intent);

            }
        });

        ExcluirData = findViewById(R.id.ExcluirData);
        ExcluirData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ExcluirData.class);
                startActivity(intent);

            }
        });
        AdicionarData = findViewById(R.id.AdicionarData);
        AdicionarData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),AdicionarData.class);
                startActivity(intent);

            }
        });
        VerAgendaAdm = findViewById(R.id.VerAgendaAdm);
        VerAgendaAdm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),VerAgendaAdm.class);
                startActivity(intent);

            }
        });
        VerAgendaUsua = findViewById(R.id.VerAgendaUsua);
        VerAgendaUsua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),VerAgendaUsua.class);
                startActivity(intent);

            }
        });


    }
}