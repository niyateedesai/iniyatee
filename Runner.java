public class Runner{

    public Runner(){

        float a = (float)82890.9;
		float b = (float)8.4;

		PartnerB partnerB =
			(float c, float d) -> {System.out.printf("%5.3f%n", c/d);};

		partnerB.printQuotient(a, b);


    }

    public static void main(String[] args){
        Runner runner = new Runner();
    }




}