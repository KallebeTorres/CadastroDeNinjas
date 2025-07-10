package skg.Cadastro_De_Ninjas.Missoes;

import jakarta.persistence.*;
import skg.Cadastro_De_Ninjas.Ninjas.NinjaModel;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;
    // @OneToMany uma missao pode ter varios ninjas
    @OneToMany(mappedBy = "missoesModel")
    private List<NinjaModel> ninjaModel;

    public MissoesModel() {
    }

    public MissoesModel(String nomeMissão, String dificuldade) {
        this.nome = nomeMissão;
        this.dificuldade = dificuldade;
    }

    public String getNomeMissão() {
        return nome;
    }

    public void setNomeMissão(String nomeMissão) {
        this.nome = nomeMissão;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }
}
