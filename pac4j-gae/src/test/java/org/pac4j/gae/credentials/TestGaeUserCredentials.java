/*
  Copyright 2012 - 2015 pac4j organization

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package org.pac4j.gae.credentials;

import com.google.appengine.api.users.User;
import junit.framework.TestCase;
import org.pac4j.core.util.TestsConstants;

/**
 * General test cases for GaeUserCredentials.
 *
 * @author  Jacob Severson
 * @since   1.8.0
 */
public class TestGaeUserCredentials extends TestCase implements TestsConstants {

    public void testClearGaeUserCredentials() {
        GaeUserCredentials gaeUserCredentials = new GaeUserCredentials ();
        gaeUserCredentials.setUser(new User("testEmail@test.com", "test.com", "testUserId"));
        gaeUserCredentials.clear();
        assertNull(gaeUserCredentials.getUser());
        assertNull(gaeUserCredentials.getClientName());
    }
}
