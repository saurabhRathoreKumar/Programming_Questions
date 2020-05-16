package com.accolite.p6;

/* IMPORTANT: Multiple classes and nested static classes are supported */
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
//import for Scanner and other utility classes
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
class T11 {
	public static void main(String args[] ) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] name = br.readLine().split(",");
		Map<String, Integer> m1 = new HashMap<>();
		Map<String, String> m2 = new HashMap<>();
		for(int i=1;i< name.length;i++) {
			String[] tmp = br.readLine().split("\\s+");
			m1.put(tmp[0].trim(), Integer.parseInt(tmp[2]));
			m2.put(tmp[0].trim(), tmp[3].trim());
		}
		Queue<String> q1 = new LinkedList<>();
		Queue<Integer> q2 = new LinkedList<>();
		q1.add(name[name.length-1]);
		q2.add(1);

		while(!q1.isEmpty()) {
			String key = q1.poll().trim();
			int val = q2.poll();
			Set<Entry<String, String>> list = m2.entrySet();
			for(Entry<String, String> e : list) {
				String k = e.getKey();
				String v =e.getValue();
				if(key.equals(v)) {
					int temp = m1.get(k) * val;
					m1.put(k, temp);
					q1.add(k);
					q2.add(temp);
				}

			};
		}
		m1.put(name[name.length-1].trim(), 1);
		StringBuilder sb = new StringBuilder();
		int max = m1.entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).get().getValue();
		for(String s : name) {
			int t = max/m1.get(s.trim());
			sb.append(t).append(s.trim());
			if(!s.equals(name[name.length-1])) {
				sb.append(" = ");
			}
		}
		System.out.println(sb.toString());
	}
}
