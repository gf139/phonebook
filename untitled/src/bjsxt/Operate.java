package bjsxt;

import java.util.*;

public class Operate {
    private List<Person> list;      //用来储存人物
    public Operate(){
        this.list=new ArrayList<>();
    }

    /**
     * 用户添加记录业务逻辑控制
     */
    public void addLogic(){
        Menu menu=new Menu();   //建立后，建立判断是否正确的数字的对象
        TelNoteRegex telNoteRegex =new TelNoteRegex();
        while (true){
            menu.addMenu();
            int item=telNoteRegex.menuItemValidate(1,3);
            switch (item){
                case 1:this.addOperation();
                case 2:this.showAll();
                case 3:return;
            }
        }
    }
    /**
     *用户查询记录业务逻辑控制
    */
    public void searchLogic(){
        Menu menu=new Menu();   //建立后，建立判断是否正确的数字的对象
        TelNoteRegex telNoteRegex =new TelNoteRegex();
        while (true){
            menu.searchMenu();
            int item=telNoteRegex.menuItemValidate(1,7);
            switch (item){
                case 1: this.searchByName();break;
                case 2: this.searchByAge();break;
                case 3: this.searchBySex();break;
                case 4: this.searchByTelNum();break;
                case 5: this.searchByAdd();break;
                case 6: this.showAll();break;
                case 7: return;
            }
        }
    }
    /**
     * 修改记录业务逻辑控制
     */
    public void modifyLogic(){
        Menu menu=new Menu();   //建立后，建立判断是否正确的数字的对象
        TelNoteRegex telNoteRegex =new TelNoteRegex();
        while (true){
            menu.modifyMenu();
            int item=telNoteRegex.menuItemValidate(1,3);
            switch (item){
                case 1: this.showAll();break;
                case 2: this.modifyOperation();break;
                case 3: return;
            }
        }
    }
    /**
     * 删除记录业务逻辑控制
     */
    public void deleteLogic(){
        Menu menu=new Menu();   //建立后，建立判断是否正确的数字的对象
        TelNoteRegex telNoteRegex =new TelNoteRegex();
        while (true){
            menu.deleteMenu();
            int item=telNoteRegex.menuItemValidate(1,4);
            switch (item){
                case 1: this.showAll();break;
                case 2: this.deleteOperation();break;
                case 3: deleteAllOperation();break;
                case 4:return;
            }
        }
    }
    /**
     * 排序记录业务逻辑控制
     */
    public void orderLogic(){
        Menu menu=new Menu();   //建立后，建立判断是否正确的数字的对象
        TelNoteRegex telNoteRegex =new TelNoteRegex();
        while (true){
            menu.orderMenu();
            int item=telNoteRegex.menuItemValidate(1,5);
            switch (item){
                case 1: this.orderName();break;
                case 2: this.orderAge();break;
                case 3: this.orderSex();break;
                case 4: this.showAll();break;
                case 5: return;
            }
        }
    }
    /**
     * 添加新记录信息
     */
    public void addOperation(){
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        String name= telNoteRegex.nameValidate();
        String age= telNoteRegex.ageValidate();
        String sex= telNoteRegex.sexValidate();
        String telNum= telNoteRegex.telNumValidate();
        String address= telNoteRegex.addressValidate();
        Person person = new Person(name,age,sex,telNum,address);
        this.list.add(person);
        person.setId(this.list.size());
    }
    /**
     * 查询全部记录
     */
    public void showAll(){
        if(this.list.size()==0){
            System.out.println("没有任何记录");
            return;
        }
        for(int i=0;i<this.list.size();i++){
            System.out.println(this.list.get(i));
        }
    }
    /**
     * 按姓名查询记录
     */
    public void searchByName(){
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        String name = telNoteRegex.nameValidate();
        boolean flag=true;
        for(int i=0;i<this.list.size();i++){
            if(name.equals(this.list.get(i).getName())){
                System.out.println(this.list.get(i));
                flag=false;
            }
        }
        if(flag){
            System.out.println("没有此人记录");
        }
    }
    /**
     * 按年龄查询记录
     */
    public void searchByAge(){
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        String age = telNoteRegex.ageValidate();
        boolean flag=true;
        for(int i=0;i<this.list.size();i++){
            if(age.equals(this.list.get(i).getAge())){
                System.out.println(this.list.get(i));
                flag=false;
            }
        }
        if(flag){
            System.out.println("没有此人记录");
        }
    }
    /**
     * 按性别查询记录
     */
    public void searchBySex(){
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        String sex = telNoteRegex.sexValidate();
        boolean flag=true;
        for(int i=0;i<this.list.size();i++){
            if(sex.equals(this.list.get(i).getSex())){
                System.out.println(this.list.get(i));
                flag=false;
            }
        }
        if(flag){
            System.out.println("没有此人记录");
        }
    }
    /**
     * 按电话号码查询记录
     */
    public void searchByTelNum(){
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        String telNum = telNoteRegex.telNumValidate();
        boolean flag=true;
        for(int i=0;i<this.list.size();i++){
            if(telNum.equals(this.list.get(i).getTelNum())){
                System.out.println(this.list.get(i));
                flag=false;
            }
        }
        if(flag){
            System.out.println("没有此人记录");
        }
    }
    /**
     * 按地址查询记录
     */
    public void searchByAdd(){
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        String address = telNoteRegex.addressValidate();
        boolean flag=true;
        for(int i=0;i<this.list.size();i++){
            if(address.equals(this.list.get(i).getAddress())){
                System.out.println(this.list.get(i));
                flag=false;
            }
        }
        if(flag){
            System.out.println("没有此人记录");
        }
    }
    /**
     * 修改指定记录
     */
    public void modifyOperation(){
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        Menu menu=new Menu();
        System.out.println("请输入记录的序号:");
        int itemNum=telNoteRegex.menuItemValidate(1,this.list.size());      //确定可以删除id的范围
        menu.subModifyMenu();       //显示菜单
        int menuItem=telNoteRegex.menuItemValidate(1,6);
        switch (menuItem){
            //(this.list.get(itemNum-1))先获取到对象然后再进行操作
            case 1: String name = telNoteRegex.nameValidate();
                (this.list.get(itemNum - 1)).setName(name);break;
            case 2:String age=telNoteRegex.ageValidate();
                (this.list.get(itemNum-1)).setAge(age);break;
            case 3:String sex=telNoteRegex.sexValidate();
                (this.list.get(itemNum-1)).setSex(sex);break;
            case 4:String tel=telNoteRegex.telNumValidate();
                (this.list.get(itemNum-1)).setTelNum(tel);break;
            case 5:String add=telNoteRegex.addressValidate();
                (this.list.get(itemNum-1)).setAddress(add);break;
            case 6:return;
        }
    }
    /**
     * 删除指定记录
     */
    public void deleteOperation(){
        TelNoteRegex telNoteRegex=new TelNoteRegex();
        System.out.println("请输入记录序号");
        int itemNum=telNoteRegex.menuItemValidate(1,this.list.size());
        this.list.remove(itemNum-1);
        //删除后重新为记录设置新的序号
        for(int i=0;i<this.list.size();i++){
            (this.list.get(i)).setId(i+1);
        }
        System.out.println("删除成功！请继续操作!");
    }
    /**
     * 删除全部记录
     */
    public void deleteAllOperation(){
        this.list.clear();
        System.out.println("电话记录已清空！");
    }
    /**
     * 按用户姓名排序记录
     */
    public void orderName(){
        Collections.sort(this.list,new OrderByName());

        for(int i=0;i<this.list.size();i++){
            (this.list.get(i)).setId(i+1);
        }
    }
    /**
     * 按用户年龄排序记录
     */
    public void orderAge(){
        //整理
        Collections.sort(this.list,new OrderByAge());
        //修改序号
        for(int i=0;i<this.list.size();i++){
            (this.list.get(i)).setId(i+1);
        }
    }
    /**
     * 按用户性别排序记录
     */
    public void orderSex(){
        Collections.sort(this.list,new OrderBySex());
        for(int i=0;i<this.list.size();i++){
            (this.list.get(i)).setId(i+1);
        }
    }
}
