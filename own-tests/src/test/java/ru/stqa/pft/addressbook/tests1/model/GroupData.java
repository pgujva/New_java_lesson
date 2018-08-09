package ru.stqa.pft.addressbook.tests1.model;

public class GroupData {
  public final String groupName;
  public final String header;
  public final String footer;

  public GroupData(String groupName, String header, String footer) {
    this.groupName = groupName;
    this.header = header;
    this.footer = footer;
  }

  public String getGroupName() {
    return groupName;
  }

  public String getHeader() {
    return header;
  }

  public String getFooter() {
    return footer;
  }
}
