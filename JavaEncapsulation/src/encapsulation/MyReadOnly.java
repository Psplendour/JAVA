package encapsulation;
//Read-Only class
public class MyReadOnly {

	public static void main(String[] args) {
		ReadOnly R = new ReadOnly();
		System.out.println(R.getCollege());

	}

}
//you can't change the value of the college data member which is "AKG".