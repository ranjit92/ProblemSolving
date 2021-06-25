package design.pattern.chainresponsibility;

public class FakeProcessor extends AuthenticationProcessor{

	public FakeProcessor(AuthenticationProcessor next) {
		super(next);
	}

	@Override
	public boolean isAuthorized(AuthenticationProvider authProvider) {
		return true;
	}

}
