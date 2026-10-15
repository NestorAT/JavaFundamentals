package basics.oopomodeling;

public class Dog {

	//Atributos  privados      
	    private String name;
	    private String race;
	    private int age;
	    private String color;       
	    private float weight;

	        public Dog() {
	        }

	        public Dog(String n, String r) {
	            name = n;
	            race = r;
	        }

	        public Dog(String n, String r, int a, String c, float w) {
	            name = n;
	            race = r;
	            age = a;
	            color = c;
	            weight = w;
	        }
	    }