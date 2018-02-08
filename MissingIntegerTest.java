import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingIntegerTest {
    @Test
    void solution() {
        int[] A = {1,3,6,4,1,2};
        assertEquals(5,MissingInteger.solution(A));

        int[] B = {-1,-3};
        assertEquals(1,MissingInteger.solution(B));

        int[] C = {-1,1,-2,2,-3,-4,4};
        assertEquals(3,MissingInteger.solution(C));

        int[] D = {2};
        assertEquals(1,MissingInteger.solution(D));

        int[] E = {1,2,3};
        assertEquals(4,MissingInteger.solution(E));

    }

}