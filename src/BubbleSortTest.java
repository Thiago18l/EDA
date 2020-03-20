public class BubbleSortTest {    
    public static void main(String[] args) {
        /**
         *  Para cada um dos testes apenas descomentar as 
         *  linhas de código do tamanho que você deseja.
         *  O objeto *ordena* recebe os métodos da classe Ordenar
         */
        Ordenar ordena = new Ordenar();
        /* 
        10^6 =>
        int [] array = new int[1000000];
        for (int i =0; i < array.length; i++){
            array[i] = (int)(Math.random()*1000000);
        }
        */

        //10^5 =>
        /* int [] array = new int[100000];
        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*100000);
        } */
        
        //10^4 =>
        /* int [] array = new int[10000];
        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*10000);
        } */

        //10^3 =>
        /*
        int [] array = new int[1000];
        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*1000);
        }
        */
        //Para o melhor caso:
        /* 
        int array[] = new int[100000];
        for (int i = 0; i < 100000; i++){
            array[i] = i;
        } */
        
        // Para o pior caso:
        int array[] = new int[100000];
        for (int i = 99999; i >= 0; i--){
            array[i] = i; 
        }
        ordena.BubbleSort(array);
    }
}