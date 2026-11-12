package basics.oopomodeling;

import basics.oopomodeling.universe.blackhole;

public class Test {

    public static void main(String[] args) {

        blackhole bh1 = new blackhole("Asier");

        System.out.println(bh1);
        System.out.println(bh1.name);

        blackhole bh10 = new blackhole("Guille");

        System.out.println(bh10);
        System.out.println(bh10.name);
        
        for (int i = 0; i< 100000; i++) {
        	new blackhole("Anix");
        	try {
				try {
					Thread.sleep(5);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        } //Para capturar potenciales excepciones

    }
}