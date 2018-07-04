import org.junit.jupiter.api.Test;

public class SortTest {
   private void swap(int a[],int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    @Test
    void bubbleSortAsc(){
        int meta[] = { 6, 5, 3, 1, 8, 7, 2, 4 };
        for(int m : meta){
            System.out.print(m);
        }
        for(int j = 0; j < meta.length - 1;j++){
            for(int i = 0; i < meta.length - 1 - j;i++){
                if (meta [i] > meta [i+1]){
                    swap(meta,i,i+1);
                }
            }
        }
        for(int m : meta){
            System.out.print(m);
        }
    }

    @Test
    void bubbleSortDesc(){
        int meta[] = { 6, 5, 3, 1, 8, 7, 2, 4 };
        for(int m : meta){
            System.out.print(m);
        }
        for(int j = 0; j < meta.length - 1;j++){
            for(int i = 0; i < meta.length - 1 - j;i++){
                if (meta [i] < meta [i+1]){
                    swap(meta,i,i+1);
                }
            }
        }
        for(int m : meta){
            System.out.print(m);
        }
    }

    @Test
    void selectionSort(){
        int meta[] = { 6, 5, 3, 1, 8, 7, 2, 4 };
        for(int m : meta){
            System.out.print(m);
        }

        for(int i = 0; i < meta.length - 1; i++){
            int min = i;
            for(int j = i + 1; j < meta.length; j++){
                if(meta[j] < meta[min]){
                    min = j;
                }
            }

            if(min != i){
                swap(meta,min,i);
            }
        }

        for(int m : meta){
            System.out.print(m);
        }
    }

    @Test
    void insertionSort(){
        int meta[] = { 6, 5, 3, 1, 8, 7, 2, 4 };
        for(int m : meta){
            System.out.print(m);
        }

        for(int i = 1; i < meta.length; i++){
            int get = meta[i];
            int j = i - 1;
            while (j >= 0 && meta[j] > get){
                meta[j + 1] = meta[j];
                j--;
            }

            meta[j + 1] = get;
        }
    }
}
