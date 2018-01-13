
public class Students implements CompareInterface<Students> {
	int marks;


	public int compareTo(Students second){
		if(this.marks>second.marks){
			return 1;
		}
		else if(this.marks<second.marks){
			return -1;
		}
		return 0;
	}
}