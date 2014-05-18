package main;

/*
 * 
 * Classe retirada do site: http://sablecc.sourceforge.net/thesis/thesis.html#PAGE21
 * Utilizada com o objetivo de reconhecer comentários aninhados.
 * 
 */

import java.io.IOException;
import lexer.*;
import node.*;

public class MyLexer extends Lexer {

	private int count;
	private TComment comment;
	private StringBuffer text;

	public MyLexer(java.io.PushbackReader in) {
		super(in);
	}

	protected void filter() throws LexerException, IOException {

		if (state.equals(State.COMMENT)) {
			if (comment == null) {
				comment = (TComment) token;
				text = new StringBuffer(comment.getText());
				count = 1;
				token = null; // continue to scan the input.
			} else {
				// we were already in the comment state
				text.append(token.getText()); // accumulate the text.

				if (token instanceof TComment)
					count++;
				else if (token instanceof TCommentEnd)
					count--;
				if (count != 0) {
					token = null;
				}
				// continue to scan the input.
				else {
					token = comment;
					// return a comment with the full text.
					state = State.NORMAL;
					// go back to normal.
					comment = null;
					// We release this reference.
				}
			}
		}
	}
}