public class Colas {
    private Nodo head;
    private int cant = 0;
    
    Colas (Nodo n){ 
        head = n; 
    }
    Colas (){}

        public void push (Nodo n){
            Nodo l = null;
            cant++;
            if (head == null) head = n;
            else
            {
                for (l = head; l.getNext() != null; l=l.getNext());
                l.setNext(n);
            }
        }
        public Nodo pop() {
            Nodo l=head;
            head=head.getNext();
            cant--;
            return l;
        }
        public Object peek(){
            return head.getData();
        }
        public int size(){ 
            return cant; 
        }
}
