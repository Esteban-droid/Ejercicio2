public class FizzBuzz {

    public String fizzBuzz(int number) {
        // l�gica de fizzbuzz aqu�

		if(number%3==0){
			if(number%5==0) {
				return "FizzBuzz";
			}else {
				return "Fizz";
			}

		} else if(number%5==0) {
		    return "Buzz";

		}
		return String.valueOf(number);
    }
    
}
