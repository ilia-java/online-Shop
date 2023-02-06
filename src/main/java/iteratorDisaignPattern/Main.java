package iteratorDisaignPattern;

public class Main {
    public static void main(String[] args) {
        MyIterator iterator=new BooksCollection().createIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
