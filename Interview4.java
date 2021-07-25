public class Interview4 {

public static char[] shiftRight(char [] arr){

    //SUBHAYU
    //USUBHAY
    //YUSUBHA
    char temp =arr[arr.length-1];
    for( int i =arr.length-1; i>0; i--){
        arr[i] = arr[i-1];

    }
    arr[0]= temp;
    return arr;
}
    public static void main( String args[]) {
        char [] arr = {'S','U','B','H','A','Y','U'};
        System.out.println(shiftRight(arr));
        System.out.println(shiftRight(arr));
    }

}
