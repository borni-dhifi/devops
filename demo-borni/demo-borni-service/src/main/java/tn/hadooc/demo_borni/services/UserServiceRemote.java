package tn.hadooc.demo_borni.services;

import javax.ejb.Remote;

import tn.hadooc.demo_borni.entities.User;
import tn.hadooc.demo_borni.utilities.IGenericDAO;

@Remote
public interface UserServiceRemote extends IGenericDAO<User> {

}
