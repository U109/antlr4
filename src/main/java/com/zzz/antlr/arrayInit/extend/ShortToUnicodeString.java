package com.zzz.antlr.arrayInit.extend;

import com.zzz.antlr.arrayInit.ArrayInitBaseListener;
import com.zzz.antlr.arrayInit.ArrayInitBaseVisitor;
import com.zzz.antlr.arrayInit.ArrayInitParser;

/**
 * @author: Zzz
 * @date: 2023/6/6 18:06
 * @description:
 */
public class ShortToUnicodeString extends ArrayInitBaseListener {

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterInit(ArrayInitParser.InitContext ctx) {
        super.enterInit(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void exitInit(ArrayInitParser.InitContext ctx) {
        super.exitInit(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     *
     * @param ctx
     */
    @Override
    public void enterValue(ArrayInitParser.ValueContext ctx) {
        super.enterValue(ctx);
    }
}
