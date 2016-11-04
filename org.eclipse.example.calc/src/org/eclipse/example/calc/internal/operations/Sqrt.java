/*******************************************************************************
 * Copyright (C) 2010, Matthias Sohn <matthias.sohn@sap.com>
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.example.calc.internal.operations;

import org.eclipse.example.calc.UnaryOperation;

/**
 * Sqrt operation
 */
public class Sqrt extends AbstractOperation implements UnaryOperation {

	@Override
	public String getName() {
		return "sqrt";
	}

	@Override
	public float perform(float arg1) {
		return (float)Math.sqrt(arg1);
	}

}
