
/* First created by JCasGen Wed Mar 16 10:14:05 CET 2011 */
package org.u_compare.shared.label.penn.bracket.release;

import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.u_compare.shared.label.penn.bracket.Phrase_Type;

/** Unknown, uncertain, or unbracketable
 * Updated by JCasGen Tue Mar 06 16:28:15 CET 2012
 * @generated */
public class X_Type extends Phrase_Type {
  /** @generated */
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (X_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = X_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new X(addr, X_Type.this);
  			   X_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new X(addr, X_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = X.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.u_compare.shared.label.penn.bracket.release.X");



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public X_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    