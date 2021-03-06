/*
 * CDDL HEADER START
 *
 * The contents of this file are subject to the terms of the
 * Common Development and Distribution License, Version 1.0 only
 * (the "License").  You may not use this file except in compliance
 * with the License.
 *
 * You can obtain a copy of the license at /OPENSPML_V2_TOOLKIT.LICENSE
 * or http://www.openspml.org/v2/licensing.
 * See the License for the specific language governing permissions
 * and limitations under the License.
 *
 * When distributing Covered Code, include this CDDL HEADER in each
 * file and include the License file at /OPENSPML_V2_TOOLKIT.LICENSE.
 * If applicable, add the following below this CDDL HEADER, with the
 * fields enclosed by brackets "[]" replaced with your own identifying
 * information: Portions Copyright [yyyy] [name of copyright owner]
 *
 * CDDL HEADER END
 */
/*
 * Copyright 2006 Sun Microsystems, Inc.  All rights reserved.
 * Use is subject to license terms.
 */
package org.openspml.v2.msg;

/**
 * SPML 2.0 is an open content model.  The content carried by the various
 * objects in our toolkit, can be XML of any type, and implementors can
 * use whatever extra attributes and elements that they like.
 * <p/>
 * This class, and the OpenContentElement, are meant to represent the notion
 * of open content.
 * <p/>
 * This is a class used to represent XMLAttributes (name, type, and value)
 *
 * @author kent.spaulding@sun.com
 *         <p/>
 *         Date: Feb 1, 2006
 */
public interface OpenContentAttr {

    public static final String code_id = "$Id: OpenContentAttr.java,v 1.2 2006/04/21 23:09:02 kas Exp $";

    public String getName();

    public String getValue();

    // consider adding convience methods like this.
    public boolean getBooleanValue();
}