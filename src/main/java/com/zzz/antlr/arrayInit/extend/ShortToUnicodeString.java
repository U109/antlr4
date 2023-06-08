package com.zzz.antlr.arrayInit.extend;

import com.zzz.antlr.arrayInit.gen.ArrayInitBaseListener;
import com.zzz.antlr.arrayInit.gen.ArrayInitParser;

/**
 * @author: Zzz
 * @date: 2023/6/6 18:06
 * @description:
 */
public class ShortToUnicodeString extends ArrayInitBaseListener {

    /**
     * 将 { 翻译为 ”
     */
    @Override
    public void enterInit(ArrayInitParser.InitContext ctx) {
        System.out.print("\"");
    }

    /**
     * 将 } 翻译为 “
     */
    @Override
    public void exitInit(ArrayInitParser.InitContext ctx) {
        System.out.print("\"");
    }

    /**
     * 将每个整数翻译为四位的十六进制形式
     */
    @Override
    public void enterValue(ArrayInitParser.ValueContext ctx) {
        //假定不存在嵌套结构
        int value = Integer.parseInt(ctx.INT().getText());
        //%04x 是一个格式化字符串，表示将整数格式化为4位十六进制数，不足4位的用0填充。
        System.out.printf("\\u%04x",value);
    }
}
