package com.team4.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.team4.resource.R;

public class CSArray implements Comparable<CSArray> , R{

	ArrayList<Integer> list;
	double keywordcs=0;
	double likecs=0;
	
	@Override
	public String toString() {
		return "CSArray [ unum="+list.get(0)+", keywordcs=" + keywordcs + ", likecs=" + likecs + "]";
	}
	
	public CSArray(int i) {
		this.list= new ArrayList<Integer>(Collections.nCopies(i+2, 0));
	}
	
	@Override
	public int compareTo(CSArray cs) {

		if (this.keywordcs+this.likecs > cs.keywordcs+cs.likecs) {
			return -1;
		} else if (this.keywordcs+this.likecs > cs.keywordcs+cs.likecs) {
			return 1;

		} else {
			return 0;
		}
	}
	public ArrayList<Integer> getList() {
		return list;
	}
	public void setList(ArrayList<Integer> list) {
		this.list = list;
	}
	public double getKeywordcs() {
		return keywordcs;
	}
	public void setKeywordcs(double keywordcs) {
		this.keywordcs = keywordcs;
	}
	public double getLikecs() {
		return likecs;
	}
	public void setLikecs(double likecs) {
		this.likecs = likecs;
	}
	


}
