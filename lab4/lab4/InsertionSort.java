public class InsertionSort implements SortingAlgorithm {

	public void sort(Object[] items) {
		int j;
		for (int i = 1; i < items.length; i++) {
			Object temp = items[i];
			j = i;
			while ((j > 0) && ((Comparable)items[j-1]).compareTo(temp) > 0) {
				items[j] = items[j-1];
				j--;
			}
			items[j] = temp;
		}
	}
}
