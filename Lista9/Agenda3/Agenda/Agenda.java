class Agenda {
    private List<Contact> contacts;
    public Agenda();
    //retorna a posição do contato com esse nome no vetor ou -1 se não existir.
    private int findPosByName(String name);
    //retorna o objeto contato com esse nome ou null se não existir
    //utilize o método findPosByName
    public Contact findContact(String name);
    //se nenhum contato existir com esse nome, adicione
    //se ja existir, faça o merge adicionando os telefones
    public void addContact(Contact contact);
    //Utilize o método findPos
    public void rmContact(String name);
    //Monte uma lista auxiliar procurando no .toString() de cada contato
    //se ele possui a substring procurada.
    public List<Contact> search(String pattern);
    public List<Contact> getContacts();
    public String toString();
}
