class Calculator {
    private int batteryMax;
    private int battery;
    private float display;
    //Inicia os atributos, battery e display começam com o zero.
    public Calculator(int batteryMax);
    //Aumenta a bateria, porém não além do máximo.
    public void chargeBattery(int value); 
    //Tenta gastar uma unidade da bateria e emite um erro se não conseguir.
    public boolean useBattery(); 
    //Se conseguir gastar bateria, armazene a soma no atributo display.
    public void sum(int a, int b); 
    //Se conseguir gastar bateria e não for divisão por 0.
    public void division(int num, int den);
    //Retorna o conteúdo do display com duas casas decimais.
    public String toString(); 
}
public class Solver{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator(0);
        while(true){
            String line = scanner.nextLine();
            System.out.println("$" + line);
            String ui[] = line.split(" ");
            if(line.equals("end")) {
                break;
            } else if(ui[0].equals("init")) { //batteryMax
                calc = new Calculator(Integer.parseInt(ui[1]));
            } else if(ui[0].equals("show")) {
                System.out.println(calc);
            } else if(ui[0].equals("charge")) {
                calc.chargeBattery(Integer.parseInt(ui[1]));
            } else if(ui[0].equals("sum")) {//value value
                calc.sum(Integer.parseInt(ui[1]), Integer.parseInt(ui[2]));
            } else if(ui[0].equals("div")) {//value value
                calc.division(Integer.parseInt(ui[1]), Integer.parseInt(ui[2]));
            } else {
                System.out.println("fail: comando invalido");
            }
        }
        scanner.close();
    }
}