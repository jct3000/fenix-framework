package pt.ist.fenixframework.backend.dp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;


import pt.ist.fenixframework.Constants;
import pt.ist.fenixframework.dml.runtime.DomainBasedMap;
import pt.ist.fenixframework.dml.runtime.RelationAwareSet;

import pt.ist.fenixframework.dml.CodeGenerator;
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
public abstract class dpCodeGenerator extends CodeGenerator {

    public static final String ABSTRACT_BACKEND_ID_CLASS = "BackEndId";
    public static final String COLLECTION_CLASS_NAME_KEY = "collectionClassName";
    public static final String DEFAULT_DOMAIN_BASED_MAP = "pt.ist.fenixframework.dml.runtime.StubDomainBasedMap";

    protected static class PrimitiveToWrapperEntry {
        public final String primitiveType;
        public final String wrapperType;
        public final String defaultPrimitiveValue;

        PrimitiveToWrapperEntry(String primitiveType, String wrapperType, String defaultPrimitiveValue) {
            this.primitiveType = primitiveType;
            this.wrapperType = wrapperType;
            this.defaultPrimitiveValue = defaultPrimitiveValue;
        }
    }

    protected static PrimitiveToWrapperEntry[] primitiveToWrapperTypes = {
            new PrimitiveToWrapperEntry("boolean", "Boolean", "false"), new PrimitiveToWrapperEntry("byte", "Byte", "(byte)0"),
            new PrimitiveToWrapperEntry("char", "Character", "'\\u0000'"),
            new PrimitiveToWrapperEntry("short", "Short", "(short)0"), new PrimitiveToWrapperEntry("int", "Integer", "0"),
            new PrimitiveToWrapperEntry("float", "Float", "0.0f"), new PrimitiveToWrapperEntry("long", "Long", "0L"),
            new PrimitiveToWrapperEntry("double", "Double", "0.0d") };

    // private final CompilerArgs compArgs;
    // private final DomainModel domainModel;
    // private final File destDirectory;
    // private final File destDirectoryBase;
    // private String collectionToUse;

      public dpCodeGenerator(CompilerArgs compArgs, DomainModel domainModel) {
        super(compArgs, domainModel);
        //jsonElementVt = domainModel.findValueType("JsonElement");
    }



      // this.compArgs = compArgs;
      // this.domainModel = domainModel;
      //     this.destDirectory = getPackageDirectory(compArgs.destDirectory, compArgs.packageName);
      //     this.destDirectoryBase =
      //             getPackageDirectory((compArgs.destDirectoryBase == null) ? compArgs.destDirectory : compArgs.destDirectoryBase,
      //                     compArgs.packageName);
      //     String collectionName = compArgs.getParams().get(COLLECTION_CLASS_NAME_KEY);
      //     if (collectionName == null || collectionName.isEmpty()) {
      //         this.collectionToUse = DEFAULT_DOMAIN_BASED_MAP;
      //     } else {
      //         this.collectionToUse = compArgs.getParams().get(COLLECTION_CLASS_NAME_KEY);
      //     }
      // }

//}

}
