/******************************************************************************* * Copyright (c) 2005 IBM Corporation and others. * All rights reserved. This program and the accompanying materials * are made available under the terms of the Eclipse Public License v1.0 * which accompanies this distribution, and is available at * http://www.eclipse.org/legal/epl-v10.html * * Contributors: *     IBM Corporation - initial API and implementation ******************************************************************************/package org.eclipse.jface.menus;/** * <p> * <strong>Experimental</strong>. This class or interface has been added as * part of a work in progress. There is a guarantee neither that this API will * work nor that it will remain the same. Please do not use this API with * consulting with the Platform/UI team. * </p> *  * @since 3.2 */public interface IMenuCollection {	/**	 * Appends a menu element to the end of the collection.	 * 	 * @param element	 *            The element to append. Must not be null, and must be of the	 *            appropriate type for the type of collection.	 */	public void add(MenuElement element);	/**	 * Adds a menu element at the given index.	 * 	 * @param index	 *            The index at which to insert.	 * @param element	 *            The element to append. Must not be null, and must be of the	 *            appropriate type for the type of collection.	 */	public void add(int index, MenuElement element);	/**	 * Removes all elements from the collection.	 */	public void clear();	/**	 * Gets the element at a given index.	 * 	 * @param index	 *            The index at which to retrieve the element.	 * @return The element at the index.	 */	public MenuElement get(int index);	/**	 * Removes the element at a given index.	 * 	 * @param index	 *            The index at which to remove the element.	 * @return The element that has been removed.	 */	public MenuElement remove(int index);	/**	 * Removes the given menu element, if it exists.	 * 	 * @param element	 *            The element to remove.	 * @return true if the object was removed; false if it could not be found.	 */	public boolean remove(MenuElement element);	/**	 * Returns the number of elements in the collection.	 * 	 * @return The size of the collection.	 */	public int size();}