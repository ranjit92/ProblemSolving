package design.pattern.chainresponsibility;

public interface AuthenticationProvider {

}

class UsernamePasswordProvider implements AuthenticationProvider{
	
}

class OAuthTokenProvider implements AuthenticationProvider{
	
}

class FakeProvider implements AuthenticationProvider{
	
}


