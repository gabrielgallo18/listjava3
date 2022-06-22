import java.util.HashMap;


public class main {

    public static void main (String [] args) {

        PessoaDAO DAO = new PessoaDAO();
        Pessoa pessoa = new Pessoa();

        Integer paramsa = 0;
        String paramsb = "";
        String escolha = "";
        boolean sair = false;

        do{
            System.out.println("Qual sua escolha?");
            System.out.println("I - Encontrar um registro pelo ID");
            System.out.println("M - Mostrar todos");
            System.out.println("A - Adicionar um novo registro");
            System.out.println("R - Remover");
            System.out.println("ESC - Encerrar");

            Scanner leitor = new Scanner (System.in);
            escolha = leitor.nextLine();

            switch (escolha) {
                case "E":
                    System.out.println("Qual o ID?");
                    paramsa = leitor.nextLine()
                    DAO.getByID(paramsa);
                    leitor.close();
                    break;
                
                case "M":
                    DAO.getAll();
                    break;

                case "A":
                    System.out.println("Qual o ID do registro para adicionar?");
                    paramsa = leitor.next.Int();
                    System.out.println("Qual o nome do registro para adicionar?");
                    paramsb = leitor.nextLine();
                    DAO.add(paramsa, paramsb);
                    break;

                case "R":
                    DAO.delete(id);
                    break;
                
                case "ESC":
                    DAO.encerrar();
                    break;
                    System.out.println("\n Encerrando \n");
                    sair = true;
                    break;
                default:
                    System.out.println(" Invalido ");
            }
        }while(sair != true);
    }
    
}
