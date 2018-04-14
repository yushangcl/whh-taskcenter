
import com.whh.common.generator.MybatisGeneratorUtil;
import com.whh.common.utils.util.PropertiesFileUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * 代码生成类
 * Created by ZhangShuzheng on 2017/1/10.
 */
public class Generator {

    // 根据命名规范，只修改此常量值即可
    private static String MODULE = "taskcenter";
    private static String DATABASE = "test";
    private static String target_dir = Generator.class.getResource("/").getFile();
    private static String PROJECT_DIR = target_dir.substring(0,target_dir.lastIndexOf(MODULE+"-dao"));
    private static String PACKAGE_NAME = "cn.itbat.whh." + MODULE;
    private static String JDBC_DRIVER = PropertiesFileUtil.getInstance("generator").get("generator.jdbc.driver");
    private static String JDBC_URL = PropertiesFileUtil.getInstance("generator").get("generator.jdbc.url");
    private static String JDBC_USERNAME = PropertiesFileUtil.getInstance("generator").get("generator.jdbc.username");
    private static String JDBC_PASSWORD = PropertiesFileUtil.getInstance("generator").get("generator.jdbc.password");
    // 需要insert后返回主键的表配置，key:表名,value:主键名
    private static Map<String, String> LAST_INSERT_ID_TABLES = new HashMap<>();
    static {

    }

    /**
     * 自动代码生成
     * @param args
     */
    public static void main(String[] args) throws Exception {
        String tableNames = "ba_defined_code";
        MybatisGeneratorUtil.generator(PROJECT_DIR, MODULE, tableNames, PACKAGE_NAME, LAST_INSERT_ID_TABLES, "mysql");
    }

}
