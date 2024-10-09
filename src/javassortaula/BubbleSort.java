package javassortaula;

import java.util.Comparator;

public class BubbleSort<T> {
        
    private long contaComparacoes;

    public long getContaComparacoes() {
        return contaComparacoes;
    }

    void troca(T[] v, int i, int j){
        T temp = v[i];
        v[i] = v[j];
        v[j] = temp;
    }
    public void sort(T v[], Comparator<T> comparador){
        int n = v.length;
        this.contaComparacoes = 0;
        for(int fase=1;fase<n;fase++){
            for(int j=0;j<n-fase;j++){
                contaComparacoes++;
                if(comparador.compare(v[j], v[j+1])>0){
                    troca(v,j,j+1);
                 }
            }
               
        }
    }
    
}
