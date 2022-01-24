package com.xyz.utils;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by qingm.
 *
 * @author qingm
 * @date 2020-05-29
 * @description
 */
@Deprecated
public class JwtTokenUtil implements Serializable {/*
    // 后端秘钥
    private String secret = "f9b39c515a4b4048a1d67979f957e759";
    // 默认有效期 6h
    private long expiration = 60000*60*12;

    private String header = "Authorization";
    private String query = "Authorization";
    // 业务系统从request中获取userId的header名
    private final String userIdHeader = "userId";

    *//**
     * 从数据声明生成令牌
     *
     * @param claims 数据声明
     * @return 令牌
     *//*
    private String generateToken(Map<String, Object> claims) {
        Date expirationDate = new Date(System.currentTimeMillis() + expiration);
        return Jwts.builder()
                .setClaims(claims)
                .setExpiration(expirationDate)
                .signWith(SignatureAlgorithm.HS512, secret)
                .compact();
    }

    *//**
     * 从令牌中获取数据声明
     * @param token 令牌
     * @return 数据声明
     *//*
    private Claims getClaimsFromToken(String token) {
        Claims claims;
        claims = Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
        return claims;
    }

    *//**
     * 生成令牌
     *
     * @param userId
     * @return 令牌
     *//*
    public String generateToken(String userId) {
        Map<String, Object> claims = new HashMap<>(2);
        claims.put("sub", userId);
        claims.put("created", new Date());
        return generateToken(claims);
    }

    *//**
     * 从令牌中获取用户名
     *
     * @param token 令牌
     * @return 用户名
     *//*
    public String getUsernameFromToken(String token) {
        String username;
        try {
            Claims claims = getClaimsFromToken(token);
            username = claims.getSubject();
        } catch (Exception e) {
            username = null;
        }
        return username;
    }

    *//**
     * 从令牌中获取userId
     * @param token 令牌
     * @return 用户名
     *//*
    public Integer getUserIdFromToken(String token) {
        Integer userId;
        try {
            Claims claims = getClaimsFromToken(token);
            userId = Integer.valueOf(claims.getSubject());
        } catch (Exception e) {
            userId = null;
        }
        return userId;
    }

    *//**
     * 判断令牌是否过期
     *
     * @param token 令牌
     * @return 是否过期
     *//*
    public Boolean isTokenExpired(String token) {
        try {
            Claims claims = getClaimsFromToken(token);
            Date expiration = claims.getExpiration();
            return expiration.before(new Date());
        } catch (Exception e) {
            return true;
        }
    }

    *//**
     * 刷新令牌
     *
     * @param token 原令牌
     * @return 新令牌
     *//*
    public String refreshToken(String token) {
        String refreshedToken;
        try {
            Claims claims = getClaimsFromToken(token);
            claims.put("created", new Date());
            refreshedToken = generateToken(claims);
        } catch (Exception e) {
            refreshedToken = null;
        }
        return refreshedToken;
    }

    *//**
     * 验证令牌
     *
     * @param token       令牌
     * @param userId      用户
     * @return 是否有效
     *//*
    public Boolean validateToken(String token, Integer userId) {
        Integer username = getUserIdFromToken(token);
        return (username.equals(userId) && !isTokenExpired(token));
    }


    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public Long getExpiration() {
        return expiration;
    }

    public void setExpiration(Long expiration) {
        this.expiration = expiration;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getUserIdHeader() {
        return userIdHeader;
    }
*/}
