package com.example.conversorcontaagua.VIEW;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.conversorcontaagua.Classes.CadastroContaAgua;
import com.example.conversorcontaagua.DAO.CadastroContaAguaSQL;
import com.example.conversorcontaagua.R;

import java.util.ArrayList;
import java.util.List;

public class ListarContaAguaActivity extends AppCompatActivity {


    private ListView listView;
    private CadastroContaAguaSQL dao;
    private List<CadastroContaAgua> ListaContaAgua;
    private List<CadastroContaAgua> contaAguasFiltradas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_conta_agua);
        listView = findViewById(R.id.lista_conta_agua);
        dao = new CadastroContaAguaSQL(this);
        ListaContaAgua = dao.ObterTodas();
    }
}
