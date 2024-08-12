public class Main {
    public static void main(String[] args) {
        SedanFactory sedanFactory = new SedanFactory();
        Sedan sedan = sedanFactory.criarCarro();
        sedan.exibirInfo();

        SUVFactory suvFactory = new SUVFactory();
        SUV suv = suvFactory.criarCarro();
        suv.exibirInfo();
    }
}
