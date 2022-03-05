package pt.com.subsistema;

public class CrmServ {
    public static void gravarCliente(String nome, String cep, String uf, String cidade  ){
        System.out.println("Clinte salvo no crm!");
        System.out.println(nome);
        System.out.println(cep);
        System.out.println(cidade);
        System.out.println(uf);
    }

    private CrmServ() {
    }
}
