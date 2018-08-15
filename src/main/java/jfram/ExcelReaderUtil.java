package jfram;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Excel文件读取工具类
 */
public class ExcelReaderUtil {




    public static List<IDs> readExcel(String path){
        List<IDs> lists = new ArrayList<>();
        String fileType = path.substring(path.lastIndexOf(".") + 1);
        InputStream is = null;
        try {
            is = new FileInputStream(path);
            Workbook wb = null;
            if ("xls".equals(fileType)) {
                wb = new HSSFWorkbook(is);
            } else if ("xlsx".equals(fileType)) {
                wb = new XSSFWorkbook(is);
            } else {
                return null;
            }

            Iterator<Sheet> sheets= wb.sheetIterator();
            while (sheets.hasNext()){
                Sheet sheet =sheets.next();
                String name=sheet.getSheetName();
                if(!name.contains("Sheet")&&!name.contains("合计")){
                    IDs list = new IDs();
                    String wangwangIDs="";
                    String weixinIds="";
                    String mobile="";
                    for (Row row : sheet) {
                        for (Cell cell : row) {
                            int position=cell.getColumnIndex();
                            cell.setCellType(Cell.CELL_TYPE_STRING);
                            String data=cell.getStringCellValue();
                            if(null!=data&&!data.equals("")){
                                if(position==2){
                                    wangwangIDs=wangwangIDs+data+"#$% ";
                                }else if(position==3){
                                    weixinIds=weixinIds+data+"&*% ";
                                }else if(position==4){
                                    mobile=mobile+data+"&%￥ ";
                                }
                            }else {
                                continue;
                            }
                        }
                    }
                    list.setName(name);
                    list.setWeixinIds(weixinIds);
                    list.setWangwangIds(wangwangIDs);
                    list.setMobileIds(mobile);
                    lists.add(list);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (null != is) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return lists;
    }
}
