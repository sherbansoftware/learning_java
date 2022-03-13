package Java.Data_Structures_in_Java.Primitivre_DS.Lexical_Structure;

public class LexicalStructure {

	/*
	 * LineTerminator: the ASCII LF character, also known as "newline" the ASCII CR
	 * character, also known as "return" the ASCII CR character followed by the
	 * ASCII LF character
	 * 
	 * InputElement: WhiteSpace Comment Token
	 * Token:Identifier,Keyword,Literal,Separator,Operator
	 * 
	 * identifier: is an unlimited-length sequence of Java letters and Java digits,
	 * the first of which must be a Java letter. Two identifiers are the same only
	 * if they are identical, that is, have the same Unicode character for each
	 * letter or digit.
	 * 
	 * Keyword: (one of) abstract continue for new switch assert default if package
	 * synchronized boolean do goto private this break double implements protected
	 * throw byte else import public throws case enum instanceof return transient
	 * catch extends int short try char final interface static void class finally
	 * long strictfp volatile const float native super while
	 * 
	 * Literal: is the source code representation of a value of a primitive type ,
	 * the String type , or the null type.
	 * 
	 * Literal: IntegerLiteral FloatingPointLiteral BooleanLiteral CharacterLiteral
	 * StringLiteral NullLiteral
	 * 
	 * EscapeSequence: \ b (backspace BS, Unicode \u0008) \ t (horizontal tab HT,
	 * Unicode \u0009) \ n (linefeed LF, Unicode \u000a) \ f (form feed FF, Unicode
	 * \u000c) \ r (carriage return CR, Unicode \u000d) \ " (double quote ", Unicode
	 * \u0022) \ ' (single quote ', Unicode \u0027) \ \ (backslash \, Unicode
	 * \u005c)
	 * 
	 * NullLiteral:null
	 *
	 * Separators: Twelve tokens, formed from ASCII characters, are the separators
	 * (punctuators). Separator:(one of) ( ) { } [ ] ; , . ... @ ::
	 *
	 * Operators 38 tokens, formed from ASCII characters, are the operators.
	 * Operator: (one of)
	 *  = > < ! ~ ? : -> == >= <= != && || ++ -- + - * / & | ^ %
	 * << >> >>> += -= *= /= &= |= ^= %= <<= >>= >>>=
	 * 
	 */
	
	public static void main(String[] args) {
		
		// Boolean id = Character.isDigit('5');
		// Character ff = '\u007a';
//		int i = 0xFF;
//	    char d ='7';	
//		String str ="\"";
//	    String str="Ma duc \nla plimbare";
//		String str = null;
		
		System.out.println();		
	}
	
	public class Other { public static final String hello = "Hello"; }
}
