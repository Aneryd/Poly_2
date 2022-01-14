import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPolynomsApp {
    @Test
    void test1()  {
        float data[] = {1,2,3,0,5};
        assertEquals(6.1,CalculationPoly.calcpoly(data),0.1);
    }
    @Test
    void test2(){
        String data = "poly=q,w,e";
        assertEquals(0,CalculationPoly.calcpoly(AdaptationData.adaptationData(data)),0.1);
    }
    @Test
    void test3(){
        String data = "poly=1.2.3,q,w,e";
        assertEquals(5.5,CalculationPoly.calcpoly(AdaptationData.adaptationData(data)),0.1);
    }
    @Test
    void test4(){
        String data = "0";
        assertEquals(0,CalculationPoly.calcpoly(AdaptationData.adaptationData(data)),0.1);
    }

}