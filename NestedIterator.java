// Solution to 341. Flatten Nested List Iterator
// Problem: https://leetcode.com/problems/flatten-nested-list-iterator/
// Author: Sumit Gupta

/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class NestedIterator implements Iterator<Integer> {
    
    private List<Integer> intList; 
    private Iterator<Integer> intIterator; 

    public NestedIterator(List<NestedInteger> nestedList) {
        intList = new ArrayList<Integer>();
        populateIntList(intList, nestedList);
        intIterator = intList.iterator();
    }
    
    private void populateIntList(List<Integer> intList, List<NestedInteger> nestedList)
    {
        Iterator<NestedInteger> itr = nestedList.iterator();
        
        while(itr.hasNext())
        {
            NestedInteger n = itr.next();
            
            if(n.isInteger())
                intList.add(n.getInteger());
            else
                populateIntList(intList, n.getList());
        }
        
    }

    @Override
    public Integer next() {
        return intIterator.next();
    }

    @Override
    public boolean hasNext() {
        return intIterator.hasNext();
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */

