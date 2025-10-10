import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

class Equipe {
    private String nome;
    private String pais;
    private String motor;

    public Equipe(String nome, String pais, String motor) {
        this.nome = nome;
        this.pais = pais;
        this.motor = motor;
    }

    public String getNome() {
        return nome;
    }

    public String getPais() {
        return pais;
    }

    public String getMotor() {
        return motor;
    }

    @Override
    public String toString() {
        return nome + " (" + pais + ") - Motor: " + motor;
    }
}

class Piloto {
    private String nome;
    private int idade;
    private Equipe equipe;

    public Piloto(String nome, int idade, Equipe equipe) {
        this.nome = nome;
        this.idade = idade;
        this.equipe = equipe;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    @Override
    public String toString() {
        return "🏁 Piloto Cadastrado 🏁\n\n" +
                "👤 Nome: " + nome + "\n" +
                "🎂 Idade: " + idade + " anos\n" +
                "🏎️ Equipe: " + equipe.getNome() + "\n" +
                "🌍 País: " + equipe.getPais() + "\n" +
                "⚙️ Motor: " + equipe.getMotor();
    }
}

public class CadastroPilotosF1 {

    public static void main(String[] args) {
        // Criando as equipes de F1
        List<Equipe> equipes = new ArrayList<>();
        equipes.add(new Equipe("Mercedes AMG", "Alemanha", "Mercedes"));
        equipes.add(new Equipe("Red Bull Racing", "Áustria", "Honda"));
        equipes.add(new Equipe("Ferrari", "Itália", "Ferrari"));
        equipes.add(new Equipe("McLaren", "Reino Unido", "Mercedes"));
        equipes.add(new Equipe("Aston Martin", "Reino Unido", "Mercedes"));
        equipes.add(new Equipe("Alpine", "França", "Renault"));

        JOptionPane.showMessageDialog(null,
                "🏎️ Bem-vindo ao Sistema de Cadastro de Pilotos da Fórmula 1 🏎️",
                "F1 Registration System",
                JOptionPane.INFORMATION_MESSAGE);

        boolean continuar = true;

        while (continuar) {
            // Nome
            String nome = "";
            while (nome.isBlank()) {
                nome = JOptionPane.showInputDialog(null,
                        "Digite o nome do piloto:",
                        "Cadastro de Piloto",
                        JOptionPane.QUESTION_MESSAGE);
                if (nome == null) return; // Cancelar
                if (nome.isBlank()) {
                    JOptionPane.showMessageDialog(null,
                            "⚠️ O nome não pode estar vazio!");
                }
            }

            // Idade
            int idade = 0;
            boolean idadeValida = false;
            while (!idadeValida) {
                try {
                    String idadeStr = JOptionPane.showInputDialog(null,
                            "Digite a idade do piloto:",
                            "Cadastro de Piloto",
                            JOptionPane.QUESTION_MESSAGE);
                    if (idadeStr == null) return;
                    idade = Integer.parseInt(idadeStr);
                    if (idade < 16 || idade > 60) {
                        JOptionPane.showMessageDialog(null,
                                "🚫 Idade inválida! Pilotos devem ter entre 16 e 60 anos.");
                    } else {
                        idadeValida = true;
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null,
                            "❌ Digite apenas números válidos para idade!");
                }
            }

            // Escolha de equipe
            String[] nomesEquipes = new String[equipes.size()];
            for (int i = 0; i < equipes.size(); i++) {
                nomesEquipes[i] = equipes.get(i).toString();
            }

            Equipe equipeEscolhida = null;
            Object escolha = JOptionPane.showInputDialog(
                    null,
                    "Escolha a equipe de Fórmula 1 que deseja integrar:",
                    "Seleção de Equipe",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    nomesEquipes,
                    nomesEquipes[0]);

            if (escolha != null) {
                for (Equipe e : equipes) {
                    if (escolha.toString().startsWith(e.getNome())) {
                        equipeEscolhida = e;
                        break;
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null,
                        "Nenhuma equipe selecionada. Cadastro cancelado.");
                return;
            }

            // Cria o piloto
            Piloto piloto = new Piloto(nome, idade, equipeEscolhida);

            // Mostra resumo
            JOptionPane.showMessageDialog(null,
                    piloto.toString(),
                    "Resumo do Cadastro",
                    JOptionPane.INFORMATION_MESSAGE);

            // Pergunta se quer continuar
            int resposta = JOptionPane.showConfirmDialog(null,
                    "Deseja cadastrar outro piloto?",
                    "Continuar?",
                    JOptionPane.YES_NO_OPTION);

            if (resposta != JOptionPane.YES_OPTION) {
                continuar = false;
            }
        }

        JOptionPane.showMessageDialog(null,
                "🏁 Obrigado por usar o sistema da F1! 🏁",
                "Encerrando o Programa",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
