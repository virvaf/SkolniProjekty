import java.util.Iterator;

public class DIterator<E> implements Iterator<E>{
	
	private DynamickePole<E> prochazenePole;
	private int aktualni;
	
	public DIterator(DynamickePole<E> prochazenePole) {
		this.prochazenePole = prochazenePole;
		aktualni = prochazenePole.pocetPrvku() - 1;
	}

	@Override
	public boolean hasNext() {
		return aktualni > -1;
	}

	@Override
	public E next() {
		E hodnota = prochazenePole.getIndex(aktualni);
		aktualni--;
		return hodnota;
	}
	/*
	public DIterator(DynamickePole<E> prochazenePole) {
		this.prochazenePole = prochazenePole;
		aktualni = 0;
	}

	@Override
	public boolean hasNext() {
		return aktualni < prochazenePole.pocetPrvku();
	}

	@Override
	public E next() {
		E hodnota = prochazenePole.getIndex(aktualni);
		aktualni++;
		return hodnota;
	}
 */
}
