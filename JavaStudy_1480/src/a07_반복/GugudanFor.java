package a07_반복;

public class GugudanFor {

	public static void main(String[] args) {
		    int dan = 4;
		    for(int i = 0; i < 9; i++) {
		    	    System.out.println(dan + " X " + (i + 1) + " = " + (dan * i));
		    }
		    
		    for(int i = 0, j = 0; i < 9; i++, j++) {
		    	    System.out.println(dan + " X " + ++i + " = " + (dan * i));
		    }
	}

}
