package com.stormpath.sdk.oauth;

public interface GoogleProvider extends Provider {

    String getClientId();

    GoogleProvider setClientId(String clientId);

    String getClientSecret();

    GoogleProvider setClientSecret(String clientSecret);

    String getRedirectUri();

    GoogleProvider setRedirectUri(String redirectUri);

}
