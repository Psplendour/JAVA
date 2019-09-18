package stringBuffer;
//StringBuffer insert() method
public class StringBufferinsert {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Hello "); 
		sb.insert(1,"Java");//now original string is changed
		System.out.println(sb);//HJavaello

	}

}
//The insert() method inserts the given string with this string at the given position.