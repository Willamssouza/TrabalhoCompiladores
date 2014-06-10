package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PushbackReader;

import node.Token;

public class AnaliseLexicaMain {
	
	public static void main(String[] args) {
		//String arquivoTeste = "./test/OlaMundo.portugol";
		//String arquivoTeste = "./test/AnaliseSintatica.portugol";
		//String arquivoTeste = "./test/Comentarios.portugol";
		String arquivoTeste;
		
		FileReader file;
		BufferedReader buffer;
		
		if (args != null){
			try {
				arquivoTeste = args[0];
				file = new FileReader(arquivoTeste);
				buffer = new BufferedReader(file);
				
				MyLexer lexer = new MyLexer(new PushbackReader(buffer));
			
				while (true) {
					Token t = lexer.next();
					String nomeToken = t.getClass().getSimpleName();
					
					if (!nomeToken.equals("EOF")) {
						nomeToken = nomeToken.substring(1);
					}
					
					if (nomeToken.equals("Blank")){
						System.out.print(t.getText());
					} else {
						System.out.print(nomeToken+" ");
					}
					
					if (t.getText().isEmpty()) {
						System.out.println();
						break;
					}
				}
			} catch (Exception e) {
				System.out.println(e);
			}
			
		} else {
			
			System.out.println("É necessário informar um arquivo portugol como parâmetro!");
		
		}
		

	}
}
