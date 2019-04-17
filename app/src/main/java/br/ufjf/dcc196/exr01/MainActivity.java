package br.ufjf.dcc196.exr01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView nome;
    private TextView sobrenome;
    private TextView nomecompleto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botao = findViewById(R.id.botao_nome);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nome = findViewById(R.id.usuario_nome);
                sobrenome = findViewById(R.id.usuario_sobrenome);
                nomecompleto = findViewById(R.id.nome_completo);
                nomecompleto.setText("");
                nomecompleto.setText(nome.getText().toString()+" "+sobrenome.getText().toString());
            }
        });

    }
}
