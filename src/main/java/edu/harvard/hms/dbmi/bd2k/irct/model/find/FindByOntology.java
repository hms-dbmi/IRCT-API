/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package edu.harvard.hms.dbmi.bd2k.irct.model.find;

import java.util.HashMap;
import java.util.Map;

public class FindByOntology implements FindInformationInterface {
	Map<String, String> values;
	
	public FindByOntology() {
		values = new HashMap<String, String>();
	}
	
	@Override
	public void setValue(String parameter, String value) {
		values.put(parameter, value);
	}

	@Override
	public String getType() {
		return "FindOntology";
	}

	@Override
	public String[] getRequiredParameters() {
		
		return new String[] { "ontologyTerm", "ontologyType" };
	}

	@Override
	public Map<String, String> getValues() {
		return values;
	}

}
