package encapsulation;
//Write-Only class
public class MyWriteOnly {

	public static void main(String[] args) {
		WriteOnly w = new WriteOnly();
		w.setCollege("LNCT");
	}

}
//you can't get the value of the college, you can only change the value of college data member.