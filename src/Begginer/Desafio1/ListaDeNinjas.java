package Begginer.Desafio1;

import java.util.ArrayList;
import java.util.List;

public class ListaDeNinjas<T>{
    private List<T> ninjas;

    public void adicionarNinjas(T ninja){
        ninjas.add(ninja);
    }

    public void mostrarNinjas() {
        for(T ninja: ninjas){
            System.out.println(ninja);
        }
    }

    public ListaDeNinjas() {
        this.ninjas = new ArrayList<>();
    }


}
