/*******************************************************************************
 * Copyright (c) 2017 Red Hat, Inc. 
 * Distributed under license by Red Hat, Inc. All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at https://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation
 ******************************************************************************/
package org.jboss.tools.fuse.reddeer.runtime.impl;

/**
 * WildFly Server
 * 
 * @author apodhrad
 * 
 */
public class ServerWildFly extends ServerAS {

	private final String category = "JBoss Community";

	private final String label = "WildFly";

	@Override
	public String getCategory() {
		return category;
	}

	@Override
	public String getServerType() {
		return label + "  " + getVersion();
	}

	@Override
	public String getRuntimeType() {
		return label + "  " + getVersion() + " Runtime";
	}

}
