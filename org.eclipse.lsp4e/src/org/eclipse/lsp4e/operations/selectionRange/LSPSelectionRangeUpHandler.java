/*******************************************************************************
 * Copyright (c) 2023 Red Hat Inc. and others.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Angelo ZERR (Red Hat Inc.) - initial implementation
 *******************************************************************************/
package org.eclipse.lsp4e.operations.selectionRange;

import org.eclipse.lsp4e.operations.selectionRange.LSPSelectionRangeAbstractHandler.SelectionRangeHandler.Direction;

/**
 * Selection range UP handler.
 *
 * @author Angelo ZERR
 *
 */
public class LSPSelectionRangeUpHandler extends LSPSelectionRangeAbstractHandler {

	@Override
	protected Direction getDirection() {
		return Direction.UP;
	}
}
