//https://app.codility.com/programmers/lessons/4-counting_elements/missing_integer/
public class MissingInteger {
    public static int solution(int[] A){
        int[] counter = new int[A.length];

        for(int i =0; i<A.length; i++){
            if(A[i] < 1){
                continue;
            }

            if(A[i] > counter.length){
                continue;
            }

            counter[A[i]-1]++;
        }

        for(int i =0; i<counter.length;i++){
            if(counter[i] == 0){
                return i+1;
            }
        }
        return counter.length+1;
    }
}
