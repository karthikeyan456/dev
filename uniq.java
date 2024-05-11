// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int arr[]={1,2,2,1,8};
        int a=0;
        for(int i:arr){
            a=a^i;
        }
        System.out.println(a);
    }
}
