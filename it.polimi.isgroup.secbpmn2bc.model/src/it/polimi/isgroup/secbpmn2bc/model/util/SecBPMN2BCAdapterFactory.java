/**
 */
package it.polimi.isgroup.secbpmn2bc.model.util;

import it.polimi.isgroup.secbpmn2bc.model.DataInput;
import it.polimi.isgroup.secbpmn2bc.model.DataItems;
import it.polimi.isgroup.secbpmn2bc.model.DataObject;
import it.polimi.isgroup.secbpmn2bc.model.DataOutput;
import it.polimi.isgroup.secbpmn2bc.model.DataStore;
import it.polimi.isgroup.secbpmn2bc.model.Definitions;
import it.polimi.isgroup.secbpmn2bc.model.Enforceability;
import it.polimi.isgroup.secbpmn2bc.model.Message;
import it.polimi.isgroup.secbpmn2bc.model.MessageRef;
import it.polimi.isgroup.secbpmn2bc.model.PrivitySphere;
import it.polimi.isgroup.secbpmn2bc.model.SubProcess;
import it.polimi.isgroup.secbpmn2bc.model.Task;
import it.polimi.isgroup.secbpmn2bc.model.meta.SecBPMN2BCPackage;

import it.unitn.disi.sweng.gmt.model.GMTElement;
import it.unitn.disi.sweng.gmt.model.GMTNamedNode;
import it.unitn.disi.sweng.gmt.model.GMTNode;

import it.unitn.disi.sweng.secbpmn.model.Activity;
import it.unitn.disi.sweng.secbpmn.model.FlowNode;
import it.unitn.disi.sweng.secbpmn.model.SecBpmnElement;
import it.unitn.disi.sweng.secbpmn.model.SecurityAnnotation;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see it.polimi.isgroup.secbpmn2bc.model.meta.SecBPMN2BCPackage
 * @generated
 */
public class SecBPMN2BCAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SecBPMN2BCPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecBPMN2BCAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SecBPMN2BCPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecBPMN2BCSwitch<Adapter> modelSwitch = new SecBPMN2BCSwitch<Adapter>() {
		@Override
		public Adapter casePrivitySphere(PrivitySphere object) {
			return createPrivitySphereAdapter();
		}

		@Override
		public Adapter caseEnforceability(Enforceability object) {
			return createEnforceabilityAdapter();
		}

		@Override
		public Adapter caseProcess(it.polimi.isgroup.secbpmn2bc.model.Process object) {
			return createProcessAdapter();
		}

		@Override
		public Adapter caseDataItems(DataItems object) {
			return createDataItemsAdapter();
		}

		@Override
		public Adapter caseTask(Task object) {
			return createTaskAdapter();
		}

		@Override
		public Adapter caseDefinitions(Definitions object) {
			return createDefinitionsAdapter();
		}

		@Override
		public Adapter caseDataStore(DataStore object) {
			return createDataStoreAdapter();
		}

		@Override
		public Adapter caseDataObject(DataObject object) {
			return createDataObjectAdapter();
		}

		@Override
		public Adapter caseDataInput(DataInput object) {
			return createDataInputAdapter();
		}

		@Override
		public Adapter caseDataOutput(DataOutput object) {
			return createDataOutputAdapter();
		}

		@Override
		public Adapter caseMessage(Message object) {
			return createMessageAdapter();
		}

		@Override
		public Adapter caseMessageRef(MessageRef object) {
			return createMessageRefAdapter();
		}

		@Override
		public Adapter caseSubProcess(SubProcess object) {
			return createSubProcessAdapter();
		}

		@Override
		public Adapter caseGMTElement(GMTElement object) {
			return createGMTElementAdapter();
		}

		@Override
		public Adapter caseGMTNode(GMTNode object) {
			return createGMTNodeAdapter();
		}

		@Override
		public Adapter caseSecBpmnElement(SecBpmnElement object) {
			return createSecBpmnElementAdapter();
		}

