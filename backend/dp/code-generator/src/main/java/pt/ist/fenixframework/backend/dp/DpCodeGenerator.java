package pt.ist.fenixframework.backend.dp;
import pt.ist.fenixframework.dml.CodeGenerator;

import pt.ist.fenixframework.dml.CompilerArgs;
import pt.ist.fenixframework.dml.DomainModel;
import pt.ist.fenixframework.dml.IndexesCodeGenerator;

public class DpCodeGenerator extends CodeGenerator {

    public DpCodeGenerator(CompilerArgs compArgs, DomainModel domainModel) {
        super(compArgs, domainModel);
    }

    @Override
    protected String getBackEndName() {
        return "N/A";
    }

    @Override
    protected String getDefaultConfigClassName() {
        return "N/A";
    }

}
