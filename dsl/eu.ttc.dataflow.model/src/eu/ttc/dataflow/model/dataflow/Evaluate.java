/**
 */
package eu.ttc.dataflow.model.dataflow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evaluate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.ttc.dataflow.model.dataflow.Evaluate#getField <em>Field</em>}</li>
 *   <li>{@link eu.ttc.dataflow.model.dataflow.Evaluate#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see eu.ttc.dataflow.model.dataflow.DataflowPackage#getEvaluate()
 * @model
 * @generated
 */
public interface Evaluate extends Element {
	/**
	 * Returns the value of the '<em><b>Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' attribute.
	 * @see #setField(String)
	 * @see eu.ttc.dataflow.model.dataflow.DataflowPackage#getEvaluate_Field()
	 * @model required="true"
	 * @generated
	 */
	String getField();

	/**
	 * Sets the value of the '{@link eu.ttc.dataflow.model.dataflow.Evaluate#getField <em>Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' attribute.
	 * @see #getField()
	 * @generated
	 */
	void setField(String value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see eu.ttc.dataflow.model.dataflow.DataflowPackage#getEvaluate_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link eu.ttc.dataflow.model.dataflow.Evaluate#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

} // Evaluate
