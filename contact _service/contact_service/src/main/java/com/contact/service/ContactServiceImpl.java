package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class ContactServiceImpl implements ContactService{
    //fake list of contacts
    List<Contact> list = List.of(
            new Contact(1L,"aman","aman22@gmail.com",1311L),
            new Contact(2L,"anil","anil22@gmail.com",1311L),
            new Contact(3L,"sameer","sameer22@gmail.com",1312L),
            new Contact(4L,"rohan","rohan22@gmail.com",1314L)
    );


    @Override
    public List<Contact> getContactUser(Long userId) {
        return this.list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
