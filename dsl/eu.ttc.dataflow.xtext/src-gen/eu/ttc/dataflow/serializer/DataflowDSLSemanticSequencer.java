/*
 * generated by Xtext 2.9.2
 */
package eu.ttc.dataflow.serializer;

import com.google.inject.Inject;
import eu.ttc.dataflow.model.dataflow.AddToContainer;
import eu.ttc.dataflow.model.dataflow.AllInstances;
import eu.ttc.dataflow.model.dataflow.BinaryOperation;
import eu.ttc.dataflow.model.dataflow.BooleanLiteral;
import eu.ttc.dataflow.model.dataflow.CollectBy;
import eu.ttc.dataflow.model.dataflow.ConditionalExpression;
import eu.ttc.dataflow.model.dataflow.Copy;
import eu.ttc.dataflow.model.dataflow.DataflowPackage;
import eu.ttc.dataflow.model.dataflow.Evaluate;
import eu.ttc.dataflow.model.dataflow.FeatureCall;
import eu.ttc.dataflow.model.dataflow.FieldReference;
import eu.ttc.dataflow.model.dataflow.Filter;
import eu.ttc.dataflow.model.dataflow.ForEach;
import eu.ttc.dataflow.model.dataflow.GetFeature;
import eu.ttc.dataflow.model.dataflow.IntegerLiteral;
import eu.ttc.dataflow.model.dataflow.Model;
import eu.ttc.dataflow.model.dataflow.NewContainer;
import eu.ttc.dataflow.model.dataflow.NewInstance;
import eu.ttc.dataflow.model.dataflow.Product;
import eu.ttc.dataflow.model.dataflow.RealLiteral;
import eu.ttc.dataflow.model.dataflow.SetFeature;
import eu.ttc.dataflow.model.dataflow.Sort;
import eu.ttc.dataflow.model.dataflow.StringLiteral;
import eu.ttc.dataflow.model.dataflow.UnaryOperation;
import eu.ttc.dataflow.services.DataflowDSLGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class DataflowDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DataflowDSLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == DataflowPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case DataflowPackage.ADD_TO_CONTAINER:
				sequence_AddToContainer(context, (AddToContainer) semanticObject); 
				return; 
			case DataflowPackage.ALL_INSTANCES:
				sequence_AllInstances(context, (AllInstances) semanticObject); 
				return; 
			case DataflowPackage.BINARY_OPERATION:
				sequence_AdditiveExpression_AndExpression_EqualityExpression_MultiplicativeExpression_OrExpression_RelationalExpression(context, (BinaryOperation) semanticObject); 
				return; 
			case DataflowPackage.BOOLEAN_LITERAL:
				sequence_PrimaryExpression(context, (BooleanLiteral) semanticObject); 
				return; 
			case DataflowPackage.COLLECT_BY:
				sequence_CollectBy(context, (CollectBy) semanticObject); 
				return; 
			case DataflowPackage.CONDITIONAL_EXPRESSION:
				sequence_ConditionalExpression(context, (ConditionalExpression) semanticObject); 
				return; 
			case DataflowPackage.COPY:
				sequence_Copy(context, (Copy) semanticObject); 
				return; 
			case DataflowPackage.EVALUATE:
				sequence_Evaluate(context, (Evaluate) semanticObject); 
				return; 
			case DataflowPackage.FEATURE_CALL:
				sequence_FeatureCallExpression(context, (FeatureCall) semanticObject); 
				return; 
			case DataflowPackage.FIELD_REFERENCE:
				sequence_PrimaryExpression(context, (FieldReference) semanticObject); 
				return; 
			case DataflowPackage.FILTER:
				sequence_Filter(context, (Filter) semanticObject); 
				return; 
			case DataflowPackage.FOR_EACH:
				sequence_ForEach(context, (ForEach) semanticObject); 
				return; 
			case DataflowPackage.GET_FEATURE:
				sequence_GetFeature(context, (GetFeature) semanticObject); 
				return; 
			case DataflowPackage.INTEGER_LITERAL:
				sequence_PrimaryExpression(context, (IntegerLiteral) semanticObject); 
				return; 
			case DataflowPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case DataflowPackage.NEW_CONTAINER:
				sequence_NewContainer(context, (NewContainer) semanticObject); 
				return; 
			case DataflowPackage.NEW_INSTANCE:
				sequence_NewInstance(context, (NewInstance) semanticObject); 
				return; 
			case DataflowPackage.PRODUCT:
				sequence_Product(context, (Product) semanticObject); 
				return; 
			case DataflowPackage.REAL_LITERAL:
				sequence_PrimaryExpression(context, (RealLiteral) semanticObject); 
				return; 
			case DataflowPackage.SET_FEATURE:
				sequence_SetFeature(context, (SetFeature) semanticObject); 
				return; 
			case DataflowPackage.SORT:
				sequence_Sort(context, (Sort) semanticObject); 
				return; 
			case DataflowPackage.STRING_LITERAL:
				sequence_PrimaryExpression(context, (StringLiteral) semanticObject); 
				return; 
			case DataflowPackage.UNARY_OPERATION:
				sequence_UnaryExpression(context, (UnaryOperation) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Element returns AddToContainer
	 *     AddToContainer returns AddToContainer
	 *
	 * Constraint:
	 *     (name=ID (listField=ID | value=ConditionalExpression | position=ConditionalExpression | target=[Element|ID])*)
	 */
	protected void sequence_AddToContainer(ISerializationContext context, AddToContainer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ConditionalExpression returns BinaryOperation
	 *     ConditionalExpression.ConditionalExpression_0_2 returns BinaryOperation
	 *     OrExpression returns BinaryOperation
	 *     OrExpression.BinaryOperation_1_0 returns BinaryOperation
	 *     AndExpression returns BinaryOperation
	 *     AndExpression.BinaryOperation_1_0 returns BinaryOperation
	 *     EqualityExpression returns BinaryOperation
	 *     EqualityExpression.BinaryOperation_1_0 returns BinaryOperation
	 *     RelationalExpression returns BinaryOperation
	 *     RelationalExpression.BinaryOperation_1_0 returns BinaryOperation
	 *     AdditiveExpression returns BinaryOperation
	 *     AdditiveExpression.BinaryOperation_1_0 returns BinaryOperation
	 *     MultiplicativeExpression returns BinaryOperation
	 *     MultiplicativeExpression.BinaryOperation_1_0 returns BinaryOperation
	 *     UnaryExpression returns BinaryOperation
	 *     FeatureCallExpression returns BinaryOperation
	 *     FeatureCallExpression.FeatureCall_1_0 returns BinaryOperation
	 *     PrimaryExpression returns BinaryOperation
	 *
	 * Constraint:
	 *     (
	 *         (leftExpression=OrExpression_BinaryOperation_1_0 operator=OrOperator rightExpression=AndExpression) | 
	 *         (leftExpression=AndExpression_BinaryOperation_1_0 operator=AndOperator rightExpression=EqualityExpression) | 
	 *         (leftExpression=EqualityExpression_BinaryOperation_1_0 operator=EqualityOperator rightExpression=RelationalExpression) | 
	 *         (leftExpression=RelationalExpression_BinaryOperation_1_0 operator=RelationalOperator rightExpression=AdditiveExpression) | 
	 *         (leftExpression=AdditiveExpression_BinaryOperation_1_0 operator=AdditiveOperator rightExpression=MultiplicativeExpression) | 
	 *         (leftExpression=MultiplicativeExpression_BinaryOperation_1_0 operator=MultiplicativeOperator rightExpression=UnaryExpression)
	 *     )
	 */
	protected void sequence_AdditiveExpression_AndExpression_EqualityExpression_MultiplicativeExpression_OrExpression_RelationalExpression(ISerializationContext context, BinaryOperation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns AllInstances
	 *     AllInstances returns AllInstances
	 *
	 * Constraint:
	 *     (name=ID ((field=ID | target=[Element|ID])? (model=ID? packageName=ID? typeName=ID)?)+)
	 */
	protected void sequence_AllInstances(ISerializationContext context, AllInstances semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns CollectBy
	 *     CollectBy returns CollectBy
	 *
	 * Constraint:
	 *     (name=ID (collectBy=ConditionalExpression | target=[Element|ID])*)
	 */
	protected void sequence_CollectBy(ISerializationContext context, CollectBy semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ConditionalExpression returns ConditionalExpression
	 *
	 * Constraint:
	 *     (conditionExpression=ConditionalExpression_ConditionalExpression_0_2 thenExpression=OrExpression elseExpression=OrExpression)
	 */
	protected void sequence_ConditionalExpression(ISerializationContext context, ConditionalExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DataflowPackage.Literals.CONDITIONAL_EXPRESSION__CONDITION_EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DataflowPackage.Literals.CONDITIONAL_EXPRESSION__CONDITION_EXPRESSION));
			if (transientValues.isValueTransient(semanticObject, DataflowPackage.Literals.CONDITIONAL_EXPRESSION__THEN_EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DataflowPackage.Literals.CONDITIONAL_EXPRESSION__THEN_EXPRESSION));
			if (transientValues.isValueTransient(semanticObject, DataflowPackage.Literals.CONDITIONAL_EXPRESSION__ELSE_EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DataflowPackage.Literals.CONDITIONAL_EXPRESSION__ELSE_EXPRESSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConditionalExpressionAccess().getConditionalExpressionConditionExpressionAction_0_2(), semanticObject.getConditionExpression());
		feeder.accept(grammarAccess.getConditionalExpressionAccess().getThenExpressionOrExpressionParserRuleCall_0_4_0(), semanticObject.getThenExpression());
		feeder.accept(grammarAccess.getConditionalExpressionAccess().getElseExpressionOrExpressionParserRuleCall_0_6_0(), semanticObject.getElseExpression());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Element returns Copy
	 *     Copy returns Copy
	 *
	 * Constraint:
	 *     (name=ID (target=[Element|ID] | copyTarget=[Element|ID])*)
	 */
	protected void sequence_Copy(ISerializationContext context, Copy semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns Evaluate
	 *     Evaluate returns Evaluate
	 *
	 * Constraint:
	 *     (name=ID (field=ID | expression=ConditionalExpression | target=[Element|ID])*)
	 */
	protected void sequence_Evaluate(ISerializationContext context, Evaluate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ConditionalExpression returns FeatureCall
	 *     ConditionalExpression.ConditionalExpression_0_2 returns FeatureCall
	 *     OrExpression returns FeatureCall
	 *     OrExpression.BinaryOperation_1_0 returns FeatureCall
	 *     AndExpression returns FeatureCall
	 *     AndExpression.BinaryOperation_1_0 returns FeatureCall
	 *     EqualityExpression returns FeatureCall
	 *     EqualityExpression.BinaryOperation_1_0 returns FeatureCall
	 *     RelationalExpression returns FeatureCall
	 *     RelationalExpression.BinaryOperation_1_0 returns FeatureCall
	 *     AdditiveExpression returns FeatureCall
	 *     AdditiveExpression.BinaryOperation_1_0 returns FeatureCall
	 *     MultiplicativeExpression returns FeatureCall
	 *     MultiplicativeExpression.BinaryOperation_1_0 returns FeatureCall
	 *     UnaryExpression returns FeatureCall
	 *     FeatureCallExpression returns FeatureCall
	 *     FeatureCallExpression.FeatureCall_1_0 returns FeatureCall
	 *     PrimaryExpression returns FeatureCall
	 *
	 * Constraint:
	 *     (targetExpression=FeatureCallExpression_FeatureCall_1_0 feature=ID (parameters+=OrExpression parameters+=OrExpression*)?)
	 */
	protected void sequence_FeatureCallExpression(ISerializationContext context, FeatureCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns Filter
	 *     Filter returns Filter
	 *
	 * Constraint:
	 *     (name=ID (filterBy=ConditionalExpression | target=[Element|ID] | rejectTarget=[Element|ID])*)
	 */
	protected void sequence_Filter(ISerializationContext context, Filter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns ForEach
	 *     ForEach returns ForEach
	 *
	 * Constraint:
	 *     (name=ID (listField=ID | itemField=ID | positionField=ID | target=[Element|ID])*)
	 */
	protected void sequence_ForEach(ISerializationContext context, ForEach semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns GetFeature
	 *     GetFeature returns GetFeature
	 *
	 * Constraint:
	 *     (name=ID (objectField=ID | valueField=ID | feature=ID | target=[Element|ID])*)
	 */
	protected void sequence_GetFeature(ISerializationContext context, GetFeature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     elements+=Element*
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns NewContainer
	 *     NewContainer returns NewContainer
	 *
	 * Constraint:
	 *     (name=ID listField=ID? containerType=ContainerType? target=[Element|ID]?)
	 */
	protected void sequence_NewContainer(ISerializationContext context, NewContainer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns NewInstance
	 *     NewInstance returns NewInstance
	 *
	 * Constraint:
	 *     (name=ID ((instanceField=ID | key=ConditionalExpression | target=[Element|ID])? (model=ID? packageName=ID? typeName=ID)?)+)
	 */
	protected void sequence_NewInstance(ISerializationContext context, NewInstance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ConditionalExpression returns BooleanLiteral
	 *     ConditionalExpression.ConditionalExpression_0_2 returns BooleanLiteral
	 *     OrExpression returns BooleanLiteral
	 *     OrExpression.BinaryOperation_1_0 returns BooleanLiteral
	 *     AndExpression returns BooleanLiteral
	 *     AndExpression.BinaryOperation_1_0 returns BooleanLiteral
	 *     EqualityExpression returns BooleanLiteral
	 *     EqualityExpression.BinaryOperation_1_0 returns BooleanLiteral
	 *     RelationalExpression returns BooleanLiteral
	 *     RelationalExpression.BinaryOperation_1_0 returns BooleanLiteral
	 *     AdditiveExpression returns BooleanLiteral
	 *     AdditiveExpression.BinaryOperation_1_0 returns BooleanLiteral
	 *     MultiplicativeExpression returns BooleanLiteral
	 *     MultiplicativeExpression.BinaryOperation_1_0 returns BooleanLiteral
	 *     UnaryExpression returns BooleanLiteral
	 *     FeatureCallExpression returns BooleanLiteral
	 *     FeatureCallExpression.FeatureCall_1_0 returns BooleanLiteral
	 *     PrimaryExpression returns BooleanLiteral
	 *
	 * Constraint:
	 *     value=EBoolean
	 */
	protected void sequence_PrimaryExpression(ISerializationContext context, BooleanLiteral semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DataflowPackage.Literals.BOOLEAN_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DataflowPackage.Literals.BOOLEAN_LITERAL__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPrimaryExpressionAccess().getValueEBooleanParserRuleCall_1_1_0(), semanticObject.isValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ConditionalExpression returns FieldReference
	 *     ConditionalExpression.ConditionalExpression_0_2 returns FieldReference
	 *     OrExpression returns FieldReference
	 *     OrExpression.BinaryOperation_1_0 returns FieldReference
	 *     AndExpression returns FieldReference
	 *     AndExpression.BinaryOperation_1_0 returns FieldReference
	 *     EqualityExpression returns FieldReference
	 *     EqualityExpression.BinaryOperation_1_0 returns FieldReference
	 *     RelationalExpression returns FieldReference
	 *     RelationalExpression.BinaryOperation_1_0 returns FieldReference
	 *     AdditiveExpression returns FieldReference
	 *     AdditiveExpression.BinaryOperation_1_0 returns FieldReference
	 *     MultiplicativeExpression returns FieldReference
	 *     MultiplicativeExpression.BinaryOperation_1_0 returns FieldReference
	 *     UnaryExpression returns FieldReference
	 *     FeatureCallExpression returns FieldReference
	 *     FeatureCallExpression.FeatureCall_1_0 returns FieldReference
	 *     PrimaryExpression returns FieldReference
	 *
	 * Constraint:
	 *     field=ID
	 */
	protected void sequence_PrimaryExpression(ISerializationContext context, FieldReference semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DataflowPackage.Literals.FIELD_REFERENCE__FIELD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DataflowPackage.Literals.FIELD_REFERENCE__FIELD));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPrimaryExpressionAccess().getFieldIDTerminalRuleCall_4_1_0(), semanticObject.getField());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ConditionalExpression returns IntegerLiteral
	 *     ConditionalExpression.ConditionalExpression_0_2 returns IntegerLiteral
	 *     OrExpression returns IntegerLiteral
	 *     OrExpression.BinaryOperation_1_0 returns IntegerLiteral
	 *     AndExpression returns IntegerLiteral
	 *     AndExpression.BinaryOperation_1_0 returns IntegerLiteral
	 *     EqualityExpression returns IntegerLiteral
	 *     EqualityExpression.BinaryOperation_1_0 returns IntegerLiteral
	 *     RelationalExpression returns IntegerLiteral
	 *     RelationalExpression.BinaryOperation_1_0 returns IntegerLiteral
	 *     AdditiveExpression returns IntegerLiteral
	 *     AdditiveExpression.BinaryOperation_1_0 returns IntegerLiteral
	 *     MultiplicativeExpression returns IntegerLiteral
	 *     MultiplicativeExpression.BinaryOperation_1_0 returns IntegerLiteral
	 *     UnaryExpression returns IntegerLiteral
	 *     FeatureCallExpression returns IntegerLiteral
	 *     FeatureCallExpression.FeatureCall_1_0 returns IntegerLiteral
	 *     PrimaryExpression returns IntegerLiteral
	 *
	 * Constraint:
	 *     value=EInt
	 */
	protected void sequence_PrimaryExpression(ISerializationContext context, IntegerLiteral semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DataflowPackage.Literals.INTEGER_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DataflowPackage.Literals.INTEGER_LITERAL__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPrimaryExpressionAccess().getValueEIntParserRuleCall_0_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ConditionalExpression returns RealLiteral
	 *     ConditionalExpression.ConditionalExpression_0_2 returns RealLiteral
	 *     OrExpression returns RealLiteral
	 *     OrExpression.BinaryOperation_1_0 returns RealLiteral
	 *     AndExpression returns RealLiteral
	 *     AndExpression.BinaryOperation_1_0 returns RealLiteral
	 *     EqualityExpression returns RealLiteral
	 *     EqualityExpression.BinaryOperation_1_0 returns RealLiteral
	 *     RelationalExpression returns RealLiteral
	 *     RelationalExpression.BinaryOperation_1_0 returns RealLiteral
	 *     AdditiveExpression returns RealLiteral
	 *     AdditiveExpression.BinaryOperation_1_0 returns RealLiteral
	 *     MultiplicativeExpression returns RealLiteral
	 *     MultiplicativeExpression.BinaryOperation_1_0 returns RealLiteral
	 *     UnaryExpression returns RealLiteral
	 *     FeatureCallExpression returns RealLiteral
	 *     FeatureCallExpression.FeatureCall_1_0 returns RealLiteral
	 *     PrimaryExpression returns RealLiteral
	 *
	 * Constraint:
	 *     value=EDouble
	 */
	protected void sequence_PrimaryExpression(ISerializationContext context, RealLiteral semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DataflowPackage.Literals.REAL_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DataflowPackage.Literals.REAL_LITERAL__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPrimaryExpressionAccess().getValueEDoubleParserRuleCall_2_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ConditionalExpression returns StringLiteral
	 *     ConditionalExpression.ConditionalExpression_0_2 returns StringLiteral
	 *     OrExpression returns StringLiteral
	 *     OrExpression.BinaryOperation_1_0 returns StringLiteral
	 *     AndExpression returns StringLiteral
	 *     AndExpression.BinaryOperation_1_0 returns StringLiteral
	 *     EqualityExpression returns StringLiteral
	 *     EqualityExpression.BinaryOperation_1_0 returns StringLiteral
	 *     RelationalExpression returns StringLiteral
	 *     RelationalExpression.BinaryOperation_1_0 returns StringLiteral
	 *     AdditiveExpression returns StringLiteral
	 *     AdditiveExpression.BinaryOperation_1_0 returns StringLiteral
	 *     MultiplicativeExpression returns StringLiteral
	 *     MultiplicativeExpression.BinaryOperation_1_0 returns StringLiteral
	 *     UnaryExpression returns StringLiteral
	 *     FeatureCallExpression returns StringLiteral
	 *     FeatureCallExpression.FeatureCall_1_0 returns StringLiteral
	 *     PrimaryExpression returns StringLiteral
	 *
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_PrimaryExpression(ISerializationContext context, StringLiteral semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DataflowPackage.Literals.STRING_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DataflowPackage.Literals.STRING_LITERAL__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPrimaryExpressionAccess().getValueSTRINGTerminalRuleCall_3_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Element returns Product
	 *     Product returns Product
	 *
	 * Constraint:
	 *     (name=ID target=[Element|ID]?)
	 */
	protected void sequence_Product(ISerializationContext context, Product semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns SetFeature
	 *     SetFeature returns SetFeature
	 *
	 * Constraint:
	 *     (name=ID (objectField=ID | value=ConditionalExpression | feature=ID | target=[Element|ID])*)
	 */
	protected void sequence_SetFeature(ISerializationContext context, SetFeature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns Sort
	 *     Sort returns Sort
	 *
	 * Constraint:
	 *     (name=ID (sortBy=ConditionalExpression | target=[Element|ID])*)
	 */
	protected void sequence_Sort(ISerializationContext context, Sort semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ConditionalExpression returns UnaryOperation
	 *     ConditionalExpression.ConditionalExpression_0_2 returns UnaryOperation
	 *     OrExpression returns UnaryOperation
	 *     OrExpression.BinaryOperation_1_0 returns UnaryOperation
	 *     AndExpression returns UnaryOperation
	 *     AndExpression.BinaryOperation_1_0 returns UnaryOperation
	 *     EqualityExpression returns UnaryOperation
	 *     EqualityExpression.BinaryOperation_1_0 returns UnaryOperation
	 *     RelationalExpression returns UnaryOperation
	 *     RelationalExpression.BinaryOperation_1_0 returns UnaryOperation
	 *     AdditiveExpression returns UnaryOperation
	 *     AdditiveExpression.BinaryOperation_1_0 returns UnaryOperation
	 *     MultiplicativeExpression returns UnaryOperation
	 *     MultiplicativeExpression.BinaryOperation_1_0 returns UnaryOperation
	 *     UnaryExpression returns UnaryOperation
	 *     FeatureCallExpression returns UnaryOperation
	 *     FeatureCallExpression.FeatureCall_1_0 returns UnaryOperation
	 *     PrimaryExpression returns UnaryOperation
	 *
	 * Constraint:
	 *     (operator=UnaryOperator expression=UnaryExpression)
	 */
	protected void sequence_UnaryExpression(ISerializationContext context, UnaryOperation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DataflowPackage.Literals.UNARY_OPERATION__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DataflowPackage.Literals.UNARY_OPERATION__OPERATOR));
			if (transientValues.isValueTransient(semanticObject, DataflowPackage.Literals.UNARY_OPERATION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DataflowPackage.Literals.UNARY_OPERATION__EXPRESSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getUnaryExpressionAccess().getOperatorUnaryOperatorEnumRuleCall_0_1_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getUnaryExpressionAccess().getExpressionUnaryExpressionParserRuleCall_0_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
}
