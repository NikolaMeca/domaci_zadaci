package d2022_19_08;

public class FacebookMain {

	public static void main(String[] args) {
		
		FacebookPost objava2 = new FacebookPost();
		objava2.like();
		objava2.dislike();
		objava2.share();
		objava2.stampaj();
		
		
		System.out.println();
		
		
		FacebookPost objava1 = new FacebookPost("Milan Jovanovic", "Vlada Minic", "Cao, Vlado!");
		objava1.like();
		objava1.dislike();
		objava1.share();
		objava1.stampaj();
		
	}
		
		
		
		
		

}
