/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

/**
* @author Vera Y. Petrashkova
* @version $Revision$
*/

package org.apache.harmony.security.tests.java.security;

import dalvik.annotation.TestTargetClass;
import dalvik.annotation.TestTargets;
import dalvik.annotation.TestLevel;
import dalvik.annotation.TestTargetNew;

import java.security.InvalidParameterException;

import junit.framework.TestCase;
@TestTargetClass(InvalidParameterException.class)
/**
 * Tests for <code>InvalidParameterException</code> class constructors and
 * methods.
 * 
 */
public class InvalidParameterExceptionTest extends TestCase {

    static String[] msgs = {
            "",
            "Check new message",
            "Check new message Check new message Check new message Check new message Check new message" };

    static Throwable tCause = new Throwable("Throwable for exception");

    /**
     * Test for <code>InvalidParameterException()</code> constructor
     * Assertion: constructs InvalidParameterException with no detail message
     */
    @TestTargetNew(
        level = TestLevel.COMPLETE,
        notes = "",
        method = "InvalidParameterException",
        args = {}
    )
    public void testInvalidParameterException01() {
        InvalidParameterException tE = new InvalidParameterException();
        assertNull("getMessage() must return null.", tE.getMessage());
        assertNull("getCause() must return null", tE.getCause());
    }

    /**
     * Test for <code>InvalidParameterException(String)</code> constructor
     * Assertion: constructs InvalidParameterException with detail message msg.
     * Parameter <code>msg</code> is not null.
     */
    @TestTargetNew(
        level = TestLevel.PARTIAL_COMPLETE,
        notes = "",
        method = "InvalidParameterException",
        args = {java.lang.String.class}
    )
    public void testInvalidParameterException02() {
        InvalidParameterException tE;
        for (int i = 0; i < msgs.length; i++) {
            tE = new InvalidParameterException(msgs[i]);
            assertEquals("getMessage() must return: ".concat(msgs[i]), tE
                    .getMessage(), msgs[i]);
            assertNull("getCause() must return null", tE.getCause());
        }
    }

    /**
     * Test for <code>InvalidParameterException(String)</code> constructor
     * Assertion: constructs InvalidParameterException when <code>msg</code>
     * is null
     */
    @TestTargetNew(
        level = TestLevel.PARTIAL_COMPLETE,
        notes = "",
        method = "InvalidParameterException",
        args = {java.lang.String.class}
    )
    public void testInvalidParameterException03() {
        String msg = null;
        InvalidParameterException tE = new InvalidParameterException(msg);
        assertNull("getMessage() must return null.", tE.getMessage());
        assertNull("getCause() must return null", tE.getCause());
    }
}
