// This is a generated file. Not intended for manual editing.
package de.bloodworkxgaming.zenscript.plugin.zsLanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ZsFunctionBody extends PsiElement {

  @Nullable
  ZsReturnStatement getReturnStatement();

  @NotNull
  List<ZsStatement> getStatementList();

}
