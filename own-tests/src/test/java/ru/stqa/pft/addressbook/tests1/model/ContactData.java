package ru.stqa.pft.addressbook.tests1.model;

public class ContactData {
  public String firstname;
  public String lastname;
  public String address;
  public String mail1;
  public String homePhone;
  public String group;

  public ContactData(String firstname, String lastname, String address, String mail1, String homePhone,String group) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.address = address;
    this.mail1 = mail1;
    this.homePhone = homePhone;
    this.group = group;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public String getAddress() {
    return address;
  }

  public String getMail1() {
    return mail1;
  }

  public String getHomePhone() {
    return homePhone;
  }

  public String getGroup() {
    return group;
  }
}
