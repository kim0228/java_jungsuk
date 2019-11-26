package BinaryIndexTree;

public class SegMentTest {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8};
		int n = arr.length;
		int height = (int)(Math.log(n)/Math.log(2)) + 1;
		int tree_nodes = (int) Math.pow(2, height + 1);
		SegmentTree ob = new SegmentTree(tree_nodes);
		ob.build(arr, 0, 0, n - 1);
		for(int i = 0;i<tree_nodes; i++) {
			System.out.println(ob.tree[i] + " ");
		}
		System.out.println();
		System.out.println(ob.query(0, 0, n - 1, 0, 5));
	}
}
