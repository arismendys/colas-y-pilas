/*
En esta clase crearemos una cola y una pila con y luego la llenaremos con los valores de dos arreglos de enteros,
luego de esto recorreremos la pila y la cola para añadir sus valores a una lista.

Se recomienda dar un vistazo al recorrido de la pila ya que este for se hace con decrecimiento de la unidad y no con
aumento de la unidad puesto que el metodo pop de la pila va disminuyendo su tamaño cada vez que extrae un nodo.

El recorrido de la pila tambien podria realizarce con un while "while(pila.size!=0)"

Al final imprimeremos los valores que furon enviados a la pila y cola, y mostraremos como estos sevisualizan al recorrerlas.
 */
package Listas;

import java.io.FileNotFoundException;

/**
 *
 * @author Arismendys Marte
 */
public class ColaPilaenLista {
    
    
    private  static int[] valorescola = {60,75,66,85,42,14,73,72,2,54};
    private static int[] valorespila = {10,45,78,70,20,56}; 
    public static void main(String[] args) throws FileNotFoundException {

        Nodo n,a,b;
        Pilas pila =new Pilas();
        Colas cola =new Colas();
        Lista lista= new Lista();
        try {
            int i=0;
            System.out.print("\033[31mDatos enviados a la pila: \033[32m{");
            for(i=0;i<valorespila.length;i++){
                a = new Nodo();
                a.setData(valorespila[i]);
                pila.push(a);
                System.out.print(" "+valorespila[i]);
            }
            System.out.print(" }\n\033[31mDatos en la Pila: \033[32m{");
            for(int z=pila.size();z>0;z--){
                n = new Nodo();
                n.setData(pila.peek().toString());
                lista.Agregar(n);
                System.out.print(" "+pila.peek().toString());
                pila.pop();
            }
            System.out.print(" } \n\033[31mDatos enviados a la cola: \033[32m{");
            for(i=0;i<valorescola.length;i++){
                b = new Nodo();
                b.setData(valorescola[i]);
                cola.push(b);
                System.out.print(" "+valorescola[i]);
            }
            System.out.print(" } \n\033[31mDatos en la Cola: \033[32m{");
            for(int z=cola.size();z>0;z--){
                n = new Nodo();
                n.setData(cola.peek().toString());
                lista.Agregar(n);
                System.out.print(" "+cola.peek().toString());
                cola.pop();
            }
            System.out.print(" }\n");
            System.out.print("\033[31mLos Datos de la Lista al unir la Pila y la Cola en ella son: \033[32m{");
            for(int x=0;x<lista.size();x++){
                System.out.print(" "+lista.get(x).getData().toString());
            }
            System.out.print(" }");
        }catch(Exception ex){ ex.printStackTrace(); }
        
        
    
    }
    
}
