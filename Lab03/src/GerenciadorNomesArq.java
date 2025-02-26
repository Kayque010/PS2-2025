import java.util.List;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class GerenciadorNomesArq implements GerenciadorNomes {


    @Override
    public List<String> obterNomes() {
        Path path = Paths.get("nomes.txt");
        try {
            List<String> strings = Files.readAllLines(path);
            return strings;
        } catch (IOException e) {
            e.printStackTrace();
        }
       return null;
    }

    @Override
    public void adicionarNome(String nome) {
        Path filePath = Paths.get("nomes.txt");
        try {
            Files.writeString(filePath, nome + System.lineSeparator(),
            StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}