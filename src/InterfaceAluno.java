

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author autologon
 */
import java.util.ArrayList;
import java.util.List;
        
 
public class InterfaceAluno {
    private List<CadastroAluno> listaAlunos;
    
    public InterfaceAluno(){
        this.listaAlunos = new ArrayList<>();
        
    }
    
public boolean Inserir(CadastroAluno cadastroAluno){
    return listaAlunos.add(cadastroAluno);
}

public CadastroAluno Selecionar(String rgm){
    for (CadastroAluno cadastroAluno : listaAlunos) {
        if (cadastroAluno.getRgm().equals(rgm)){
            return cadastroAluno;
        }
}
        return null;
        
        
}

public List<CadastroAluno> SelecionarTodos(){
    return listaAlunos;
    
    
}
}