
package pkg56_mi_string;


public class Main {

    
    public static void main(String[] args) {
       
        MiString mistring = new MiString();
        
        System.out.println(MiString.alReves("Carlos"));
        System.out.println(MiString.limpiaCaracteres("Hola", "Ha"));
        System.out.println(MiString.sustituye("Carlos", 'a', 'o'));
        System.out.println(MiString.todosIguales("xcc"));
        System.out.println(MiString.quitaEspacios("Hola qe tal"));
        System.out.println(MiString.esNumeroEntero("1234"));
    }
    
}
