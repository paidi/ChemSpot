
/* First created by JCasGen Wed Mar 16 10:14:06 CET 2011 */
package org.u_compare.shared.label.penn.pos.release;

import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.u_compare.shared.label.penn.pos.PennPOS_Type;

/** List Item Marker
 * Updated by JCasGen Tue Mar 06 16:28:17 CET 2012
 * @generated */
public class LS_Type extends PennPOS_Type {
  /** @generated */
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (LS_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = LS_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new LS(addr, LS_Type.this);
  			   LS_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new LS(addr, LS_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = LS.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.u_compare.shared.label.penn.pos.release.LS");



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public LS_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    