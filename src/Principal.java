import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        InterfaceAluno interfaceAluno = new InterfaceAluno();

        int opcao;
        do {
            String[] opcoes = {"Cadastro de Aluno", "Pesquisa de Aluno", "Listar todos os Alunos", "Dados (RGM, Nome, ...)", "Sair"};
            opcao = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Menu",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);

            switch (opcao) {
                case 0:
                    // Cadastro de aluno
                    cadastrarAluno(interfaceAluno);
                    break;
                case 1:
                    // Pesquisa de aluno
                    pesquisarAluno(interfaceAluno);
                    break;
                case 2:
                    // Listar todos os alunos
                    listarAlunos(interfaceAluno);
                    break;
                case 3:
                    // Dados (RGM, Nome, ...)
                    exibirDados(interfaceAluno);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Encerrando o programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Escolha novamente.");
            }
        } while (opcao != 4);
    }

    private static void cadastrarAluno(InterfaceAluno interfaceAluno) {
        String rgm = JOptionPane.showInputDialog("Informe o RGM:");
        String nome = JOptionPane.showInputDialog("Informe o nome:");
        float notaParcial = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota parcial:"));
        float notaReg = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota regular:"));

        CadastroAluno aluno = new CadastroAluno(rgm, nome, notaParcial, notaReg);
        interfaceAluno.Inserir(aluno);
        JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso.");
    }

    private static void pesquisarAluno(InterfaceAluno interfaceAluno) {
        String rgm = JOptionPane.showInputDialog("Informe o RGM do aluno:");
        CadastroAluno aluno = interfaceAluno.Selecionar(rgm);
        if (aluno != null) {
            JOptionPane.showMessageDialog(null, "Aluno encontrado:\n" +
                    "RGM: " + aluno.getRgm() + "\n" +
                    "Nome: " + aluno.getNome() + "\n" +
                    "Nota Parcial: " + aluno.getNotaParcial() + "\n" +
                    "Nota Regular: " + aluno.getNotaReg());
        } else {
            JOptionPane.showMessageDialog(null, "Aluno não encontrado.");
        }
    }

    private static void listarAlunos(InterfaceAluno interfaceAluno) {
        StringBuilder alunosStr = new StringBuilder("Lista de Alunos:\n");
        for (CadastroAluno aluno : interfaceAluno.SelecionarTodos()) {
            alunosStr.append("RGM: ").append(aluno.getRgm()).append(", Nome: ").append(aluno.getNome()).append("\n");
        }
        JOptionPane.showMessageDialog(null, alunosStr.toString());
    }

    private static void exibirDados(InterfaceAluno interfaceAluno) {
        String rgm = JOptionPane.showInputDialog("Informe o RGM do aluno:");
        CadastroAluno aluno = interfaceAluno.Selecionar(rgm);
        if (aluno != null) {
            JOptionPane.showMessageDialog(null, "Dados do Aluno:\n"+
                    "RGM: " + aluno.getRgm() + "\n" +
                    "Nome: " + aluno.getNome() + "\n" +
                    "Nota Parcial: " + aluno.getNotaParcial() + "\n" +
                    "Nota Regular: " + aluno.getNotaReg());
        } else {
            JOptionPane.showMessageDialog(null, "Aluno não encontrado.");
        }
    }
}