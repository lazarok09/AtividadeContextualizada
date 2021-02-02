package atividadecontextualizada;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidarCpf {
	String cpf;

	public String testarCpf(String cpf) {
		this.cpf = cpf;
		if (cpf.equals(" ")) {
			System.out.println("O campo não pode ficar em branco!");
			return "erro";
		} else {
			Pattern pattern = Pattern.compile("[a*z]");
			Matcher matcher = pattern.matcher(cpf);
			if (matcher.find()) {
				System.out.println("CPF Não deve conter letras!");
				return "erro";
			}
			if (cpf.length() < 11 || cpf.length() > 11) {
				System.out.println("CPF deve conter 11 números");
				return "erro";
			}

		}
		return cpf;
	}
}
