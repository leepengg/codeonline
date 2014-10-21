public class MergeSortedArray {
    public void merge(int A[], int m, int B[], int n) {
        int [] C = new int[m];
        for(int i = 0; i<m; i++){
            C[i] = A[i];
        }
        
        int indexC = 0;
        int indexB = 0;
        int indexA = 0;
        while(((indexC < m) && (indexB <n))){
            if(C[indexC] < B[indexB]){
                A[indexA] = C[indexC++];
            }else{
                A[indexA] = B[indexB++];
            }
            indexA++;
        }
        
        if(indexC == m){
            while(indexB < n){
                A[indexA++] = B[indexB++];
            }
        }else{
            while(indexC < m){
                A[indexA++] = C[indexC++];
            }
        }
        
    }
}
