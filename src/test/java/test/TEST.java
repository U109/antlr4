package test;

import com.gbase.gen.PLSQLLexer;
import com.gbase.gen.PLSQLParser;
import com.gbase.extend.translator_to_8s;
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

        translator_to_8s translator_to_8s = new translator_to_8s(tokens);
        translator_to_8s.visit(tree);
        String buildSPL = translator_to_8s.buildSPL();
        System.out.println(buildSPL);


    }


}
