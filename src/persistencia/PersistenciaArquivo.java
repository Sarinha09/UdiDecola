package persistencia;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class PersistenciaArquivo {
    
    public static void gravar(Object o, String nome)  {
	FileOutputStream f;
	ObjectOutputStream oS;
	try {
            f = new FileOutputStream(nome);
            oS = new ObjectOutputStream(f);
            oS.writeObject(o);
			
            oS.flush();
            oS.close();
	} 
        catch (IOException e) {			
            e.printStackTrace();
             System.out.println("Objeto não serializável: " + e.getMessage());
        }
    }
    
    public static Object recuperar(String nome) throws IOException, ClassNotFoundException {
	FileInputStream f = new FileInputStream(nome);
	ObjectInputStream oS = new ObjectInputStream(f);
		
	Object obj = oS.readObject();
		
	oS.close();
	return obj;
    }
    
     public static <T> void atualizarArquivo(ArrayList<T> lista, String arquivo) {
        try {
            FileOutputStream fileOut = new FileOutputStream(arquivo);
            fileOut.close();

            PersistenciaArquivo.gravar(lista, arquivo);
        } catch (IOException e) {
            e.printStackTrace();
             System.out.println("Objeto não serializável: " + e.getMessage());
            
        }
    }
    
    
}