		@Override
		public Adapter caseSecurityAnnotation(SecurityAnnotation object) {
			return createSecurityAnnotationAdapter();
		}

		@Override
		public Adapter caseGMTNamedNode(GMTNamedNode object) {
			return createGMTNamedNodeAdapter();
		}

		@Override
		public Adapter caseSecBPMN_Process(it.unitn.disi.sweng.secbpmn.model.Process object) {
			return createSecBPMN_ProcessAdapter();
		}

		@Override
		public Adapter caseSecBPMN_DataItems(it.unitn.disi.sweng.secbpmn.model.DataItems object) {
			return createSecBPMN_DataItemsAdapter();
		}

		@Override
		public Adapter caseFlowNode(FlowNode object) {
			return createFlowNodeAdapter();
		}

		@Override
		public Adapter caseActivity(Activity object) {
			return createActivityAdapter();
		}

		@Override
		public Adapter caseSecBPMN_Task(it.unitn.disi.sweng.secbpmn.model.Task object) {
			return createSecBPMN_TaskAdapter();
		}

		@Override
		public Adapter caseSecBPMN_DataStore(it.unitn.disi.sweng.secbpmn.model.DataStore object) {
			return createSecBPMN_DataStoreAdapter();
		}

		@Override
		public Adapter caseSecBPMN_DataObject(it.unitn.disi.sweng.secbpmn.model.DataObject object) {
			return createSecBPMN_DataObjectAdapter();
		}

		@Override
		public Adapter caseSecBPMN_DataInput(it.unitn.disi.sweng.secbpmn.model.DataInput object) {
			return createSecBPMN_DataInputAdapter();
		}

		@Override
		public Adapter caseSecBPMN_DataOutput(it.unitn.disi.sweng.secbpmn.model.DataOutput object) {
			return createSecBPMN_DataOutputAdapter();
		}

		@Override
		public Adapter caseSecBPMN_Message(it.unitn.disi.sweng.secbpmn.model.Message object) {
			return createSecBPMN_MessageAdapter();
		}

		@Override
		public Adapter caseSecBPMN_MessageRef(it.unitn.disi.sweng.secbpmn.model.MessageRef object) {
			return createSecBPMN_MessageRefAdapter();
		}

