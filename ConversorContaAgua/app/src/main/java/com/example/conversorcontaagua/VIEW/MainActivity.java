package com.example.conversorcontaagua.VIEW;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.conversorcontaagua.Classes.CadastroContaAgua;
import com.example.conversorcontaagua.DAO.CadastroContaAguaSQL;
import com.example.conversorcontaagua.R;

public class MainActivity extends AppCompatActivity {

    private ViewHolder mViewHolder = new ViewHolder();
    private Double ValorTotalAgua;
    private Double ConsumoPorMetro;
    private Double ValorTaxaDeServico;
    private Double ValorUtilizadoMesPassado;
    private Double ValorUtilizadoEsteMes;
    private Double TaxaDivida;
    private Double TotalMetrosUtilizado;
    private Double TotalPorMetro;
    private Double TotalAPagarPorMes;
    private String DataAgua;
    private CadastroContaAguaSQL dao;


    public Double CalcularTotalPorMetro(Double ValorAgua, Double ConsumoPorMetro) {
        return ValorAgua / ConsumoPorMetro;
    }

    public Double CalcularTaxaParaCadaUm(Double ValorTaxa) {
        return ValorTaxa / 2;
    }

    public Double CalcularTotalAPagar(Double TotalUtilizado, Double TaxaServicoDividida, Double TotalPorMetro) {

        return TotalUtilizado * TotalPorMetro + TaxaServicoDividida;
    }

    public void hideSoftKeyboard() {
        if (getCurrentFocus() != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
            inputMethodManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
        }
    }

    private void clearValues() {
        mViewHolder.textTotalDividoEntre2Casas.setText("");
        mViewHolder.textTotalUtilizadoEsteMes.setText("");
        mViewHolder.textTotalPorMetroUtilizado.setText("");
        mViewHolder.textTotalPagarPeloUsuario.setText("");
    }


    private String CheckEditIsEmpty() {

        if (mViewHolder.editValorAguaSemTaxaServico.getText().toString().equals("")) {
            return "Valor da Agua não pode ser vazio, favor preencher antes do calculo";

        } else if (mViewHolder.editValorConsumoPorMetro.getText().toString().equals("")) {
            return "Total consumido por metro não pode ser vazio, favor preencher antes do calculo";

        } else if (mViewHolder.editValorTaxaServico.getText().toString().equals("")) {
            return "Taxa de serviço não pode ser vazio, favor preencher antes do calculo";

        } else if (mViewHolder.editValorUtilizadoMesPassado.getText().toString().equals("")) {
            return "Total Utilizado mês  passado não pode ser vazio, favor preencher antes do calculo";

        } else if (mViewHolder.editValorUtilizadoEsteMes.getText().toString().equals("")) {
            return "Total Utilizado este mês não pode ser vazio, favor preencher antes do calculo";
        } else {
            return "";
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dao = new CadastroContaAguaSQL(this);

        mViewHolder.editValorAguaSemTaxaServico = findViewById(R.id.edit_ValorAguaSemTaxaServico);
        mViewHolder.editValorConsumoPorMetro = findViewById(R.id.edit_ValorConsumoPorMetro);
        mViewHolder.editValorTaxaServico = findViewById(R.id.edit_ValorTaxaServico);
        mViewHolder.editValorUtilizadoMesPassado = findViewById(R.id.edit_ValorUtilizadoMesPassado);
        mViewHolder.editValorUtilizadoEsteMes = findViewById(R.id.edit_ValorUtilizadoEsteMes);

        mViewHolder.textTotalDividoEntre2Casas = findViewById(R.id.text_TotalDividoEntre2Casas);
        mViewHolder.textTotalUtilizadoEsteMes = findViewById(R.id.text_TotalUtilizadoEsteMes);
        mViewHolder.textTotalPorMetroUtilizado = findViewById(R.id.text_TotalPorMetroUtilizado);
        mViewHolder.textTotalPagarPeloUsuario = findViewById(R.id.text_TotalPagarPeloUsuario);

        mViewHolder.buttonCalcular = findViewById(R.id.button_Calcular);

        mViewHolder.spinnerMes = findViewById(R.id.spinner_mes);

        String spinnerArray[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        ArrayAdapter<String> spinnAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, spinnerArray);

        spinnAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mViewHolder.spinnerMes.setAdapter(spinnAdapter);
        mViewHolder.spinnerMes.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                DataAgua = parent.getItemAtPosition(position).toString();
                Toast.makeText(parent.getContext(), DataAgua, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                DataAgua = parent.getItemAtPosition(0).toString();
                Toast.makeText(parent.getContext(), DataAgua, Toast.LENGTH_SHORT).show();
            }
        });


