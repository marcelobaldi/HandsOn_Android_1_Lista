package marcelobaldi.listarecyclerview.view;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import marcelobaldi.listarecyclerview.R;
import marcelobaldi.listarecyclerview.adapter.DogAdapter;
import marcelobaldi.listarecyclerview.databinding.ActivityDogListBinding;
import marcelobaldi.listarecyclerview.model.DogModel;

public class DogListActivity extends AppCompatActivity {
    //Atributos
    private ActivityDogListBinding  binding;
    private DogAdapter              dogAdapter = new DogAdapter(DogListActivity.this);

    //Metodo Inical
    @Override protected void onCreate(Bundle savedInstanceState) {super.onCreate(savedInstanceState);
        //Tela Xml
        binding = DataBindingUtil.setContentView(this, R.layout.activity_dog_list);

        //Lista - Layout
        LinearLayoutManager listaLayout = new LinearLayoutManager(this,
                                                LinearLayoutManager.VERTICAL, false);
        //Lista - Montatem
        binding.dogListRecycleXml.setLayoutManager(listaLayout);
        binding.dogListRecycleXml.setAdapter(dogAdapter);

        //Lista - Conteudo
        listaDados();
    }

    //Método - Conteúdo Lista
    private void listaDados(){
        //Lista - Conteúdo
        List<DogModel> listaDogs = new ArrayList<>();
        listaDogs.add(new DogModel(1,  "Vira Lata",       2,  R.drawable.viralata));
        listaDogs.add(new DogModel(2,  "Basset",          5,  R.drawable.basset));
        listaDogs.add(new DogModel(3,  "Doberman",        7,  R.drawable.doberman));
        listaDogs.add(new DogModel(4,  "Golden Retriever",12, R.drawable.golden));
        listaDogs.add(new DogModel(5,  "Husky",           9,  R.drawable.husky));
        listaDogs.add(new DogModel(6,  "Labrador",        1,  R.drawable.labrador));
        listaDogs.add(new DogModel(7,  "Pinsher",         5,  R.drawable.pinscher));
        listaDogs.add(new DogModel(8,  "PitBull",         11, R.drawable.pitbull));
        listaDogs.add(new DogModel(9,  "Poodle",          14, R.drawable.poodle));
        listaDogs.add(new DogModel(10, "São Bernardo",    8,  R.drawable.saobernardo));
        listaDogs.add(new DogModel(11, "Shitzu",          3,  R.drawable.shitzu));
        Log.d("meuLog", listaDogs.toString());

        //Lista - Adapter
        dogAdapter.atualizarLista(listaDogs);
    }
}

