public class Nodo {
    private Object data;
    private Nodo siguiente,anterior;
    public void setData(Object o){
        data=o;
    }
    public Object getData(){
        return data;
    }
    public Nodo getNext(){
        return siguiente;
    }
    public void setNext(Nodo n){
        siguiente=n;
    }
    public Nodo getBefore(){
        return anterior;
    }
    public void setBefore(Nodo n){
        anterior=n;
    }

}
