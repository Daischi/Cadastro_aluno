 


public class CadastroAluno {
    private String rgm;
    private String nome;
    private float notaParcial;
    private float notaReg;
    
    public CadastroAluno(){
    
    }
    public CadastroAluno(String rgm, String nome, float notaParcial, float notaReg){
        this.rgm = rgm;
        this.nome = nome;
        this.notaParcial = notaParcial;
        this.notaReg = notaReg;
        
   
}/// Metodos get ///
    
    public String getRgm(){
    
    return rgm;
    }
    public String getNome(){
    
    return nome;
    }
    public float getNotaParcial(){
    return notaParcial;
    
    }
    
    public float getNotaReg(){
    return notaReg;
    
    }
    
    

    ////Metodos set///
    
    
    public void setRgm(String rgm) {
        this.rgm = rgm;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setNotaParcial (float notaParcial){
        this.notaParcial = notaParcial;
    }
    
    public void setNotaReg (float notaReg){
        this.notaReg = notaReg;
    }
    /// cabou 
    
    public void print(){
        System.out.println("RGM: " + rgm);
        System.out.println("Nome: " + nome);
        System.out.println("Nota parcial: " + notaParcial);
        System.out.println("Nota regimental: " + notaReg);
    
    
    }

    
    
    
} 
    
    
    
   