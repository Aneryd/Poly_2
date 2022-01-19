public class AdaptData {
    public static float[] adaptData(String data){
        String value;
        value = data;
        char[] strToArray = value.toCharArray();
        float[] chToArray = new float[value.length()];
        char ch;
        for (int i = 0; i < value.length(); i++) {
            ch = strToArray[i];
            if(Character.isDigit(ch)){
                chToArray[i] = Character.getNumericValue(ch);
            }
        }
        return chToArray;
    }
}