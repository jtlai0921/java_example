package source.pack2;

import source.pack1.P1;

public class ET extends P1 {
    /*  ET 從 person 繼承而來的成員      
    private char blood;  
    protected String DNA = "ABCDABCD";
    public String name;
    public char getBlood();
    public void setBlood(char b);
     */    
    public void setDNA(String d) {
        DNA = d;
    }
    public String getDNA() {
        return DNA;
    }
}