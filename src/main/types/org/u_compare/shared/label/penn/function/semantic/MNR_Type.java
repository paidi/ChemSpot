
/* First created by JCasGen Wed Mar 16 10:14:06 CET 2011 */
package org.u_compare.shared.label.penn.function.semantic;

import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;

/** manner<BR></BR>
 * Updated by JCasGen Tue Mar 06 16:28:16 CET 2012
 * @generated */
public class MNR_Type extends SemanticFunctionLabel_Type {
  /** @generated */
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (MNR_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = MNR_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new MNR(addr, MNR_Type.this);
  			   MNR_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new MNR(addr, MNR_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = MNR.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.u_compare.shared.label.penn.function.semantic.MNR");



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public MNR_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    