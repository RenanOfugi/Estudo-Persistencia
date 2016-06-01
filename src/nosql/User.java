package nosql;

public class User {
	
	private Gender gender;
	private Name name;
	private boolean verified;
	private byte[] image;

	public enum Gender {
		MALE, FEMALE
	};
	
	public static class Name{
		
		private String first;
		private String last;
		
		public String getFirst(){
			return first;
		}
		
		public void setFirst(String first){
			this.first = first;
		}
		
		public String getLast(){
			return last;
		}
		
		public void setLast(String last){
			this.last = last;
		}
	}
}
