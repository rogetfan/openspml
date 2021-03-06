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
package org.openspml.v2.msg.spmlupdates;

import org.openspml.v2.msg.PrefixAndNamespaceTuple;
import org.openspml.v2.msg.spml.ExecutionMode;
import org.openspml.v2.msg.spml.Request;

/**
 * @author kent.spaulding@sun.com
 *         <p/>
 *         Date: Feb 15, 2006
 */
abstract class BasicRequest extends Request {

    private static final String code_id = "$Id: BasicRequest.java,v 1.5 2006/05/15 23:31:00 kas Exp $";

    protected BasicRequest() { ; }

    protected BasicRequest(String requestId,
                           ExecutionMode executionMode) {
        super(requestId, executionMode);
    }

    public PrefixAndNamespaceTuple[] getNamespacesInfo() {
        return PrefixAndNamespaceTuple.concatNamespacesInfo(
                super.getNamespacesInfo(),
                NamespaceDefinitions.getMarshallableNamespacesInfo());
    }

}
