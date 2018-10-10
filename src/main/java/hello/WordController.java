package hello;




import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class WordController {
    // TODO Implement the /words/{word} endpoint
	CheckPalindrome ch= new CheckPalindrome();
	@RequestMapping(value="/words/{word}", method=RequestMethod.GET)
	public  Palindrome checkWord(@PathVariable(value="word") String word){
		
		

		Palindrome p= new Palindrome();
		
		     p.setWord(word);
		     p.setPalindrome(ch.isPalindrom(word));
		     p.setAnagramOfPalindrome(ch.canFormPalindrome(word));
		     
		     return p;
		
		
	}
}

