public class CalcPoly {
    public static float calcpoly(float[] data) {
        int length;
        length = data.length;
        float answer = 0;
        for (int i = 0; i < length; i++) {
            float x;
            x = data[i];
            if(x > 0){
                answer = (1 / x) * 3 + answer;
            }
        }
        System.out.println(answer);
        return answer;
    }
}