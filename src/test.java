public class test {
    int i;
    private test(){
        i=5;
        System.out.println( "Constructor is called");
    }
    public static void main(String[] args){
        test obj=new test();
        System.out.println("Value of i:"+obj.i);
    }
}


