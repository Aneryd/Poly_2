import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPolynomsApp {
    @Test
    void test1()  {
        float data[] = {1,2,3,0,5};
        assertEquals(6.1, CalcPoly.calcpoly(data),0.1);
    }
    @Test
    void test2(){
        String data = "q,w,e";
        assertEquals(0, CalcPoly.calcpoly(AdaptData.adaptData(data)),0.1);
    }
    @Test
    void test3(){
        String data = "1.2.3,q,w,e";
        assertEquals(5.5, CalcPoly.calcpoly(AdaptData.adaptData(data)),0.1);
    }
    @Test
    void test4(){
        String data = "0";
        assertEquals(0, CalcPoly.calcpoly(AdaptData.adaptData(data)),0.1);
    }

}