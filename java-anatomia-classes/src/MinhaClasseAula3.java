public class MinhaClasseAula3 {
    public static void main(String[] args) {
        
        String primeiroNome = "Patrick";
        String segunoNome = "Martins";

        String nomeCompleto = nomeCompleto(primeiroNome, segunoNome);

        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
