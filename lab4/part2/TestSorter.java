
public class TestSorter {

	public static void main(String[] args) {
		String[] elements = {"beta", "chi","alpha","zeta", "nu","mu"};

		SortFactory factory = new NonRecursive();
		factory.setFactory("Insertion");

		SortingAlgorithm algorithm = factory.getAlgorithm();

		algorithm.sort(elements);

		for (int i = 0; i < elements.length; i++)
			System.out.println(elements[i]);
	}
}
