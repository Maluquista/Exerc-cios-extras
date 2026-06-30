package matrizexs;

public class bubblesort {

    public static void main(String[]args){

        int lista[] = {5,4,3,2,1};

        for(int i = 0; i < lista.length; i++){
            for(int x = 0; x < lista.length - 1;x++){

                if(lista[x] > lista[x + 1]){
                    int aux = lista[x];
                    lista[x] = lista[x + 1];
                    lista[x + 1] = aux;
                }
            }
        }

        for(int num: lista){

        System.out.print(num + " ");

        }
    }
}