        clearValues();


    }


    public void Salvar() {

        CadastroContaAgua c = new CadastroContaAgua();
        c.setValorTotalAgua(ValorTotalAgua);
        c.setConsumoPorMetro(ConsumoPorMetro);
        c.setValorTaxaDeServico(ValorTaxaDeServico);
        c.setValorUtilizadoMesPassado(ValorUtilizadoMesPassado);
        c.setValorUtilizadoEsteMes(ValorUtilizadoEsteMes);
        c.setTaxaDivida(TaxaDivida);
        c.setTotalMetrosUtilizado(TotalMetrosUtilizado);
        c.setTotalPorMetro(TotalPorMetro);
        c.setTotalAPagarPorMes(TotalAPagarPorMes);
        c.setDataAgua(DataAgua);

        // dao.inserir(c);
        long id = dao.inserir(c);
        Toast.makeText(this, "Cadastro inserido com id: " + id, Toast.LENGTH_SHORT).show();
    }


    public void CalcularValorAgua(View view) {
        String editEmpty;


        editEmpty = CheckEditIsEmpty();

        if (editEmpty != "") {

            Toast.makeText(this, editEmpty, Toast.LENGTH_LONG).show();

        } else {
            ValorUtilizadoEsteMes = Double.parseDouble(mViewHolder.editValorUtilizadoEsteMes.getText().toString());
            ValorUtilizadoMesPassado = Double.parseDouble(mViewHolder.editValorUtilizadoMesPassado.getText().toString());
            ValorTotalAgua = Double.parseDouble(mViewHolder.editValorAguaSemTaxaServico.getText().toString());
            ConsumoPorMetro = Double.parseDouble(mViewHolder.editValorConsumoPorMetro.getText().toString());
            ValorTaxaDeServico = Double.parseDouble(mViewHolder.editValorTaxaServico.getText().toString());
            TotalMetrosUtilizado = ValorUtilizadoEsteMes - ValorUtilizadoMesPassado;
            TaxaDivida = CalcularTaxaParaCadaUm(ValorTaxaDeServico);
            TotalPorMetro = CalcularTotalPorMetro(ValorTotalAgua, ConsumoPorMetro);
            TotalAPagarPorMes = CalcularTotalAPagar(TotalMetrosUtilizado, TaxaDivida, TotalPorMetro);

            mViewHolder.textTotalDividoEntre2Casas.setText("Taxa dividida entre as 2 casas:  R$" + String.format("%.2f", TaxaDivida) + " reais.");
            mViewHolder.textTotalUtilizadoEsteMes.setText(String.format("Total utilizado este mês:  " + String.format("%.2f", TotalMetrosUtilizado) + " metros."));
            mViewHolder.textTotalPorMetroUtilizado.setText(String.format("Total por metro utilizado:  R$" + String.format("%.2f", TotalPorMetro) + " reais."));
            mViewHolder.textTotalPagarPeloUsuario.setText(String.format("Total a pagar pelo usuario:  R$" + String.format("%.2f", TotalAPagarPorMes) + " reais."));
            hideSoftKeyboard();


            Salvar();


        }
    }


    private static class ViewHolder {
        Spinner spinnerMes;
        EditText editValorAguaSemTaxaServico;
        EditText editValorConsumoPorMetro;
        EditText editValorTaxaServico;
        EditText editValorUtilizadoMesPassado;
        EditText editValorUtilizadoEsteMes;

        TextView textTotalDividoEntre2Casas;
        TextView textTotalUtilizadoEsteMes;
        TextView textTotalPorMetroUtilizado;
        TextView textTotalPagarPeloUsuario;

        Button buttonCalcular;


    }
}
