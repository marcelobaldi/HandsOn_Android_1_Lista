package marcelobaldi.listarecyclerview;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import marcelobaldi.listarecyclerview.view.DogListActivity;

public class MainActivity extends AppCompatActivity {

    //Método Inicial
    @Override protected void onCreate(Bundle savedInstanceState){super.onCreate(savedInstanceState);
        //Tela XMl
        setContentView(R.layout.activity_main);

        //Redirecionamento
        startActivity(new Intent(this, DogListActivity.class));
    }
}

//Redirecionamento Não Otimizado
//- Intent intent = new Intent(this, DogListActivity.class);
//- startActivity(intent);

//Lista Fixa Não Otimizada
//- DogModel dog1 = new DogModel (1, "Bart", 10, R.drawable.bart);
//- listaDogs.add(dog1);

//Alinhamentos Objetos/Textos (Xml)
//android:textAlignment="textStart"
//android:gravity="left"
//android:layout_marginLeft="30sp"  // android:layout_marginStart="30sp"
//android:paddingStart="30sp"

//Tratamento de Foco de Imagem (Xml)
//android:scaleType="centerCrop"    // Outros ...



