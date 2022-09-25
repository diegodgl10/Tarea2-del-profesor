package javabeans;

public class Mensaje {

  private String remite;
  private String destino;
  private String copia;
  private String texto;

  public Mensaje() {}
  // Constructor que permite crear un objeto
  // Mensaje a partir de los datos del mismo

  public Mensaje( String remite, String destino, String copia, String texto ) {
    this.remite = remite;
    this.destino = destino;
    this.texto = texto;
  }
  
  public Mensaje( String remite, String destino, String texto ) {
    this.remite = remite;
    this.destino = destino;
    this.texto = texto;
  }

  public void setRemite( String remite ) {
    this.remite = remite;
  }

  public String getRemite() {
    return this.remite;
  }
  
  public void setDestino( String destino ) {
    this.destino = destino;
  }

  public String getDestino() {
    return this.destino;
  }
  
  public void setCopia( String copia ) {
    this.copia = copia;
  }

  public String getCopia() {
    return this.copia;
  }

  public void setTexto( String texto ) {
    this.texto = texto;
  }

  public String getTexto() {
    return this.texto;
  }
}