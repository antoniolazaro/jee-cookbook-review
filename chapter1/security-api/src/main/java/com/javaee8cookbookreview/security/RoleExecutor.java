package com.javaee8cookbookreview.security;

import javax.annotation.security.RunAs;
import javax.ejb.Stateful;
import javax.ejb.Stateless;

@Stateful
public class RoleExecutor {

	public interface Executable {
		void execute() throws Exception;
	}

	@Stateless
	@RunAs(Roles.ADMIN)
	public static class AdminExecutor {

		public void run(Executable executable) throws Exception {
			executable.execute();
		}
	}

	@Stateless
	@RunAs(Roles.OPERATOR)
	public static class OperatorExecutor {
		public void run(Executable executable) throws Exception {
			executable.execute();
		}
	}
}