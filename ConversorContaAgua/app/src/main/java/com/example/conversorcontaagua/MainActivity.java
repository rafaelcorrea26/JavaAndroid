package com.example.conversorcontaagua;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ViewHolder mViewHolder = new ViewHolder();

    public Double CalcularTotalPorMetro(Double ValorAgua, Double ConsumoPorMetro) {
        return ValorAgua / ConsumoPorMetro;
    }

    public Double CalcularTaxaParaCadaUm(Double ValorTaxa) {
        return ValorTaxa / 2;
    }

    public Double CalcularTotalAPagar(Double TotalUtilizado, Double TaxaServicoDividida, Double TotalPorMetro) {

        return TotalUtilizado * TotalPorMetro + TaxaServicoDividida;
    }


    private void clearValues() {
        this.mViewHolder.textTotalDividoEntre2Casas.setText("");
        this.mViewHolder.textTotalUtilizadoEsteMes.setText("");
        this.mViewHolder.textTotalPorMetroUtilizado.setText("");
        this.mViewHolder.textTotalPagarPeloUsuario.setText("");
    }

    private String CheckEditIsEmpty() {

        if (this.mViewHolder.editValorAguaSemTaxaServico.getText().toString().equals("")) {
            return "Valor da Agua não pode ser vazio, favor preencher antes do calculo";

        } else if (this.mViewHolder.editValorConsumoPorMetro.getText().toString().equals("")) {
            return "Total consumido por metro não pode ser vazio, favor preencher antes do calculo";

        } else if (this.mViewHolder.editValorTaxaServico.getText().toString().equals("")) {
            return "Taxa de serviço não pode ser vazio, favor preencher antes do calculo";

        } else if (this.mViewHolder.editValorUtilizadoMesPassado.getText().toString().equals("")) {
            return "Total Utilizado mês  passado não pode ser vazio, favor preencher antes do calculo";

        } else if (this.mViewHolder.editValorUtilizadoEsteMes.getText().toString().equals("")) {
            return "Total Utilizado este mês não pode ser vazio, favor preencher antes do calculo";
        } else {
            return "";
        }


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mViewHolder.editValorAguaSemTaxaServico = findViewById(R.id.edit_ValorAguaSemTaxaServico);
        this.mViewHolder.editValorConsumoPorMetro = findViewById(R.id.edit_ValorConsumoPorMetro);
        this.mViewHolder.editValorTaxaServico = findViewById(R.id.edit_ValorTaxaServico);
        this.mViewHolder.editValorUtilizadoMesPassado = findViewById(R.id.edit_ValorUtilizadoMesPassado);
        this.mViewHolder.editValorUtilizadoEsteMes = findViewById(R.id.edit_ValorUtilizadoEsteMes);

        this.mViewHolder.textTotalDividoEntre2Casas = findViewById(R.id.text_TotalDividoEntre2Casas);
        this.mViewHolder.textTotalUtilizadoEsteMes = findViewById(R.id.text_TotalUtilizadoEsteMes);
        this.mViewHolder.textTotalPorMetroUtilizado = findViewById(R.id.text_TotalPorMetroUtilizado);
        this.mViewHolder.textTotalPagarPeloUsuario = findViewById(R.id.text_TotalPagarPeloUsuario);

        this.mViewHolder.buttonCalcular = findViewById(R.id.button_Calcular);

        this.clearValues();


    }

    public void CalcularValorAgua(View view) {
        String editEmpty;
        Double ValorAgua, ConsumoMetro, EsteMes, MesPassado, TaxaInteira;
        Double TaxaDividida, TotalPorMetro, TotalAgua;
        Double TotalUtilizado;

        editEmpty = CheckEditIsEmpty();

        if (editEmpty != "") {

            Toast.makeText(this, editEmpty, Toast.LENGTH_LONG).show();

        } else {
            EsteMes = Double.parseDouble(this.mViewHolder.editValorUtilizadoEsteMes.getText().toString());
            MesPassado = Double.parseDouble(this.mViewHolder.editValorUtilizadoMesPassado.getText().toString());
            ValorAgua = Double.parseDouble(this.mViewHolder.editValorAguaSemTaxaServico.getText().toString());
            ConsumoMetro = Double.parseDouble(this.mViewHolder.editValorConsumoPorMetro.getText().toString());
            TaxaInteira = Double.parseDouble(this.mViewHolder.editValorTaxaServico.getText().toString());

            TotalUtilizado = EsteMes - MesPassado;
            TaxaDividida = CalcularTaxaParaCadaUm(TaxaInteira);
            TotalPorMetro = CalcularTotalPorMetro(ValorAgua, ConsumoMetro);
            TotalAgua = CalcularTotalAPagar(TotalUtilizado, TaxaDividida, TotalPorMetro);


            this.mViewHolder.textTotalDividoEntre2Casas.setText("Taxa dividida entre as 2 casas:  R$" +String.format( "%.2f" , TaxaDividida)+" reais.");
            this.mViewHolder.textTotalUtilizadoEsteMes.setText(String.format( "Total utilizado este mês:  " + String.format( "%.2f" ,TotalUtilizado)+" metros."));
            this.mViewHolder.textTotalPorMetroUtilizado.setText(String.format( "Total por metro utilizado:  R$" +String.format( "%.2f" , TotalPorMetro)+" reais."));
            this.mViewHolder.textTotalPagarPeloUsuario.setText(String.format("Total a pagar pelo usuario:  R$" + TotalAgua)+" reais.");

        }
    }


    private static class ViewHolder {
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
