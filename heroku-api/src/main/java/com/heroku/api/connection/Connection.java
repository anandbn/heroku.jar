package com.heroku.api.connection;

import com.heroku.api.request.Request;

/**
 * Connection manager for connecting to the Heroku API.
 *
 * @author Naaman Newbold
 */
public interface Connection {

    <T> T execute(Request<T> request);

    String getApiKey();

    void close();

}
