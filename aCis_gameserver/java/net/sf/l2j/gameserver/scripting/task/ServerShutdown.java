package net.sf.l2j.gameserver.scripting.task;

import net.sf.l2j.gameserver.Shutdown;
import net.sf.l2j.gameserver.scripting.ScheduledQuest;

public final class ServerShutdown extends ScheduledQuest
{
	private static final int PERIOD = 600; // 10 minutes
	
	public ServerShutdown()
	{
		super(-1, "task");
	}
	
	@Override
	public final void onStart()
	{
		new Shutdown(PERIOD, false).start();
	}
	
	@Override
	public final void onEnd()
	{
		// Do nothing.
	}
}