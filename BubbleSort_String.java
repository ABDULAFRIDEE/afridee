package xyz;

public class BubbleSort_String {

	public static void main(String[] args) {
		String [] n= {"a","c","b","d","e","g"};
		for(int i=0;i<n.length-1;i++) {
			for(int j=0;j<n.length-1;i++) {
				if(n[j].compareTo(n[j+1])>0) {
					String temp=n[j+1];
					n[j+1]=n[j];
					n[j]=temp;
					
				}
				
			}
			System.out.println(n);
		}

	}

}
