public class Ordenar {
    /**
     * 
     * @param array
     */
    public void BubbleSort(int array[]){
        System.out.println("Bubble sort");
        for (int i = 0; i < array.length-1; i++){
            for(int j = 0; j < array.length-i-1; j++){
                if (array[j] > array[j+1]){
                    int t = array[j];
                    array[j] = array[j+1];
                    array[j+1] = t;
                }
            }
        }
        
    }
    /**
     * 
     * @param array
     */
    public void InsertSort(int array[]){
        System.out.println("InsertSort");
            int length = array.length;
            for (int i = 1; i < length; i++){
                int aux = array[i];
                int j = i;
                
                while ((j > 0) && (array[j-1] > aux)){
                    array[j] = array[j-1];
                    j -= 1;
                }
                array[j] = aux;
            }
    }

    /**
     * 
     * @param array
     */
    public void SelectionSort(int array[]){
        System.out.println("SelectionSort");
        int length = array.length;
        for (int i = 0; i < length -1; i++){
            int index = i;
            for (int j = i + 1; j < length; j++){
                if (array[j] < array[index]){
                    index = j;
                }
            }
            int menorNumero = array[index];
            array[index] = array[i];
            array[i] = menorNumero;
        }
    }
}