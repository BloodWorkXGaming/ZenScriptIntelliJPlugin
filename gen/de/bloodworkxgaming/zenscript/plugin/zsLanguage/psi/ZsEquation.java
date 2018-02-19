// This is a generated file. Not intended for manual editing.
package de.bloodworkxgaming.zenscript.plugin.zsLanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ZsEquation extends PsiElement {

  @NotNull
  List<ZsArrayRead> getArrayReadList();

  @NotNull
  List<ZsBracketHandler> getBracketHandlerList();

  @NotNull
  List<ZsFunctionCall> getFunctionCallList();

  @NotNull
  List<ZsNumber> getNumberList();

  @NotNull
  List<ZsVariable> getVariableList();

}