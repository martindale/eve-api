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
package org.onsteroids.eve.api.provider.server;

import com.eveonline.api.server.ServerStatusApi;
import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Tobias Sarnowski
 */
public final class ServerModule implements Module {
	private static final Logger LOG = LoggerFactory.getLogger(ServerModule.class);

	public void configure(Binder binder) {
		binder.bind(ServerStatusApi.class).to(ServerStatusApiImpl.class).in(Singleton.class);
	}
}
