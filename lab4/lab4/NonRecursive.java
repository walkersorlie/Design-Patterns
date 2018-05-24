public class NonRecursive extends SortFactory {

  public SortingAlgorithm getAlgorithm() {
    return new InsertionSort();
  }
}
