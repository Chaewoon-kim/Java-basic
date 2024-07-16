package static2.ex;

public class MathArrayUtils {
    //요구사항 1. 객체 생성 x , 인스턴스 생성 x
    //2. 실행코드에 static import 를 사용해도 됨

   private MathArrayUtils(){
        //private 접근 제어자를 통해 인스턴스 생성을 막을 수 있음.
   }


   //sum 생성자 메서드
   public static int sum(int[] values){
       int total = 0;
       for(int i = 0; i < values.length; i++){
           total += values[i];
       }
       return total;
   }

    //average 생성자
    public static double average(int[] values){
       return (double)sum(values) / values.length;
    }

    //min 생성자
    public static int min(int[] values){
        int minValue = values[0];
       for(int i  = 1; i < values.length; i++){
           if(minValue > values[i]){
               minValue = values[i];
           }
       }
       return minValue;
    }

    //max 생성자
    public static int max(int[] values){
       int maxValue = values[0];
       for(int i = 1; i < values.length; i++){
           if(maxValue < values[i]){
               maxValue = values[i];
           }
       }
       return maxValue;
    }

    }
