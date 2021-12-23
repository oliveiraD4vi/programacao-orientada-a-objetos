class ContactStar extends Contact {
    private boolean star;
    //contrutor default
    public ContactStar(String name, List<Fone> fones, boolean star);
    //muda o prefixo e o valor de star
    void setStar(boolean value);
    boolean getStar(); 
}
