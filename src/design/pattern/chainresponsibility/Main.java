package design.pattern.chainresponsibility;

public class Main {
	public static void main(String[] args) {
		AuthenticationProcessor processor = new UsernamePasswordProcessor(new OAuthProcessor(null));
		
		System.out.println(processor.isAuthorized(new UsernamePasswordProvider()));

		System.out.println(processor.isAuthorized(new FakeProvider()));

		System.out.println(processor.isAuthorized(new OAuthTokenProvider()));
		
	}

}
