// Solution to 310. Minimum Height Trees
// Problem: https://leetcode.com/problems/minimum-height-trees/
// Author: Sumit Gupta

public class Solution {
  public List<Integer> findMinHeightTrees(int n, int[][] edges) {
		if (n == 1)
			return Collections.singletonList(0);

		Map<Integer, Set<Integer>> hm = new HashMap<Integer, Set<Integer>>();

		for (int i = 0; i < n; i++)
			hm.put(i, new HashSet<Integer>());

		for (int[] edge : edges) {
			hm.get(edge[0]).add(edge[1]);
			hm.get(edge[1]).add(edge[0]);
		}

		while (hm.size() > 2) {
			List<Integer> leaves = new ArrayList<Integer>();
			Iterator<Map.Entry<Integer, Set<Integer>>> itr = hm.entrySet().iterator();
			while (itr.hasNext()) {
				Map.Entry<Integer, Set<Integer>> entry = itr.next();
				int key = entry.getKey();
				Set<Integer> valueSet = entry.getValue();

				if (valueSet.size() == 1)
					leaves.add(key);
			}

			for (int val : leaves) {
				hm.get(hm.get(val).iterator().next()).remove(val);
				hm.remove(val);
			}
		}

		List<Integer> finalAns = new ArrayList<Integer>();
		finalAns.addAll(hm.keySet());

		return finalAns;
	}
}
