/**
 * Copyright 2010 Tobias Sarnowski
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * (c) 2010 Tobias Sarnowski
 * All rights reserved.
 */
package org.onsteroids.eve.api.provider.account;

import com.eveonline.api.account.Characters;
import com.eveonline.api.account.CharactersApi;
import com.eveonline.api.exceptions.ApiException;
import com.google.common.base.Preconditions;
import org.junit.Test;
import org.onsteroids.eve.api.provider.AbstractApiTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * @author Tobias Sarnowski
 */
public class LimitedCharacters extends AbstractApiTest {
	private static final Logger LOG = LoggerFactory.getLogger(LimitedCharacters.class);

	@Test
	public void retrieveCharacters() throws ApiException {
		CharactersApi charactersApi = getService(CharactersApi.class);
		List<Characters.Character> characters = Preconditions.checkNotNull(charactersApi.getCharacters(getLimitedApiKey()), "Characters");

		for (Characters.Character character: characters) {
			LOG.info("Found Character:  {} ({}) [{} ({})]", new Object[]{
					character.getName(),
					character.getId(),
					character.getCorporationName(),
					character.getCorporationId()
			});
		}
	}
}
