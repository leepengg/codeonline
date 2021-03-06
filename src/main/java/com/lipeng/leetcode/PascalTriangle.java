package com.lipeng.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> ret = new ArrayList<List<Integer>>();

		if (numRows <= 0) {
			return ret;
		}

		List<Integer> first = new ArrayList<Integer>();
		first.add(1);
		ret.add(first);

		if (numRows == 1) {
			return ret;
		}

		List<Integer> two = new ArrayList<Integer>();
		two.add(1);
		two.add(1);
		ret.add(two);

		if (numRows == 2) {
			return ret;
		}

		int i = 2;
		List<Integer> tmp = null;
		List<Integer> pre = null;
		while (i < numRows) {
			tmp = new ArrayList<Integer>();
			pre = ret.get(i - 1);

			tmp.add(1);

			int len = pre.size();
			for (int j = 0; j < len - 1; j++) {
				tmp.add(pre.get(j) + pre.get(j + 1));
			}
			tmp.add(1);

			ret.add(tmp);

			i++;

		}

		return ret;
	}

	public List<Integer> getRow(int rowIndex) {
		return generate(rowIndex + 1).get(rowIndex);
	}

	public static void printRet(List<Integer> ret) {
		System.out.println(ret.size());
		for (Integer integer : ret) {
			System.out.print(integer);
			System.out.print(" ");
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PascalTriangle pt = new PascalTriangle();
		printRet(pt.getRow(3));

	}

}
