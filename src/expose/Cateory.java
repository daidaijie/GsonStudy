package expose;

import com.google.gson.annotations.Expose;

import java.util.List;

/**
 * Created by daidaijie on 2016/5/21.
 */
public class Cateory {


  /*  @Expose //
    @Expose(deserialize = true,serialize = true) //序列化和反序列化都都生效
    @Expose(deserialize = true,serialize = false) //反序列化时生效
    @Expose(deserialize = false,serialize = true) //序列化时生效
    @Expose(deserialize = false,serialize = false) // 和不写一样
    */

    /**
     * id : 1
     * name : 电脑
     * children : [{"id":100,"name":"笔记本"},{"id":101,"name":"台式机"}]
     */

    @Expose
    private int id;

    @Expose
    private String name;
    /**
     * id : 100
     * name : 笔记本
     */
    @Expose
    private List<Cateory> children;

    private Cateory parent;


    public Cateory getParent() {
        return parent;
    }

    public void setParent(Cateory parent) {
        this.parent = parent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Cateory> getChildren() {
        return children;
    }

    public void setChildren(List<Cateory> children) {
        this.children = children;
    }
}
