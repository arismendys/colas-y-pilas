public class Lista {
    private Nodo head;
    private int cant = 0;
    
    Lista (Nodo n){ 
        head = n; 
    }
    Lista (){}

    public Nodo getHead() {
        return head;
    }
    public void Agregar (Nodo n){
        Nodo l = null;
        cant++;
        
        if (head == null) head = n;
        else
        {
            for (l = head; l.getNext() != null; l=l.getNext());
                l.setNext(n);
        }
    }
    public void AgregarPrimero (Nodo n){
        cant++;
        if (head == null) head = n;
        else
        {
            n.setNext(head);
            head = n;
        }
    }
    public int size(){ 
        return cant; 
        }
    public Nodo get(int pos){
        int i = 0;
        Nodo l;
        if (cant >= pos && pos >= 0)
        {
            if(pos == 0) return head;
            for (i = 0, l = head ; i < pos ; i++, l = l.getNext());
                return (l);
        }
        return null;
    }
    public void Eliminar (Nodo d){
        Nodo l;
        cant--;
        if(d==head)
        {
            head=head.getNext();
        }
        else
        {
            for(l=head; l.getNext()!=d;l=l.getNext());
                l.setNext(d.getNext());
        }  
    }
}
