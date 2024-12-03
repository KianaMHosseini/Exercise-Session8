package ir.isc.session8;

public class Builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Http newConnection1 = new Http.Builder()
								 	.Url("http://google.com")
								 	.Port(80)
								 	.User("chrome")
								 	.Password("1234")
								 	.Timeout(500)
								 	.build();
		
		Http newConnection2 = new Http.Builder()
								 	.Url("MicrosoftEdge.com")
								 	.Port(8080)
								 	.User("Microsoft Edge")
								 	.Password("34343")
								 	.Timeout(100)
								 	.build();
					
		System.out.println("valid connection" + newConnection1);
		
		System.out.println("invalid connection" + newConnection2);

	}
	

}