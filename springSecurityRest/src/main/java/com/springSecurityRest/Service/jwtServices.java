package com.springSecurityRest.Service;

import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import javax.crypto.SecretKey;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

@Service
public class jwtServices {
	
    @Value("${secretkey}")
	private String secretkey;

//	public jwtServices() throws NoSuchAlgorithmException {
//		KeyGenerator keyGen = KeyGenerator.getInstance("HmacSHA256");
//		SecretKey sk = keyGen.generateKey();
//		secretkey = Base64.getEncoder().encodeToString(sk.getEncoded());
//	}

	public String genetateToken(String username) {

		Map<String, Object> claims = new HashMap<>();
		claims.put("username", username);

		/* Generating a token with give subject */
		return Jwts.builder().claims().add(claims).subject(username).issuedAt(new Date(System.currentTimeMillis()))
				.expiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 30)).and().signWith(getKey())
				.compact();
	}

	private SecretKey getKey() {
		byte[] keysBytes = Base64.getDecoder().decode(secretkey);
		return Keys.hmacShaKeyFor(keysBytes);
	}

	private SecretKey decrypt(String secretkey2) {
		byte[] keysBytes = Base64.getDecoder().decode(secretkey2);
		return Keys.hmacShaKeyFor(keysBytes);
	}

	/* Extracting all the claims */
	public Claims extractAllClaimsFromToken(String token) {
		return Jwts.parser().verifyWith (decrypt(secretkey)).build().parseSignedClaims(token).getPayload();
	}

	/* Extracting a specific part of the claim */
	public <T> T extractClaim(String token, Function<Claims, T> claimResolver) {
		Claims claims = extractAllClaimsFromToken(token);
		return claimResolver.apply(claims);
	}

	public String extractUserName(String token) {
		return extractClaim(token, Claims::getSubject);
	}

	public Date extractExpiration(String token) {
		return extractClaim(token, Claims::getExpiration);
	}

	private boolean isTokenExpired(String token) {
		Date expiration = extractExpiration(token);
		return expiration.before(new Date());
	}

	public boolean validateToken(String token, UserDetails userDetails) {
		String username = extractUserName(token);
		return (username.equals(userDetails.getUsername()) && !isTokenExpired(token));
	}

}
