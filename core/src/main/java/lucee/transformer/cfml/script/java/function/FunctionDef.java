package lucee.transformer.cfml.script.java.function;

import java.util.List;

import lucee.commons.lang.compiler.SourceCode;
import lucee.runtime.PageSource;
import lucee.transformer.bytecode.statement.Argument;

public interface FunctionDef {

    public SourceCode createSourceCode(PageSource ps, String javaCode, String id, String funcName, String hint, List<Argument> args);

}
