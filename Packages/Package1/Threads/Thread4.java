class Thread4{
    public static void main(String[] args) {
        new Thread(()->{
            for(int i=0;i<10;i++)
            System.out.println("In thread "+i);
        }).start();
    }
}