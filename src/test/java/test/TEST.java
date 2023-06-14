package test;

import com.tianjing.gen.PLSQLLexer;
import com.tianjing.gen.PLSQLParser;
import com.tianjing.extend.TransProcTo8s;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * @author: Zzz
 * @date: 2023/6/13 17:14
 * @description:
 */
public class TEST {

    public static void main(String[] args) {
        String input = "CREATE OR REPLACE PROCEDURE get_employee_details (p_employee_id IN NUMBER, p_employee_name OUT VARCHAR2) IS BEGIN SELECT employee_name INTO p_employee_name FROM employees WHERE employee_id = p_employee_id; END get_employee_details;";
        ANTLRInputStream stream = new ANTLRInputStream(input);
        PLSQLLexer lexer = new PLSQLLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PLSQLParser parser = new PLSQLParser(tokens);
        ParseTree tree = parser.plsql_file();

        TransProcTo8s TransProcTo8s = new TransProcTo8s(tokens);
        TransProcTo8s.visit(tree);
        String buildSPL = TransProcTo8s.buildSPL();
        System.out.println(buildSPL);


    }


}
