package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PushbackReader;

import node.Start;
import parser.Parser;

public class AnaliseSintaticaMain {
	public static void main(String[] args) {
		//String arquivoTeste = "./test/OlaMundo.portugol";
		String arquivoTeste = "./test/AnaliseSintatica.portugol";
		//String arquivoTeste = "./test/Comentarios.portugol";
		//String arquivoTeste;
		
		FileReader file;
		BufferedReader buffer;
		
		if (args != null){
			try {
				//arquivoTeste = args[0];
				file = new FileReader(arquivoTeste);
				buffer = new BufferedReader(file);
				
				MyLexer lexer = new MyLexer(new PushbackReader(buffer));
				Parser parser = new Parser(lexer);
				Start tree = parser.parse();

				System.out.println(tree.toString());
				
			} catch (Exception e) {
				System.out.println(e);
			}
			
		} else {
			
			System.out.println("É necessário informar um arquivo portugol como parâmetro!");
		
		}
		

	}
}
