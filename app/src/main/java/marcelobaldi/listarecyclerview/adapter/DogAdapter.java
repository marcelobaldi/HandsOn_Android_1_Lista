package marcelobaldi.listarecyclerview.adapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

import marcelobaldi.listarecyclerview.databinding.AdapterDogLinhaBinding;
import marcelobaldi.listarecyclerview.model.DogModel;

public class DogAdapter extends RecyclerView.Adapter<DogAdapter.DogHolder> {
    //Atributos
    private final Context           contexto;
    private final List<DogModel>    listaDogs = new ArrayList<>();

    //Construtor
    public DogAdapter(Context contexto) {this.contexto = contexto;}

    //Lista - Atualizar
    public void atualizarLista(List<DogModel> listaAtualizada){
        listaDogs.clear();
        listaDogs.addAll(listaAtualizada);
        notifyDataSetChanged();
    }

    //Lista - Tamanhho
    @Override public int getItemCount() { return listaDogs.size(); }

    //Linha - Configuração
    @NonNull @Override public DogHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Inflater
        LayoutInflater inflaterX = LayoutInflater.from(parent.getContext());

        //Arquivo XML
        AdapterDogLinhaBinding adptLinha = AdapterDogLinhaBinding.inflate(inflaterX, parent, false);

        //Classe Holder
        return new DogHolder(adptLinha);
    }

    //Linha - Objetos e Eventos
    @Override public void onBindViewHolder(@NonNull DogHolder holderXY, int positionY) {
        //Objetos
        DogModel dog = listaDogs.get(positionY);
        holderXY.bindingAdapterXml.dogAdptNomeXml.setText(dog.getNome());
        holderXY.bindingAdapterXml.dogAdptIdadeXml.setText(String.valueOf(dog.getIdade()));
        holderXY.bindingAdapterXml.dogAdptImagemXml.setImageResource(dog.getImagem());

        //Eventos
        holderXY.bindingAdapterXml.dogAdptImagemXml.setOnClickListener(view -> {
            Toast.makeText(contexto, String.valueOf(listaDogs.get(positionY).getId()), Toast.LENGTH_SHORT).show();
        });
    }

    //Linha - Classe Holder
    public static class DogHolder extends RecyclerView.ViewHolder {
        //Atributos
        public AdapterDogLinhaBinding bindingAdapterXml;

        //Construtor
        public DogHolder(AdapterDogLinhaBinding bindingAdapter) {
            super(bindingAdapter.getRoot());
            this.bindingAdapterXml = bindingAdapter;
        }
    }
}


