package bjsxt;

import java.util.Scanner;
//测试键盘以及内容

public class TelNoteRegex {
    public int menuItemValidate (int min, int max){
        String regex="[1-9]{1}";
        //创建键盘对象
        Scanner scanner=new Scanner(System.in);
        while(true){
            System.out.println("请输入正确数字，最小是："+min+"\t"+"最大是："+max);
            String input=scanner.nextLine();    //接收数组对象
            if(input.matches(regex)){
                int inputNum=Integer.parseInt(input);   //将接收的对象转换为整形
                if(inputNum>=min && inputNum<=max){
                    return inputNum;
                }else{
                    System.out.println("您输入的菜单项不符，请重新输入！");
                }
            }else{
                System.out.println("你输入的数字有误，请检查！");
            }
        }
    }
    /**
     * 对用户输入姓名的验证
     * @return
     */
    public String nameValidate ( ){
        String regex="[a-zA-Z]{1,10}";
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("请输入姓名：格式为1-10之间的大写或小写字母");
            String input=scanner.nextLine();
            if(input.matches(regex)){
                return input;
            }else{
                System.out.println("姓名有误，请重新输入！");
            }
        }

    }
    /**
     * 对用户输入年龄的验证
     * @return
     */
    public String ageValidate ( ){
        String regex="[1-9]{1}[0-9]{1}||[1]{1}[0-5]{1}[0-6]{1}";
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("请输入年龄:格式为10-156之间");
            String input=scanner.nextLine();
            if(input.matches(regex)){
                return input;
            }else{
                System.out.println("年龄有误，重新输入~");
            }
        }
    }
    /**
     * 对用户输入性别的验证
     * @return
     */
    public String sexValidate ( ){
        String regex="[m|M|f|F]{1}";
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("输入性别：(男 m or M) (女 f or F)");
            String input=scanner.nextLine();
            if(input.matches(regex)){
                return input;
            }else{
                System.out.println("性别有误，重新输入~");
            }
        }
    }
    /**
     * 对用户输入电话号码的验证
     * @return
     */
    public String telNumValidate ( ){
        String regex="([1]{1}\\d{10})";
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("请输入电话号码：手机号。");
            String input=scanner.nextLine();
            if(input.matches(regex)){
                return input;
            }else{
                System.out.println("输入的电话有误，重新输入~");
            }
        }
    }
    /**
     * 对用户输入地址的验证
     * @return
     */
    public String addressValidate ( ){
        String regex="\\w{1,50}";
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("请输入地址：格式为字母或数字，长度为 1,50");
            String input=scanner.nextLine();
            if(input.matches(regex)){
                return input;
            }else{
                System.out.println("您输入的地址有误，重新输入！");
            }
        }
    }
}
