package pt.ist.fenixframework.backend.dp;

import pt.ist.fenixframework.dml.CompilerArgs;
import pt.ist.fenixframework.dml.DomainModel;
import pt.ist.fenixframework.dml.IndexesCodeGenerator;

public class DpCodeGenerator extends IndexesCodeGenerator {

    public DpCodeGenerator(CompilerArgs compArgs, DomainModel domainModel) {
        super(compArgs, domainModel);
    }

    @Override
    protected String getDomainClassRoot() {
        return DpDomainObject.class.getName();
    }

    @Override
    protected String getBackEndName() {
        return DpBackEnd.BACKEND_NAME;
    }

    @Override
    protected String getDefaultConfigClassName() {
        return DpConfig.class.getName();
    }

}
