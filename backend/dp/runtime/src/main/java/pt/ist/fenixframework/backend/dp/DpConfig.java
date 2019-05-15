package pt.ist.fenixframework.backend.dp;

import pt.ist.fenixframework.Config;
import pt.ist.fenixframework.FenixFramework;
import pt.ist.fenixframework.backend.BackEnd;
import pt.ist.fenixframework.hibernatesearch.HibernateSearchConfig;

/**
 * This is the default configuration manager used by the fenix-framework-core.
 *
 * @see Config
 *
 */
public class DpConfig extends HibernateSearchConfig {
    protected final BackEnd backEnd;

    public DpConfig() {
        this.backEnd = new DpBackEnd();
    }

    @Override
    protected void init() {
        DomainClassInfo.initializeClassInfos(FenixFramework.getDomainModel(), 0);
        super.init();
    }

    @Override
    public BackEnd getBackEnd() {
        return this.backEnd;
    }

    @Override
    public String getBackEndName() {
        return DpBackEnd.BACKEND_NAME;
    }
}
