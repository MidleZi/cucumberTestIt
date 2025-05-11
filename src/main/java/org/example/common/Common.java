package org.example.common;

import java.util.Map;

public class Common {

    public static String parseInputStepParam(Context context, String paramStr) {
        String var = paramStr;
        //Если нету ни одного знака, то сразу возвращаем результат
        if (var != null && var.matches("^\\$.*\\$$")) {
            //вырезаем доллары
            String mapKey = var.substring(1, var.length() - 1);
            String val = context.get(mapKey);
            if (val != null) {
                var = val;
            } else {
                throw new RuntimeException("Не удалось получить значение переменной " + var);
            }
        }
        return var;
    }
}
