package com.zeta.util;

import java.util.ArrayList;
import java.util.ListIterator;

import com.zeta.helper.Helper;

public class ArrListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating arraylist
		ArrayList ls = new ArrayList();
		ls.add(new Integer(34));
		ls.add(new Integer(44));
		ls.add(new Integer(54));
		ls.add(new Integer(34));
		ls.add(new String("Zeta"));
		ArrayList ls1 = new ArrayList();
		ls1.add('a');
		ls1.add('B');
		Helper.getLogger(ArrListExample.class).info(ls);
		Helper.getLogger(ArrListExample.class).info(ls.size());
		ls.trimToSize();
		Helper.getLogger(ArrListExample.class).info(ls.get(3));
		Helper.getLogger(ArrListExample.class).info(ls.isEmpty());
		Helper.getLogger(ArrListExample.class).info(ls.remove(new Integer(34)));
		ls.removeAll(ls1);
		Helper.getLogger(ArrListExample.class).info(ls1);
		ListIterator lt = ls.listIterator();
		while(lt.hasNext()){
			Helper.getLogger(ArrListExample.class).debug(lt.next());
		}
	}

}
