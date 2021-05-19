import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		DynamickePole<Integer> dPole = new DynamickePole<>();
		DynamickePole<String> dSlova = new DynamickePole<>();
		for(int i = 0; i < 12; i++) {
			dPole.addPrvek(i*5);
		}
		
		for(int i= 0; i < dPole.pocetPrvku(); i++) {
			System.out.print(dPole.getIndex(i)+", ");
		}
		
		System.out.println();
		
		for(int cislo : dPole) {
			System.out.print(cislo+"; ");
		}
		
		System.out.println();
		
		Iterator<Integer> it = dPole.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
		System.out.println();
		list.add(5);
		list.add(15);
		list.add(8);
		
		for(int cislo : list) {
			System.out.print(cislo+"; ");
		}
		System.out.println();
		
		Iterator<Integer> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next()+" ");
		}
		
	}

}
