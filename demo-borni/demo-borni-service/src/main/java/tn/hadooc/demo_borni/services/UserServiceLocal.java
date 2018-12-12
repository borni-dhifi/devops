package tn.hadooc.demo_borni.services;

import javax.ejb.Local;

import tn.hadooc.demo_borni.entities.User;
import tn.hadooc.demo_borni.utilities.IGenericDAO;

@Local
public interface UserServiceLocal extends IGenericDAO<User> {

	User login(String login, String password);

}
