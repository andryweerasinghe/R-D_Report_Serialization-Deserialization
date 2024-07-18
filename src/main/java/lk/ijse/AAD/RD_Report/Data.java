/*
 * Author  : Mr.electrix
 * Project : RD_Report_AAD
 * Date    : 7/18/24

 */

package lk.ijse.AAD.RD_Report;

import java.io.Serializable;

public class Data implements Serializable {
    public int id;
    public String name;

    public Data(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Data{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
