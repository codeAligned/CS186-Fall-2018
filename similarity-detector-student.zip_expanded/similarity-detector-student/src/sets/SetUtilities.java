/*
 * Copyright 2017 Marc Liberatore.
 */

package sets;

import java.util.HashSet;
import java.util.Set;

public class SetUtilities {
	/**
	 * Returns a new set representing the union of s and t.
	 * 
	 * Does not modify s or t.
	 * @param s
	 * @param t
	 * @return a new set representing the union of s and t
	 */
	public static <E> Set<E> union(Set<E> s, Set<E> t) {
		Set<E> union = new HashSet<E>();
		union.addAll(s);
		union.addAll(t);
		return union;
	}

	/**
	 * Returns a new set representing the intersection of s and t.
	 * 
	 * Does not modify s or t.
	 * @param s
	 * @param t
	 * @return a new set representing the intersection of s and t
	 */
	public static <E> Set<E> intersection(Set<E> s, Set<E> t) {
		Set<E> intersection = new HashSet<E>();
		intersection.addAll(s);
		intersection.retainAll(t);
		return intersection;
	}

	/**
	 * Returns a new set representing the set difference s and t,
	 * that is, s \ t.
	 * 
	 * Does not modify s or t.
	 * @param s
	 * @param t
	 * @return a new set representing the difference of s and t
	 */
	public static <E> Set<E> setDifference(Set<E> s, Set<E> t) {
		Set<E> difference = new HashSet<E>();
		difference.addAll(s);
		difference.removeAll(t);
		return difference;
	}
	
	/**
	 * Returns the Jaccard index of the two sets s and t.
	 * 
	 * It is defined as 1 if both sets are empty.
     *
	 * Otherwise, it is defined as the size of the intersection of the sets, 
	 * divided by the size of the union of the sets.
	 * 
	 * Does not modify s or t.
	 * 
	 * @param s
	 * @param t
	 * @return the Jaccard index of s and t
	 */
	public static <E> double jaccardIndex(Set<E> s, Set<E> t) {
		if(s.isEmpty() == true && t.isEmpty() == true) {
			return 1;
		}
		double union = union(s, t).size();
		double intersection = intersection(s, t).size();
		return intersection / union;
	}
}
