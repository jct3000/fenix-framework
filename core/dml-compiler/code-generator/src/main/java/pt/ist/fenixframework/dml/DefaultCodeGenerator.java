package pt.ist.fenixframework.dml;


//acrecentado imports inicio

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;




//acrecentado imports fim





public class DefaultCodeGenerator extends CodeGenerator {

    public DefaultCodeGenerator(CompilerArgs compArgs, DomainModel domainModel) {
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



// acrescentado inicio


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






    //
    // @Override
    // protected void generateSlot(Slot slot, PrintWriter out) {
    //     onNewline(out);
    //     printWords(out, "private", slot.getTypeName(), slot.getName());
    //     print(out, ";");
    //     if (slot.getTypeName()=="boolean" &&  slot.getName()== "personal_tag")
    //     System.out.println("\n\n\n\n Classe Privada \n\n\n\n");
    // }
      //
      // @Override
      //   protected void generateSlotGetter(String slotName, String typeName, PrintWriter out) {
      //       generateSlotGetter("public", slotName, typeName, out);
      //       //if (typeName=="boolean" &&  slotName== "personal_tag")
      //       System.out.println("\n\n\n\n Classe Privada \n\n\n\n");
      //   }



}
