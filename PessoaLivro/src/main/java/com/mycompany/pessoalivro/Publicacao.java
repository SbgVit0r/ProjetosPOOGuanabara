
package com.mycompany.pessoalivro;

public interface Publicacao {
    public abstract void fechar();
    public abstract void abrir();
    public abstract void folhear(int p);
    public abstract void avancarPag();
    public abstract void voltarPag();
}
