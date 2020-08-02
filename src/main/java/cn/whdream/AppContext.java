package cn.whdream;

import freemarker.template.Configuration;

/**
 * @author wanghao <a href="blackJuly@outlook.com">Contact me.</a>
 * created:  2020/8/2
 * desc : The class is used for .....
 */
public class AppContext {
    private Configuration cfg;
    public void init(){
         cfg = new Configuration(Configuration.VERSION_2_3_30);
        String file =  getClass().getResource("Service.ftl").getFile();
        System.out.println(file);
    }
}
