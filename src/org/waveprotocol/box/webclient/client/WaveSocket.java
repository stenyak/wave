/**
 * Copyright 2010 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.waveprotocol.box.webclient.client;

/**
 * This interface serves as a proxy interface wrapper for concrete socket implementations
 * like {@link com.google.gwt.websockets.client.WebSocket}.
 * 
 * @author tad.glines@gmail.com (Tad Glines)
 */
public interface WaveSocket {
  interface WaveSocketCallback {
    void onConnect();
    void onDisconnect();
    void onMessage(String message);
  }

  void connect();
  void disconnect();
  void sendMessage(String message);
}