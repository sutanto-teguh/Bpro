public class MyMathTools {
    public static int random(int min, int max){
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }
    public static int cariMin(int []data){
        int max=data[0];
        for(int i=0;i<data.length;i++){
            max=Math.max(max, data[i]);
        }
        return max;
    }
    public static int cariMax(int []data){
        int min=data[0];
        for(int i=0;i<data.length;i++){
            min=Math.min(min, data[i]);
        }
        return min;
    }
}

