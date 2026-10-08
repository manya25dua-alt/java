class store{
    String title;
    String author;
    int price;
    store(String title,String author,int price){
        this.author=author;
        this.title=title;
        this.price=price;
    }
    void display(){
        System.out.println("title: "+title+" Author: "+author+"price: "+price);
    }
}
public class BookStore {
    public static void main(String args[]){
        store s=new store("The Alchemist\n","Paulo Coelho\n ",250);
        s.display();


}
}
