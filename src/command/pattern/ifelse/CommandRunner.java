package command.pattern.ifelse;

import java.util.List;

public class CommandRunner {

	List<CommandExecutor> list;
	
	public CommandRunner(List<CommandExecutor> list) {
		this.list = list;
	}
	
	public String runCommand(Command command) {
		for(CommandExecutor executor : list) {
			if(executor.isAplicable(command)) {
				return executor.execute(command);
			}
		}
		return "Invalid command";
	}
	
}
