package pt.ist.fenixframework.backend.dp;


import pt.ist.fenixframework.dml;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;


import pt.ist.fenixframework.Constants;
import pt.ist.fenixframework.dml.runtime.DomainBasedMap;
import pt.ist.fenixframework.dml.runtime.RelationAwareSet;








import pt.ist.fenixframework.dml.CompilerArgs;
import pt.ist.fenixframework.dml.DomainClass;
import pt.ist.fenixframework.dml.DomainEntity;
import pt.ist.fenixframework.dml.DomainModel;
import pt.ist.fenixframework.dml.ExternalizationElement;
import pt.ist.fenixframework.dml.Role;
import pt.ist.fenixframework.dml.Slot;
import pt.ist.fenixframework.dml.ValueType;
import pt.ist.fenixframework.dml.ValueTypeSerializationGenerator;


/**
 * Top-level class of all DML code generators.   baseado no ogm code e no jvstm-obj
 */
public  class dpCodeGenerator extends CodeGenerator{


    public dpCodeGenerator(CompilerArgs compArgs, DomainModel domainModel) {
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


    //
    // @Override
    // protected String getDefaultConfigClassName() {
    //     return JvstmOJBConfig.class.getName();
    // }
    // @Override
    // protected void generateBaseClassBody(DomainClass domClass, PrintWriter out) {
    //     comment(out, "Static Slots");
    //     super.generateStaticSlots(domClass, out);
    //     newline(out);
    //
    //     if (!isDefaultCodeGenerator()) {
    //         comment(out, "Slots");
    //         super.generateSlots(domClass.getSlots(), out);
    //         newline(out);
    //
    //         comment(out, "Role Slots");
    //         super.generateRoleSlots(domClass.getRoleSlots(), out);
    //         newline(out);
    //
    //         comment(out, "Init Instance");
    //         super.generateInitInstance(domClass, out);
    //         newline(out);
    //     }
    //
    //     comment(out, "Constructors");
    //     printMethod(out, "protected", "", domClass.getBaseName());
    //     startMethodBody(out);
    //     super.generateBaseClassConstructorsBody(domClass, out);
    //     endMethodBody(out);
    //     newline(out);
    //
    //     comment(out, "Getters and Setters");
    //     super.generateSlotsAccessors(domClass, out);
    //     newline(out);
    //
    //     // MUDEI AQUI EXP inicio (n recebe nd devolve 20)
    //     comment(out, "Funcao teste exp");
    //     newline(out);
    //     printWords(out, "public", "int", "Exp()");
    //     startMethodBody(out);
    //     printWords(out, "return", "20" + ";");
    //     endMethodBody(out);
    //     newline(out);
    //
    //
    //     // comment(out, "Funcao imprime");
    //     // newline(out);
    //     // printWords(out, "public", "void", "imprime()");
    //     // startMethodBody(out);
    //     // printWords(out, "if(this.getPersonal_tag()=='true')");
    //     // newline(out);
    //     // printWords(out, "System.out.println(\"Private class\n\")");
    //     // endMethodBody(out);
    //     // newline(out);
    //     //MUDEI AQUI EXP fim
    //
    //
    //
    //
    //     comment(out, "Role Methods");
    //     super.generateRoleSlotsMethods(domClass.getRoleSlots(), out);
    //     newline(out);
    //
    //
    // }




}
