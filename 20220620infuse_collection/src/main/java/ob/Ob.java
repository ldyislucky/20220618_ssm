package ob;

import java.util.*;

/**
 * @author : ldy
 * @version : 1.0
 */
public class Ob {
  private int[] arr;
  private List list;
  private Set set;
  private Map map;
  private Properties pro;

  public void setArr(int[] arr) {
    this.arr = arr;
  }

  public void setList(List list) {
    this.list = list;
  }

  public void setSet(Set set) {
    this.set = set;
  }

  public void setMap(Map map) {
    this.map = map;
  }

  public void setPro(Properties pro) {
    this.pro = pro;
  }

  @Override
  public String toString() {
    return "Ob{" +
            "arr=" + Arrays.toString(arr) +
            ", list=" + list +
            ", set=" + set +
            ", map=" + map +
            ", pro=" + pro +
            '}';
  }
}
