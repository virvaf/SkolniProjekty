import java.util.Iterator;

public class DynamickePole<E> implements Iterable<E>{
	private E[] pole;
	private int aktualniPrvek = 0;
	
	public DynamickePole() {
		pole = (E[]) new Object[10];
		aktualniPrvek = 0;
	}
	
	public void addPrvek(E element) {
		if(pole.length <= aktualniPrvek) {
			E[] novePole = (E[]) new Object[pole.length+10];
			for(int i = 0; i < aktualniPrvek; i++) {
				novePole[i] = pole[i];
			}
			pole = novePole;
		}
		pole[aktualniPrvek] = element;
		aktualniPrvek++;
	}
	
	public E getIndex(int index) {
		if(index < 0 || index >= aktualniPrvek) {
			throw new RuntimeException("Prvek s timto indexem v poli neni");
		}
		return pole[index];
	}
	
	public int pocetPrvku() {
		return aktualniPrvek;
	}

	@Override
	public Iterator<E> iterator() {
		return new DIterator<>(this);
	}

}
