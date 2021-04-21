# Random-Sentences


package quiz;

public class RandomSentences {
  
	    static  String[] common_noun = { "man", "woman", "fish", "elephant", "unicorn" };
	    static  String[] conjunction  = { "and", "or", "but", "because" };
	    static  String[] proper_noun = { "Fred", "Jane", "Richard Nixon", "Miss America"};        
	    static  String[] determiner = { "the", "a", "every", "some", "an"};
	    static  String[] adjective = { "big", "tiny", "pretty", "bald" };
	    static  String[] intransitive_verb = { "runs", "jumps", "talks", "sleeps" };
	    static  String[] transitive_verb = { "loves", "hates", "sees", "knows", "looks for", "finds" };
	    
	    
	    public static void main( String args[] ){	    
	             sentence();
	      	               
	            }
	         
	        public static void sentence() {
	        	int j = (int)(Math.random()*conjunction.length);
	        	simple_sentence();   	
	        	if (Math.random() > 0.25) {
		             System.out.print( conjunction[j] + " ");
		             sentence();
	        		}
	        	}
	        private static void simple_sentence() {
				noun_phrase();
				System.out.print(" ");   
				verb_phrase();
				}
	            	       
	        private static void noun_phrase()  {
				
				int n = (int)(Math.random()*proper_noun.length);
	            int d = (int)(Math.random()* determiner.length);
	            int m = (int)(Math.random()*adjective.length);
	            int c = (int)(Math.random()*common_noun.length);
	            System.out.print(proper_noun[n] + " ");
	           		    
	            if (Math.random() > 0.50) {
	             System.out.print(determiner[d] + " ");
	 		    
		          if (Math.random() > 0.50) {
	             System.out.print(adjective[m] + "," + " ");
		          }   
		          System.out.print(common_noun[c] + " ");
		          if (Math.random() > 0.75) {
	        	  System.out.print( "who"+ " ");
	        	  verb_phrase();
	        	  } 
	            }
	          }
	        
	        private static void verb_phrase() {
				// TODO Auto-generated method stub
				int j = (int)(Math.random()*intransitive_verb.length);
	            int p = (int)(Math.random()* transitive_verb.length);
	            int m = (int)(Math.random()*adjective.length);
	            
	            System.out.print(intransitive_verb[j] + " ");
	           
		    
	          if (Math.random() > 0.5) {
	             System.out.println( transitive_verb[p] + " ");
	             noun_phrase();
	          }
	          if (Math.random() > 0.25) {
		             System.out.print( "is"+" "  + adjective [m] + " ");
		          }
	          if (Math.random() > 0.65) {
	        	  System.out.print( "believes that" + " ");
	        	  simple_sentence();
	          	} 
	      
	        }
		
		
	}
	    
