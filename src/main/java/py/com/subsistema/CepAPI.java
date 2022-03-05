package py.com.subsistema;

public class CepAPI {
    private static CepAPI instancia = new CepAPI();

    public CepAPI() {
    }

    public static CepAPI getInstancia() {
        return instancia;
    }
    public String recuperarCidade(String cep){
        return "Ariquemes";
    }

    public String recuperarUf(String cidade){
        return "RO";
    }
}
