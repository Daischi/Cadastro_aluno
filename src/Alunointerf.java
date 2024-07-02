

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author autologon
 */
import java.util.List;

public interface Alunointerf {
    boolean Inserir(CadastroAluno p);
    CadastroAluno Selecionar(String rgm);
    List<CadastroAluno> SelecionarTodos();
    
    
    
}
