package atividadecontextualizada;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidarString {

        String nome;
	public String testarNome(String nome){
		this.nome = nome;
		if(nome == ""){
			System.out.println("O campo não pode ficar em branco!");
                        return "erro";
		}
		else{
			Pattern pattern = Pattern.compile("[0-9]");
			Matcher matcher = pattern.matcher(nome);
			if(matcher.find()){
				System.out.println("Não deve conter números!");
                                return "erro";
			}

		}
		return nome;
	}
}
