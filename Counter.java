public class Counter {
    int count=0;

    public void addOne(){
        count++;
        System.out.println(count);
    }
    public void minusOne(){
        count--;
        System.out.println(count);
    }

    public void addTen(){
        count=count+10;
        System.out.println(count);

    }
    public void minusTen(){
        count=count-10;
        System.out.println(count);
    }

    public void reset(){
        count=0;
        System.out.println(count);
    }

    public static void main(String[] args){
        Counter counter1 = new Counter();
        Counter counter2= new Counter();

        counter1.addTen();
        counter1.addTen();
        counter1.addOne();
        counter1.addOne();
        counter1.addOne();

        counter2.minusTen();
        counter2.minusTen();
        counter2.minusTen();
        counter2.minusTen();
        counter2.minusTen();
        counter2.addOne();
        counter2.addOne();
        counter2.addOne();

        
    }
}
