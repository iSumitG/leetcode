
public class Solution {
  public List<Integer> findMinHeightTrees(int n, int[][] edges) {
		if (n == 1)
			return Collections.singletonList(0);

		HashMap<Integer, Set<Integer>> hm = new HashMap<Integer, Set<Integer>>();

		for (int i = 0; i < n; i++) {
			hm.put(i, new HashSet<Integer>());
		}

		for (int[] edge : edges) {
			hm.get(edge[0]).add(edge[1]);
			hm.get(edge[1]).add(edge[0]);
		}

		//System.out.println(hm);

		while (hm.size() > 2) {
			List<Integer> leaves = new ArrayList<Integer>();
			Iterator<Map.Entry<Integer, Set<Integer>>> itr = hm.entrySet().iterator();
			while (itr.hasNext()) {
				Map.Entry<Integer, Set<Integer>> entry = itr.next();
				int key = entry.getKey();
				Set<Integer> valueSet = entry.getValue();

				if (valueSet.size() == 1) {
					leaves.add(key);
				}
			}

			//System.out.println(leaves);

			for (int val : leaves) {
				hm.get(hm.get(val).iterator().next()).remove(val);
				hm.remove(val);
			}

		}

		//System.out.println("After: " + hm.keySet());
		List<Integer> finalAns = new ArrayList<Integer>();
		finalAns.addAll(hm.keySet());

		//System.out.println(finalAns);

		return finalAns;
	}
}
