public class Fone {
    private String id;
    private String number;
    public Fone(String id, String number);
    //verifica se o número é um número de telefone válido
    public static boolean validate(String number);
    //O resultado deve ficar assim
    //oi:1234
    public String toString();
    //GETS e SETS
    public String getId();
    public void setId(String id);
    public String getNumber();
    public void setNumber(String number);
    //utiliza o static validate para retornar se essa instancia do fone é valida
    public boolean isValid();
}
