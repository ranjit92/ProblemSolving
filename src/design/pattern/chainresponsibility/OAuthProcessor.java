package design.pattern.chainresponsibility;

public class OAuthProcessor extends AuthenticationProcessor{

	public OAuthProcessor(AuthenticationProcessor next) {
		super(next);
	}

	@Override
	public boolean isAuthorized(AuthenticationProvider authProvider) {
		
		if(authProvider instanceof OAuthTokenProvider) {
			return true;
		}
		else if(next != null){
			return next.isAuthorized(authProvider);
		}
		return false;
	}

}
