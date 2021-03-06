/**
 * Copyright (C) 2014-2016 Open Whisper Systems
 *
 * Licensed according to the LICENSE file in this repository.
 */

package org.whispersystems.signalservice.internal.push;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccountAttributes {

  @JsonProperty
  private String  signalingKey;

  @JsonProperty
  private boolean fetchesMessages;

  @JsonProperty
  private int     registrationId;

  @JsonProperty
  private boolean voice;

  public AccountAttributes(String signalingKey, boolean fetchesMessages, int registrationId, boolean voice) {
    this.signalingKey    = signalingKey;
    this.fetchesMessages = fetchesMessages;
    this.registrationId  = registrationId;
    this.voice           = voice;
  }

  public AccountAttributes() {}

  public String getSignalingKey() {
    return signalingKey;
  }

  public boolean isFetchesMessages() {
    return fetchesMessages;
  }

  public int getRegistrationId() {
    return registrationId;
  }

  public boolean isVoice() {
    return voice;
  }
}
