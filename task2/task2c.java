public class t2intersection {
    public static void main(String[] args) {
        int[][] A = {{1,3},{5,6},{7,9}}, B = {{2,5},{7,8}};
        int i=0, j=0;
       
        while(i<A.length && j<B.length) {
            int s=Math.max(A[i][0],B[j][0]), e=Math.min(A[i][1],B[j][1]);
            if(s<=e) System.out.println("["+s+","+e+"]");
            if(A[i][1]<B[j][1]) i++; else j++;
        }
    }
}
