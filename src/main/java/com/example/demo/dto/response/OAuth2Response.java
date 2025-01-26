package com.example.demo.dto.response;

import com.example.demo.model.Provider;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.http.HttpStatus;

import java.time.Instant;

/**
 * Represents an OAuth2 authentication response with provider-specific details.
 * 
 * <p>Example usage with pattern matching:
 * <pre>{@code
 * if (response instanceof OAuth2Response oauthRes) {
 *     handleOAuthUser(oauthRes.provider(), oauthRes.oauthAccessToken());
 * }
 * }</pre>
 */
@Schema(description = "OAuth2 authentication response containing provider-specific tokens and user details")
public record OAuth2Response(
    @Schema(description = "OAuth2 provider name", example = "GOOGLE")
    Provider provider,
    
    @Schema(description = "Original OAuth2 access token from provider", example = "ya29.a0AbV...")
    String oauthAccessToken,
    
    @Schema(description = "Generated JWT token for local authentication")
    String jwtToken,
    
    @Schema(description = "User details from OAuth2 provider")
    UserResponse userDetails
) implements AuthResponse {

    @Override
    public String message() {
        return "OAuth2 authentication successful via " + provider.name();
    }

    @Override
    public Instant timestamp() {
        return Instant.now();
    }

    @Override
    public HttpStatus status() {
        return HttpStatus.OK;
    }
}