package command.pattern.ifelse;

public class BalanceCommandExecutor extends CommandExecutor{
	public static final String BALANCE = "balance"; 

	public BalanceCommandExecutor(UserBalance userBalance) {
		super(userBalance);
	}

	@Override
	protected boolean isValid(Command command) {
		return command.getParams().size()==1;
	}

	@Override
	protected boolean isAplicable(Command command) {
		return (command.getName().equals(BALANCE));
	}

	@Override
	protected String executeValidCommand(Command command) {
		String user = command.getParams().get(0);
		return userBalance.getUserBalance(user).toString();
	}

}
