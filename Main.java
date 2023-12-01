public class Main{

    public static void main(String args[]){

        int i = 1; 
        while(i<11){
            //System.out.println(i+" "); 
            System.out.println(spaces(i)); 
            i++; 
        }

    }

    public static String spaces(int num){

        String answer = ""+num; 

        while(answer.length()<10){
            answer= " "+answer; 
        }

        return answer; 

    }





}