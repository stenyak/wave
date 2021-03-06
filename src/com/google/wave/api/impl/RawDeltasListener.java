/*
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

package com.google.wave.api.impl;

import java.util.List;

/**
 * Listener to receive exported deltas.
 *
 * @author akaplanov@gmail.com (Andrew Kaplanov)
 */
public interface RawDeltasListener {

  /**
   * @param rawDeltas serialized ProtocolWaveletDelta.
   * @param rawTargetVersion serialized ProtocolHashedVersion.
   */
  public void onSuccess(List<byte[]> rawDeltas, byte[] rawTargetVersion);

  public void onFailire(String message);
}
