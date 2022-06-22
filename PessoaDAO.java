import java.util.HashMap;

public class PessoaDAO {

    public void getById(Integer id){
        System.out.println(hash.getOrDefault(id,"Registro não encontrado"));    
    }
    
    public void getALL(){
        System.out.println("Registros: ");
        for(Map.EntryInteger, String> entry : hash.entrySet()){
            System.out.println("id: "+entry.getKey()+ " Nome "+entry.getValue());
        }
    }
    
    public void add(Integer id, String nome){
        hash.put(id,nome)
        System.out.println("Adicionado ID: "+id+" e Nome "+nome);
    }

    public void delete(Integer id){

        Integer key = 0;

        for(Map.EntryInteger, String> entry : hash.entrySet()){
            key = entry.getKey();
            
            
        hash.remove(id);
        System.out.println("Removido registro do id: "+id);

    }
}
