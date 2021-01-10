package workspace1103;
//Computes Simple random sentences 
//@Author Charl Rhode

// public class SimpleRandomSentences defines the words in the  arrays 
public class SimpleRandomSentences {
	

   static final String[] nouns = { "Boer", "chicken", "judged", "man", "woman",
                                   "cow"};
                                   
   static final String[] verbs = { "had", "woke", "engaged",
                                   "laid in", "tossed", "caught" };

   
   static final String[] conjunction = {"and","or","but","because"};

   static final String[] proper_noun = {"Fred","Jane","Richard Nixon","Miss America"};

   static final String[] common_noun = {"man","woman","fish","elephant","unicorn"};
      
   static final String[] determiner = {   "a", "the", "every" , "some"};
  
   static final String[] adjective = { "big", "tiny", "pretty", "bald"};

   static final String[] intransitive_verb = { "runs", "jumps", "talks", "sleeps"};
   
   static final String[] transitive_verb = { "loves", "hates", "sees", "knows", "looks for" , "finds"};
   
 //The Main Method
   public static void main(String[] args) {
	   for ( int j = 0; j < 10; j++ ) {  // Created for loop to avoid the infinite loop
			randomSentence();
			System.out.println(".\n\n");
			try {
				Thread.sleep(3000);
			}
			catch (InterruptedException e) {
			}
		}
	}

	 // Generates a random sentence, based on the grammar rule for a sentence.
	  
	static void randomSentence() {

		// The simple sentence rule 
		randomSimpleSentence();
		// Added Option, "and" followed by another simple sentence.
		
		if (Math.random() > 0.50) { // 50% of sentences will continue with a different clause.
			System.out.print(" and ");
			randomSimpleSentence();
		}
	}

	 //Generate a random simple_sentence, based on the grammar rule for a simple_sentence.
	static void randomSimpleSentence() {

		System.out.print("This is ");
		if (Math.random() > 0.20) { // 20% of sentences have a noun phrase. Beginning with "This is" and followed by "the house" 
			randomNounPhrase();
		}
		System.out.print("at home");
	}

	 // Generates a random noun phrase, based on the grammar rule for a noun_phrase.
	static void randomNounPhrase() {
		
		/* A random noun. */
		
		int n = (int)(Math.random()*proper_noun.length);
		System.out.print(proper_noun[n]);
		
		/*  The Optional Element Determiner . */
		
		if (Math.random() > 0.90) { // 90% chance of having a modifier.
			int m = (int)(Math.random()*determiner.length);
			System.out.print(" "+ determiner[m]);
		}
		
		// "that", followed by a random verb
		
		int v = (int)(Math.random()*intransitive_verb.length);
		System.out.print(" that " + intransitive_verb[v] + " ");
		
		/* Another random noun phrase */
		
		if (Math.random() > 0.6) {  // 60% chance of having another noun phrase.
			randomNounPhrase();
		}

	}

}
