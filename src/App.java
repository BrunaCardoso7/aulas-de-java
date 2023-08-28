public class App {
    public static void main(String[] args) throws Exception {
        final String BR = "Brasil";
        System.out.println(BR);
        String meuNome = "Bruna";
        System.out.println(meuNome);
        int minhaIdade = 18;
        System.out.println(minhaIdade);
        boolean goShowTwice = true;
        System.out.println(goShowTwice + " vou para o show do twice");
        goShowTwice = false;
        System.out.println(goShowTwice + " não vou ao show do twice");
        String TWICE = "9";
        System.out.println(TWICE);
        int num1 = 5;
        int num2 = 4;
        
        int somar = somarNumero(num1, num2);

        System.out.println("a soma dos números é " + somar);
    }
    public static int somarNumero(int num1, int num2){
        return num1 + num2;
    }
}
