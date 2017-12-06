package afvink2blok6;

/**
 * @author yea-boi
 */
class afvink2 {
    public static void main ( String[] args ){

    int[] val = {0, 1, 2, 3};
    int sum = 0;
    for (int i : val)
        sum += i;
    System.out.println( "Sum of all numbers = " + sum );

    }
class opgave2{
        
    public void opgave2(){

    int[] val = {13, -4, 82, 17};
    int[] twice = {val[0]*2, val[1]*2, val[2]*2, val[3]*2} ;
    System.out.println( "Original Array: "
    + val[0] + " " + val[1] + " " + val[2] + " " + val[3]
    );
    System.out.println( "New Array: "
    + twice[0] + " " + twice[1] + " " + twice[2] + " " +
    twice[3] );
    }
}
class opgave3{
    public void opgave3(){
 
    int[] valA = { 13, -22, 82, 17};
    int[] valB = {-12, 24, -79, -13};   
    
    int[] sum = new int[valA.length];
    for (int i = 0; i < valA.length; ++i) {
    sum[i] = valA[i] + valB[i];
    }
    
    System.out.println( "sum: "
    + sum[0] + " " + sum[1] + " " + sum[2] + " " + sum[3]
    );
}
}
}