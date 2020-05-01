package myhack;

public class JumpingOnCloudsApp {
    static int jumpingOnClouds(int[] clouds) {
        int len=clouds.length;
        int SAFE=0;
        int counter=0;
        int curr=0;

        while (curr<len-1){
            if (curr+2<len && clouds[curr+2]==SAFE){
                counter++;
                curr+=2;
                continue;
            }
            if (curr+1<len && clouds[curr+1]==SAFE){
                counter++;
                curr+=1;
                continue;
            }
            throw new RuntimeException("no way");
        }

        return counter;
    }

    public static void main(String[] args) {
        int[] c={0, 0, 0, 0, 1, 0};
        int minJumps = jumpingOnClouds(c);  //3
        System.out.println(minJumps);
    }
}
