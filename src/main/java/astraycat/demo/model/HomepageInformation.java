package astraycat.demo.model;

public class HomepageInformation {
  String name;
  String type;
  String url;
  String id;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public String toString() {
    return "HomepageInformation [name="
        + name
        + ", type="
        + type
        + ", url="
        + url
        + ", id="
        + id
        + "]";
  }
}
