/*
 *
 *  *  Copyright 2014 Orient Technologies LTD (info(at)orientechnologies.com)
 *  *
 *  *  Licensed under the Apache License, Version 2.0 (the "License");
 *  *  you may not use this file except in compliance with the License.
 *  *  You may obtain a copy of the License at
 *  *
 *  *       http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  *  Unless required by applicable law or agreed to in writing, software
 *  *  distributed under the License is distributed on an "AS IS" BASIS,
 *  *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  *  See the License for the specific language governing permissions and
 *  *  limitations under the License.
 *  *
 *  * For more information: http://www.orientechnologies.com
 *
 */
package com.orientechnologies.orient.server.distributed.task;

import java.util.Collections;
import java.util.List;

import com.orientechnologies.orient.server.distributed.ODistributedRequest;
import com.orientechnologies.orient.server.distributed.ORemoteTask;
import com.orientechnologies.orient.server.hazelcast.OHazelcastPlugin;

/**
 * Base class for Replicated tasks.
 *
 * @author Luca Garulli (l.garulli--at--orientechnologies.com)
 *
 */
public abstract class OAbstractReplicatedTask extends OAbstractRemoteTask {
  private static final long serialVersionUID = 1L;

  public List<OAbstractRemoteTask> getFixTask(ODistributedRequest iRequest, ORemoteTask iOriginalTask, Object iBadResponse,
      Object iGoodResponse, String executorNodeName, OHazelcastPlugin dManager) {
    return Collections.EMPTY_LIST;
  }

  public OAbstractRemoteTask getUndoTask(ODistributedRequest iRequest, Object iBadResponse) {
    return null;
  }

  public abstract String getPayload();
}