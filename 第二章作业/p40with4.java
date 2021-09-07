package p1;

public class p40with4 {
	public void main(String[] args) {
		String s1 = "bshidhuewfhduevbfhbvihuiw";
		int i, count = 0, j;
		for (i = 65; i < 123; i++) {
			for (j = 0; j < s1.length(); j++) {
				if (i == s1.charAt(j)) {
					count++;
				}
			}
			if (count != 0) {
				System.out.println((char) i + "有" + count + "个");
			}
		}
	}
}
