package workspace1103;

public class RecursiveSyntax {
	
	static final String[] conjunction = {"and", "or", "but", "because", "instead of"};
	static final String[] properNoun = {"Fred", "Jane", "Richard Nixon", "Miss America"};
	static final String[] commonNoun = {"man", "woman", "fish", "elephant", "unicorn", "mum", "dad"};
	static final String[] determiner = {"a", "the", "every", "some"};
	static final String[] adjective = {"big", "tiny", "pretty", "bald"};
	static final String[] intransitiveVerb = {"runs", "jumps", "talks", "sleeps"};
	static final String[] transitiveVerb = {"loves", "hates", "sees", "knows", "looks for", "finds"};
	
	private static void nounPhrase() {
	
		int num = (int)(Math.random()*2);
		int ad = (int)(Math.random() * adjective.length);
		int pn = (int)(Math.random() * properNoun.length);
		int cn = (int)(Math.random() * commonNoun.length);
		int d = (int)(Math.random() * determiner.length);
		
		switch(num) {
		 
		case 1:   
			System.out.print(properNoun[pn]);
			break;
			
		default:
			System.out.print(determiner[d]);

			if ((int)(Math.random()) > 0.5) {
				System.out.print(" ");
				System.out.print(adjective[ad]);
			}
			System.out.print(" ");
			System.out.print(commonNoun[cn]);
			if ((int)(Math.random()) >0.5) {
				System.out.print(" ");
				System.out.print("who ");
				verbPhrase();
			}
			break;
		}
	}

	private static void verbPhrase() {
		
		int num = (int)(Math.random()*4);
		int iv = (int)(Math.random() * intransitiveVerb.length);
		int tv = (int)(Math.random() * transitiveVerb.length);
		int ad = (int)(Math.random() * adjective.length);
		
		switch(num) {
		 
		case 1:   
			System.out.print(intransitiveVerb[iv]);
			break;
			
		case 2:
			System.out.print(transitiveVerb[tv]);
			System.out.print(" ");
			nounPhrase();
			break;
			
		case 3:
			System.out.print("is ");
			System.out.print(adjective[ad]);
			break;
			
		default:
			System.out.print("believes that ");
			simpleSentence();
			break;
			
		}
	}
	
	private static void simpleSentence() {
		nounPhrase();
		System.out.print(" ");
		verbPhrase();
	}
	
	private static void sentence() {
		int cj = (int)(Math.random() * conjunction.length);
		simpleSentence();
		if ((int)(Math.random()) > 0.5) {
			System.out.print(" ");
			System.out.print(conjunction[cj]);
			sentence();
		}
	}
	
	public static void main(String[] args) {
		sentence();
		sentence();
		sentence();
		sentence();
	}
}
