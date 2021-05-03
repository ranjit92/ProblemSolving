package command.pattern.ifelse;

public abstract class CommandExecutor {

	protected UserBalance userBalance;
	
	public CommandExecutor(UserBalance userBalance) {
		this.userBalance = userBalance;
	}
	
	public String execute(final Command command) {
		if(!isValid(command)) {
			return "Invalid Command";
		}
		return executeValidCommand(command);
	}
	
	
	protected abstract boolean isValid(final Command command);
	
	protected abstract boolean isAplicable(final Command command);
	
	protected abstract String executeValidCommand(final Command command);
	
	
}
