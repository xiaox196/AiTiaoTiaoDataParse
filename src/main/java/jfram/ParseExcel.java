package jfram;

import javax.swing.filechooser.FileSystemView;
import java.util.List;

/**
 * @author alun
 * @data 2018/8/15
 */
public class ParseExcel {

    String path="";
    static  List<IDs> ids=null;
    public ParseExcel(String path) {
        this.path = path;
        ids=ExcelReaderUtil.readExcel(path);
    }

    //1.wangwang  2.weixin  3.mobile
    public  String isMatchById(String data,int which){
        if(ids!=null){
            for(IDs id:ids){
                String wexinIds=id.getWeixinIds();
                String wangwang=id.getWangwangIds();
                String mobile=id.getMobileIds();
                String name=id.getName();
                if(which==1){
                    if(wangwang.contains(data)){
                        return "文本："+name+" 命中旺旺id："+data;
                    }
                }if(which==2){
                    if(wexinIds.contains(data)){
                        return "文本："+name+" 命中微信id："+data;
                    }
                }if(which==3){
                    if(mobile.contains(data)){
                        return "文本："+name+" 命中手机号："+data;
                    }
                }
            }
            return "未找到";
        }
        return "出错了,请检查文本格式";
    }
}
