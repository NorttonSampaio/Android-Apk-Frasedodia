package frasedodia.cursoandroid.com.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textoNovaFrase;
    private Button botaoNovaFrase;

    private String[] frases = {
            "Enfrente os problemas e leve a melhor!",
            "Dê mais atenção ao que você tem de bom na sua vida",
            "Para chegar ao topo, o que importa é começar!",
            "De nada adianta ter sonhos, se você não se empenhar em correr atrás",
            "Não deixe nada nem ninguém estragar o seu bom humor",
            "Ontem já passou, é hora de planejar o futuro",
            "Você pode não ter o melhor do mundo, mas tem muito pelo que agradecer!",
            "Não deixe sua felicidade nas mãos de ninguém!",
            "Nunca é tarde para fazer o que você realmente quer fazer",
            "Mais palavras para quê?",
            "Nunca duvide que você é especial!",
            "Tenha um objetivo na vida e lute sempre para alcançá-lo!"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoNovaFrase = (TextView) findViewById(R.id.textoNovaFraseId);
        botaoNovaFrase = (Button) findViewById(R.id.botaoNovaFraseId);

        botaoNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rand = new Random();
                textoNovaFrase.setText(frases[rand.nextInt(frases.length)]);
            }
        });
    }
}
