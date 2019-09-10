
public class App {
    public static void main(String[] args) {
        LinkedListOfInteger l = new LinkedListOfInteger();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
		l.add(60);
        
        System.out.println(l);
        
        System.out.println("Elemento da posicao 2: " + l.get(2));
		
        l.remove(30);
		
        System.out.println("Lista apos a remocao do 30:\n" + l);

        System.out.println(l.removeByIndex(4));
        System.out.println("Lista apos a remocao by index:\n" + l);

		
    }
}