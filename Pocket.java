/**
  * Eine generische Klasse mit der man ein beliebiges Objekt verpacken kann.
  */
public class Pocket<ContentType>{
  private ContentType content;
  
  public SomeThing(ContentType pContent){
    this.content = pContent;
  }
  
  public int getContent(){
    return content;
  }
  
  public void setContent(ContentType pContent){
    this.content = pContent;
  }
}
