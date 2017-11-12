package org.zaverukha.edu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by alexanderzaverukha on 11/12/17.
 */
public class Login {
    static final Logger LOGGER = LoggerFactory.getLogger(Login.class);
    Login setUserName(String userName){
        LOGGER.info("UserName: " + userName);
        return this;
    }

    Login setPassword(String password){
        LOGGER.info("Password: " + password);
        return this;
    }


    HomePage submit(){
        return new HomePage();
    }


}
