public class MinhaClasse {
    public static void main(String[] args) {
        String primeiroNome = "Gustavo";
        String segundoNome = "Mello";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto( String primeroNome, String segundoNome){
        return primeroNome.concat(" ").concat(segundoNome);
    }
}
