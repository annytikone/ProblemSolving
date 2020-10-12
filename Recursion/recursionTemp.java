class recursionTemp{
    public static void demonstrate(int test){
        System.out.println("test: "+test);
       if(test<1){
           return ;
       }
       else{
           demonstrate(test-1);
           return;
       }

    }
public static void main(String args[]) {
    System.out.println("Just a normal demonstration of recursion");
    demonstrate(5);
}
}