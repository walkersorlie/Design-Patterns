import java.util.*;

public class IterateTest
{
	public static void main(String[] args) {
		OldStyleList v = new OldStyleList();
		v.add("one");
		v.add("two");
		v.add("three");
		v.add("four");

		EnumerationAdapter adapter = new EnumerationAdapter(v.elements());

		System.out.println("Iteration ..... the \"new-style\" way");
		while (adapter.hasNext())
			System.out.println(adapter.next());
	}
}
