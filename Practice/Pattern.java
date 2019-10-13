public class Pattern{
    public static void main(String[] a)
    {
        int no = 5,i,j,space=no-1,track=1;
        for(i=1;i<(no*2);i++)
        {
            if(i%2!=0){
                int add = 1;
                for(int s = space;s>=1;s--){
                    System.out.print(" ");
                }
                space--;
                add = track;
                for(j=1;j<=i;j++){
                    if(j<=((i/2))){
                        System.out.print(add);
                        add=add+1;
                    }
                    else{
                        System.out.print(add);
                        add=add-1;
                    }
                }
                track++;
                System.out.println();
            }
        }
    }
}