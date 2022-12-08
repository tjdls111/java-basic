public class Array {
     public static void main(String[] args){
         String[] MBTI={"ENFP","ENFJ","ENTP","ENTJ","INFP","INFJ"};
         for (int i = 0 ; i < MBTI.length; i ++) {
             System.out.println(MBTI[i]);
         }

         for (String personality:MBTI) {
             System.out.println(personality);
         }

     }
}