		@Override
		public Adapter caseSecBPMN_SubProcess(it.unitn.disi.sweng.secbpmn.model.SubProcess object) {
			return createSecBPMN_SubProcessAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.polimi.isgroup.secbpmn2bc.model.PrivitySphere <em>Privity Sphere</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.polimi.isgroup.secbpmn2bc.model.PrivitySphere
	 * @generated
	 */
	public Adapter createPrivitySphereAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.polimi.isgroup.secbpmn2bc.model.Enforceability <em>Enforceability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.polimi.isgroup.secbpmn2bc.model.Enforceability
	 * @generated
	 */
	public Adapter createEnforceabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.polimi.isgroup.secbpmn2bc.model.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.polimi.isgroup.secbpmn2bc.model.Process
	 * @generated
	 */
	public Adapter createProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.polimi.isgroup.secbpmn2bc.model.DataItems <em>Data Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.polimi.isgroup.secbpmn2bc.model.DataItems
	 * @generated
	 */
	public Adapter createDataItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.polimi.isgroup.secbpmn2bc.model.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.polimi.isgroup.secbpmn2bc.model.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.polimi.isgroup.secbpmn2bc.model.Definitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.polimi.isgroup.secbpmn2bc.model.Definitions
	 * @generated
	 */
	public Adapter createDefinitionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.polimi.isgroup.secbpmn2bc.model.DataStore <em>Data Store</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.polimi.isgroup.secbpmn2bc.model.DataStore
	 * @generated
	 */
	public Adapter createDataStoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.polimi.isgroup.secbpmn2bc.model.DataObject <em>Data Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.polimi.isgroup.secbpmn2bc.model.DataObject
	 * @generated
	 */
	public Adapter createDataObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.polimi.isgroup.secbpmn2bc.model.DataInput <em>Data Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.polimi.isgroup.secbpmn2bc.model.DataInput
	 * @generated
	 */
	public Adapter createDataInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.polimi.isgroup.secbpmn2bc.model.DataOutput <em>Data Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.polimi.isgroup.secbpmn2bc.model.DataOutput
	 * @generated
	 */
	public Adapter createDataOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.polimi.isgroup.secbpmn2bc.model.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.polimi.isgroup.secbpmn2bc.model.Message
	 * @generated
	 */
	public Adapter createMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.polimi.isgroup.secbpmn2bc.model.MessageRef <em>Message Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.polimi.isgroup.secbpmn2bc.model.MessageRef
	 * @generated
	 */
	public Adapter createMessageRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.polimi.isgroup.secbpmn2bc.model.SubProcess <em>Sub Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.polimi.isgroup.secbpmn2bc.model.SubProcess
	 * @generated
	 */
	public Adapter createSubProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.sweng.gmt.model.GMTElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unitn.disi.sweng.gmt.model.GMTElement
	 * @generated
	 */
	public Adapter createGMTElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.sweng.gmt.model.GMTNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unitn.disi.sweng.gmt.model.GMTNode
	 * @generated
	 */
	public Adapter createGMTNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.sweng.secbpmn.model.SecBpmnElement <em>Sec Bpmn Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unitn.disi.sweng.secbpmn.model.SecBpmnElement
	 * @generated
	 */
	public Adapter createSecBpmnElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.sweng.secbpmn.model.SecurityAnnotation <em>Security Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unitn.disi.sweng.secbpmn.model.SecurityAnnotation
	 * @generated
	 */
	public Adapter createSecurityAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.sweng.gmt.model.GMTNamedNode <em>Named Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unitn.disi.sweng.gmt.model.GMTNamedNode
	 * @generated
	 */
	public Adapter createGMTNamedNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.sweng.secbpmn.model.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unitn.disi.sweng.secbpmn.model.Process
	 * @generated
	 */
	public Adapter createSecBPMN_ProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.sweng.secbpmn.model.DataItems <em>Data Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unitn.disi.sweng.secbpmn.model.DataItems
	 * @generated
	 */
	public Adapter createSecBPMN_DataItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.sweng.secbpmn.model.FlowNode <em>Flow Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unitn.disi.sweng.secbpmn.model.FlowNode
	 * @generated
	 */
	public Adapter createFlowNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.sweng.secbpmn.model.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unitn.disi.sweng.secbpmn.model.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.sweng.secbpmn.model.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unitn.disi.sweng.secbpmn.model.Task
	 * @generated
	 */
	public Adapter createSecBPMN_TaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.sweng.secbpmn.model.DataStore <em>Data Store</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unitn.disi.sweng.secbpmn.model.DataStore
	 * @generated
	 */
	public Adapter createSecBPMN_DataStoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.sweng.secbpmn.model.DataObject <em>Data Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unitn.disi.sweng.secbpmn.model.DataObject
	 * @generated
	 */
	public Adapter createSecBPMN_DataObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.sweng.secbpmn.model.DataInput <em>Data Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unitn.disi.sweng.secbpmn.model.DataInput
	 * @generated
	 */
	public Adapter createSecBPMN_DataInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.sweng.secbpmn.model.DataOutput <em>Data Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unitn.disi.sweng.secbpmn.model.DataOutput
	 * @generated
	 */
	public Adapter createSecBPMN_DataOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.sweng.secbpmn.model.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unitn.disi.sweng.secbpmn.model.Message
	 * @generated
	 */
	public Adapter createSecBPMN_MessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.sweng.secbpmn.model.MessageRef <em>Message Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unitn.disi.sweng.secbpmn.model.MessageRef
	 * @generated
	 */
	public Adapter createSecBPMN_MessageRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.unitn.disi.sweng.secbpmn.model.SubProcess <em>Sub Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.unitn.disi.sweng.secbpmn.model.SubProcess
	 * @generated
	 */
	public Adapter createSecBPMN_SubProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SecBPMN2BCAdapterFactory
