package com.eviware.soapui.model.environment;

import com.eviware.soapui.model.project.Project;

public interface Environment
{

	public void setProject( Project project );

	public Project getProject();

	public void release();
}
