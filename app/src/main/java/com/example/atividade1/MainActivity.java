package com.example.atividade1;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.atividade1.contato.ContatoPessoal;
import com.example.atividade1.contato.ContatoProfissional;
import com.example.atividade1.dispositivo_eletronico.Computadores;
import com.example.atividade1.dispositivo_eletronico.Smartphones;
import com.example.atividade1.financa_pessoal.Despesa;
import com.example.atividade1.financa_pessoal.GestorFinanceiro;
import com.example.atividade1.financa_pessoal.Receita;
import com.example.atividade1.financa_pessoal.Transacao;
import com.example.atividade1.investimento.Acoes;
import com.example.atividade1.investimento.GestorInvestimentos;
import com.example.atividade1.investimento.Imoveis;
import com.example.atividade1.investimento.Investimento;
import com.example.atividade1.veiculo.Carro;
import com.example.atividade1.veiculo.Moto;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Log.i("veiculo", atividade1Veiculo());
        Log.i("dispositivo eletronico", atividade2DispositivosEletronicos());
        Log.i("contato", atividade3Contato());
        Log.i("finança pessoal", atividade4FinancaPessoal());
        Log.i("investimento", atividade5Investimentos());
    }

    private String atividade1Veiculo(){
        Carro carro = new Carro("001", "Toyota", "Corolla", 2022, 180);
        carro.trocarMarcha(2);

        Moto moto = new Moto("002", "Honda", "CB 500", 2023, 200, true);

        return carro.toString()  + "\n" +
                moto.toString();
    }

    private String atividade2DispositivosEletronicos(){
        Computadores computador = new Computadores(
                "Laptop", "Dell", "XPS 13", 2023, true, "Preto"
        );

        Smartphones smartphone = new Smartphones(
                "Smartphone", "Samsung", "Galaxy S23", 2023, true, 5000
        );

        return computador.toString()  + "\n" +
                smartphone.toString();

    }

    private String atividade3Contato(){
        ContatoPessoal contatoPessoal = new ContatoPessoal("Maria", "1234-5678", "@maria_social");
        ContatoProfissional contatoProfissional = new ContatoProfissional("João", "9876-5432", "joao@empresa.com");

        return contatoPessoal.toString()  + "\n" +
                contatoProfissional.toString();
    }

    private String atividade4FinancaPessoal(){
        Despesa despesa1 = new Despesa("Aluguel", 1500, "Moradia");
        Despesa despesa2 = new Despesa("Supermercado", 300, "Alimentação");
        Receita receita1 = new Receita("Salário", 5000, "Renda");
        Receita receita2 = new Receita("Freelance", 1200, "Renda Extra");

        ArrayList<Transacao> transacoes = new ArrayList<>();
        transacoes.add(despesa1);
        transacoes.add(despesa2);
        transacoes.add(receita1);
        transacoes.add(receita2);

        GestorFinanceiro gestorFinanceiro = new GestorFinanceiro(transacoes);

        String informacoes = gestorFinanceiro.obterInformacoesFinanceiras(1000);  // Limite de revisão de transações

        return informacoes;
    }

    public String atividade5Investimentos(){
        Acoes acoes1 = new Acoes("Investimento em Ações XYZ", 10000, 12);
        Imoveis imovel1 = new Imoveis("Investimento em Imóvel Comercial", 50000, 8);
        Acoes acoes2 = new Acoes("Investimento em Ações ABC", 20000, 10);

        ArrayList<Investimento> investimentos = new ArrayList<>();
        investimentos.add(acoes1);
        investimentos.add(imovel1);
        investimentos.add(acoes2);

        GestorInvestimentos gestorInvestimentos = new GestorInvestimentos(investimentos);

        return gestorInvestimentos.obterInformacoesInvestimentos(500);  // Limite de revisão de investimentos
    }
}