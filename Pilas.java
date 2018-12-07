public class Pilas {
    private Nodo head;
    private int cant = 0;
    
    Pilas (Nodo n){ 
            head = n;
            }
    Pilas (){}
        public void push (Nodo n){
            cant++;
            if (head == null) head = n;
            else
            {
                n.setNext(head);
                head = n;
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
