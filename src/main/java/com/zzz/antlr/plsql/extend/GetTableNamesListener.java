package com.zzz.antlr.plsql.extend;

import com.zzz.plsql.PlSqlParserBaseListener;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: Zzz
 * @date: 2023/6/9 9:27
 * @description:
 */
public class GetTableNamesListener extends PlSqlParserBaseListener {
    private final Set<String> tableNameSet = new HashSet<String>();
}
