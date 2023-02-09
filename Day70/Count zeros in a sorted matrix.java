//Given a N X N binary Square Matrix where each row and column of the matrix is sorted in ascending order. Find the total number of zeros present in the matrix.

class GfG{
    /*you are required to complete this method*/
    int countZeros(int A[][], int N){
      int count=0;
      for(int i=0;i<N;i++){
          for(int j=0;j<N;j++){
            if(A[i][j]==0){
                count++;
            }
          }
      }
      return count;
    }
}
