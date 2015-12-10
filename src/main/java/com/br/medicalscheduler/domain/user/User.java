package com.br.medicalscheduler.domain.user;

/**
 * Created by mario on 12/8/2015.
 */
public interface User {

    boolean login(long cardNb, String password);

    String chooseRole(String role);
}
