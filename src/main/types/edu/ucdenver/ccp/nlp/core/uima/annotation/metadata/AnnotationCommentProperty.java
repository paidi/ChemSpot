

/* First created by JCasGen Tue Oct 02 12:01:59 CEST 2012 */
package edu.ucdenver.ccp.nlp.core.uima.annotation.metadata;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Tue Oct 02 12:01:59 CEST 2012
 * XML source: D:/ChemSpot/git/ChemSpot/desc/cr/CraftCR.xml
 * @generated */
public class AnnotationCommentProperty extends AnnotationMetadataProperty {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AnnotationCommentProperty.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected AnnotationCommentProperty() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public AnnotationCommentProperty(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public AnnotationCommentProperty(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: comment

  /** getter for comment - gets 
   * @generated */
  public String getComment() {
    if (AnnotationCommentProperty_Type.featOkTst && ((AnnotationCommentProperty_Type)jcasType).casFeat_comment == null)
      jcasType.jcas.throwFeatMissing("comment", "edu.ucdenver.ccp.nlp.core.uima.annotation.metadata.AnnotationCommentProperty");
    return jcasType.ll_cas.ll_getStringValue(addr, ((AnnotationCommentProperty_Type)jcasType).casFeatCode_comment);}
    
  /** setter for comment - sets  
   * @generated */
  public void setComment(String v) {
    if (AnnotationCommentProperty_Type.featOkTst && ((AnnotationCommentProperty_Type)jcasType).casFeat_comment == null)
      jcasType.jcas.throwFeatMissing("comment", "edu.ucdenver.ccp.nlp.core.uima.annotation.metadata.AnnotationCommentProperty");
    jcasType.ll_cas.ll_setStringValue(addr, ((AnnotationCommentProperty_Type)jcasType).casFeatCode_comment, v);}    
  }

    