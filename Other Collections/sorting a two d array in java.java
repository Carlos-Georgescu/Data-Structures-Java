// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        int[][] twoD = new int[3][2];
        
        twoD[0][0] = 0;
        twoD[0][1] = 5;
        twoD[1][0] = 4;
        twoD[1][1] = 3;
        twoD[2][0] = 2;
        twoD[2][1] = 1;
        
        java.util.Arrays.sort(twoD, new java.util.Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return Double.compare(a[1], b[1]);
            }
        });

        java.util.Arrays.sort(nameOfArray, new java.util.Comparator<int[]>(){
            public int compare(int[]a, int[] b){
                return Double.compare(a[which ever index you want to sort by], b[whichever]);
            }
        });
        
        for(int[] oneD : twoD){
            System.out.print(oneD[0]);
            System.out.print(oneD[1]);
            System.out.println();
        }
    }
}