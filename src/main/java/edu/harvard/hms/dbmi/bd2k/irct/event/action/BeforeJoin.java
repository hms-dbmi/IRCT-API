/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package edu.harvard.hms.dbmi.bd2k.irct.event.action;

import edu.harvard.hms.dbmi.bd2k.irct.event.IRCTEvent;
import edu.harvard.hms.dbmi.bd2k.irct.model.join.Join;
import edu.harvard.hms.dbmi.bd2k.irct.model.security.SecureSession;

/**
 * An event listener that is run before a join is run
 * 
 * @author Jeremy R. Easton-Marks
 *
 */
public interface BeforeJoin extends IRCTEvent {

	void fire(SecureSession session, Join join);

}
