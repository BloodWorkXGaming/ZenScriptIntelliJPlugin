// This is a generated file. Not intended for manual editing.
package de.bloodworkxgaming.zenscript.plugin.zsLanguage.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static de.bloodworkxgaming.zenscript.plugin.zsLanguage.psi.ZsTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import de.bloodworkxgaming.zenscript.plugin.zsLanguage.psi.*;

public class ZsCastExpressionImpl extends ASTWrapperPsiElement implements ZsCastExpression {

  public ZsCastExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ZsVisitor visitor) {
    visitor.visitCastExpression(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ZsVisitor) accept((ZsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ZsArrayDeclaration getArrayDeclaration() {
    return findChildByClass(ZsArrayDeclaration.class);
  }

  @Override
  @NotNull
  public ZsClassName getClassName() {
    return findNotNullChildByClass(ZsClassName.class);
  }

  @Override
  @Nullable
  public ZsFieldReference getFieldReference() {
    return findChildByClass(ZsFieldReference.class);
  }

  @Override
  @Nullable
  public ZsFunctionCall getFunctionCall() {
    return findChildByClass(ZsFunctionCall.class);
  }

  @Override
  @Nullable
  public ZsNumber getNumber() {
    return findChildByClass(ZsNumber.class);
  }

  @Override
  @Nullable
  public ZsValidCallable getValidCallable() {
    return findChildByClass(ZsValidCallable.class);
  }

}
