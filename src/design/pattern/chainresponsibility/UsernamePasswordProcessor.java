package design.pattern.chainresponsibility;

public class UsernamePasswordProcessor extends AuthenticationProcessor{

	public UsernamePasswordProcessor(AuthenticationProcessor next) {
		super(next);
	}

	@Override
	public boolean isAuthorized(AuthenticationProvider authProvider) {
		
		if(authProvider instanceof UsernamePasswordProvider) {
			return true;
		}
		else if(next != null){
			return next.isAuthorized(authProvider);
		}
		return false;
	}

}
