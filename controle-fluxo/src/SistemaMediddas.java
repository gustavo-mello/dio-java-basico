public class SistemaMediddas {
    public static void main(String[] args) {
        String sugla = "A";

        switch (sugla) {
            case "P":
                System.out.println("PEQUENO");
                break;
            case "M":
                System.out.println("MEDIO");
                break;
            case "G":
                System.out.println("GRANDE");
                break;
            default:
                System.err.println("INDEFINIDO");
                break;
        }
    }
}
