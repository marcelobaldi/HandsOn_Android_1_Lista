package marcelobaldi.listarecyclerview.model;
import java.io.Serializable;

public class DogModel implements Serializable {
    //Atributos
    private Integer id;
    private String  nome;
    private Integer idade;
    private Integer imagem;

    //Construtor - Vazio (Manual), Sem Id (Salvar), Com Id (Editar)
    public DogModel() { }
    public DogModel(Integer id, String nome, Integer idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }
    public DogModel(Integer id, String nome, Integer idade, Integer imagem) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.imagem = imagem;
    }

    //GetterSetter
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getIdade() {
        return idade;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    public Integer getImagem() {
        return imagem;
    }
    public void setImagem(Integer imagem) {
        this.imagem = imagem;
    }

    //To String
    @Override public String toString() {
        return "DogModel{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", imagem=" + imagem +
                '}';
    }
}

