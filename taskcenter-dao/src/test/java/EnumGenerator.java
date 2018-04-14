import cn.itbat.whh.taskcenter.model.BaDefinedCode;
import com.whh.common.utils.enums.EnumUtil;

import java.io.IOException;

/**
 * @author huahui.wu.(╯ ︵ ╰)
 * Created on 2018/4/13.
 */
public class EnumGenerator {
    public static void main(String[] args) throws IOException {
        BaDefinedCode baDefinedCode = new BaDefinedCode();
        String filePath = baDefinedCode.getClass().getResource("").getPath();
        filePath = filePath.substring(0, filePath.indexOf("-common") + 7);
        String r = EnumUtil.createEuumFile("cn.itbat.whh.taskcenter.enums", "UserCenterDefinedCode", filePath);
        System.out.println(r);
    }
}
