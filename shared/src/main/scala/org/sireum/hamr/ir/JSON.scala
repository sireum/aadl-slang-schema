// #Sireum
// @formatter:off

/*
 Copyright (c) 2018, Kansas State University
 All rights reserved.

 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions are met:

 1. Redistributions of source code must retain the above copyright notice, this
    list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright notice,
    this list of conditions and the following disclaimer in the documentation
    and/or other materials provided with the distribution.

 THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

// This file is auto-generated from AadlAST.scala, BlessAST.scala, Emv2AST.scala, SmfAST.scala

package org.sireum.hamr.ir

import org.sireum._
import org.sireum.Json.Printer._

object JSON {

  object Printer {

    @pure def printAadlInstInfo(o: AadlInstInfo): ST = {
      o match {
        case o: Component => return printComponent(o)
        case o: ErrorTypeDef => return printErrorTypeDef(o)
        case o: FeatureEnd => return printFeatureEnd(o)
        case o: FeatureGroup => return printFeatureGroup(o)
        case o: FeatureAccess => return printFeatureAccess(o)
        case o: Connection => return printConnection(o)
        case o: Emv2Flow => return printEmv2Flow(o)
        case o: Flow => return printFlow(o)
      }
    }

    @pure def printAadl(o: Aadl): ST = {
      return printObject(ISZ(
        ("type", st""""Aadl""""),
        ("components", printISZ(F, o.components, printComponent _)),
        ("annexLib", printISZ(F, o.annexLib, printAnnexLib _)),
        ("dataComponents", printISZ(F, o.dataComponents, printComponent _))
      ))
    }

    @pure def printName(o: Name): ST = {
      return printObject(ISZ(
        ("type", st""""Name""""),
        ("name", printISZ(T, o.name, printString _)),
        ("pos", printOption(F, o.pos, printPosition _))
      ))
    }

    @pure def printComponent(o: Component): ST = {
      return printObject(ISZ(
        ("type", st""""Component""""),
        ("identifier", printName(o.identifier)),
        ("category", printComponentCategoryType(o.category)),
        ("classifier", printOption(F, o.classifier, printClassifier _)),
        ("features", printISZ(F, o.features, printFeature _)),
        ("subComponents", printISZ(F, o.subComponents, printComponent _)),
        ("connections", printISZ(F, o.connections, printConnection _)),
        ("connectionInstances", printISZ(F, o.connectionInstances, printConnectionInstance _)),
        ("properties", printISZ(F, o.properties, printProperty _)),
        ("flows", printISZ(F, o.flows, printFlow _)),
        ("modes", printISZ(F, o.modes, printMode _)),
        ("annexes", printISZ(F, o.annexes, printAnnex _)),
        ("uriFrag", printString(o.uriFrag))
      ))
    }

    @pure def printClassifier(o: Classifier): ST = {
      return printObject(ISZ(
        ("type", st""""Classifier""""),
        ("name", printString(o.name))
      ))
    }

    @pure def printComponentCategoryType(o: ComponentCategory.Type): ST = {
      val value: String = o match {
        case ComponentCategory.Abstract => "Abstract"
        case ComponentCategory.Bus => "Bus"
        case ComponentCategory.Data => "Data"
        case ComponentCategory.Device => "Device"
        case ComponentCategory.Memory => "Memory"
        case ComponentCategory.Process => "Process"
        case ComponentCategory.Processor => "Processor"
        case ComponentCategory.Subprogram => "Subprogram"
        case ComponentCategory.SubprogramGroup => "SubprogramGroup"
        case ComponentCategory.System => "System"
        case ComponentCategory.Thread => "Thread"
        case ComponentCategory.ThreadGroup => "ThreadGroup"
        case ComponentCategory.VirtualBus => "VirtualBus"
        case ComponentCategory.VirtualProcessor => "VirtualProcessor"
      }
      return printObject(ISZ(
        ("type", printString("ComponentCategory")),
        ("value", printString(value))
      ))
    }

    @pure def printFeature(o: Feature): ST = {
      o match {
        case o: FeatureEnd => return printFeatureEnd(o)
        case o: FeatureGroup => return printFeatureGroup(o)
        case o: FeatureAccess => return printFeatureAccess(o)
      }
    }

    @pure def printFeatureEnd(o: FeatureEnd): ST = {
      return printObject(ISZ(
        ("type", st""""FeatureEnd""""),
        ("identifier", printName(o.identifier)),
        ("direction", printDirectionType(o.direction)),
        ("category", printFeatureCategoryType(o.category)),
        ("classifier", printOption(F, o.classifier, printClassifier _)),
        ("properties", printISZ(F, o.properties, printProperty _)),
        ("uriFrag", printString(o.uriFrag))
      ))
    }

    @pure def printFeatureGroup(o: FeatureGroup): ST = {
      return printObject(ISZ(
        ("type", st""""FeatureGroup""""),
        ("identifier", printName(o.identifier)),
        ("features", printISZ(F, o.features, printFeature _)),
        ("isInverse", printB(o.isInverse)),
        ("category", printFeatureCategoryType(o.category)),
        ("properties", printISZ(F, o.properties, printProperty _)),
        ("uriFrag", printString(o.uriFrag))
      ))
    }

    @pure def printFeatureAccess(o: FeatureAccess): ST = {
      return printObject(ISZ(
        ("type", st""""FeatureAccess""""),
        ("identifier", printName(o.identifier)),
        ("category", printFeatureCategoryType(o.category)),
        ("classifier", printOption(F, o.classifier, printClassifier _)),
        ("accessType", printAccessTypeType(o.accessType)),
        ("accessCategory", printAccessCategoryType(o.accessCategory)),
        ("properties", printISZ(F, o.properties, printProperty _)),
        ("uriFrag", printString(o.uriFrag))
      ))
    }

    @pure def printAccessTypeType(o: AccessType.Type): ST = {
      val value: String = o match {
        case AccessType.Provides => "Provides"
        case AccessType.Requires => "Requires"
      }
      return printObject(ISZ(
        ("type", printString("AccessType")),
        ("value", printString(value))
      ))
    }

    @pure def printAccessCategoryType(o: AccessCategory.Type): ST = {
      val value: String = o match {
        case AccessCategory.Bus => "Bus"
        case AccessCategory.Data => "Data"
        case AccessCategory.Subprogram => "Subprogram"
        case AccessCategory.SubprogramGroup => "SubprogramGroup"
        case AccessCategory.VirtualBus => "VirtualBus"
      }
      return printObject(ISZ(
        ("type", printString("AccessCategory")),
        ("value", printString(value))
      ))
    }

    @pure def printDirectionType(o: Direction.Type): ST = {
      val value: String = o match {
        case Direction.In => "In"
        case Direction.Out => "Out"
        case Direction.InOut => "InOut"
        case Direction.None => "None"
      }
      return printObject(ISZ(
        ("type", printString("Direction")),
        ("value", printString(value))
      ))
    }

    @pure def printFeatureCategoryType(o: FeatureCategory.Type): ST = {
      val value: String = o match {
        case FeatureCategory.AbstractFeature => "AbstractFeature"
        case FeatureCategory.BusAccess => "BusAccess"
        case FeatureCategory.DataAccess => "DataAccess"
        case FeatureCategory.DataPort => "DataPort"
        case FeatureCategory.EventPort => "EventPort"
        case FeatureCategory.EventDataPort => "EventDataPort"
        case FeatureCategory.FeatureGroup => "FeatureGroup"
        case FeatureCategory.Parameter => "Parameter"
        case FeatureCategory.SubprogramAccess => "SubprogramAccess"
        case FeatureCategory.SubprogramAccessGroup => "SubprogramAccessGroup"
      }
      return printObject(ISZ(
        ("type", printString("FeatureCategory")),
        ("value", printString(value))
      ))
    }

    @pure def printConnection(o: Connection): ST = {
      return printObject(ISZ(
        ("type", st""""Connection""""),
        ("name", printName(o.name)),
        ("src", printISZ(F, o.src, printEndPoint _)),
        ("dst", printISZ(F, o.dst, printEndPoint _)),
        ("kind", printConnectionKindType(o.kind)),
        ("isBiDirectional", printB(o.isBiDirectional)),
        ("connectionInstances", printISZ(F, o.connectionInstances, printName _)),
        ("properties", printISZ(F, o.properties, printProperty _)),
        ("uriFrag", printString(o.uriFrag))
      ))
    }

    @pure def printConnectionInstance(o: ConnectionInstance): ST = {
      return printObject(ISZ(
        ("type", st""""ConnectionInstance""""),
        ("name", printName(o.name)),
        ("src", printEndPoint(o.src)),
        ("dst", printEndPoint(o.dst)),
        ("kind", printConnectionKindType(o.kind)),
        ("connectionRefs", printISZ(F, o.connectionRefs, printConnectionReference _)),
        ("properties", printISZ(F, o.properties, printProperty _))
      ))
    }

    @pure def printConnectionReference(o: ConnectionReference): ST = {
      return printObject(ISZ(
        ("type", st""""ConnectionReference""""),
        ("name", printName(o.name)),
        ("context", printName(o.context)),
        ("isParent", printB(o.isParent))
      ))
    }

    @pure def printConnectionKindType(o: ConnectionKind.Type): ST = {
      val value: String = o match {
        case ConnectionKind.Feature => "Feature"
        case ConnectionKind.Access => "Access"
        case ConnectionKind.Parameter => "Parameter"
        case ConnectionKind.Port => "Port"
        case ConnectionKind.ModeTransition => "ModeTransition"
        case ConnectionKind.FeatureGroup => "FeatureGroup"
      }
      return printObject(ISZ(
        ("type", printString("ConnectionKind")),
        ("value", printString(value))
      ))
    }

    @pure def printEndPoint(o: EndPoint): ST = {
      return printObject(ISZ(
        ("type", st""""EndPoint""""),
        ("component", printName(o.component)),
        ("feature", printOption(F, o.feature, printName _)),
        ("direction", printOption(F, o.direction, printDirectionType _))
      ))
    }

    @pure def printProperty(o: Property): ST = {
      return printObject(ISZ(
        ("type", st""""Property""""),
        ("name", printName(o.name)),
        ("propertyValues", printISZ(F, o.propertyValues, printPropertyValue _)),
        ("appliesTo", printISZ(F, o.appliesTo, printElementRef _))
      ))
    }

    @pure def printElementRef(o: ElementRef): ST = {
      o match {
        case o: Emv2ElementRef => return printEmv2ElementRef(o)
        case o: AadlElementRef => return printAadlElementRef(o)
      }
    }

    @pure def printElementKindType(o: ElementKind.Type): ST = {
      val value: String = o match {
        case ElementKind.Component => "Component"
        case ElementKind.Connection => "Connection"
        case ElementKind.Port => "Port"
        case ElementKind.Flow => "Flow"
      }
      return printObject(ISZ(
        ("type", printString("ElementKind")),
        ("value", printString(value))
      ))
    }

    @pure def printAadlElementRef(o: AadlElementRef): ST = {
      return printObject(ISZ(
        ("type", st""""AadlElementRef""""),
        ("elementKind", printElementKindType(o.elementKind)),
        ("name", printName(o.name))
      ))
    }

    @pure def printPropertyValue(o: PropertyValue): ST = {
      o match {
        case o: ClassifierProp => return printClassifierProp(o)
        case o: RangeProp => return printRangeProp(o)
        case o: RecordProp => return printRecordProp(o)
        case o: ReferenceProp => return printReferenceProp(o)
        case o: UnitProp => return printUnitProp(o)
        case o: ValueProp => return printValueProp(o)
      }
    }

    @pure def printClassifierProp(o: ClassifierProp): ST = {
      return printObject(ISZ(
        ("type", st""""ClassifierProp""""),
        ("name", printString(o.name))
      ))
    }

    @pure def printRangeProp(o: RangeProp): ST = {
      return printObject(ISZ(
        ("type", st""""RangeProp""""),
        ("low", printUnitProp(o.low)),
        ("high", printUnitProp(o.high))
      ))
    }

    @pure def printRecordProp(o: RecordProp): ST = {
      return printObject(ISZ(
        ("type", st""""RecordProp""""),
        ("properties", printISZ(F, o.properties, printProperty _))
      ))
    }

    @pure def printReferenceProp(o: ReferenceProp): ST = {
      return printObject(ISZ(
        ("type", st""""ReferenceProp""""),
        ("value", printName(o.value))
      ))
    }

    @pure def printUnitProp(o: UnitProp): ST = {
      return printObject(ISZ(
        ("type", st""""UnitProp""""),
        ("value", printString(o.value)),
        ("unit", printOption(T, o.unit, printString _))
      ))
    }

    @pure def printValueProp(o: ValueProp): ST = {
      return printObject(ISZ(
        ("type", st""""ValueProp""""),
        ("value", printString(o.value))
      ))
    }

    @pure def printMode(o: Mode): ST = {
      return printObject(ISZ(
        ("type", st""""Mode""""),
        ("name", printName(o.name))
      ))
    }

    @pure def printFlowKindType(o: FlowKind.Type): ST = {
      val value: String = o match {
        case FlowKind.Source => "Source"
        case FlowKind.Sink => "Sink"
        case FlowKind.Path => "Path"
      }
      return printObject(ISZ(
        ("type", printString("FlowKind")),
        ("value", printString(value))
      ))
    }

    @pure def printFlow(o: Flow): ST = {
      return printObject(ISZ(
        ("type", st""""Flow""""),
        ("name", printName(o.name)),
        ("kind", printFlowKindType(o.kind)),
        ("source", printOption(F, o.source, printName _)),
        ("sink", printOption(F, o.sink, printName _)),
        ("uriFrag", printString(o.uriFrag))
      ))
    }

    @pure def printAnnex(o: Annex): ST = {
      return printObject(ISZ(
        ("type", st""""Annex""""),
        ("name", printString(o.name)),
        ("clause", printAnnexClause(o.clause))
      ))
    }

    @pure def printAnnexClause(o: AnnexClause): ST = {
      o match {
        case o: SmfClause => return printSmfClause(o)
        case o: SmfClassification => return printSmfClassification(o)
        case o: SmfDeclass => return printSmfDeclass(o)
        case o: SmfType => return printSmfType(o)
        case o: ErrorTypeDef => return printErrorTypeDef(o)
        case o: ErrorAliasDef => return printErrorAliasDef(o)
        case o: ErrorTypeSetDef => return printErrorTypeSetDef(o)
        case o: BehaveStateMachine => return printBehaveStateMachine(o)
        case o: ErrorEvent => return printErrorEvent(o)
        case o: ErrorState => return printErrorState(o)
        case o: ErrorTransition => return printErrorTransition(o)
        case o: ConditionTrigger => return printConditionTrigger(o)
        case o: AndCondition => return printAndCondition(o)
        case o: OrCondition => return printOrCondition(o)
        case o: AllCondition => return printAllCondition(o)
        case o: OrMoreCondition => return printOrMoreCondition(o)
        case o: OrLessCondition => return printOrLessCondition(o)
        case o: Emv2Clause => return printEmv2Clause(o)
        case o: Emv2Propagation => return printEmv2Propagation(o)
        case o: Emv2Flow => return printEmv2Flow(o)
        case o: Emv2BehaviorSection => return printEmv2BehaviorSection(o)
        case o: ErrorPropagation => return printErrorPropagation(o)
        case o: OtherAnnex => return printOtherAnnex(o)
        case o: BTSBLESSAnnexClause => return printBTSBLESSAnnexClause(o)
        case o: BTSActionAnnexSubclause => return printBTSActionAnnexSubclause(o)
      }
    }

    @pure def printAnnexLib(o: AnnexLib): ST = {
      o match {
        case o: SmfLibrary => return printSmfLibrary(o)
        case o: Emv2Library => return printEmv2Library(o)
        case o: OtherLib => return printOtherLib(o)
        case o: BTSTypeLibrary => return printBTSTypeLibrary(o)
        case o: BTSUnitLibrary => return printBTSUnitLibrary(o)
        case o: BTSExceptionLibrary => return printBTSExceptionLibrary(o)
      }
    }

    @pure def printOtherAnnex(o: OtherAnnex): ST = {
      return printObject(ISZ(
        ("type", st""""OtherAnnex""""),
        ("clause", printString(o.clause))
      ))
    }

    @pure def printOtherLib(o: OtherLib): ST = {
      return printObject(ISZ(
        ("type", st""""OtherLib""""),
        ("lib", printString(o.lib))
      ))
    }

    @pure def printBLESSAnnex(o: BLESSAnnex): ST = {
      o match {
        case o: BTSBLESSAnnexClause => return printBTSBLESSAnnexClause(o)
        case o: BTSActionAnnexSubclause => return printBTSActionAnnexSubclause(o)
      }
    }

    @pure def printBTSBLESSAnnexClause(o: BTSBLESSAnnexClause): ST = {
      return printObject(ISZ(
        ("type", st""""BTSBLESSAnnexClause""""),
        ("doNotProve", printB(o.doNotProve)),
        ("assertions", printISZ(F, o.assertions, printBTSAssertion _)),
        ("invariant", printOption(F, o.invariant, printBTSAssertion _)),
        ("variables", printISZ(F, o.variables, printBTSVariableDeclaration _)),
        ("states", printISZ(F, o.states, printBTSStateDeclaration _)),
        ("transitions", printISZ(F, o.transitions, printBTSTransition _))
      ))
    }

    @pure def printBTSVariableDeclaration(o: BTSVariableDeclaration): ST = {
      return printObject(ISZ(
        ("type", st""""BTSVariableDeclaration""""),
        ("name", printName(o.name)),
        ("category", printOption(F, o.category, printBTSVariableCategoryType _)),
        ("varType", printBTSType(o.varType)),
        ("assignExpression", printOption(F, o.assignExpression, printBTSExp _)),
        ("arraySize", printOption(F, o.arraySize, printBTSExp _)),
        ("variableAssertion", printOption(F, o.variableAssertion, printBTSAssertion _))
      ))
    }

    @pure def printBTSVariableCategoryType(o: BTSVariableCategory.Type): ST = {
      val value: String = o match {
        case BTSVariableCategory.Nonvolatile => "Nonvolatile"
        case BTSVariableCategory.Shared => "Shared"
        case BTSVariableCategory.Constant => "Constant"
        case BTSVariableCategory.Spread => "Spread"
        case BTSVariableCategory.Final => "Final"
      }
      return printObject(ISZ(
        ("type", printString("BTSVariableCategory")),
        ("value", printString(value))
      ))
    }

    @pure def printBTSStateDeclaration(o: BTSStateDeclaration): ST = {
      return printObject(ISZ(
        ("type", st""""BTSStateDeclaration""""),
        ("id", printName(o.id)),
        ("categories", printISZ(F, o.categories, printBTSStateCategoryType _)),
        ("assertion", printOption(F, o.assertion, printBTSAssertion _))
      ))
    }

    @pure def printBTSStateCategoryType(o: BTSStateCategory.Type): ST = {
      val value: String = o match {
        case BTSStateCategory.Initial => "Initial"
        case BTSStateCategory.Complete => "Complete"
        case BTSStateCategory.Execute => "Execute"
        case BTSStateCategory.Final => "Final"
      }
      return printObject(ISZ(
        ("type", printString("BTSStateCategory")),
        ("value", printString(value))
      ))
    }

    @pure def printBTSTransition(o: BTSTransition): ST = {
      return printObject(ISZ(
        ("type", st""""BTSTransition""""),
        ("label", printBTSTransitionLabel(o.label)),
        ("sourceStates", printISZ(F, o.sourceStates, printName _)),
        ("destState", printName(o.destState)),
        ("transitionCondition", printOption(F, o.transitionCondition, printBTSTransitionCondition _)),
        ("actions", printOption(F, o.actions, printBTSBehaviorActions _)),
        ("assertion", printOption(F, o.assertion, printBTSAssertion _))
      ))
    }

    @pure def printBTSTransitionLabel(o: BTSTransitionLabel): ST = {
      return printObject(ISZ(
        ("type", st""""BTSTransitionLabel""""),
        ("id", printName(o.id)),
        ("priority", printOption(T, o.priority, printZ _))
      ))
    }

    @pure def printBTSTransitionCondition(o: BTSTransitionCondition): ST = {
      o match {
        case o: BTSDispatchCondition => return printBTSDispatchCondition(o)
        case o: BTSExecuteConditionExp => return printBTSExecuteConditionExp(o)
        case o: BTSExecuteConditionTimeout => return printBTSExecuteConditionTimeout(o)
        case o: BTSExecuteConditionOtherwise => return printBTSExecuteConditionOtherwise(o)
        case o: BTSModeCondition => return printBTSModeCondition(o)
        case o: BTSInternalCondition => return printBTSInternalCondition(o)
      }
    }

    @pure def printBTSDispatchCondition(o: BTSDispatchCondition): ST = {
      return printObject(ISZ(
        ("type", st""""BTSDispatchCondition""""),
        ("conjunctions", printISZ(F, o.conjunctions, printBTSDispatchConjunction _)),
        ("subprogramaccessdispatch", printName(o.subprogramaccessdispatch)),
        ("frozenPorts", printISZ(F, o.frozenPorts, printName _))
      ))
    }

    @pure def printBTSDispatchConjunction(o: BTSDispatchConjunction): ST = {
      return printObject(ISZ(
        ("type", st""""BTSDispatchConjunction""""),
        ("triggers", printISZ(F, o.triggers, printBTSDispatchTrigger _))
      ))
    }

    @pure def printBTSDispatchTrigger(o: BTSDispatchTrigger): ST = {
      o match {
        case o: BTSDispatchTriggerStop => return printBTSDispatchTriggerStop(o)
        case o: BTSDispatchTriggerPort => return printBTSDispatchTriggerPort(o)
        case o: BTSDispatchTriggerTimeout => return printBTSDispatchTriggerTimeout(o)
      }
    }

    @pure def printBTSDispatchTriggerStop(o: BTSDispatchTriggerStop): ST = {
      return printObject(ISZ(
        ("type", st""""BTSDispatchTriggerStop"""")
      ))
    }

    @pure def printBTSDispatchTriggerPort(o: BTSDispatchTriggerPort): ST = {
      return printObject(ISZ(
        ("type", st""""BTSDispatchTriggerPort""""),
        ("port", printName(o.port)),
        ("portarrayindex", printOption(T, o.portarrayindex, printZ _))
      ))
    }

    @pure def printBTSDispatchTriggerTimeout(o: BTSDispatchTriggerTimeout): ST = {
      return printObject(ISZ(
        ("type", st""""BTSDispatchTriggerTimeout""""),
        ("ports", printISZ(F, o.ports, printName _)),
        ("time", printOption(F, o.time, printBTSExp _))
      ))
    }

    @pure def printBTSExecuteCondition(o: BTSExecuteCondition): ST = {
      o match {
        case o: BTSExecuteConditionExp => return printBTSExecuteConditionExp(o)
        case o: BTSExecuteConditionTimeout => return printBTSExecuteConditionTimeout(o)
        case o: BTSExecuteConditionOtherwise => return printBTSExecuteConditionOtherwise(o)
      }
    }

    @pure def printBTSExecuteConditionExp(o: BTSExecuteConditionExp): ST = {
      return printObject(ISZ(
        ("type", st""""BTSExecuteConditionExp""""),
        ("exp", printBTSExp(o.exp))
      ))
    }

    @pure def printBTSExecuteConditionTimeout(o: BTSExecuteConditionTimeout): ST = {
      return printObject(ISZ(
        ("type", st""""BTSExecuteConditionTimeout"""")
      ))
    }

    @pure def printBTSExecuteConditionOtherwise(o: BTSExecuteConditionOtherwise): ST = {
      return printObject(ISZ(
        ("type", st""""BTSExecuteConditionOtherwise"""")
      ))
    }

    @pure def printBTSModeCondition(o: BTSModeCondition): ST = {
      return printObject(ISZ(
        ("type", st""""BTSModeCondition""""),
        ("tle", printBTSTriggerLogicalExpression(o.tle))
      ))
    }

    @pure def printBTSTriggerLogicalExpression(o: BTSTriggerLogicalExpression): ST = {
      return printObject(ISZ(
        ("type", st""""BTSTriggerLogicalExpression""""),
        ("op", printBTSModeOperatorType(o.op)),
        ("triggers", printISZ(F, o.triggers, printBTSEventTrigger _))
      ))
    }

    @pure def printBTSEventTrigger(o: BTSEventTrigger): ST = {
      o match {
        case o: BTSTriggerLogicalExpression => return printBTSTriggerLogicalExpression(o)
        case o: BTSSubcomponentPort => return printBTSSubcomponentPort(o)
      }
    }

    @pure def printBTSSubcomponentPort(o: BTSSubcomponentPort): ST = {
      return printObject(ISZ(
        ("type", st""""BTSSubcomponentPort""""),
        ("sub", printISZ(F, o.sub, printName _)),
        ("port", printName(o.port)),
        ("index", printOption(T, o.index, printZ _))
      ))
    }

    @pure def printBTSModeOperatorType(o: BTSModeOperator.Type): ST = {
      val value: String = o match {
        case BTSModeOperator.AND => "AND"
        case BTSModeOperator.OR => "OR"
        case BTSModeOperator.XOR => "XOR"
        case BTSModeOperator.THEN => "THEN"
        case BTSModeOperator.ELSE => "ELSE"
      }
      return printObject(ISZ(
        ("type", printString("BTSModeOperator")),
        ("value", printString(value))
      ))
    }

    @pure def printBTSInternalCondition(o: BTSInternalCondition): ST = {
      return printObject(ISZ(
        ("type", st""""BTSInternalCondition""""),
        ("internalports", printISZ(F, o.internalports, printName _))
      ))
    }

    @pure def printBTSAssertion(o: BTSAssertion): ST = {
      o match {
        case o: BTSNamedAssertion => return printBTSNamedAssertion(o)
        case o: BTSNamedFunction => return printBTSNamedFunction(o)
        case o: BTSNamedEnumeration => return printBTSNamedEnumeration(o)
        case o: BTSNamelessAssertion => return printBTSNamelessAssertion(o)
        case o: BTSNamelessFunction => return printBTSNamelessFunction(o)
        case o: BTSNamelessEnumeration => return printBTSNamelessEnumeration(o)
      }
    }

    @pure def printBTSNamedAssertion(o: BTSNamedAssertion): ST = {
      return printObject(ISZ(
        ("type", st""""BTSNamedAssertion""""),
        ("label", printName(o.label)),
        ("formals", printISZ(F, o.formals, printBTSVariable _)),
        ("predicate", printBTSExp(o.predicate))
      ))
    }

    @pure def printBTSNamedFunction(o: BTSNamedFunction): ST = {
      return printObject(ISZ(
        ("type", st""""BTSNamedFunction""""),
        ("label", printName(o.label)),
        ("formals", printISZ(F, o.formals, printBTSVariable _)),
        ("returns", printBTSType(o.returns)),
        ("functionvalue", printBTSExp(o.functionvalue))
      ))
    }

    @pure def printBTSNamedEnumeration(o: BTSNamedEnumeration): ST = {
      return printObject(ISZ(
        ("type", st""""BTSNamedEnumeration""""),
        ("label", printName(o.label)),
        ("assertionvariable", printName(o.assertionvariable)),
        ("enumerationtype", printBTSType(o.enumerationtype)),
        ("enumeration", printBTSAssertionEnumeration(o.enumeration))
      ))
    }

    @pure def printBTSNamelessAssertion(o: BTSNamelessAssertion): ST = {
      return printObject(ISZ(
        ("type", st""""BTSNamelessAssertion""""),
        ("predicate", printBTSExp(o.predicate))
      ))
    }

    @pure def printBTSNamelessFunction(o: BTSNamelessFunction): ST = {
      return printObject(ISZ(
        ("type", st""""BTSNamelessFunction""""),
        ("returns", printBTSType(o.returns)),
        ("functionvalue", printBTSExp(o.functionvalue))
      ))
    }

    @pure def printBTSNamelessEnumeration(o: BTSNamelessEnumeration): ST = {
      return printObject(ISZ(
        ("type", st""""BTSNamelessEnumeration""""),
        ("enumeration", printBTSInvocation(o.enumeration))
      ))
    }

    @pure def printBTSAssertionEnumeration(o: BTSAssertionEnumeration): ST = {
      o match {
        case o: BTSEnumerationPairs => return printBTSEnumerationPairs(o)
        case o: BTSInvocation => return printBTSInvocation(o)
      }
    }

    @pure def printBTSEnumerationPairs(o: BTSEnumerationPairs): ST = {
      return printObject(ISZ(
        ("type", st""""BTSEnumerationPairs""""),
        ("pairs", printISZ(F, o.pairs, printBTSEnumerationPair _))
      ))
    }

    @pure def printBTSEnumerationPair(o: BTSEnumerationPair): ST = {
      return printObject(ISZ(
        ("type", st""""BTSEnumerationPair""""),
        ("literal", printName(o.literal)),
        ("predicate", printBTSExp(o.predicate))
      ))
    }

    @pure def printBTSInvocation(o: BTSInvocation): ST = {
      return printObject(ISZ(
        ("type", st""""BTSInvocation""""),
        ("label", printName(o.label)),
        ("params", printISZ(F, o.params, printBTSActualParameter _)),
        ("actual", printOption(F, o.actual, printBTSExp _))
      ))
    }

    @pure def printBTSActualParameter(o: BTSActualParameter): ST = {
      return printObject(ISZ(
        ("type", st""""BTSActualParameter""""),
        ("formal", printName(o.formal)),
        ("actual", printBTSExp(o.actual))
      ))
    }

    @pure def printBTSVariable(o: BTSVariable): ST = {
      return printObject(ISZ(
        ("type", st""""BTSVariable""""),
        ("name", printName(o.name)),
        ("typ", printBTSType(o.typ))
      ))
    }

    @pure def printBTSActionAnnexSubclause(o: BTSActionAnnexSubclause): ST = {
      return printObject(ISZ(
        ("type", st""""BTSActionAnnexSubclause""""),
        ("doNotProve", printB(o.doNotProve)),
        ("throws", printISZ(F, o.throws, printName _)),
        ("assertions", printISZ(F, o.assertions, printBTSAssertion _)),
        ("precondition", printOption(F, o.precondition, printBTSAssertion _)),
        ("postcondition", printOption(F, o.postcondition, printBTSAssertion _)),
        ("invariant", printOption(F, o.invariant, printBTSAssertion _)),
        ("elq", printBTSExistentialLatticeQuantification(o.elq))
      ))
    }

    @pure def printBTSBehaviorActions(o: BTSBehaviorActions): ST = {
      return printObject(ISZ(
        ("type", st""""BTSBehaviorActions""""),
        ("executionOrder", printBTSExecutionOrderType(o.executionOrder)),
        ("actions", printISZ(F, o.actions, printBTSAssertedAction _))
      ))
    }

    @pure def printBTSExecutionOrderType(o: BTSExecutionOrder.Type): ST = {
      val value: String = o match {
        case BTSExecutionOrder.Sequential => "Sequential"
        case BTSExecutionOrder.Concurrent => "Concurrent"
      }
      return printObject(ISZ(
        ("type", printString("BTSExecutionOrder")),
        ("value", printString(value))
      ))
    }

    @pure def printBTSAssertedAction(o: BTSAssertedAction): ST = {
      return printObject(ISZ(
        ("type", st""""BTSAssertedAction""""),
        ("precondition", printOption(F, o.precondition, printBTSAssertion _)),
        ("action", printBTSAction(o.action)),
        ("postcondition", printOption(F, o.postcondition, printBTSAssertion _))
      ))
    }

    @pure def printBTSAction(o: BTSAction): ST = {
      o match {
        case o: BTSSkipAction => return printBTSSkipAction(o)
        case o: BTSAssignmentAction => return printBTSAssignmentAction(o)
        case o: BTSSetMode => return printBTSSetMode(o)
        case o: BTSWhenThrow => return printBTSWhenThrow(o)
        case o: BTSFetchAdd => return printBTSFetchAdd(o)
        case o: BTSFetchOr => return printBTSFetchOr(o)
        case o: BTSFetchAnd => return printBTSFetchAnd(o)
        case o: BTSFetchXor => return printBTSFetchXor(o)
        case o: BTSSwap => return printBTSSwap(o)
        case o: BTSSubprogramCallAction => return printBTSSubprogramCallAction(o)
        case o: BTSPortOutput => return printBTSPortOutput(o)
        case o: BTSPortInput => return printBTSPortInput(o)
        case o: BTSFrozenPortAction => return printBTSFrozenPortAction(o)
        case o: BTSPause => return printBTSPause(o)
        case o: BTSIfBLESSAction => return printBTSIfBLESSAction(o)
        case o: BTSIfBAAction => return printBTSIfBAAction(o)
        case o: BTSWhileLoop => return printBTSWhileLoop(o)
        case o: BTSForLoop => return printBTSForLoop(o)
        case o: BTSDoUntilLoop => return printBTSDoUntilLoop(o)
        case o: BTSExistentialLatticeQuantification => return printBTSExistentialLatticeQuantification(o)
        case o: BTSUniversalLatticeQuantification => return printBTSUniversalLatticeQuantification(o)
      }
    }

    @pure def printBTSBasicAction(o: BTSBasicAction): ST = {
      o match {
        case o: BTSSkipAction => return printBTSSkipAction(o)
        case o: BTSAssignmentAction => return printBTSAssignmentAction(o)
        case o: BTSSetMode => return printBTSSetMode(o)
        case o: BTSWhenThrow => return printBTSWhenThrow(o)
        case o: BTSFetchAdd => return printBTSFetchAdd(o)
        case o: BTSFetchOr => return printBTSFetchOr(o)
        case o: BTSFetchAnd => return printBTSFetchAnd(o)
        case o: BTSFetchXor => return printBTSFetchXor(o)
        case o: BTSSwap => return printBTSSwap(o)
        case o: BTSSubprogramCallAction => return printBTSSubprogramCallAction(o)
        case o: BTSPortOutput => return printBTSPortOutput(o)
        case o: BTSPortInput => return printBTSPortInput(o)
        case o: BTSFrozenPortAction => return printBTSFrozenPortAction(o)
        case o: BTSPause => return printBTSPause(o)
      }
    }

    @pure def printBTSSkipAction(o: BTSSkipAction): ST = {
      return printObject(ISZ(
        ("type", st""""BTSSkipAction"""")
      ))
    }

    @pure def printBTSAssignmentAction(o: BTSAssignmentAction): ST = {
      return printObject(ISZ(
        ("type", st""""BTSAssignmentAction""""),
        ("lhs", printBTSValueName(o.lhs)),
        ("tick", printB(o.tick)),
        ("rhs", printBTSExp(o.rhs))
      ))
    }

    @pure def printBTSSetMode(o: BTSSetMode): ST = {
      return printObject(ISZ(
        ("type", st""""BTSSetMode""""),
        ("mode", printName(o.mode))
      ))
    }

    @pure def printBTSWhenThrow(o: BTSWhenThrow): ST = {
      return printObject(ISZ(
        ("type", st""""BTSWhenThrow""""),
        ("exp", printBTSExp(o.exp)),
        ("exception", printName(o.exception)),
        ("message", printOption(T, o.message, printString _))
      ))
    }

    @pure def printBTSCombinableOperation(o: BTSCombinableOperation): ST = {
      o match {
        case o: BTSFetchAdd => return printBTSFetchAdd(o)
        case o: BTSFetchOr => return printBTSFetchOr(o)
        case o: BTSFetchAnd => return printBTSFetchAnd(o)
        case o: BTSFetchXor => return printBTSFetchXor(o)
        case o: BTSSwap => return printBTSSwap(o)
      }
    }

    @pure def printBTSFetchAdd(o: BTSFetchAdd): ST = {
      return printObject(ISZ(
        ("type", st""""BTSFetchAdd""""),
        ("target", printName(o.target)),
        ("arithmetic", printBTSExp(o.arithmetic)),
        ("result", printName(o.result))
      ))
    }

    @pure def printBTSFetchOr(o: BTSFetchOr): ST = {
      return printObject(ISZ(
        ("type", st""""BTSFetchOr""""),
        ("target", printName(o.target)),
        ("bool", printBTSExp(o.bool)),
        ("result", printOption(F, o.result, printName _))
      ))
    }

    @pure def printBTSFetchAnd(o: BTSFetchAnd): ST = {
      return printObject(ISZ(
        ("type", st""""BTSFetchAnd""""),
        ("target", printName(o.target)),
        ("bool", printBTSExp(o.bool)),
        ("result", printOption(F, o.result, printName _))
      ))
    }

    @pure def printBTSFetchXor(o: BTSFetchXor): ST = {
      return printObject(ISZ(
        ("type", st""""BTSFetchXor""""),
        ("target", printName(o.target)),
        ("bool", printBTSExp(o.bool)),
        ("result", printOption(F, o.result, printName _))
      ))
    }

    @pure def printBTSSwap(o: BTSSwap): ST = {
      return printObject(ISZ(
        ("type", st""""BTSSwap""""),
        ("target", printName(o.target)),
        ("reference", printName(o.reference)),
        ("result", printName(o.result))
      ))
    }

    @pure def printBTSCommunicationAction(o: BTSCommunicationAction): ST = {
      o match {
        case o: BTSSubprogramCallAction => return printBTSSubprogramCallAction(o)
        case o: BTSPortOutput => return printBTSPortOutput(o)
        case o: BTSPortInput => return printBTSPortInput(o)
        case o: BTSFrozenPortAction => return printBTSFrozenPortAction(o)
        case o: BTSPause => return printBTSPause(o)
      }
    }

    @pure def printBTSSubprogramCallAction(o: BTSSubprogramCallAction): ST = {
      return printObject(ISZ(
        ("type", st""""BTSSubprogramCallAction""""),
        ("name", printName(o.name)),
        ("params", printISZ(F, o.params, printBTSFormalActual _))
      ))
    }

    @pure def printBTSFormalActual(o: BTSFormalActual): ST = {
      return printObject(ISZ(
        ("type", st""""BTSFormalActual""""),
        ("formal", printName(o.formal)),
        ("actual", printBTSExp(o.actual))
      ))
    }

    @pure def printBTSPortOutput(o: BTSPortOutput): ST = {
      return printObject(ISZ(
        ("type", st""""BTSPortOutput""""),
        ("port", printName(o.port)),
        ("exp", printOption(F, o.exp, printBTSExp _))
      ))
    }

    @pure def printBTSPortInput(o: BTSPortInput): ST = {
      return printObject(ISZ(
        ("type", st""""BTSPortInput""""),
        ("port", printName(o.port)),
        ("variable", printBTSValueName(o.variable))
      ))
    }

    @pure def printBTSFrozenPortAction(o: BTSFrozenPortAction): ST = {
      return printObject(ISZ(
        ("type", st""""BTSFrozenPortAction""""),
        ("ports", printISZ(F, o.ports, printName _))
      ))
    }

    @pure def printBTSPause(o: BTSPause): ST = {
      return printObject(ISZ(
        ("type", st""""BTSPause"""")
      ))
    }

    @pure def printBTSControlAction(o: BTSControlAction): ST = {
      o match {
        case o: BTSIfBLESSAction => return printBTSIfBLESSAction(o)
        case o: BTSIfBAAction => return printBTSIfBAAction(o)
        case o: BTSWhileLoop => return printBTSWhileLoop(o)
        case o: BTSForLoop => return printBTSForLoop(o)
        case o: BTSDoUntilLoop => return printBTSDoUntilLoop(o)
      }
    }

    @pure def printBTSIfBLESSAction(o: BTSIfBLESSAction): ST = {
      return printObject(ISZ(
        ("type", st""""BTSIfBLESSAction""""),
        ("availability", printOption(F, o.availability, printTODO _)),
        ("alternatives", printISZ(F, o.alternatives, printBTSGuardedAction _))
      ))
    }

    @pure def printBTSGuardedAction(o: BTSGuardedAction): ST = {
      return printObject(ISZ(
        ("type", st""""BTSGuardedAction""""),
        ("guard", printBTSExp(o.guard)),
        ("action", printBTSAssertedAction(o.action))
      ))
    }

    @pure def printBTSIfBAAction(o: BTSIfBAAction): ST = {
      return printObject(ISZ(
        ("type", st""""BTSIfBAAction""""),
        ("ifBranch", printBTSConditionalActions(o.ifBranch)),
        ("elseIfBranches", printISZ(F, o.elseIfBranches, printBTSConditionalActions _)),
        ("elseBranch", printOption(F, o.elseBranch, printBTSBehaviorActions _))
      ))
    }

    @pure def printBTSConditionalActions(o: BTSConditionalActions): ST = {
      return printObject(ISZ(
        ("type", st""""BTSConditionalActions""""),
        ("cond", printBTSExp(o.cond)),
        ("actions", printBTSBehaviorActions(o.actions))
      ))
    }

    @pure def printBTSWhileLoop(o: BTSWhileLoop): ST = {
      return printObject(ISZ(
        ("type", st""""BTSWhileLoop""""),
        ("test", printBTSExp(o.test)),
        ("invariant", printOption(F, o.invariant, printBTSNamelessAssertion _)),
        ("bound", printOption(F, o.bound, printBTSExp _)),
        ("elq", printBTSExistentialLatticeQuantification(o.elq))
      ))
    }

    @pure def printBTSForLoop(o: BTSForLoop): ST = {
      return printObject(ISZ(
        ("type", st""""BTSForLoop""""),
        ("count", printName(o.count)),
        ("lowerbound", printBTSExp(o.lowerbound)),
        ("upperbound", printBTSExp(o.upperbound)),
        ("invariant", printOption(F, o.invariant, printBTSNamelessAssertion _)),
        ("actions", printBTSBehaviorActions(o.actions))
      ))
    }

    @pure def printBTSDoUntilLoop(o: BTSDoUntilLoop): ST = {
      return printObject(ISZ(
        ("type", st""""BTSDoUntilLoop""""),
        ("invariant", printOption(F, o.invariant, printBTSNamelessAssertion _)),
        ("bound", printOption(F, o.bound, printBTSExp _)),
        ("actions", printBTSBehaviorActions(o.actions)),
        ("guard", printBTSExp(o.guard))
      ))
    }

    @pure def printBTSQuantificationActions(o: BTSQuantificationActions): ST = {
      o match {
        case o: BTSExistentialLatticeQuantification => return printBTSExistentialLatticeQuantification(o)
        case o: BTSUniversalLatticeQuantification => return printBTSUniversalLatticeQuantification(o)
      }
    }

    @pure def printBTSExistentialLatticeQuantification(o: BTSExistentialLatticeQuantification): ST = {
      return printObject(ISZ(
        ("type", st""""BTSExistentialLatticeQuantification""""),
        ("quantifiedVariables", printISZ(F, o.quantifiedVariables, printBTSVariableDeclaration _)),
        ("actions", printBTSBehaviorActions(o.actions)),
        ("timeout", printOption(F, o.timeout, printBTSExp _)),
        ("catchClause", printISZ(F, o.catchClause, printBTSCatchClauseTerm _))
      ))
    }

    @pure def printBTSCatchClauseTerm(o: BTSCatchClauseTerm): ST = {
      return printObject(ISZ(
        ("type", st""""BTSCatchClauseTerm""""),
        ("exceptions", printISZ(F, o.exceptions, printName _)),
        ("all", printB(o.all)),
        ("action", printBTSBasicAction(o.action))
      ))
    }

    @pure def printBTSUniversalLatticeQuantification(o: BTSUniversalLatticeQuantification): ST = {
      return printObject(ISZ(
        ("type", st""""BTSUniversalLatticeQuantification""""),
        ("latticeVariables", printISZ(F, o.latticeVariables, printName _)),
        ("lowerbound", printBTSExp(o.lowerbound)),
        ("upperbound", printBTSExp(o.upperbound)),
        ("elq", printBTSExistentialLatticeQuantification(o.elq))
      ))
    }

    @pure def printBTSExp(o: BTSExp): ST = {
      o match {
        case o: BTSUnaryExp => return printBTSUnaryExp(o)
        case o: BTSBinaryExp => return printBTSBinaryExp(o)
        case o: BTSLiteralExp => return printBTSLiteralExp(o)
        case o: BTSVariableNameExp => return printBTSVariableNameExp(o)
        case o: BTSIndexingExp => return printBTSIndexingExp(o)
        case o: BTSAccessExp => return printBTSAccessExp(o)
        case o: BTSFunctionCall => return printBTSFunctionCall(o)
        case o: BTSConditionalExpression => return printBTSConditionalExpression(o)
        case o: BTSTrue => return printBTSTrue(o)
        case o: BTSFalse => return printBTSFalse(o)
        case o: BTSNull => return printBTSNull(o)
        case o: BTSPropertyConstant => return printBTSPropertyConstant(o)
        case o: BTSPropertySetProperty => return printBTSPropertySetProperty(o)
        case o: BTSSelfProperty => return printBTSSelfProperty(o)
        case o: BTSComponentProperty => return printBTSComponentProperty(o)
        case o: BTSUniversalQuantification => return printBTSUniversalQuantification(o)
        case o: BTSExistentialQuantification => return printBTSExistentialQuantification(o)
        case o: BTSSumQuantification => return printBTSSumQuantification(o)
        case o: BTSProductQuantification => return printBTSProductQuantification(o)
        case o: BTSCountingQuantification => return printBTSCountingQuantification(o)
        case o: BTSRange => return printBTSRange(o)
        case o: BTSQuantity => return printBTSQuantity(o)
      }
    }

    @pure def printBTSUnaryExp(o: BTSUnaryExp): ST = {
      return printObject(ISZ(
        ("type", st""""BTSUnaryExp""""),
        ("op", printBTSUnaryOpType(o.op)),
        ("exp", printBTSExp(o.exp))
      ))
    }

    @pure def printBTSUnaryOpType(o: BTSUnaryOp.Type): ST = {
      val value: String = o match {
        case BTSUnaryOp.ABS => "ABS"
        case BTSUnaryOp.NEG => "NEG"
        case BTSUnaryOp.NOT => "NOT"
        case BTSUnaryOp.TRUNCATE => "TRUNCATE"
        case BTSUnaryOp.ROUND => "ROUND"
        case BTSUnaryOp.TICK => "TICK"
      }
      return printObject(ISZ(
        ("type", printString("BTSUnaryOp")),
        ("value", printString(value))
      ))
    }

    @pure def printBTSBinaryExp(o: BTSBinaryExp): ST = {
      return printObject(ISZ(
        ("type", st""""BTSBinaryExp""""),
        ("op", printBTSBinaryOpType(o.op)),
        ("lhs", printBTSExp(o.lhs)),
        ("rhs", printBTSExp(o.rhs))
      ))
    }

    @pure def printBTSBinaryOpType(o: BTSBinaryOp.Type): ST = {
      val value: String = o match {
        case BTSBinaryOp.AND => "AND"
        case BTSBinaryOp.ANDTHEN => "ANDTHEN"
        case BTSBinaryOp.OR => "OR"
        case BTSBinaryOp.ORELSE => "ORELSE"
        case BTSBinaryOp.XOR => "XOR"
        case BTSBinaryOp.IFF => "IFF"
        case BTSBinaryOp.IMPLIES => "IMPLIES"
        case BTSBinaryOp.EQ => "EQ"
        case BTSBinaryOp.NEQ => "NEQ"
        case BTSBinaryOp.LT => "LT"
        case BTSBinaryOp.LTE => "LTE"
        case BTSBinaryOp.GT => "GT"
        case BTSBinaryOp.GTE => "GTE"
        case BTSBinaryOp.FA => "FA"
        case BTSBinaryOp.IN => "IN"
        case BTSBinaryOp.PLUS => "PLUS"
        case BTSBinaryOp.MINUS => "MINUS"
        case BTSBinaryOp.DIVIDE => "DIVIDE"
        case BTSBinaryOp.MULT => "MULT"
        case BTSBinaryOp.DIV => "DIV"
        case BTSBinaryOp.MOD => "MOD"
        case BTSBinaryOp.REM => "REM"
        case BTSBinaryOp.EXP => "EXP"
        case BTSBinaryOp.AT => "AT"
        case BTSBinaryOp.CARET => "CARET"
      }
      return printObject(ISZ(
        ("type", printString("BTSBinaryOp")),
        ("value", printString(value))
      ))
    }

    @pure def printBTSLiteralTypeType(o: BTSLiteralType.Type): ST = {
      val value: String = o match {
        case BTSLiteralType.BOOLEAN => "BOOLEAN"
        case BTSLiteralType.STRING => "STRING"
        case BTSLiteralType.INTEGER => "INTEGER"
        case BTSLiteralType.FLOAT => "FLOAT"
        case BTSLiteralType.NUMBER => "NUMBER"
      }
      return printObject(ISZ(
        ("type", printString("BTSLiteralType")),
        ("value", printString(value))
      ))
    }

    @pure def printBTSLiteralExp(o: BTSLiteralExp): ST = {
      return printObject(ISZ(
        ("type", st""""BTSLiteralExp""""),
        ("typ", printBTSLiteralTypeType(o.typ)),
        ("exp", printString(o.exp)),
        ("unit", printOption(F, o.unit, printName _))
      ))
    }

    @pure def printBTSValueName(o: BTSValueName): ST = {
      o match {
        case o: BTSVariableNameExp => return printBTSVariableNameExp(o)
        case o: BTSFunctionCall => return printBTSFunctionCall(o)
      }
    }

    @pure def printBTSVariableNameExp(o: BTSVariableNameExp): ST = {
      return printObject(ISZ(
        ("type", st""""BTSVariableNameExp""""),
        ("name", printName(o.name)),
        ("arrayindex", printISZ(F, o.arrayindex, printBTSExp _)),
        ("pn", printISZ(F, o.pn, printBTSPartialName _))
      ))
    }

    @pure def printBTSPartialName(o: BTSPartialName): ST = {
      return printObject(ISZ(
        ("type", st""""BTSPartialName""""),
        ("label", printName(o.label)),
        ("arrayindex", printISZ(F, o.arrayindex, printBTSExp _))
      ))
    }

    @pure def printBTSIndexingExp(o: BTSIndexingExp): ST = {
      return printObject(ISZ(
        ("type", st""""BTSIndexingExp""""),
        ("exp", printBTSExp(o.exp)),
        ("indices", printISZ(F, o.indices, printBTSExp _))
      ))
    }

    @pure def printBTSAccessExp(o: BTSAccessExp): ST = {
      return printObject(ISZ(
        ("type", st""""BTSAccessExp""""),
        ("exp", printBTSExp(o.exp)),
        ("attributeName", printString(o.attributeName))
      ))
    }

    @pure def printBTSFunctionCall(o: BTSFunctionCall): ST = {
      return printObject(ISZ(
        ("type", st""""BTSFunctionCall""""),
        ("name", printName(o.name)),
        ("args", printISZ(F, o.args, printBTSFormalActual _))
      ))
    }

    @pure def printBTSPortValue(o: BTSPortValue): ST = {
      return printObject(ISZ(
        ("type", st""""BTSPortValue""""),
        ("port", printName(o.port)),
        ("valuekind", printBTSPortValueKindType(o.valuekind))
      ))
    }

    @pure def printBTSPortValueKindType(o: BTSPortValueKind.Type): ST = {
      val value: String = o match {
        case BTSPortValueKind.Q => "Q"
        case BTSPortValueKind.FRESH => "FRESH"
        case BTSPortValueKind.COUNT => "COUNT"
        case BTSPortValueKind.UPDATED => "UPDATED"
      }
      return printObject(ISZ(
        ("type", printString("BTSPortValueKind")),
        ("value", printString(value))
      ))
    }

    @pure def printBTSConditionalExpression(o: BTSConditionalExpression): ST = {
      return printObject(ISZ(
        ("type", st""""BTSConditionalExpression""""),
        ("guard", printBTSExp(o.guard)),
        ("t", printBTSExp(o.t)),
        ("f", printBTSExp(o.f))
      ))
    }

    @pure def printBTSTrue(o: BTSTrue): ST = {
      return printObject(ISZ(
        ("type", st""""BTSTrue"""")
      ))
    }

    @pure def printBTSFalse(o: BTSFalse): ST = {
      return printObject(ISZ(
        ("type", st""""BTSFalse"""")
      ))
    }

    @pure def printBTSNull(o: BTSNull): ST = {
      return printObject(ISZ(
        ("type", st""""BTSNull"""")
      ))
    }

    @pure def printBTSPropertyConstant(o: BTSPropertyConstant): ST = {
      return printObject(ISZ(
        ("type", st""""BTSPropertyConstant""""),
        ("propertyset", printName(o.propertyset)),
        ("propertyconstant", printName(o.propertyconstant))
      ))
    }

    @pure def printBTSPropertyReference(o: BTSPropertyReference): ST = {
      o match {
      }
    }

    @pure def printBTSPropertySetProperty(o: BTSPropertySetProperty): ST = {
      return printObject(ISZ(
        ("type", st""""BTSPropertySetProperty""""),
        ("propertyset", printOption(F, o.propertyset, printName _)),
        ("propertyconstant", printName(o.propertyconstant)),
        ("field", printISZ(F, o.field, printBTSPropertyField _))
      ))
    }

    @pure def printBTSSelfProperty(o: BTSSelfProperty): ST = {
      return printObject(ISZ(
        ("type", st""""BTSSelfProperty""""),
        ("propertyset", printOption(F, o.propertyset, printName _)),
        ("propertyconstant", printName(o.propertyconstant)),
        ("field", printISZ(F, o.field, printBTSPropertyField _))
      ))
    }

    @pure def printBTSComponentProperty(o: BTSComponentProperty): ST = {
      return printObject(ISZ(
        ("type", st""""BTSComponentProperty""""),
        ("component", printBTSComponent(o.component)),
        ("propertyset", printOption(F, o.propertyset, printName _)),
        ("propertyconstant", printName(o.propertyconstant)),
        ("field", printISZ(F, o.field, printBTSPropertyField _))
      ))
    }

    @pure def printBTSComponent(o: BTSComponent): ST = {
      return printObject(ISZ(
        ("type", st""""BTSComponent""""),
        ("packageids", printISZ(F, o.packageids, printName _)),
        ("component", printName(o.component)),
        ("impl", printOption(F, o.impl, printName _))
      ))
    }

    @pure def printBTSPropertyField(o: BTSPropertyField): ST = {
      return printObject(ISZ(
        ("type", st""""BTSPropertyField""""),
        ("index", printOption(T, o.index, printZ _)),
        ("variable", printOption(F, o.variable, printName _)),
        ("pf", printOption(F, o.pf, printName _)),
        ("upper", printB(o.upper)),
        ("lower", printB(o.lower))
      ))
    }

    @pure def printBTSUniversalQuantification(o: BTSUniversalQuantification): ST = {
      return printObject(ISZ(
        ("type", st""""BTSUniversalQuantification""""),
        ("variables", printISZ(F, o.variables, printBTSVariable _)),
        ("range", printOption(F, o.range, printBTSRange _)),
        ("condition", printOption(F, o.condition, printBTSExp _)),
        ("predicate", printBTSExp(o.predicate))
      ))
    }

    @pure def printBTSExistentialQuantification(o: BTSExistentialQuantification): ST = {
      return printObject(ISZ(
        ("type", st""""BTSExistentialQuantification""""),
        ("variables", printISZ(F, o.variables, printBTSVariable _)),
        ("range", printOption(F, o.range, printBTSRange _)),
        ("condition", printOption(F, o.condition, printBTSExp _)),
        ("predicate", printBTSExp(o.predicate))
      ))
    }

    @pure def printBTSSumQuantification(o: BTSSumQuantification): ST = {
      return printObject(ISZ(
        ("type", st""""BTSSumQuantification""""),
        ("variables", printISZ(F, o.variables, printBTSVariable _)),
        ("range", printOption(F, o.range, printBTSRange _)),
        ("condition", printOption(F, o.condition, printBTSExp _)),
        ("expression", printBTSExp(o.expression))
      ))
    }

    @pure def printBTSProductQuantification(o: BTSProductQuantification): ST = {
      return printObject(ISZ(
        ("type", st""""BTSProductQuantification""""),
        ("variables", printISZ(F, o.variables, printBTSVariable _)),
        ("range", printOption(F, o.range, printBTSRange _)),
        ("condition", printOption(F, o.condition, printBTSExp _)),
        ("expression", printBTSExp(o.expression))
      ))
    }

    @pure def printBTSCountingQuantification(o: BTSCountingQuantification): ST = {
      return printObject(ISZ(
        ("type", st""""BTSCountingQuantification""""),
        ("variables", printISZ(F, o.variables, printBTSVariable _)),
        ("range", printOption(F, o.range, printBTSRange _)),
        ("condition", printOption(F, o.condition, printBTSExp _)),
        ("predicate", printBTSExp(o.predicate))
      ))
    }

    @pure def printBTSRange(o: BTSRange): ST = {
      return printObject(ISZ(
        ("type", st""""BTSRange""""),
        ("lb", printBTSExp(o.lb)),
        ("op", printBTSRangeSymbolType(o.op)),
        ("ub", printBTSExp(o.ub))
      ))
    }

    @pure def printBTSRangeSymbolType(o: BTSRangeSymbol.Type): ST = {
      val value: String = o match {
        case BTSRangeSymbol.DOTDOT => "DOTDOT"
        case BTSRangeSymbol.COMMADOT => "COMMADOT"
        case BTSRangeSymbol.DOTCOMMA => "DOTCOMMA"
        case BTSRangeSymbol.COMMACOMMA => "COMMACOMMA"
      }
      return printObject(ISZ(
        ("type", printString("BTSRangeSymbol")),
        ("value", printString(value))
      ))
    }

    @pure def printBTSTypeLibrary(o: BTSTypeLibrary): ST = {
      return printObject(ISZ(
        ("type", st""""BTSTypeLibrary""""),
        ("typedeclarations", printISZ(F, o.typedeclarations, printBTSTypeDeclatation _))
      ))
    }

    @pure def printBTSTypeDeclatation(o: BTSTypeDeclatation): ST = {
      return printObject(ISZ(
        ("type", st""""BTSTypeDeclatation""""),
        ("name", printName(o.name)),
        ("ty", printBTSType(o.ty))
      ))
    }

    @pure def printBTSType(o: BTSType): ST = {
      o match {
        case o: BTSBooleanType => return printBTSBooleanType(o)
        case o: BTSStringType => return printBTSStringType(o)
        case o: BTSNullType => return printBTSNullType(o)
        case o: BTSClassifier => return printBTSClassifier(o)
        case o: BTSTypeName => return printBTSTypeName(o)
        case o: BTSEnumerationType => return printBTSEnumerationType(o)
        case o: BTSQuantityType => return printBTSQuantityType(o)
        case o: BTSArrayType => return printBTSArrayType(o)
        case o: BTSRecordType => return printBTSRecordType(o)
      }
    }

    @pure def printBTSBooleanType(o: BTSBooleanType): ST = {
      return printObject(ISZ(
        ("type", st""""BTSBooleanType"""")
      ))
    }

    @pure def printBTSStringType(o: BTSStringType): ST = {
      return printObject(ISZ(
        ("type", st""""BTSStringType"""")
      ))
    }

    @pure def printBTSNullType(o: BTSNullType): ST = {
      return printObject(ISZ(
        ("type", st""""BTSNullType"""")
      ))
    }

    @pure def printBTSClassifier(o: BTSClassifier): ST = {
      return printObject(ISZ(
        ("type", st""""BTSClassifier""""),
        ("classifier", printBTSComponent(o.classifier))
      ))
    }

    @pure def printBTSTypeName(o: BTSTypeName): ST = {
      return printObject(ISZ(
        ("type", st""""BTSTypeName""""),
        ("typename", printName(o.typename))
      ))
    }

    @pure def printBTSEnumerationType(o: BTSEnumerationType): ST = {
      return printObject(ISZ(
        ("type", st""""BTSEnumerationType""""),
        ("literals", printISZ(F, o.literals, printName _))
      ))
    }

    @pure def printBTSQuantityType(o: BTSQuantityType): ST = {
      return printObject(ISZ(
        ("type", st""""BTSQuantityType""""),
        ("unit", printOption(F, o.unit, printName _)),
        ("scalar", printB(o.scalar)),
        ("whole", printB(o.whole)),
        ("lb", printOption(T, o.lb, printF64 _)),
        ("ub", printOption(T, o.ub, printF64 _)),
        ("step", printOption(T, o.step, printF64 _)),
        ("representation", printOption(F, o.representation, printBTSPropertyConstant _))
      ))
    }

    @pure def printBTSArrayType(o: BTSArrayType): ST = {
      return printObject(ISZ(
        ("type", st""""BTSArrayType""""),
        ("ranges", printISZ(F, o.ranges, printBTSArrayRange _)),
        ("typ", printBTSType(o.typ))
      ))
    }

    @pure def printBTSArrayRange(o: BTSArrayRange): ST = {
      return printObject(ISZ(
        ("type", st""""BTSArrayRange""""),
        ("lb", printBTSExp(o.lb)),
        ("ub", printOption(F, o.ub, printBTSExp _))
      ))
    }

    @pure def printBTSRecordType(o: BTSRecordType): ST = {
      return printObject(ISZ(
        ("type", st""""BTSRecordType""""),
        ("kind", printBTSRecordKindType(o.kind)),
        ("fields", printISZ(F, o.fields, printBTSRecordField _))
      ))
    }

    @pure def printBTSRecordKindType(o: BTSRecordKind.Type): ST = {
      val value: String = o match {
        case BTSRecordKind.RECORD => "RECORD"
        case BTSRecordKind.VARIANT => "VARIANT"
      }
      return printObject(ISZ(
        ("type", printString("BTSRecordKind")),
        ("value", printString(value))
      ))
    }

    @pure def printBTSRecordField(o: BTSRecordField): ST = {
      return printObject(ISZ(
        ("type", st""""BTSRecordField""""),
        ("label", printName(o.label)),
        ("typ", printBTSType(o.typ))
      ))
    }

    @pure def printBTSUnitLibrary(o: BTSUnitLibrary): ST = {
      return printObject(ISZ(
        ("type", st""""BTSUnitLibrary""""),
        ("unitDeclarations", printISZ(F, o.unitDeclarations, printBTSUnitDeclaration _))
      ))
    }

    @pure def printBTSUnitDeclaration(o: BTSUnitDeclaration): ST = {
      o match {
        case o: BTSRootDeclaration => return printBTSRootDeclaration(o)
        case o: BTSUnitExtension => return printBTSUnitExtension(o)
      }
    }

    @pure def printBTSRootDeclaration(o: BTSRootDeclaration): ST = {
      return printObject(ISZ(
        ("type", st""""BTSRootDeclaration""""),
        ("base", printB(o.base)),
        ("formula", printOption(F, o.formula, printBTSUnitFormula _)),
        ("kindWords", printISZ(F, o.kindWords, printName _)),
        ("unitName", printBTSUnitName(o.unitName)),
        ("factors", printISZ(F, o.factors, printBTSUnitFactor _))
      ))
    }

    @pure def printBTSUnitExtension(o: BTSUnitExtension): ST = {
      return printObject(ISZ(
        ("type", st""""BTSUnitExtension""""),
        ("root", printBTSUnitName(o.root)),
        ("factors", printISZ(F, o.factors, printBTSUnitFactor _))
      ))
    }

    @pure def printBTSUnitName(o: BTSUnitName): ST = {
      return printObject(ISZ(
        ("type", st""""BTSUnitName""""),
        ("longname", printISZ(F, o.longname, printName _)),
        ("name", printName(o.name))
      ))
    }

    @pure def printBTSUnitFormula(o: BTSUnitFormula): ST = {
      return printObject(ISZ(
        ("type", st""""BTSUnitFormula""""),
        ("top", printISZ(F, o.top, printBTSUnitName _)),
        ("bottom", printISZ(F, o.bottom, printBTSUnitName _))
      ))
    }

    @pure def printBTSMulDivType(o: BTSMulDiv.Type): ST = {
      val value: String = o match {
        case BTSMulDiv.DIV => "DIV"
        case BTSMulDiv.MULT => "MULT"
      }
      return printObject(ISZ(
        ("type", printString("BTSMulDiv")),
        ("value", printString(value))
      ))
    }

    @pure def printBTSUnitFactor(o: BTSUnitFactor): ST = {
      return printObject(ISZ(
        ("type", st""""BTSUnitFactor""""),
        ("unit", printBTSUnitName(o.unit)),
        ("op", printBTSMulDivType(o.op)),
        ("factor", printR(o.factor))
      ))
    }

    @pure def printBTSQuantity(o: BTSQuantity): ST = {
      return printObject(ISZ(
        ("type", st""""BTSQuantity""""),
        ("number", printR(o.number)),
        ("unit", printOption(F, o.unit, printName _)),
        ("scalar", printB(o.scalar))
      ))
    }

    @pure def printBTSExceptionLibrary(o: BTSExceptionLibrary): ST = {
      return printObject(ISZ(
        ("type", st""""BTSExceptionLibrary""""),
        ("exc", printISZ(F, o.exc, printBTSExceptionDeclaration _))
      ))
    }

    @pure def printBTSExceptionDeclaration(o: BTSExceptionDeclaration): ST = {
      return printObject(ISZ(
        ("type", st""""BTSExceptionDeclaration""""),
        ("name", printName(o.name)),
        ("description", printString(o.description)),
        ("code", printOption(T, o.code, printZ _))
      ))
    }

    @pure def printTODO(o: TODO): ST = {
      return printObject(ISZ(
        ("type", st""""TODO"""")
      ))
    }

    @pure def printEmv2Annex(o: Emv2Annex): ST = {
      o match {
        case o: ErrorTypeDef => return printErrorTypeDef(o)
        case o: ErrorAliasDef => return printErrorAliasDef(o)
        case o: ErrorTypeSetDef => return printErrorTypeSetDef(o)
        case o: BehaveStateMachine => return printBehaveStateMachine(o)
        case o: ErrorEvent => return printErrorEvent(o)
        case o: ErrorState => return printErrorState(o)
        case o: ErrorTransition => return printErrorTransition(o)
        case o: ConditionTrigger => return printConditionTrigger(o)
        case o: AndCondition => return printAndCondition(o)
        case o: OrCondition => return printOrCondition(o)
        case o: AllCondition => return printAllCondition(o)
        case o: OrMoreCondition => return printOrMoreCondition(o)
        case o: OrLessCondition => return printOrLessCondition(o)
        case o: Emv2Clause => return printEmv2Clause(o)
        case o: Emv2Propagation => return printEmv2Propagation(o)
        case o: Emv2Flow => return printEmv2Flow(o)
        case o: Emv2BehaviorSection => return printEmv2BehaviorSection(o)
        case o: ErrorPropagation => return printErrorPropagation(o)
      }
    }

    @pure def printEmv2Lib(o: Emv2Lib): ST = {
      o match {
        case o: Emv2Library => return printEmv2Library(o)
      }
    }

    @pure def printPropagationDirectionType(o: PropagationDirection.Type): ST = {
      val value: String = o match {
        case PropagationDirection.In => "In"
        case PropagationDirection.Out => "Out"
      }
      return printObject(ISZ(
        ("type", printString("PropagationDirection")),
        ("value", printString(value))
      ))
    }

    @pure def printEmv2ElementRef(o: Emv2ElementRef): ST = {
      return printObject(ISZ(
        ("type", st""""Emv2ElementRef""""),
        ("kind", printEmv2ElementKindType(o.kind)),
        ("name", printName(o.name)),
        ("errorTypes", printISZ(F, o.errorTypes, printName _))
      ))
    }

    @pure def printEmv2ElementKindType(o: Emv2ElementKind.Type): ST = {
      val value: String = o match {
        case Emv2ElementKind.Source => "Source"
        case Emv2ElementKind.Sink => "Sink"
        case Emv2ElementKind.Path => "Path"
        case Emv2ElementKind.Propagation => "Propagation"
        case Emv2ElementKind.State => "State"
        case Emv2ElementKind.Event => "Event"
        case Emv2ElementKind.BehaviorTransition => "BehaviorTransition"
      }
      return printObject(ISZ(
        ("type", printString("Emv2ElementKind")),
        ("value", printString(value))
      ))
    }

    @pure def printEmv2Library(o: Emv2Library): ST = {
      return printObject(ISZ(
        ("type", st""""Emv2Library""""),
        ("name", printName(o.name)),
        ("useTypes", printISZ(T, o.useTypes, printString _)),
        ("errorTypeDef", printISZ(F, o.errorTypeDef, printErrorTypeDef _)),
        ("errorTypeSetDef", printISZ(F, o.errorTypeSetDef, printErrorTypeSetDef _)),
        ("alias", printISZ(F, o.alias, printErrorAliasDef _)),
        ("behaveStateMachine", printISZ(F, o.behaveStateMachine, printBehaveStateMachine _))
      ))
    }

    @pure def printErrorKindType(o: ErrorKind.Type): ST = {
      val value: String = o match {
        case ErrorKind.all => "all"
        case ErrorKind.noerror => "noerror"
      }
      return printObject(ISZ(
        ("type", printString("ErrorKind")),
        ("value", printString(value))
      ))
    }

    @pure def printErrorTypeDef(o: ErrorTypeDef): ST = {
      return printObject(ISZ(
        ("type", st""""ErrorTypeDef""""),
        ("id", printName(o.id)),
        ("extendType", printOption(F, o.extendType, printName _)),
        ("uriFrag", printString(o.uriFrag))
      ))
    }

    @pure def printErrorAliasDef(o: ErrorAliasDef): ST = {
      return printObject(ISZ(
        ("type", st""""ErrorAliasDef""""),
        ("errorType", printName(o.errorType)),
        ("aliseType", printName(o.aliseType))
      ))
    }

    @pure def printErrorTypeSetDef(o: ErrorTypeSetDef): ST = {
      return printObject(ISZ(
        ("type", st""""ErrorTypeSetDef""""),
        ("id", printName(o.id)),
        ("errorTypes", printISZ(F, o.errorTypes, printName _))
      ))
    }

    @pure def printBehaveStateMachine(o: BehaveStateMachine): ST = {
      return printObject(ISZ(
        ("type", st""""BehaveStateMachine""""),
        ("id", printName(o.id)),
        ("events", printISZ(F, o.events, printErrorEvent _)),
        ("states", printISZ(F, o.states, printErrorState _)),
        ("transitions", printISZ(F, o.transitions, printErrorTransition _)),
        ("properties", printISZ(F, o.properties, printProperty _))
      ))
    }

    @pure def printErrorEvent(o: ErrorEvent): ST = {
      return printObject(ISZ(
        ("type", st""""ErrorEvent""""),
        ("id", printName(o.id))
      ))
    }

    @pure def printErrorState(o: ErrorState): ST = {
      return printObject(ISZ(
        ("type", st""""ErrorState""""),
        ("id", printName(o.id)),
        ("isInitial", printB(o.isInitial))
      ))
    }

    @pure def printErrorTransition(o: ErrorTransition): ST = {
      return printObject(ISZ(
        ("type", st""""ErrorTransition""""),
        ("id", printOption(F, o.id, printName _)),
        ("sourceState", printName(o.sourceState)),
        ("condition", printErrorCondition(o.condition)),
        ("targetState", printName(o.targetState))
      ))
    }

    @pure def printErrorCondition(o: ErrorCondition): ST = {
      o match {
        case o: ConditionTrigger => return printConditionTrigger(o)
        case o: AndCondition => return printAndCondition(o)
        case o: OrCondition => return printOrCondition(o)
        case o: AllCondition => return printAllCondition(o)
        case o: OrMoreCondition => return printOrMoreCondition(o)
        case o: OrLessCondition => return printOrLessCondition(o)
      }
    }

    @pure def printConditionTrigger(o: ConditionTrigger): ST = {
      return printObject(ISZ(
        ("type", st""""ConditionTrigger""""),
        ("events", printISZ(F, o.events, printName _)),
        ("propagationPoints", printISZ(F, o.propagationPoints, printEmv2Propagation _))
      ))
    }

    @pure def printAndCondition(o: AndCondition): ST = {
      return printObject(ISZ(
        ("type", st""""AndCondition""""),
        ("op", printISZ(F, o.op, printErrorCondition _))
      ))
    }

    @pure def printOrCondition(o: OrCondition): ST = {
      return printObject(ISZ(
        ("type", st""""OrCondition""""),
        ("op", printISZ(F, o.op, printErrorCondition _))
      ))
    }

    @pure def printAllCondition(o: AllCondition): ST = {
      return printObject(ISZ(
        ("type", st""""AllCondition""""),
        ("op", printISZ(F, o.op, printErrorCondition _))
      ))
    }

    @pure def printOrMoreCondition(o: OrMoreCondition): ST = {
      return printObject(ISZ(
        ("type", st""""OrMoreCondition""""),
        ("number", printZ(o.number)),
        ("conditions", printISZ(F, o.conditions, printErrorCondition _))
      ))
    }

    @pure def printOrLessCondition(o: OrLessCondition): ST = {
      return printObject(ISZ(
        ("type", st""""OrLessCondition""""),
        ("number", printZ(o.number)),
        ("conditions", printISZ(F, o.conditions, printErrorCondition _))
      ))
    }

    @pure def printEmv2Clause(o: Emv2Clause): ST = {
      return printObject(ISZ(
        ("type", st""""Emv2Clause""""),
        ("libraries", printISZ(F, o.libraries, printName _)),
        ("propagations", printISZ(F, o.propagations, printEmv2Propagation _)),
        ("flows", printISZ(F, o.flows, printEmv2Flow _)),
        ("componentBehavior", printOption(F, o.componentBehavior, printEmv2BehaviorSection _)),
        ("properties", printISZ(F, o.properties, printProperty _))
      ))
    }

    @pure def printEmv2Propagation(o: Emv2Propagation): ST = {
      return printObject(ISZ(
        ("type", st""""Emv2Propagation""""),
        ("direction", printPropagationDirectionType(o.direction)),
        ("propagationPoint", printName(o.propagationPoint)),
        ("errorTokens", printISZ(F, o.errorTokens, printName _))
      ))
    }

    @pure def printEmv2Flow(o: Emv2Flow): ST = {
      return printObject(ISZ(
        ("type", st""""Emv2Flow""""),
        ("identifier", printName(o.identifier)),
        ("kind", printFlowKindType(o.kind)),
        ("sourcePropagation", printOption(F, o.sourcePropagation, printEmv2Propagation _)),
        ("sinkPropagation", printOption(F, o.sinkPropagation, printEmv2Propagation _)),
        ("uriFrag", printString(o.uriFrag))
      ))
    }

    @pure def printEmv2BehaviorSection(o: Emv2BehaviorSection): ST = {
      return printObject(ISZ(
        ("type", st""""Emv2BehaviorSection""""),
        ("events", printISZ(F, o.events, printErrorEvent _)),
        ("transitions", printISZ(F, o.transitions, printErrorTransition _)),
        ("propagations", printISZ(F, o.propagations, printErrorPropagation _))
      ))
    }

    @pure def printErrorPropagation(o: ErrorPropagation): ST = {
      return printObject(ISZ(
        ("type", st""""ErrorPropagation""""),
        ("id", printOption(F, o.id, printName _)),
        ("source", printISZ(F, o.source, printName _)),
        ("condition", printOption(F, o.condition, printErrorCondition _)),
        ("target", printISZ(F, o.target, printEmv2Propagation _))
      ))
    }

    @pure def printSmfAnnex(o: SmfAnnex): ST = {
      o match {
        case o: SmfClause => return printSmfClause(o)
        case o: SmfClassification => return printSmfClassification(o)
        case o: SmfDeclass => return printSmfDeclass(o)
        case o: SmfType => return printSmfType(o)
      }
    }

    @pure def printSmfLib(o: SmfLib): ST = {
      o match {
        case o: SmfLibrary => return printSmfLibrary(o)
      }
    }

    @pure def printSmfClause(o: SmfClause): ST = {
      return printObject(ISZ(
        ("type", st""""SmfClause""""),
        ("classification", printISZ(F, o.classification, printSmfClassification _)),
        ("declass", printISZ(F, o.declass, printSmfDeclass _))
      ))
    }

    @pure def printSmfClassification(o: SmfClassification): ST = {
      return printObject(ISZ(
        ("type", st""""SmfClassification""""),
        ("portName", printName(o.portName)),
        ("typeName", printName(o.typeName))
      ))
    }

    @pure def printSmfDeclass(o: SmfDeclass): ST = {
      return printObject(ISZ(
        ("type", st""""SmfDeclass""""),
        ("flowName", printName(o.flowName)),
        ("srcType", printOption(F, o.srcType, printName _)),
        ("snkType", printName(o.snkType))
      ))
    }

    @pure def printSmfLibrary(o: SmfLibrary): ST = {
      return printObject(ISZ(
        ("type", st""""SmfLibrary""""),
        ("types", printISZ(F, o.types, printSmfType _))
      ))
    }

    @pure def printSmfType(o: SmfType): ST = {
      return printObject(ISZ(
        ("type", st""""SmfType""""),
        ("typeName", printName(o.typeName)),
        ("parentType", printISZ(F, o.parentType, printName _))
      ))
    }

  }

  @record class Parser(input: String) {
    val parser: Json.Parser = Json.Parser.create(input)

    def errorOpt: Option[Json.ErrorMsg] = {
      return parser.errorOpt
    }

    def parseAadlInstInfo(): AadlInstInfo = {
      val t = parser.parseObjectTypes(ISZ("Component", "ErrorTypeDef", "FeatureEnd", "FeatureGroup", "FeatureAccess", "Connection", "Emv2Flow", "Flow"))
      t.native match {
        case "Component" => val r = parseComponentT(T); return r
        case "ErrorTypeDef" => val r = parseErrorTypeDefT(T); return r
        case "FeatureEnd" => val r = parseFeatureEndT(T); return r
        case "FeatureGroup" => val r = parseFeatureGroupT(T); return r
        case "FeatureAccess" => val r = parseFeatureAccessT(T); return r
        case "Connection" => val r = parseConnectionT(T); return r
        case "Emv2Flow" => val r = parseEmv2FlowT(T); return r
        case "Flow" => val r = parseFlowT(T); return r
        case _ => val r = parseFlowT(T); return r
      }
    }

    def parseAadl(): Aadl = {
      val r = parseAadlT(F)
      return r
    }

    def parseAadlT(typeParsed: B): Aadl = {
      if (!typeParsed) {
        parser.parseObjectType("Aadl")
      }
      parser.parseObjectKey("components")
      val components = parser.parseISZ(parseComponent _)
      parser.parseObjectNext()
      parser.parseObjectKey("annexLib")
      val annexLib = parser.parseISZ(parseAnnexLib _)
      parser.parseObjectNext()
      parser.parseObjectKey("dataComponents")
      val dataComponents = parser.parseISZ(parseComponent _)
      parser.parseObjectNext()
      return Aadl(components, annexLib, dataComponents)
    }

    def parseName(): Name = {
      val r = parseNameT(F)
      return r
    }

    def parseNameT(typeParsed: B): Name = {
      if (!typeParsed) {
        parser.parseObjectType("Name")
      }
      parser.parseObjectKey("name")
      val name = parser.parseISZ(parser.parseString _)
      parser.parseObjectNext()
      parser.parseObjectKey("pos")
      val pos = parser.parseOption(parser.parsePosition _)
      parser.parseObjectNext()
      return Name(name, pos)
    }

    def parseComponent(): Component = {
      val r = parseComponentT(F)
      return r
    }

    def parseComponentT(typeParsed: B): Component = {
      if (!typeParsed) {
        parser.parseObjectType("Component")
      }
      parser.parseObjectKey("identifier")
      val identifier = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("category")
      val category = parseComponentCategoryType()
      parser.parseObjectNext()
      parser.parseObjectKey("classifier")
      val classifier = parser.parseOption(parseClassifier _)
      parser.parseObjectNext()
      parser.parseObjectKey("features")
      val features = parser.parseISZ(parseFeature _)
      parser.parseObjectNext()
      parser.parseObjectKey("subComponents")
      val subComponents = parser.parseISZ(parseComponent _)
      parser.parseObjectNext()
      parser.parseObjectKey("connections")
      val connections = parser.parseISZ(parseConnection _)
      parser.parseObjectNext()
      parser.parseObjectKey("connectionInstances")
      val connectionInstances = parser.parseISZ(parseConnectionInstance _)
      parser.parseObjectNext()
      parser.parseObjectKey("properties")
      val properties = parser.parseISZ(parseProperty _)
      parser.parseObjectNext()
      parser.parseObjectKey("flows")
      val flows = parser.parseISZ(parseFlow _)
      parser.parseObjectNext()
      parser.parseObjectKey("modes")
      val modes = parser.parseISZ(parseMode _)
      parser.parseObjectNext()
      parser.parseObjectKey("annexes")
      val annexes = parser.parseISZ(parseAnnex _)
      parser.parseObjectNext()
      parser.parseObjectKey("uriFrag")
      val uriFrag = parser.parseString()
      parser.parseObjectNext()
      return Component(identifier, category, classifier, features, subComponents, connections, connectionInstances, properties, flows, modes, annexes, uriFrag)
    }

    def parseClassifier(): Classifier = {
      val r = parseClassifierT(F)
      return r
    }

    def parseClassifierT(typeParsed: B): Classifier = {
      if (!typeParsed) {
        parser.parseObjectType("Classifier")
      }
      parser.parseObjectKey("name")
      val name = parser.parseString()
      parser.parseObjectNext()
      return Classifier(name)
    }

    def parseComponentCategoryType(): ComponentCategory.Type = {
      val r = parseComponentCategoryT(F)
      return r
    }

    def parseComponentCategoryT(typeParsed: B): ComponentCategory.Type = {
      if (!typeParsed) {
        parser.parseObjectType("ComponentCategory")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      ComponentCategory.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for ComponentCategory.")
          return ComponentCategory.byOrdinal(0).get
      }
    }

    def parseFeature(): Feature = {
      val t = parser.parseObjectTypes(ISZ("FeatureEnd", "FeatureGroup", "FeatureAccess"))
      t.native match {
        case "FeatureEnd" => val r = parseFeatureEndT(T); return r
        case "FeatureGroup" => val r = parseFeatureGroupT(T); return r
        case "FeatureAccess" => val r = parseFeatureAccessT(T); return r
        case _ => val r = parseFeatureAccessT(T); return r
      }
    }

    def parseFeatureEnd(): FeatureEnd = {
      val r = parseFeatureEndT(F)
      return r
    }

    def parseFeatureEndT(typeParsed: B): FeatureEnd = {
      if (!typeParsed) {
        parser.parseObjectType("FeatureEnd")
      }
      parser.parseObjectKey("identifier")
      val identifier = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("direction")
      val direction = parseDirectionType()
      parser.parseObjectNext()
      parser.parseObjectKey("category")
      val category = parseFeatureCategoryType()
      parser.parseObjectNext()
      parser.parseObjectKey("classifier")
      val classifier = parser.parseOption(parseClassifier _)
      parser.parseObjectNext()
      parser.parseObjectKey("properties")
      val properties = parser.parseISZ(parseProperty _)
      parser.parseObjectNext()
      parser.parseObjectKey("uriFrag")
      val uriFrag = parser.parseString()
      parser.parseObjectNext()
      return FeatureEnd(identifier, direction, category, classifier, properties, uriFrag)
    }

    def parseFeatureGroup(): FeatureGroup = {
      val r = parseFeatureGroupT(F)
      return r
    }

    def parseFeatureGroupT(typeParsed: B): FeatureGroup = {
      if (!typeParsed) {
        parser.parseObjectType("FeatureGroup")
      }
      parser.parseObjectKey("identifier")
      val identifier = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("features")
      val features = parser.parseISZ(parseFeature _)
      parser.parseObjectNext()
      parser.parseObjectKey("isInverse")
      val isInverse = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("category")
      val category = parseFeatureCategoryType()
      parser.parseObjectNext()
      parser.parseObjectKey("properties")
      val properties = parser.parseISZ(parseProperty _)
      parser.parseObjectNext()
      parser.parseObjectKey("uriFrag")
      val uriFrag = parser.parseString()
      parser.parseObjectNext()
      return FeatureGroup(identifier, features, isInverse, category, properties, uriFrag)
    }

    def parseFeatureAccess(): FeatureAccess = {
      val r = parseFeatureAccessT(F)
      return r
    }

    def parseFeatureAccessT(typeParsed: B): FeatureAccess = {
      if (!typeParsed) {
        parser.parseObjectType("FeatureAccess")
      }
      parser.parseObjectKey("identifier")
      val identifier = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("category")
      val category = parseFeatureCategoryType()
      parser.parseObjectNext()
      parser.parseObjectKey("classifier")
      val classifier = parser.parseOption(parseClassifier _)
      parser.parseObjectNext()
      parser.parseObjectKey("accessType")
      val accessType = parseAccessTypeType()
      parser.parseObjectNext()
      parser.parseObjectKey("accessCategory")
      val accessCategory = parseAccessCategoryType()
      parser.parseObjectNext()
      parser.parseObjectKey("properties")
      val properties = parser.parseISZ(parseProperty _)
      parser.parseObjectNext()
      parser.parseObjectKey("uriFrag")
      val uriFrag = parser.parseString()
      parser.parseObjectNext()
      return FeatureAccess(identifier, category, classifier, accessType, accessCategory, properties, uriFrag)
    }

    def parseAccessTypeType(): AccessType.Type = {
      val r = parseAccessTypeT(F)
      return r
    }

    def parseAccessTypeT(typeParsed: B): AccessType.Type = {
      if (!typeParsed) {
        parser.parseObjectType("AccessType")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      AccessType.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for AccessType.")
          return AccessType.byOrdinal(0).get
      }
    }

    def parseAccessCategoryType(): AccessCategory.Type = {
      val r = parseAccessCategoryT(F)
      return r
    }

    def parseAccessCategoryT(typeParsed: B): AccessCategory.Type = {
      if (!typeParsed) {
        parser.parseObjectType("AccessCategory")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      AccessCategory.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for AccessCategory.")
          return AccessCategory.byOrdinal(0).get
      }
    }

    def parseDirectionType(): Direction.Type = {
      val r = parseDirectionT(F)
      return r
    }

    def parseDirectionT(typeParsed: B): Direction.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Direction")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Direction.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Direction.")
          return Direction.byOrdinal(0).get
      }
    }

    def parseFeatureCategoryType(): FeatureCategory.Type = {
      val r = parseFeatureCategoryT(F)
      return r
    }

    def parseFeatureCategoryT(typeParsed: B): FeatureCategory.Type = {
      if (!typeParsed) {
        parser.parseObjectType("FeatureCategory")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      FeatureCategory.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for FeatureCategory.")
          return FeatureCategory.byOrdinal(0).get
      }
    }

    def parseConnection(): Connection = {
      val r = parseConnectionT(F)
      return r
    }

    def parseConnectionT(typeParsed: B): Connection = {
      if (!typeParsed) {
        parser.parseObjectType("Connection")
      }
      parser.parseObjectKey("name")
      val name = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("src")
      val src = parser.parseISZ(parseEndPoint _)
      parser.parseObjectNext()
      parser.parseObjectKey("dst")
      val dst = parser.parseISZ(parseEndPoint _)
      parser.parseObjectNext()
      parser.parseObjectKey("kind")
      val kind = parseConnectionKindType()
      parser.parseObjectNext()
      parser.parseObjectKey("isBiDirectional")
      val isBiDirectional = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("connectionInstances")
      val connectionInstances = parser.parseISZ(parseName _)
      parser.parseObjectNext()
      parser.parseObjectKey("properties")
      val properties = parser.parseISZ(parseProperty _)
      parser.parseObjectNext()
      parser.parseObjectKey("uriFrag")
      val uriFrag = parser.parseString()
      parser.parseObjectNext()
      return Connection(name, src, dst, kind, isBiDirectional, connectionInstances, properties, uriFrag)
    }

    def parseConnectionInstance(): ConnectionInstance = {
      val r = parseConnectionInstanceT(F)
      return r
    }

    def parseConnectionInstanceT(typeParsed: B): ConnectionInstance = {
      if (!typeParsed) {
        parser.parseObjectType("ConnectionInstance")
      }
      parser.parseObjectKey("name")
      val name = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("src")
      val src = parseEndPoint()
      parser.parseObjectNext()
      parser.parseObjectKey("dst")
      val dst = parseEndPoint()
      parser.parseObjectNext()
      parser.parseObjectKey("kind")
      val kind = parseConnectionKindType()
      parser.parseObjectNext()
      parser.parseObjectKey("connectionRefs")
      val connectionRefs = parser.parseISZ(parseConnectionReference _)
      parser.parseObjectNext()
      parser.parseObjectKey("properties")
      val properties = parser.parseISZ(parseProperty _)
      parser.parseObjectNext()
      return ConnectionInstance(name, src, dst, kind, connectionRefs, properties)
    }

    def parseConnectionReference(): ConnectionReference = {
      val r = parseConnectionReferenceT(F)
      return r
    }

    def parseConnectionReferenceT(typeParsed: B): ConnectionReference = {
      if (!typeParsed) {
        parser.parseObjectType("ConnectionReference")
      }
      parser.parseObjectKey("name")
      val name = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("context")
      val context = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("isParent")
      val isParent = parser.parseB()
      parser.parseObjectNext()
      return ConnectionReference(name, context, isParent)
    }

    def parseConnectionKindType(): ConnectionKind.Type = {
      val r = parseConnectionKindT(F)
      return r
    }

    def parseConnectionKindT(typeParsed: B): ConnectionKind.Type = {
      if (!typeParsed) {
        parser.parseObjectType("ConnectionKind")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      ConnectionKind.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for ConnectionKind.")
          return ConnectionKind.byOrdinal(0).get
      }
    }

    def parseEndPoint(): EndPoint = {
      val r = parseEndPointT(F)
      return r
    }

    def parseEndPointT(typeParsed: B): EndPoint = {
      if (!typeParsed) {
        parser.parseObjectType("EndPoint")
      }
      parser.parseObjectKey("component")
      val component = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("feature")
      val feature = parser.parseOption(parseName _)
      parser.parseObjectNext()
      parser.parseObjectKey("direction")
      val direction = parser.parseOption(parseDirectionType _)
      parser.parseObjectNext()
      return EndPoint(component, feature, direction)
    }

    def parseProperty(): Property = {
      val r = parsePropertyT(F)
      return r
    }

    def parsePropertyT(typeParsed: B): Property = {
      if (!typeParsed) {
        parser.parseObjectType("Property")
      }
      parser.parseObjectKey("name")
      val name = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("propertyValues")
      val propertyValues = parser.parseISZ(parsePropertyValue _)
      parser.parseObjectNext()
      parser.parseObjectKey("appliesTo")
      val appliesTo = parser.parseISZ(parseElementRef _)
      parser.parseObjectNext()
      return Property(name, propertyValues, appliesTo)
    }

    def parseElementRef(): ElementRef = {
      val t = parser.parseObjectTypes(ISZ("Emv2ElementRef", "AadlElementRef"))
      t.native match {
        case "Emv2ElementRef" => val r = parseEmv2ElementRefT(T); return r
        case "AadlElementRef" => val r = parseAadlElementRefT(T); return r
        case _ => val r = parseAadlElementRefT(T); return r
      }
    }

    def parseElementKindType(): ElementKind.Type = {
      val r = parseElementKindT(F)
      return r
    }

    def parseElementKindT(typeParsed: B): ElementKind.Type = {
      if (!typeParsed) {
        parser.parseObjectType("ElementKind")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      ElementKind.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for ElementKind.")
          return ElementKind.byOrdinal(0).get
      }
    }

    def parseAadlElementRef(): AadlElementRef = {
      val r = parseAadlElementRefT(F)
      return r
    }

    def parseAadlElementRefT(typeParsed: B): AadlElementRef = {
      if (!typeParsed) {
        parser.parseObjectType("AadlElementRef")
      }
      parser.parseObjectKey("elementKind")
      val elementKind = parseElementKindType()
      parser.parseObjectNext()
      parser.parseObjectKey("name")
      val name = parseName()
      parser.parseObjectNext()
      return AadlElementRef(elementKind, name)
    }

    def parsePropertyValue(): PropertyValue = {
      val t = parser.parseObjectTypes(ISZ("ClassifierProp", "RangeProp", "RecordProp", "ReferenceProp", "UnitProp", "ValueProp"))
      t.native match {
        case "ClassifierProp" => val r = parseClassifierPropT(T); return r
        case "RangeProp" => val r = parseRangePropT(T); return r
        case "RecordProp" => val r = parseRecordPropT(T); return r
        case "ReferenceProp" => val r = parseReferencePropT(T); return r
        case "UnitProp" => val r = parseUnitPropT(T); return r
        case "ValueProp" => val r = parseValuePropT(T); return r
        case _ => val r = parseValuePropT(T); return r
      }
    }

    def parseClassifierProp(): ClassifierProp = {
      val r = parseClassifierPropT(F)
      return r
    }

    def parseClassifierPropT(typeParsed: B): ClassifierProp = {
      if (!typeParsed) {
        parser.parseObjectType("ClassifierProp")
      }
      parser.parseObjectKey("name")
      val name = parser.parseString()
      parser.parseObjectNext()
      return ClassifierProp(name)
    }

    def parseRangeProp(): RangeProp = {
      val r = parseRangePropT(F)
      return r
    }

    def parseRangePropT(typeParsed: B): RangeProp = {
      if (!typeParsed) {
        parser.parseObjectType("RangeProp")
      }
      parser.parseObjectKey("low")
      val low = parseUnitProp()
      parser.parseObjectNext()
      parser.parseObjectKey("high")
      val high = parseUnitProp()
      parser.parseObjectNext()
      return RangeProp(low, high)
    }

    def parseRecordProp(): RecordProp = {
      val r = parseRecordPropT(F)
      return r
    }

    def parseRecordPropT(typeParsed: B): RecordProp = {
      if (!typeParsed) {
        parser.parseObjectType("RecordProp")
      }
      parser.parseObjectKey("properties")
      val properties = parser.parseISZ(parseProperty _)
      parser.parseObjectNext()
      return RecordProp(properties)
    }

    def parseReferenceProp(): ReferenceProp = {
      val r = parseReferencePropT(F)
      return r
    }

    def parseReferencePropT(typeParsed: B): ReferenceProp = {
      if (!typeParsed) {
        parser.parseObjectType("ReferenceProp")
      }
      parser.parseObjectKey("value")
      val value = parseName()
      parser.parseObjectNext()
      return ReferenceProp(value)
    }

    def parseUnitProp(): UnitProp = {
      val r = parseUnitPropT(F)
      return r
    }

    def parseUnitPropT(typeParsed: B): UnitProp = {
      if (!typeParsed) {
        parser.parseObjectType("UnitProp")
      }
      parser.parseObjectKey("value")
      val value = parser.parseString()
      parser.parseObjectNext()
      parser.parseObjectKey("unit")
      val unit = parser.parseOption(parser.parseString _)
      parser.parseObjectNext()
      return UnitProp(value, unit)
    }

    def parseValueProp(): ValueProp = {
      val r = parseValuePropT(F)
      return r
    }

    def parseValuePropT(typeParsed: B): ValueProp = {
      if (!typeParsed) {
        parser.parseObjectType("ValueProp")
      }
      parser.parseObjectKey("value")
      val value = parser.parseString()
      parser.parseObjectNext()
      return ValueProp(value)
    }

    def parseMode(): Mode = {
      val r = parseModeT(F)
      return r
    }

    def parseModeT(typeParsed: B): Mode = {
      if (!typeParsed) {
        parser.parseObjectType("Mode")
      }
      parser.parseObjectKey("name")
      val name = parseName()
      parser.parseObjectNext()
      return Mode(name)
    }

    def parseFlowKindType(): FlowKind.Type = {
      val r = parseFlowKindT(F)
      return r
    }

    def parseFlowKindT(typeParsed: B): FlowKind.Type = {
      if (!typeParsed) {
        parser.parseObjectType("FlowKind")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      FlowKind.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for FlowKind.")
          return FlowKind.byOrdinal(0).get
      }
    }

    def parseFlow(): Flow = {
      val r = parseFlowT(F)
      return r
    }

    def parseFlowT(typeParsed: B): Flow = {
      if (!typeParsed) {
        parser.parseObjectType("Flow")
      }
      parser.parseObjectKey("name")
      val name = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("kind")
      val kind = parseFlowKindType()
      parser.parseObjectNext()
      parser.parseObjectKey("source")
      val source = parser.parseOption(parseName _)
      parser.parseObjectNext()
      parser.parseObjectKey("sink")
      val sink = parser.parseOption(parseName _)
      parser.parseObjectNext()
      parser.parseObjectKey("uriFrag")
      val uriFrag = parser.parseString()
      parser.parseObjectNext()
      return Flow(name, kind, source, sink, uriFrag)
    }

    def parseAnnex(): Annex = {
      val r = parseAnnexT(F)
      return r
    }

    def parseAnnexT(typeParsed: B): Annex = {
      if (!typeParsed) {
        parser.parseObjectType("Annex")
      }
      parser.parseObjectKey("name")
      val name = parser.parseString()
      parser.parseObjectNext()
      parser.parseObjectKey("clause")
      val clause = parseAnnexClause()
      parser.parseObjectNext()
      return Annex(name, clause)
    }

    def parseAnnexClause(): AnnexClause = {
      val t = parser.parseObjectTypes(ISZ("SmfClause", "SmfClassification", "SmfDeclass", "SmfType", "ErrorTypeDef", "ErrorAliasDef", "ErrorTypeSetDef", "BehaveStateMachine", "ErrorEvent", "ErrorState", "ErrorTransition", "ConditionTrigger", "AndCondition", "OrCondition", "AllCondition", "OrMoreCondition", "OrLessCondition", "Emv2Clause", "Emv2Propagation", "Emv2Flow", "Emv2BehaviorSection", "ErrorPropagation", "OtherAnnex", "BTSBLESSAnnexClause", "BTSActionAnnexSubclause"))
      t.native match {
        case "SmfClause" => val r = parseSmfClauseT(T); return r
        case "SmfClassification" => val r = parseSmfClassificationT(T); return r
        case "SmfDeclass" => val r = parseSmfDeclassT(T); return r
        case "SmfType" => val r = parseSmfTypeT(T); return r
        case "ErrorTypeDef" => val r = parseErrorTypeDefT(T); return r
        case "ErrorAliasDef" => val r = parseErrorAliasDefT(T); return r
        case "ErrorTypeSetDef" => val r = parseErrorTypeSetDefT(T); return r
        case "BehaveStateMachine" => val r = parseBehaveStateMachineT(T); return r
        case "ErrorEvent" => val r = parseErrorEventT(T); return r
        case "ErrorState" => val r = parseErrorStateT(T); return r
        case "ErrorTransition" => val r = parseErrorTransitionT(T); return r
        case "ConditionTrigger" => val r = parseConditionTriggerT(T); return r
        case "AndCondition" => val r = parseAndConditionT(T); return r
        case "OrCondition" => val r = parseOrConditionT(T); return r
        case "AllCondition" => val r = parseAllConditionT(T); return r
        case "OrMoreCondition" => val r = parseOrMoreConditionT(T); return r
        case "OrLessCondition" => val r = parseOrLessConditionT(T); return r
        case "Emv2Clause" => val r = parseEmv2ClauseT(T); return r
        case "Emv2Propagation" => val r = parseEmv2PropagationT(T); return r
        case "Emv2Flow" => val r = parseEmv2FlowT(T); return r
        case "Emv2BehaviorSection" => val r = parseEmv2BehaviorSectionT(T); return r
        case "ErrorPropagation" => val r = parseErrorPropagationT(T); return r
        case "OtherAnnex" => val r = parseOtherAnnexT(T); return r
        case "BTSBLESSAnnexClause" => val r = parseBTSBLESSAnnexClauseT(T); return r
        case "BTSActionAnnexSubclause" => val r = parseBTSActionAnnexSubclauseT(T); return r
        case _ => val r = parseBTSActionAnnexSubclauseT(T); return r
      }
    }

    def parseAnnexLib(): AnnexLib = {
      val t = parser.parseObjectTypes(ISZ("SmfLibrary", "Emv2Library", "OtherLib", "BTSTypeLibrary", "BTSUnitLibrary", "BTSExceptionLibrary"))
      t.native match {
        case "SmfLibrary" => val r = parseSmfLibraryT(T); return r
        case "Emv2Library" => val r = parseEmv2LibraryT(T); return r
        case "OtherLib" => val r = parseOtherLibT(T); return r
        case "BTSTypeLibrary" => val r = parseBTSTypeLibraryT(T); return r
        case "BTSUnitLibrary" => val r = parseBTSUnitLibraryT(T); return r
        case "BTSExceptionLibrary" => val r = parseBTSExceptionLibraryT(T); return r
        case _ => val r = parseBTSExceptionLibraryT(T); return r
      }
    }

    def parseOtherAnnex(): OtherAnnex = {
      val r = parseOtherAnnexT(F)
      return r
    }

    def parseOtherAnnexT(typeParsed: B): OtherAnnex = {
      if (!typeParsed) {
        parser.parseObjectType("OtherAnnex")
      }
      parser.parseObjectKey("clause")
      val clause = parser.parseString()
      parser.parseObjectNext()
      return OtherAnnex(clause)
    }

    def parseOtherLib(): OtherLib = {
      val r = parseOtherLibT(F)
      return r
    }

    def parseOtherLibT(typeParsed: B): OtherLib = {
      if (!typeParsed) {
        parser.parseObjectType("OtherLib")
      }
      parser.parseObjectKey("lib")
      val lib = parser.parseString()
      parser.parseObjectNext()
      return OtherLib(lib)
    }

    def parseBLESSAnnex(): BLESSAnnex = {
      val t = parser.parseObjectTypes(ISZ("BTSBLESSAnnexClause", "BTSActionAnnexSubclause"))
      t.native match {
        case "BTSBLESSAnnexClause" => val r = parseBTSBLESSAnnexClauseT(T); return r
        case "BTSActionAnnexSubclause" => val r = parseBTSActionAnnexSubclauseT(T); return r
        case _ => val r = parseBTSActionAnnexSubclauseT(T); return r
      }
    }

    def parseBTSBLESSAnnexClause(): BTSBLESSAnnexClause = {
      val r = parseBTSBLESSAnnexClauseT(F)
      return r
    }

    def parseBTSBLESSAnnexClauseT(typeParsed: B): BTSBLESSAnnexClause = {
      if (!typeParsed) {
        parser.parseObjectType("BTSBLESSAnnexClause")
      }
      parser.parseObjectKey("doNotProve")
      val doNotProve = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("assertions")
      val assertions = parser.parseISZ(parseBTSAssertion _)
      parser.parseObjectNext()
      parser.parseObjectKey("invariant")
      val invariant = parser.parseOption(parseBTSAssertion _)
      parser.parseObjectNext()
      parser.parseObjectKey("variables")
      val variables = parser.parseISZ(parseBTSVariableDeclaration _)
      parser.parseObjectNext()
      parser.parseObjectKey("states")
      val states = parser.parseISZ(parseBTSStateDeclaration _)
      parser.parseObjectNext()
      parser.parseObjectKey("transitions")
      val transitions = parser.parseISZ(parseBTSTransition _)
      parser.parseObjectNext()
      return BTSBLESSAnnexClause(doNotProve, assertions, invariant, variables, states, transitions)
    }

    def parseBTSVariableDeclaration(): BTSVariableDeclaration = {
      val r = parseBTSVariableDeclarationT(F)
      return r
    }

    def parseBTSVariableDeclarationT(typeParsed: B): BTSVariableDeclaration = {
      if (!typeParsed) {
        parser.parseObjectType("BTSVariableDeclaration")
      }
      parser.parseObjectKey("name")
      val name = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("category")
      val category = parser.parseOption(parseBTSVariableCategoryType _)
      parser.parseObjectNext()
      parser.parseObjectKey("varType")
      val varType = parseBTSType()
      parser.parseObjectNext()
      parser.parseObjectKey("assignExpression")
      val assignExpression = parser.parseOption(parseBTSExp _)
      parser.parseObjectNext()
      parser.parseObjectKey("arraySize")
      val arraySize = parser.parseOption(parseBTSExp _)
      parser.parseObjectNext()
      parser.parseObjectKey("variableAssertion")
      val variableAssertion = parser.parseOption(parseBTSAssertion _)
      parser.parseObjectNext()
      return BTSVariableDeclaration(name, category, varType, assignExpression, arraySize, variableAssertion)
    }

    def parseBTSVariableCategoryType(): BTSVariableCategory.Type = {
      val r = parseBTSVariableCategoryT(F)
      return r
    }

    def parseBTSVariableCategoryT(typeParsed: B): BTSVariableCategory.Type = {
      if (!typeParsed) {
        parser.parseObjectType("BTSVariableCategory")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      BTSVariableCategory.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for BTSVariableCategory.")
          return BTSVariableCategory.byOrdinal(0).get
      }
    }

    def parseBTSStateDeclaration(): BTSStateDeclaration = {
      val r = parseBTSStateDeclarationT(F)
      return r
    }

    def parseBTSStateDeclarationT(typeParsed: B): BTSStateDeclaration = {
      if (!typeParsed) {
        parser.parseObjectType("BTSStateDeclaration")
      }
      parser.parseObjectKey("id")
      val id = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("categories")
      val categories = parser.parseISZ(parseBTSStateCategoryType _)
      parser.parseObjectNext()
      parser.parseObjectKey("assertion")
      val assertion = parser.parseOption(parseBTSAssertion _)
      parser.parseObjectNext()
      return BTSStateDeclaration(id, categories, assertion)
    }

    def parseBTSStateCategoryType(): BTSStateCategory.Type = {
      val r = parseBTSStateCategoryT(F)
      return r
    }

    def parseBTSStateCategoryT(typeParsed: B): BTSStateCategory.Type = {
      if (!typeParsed) {
        parser.parseObjectType("BTSStateCategory")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      BTSStateCategory.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for BTSStateCategory.")
          return BTSStateCategory.byOrdinal(0).get
      }
    }

    def parseBTSTransition(): BTSTransition = {
      val r = parseBTSTransitionT(F)
      return r
    }

    def parseBTSTransitionT(typeParsed: B): BTSTransition = {
      if (!typeParsed) {
        parser.parseObjectType("BTSTransition")
      }
      parser.parseObjectKey("label")
      val label = parseBTSTransitionLabel()
      parser.parseObjectNext()
      parser.parseObjectKey("sourceStates")
      val sourceStates = parser.parseISZ(parseName _)
      parser.parseObjectNext()
      parser.parseObjectKey("destState")
      val destState = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("transitionCondition")
      val transitionCondition = parser.parseOption(parseBTSTransitionCondition _)
      parser.parseObjectNext()
      parser.parseObjectKey("actions")
      val actions = parser.parseOption(parseBTSBehaviorActions _)
      parser.parseObjectNext()
      parser.parseObjectKey("assertion")
      val assertion = parser.parseOption(parseBTSAssertion _)
      parser.parseObjectNext()
      return BTSTransition(label, sourceStates, destState, transitionCondition, actions, assertion)
    }

    def parseBTSTransitionLabel(): BTSTransitionLabel = {
      val r = parseBTSTransitionLabelT(F)
      return r
    }

    def parseBTSTransitionLabelT(typeParsed: B): BTSTransitionLabel = {
      if (!typeParsed) {
        parser.parseObjectType("BTSTransitionLabel")
      }
      parser.parseObjectKey("id")
      val id = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("priority")
      val priority = parser.parseOption(parser.parseZ _)
      parser.parseObjectNext()
      return BTSTransitionLabel(id, priority)
    }

    def parseBTSTransitionCondition(): BTSTransitionCondition = {
      val t = parser.parseObjectTypes(ISZ("BTSDispatchCondition", "BTSExecuteConditionExp", "BTSExecuteConditionTimeout", "BTSExecuteConditionOtherwise", "BTSModeCondition", "BTSInternalCondition"))
      t.native match {
        case "BTSDispatchCondition" => val r = parseBTSDispatchConditionT(T); return r
        case "BTSExecuteConditionExp" => val r = parseBTSExecuteConditionExpT(T); return r
        case "BTSExecuteConditionTimeout" => val r = parseBTSExecuteConditionTimeoutT(T); return r
        case "BTSExecuteConditionOtherwise" => val r = parseBTSExecuteConditionOtherwiseT(T); return r
        case "BTSModeCondition" => val r = parseBTSModeConditionT(T); return r
        case "BTSInternalCondition" => val r = parseBTSInternalConditionT(T); return r
        case _ => val r = parseBTSInternalConditionT(T); return r
      }
    }

    def parseBTSDispatchCondition(): BTSDispatchCondition = {
      val r = parseBTSDispatchConditionT(F)
      return r
    }

    def parseBTSDispatchConditionT(typeParsed: B): BTSDispatchCondition = {
      if (!typeParsed) {
        parser.parseObjectType("BTSDispatchCondition")
      }
      parser.parseObjectKey("conjunctions")
      val conjunctions = parser.parseISZ(parseBTSDispatchConjunction _)
      parser.parseObjectNext()
      parser.parseObjectKey("subprogramaccessdispatch")
      val subprogramaccessdispatch = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("frozenPorts")
      val frozenPorts = parser.parseISZ(parseName _)
      parser.parseObjectNext()
      return BTSDispatchCondition(conjunctions, subprogramaccessdispatch, frozenPorts)
    }

    def parseBTSDispatchConjunction(): BTSDispatchConjunction = {
      val r = parseBTSDispatchConjunctionT(F)
      return r
    }

    def parseBTSDispatchConjunctionT(typeParsed: B): BTSDispatchConjunction = {
      if (!typeParsed) {
        parser.parseObjectType("BTSDispatchConjunction")
      }
      parser.parseObjectKey("triggers")
      val triggers = parser.parseISZ(parseBTSDispatchTrigger _)
      parser.parseObjectNext()
      return BTSDispatchConjunction(triggers)
    }

    def parseBTSDispatchTrigger(): BTSDispatchTrigger = {
      val t = parser.parseObjectTypes(ISZ("BTSDispatchTriggerStop", "BTSDispatchTriggerPort", "BTSDispatchTriggerTimeout"))
      t.native match {
        case "BTSDispatchTriggerStop" => val r = parseBTSDispatchTriggerStopT(T); return r
        case "BTSDispatchTriggerPort" => val r = parseBTSDispatchTriggerPortT(T); return r
        case "BTSDispatchTriggerTimeout" => val r = parseBTSDispatchTriggerTimeoutT(T); return r
        case _ => val r = parseBTSDispatchTriggerTimeoutT(T); return r
      }
    }

    def parseBTSDispatchTriggerStop(): BTSDispatchTriggerStop = {
      val r = parseBTSDispatchTriggerStopT(F)
      return r
    }

    def parseBTSDispatchTriggerStopT(typeParsed: B): BTSDispatchTriggerStop = {
      if (!typeParsed) {
        parser.parseObjectType("BTSDispatchTriggerStop")
      }
      return BTSDispatchTriggerStop()
    }

    def parseBTSDispatchTriggerPort(): BTSDispatchTriggerPort = {
      val r = parseBTSDispatchTriggerPortT(F)
      return r
    }

    def parseBTSDispatchTriggerPortT(typeParsed: B): BTSDispatchTriggerPort = {
      if (!typeParsed) {
        parser.parseObjectType("BTSDispatchTriggerPort")
      }
      parser.parseObjectKey("port")
      val port = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("portarrayindex")
      val portarrayindex = parser.parseOption(parser.parseZ _)
      parser.parseObjectNext()
      return BTSDispatchTriggerPort(port, portarrayindex)
    }

    def parseBTSDispatchTriggerTimeout(): BTSDispatchTriggerTimeout = {
      val r = parseBTSDispatchTriggerTimeoutT(F)
      return r
    }

    def parseBTSDispatchTriggerTimeoutT(typeParsed: B): BTSDispatchTriggerTimeout = {
      if (!typeParsed) {
        parser.parseObjectType("BTSDispatchTriggerTimeout")
      }
      parser.parseObjectKey("ports")
      val ports = parser.parseISZ(parseName _)
      parser.parseObjectNext()
      parser.parseObjectKey("time")
      val time = parser.parseOption(parseBTSExp _)
      parser.parseObjectNext()
      return BTSDispatchTriggerTimeout(ports, time)
    }

    def parseBTSExecuteCondition(): BTSExecuteCondition = {
      val t = parser.parseObjectTypes(ISZ("BTSExecuteConditionExp", "BTSExecuteConditionTimeout", "BTSExecuteConditionOtherwise"))
      t.native match {
        case "BTSExecuteConditionExp" => val r = parseBTSExecuteConditionExpT(T); return r
        case "BTSExecuteConditionTimeout" => val r = parseBTSExecuteConditionTimeoutT(T); return r
        case "BTSExecuteConditionOtherwise" => val r = parseBTSExecuteConditionOtherwiseT(T); return r
        case _ => val r = parseBTSExecuteConditionOtherwiseT(T); return r
      }
    }

    def parseBTSExecuteConditionExp(): BTSExecuteConditionExp = {
      val r = parseBTSExecuteConditionExpT(F)
      return r
    }

    def parseBTSExecuteConditionExpT(typeParsed: B): BTSExecuteConditionExp = {
      if (!typeParsed) {
        parser.parseObjectType("BTSExecuteConditionExp")
      }
      parser.parseObjectKey("exp")
      val exp = parseBTSExp()
      parser.parseObjectNext()
      return BTSExecuteConditionExp(exp)
    }

    def parseBTSExecuteConditionTimeout(): BTSExecuteConditionTimeout = {
      val r = parseBTSExecuteConditionTimeoutT(F)
      return r
    }

    def parseBTSExecuteConditionTimeoutT(typeParsed: B): BTSExecuteConditionTimeout = {
      if (!typeParsed) {
        parser.parseObjectType("BTSExecuteConditionTimeout")
      }
      return BTSExecuteConditionTimeout()
    }

    def parseBTSExecuteConditionOtherwise(): BTSExecuteConditionOtherwise = {
      val r = parseBTSExecuteConditionOtherwiseT(F)
      return r
    }

    def parseBTSExecuteConditionOtherwiseT(typeParsed: B): BTSExecuteConditionOtherwise = {
      if (!typeParsed) {
        parser.parseObjectType("BTSExecuteConditionOtherwise")
      }
      return BTSExecuteConditionOtherwise()
    }

    def parseBTSModeCondition(): BTSModeCondition = {
      val r = parseBTSModeConditionT(F)
      return r
    }

    def parseBTSModeConditionT(typeParsed: B): BTSModeCondition = {
      if (!typeParsed) {
        parser.parseObjectType("BTSModeCondition")
      }
      parser.parseObjectKey("tle")
      val tle = parseBTSTriggerLogicalExpression()
      parser.parseObjectNext()
      return BTSModeCondition(tle)
    }

    def parseBTSTriggerLogicalExpression(): BTSTriggerLogicalExpression = {
      val r = parseBTSTriggerLogicalExpressionT(F)
      return r
    }

    def parseBTSTriggerLogicalExpressionT(typeParsed: B): BTSTriggerLogicalExpression = {
      if (!typeParsed) {
        parser.parseObjectType("BTSTriggerLogicalExpression")
      }
      parser.parseObjectKey("op")
      val op = parseBTSModeOperatorType()
      parser.parseObjectNext()
      parser.parseObjectKey("triggers")
      val triggers = parser.parseISZ(parseBTSEventTrigger _)
      parser.parseObjectNext()
      return BTSTriggerLogicalExpression(op, triggers)
    }

    def parseBTSEventTrigger(): BTSEventTrigger = {
      val t = parser.parseObjectTypes(ISZ("BTSTriggerLogicalExpression", "BTSSubcomponentPort"))
      t.native match {
        case "BTSTriggerLogicalExpression" => val r = parseBTSTriggerLogicalExpressionT(T); return r
        case "BTSSubcomponentPort" => val r = parseBTSSubcomponentPortT(T); return r
        case _ => val r = parseBTSSubcomponentPortT(T); return r
      }
    }

    def parseBTSSubcomponentPort(): BTSSubcomponentPort = {
      val r = parseBTSSubcomponentPortT(F)
      return r
    }

    def parseBTSSubcomponentPortT(typeParsed: B): BTSSubcomponentPort = {
      if (!typeParsed) {
        parser.parseObjectType("BTSSubcomponentPort")
      }
      parser.parseObjectKey("sub")
      val sub = parser.parseISZ(parseName _)
      parser.parseObjectNext()
      parser.parseObjectKey("port")
      val port = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("index")
      val index = parser.parseOption(parser.parseZ _)
      parser.parseObjectNext()
      return BTSSubcomponentPort(sub, port, index)
    }

    def parseBTSModeOperatorType(): BTSModeOperator.Type = {
      val r = parseBTSModeOperatorT(F)
      return r
    }

    def parseBTSModeOperatorT(typeParsed: B): BTSModeOperator.Type = {
      if (!typeParsed) {
        parser.parseObjectType("BTSModeOperator")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      BTSModeOperator.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for BTSModeOperator.")
          return BTSModeOperator.byOrdinal(0).get
      }
    }

    def parseBTSInternalCondition(): BTSInternalCondition = {
      val r = parseBTSInternalConditionT(F)
      return r
    }

    def parseBTSInternalConditionT(typeParsed: B): BTSInternalCondition = {
      if (!typeParsed) {
        parser.parseObjectType("BTSInternalCondition")
      }
      parser.parseObjectKey("internalports")
      val internalports = parser.parseISZ(parseName _)
      parser.parseObjectNext()
      return BTSInternalCondition(internalports)
    }

    def parseBTSAssertion(): BTSAssertion = {
      val t = parser.parseObjectTypes(ISZ("BTSNamedAssertion", "BTSNamedFunction", "BTSNamedEnumeration", "BTSNamelessAssertion", "BTSNamelessFunction", "BTSNamelessEnumeration"))
      t.native match {
        case "BTSNamedAssertion" => val r = parseBTSNamedAssertionT(T); return r
        case "BTSNamedFunction" => val r = parseBTSNamedFunctionT(T); return r
        case "BTSNamedEnumeration" => val r = parseBTSNamedEnumerationT(T); return r
        case "BTSNamelessAssertion" => val r = parseBTSNamelessAssertionT(T); return r
        case "BTSNamelessFunction" => val r = parseBTSNamelessFunctionT(T); return r
        case "BTSNamelessEnumeration" => val r = parseBTSNamelessEnumerationT(T); return r
        case _ => val r = parseBTSNamelessEnumerationT(T); return r
      }
    }

    def parseBTSNamedAssertion(): BTSNamedAssertion = {
      val r = parseBTSNamedAssertionT(F)
      return r
    }

    def parseBTSNamedAssertionT(typeParsed: B): BTSNamedAssertion = {
      if (!typeParsed) {
        parser.parseObjectType("BTSNamedAssertion")
      }
      parser.parseObjectKey("label")
      val label = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("formals")
      val formals = parser.parseISZ(parseBTSVariable _)
      parser.parseObjectNext()
      parser.parseObjectKey("predicate")
      val predicate = parseBTSExp()
      parser.parseObjectNext()
      return BTSNamedAssertion(label, formals, predicate)
    }

    def parseBTSNamedFunction(): BTSNamedFunction = {
      val r = parseBTSNamedFunctionT(F)
      return r
    }

    def parseBTSNamedFunctionT(typeParsed: B): BTSNamedFunction = {
      if (!typeParsed) {
        parser.parseObjectType("BTSNamedFunction")
      }
      parser.parseObjectKey("label")
      val label = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("formals")
      val formals = parser.parseISZ(parseBTSVariable _)
      parser.parseObjectNext()
      parser.parseObjectKey("returns")
      val returns = parseBTSType()
      parser.parseObjectNext()
      parser.parseObjectKey("functionvalue")
      val functionvalue = parseBTSExp()
      parser.parseObjectNext()
      return BTSNamedFunction(label, formals, returns, functionvalue)
    }

    def parseBTSNamedEnumeration(): BTSNamedEnumeration = {
      val r = parseBTSNamedEnumerationT(F)
      return r
    }

    def parseBTSNamedEnumerationT(typeParsed: B): BTSNamedEnumeration = {
      if (!typeParsed) {
        parser.parseObjectType("BTSNamedEnumeration")
      }
      parser.parseObjectKey("label")
      val label = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("assertionvariable")
      val assertionvariable = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("enumerationtype")
      val enumerationtype = parseBTSType()
      parser.parseObjectNext()
      parser.parseObjectKey("enumeration")
      val enumeration = parseBTSAssertionEnumeration()
      parser.parseObjectNext()
      return BTSNamedEnumeration(label, assertionvariable, enumerationtype, enumeration)
    }

    def parseBTSNamelessAssertion(): BTSNamelessAssertion = {
      val r = parseBTSNamelessAssertionT(F)
      return r
    }

    def parseBTSNamelessAssertionT(typeParsed: B): BTSNamelessAssertion = {
      if (!typeParsed) {
        parser.parseObjectType("BTSNamelessAssertion")
      }
      parser.parseObjectKey("predicate")
      val predicate = parseBTSExp()
      parser.parseObjectNext()
      return BTSNamelessAssertion(predicate)
    }

    def parseBTSNamelessFunction(): BTSNamelessFunction = {
      val r = parseBTSNamelessFunctionT(F)
      return r
    }

    def parseBTSNamelessFunctionT(typeParsed: B): BTSNamelessFunction = {
      if (!typeParsed) {
        parser.parseObjectType("BTSNamelessFunction")
      }
      parser.parseObjectKey("returns")
      val returns = parseBTSType()
      parser.parseObjectNext()
      parser.parseObjectKey("functionvalue")
      val functionvalue = parseBTSExp()
      parser.parseObjectNext()
      return BTSNamelessFunction(returns, functionvalue)
    }

    def parseBTSNamelessEnumeration(): BTSNamelessEnumeration = {
      val r = parseBTSNamelessEnumerationT(F)
      return r
    }

    def parseBTSNamelessEnumerationT(typeParsed: B): BTSNamelessEnumeration = {
      if (!typeParsed) {
        parser.parseObjectType("BTSNamelessEnumeration")
      }
      parser.parseObjectKey("enumeration")
      val enumeration = parseBTSInvocation()
      parser.parseObjectNext()
      return BTSNamelessEnumeration(enumeration)
    }

    def parseBTSAssertionEnumeration(): BTSAssertionEnumeration = {
      val t = parser.parseObjectTypes(ISZ("BTSEnumerationPairs", "BTSInvocation"))
      t.native match {
        case "BTSEnumerationPairs" => val r = parseBTSEnumerationPairsT(T); return r
        case "BTSInvocation" => val r = parseBTSInvocationT(T); return r
        case _ => val r = parseBTSInvocationT(T); return r
      }
    }

    def parseBTSEnumerationPairs(): BTSEnumerationPairs = {
      val r = parseBTSEnumerationPairsT(F)
      return r
    }

    def parseBTSEnumerationPairsT(typeParsed: B): BTSEnumerationPairs = {
      if (!typeParsed) {
        parser.parseObjectType("BTSEnumerationPairs")
      }
      parser.parseObjectKey("pairs")
      val pairs = parser.parseISZ(parseBTSEnumerationPair _)
      parser.parseObjectNext()
      return BTSEnumerationPairs(pairs)
    }

    def parseBTSEnumerationPair(): BTSEnumerationPair = {
      val r = parseBTSEnumerationPairT(F)
      return r
    }

    def parseBTSEnumerationPairT(typeParsed: B): BTSEnumerationPair = {
      if (!typeParsed) {
        parser.parseObjectType("BTSEnumerationPair")
      }
      parser.parseObjectKey("literal")
      val literal = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("predicate")
      val predicate = parseBTSExp()
      parser.parseObjectNext()
      return BTSEnumerationPair(literal, predicate)
    }

    def parseBTSInvocation(): BTSInvocation = {
      val r = parseBTSInvocationT(F)
      return r
    }

    def parseBTSInvocationT(typeParsed: B): BTSInvocation = {
      if (!typeParsed) {
        parser.parseObjectType("BTSInvocation")
      }
      parser.parseObjectKey("label")
      val label = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("params")
      val params = parser.parseISZ(parseBTSActualParameter _)
      parser.parseObjectNext()
      parser.parseObjectKey("actual")
      val actual = parser.parseOption(parseBTSExp _)
      parser.parseObjectNext()
      return BTSInvocation(label, params, actual)
    }

    def parseBTSActualParameter(): BTSActualParameter = {
      val r = parseBTSActualParameterT(F)
      return r
    }

    def parseBTSActualParameterT(typeParsed: B): BTSActualParameter = {
      if (!typeParsed) {
        parser.parseObjectType("BTSActualParameter")
      }
      parser.parseObjectKey("formal")
      val formal = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("actual")
      val actual = parseBTSExp()
      parser.parseObjectNext()
      return BTSActualParameter(formal, actual)
    }

    def parseBTSVariable(): BTSVariable = {
      val r = parseBTSVariableT(F)
      return r
    }

    def parseBTSVariableT(typeParsed: B): BTSVariable = {
      if (!typeParsed) {
        parser.parseObjectType("BTSVariable")
      }
      parser.parseObjectKey("name")
      val name = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("typ")
      val typ = parseBTSType()
      parser.parseObjectNext()
      return BTSVariable(name, typ)
    }

    def parseBTSActionAnnexSubclause(): BTSActionAnnexSubclause = {
      val r = parseBTSActionAnnexSubclauseT(F)
      return r
    }

    def parseBTSActionAnnexSubclauseT(typeParsed: B): BTSActionAnnexSubclause = {
      if (!typeParsed) {
        parser.parseObjectType("BTSActionAnnexSubclause")
      }
      parser.parseObjectKey("doNotProve")
      val doNotProve = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("throws")
      val throws = parser.parseISZ(parseName _)
      parser.parseObjectNext()
      parser.parseObjectKey("assertions")
      val assertions = parser.parseISZ(parseBTSAssertion _)
      parser.parseObjectNext()
      parser.parseObjectKey("precondition")
      val precondition = parser.parseOption(parseBTSAssertion _)
      parser.parseObjectNext()
      parser.parseObjectKey("postcondition")
      val postcondition = parser.parseOption(parseBTSAssertion _)
      parser.parseObjectNext()
      parser.parseObjectKey("invariant")
      val invariant = parser.parseOption(parseBTSAssertion _)
      parser.parseObjectNext()
      parser.parseObjectKey("elq")
      val elq = parseBTSExistentialLatticeQuantification()
      parser.parseObjectNext()
      return BTSActionAnnexSubclause(doNotProve, throws, assertions, precondition, postcondition, invariant, elq)
    }

    def parseBTSBehaviorActions(): BTSBehaviorActions = {
      val r = parseBTSBehaviorActionsT(F)
      return r
    }

    def parseBTSBehaviorActionsT(typeParsed: B): BTSBehaviorActions = {
      if (!typeParsed) {
        parser.parseObjectType("BTSBehaviorActions")
      }
      parser.parseObjectKey("executionOrder")
      val executionOrder = parseBTSExecutionOrderType()
      parser.parseObjectNext()
      parser.parseObjectKey("actions")
      val actions = parser.parseISZ(parseBTSAssertedAction _)
      parser.parseObjectNext()
      return BTSBehaviorActions(executionOrder, actions)
    }

    def parseBTSExecutionOrderType(): BTSExecutionOrder.Type = {
      val r = parseBTSExecutionOrderT(F)
      return r
    }

    def parseBTSExecutionOrderT(typeParsed: B): BTSExecutionOrder.Type = {
      if (!typeParsed) {
        parser.parseObjectType("BTSExecutionOrder")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      BTSExecutionOrder.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for BTSExecutionOrder.")
          return BTSExecutionOrder.byOrdinal(0).get
      }
    }

    def parseBTSAssertedAction(): BTSAssertedAction = {
      val r = parseBTSAssertedActionT(F)
      return r
    }

    def parseBTSAssertedActionT(typeParsed: B): BTSAssertedAction = {
      if (!typeParsed) {
        parser.parseObjectType("BTSAssertedAction")
      }
      parser.parseObjectKey("precondition")
      val precondition = parser.parseOption(parseBTSAssertion _)
      parser.parseObjectNext()
      parser.parseObjectKey("action")
      val action = parseBTSAction()
      parser.parseObjectNext()
      parser.parseObjectKey("postcondition")
      val postcondition = parser.parseOption(parseBTSAssertion _)
      parser.parseObjectNext()
      return BTSAssertedAction(precondition, action, postcondition)
    }

    def parseBTSAction(): BTSAction = {
      val t = parser.parseObjectTypes(ISZ("BTSSkipAction", "BTSAssignmentAction", "BTSSetMode", "BTSWhenThrow", "BTSFetchAdd", "BTSFetchOr", "BTSFetchAnd", "BTSFetchXor", "BTSSwap", "BTSSubprogramCallAction", "BTSPortOutput", "BTSPortInput", "BTSFrozenPortAction", "BTSPause", "BTSIfBLESSAction", "BTSIfBAAction", "BTSWhileLoop", "BTSForLoop", "BTSDoUntilLoop", "BTSExistentialLatticeQuantification", "BTSUniversalLatticeQuantification"))
      t.native match {
        case "BTSSkipAction" => val r = parseBTSSkipActionT(T); return r
        case "BTSAssignmentAction" => val r = parseBTSAssignmentActionT(T); return r
        case "BTSSetMode" => val r = parseBTSSetModeT(T); return r
        case "BTSWhenThrow" => val r = parseBTSWhenThrowT(T); return r
        case "BTSFetchAdd" => val r = parseBTSFetchAddT(T); return r
        case "BTSFetchOr" => val r = parseBTSFetchOrT(T); return r
        case "BTSFetchAnd" => val r = parseBTSFetchAndT(T); return r
        case "BTSFetchXor" => val r = parseBTSFetchXorT(T); return r
        case "BTSSwap" => val r = parseBTSSwapT(T); return r
        case "BTSSubprogramCallAction" => val r = parseBTSSubprogramCallActionT(T); return r
        case "BTSPortOutput" => val r = parseBTSPortOutputT(T); return r
        case "BTSPortInput" => val r = parseBTSPortInputT(T); return r
        case "BTSFrozenPortAction" => val r = parseBTSFrozenPortActionT(T); return r
        case "BTSPause" => val r = parseBTSPauseT(T); return r
        case "BTSIfBLESSAction" => val r = parseBTSIfBLESSActionT(T); return r
        case "BTSIfBAAction" => val r = parseBTSIfBAActionT(T); return r
        case "BTSWhileLoop" => val r = parseBTSWhileLoopT(T); return r
        case "BTSForLoop" => val r = parseBTSForLoopT(T); return r
        case "BTSDoUntilLoop" => val r = parseBTSDoUntilLoopT(T); return r
        case "BTSExistentialLatticeQuantification" => val r = parseBTSExistentialLatticeQuantificationT(T); return r
        case "BTSUniversalLatticeQuantification" => val r = parseBTSUniversalLatticeQuantificationT(T); return r
        case _ => val r = parseBTSUniversalLatticeQuantificationT(T); return r
      }
    }

    def parseBTSBasicAction(): BTSBasicAction = {
      val t = parser.parseObjectTypes(ISZ("BTSSkipAction", "BTSAssignmentAction", "BTSSetMode", "BTSWhenThrow", "BTSFetchAdd", "BTSFetchOr", "BTSFetchAnd", "BTSFetchXor", "BTSSwap", "BTSSubprogramCallAction", "BTSPortOutput", "BTSPortInput", "BTSFrozenPortAction", "BTSPause"))
      t.native match {
        case "BTSSkipAction" => val r = parseBTSSkipActionT(T); return r
        case "BTSAssignmentAction" => val r = parseBTSAssignmentActionT(T); return r
        case "BTSSetMode" => val r = parseBTSSetModeT(T); return r
        case "BTSWhenThrow" => val r = parseBTSWhenThrowT(T); return r
        case "BTSFetchAdd" => val r = parseBTSFetchAddT(T); return r
        case "BTSFetchOr" => val r = parseBTSFetchOrT(T); return r
        case "BTSFetchAnd" => val r = parseBTSFetchAndT(T); return r
        case "BTSFetchXor" => val r = parseBTSFetchXorT(T); return r
        case "BTSSwap" => val r = parseBTSSwapT(T); return r
        case "BTSSubprogramCallAction" => val r = parseBTSSubprogramCallActionT(T); return r
        case "BTSPortOutput" => val r = parseBTSPortOutputT(T); return r
        case "BTSPortInput" => val r = parseBTSPortInputT(T); return r
        case "BTSFrozenPortAction" => val r = parseBTSFrozenPortActionT(T); return r
        case "BTSPause" => val r = parseBTSPauseT(T); return r
        case _ => val r = parseBTSPauseT(T); return r
      }
    }

    def parseBTSSkipAction(): BTSSkipAction = {
      val r = parseBTSSkipActionT(F)
      return r
    }

    def parseBTSSkipActionT(typeParsed: B): BTSSkipAction = {
      if (!typeParsed) {
        parser.parseObjectType("BTSSkipAction")
      }
      return BTSSkipAction()
    }

    def parseBTSAssignmentAction(): BTSAssignmentAction = {
      val r = parseBTSAssignmentActionT(F)
      return r
    }

    def parseBTSAssignmentActionT(typeParsed: B): BTSAssignmentAction = {
      if (!typeParsed) {
        parser.parseObjectType("BTSAssignmentAction")
      }
      parser.parseObjectKey("lhs")
      val lhs = parseBTSValueName()
      parser.parseObjectNext()
      parser.parseObjectKey("tick")
      val tick = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("rhs")
      val rhs = parseBTSExp()
      parser.parseObjectNext()
      return BTSAssignmentAction(lhs, tick, rhs)
    }

    def parseBTSSetMode(): BTSSetMode = {
      val r = parseBTSSetModeT(F)
      return r
    }

    def parseBTSSetModeT(typeParsed: B): BTSSetMode = {
      if (!typeParsed) {
        parser.parseObjectType("BTSSetMode")
      }
      parser.parseObjectKey("mode")
      val mode = parseName()
      parser.parseObjectNext()
      return BTSSetMode(mode)
    }

    def parseBTSWhenThrow(): BTSWhenThrow = {
      val r = parseBTSWhenThrowT(F)
      return r
    }

    def parseBTSWhenThrowT(typeParsed: B): BTSWhenThrow = {
      if (!typeParsed) {
        parser.parseObjectType("BTSWhenThrow")
      }
      parser.parseObjectKey("exp")
      val exp = parseBTSExp()
      parser.parseObjectNext()
      parser.parseObjectKey("exception")
      val exception = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("message")
      val message = parser.parseOption(parser.parseString _)
      parser.parseObjectNext()
      return BTSWhenThrow(exp, exception, message)
    }

    def parseBTSCombinableOperation(): BTSCombinableOperation = {
      val t = parser.parseObjectTypes(ISZ("BTSFetchAdd", "BTSFetchOr", "BTSFetchAnd", "BTSFetchXor", "BTSSwap"))
      t.native match {
        case "BTSFetchAdd" => val r = parseBTSFetchAddT(T); return r
        case "BTSFetchOr" => val r = parseBTSFetchOrT(T); return r
        case "BTSFetchAnd" => val r = parseBTSFetchAndT(T); return r
        case "BTSFetchXor" => val r = parseBTSFetchXorT(T); return r
        case "BTSSwap" => val r = parseBTSSwapT(T); return r
        case _ => val r = parseBTSSwapT(T); return r
      }
    }

    def parseBTSFetchAdd(): BTSFetchAdd = {
      val r = parseBTSFetchAddT(F)
      return r
    }

    def parseBTSFetchAddT(typeParsed: B): BTSFetchAdd = {
      if (!typeParsed) {
        parser.parseObjectType("BTSFetchAdd")
      }
      parser.parseObjectKey("target")
      val target = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("arithmetic")
      val arithmetic = parseBTSExp()
      parser.parseObjectNext()
      parser.parseObjectKey("result")
      val result = parseName()
      parser.parseObjectNext()
      return BTSFetchAdd(target, arithmetic, result)
    }

    def parseBTSFetchOr(): BTSFetchOr = {
      val r = parseBTSFetchOrT(F)
      return r
    }

    def parseBTSFetchOrT(typeParsed: B): BTSFetchOr = {
      if (!typeParsed) {
        parser.parseObjectType("BTSFetchOr")
      }
      parser.parseObjectKey("target")
      val target = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("bool")
      val bool = parseBTSExp()
      parser.parseObjectNext()
      parser.parseObjectKey("result")
      val result = parser.parseOption(parseName _)
      parser.parseObjectNext()
      return BTSFetchOr(target, bool, result)
    }

    def parseBTSFetchAnd(): BTSFetchAnd = {
      val r = parseBTSFetchAndT(F)
      return r
    }

    def parseBTSFetchAndT(typeParsed: B): BTSFetchAnd = {
      if (!typeParsed) {
        parser.parseObjectType("BTSFetchAnd")
      }
      parser.parseObjectKey("target")
      val target = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("bool")
      val bool = parseBTSExp()
      parser.parseObjectNext()
      parser.parseObjectKey("result")
      val result = parser.parseOption(parseName _)
      parser.parseObjectNext()
      return BTSFetchAnd(target, bool, result)
    }

    def parseBTSFetchXor(): BTSFetchXor = {
      val r = parseBTSFetchXorT(F)
      return r
    }

    def parseBTSFetchXorT(typeParsed: B): BTSFetchXor = {
      if (!typeParsed) {
        parser.parseObjectType("BTSFetchXor")
      }
      parser.parseObjectKey("target")
      val target = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("bool")
      val bool = parseBTSExp()
      parser.parseObjectNext()
      parser.parseObjectKey("result")
      val result = parser.parseOption(parseName _)
      parser.parseObjectNext()
      return BTSFetchXor(target, bool, result)
    }

    def parseBTSSwap(): BTSSwap = {
      val r = parseBTSSwapT(F)
      return r
    }

    def parseBTSSwapT(typeParsed: B): BTSSwap = {
      if (!typeParsed) {
        parser.parseObjectType("BTSSwap")
      }
      parser.parseObjectKey("target")
      val target = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("reference")
      val reference = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("result")
      val result = parseName()
      parser.parseObjectNext()
      return BTSSwap(target, reference, result)
    }

    def parseBTSCommunicationAction(): BTSCommunicationAction = {
      val t = parser.parseObjectTypes(ISZ("BTSSubprogramCallAction", "BTSPortOutput", "BTSPortInput", "BTSFrozenPortAction", "BTSPause"))
      t.native match {
        case "BTSSubprogramCallAction" => val r = parseBTSSubprogramCallActionT(T); return r
        case "BTSPortOutput" => val r = parseBTSPortOutputT(T); return r
        case "BTSPortInput" => val r = parseBTSPortInputT(T); return r
        case "BTSFrozenPortAction" => val r = parseBTSFrozenPortActionT(T); return r
        case "BTSPause" => val r = parseBTSPauseT(T); return r
        case _ => val r = parseBTSPauseT(T); return r
      }
    }

    def parseBTSSubprogramCallAction(): BTSSubprogramCallAction = {
      val r = parseBTSSubprogramCallActionT(F)
      return r
    }

    def parseBTSSubprogramCallActionT(typeParsed: B): BTSSubprogramCallAction = {
      if (!typeParsed) {
        parser.parseObjectType("BTSSubprogramCallAction")
      }
      parser.parseObjectKey("name")
      val name = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("params")
      val params = parser.parseISZ(parseBTSFormalActual _)
      parser.parseObjectNext()
      return BTSSubprogramCallAction(name, params)
    }

    def parseBTSFormalActual(): BTSFormalActual = {
      val r = parseBTSFormalActualT(F)
      return r
    }

    def parseBTSFormalActualT(typeParsed: B): BTSFormalActual = {
      if (!typeParsed) {
        parser.parseObjectType("BTSFormalActual")
      }
      parser.parseObjectKey("formal")
      val formal = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("actual")
      val actual = parseBTSExp()
      parser.parseObjectNext()
      return BTSFormalActual(formal, actual)
    }

    def parseBTSPortOutput(): BTSPortOutput = {
      val r = parseBTSPortOutputT(F)
      return r
    }

    def parseBTSPortOutputT(typeParsed: B): BTSPortOutput = {
      if (!typeParsed) {
        parser.parseObjectType("BTSPortOutput")
      }
      parser.parseObjectKey("port")
      val port = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("exp")
      val exp = parser.parseOption(parseBTSExp _)
      parser.parseObjectNext()
      return BTSPortOutput(port, exp)
    }

    def parseBTSPortInput(): BTSPortInput = {
      val r = parseBTSPortInputT(F)
      return r
    }

    def parseBTSPortInputT(typeParsed: B): BTSPortInput = {
      if (!typeParsed) {
        parser.parseObjectType("BTSPortInput")
      }
      parser.parseObjectKey("port")
      val port = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("variable")
      val variable = parseBTSValueName()
      parser.parseObjectNext()
      return BTSPortInput(port, variable)
    }

    def parseBTSFrozenPortAction(): BTSFrozenPortAction = {
      val r = parseBTSFrozenPortActionT(F)
      return r
    }

    def parseBTSFrozenPortActionT(typeParsed: B): BTSFrozenPortAction = {
      if (!typeParsed) {
        parser.parseObjectType("BTSFrozenPortAction")
      }
      parser.parseObjectKey("ports")
      val ports = parser.parseISZ(parseName _)
      parser.parseObjectNext()
      return BTSFrozenPortAction(ports)
    }

    def parseBTSPause(): BTSPause = {
      val r = parseBTSPauseT(F)
      return r
    }

    def parseBTSPauseT(typeParsed: B): BTSPause = {
      if (!typeParsed) {
        parser.parseObjectType("BTSPause")
      }
      return BTSPause()
    }

    def parseBTSControlAction(): BTSControlAction = {
      val t = parser.parseObjectTypes(ISZ("BTSIfBLESSAction", "BTSIfBAAction", "BTSWhileLoop", "BTSForLoop", "BTSDoUntilLoop"))
      t.native match {
        case "BTSIfBLESSAction" => val r = parseBTSIfBLESSActionT(T); return r
        case "BTSIfBAAction" => val r = parseBTSIfBAActionT(T); return r
        case "BTSWhileLoop" => val r = parseBTSWhileLoopT(T); return r
        case "BTSForLoop" => val r = parseBTSForLoopT(T); return r
        case "BTSDoUntilLoop" => val r = parseBTSDoUntilLoopT(T); return r
        case _ => val r = parseBTSDoUntilLoopT(T); return r
      }
    }

    def parseBTSIfBLESSAction(): BTSIfBLESSAction = {
      val r = parseBTSIfBLESSActionT(F)
      return r
    }

    def parseBTSIfBLESSActionT(typeParsed: B): BTSIfBLESSAction = {
      if (!typeParsed) {
        parser.parseObjectType("BTSIfBLESSAction")
      }
      parser.parseObjectKey("availability")
      val availability = parser.parseOption(parseTODO _)
      parser.parseObjectNext()
      parser.parseObjectKey("alternatives")
      val alternatives = parser.parseISZ(parseBTSGuardedAction _)
      parser.parseObjectNext()
      return BTSIfBLESSAction(availability, alternatives)
    }

    def parseBTSGuardedAction(): BTSGuardedAction = {
      val r = parseBTSGuardedActionT(F)
      return r
    }

    def parseBTSGuardedActionT(typeParsed: B): BTSGuardedAction = {
      if (!typeParsed) {
        parser.parseObjectType("BTSGuardedAction")
      }
      parser.parseObjectKey("guard")
      val guard = parseBTSExp()
      parser.parseObjectNext()
      parser.parseObjectKey("action")
      val action = parseBTSAssertedAction()
      parser.parseObjectNext()
      return BTSGuardedAction(guard, action)
    }

    def parseBTSIfBAAction(): BTSIfBAAction = {
      val r = parseBTSIfBAActionT(F)
      return r
    }

    def parseBTSIfBAActionT(typeParsed: B): BTSIfBAAction = {
      if (!typeParsed) {
        parser.parseObjectType("BTSIfBAAction")
      }
      parser.parseObjectKey("ifBranch")
      val ifBranch = parseBTSConditionalActions()
      parser.parseObjectNext()
      parser.parseObjectKey("elseIfBranches")
      val elseIfBranches = parser.parseISZ(parseBTSConditionalActions _)
      parser.parseObjectNext()
      parser.parseObjectKey("elseBranch")
      val elseBranch = parser.parseOption(parseBTSBehaviorActions _)
      parser.parseObjectNext()
      return BTSIfBAAction(ifBranch, elseIfBranches, elseBranch)
    }

    def parseBTSConditionalActions(): BTSConditionalActions = {
      val r = parseBTSConditionalActionsT(F)
      return r
    }

    def parseBTSConditionalActionsT(typeParsed: B): BTSConditionalActions = {
      if (!typeParsed) {
        parser.parseObjectType("BTSConditionalActions")
      }
      parser.parseObjectKey("cond")
      val cond = parseBTSExp()
      parser.parseObjectNext()
      parser.parseObjectKey("actions")
      val actions = parseBTSBehaviorActions()
      parser.parseObjectNext()
      return BTSConditionalActions(cond, actions)
    }

    def parseBTSWhileLoop(): BTSWhileLoop = {
      val r = parseBTSWhileLoopT(F)
      return r
    }

    def parseBTSWhileLoopT(typeParsed: B): BTSWhileLoop = {
      if (!typeParsed) {
        parser.parseObjectType("BTSWhileLoop")
      }
      parser.parseObjectKey("test")
      val test = parseBTSExp()
      parser.parseObjectNext()
      parser.parseObjectKey("invariant")
      val invariant = parser.parseOption(parseBTSNamelessAssertion _)
      parser.parseObjectNext()
      parser.parseObjectKey("bound")
      val bound = parser.parseOption(parseBTSExp _)
      parser.parseObjectNext()
      parser.parseObjectKey("elq")
      val elq = parseBTSExistentialLatticeQuantification()
      parser.parseObjectNext()
      return BTSWhileLoop(test, invariant, bound, elq)
    }

    def parseBTSForLoop(): BTSForLoop = {
      val r = parseBTSForLoopT(F)
      return r
    }

    def parseBTSForLoopT(typeParsed: B): BTSForLoop = {
      if (!typeParsed) {
        parser.parseObjectType("BTSForLoop")
      }
      parser.parseObjectKey("count")
      val count = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("lowerbound")
      val lowerbound = parseBTSExp()
      parser.parseObjectNext()
      parser.parseObjectKey("upperbound")
      val upperbound = parseBTSExp()
      parser.parseObjectNext()
      parser.parseObjectKey("invariant")
      val invariant = parser.parseOption(parseBTSNamelessAssertion _)
      parser.parseObjectNext()
      parser.parseObjectKey("actions")
      val actions = parseBTSBehaviorActions()
      parser.parseObjectNext()
      return BTSForLoop(count, lowerbound, upperbound, invariant, actions)
    }

    def parseBTSDoUntilLoop(): BTSDoUntilLoop = {
      val r = parseBTSDoUntilLoopT(F)
      return r
    }

    def parseBTSDoUntilLoopT(typeParsed: B): BTSDoUntilLoop = {
      if (!typeParsed) {
        parser.parseObjectType("BTSDoUntilLoop")
      }
      parser.parseObjectKey("invariant")
      val invariant = parser.parseOption(parseBTSNamelessAssertion _)
      parser.parseObjectNext()
      parser.parseObjectKey("bound")
      val bound = parser.parseOption(parseBTSExp _)
      parser.parseObjectNext()
      parser.parseObjectKey("actions")
      val actions = parseBTSBehaviorActions()
      parser.parseObjectNext()
      parser.parseObjectKey("guard")
      val guard = parseBTSExp()
      parser.parseObjectNext()
      return BTSDoUntilLoop(invariant, bound, actions, guard)
    }

    def parseBTSQuantificationActions(): BTSQuantificationActions = {
      val t = parser.parseObjectTypes(ISZ("BTSExistentialLatticeQuantification", "BTSUniversalLatticeQuantification"))
      t.native match {
        case "BTSExistentialLatticeQuantification" => val r = parseBTSExistentialLatticeQuantificationT(T); return r
        case "BTSUniversalLatticeQuantification" => val r = parseBTSUniversalLatticeQuantificationT(T); return r
        case _ => val r = parseBTSUniversalLatticeQuantificationT(T); return r
      }
    }

    def parseBTSExistentialLatticeQuantification(): BTSExistentialLatticeQuantification = {
      val r = parseBTSExistentialLatticeQuantificationT(F)
      return r
    }

    def parseBTSExistentialLatticeQuantificationT(typeParsed: B): BTSExistentialLatticeQuantification = {
      if (!typeParsed) {
        parser.parseObjectType("BTSExistentialLatticeQuantification")
      }
      parser.parseObjectKey("quantifiedVariables")
      val quantifiedVariables = parser.parseISZ(parseBTSVariableDeclaration _)
      parser.parseObjectNext()
      parser.parseObjectKey("actions")
      val actions = parseBTSBehaviorActions()
      parser.parseObjectNext()
      parser.parseObjectKey("timeout")
      val timeout = parser.parseOption(parseBTSExp _)
      parser.parseObjectNext()
      parser.parseObjectKey("catchClause")
      val catchClause = parser.parseISZ(parseBTSCatchClauseTerm _)
      parser.parseObjectNext()
      return BTSExistentialLatticeQuantification(quantifiedVariables, actions, timeout, catchClause)
    }

    def parseBTSCatchClauseTerm(): BTSCatchClauseTerm = {
      val r = parseBTSCatchClauseTermT(F)
      return r
    }

    def parseBTSCatchClauseTermT(typeParsed: B): BTSCatchClauseTerm = {
      if (!typeParsed) {
        parser.parseObjectType("BTSCatchClauseTerm")
      }
      parser.parseObjectKey("exceptions")
      val exceptions = parser.parseISZ(parseName _)
      parser.parseObjectNext()
      parser.parseObjectKey("all")
      val all = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("action")
      val action = parseBTSBasicAction()
      parser.parseObjectNext()
      return BTSCatchClauseTerm(exceptions, all, action)
    }

    def parseBTSUniversalLatticeQuantification(): BTSUniversalLatticeQuantification = {
      val r = parseBTSUniversalLatticeQuantificationT(F)
      return r
    }

    def parseBTSUniversalLatticeQuantificationT(typeParsed: B): BTSUniversalLatticeQuantification = {
      if (!typeParsed) {
        parser.parseObjectType("BTSUniversalLatticeQuantification")
      }
      parser.parseObjectKey("latticeVariables")
      val latticeVariables = parser.parseISZ(parseName _)
      parser.parseObjectNext()
      parser.parseObjectKey("lowerbound")
      val lowerbound = parseBTSExp()
      parser.parseObjectNext()
      parser.parseObjectKey("upperbound")
      val upperbound = parseBTSExp()
      parser.parseObjectNext()
      parser.parseObjectKey("elq")
      val elq = parseBTSExistentialLatticeQuantification()
      parser.parseObjectNext()
      return BTSUniversalLatticeQuantification(latticeVariables, lowerbound, upperbound, elq)
    }

    def parseBTSExp(): BTSExp = {
      val t = parser.parseObjectTypes(ISZ("BTSUnaryExp", "BTSBinaryExp", "BTSLiteralExp", "BTSVariableNameExp", "BTSIndexingExp", "BTSAccessExp", "BTSFunctionCall", "BTSConditionalExpression", "BTSTrue", "BTSFalse", "BTSNull", "BTSPropertyConstant", "BTSPropertySetProperty", "BTSSelfProperty", "BTSComponentProperty", "BTSUniversalQuantification", "BTSExistentialQuantification", "BTSSumQuantification", "BTSProductQuantification", "BTSCountingQuantification", "BTSRange", "BTSQuantity"))
      t.native match {
        case "BTSUnaryExp" => val r = parseBTSUnaryExpT(T); return r
        case "BTSBinaryExp" => val r = parseBTSBinaryExpT(T); return r
        case "BTSLiteralExp" => val r = parseBTSLiteralExpT(T); return r
        case "BTSVariableNameExp" => val r = parseBTSVariableNameExpT(T); return r
        case "BTSIndexingExp" => val r = parseBTSIndexingExpT(T); return r
        case "BTSAccessExp" => val r = parseBTSAccessExpT(T); return r
        case "BTSFunctionCall" => val r = parseBTSFunctionCallT(T); return r
        case "BTSConditionalExpression" => val r = parseBTSConditionalExpressionT(T); return r
        case "BTSTrue" => val r = parseBTSTrueT(T); return r
        case "BTSFalse" => val r = parseBTSFalseT(T); return r
        case "BTSNull" => val r = parseBTSNullT(T); return r
        case "BTSPropertyConstant" => val r = parseBTSPropertyConstantT(T); return r
        case "BTSPropertySetProperty" => val r = parseBTSPropertySetPropertyT(T); return r
        case "BTSSelfProperty" => val r = parseBTSSelfPropertyT(T); return r
        case "BTSComponentProperty" => val r = parseBTSComponentPropertyT(T); return r
        case "BTSUniversalQuantification" => val r = parseBTSUniversalQuantificationT(T); return r
        case "BTSExistentialQuantification" => val r = parseBTSExistentialQuantificationT(T); return r
        case "BTSSumQuantification" => val r = parseBTSSumQuantificationT(T); return r
        case "BTSProductQuantification" => val r = parseBTSProductQuantificationT(T); return r
        case "BTSCountingQuantification" => val r = parseBTSCountingQuantificationT(T); return r
        case "BTSRange" => val r = parseBTSRangeT(T); return r
        case "BTSQuantity" => val r = parseBTSQuantityT(T); return r
        case _ => val r = parseBTSQuantityT(T); return r
      }
    }

    def parseBTSUnaryExp(): BTSUnaryExp = {
      val r = parseBTSUnaryExpT(F)
      return r
    }

    def parseBTSUnaryExpT(typeParsed: B): BTSUnaryExp = {
      if (!typeParsed) {
        parser.parseObjectType("BTSUnaryExp")
      }
      parser.parseObjectKey("op")
      val op = parseBTSUnaryOpType()
      parser.parseObjectNext()
      parser.parseObjectKey("exp")
      val exp = parseBTSExp()
      parser.parseObjectNext()
      return BTSUnaryExp(op, exp)
    }

    def parseBTSUnaryOpType(): BTSUnaryOp.Type = {
      val r = parseBTSUnaryOpT(F)
      return r
    }

    def parseBTSUnaryOpT(typeParsed: B): BTSUnaryOp.Type = {
      if (!typeParsed) {
        parser.parseObjectType("BTSUnaryOp")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      BTSUnaryOp.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for BTSUnaryOp.")
          return BTSUnaryOp.byOrdinal(0).get
      }
    }

    def parseBTSBinaryExp(): BTSBinaryExp = {
      val r = parseBTSBinaryExpT(F)
      return r
    }

    def parseBTSBinaryExpT(typeParsed: B): BTSBinaryExp = {
      if (!typeParsed) {
        parser.parseObjectType("BTSBinaryExp")
      }
      parser.parseObjectKey("op")
      val op = parseBTSBinaryOpType()
      parser.parseObjectNext()
      parser.parseObjectKey("lhs")
      val lhs = parseBTSExp()
      parser.parseObjectNext()
      parser.parseObjectKey("rhs")
      val rhs = parseBTSExp()
      parser.parseObjectNext()
      return BTSBinaryExp(op, lhs, rhs)
    }

    def parseBTSBinaryOpType(): BTSBinaryOp.Type = {
      val r = parseBTSBinaryOpT(F)
      return r
    }

    def parseBTSBinaryOpT(typeParsed: B): BTSBinaryOp.Type = {
      if (!typeParsed) {
        parser.parseObjectType("BTSBinaryOp")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      BTSBinaryOp.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for BTSBinaryOp.")
          return BTSBinaryOp.byOrdinal(0).get
      }
    }

    def parseBTSLiteralTypeType(): BTSLiteralType.Type = {
      val r = parseBTSLiteralTypeT(F)
      return r
    }

    def parseBTSLiteralTypeT(typeParsed: B): BTSLiteralType.Type = {
      if (!typeParsed) {
        parser.parseObjectType("BTSLiteralType")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      BTSLiteralType.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for BTSLiteralType.")
          return BTSLiteralType.byOrdinal(0).get
      }
    }

    def parseBTSLiteralExp(): BTSLiteralExp = {
      val r = parseBTSLiteralExpT(F)
      return r
    }

    def parseBTSLiteralExpT(typeParsed: B): BTSLiteralExp = {
      if (!typeParsed) {
        parser.parseObjectType("BTSLiteralExp")
      }
      parser.parseObjectKey("typ")
      val typ = parseBTSLiteralTypeType()
      parser.parseObjectNext()
      parser.parseObjectKey("exp")
      val exp = parser.parseString()
      parser.parseObjectNext()
      parser.parseObjectKey("unit")
      val unit = parser.parseOption(parseName _)
      parser.parseObjectNext()
      return BTSLiteralExp(typ, exp, unit)
    }

    def parseBTSValueName(): BTSValueName = {
      val t = parser.parseObjectTypes(ISZ("BTSVariableNameExp", "BTSFunctionCall"))
      t.native match {
        case "BTSVariableNameExp" => val r = parseBTSVariableNameExpT(T); return r
        case "BTSFunctionCall" => val r = parseBTSFunctionCallT(T); return r
        case _ => val r = parseBTSFunctionCallT(T); return r
      }
    }

    def parseBTSVariableNameExp(): BTSVariableNameExp = {
      val r = parseBTSVariableNameExpT(F)
      return r
    }

    def parseBTSVariableNameExpT(typeParsed: B): BTSVariableNameExp = {
      if (!typeParsed) {
        parser.parseObjectType("BTSVariableNameExp")
      }
      parser.parseObjectKey("name")
      val name = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("arrayindex")
      val arrayindex = parser.parseISZ(parseBTSExp _)
      parser.parseObjectNext()
      parser.parseObjectKey("pn")
      val pn = parser.parseISZ(parseBTSPartialName _)
      parser.parseObjectNext()
      return BTSVariableNameExp(name, arrayindex, pn)
    }

    def parseBTSPartialName(): BTSPartialName = {
      val r = parseBTSPartialNameT(F)
      return r
    }

    def parseBTSPartialNameT(typeParsed: B): BTSPartialName = {
      if (!typeParsed) {
        parser.parseObjectType("BTSPartialName")
      }
      parser.parseObjectKey("label")
      val label = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("arrayindex")
      val arrayindex = parser.parseISZ(parseBTSExp _)
      parser.parseObjectNext()
      return BTSPartialName(label, arrayindex)
    }

    def parseBTSIndexingExp(): BTSIndexingExp = {
      val r = parseBTSIndexingExpT(F)
      return r
    }

    def parseBTSIndexingExpT(typeParsed: B): BTSIndexingExp = {
      if (!typeParsed) {
        parser.parseObjectType("BTSIndexingExp")
      }
      parser.parseObjectKey("exp")
      val exp = parseBTSExp()
      parser.parseObjectNext()
      parser.parseObjectKey("indices")
      val indices = parser.parseISZ(parseBTSExp _)
      parser.parseObjectNext()
      return BTSIndexingExp(exp, indices)
    }

    def parseBTSAccessExp(): BTSAccessExp = {
      val r = parseBTSAccessExpT(F)
      return r
    }

    def parseBTSAccessExpT(typeParsed: B): BTSAccessExp = {
      if (!typeParsed) {
        parser.parseObjectType("BTSAccessExp")
      }
      parser.parseObjectKey("exp")
      val exp = parseBTSExp()
      parser.parseObjectNext()
      parser.parseObjectKey("attributeName")
      val attributeName = parser.parseString()
      parser.parseObjectNext()
      return BTSAccessExp(exp, attributeName)
    }

    def parseBTSFunctionCall(): BTSFunctionCall = {
      val r = parseBTSFunctionCallT(F)
      return r
    }

    def parseBTSFunctionCallT(typeParsed: B): BTSFunctionCall = {
      if (!typeParsed) {
        parser.parseObjectType("BTSFunctionCall")
      }
      parser.parseObjectKey("name")
      val name = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("args")
      val args = parser.parseISZ(parseBTSFormalActual _)
      parser.parseObjectNext()
      return BTSFunctionCall(name, args)
    }

    def parseBTSPortValue(): BTSPortValue = {
      val r = parseBTSPortValueT(F)
      return r
    }

    def parseBTSPortValueT(typeParsed: B): BTSPortValue = {
      if (!typeParsed) {
        parser.parseObjectType("BTSPortValue")
      }
      parser.parseObjectKey("port")
      val port = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("valuekind")
      val valuekind = parseBTSPortValueKindType()
      parser.parseObjectNext()
      return BTSPortValue(port, valuekind)
    }

    def parseBTSPortValueKindType(): BTSPortValueKind.Type = {
      val r = parseBTSPortValueKindT(F)
      return r
    }

    def parseBTSPortValueKindT(typeParsed: B): BTSPortValueKind.Type = {
      if (!typeParsed) {
        parser.parseObjectType("BTSPortValueKind")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      BTSPortValueKind.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for BTSPortValueKind.")
          return BTSPortValueKind.byOrdinal(0).get
      }
    }

    def parseBTSConditionalExpression(): BTSConditionalExpression = {
      val r = parseBTSConditionalExpressionT(F)
      return r
    }

    def parseBTSConditionalExpressionT(typeParsed: B): BTSConditionalExpression = {
      if (!typeParsed) {
        parser.parseObjectType("BTSConditionalExpression")
      }
      parser.parseObjectKey("guard")
      val guard = parseBTSExp()
      parser.parseObjectNext()
      parser.parseObjectKey("t")
      val t = parseBTSExp()
      parser.parseObjectNext()
      parser.parseObjectKey("f")
      val f = parseBTSExp()
      parser.parseObjectNext()
      return BTSConditionalExpression(guard, t, f)
    }

    def parseBTSTrue(): BTSTrue = {
      val r = parseBTSTrueT(F)
      return r
    }

    def parseBTSTrueT(typeParsed: B): BTSTrue = {
      if (!typeParsed) {
        parser.parseObjectType("BTSTrue")
      }
      return BTSTrue()
    }

    def parseBTSFalse(): BTSFalse = {
      val r = parseBTSFalseT(F)
      return r
    }

    def parseBTSFalseT(typeParsed: B): BTSFalse = {
      if (!typeParsed) {
        parser.parseObjectType("BTSFalse")
      }
      return BTSFalse()
    }

    def parseBTSNull(): BTSNull = {
      val r = parseBTSNullT(F)
      return r
    }

    def parseBTSNullT(typeParsed: B): BTSNull = {
      if (!typeParsed) {
        parser.parseObjectType("BTSNull")
      }
      return BTSNull()
    }

    def parseBTSPropertyConstant(): BTSPropertyConstant = {
      val r = parseBTSPropertyConstantT(F)
      return r
    }

    def parseBTSPropertyConstantT(typeParsed: B): BTSPropertyConstant = {
      if (!typeParsed) {
        parser.parseObjectType("BTSPropertyConstant")
      }
      parser.parseObjectKey("propertyset")
      val propertyset = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("propertyconstant")
      val propertyconstant = parseName()
      parser.parseObjectNext()
      return BTSPropertyConstant(propertyset, propertyconstant)
    }

    def parseBTSPropertyReference(): BTSPropertyReference = {
      val t = parser.parseObjectTypes(ISZ(""))
      t.native match {
        case _ => val r = parse?T(T); return r
      }
    }

    def parseBTSPropertySetProperty(): BTSPropertySetProperty = {
      val r = parseBTSPropertySetPropertyT(F)
      return r
    }

    def parseBTSPropertySetPropertyT(typeParsed: B): BTSPropertySetProperty = {
      if (!typeParsed) {
        parser.parseObjectType("BTSPropertySetProperty")
      }
      parser.parseObjectKey("propertyset")
      val propertyset = parser.parseOption(parseName _)
      parser.parseObjectNext()
      parser.parseObjectKey("propertyconstant")
      val propertyconstant = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("field")
      val field = parser.parseISZ(parseBTSPropertyField _)
      parser.parseObjectNext()
      return BTSPropertySetProperty(propertyset, propertyconstant, field)
    }

    def parseBTSSelfProperty(): BTSSelfProperty = {
      val r = parseBTSSelfPropertyT(F)
      return r
    }

    def parseBTSSelfPropertyT(typeParsed: B): BTSSelfProperty = {
      if (!typeParsed) {
        parser.parseObjectType("BTSSelfProperty")
      }
      parser.parseObjectKey("propertyset")
      val propertyset = parser.parseOption(parseName _)
      parser.parseObjectNext()
      parser.parseObjectKey("propertyconstant")
      val propertyconstant = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("field")
      val field = parser.parseISZ(parseBTSPropertyField _)
      parser.parseObjectNext()
      return BTSSelfProperty(propertyset, propertyconstant, field)
    }

    def parseBTSComponentProperty(): BTSComponentProperty = {
      val r = parseBTSComponentPropertyT(F)
      return r
    }

    def parseBTSComponentPropertyT(typeParsed: B): BTSComponentProperty = {
      if (!typeParsed) {
        parser.parseObjectType("BTSComponentProperty")
      }
      parser.parseObjectKey("component")
      val component = parseBTSComponent()
      parser.parseObjectNext()
      parser.parseObjectKey("propertyset")
      val propertyset = parser.parseOption(parseName _)
      parser.parseObjectNext()
      parser.parseObjectKey("propertyconstant")
      val propertyconstant = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("field")
      val field = parser.parseISZ(parseBTSPropertyField _)
      parser.parseObjectNext()
      return BTSComponentProperty(component, propertyset, propertyconstant, field)
    }

    def parseBTSComponent(): BTSComponent = {
      val r = parseBTSComponentT(F)
      return r
    }

    def parseBTSComponentT(typeParsed: B): BTSComponent = {
      if (!typeParsed) {
        parser.parseObjectType("BTSComponent")
      }
      parser.parseObjectKey("packageids")
      val packageids = parser.parseISZ(parseName _)
      parser.parseObjectNext()
      parser.parseObjectKey("component")
      val component = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("impl")
      val impl = parser.parseOption(parseName _)
      parser.parseObjectNext()
      return BTSComponent(packageids, component, impl)
    }

    def parseBTSPropertyField(): BTSPropertyField = {
      val r = parseBTSPropertyFieldT(F)
      return r
    }

    def parseBTSPropertyFieldT(typeParsed: B): BTSPropertyField = {
      if (!typeParsed) {
        parser.parseObjectType("BTSPropertyField")
      }
      parser.parseObjectKey("index")
      val index = parser.parseOption(parser.parseZ _)
      parser.parseObjectNext()
      parser.parseObjectKey("variable")
      val variable = parser.parseOption(parseName _)
      parser.parseObjectNext()
      parser.parseObjectKey("pf")
      val pf = parser.parseOption(parseName _)
      parser.parseObjectNext()
      parser.parseObjectKey("upper")
      val upper = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("lower")
      val lower = parser.parseB()
      parser.parseObjectNext()
      return BTSPropertyField(index, variable, pf, upper, lower)
    }

    def parseBTSUniversalQuantification(): BTSUniversalQuantification = {
      val r = parseBTSUniversalQuantificationT(F)
      return r
    }

    def parseBTSUniversalQuantificationT(typeParsed: B): BTSUniversalQuantification = {
      if (!typeParsed) {
        parser.parseObjectType("BTSUniversalQuantification")
      }
      parser.parseObjectKey("variables")
      val variables = parser.parseISZ(parseBTSVariable _)
      parser.parseObjectNext()
      parser.parseObjectKey("range")
      val range = parser.parseOption(parseBTSRange _)
      parser.parseObjectNext()
      parser.parseObjectKey("condition")
      val condition = parser.parseOption(parseBTSExp _)
      parser.parseObjectNext()
      parser.parseObjectKey("predicate")
      val predicate = parseBTSExp()
      parser.parseObjectNext()
      return BTSUniversalQuantification(variables, range, condition, predicate)
    }

    def parseBTSExistentialQuantification(): BTSExistentialQuantification = {
      val r = parseBTSExistentialQuantificationT(F)
      return r
    }

    def parseBTSExistentialQuantificationT(typeParsed: B): BTSExistentialQuantification = {
      if (!typeParsed) {
        parser.parseObjectType("BTSExistentialQuantification")
      }
      parser.parseObjectKey("variables")
      val variables = parser.parseISZ(parseBTSVariable _)
      parser.parseObjectNext()
      parser.parseObjectKey("range")
      val range = parser.parseOption(parseBTSRange _)
      parser.parseObjectNext()
      parser.parseObjectKey("condition")
      val condition = parser.parseOption(parseBTSExp _)
      parser.parseObjectNext()
      parser.parseObjectKey("predicate")
      val predicate = parseBTSExp()
      parser.parseObjectNext()
      return BTSExistentialQuantification(variables, range, condition, predicate)
    }

    def parseBTSSumQuantification(): BTSSumQuantification = {
      val r = parseBTSSumQuantificationT(F)
      return r
    }

    def parseBTSSumQuantificationT(typeParsed: B): BTSSumQuantification = {
      if (!typeParsed) {
        parser.parseObjectType("BTSSumQuantification")
      }
      parser.parseObjectKey("variables")
      val variables = parser.parseISZ(parseBTSVariable _)
      parser.parseObjectNext()
      parser.parseObjectKey("range")
      val range = parser.parseOption(parseBTSRange _)
      parser.parseObjectNext()
      parser.parseObjectKey("condition")
      val condition = parser.parseOption(parseBTSExp _)
      parser.parseObjectNext()
      parser.parseObjectKey("expression")
      val expression = parseBTSExp()
      parser.parseObjectNext()
      return BTSSumQuantification(variables, range, condition, expression)
    }

    def parseBTSProductQuantification(): BTSProductQuantification = {
      val r = parseBTSProductQuantificationT(F)
      return r
    }

    def parseBTSProductQuantificationT(typeParsed: B): BTSProductQuantification = {
      if (!typeParsed) {
        parser.parseObjectType("BTSProductQuantification")
      }
      parser.parseObjectKey("variables")
      val variables = parser.parseISZ(parseBTSVariable _)
      parser.parseObjectNext()
      parser.parseObjectKey("range")
      val range = parser.parseOption(parseBTSRange _)
      parser.parseObjectNext()
      parser.parseObjectKey("condition")
      val condition = parser.parseOption(parseBTSExp _)
      parser.parseObjectNext()
      parser.parseObjectKey("expression")
      val expression = parseBTSExp()
      parser.parseObjectNext()
      return BTSProductQuantification(variables, range, condition, expression)
    }

    def parseBTSCountingQuantification(): BTSCountingQuantification = {
      val r = parseBTSCountingQuantificationT(F)
      return r
    }

    def parseBTSCountingQuantificationT(typeParsed: B): BTSCountingQuantification = {
      if (!typeParsed) {
        parser.parseObjectType("BTSCountingQuantification")
      }
      parser.parseObjectKey("variables")
      val variables = parser.parseISZ(parseBTSVariable _)
      parser.parseObjectNext()
      parser.parseObjectKey("range")
      val range = parser.parseOption(parseBTSRange _)
      parser.parseObjectNext()
      parser.parseObjectKey("condition")
      val condition = parser.parseOption(parseBTSExp _)
      parser.parseObjectNext()
      parser.parseObjectKey("predicate")
      val predicate = parseBTSExp()
      parser.parseObjectNext()
      return BTSCountingQuantification(variables, range, condition, predicate)
    }

    def parseBTSRange(): BTSRange = {
      val r = parseBTSRangeT(F)
      return r
    }

    def parseBTSRangeT(typeParsed: B): BTSRange = {
      if (!typeParsed) {
        parser.parseObjectType("BTSRange")
      }
      parser.parseObjectKey("lb")
      val lb = parseBTSExp()
      parser.parseObjectNext()
      parser.parseObjectKey("op")
      val op = parseBTSRangeSymbolType()
      parser.parseObjectNext()
      parser.parseObjectKey("ub")
      val ub = parseBTSExp()
      parser.parseObjectNext()
      return BTSRange(lb, op, ub)
    }

    def parseBTSRangeSymbolType(): BTSRangeSymbol.Type = {
      val r = parseBTSRangeSymbolT(F)
      return r
    }

    def parseBTSRangeSymbolT(typeParsed: B): BTSRangeSymbol.Type = {
      if (!typeParsed) {
        parser.parseObjectType("BTSRangeSymbol")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      BTSRangeSymbol.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for BTSRangeSymbol.")
          return BTSRangeSymbol.byOrdinal(0).get
      }
    }

    def parseBTSTypeLibrary(): BTSTypeLibrary = {
      val r = parseBTSTypeLibraryT(F)
      return r
    }

    def parseBTSTypeLibraryT(typeParsed: B): BTSTypeLibrary = {
      if (!typeParsed) {
        parser.parseObjectType("BTSTypeLibrary")
      }
      parser.parseObjectKey("typedeclarations")
      val typedeclarations = parser.parseISZ(parseBTSTypeDeclatation _)
      parser.parseObjectNext()
      return BTSTypeLibrary(typedeclarations)
    }

    def parseBTSTypeDeclatation(): BTSTypeDeclatation = {
      val r = parseBTSTypeDeclatationT(F)
      return r
    }

    def parseBTSTypeDeclatationT(typeParsed: B): BTSTypeDeclatation = {
      if (!typeParsed) {
        parser.parseObjectType("BTSTypeDeclatation")
      }
      parser.parseObjectKey("name")
      val name = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("ty")
      val ty = parseBTSType()
      parser.parseObjectNext()
      return BTSTypeDeclatation(name, ty)
    }

    def parseBTSType(): BTSType = {
      val t = parser.parseObjectTypes(ISZ("BTSBooleanType", "BTSStringType", "BTSNullType", "BTSClassifier", "BTSTypeName", "BTSEnumerationType", "BTSQuantityType", "BTSArrayType", "BTSRecordType"))
      t.native match {
        case "BTSBooleanType" => val r = parseBTSBooleanTypeT(T); return r
        case "BTSStringType" => val r = parseBTSStringTypeT(T); return r
        case "BTSNullType" => val r = parseBTSNullTypeT(T); return r
        case "BTSClassifier" => val r = parseBTSClassifierT(T); return r
        case "BTSTypeName" => val r = parseBTSTypeNameT(T); return r
        case "BTSEnumerationType" => val r = parseBTSEnumerationTypeT(T); return r
        case "BTSQuantityType" => val r = parseBTSQuantityTypeT(T); return r
        case "BTSArrayType" => val r = parseBTSArrayTypeT(T); return r
        case "BTSRecordType" => val r = parseBTSRecordTypeT(T); return r
        case _ => val r = parseBTSRecordTypeT(T); return r
      }
    }

    def parseBTSBooleanType(): BTSBooleanType = {
      val r = parseBTSBooleanTypeT(F)
      return r
    }

    def parseBTSBooleanTypeT(typeParsed: B): BTSBooleanType = {
      if (!typeParsed) {
        parser.parseObjectType("BTSBooleanType")
      }
      return BTSBooleanType()
    }

    def parseBTSStringType(): BTSStringType = {
      val r = parseBTSStringTypeT(F)
      return r
    }

    def parseBTSStringTypeT(typeParsed: B): BTSStringType = {
      if (!typeParsed) {
        parser.parseObjectType("BTSStringType")
      }
      return BTSStringType()
    }

    def parseBTSNullType(): BTSNullType = {
      val r = parseBTSNullTypeT(F)
      return r
    }

    def parseBTSNullTypeT(typeParsed: B): BTSNullType = {
      if (!typeParsed) {
        parser.parseObjectType("BTSNullType")
      }
      return BTSNullType()
    }

    def parseBTSClassifier(): BTSClassifier = {
      val r = parseBTSClassifierT(F)
      return r
    }

    def parseBTSClassifierT(typeParsed: B): BTSClassifier = {
      if (!typeParsed) {
        parser.parseObjectType("BTSClassifier")
      }
      parser.parseObjectKey("classifier")
      val classifier = parseBTSComponent()
      parser.parseObjectNext()
      return BTSClassifier(classifier)
    }

    def parseBTSTypeName(): BTSTypeName = {
      val r = parseBTSTypeNameT(F)
      return r
    }

    def parseBTSTypeNameT(typeParsed: B): BTSTypeName = {
      if (!typeParsed) {
        parser.parseObjectType("BTSTypeName")
      }
      parser.parseObjectKey("typename")
      val typename = parseName()
      parser.parseObjectNext()
      return BTSTypeName(typename)
    }

    def parseBTSEnumerationType(): BTSEnumerationType = {
      val r = parseBTSEnumerationTypeT(F)
      return r
    }

    def parseBTSEnumerationTypeT(typeParsed: B): BTSEnumerationType = {
      if (!typeParsed) {
        parser.parseObjectType("BTSEnumerationType")
      }
      parser.parseObjectKey("literals")
      val literals = parser.parseISZ(parseName _)
      parser.parseObjectNext()
      return BTSEnumerationType(literals)
    }

    def parseBTSQuantityType(): BTSQuantityType = {
      val r = parseBTSQuantityTypeT(F)
      return r
    }

    def parseBTSQuantityTypeT(typeParsed: B): BTSQuantityType = {
      if (!typeParsed) {
        parser.parseObjectType("BTSQuantityType")
      }
      parser.parseObjectKey("unit")
      val unit = parser.parseOption(parseName _)
      parser.parseObjectNext()
      parser.parseObjectKey("scalar")
      val scalar = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("whole")
      val whole = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("lb")
      val lb = parser.parseOption(parser.parseF64 _)
      parser.parseObjectNext()
      parser.parseObjectKey("ub")
      val ub = parser.parseOption(parser.parseF64 _)
      parser.parseObjectNext()
      parser.parseObjectKey("step")
      val step = parser.parseOption(parser.parseF64 _)
      parser.parseObjectNext()
      parser.parseObjectKey("representation")
      val representation = parser.parseOption(parseBTSPropertyConstant _)
      parser.parseObjectNext()
      return BTSQuantityType(unit, scalar, whole, lb, ub, step, representation)
    }

    def parseBTSArrayType(): BTSArrayType = {
      val r = parseBTSArrayTypeT(F)
      return r
    }

    def parseBTSArrayTypeT(typeParsed: B): BTSArrayType = {
      if (!typeParsed) {
        parser.parseObjectType("BTSArrayType")
      }
      parser.parseObjectKey("ranges")
      val ranges = parser.parseISZ(parseBTSArrayRange _)
      parser.parseObjectNext()
      parser.parseObjectKey("typ")
      val typ = parseBTSType()
      parser.parseObjectNext()
      return BTSArrayType(ranges, typ)
    }

    def parseBTSArrayRange(): BTSArrayRange = {
      val r = parseBTSArrayRangeT(F)
      return r
    }

    def parseBTSArrayRangeT(typeParsed: B): BTSArrayRange = {
      if (!typeParsed) {
        parser.parseObjectType("BTSArrayRange")
      }
      parser.parseObjectKey("lb")
      val lb = parseBTSExp()
      parser.parseObjectNext()
      parser.parseObjectKey("ub")
      val ub = parser.parseOption(parseBTSExp _)
      parser.parseObjectNext()
      return BTSArrayRange(lb, ub)
    }

    def parseBTSRecordType(): BTSRecordType = {
      val r = parseBTSRecordTypeT(F)
      return r
    }

    def parseBTSRecordTypeT(typeParsed: B): BTSRecordType = {
      if (!typeParsed) {
        parser.parseObjectType("BTSRecordType")
      }
      parser.parseObjectKey("kind")
      val kind = parseBTSRecordKindType()
      parser.parseObjectNext()
      parser.parseObjectKey("fields")
      val fields = parser.parseISZ(parseBTSRecordField _)
      parser.parseObjectNext()
      return BTSRecordType(kind, fields)
    }

    def parseBTSRecordKindType(): BTSRecordKind.Type = {
      val r = parseBTSRecordKindT(F)
      return r
    }

    def parseBTSRecordKindT(typeParsed: B): BTSRecordKind.Type = {
      if (!typeParsed) {
        parser.parseObjectType("BTSRecordKind")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      BTSRecordKind.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for BTSRecordKind.")
          return BTSRecordKind.byOrdinal(0).get
      }
    }

    def parseBTSRecordField(): BTSRecordField = {
      val r = parseBTSRecordFieldT(F)
      return r
    }

    def parseBTSRecordFieldT(typeParsed: B): BTSRecordField = {
      if (!typeParsed) {
        parser.parseObjectType("BTSRecordField")
      }
      parser.parseObjectKey("label")
      val label = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("typ")
      val typ = parseBTSType()
      parser.parseObjectNext()
      return BTSRecordField(label, typ)
    }

    def parseBTSUnitLibrary(): BTSUnitLibrary = {
      val r = parseBTSUnitLibraryT(F)
      return r
    }

    def parseBTSUnitLibraryT(typeParsed: B): BTSUnitLibrary = {
      if (!typeParsed) {
        parser.parseObjectType("BTSUnitLibrary")
      }
      parser.parseObjectKey("unitDeclarations")
      val unitDeclarations = parser.parseISZ(parseBTSUnitDeclaration _)
      parser.parseObjectNext()
      return BTSUnitLibrary(unitDeclarations)
    }

    def parseBTSUnitDeclaration(): BTSUnitDeclaration = {
      val t = parser.parseObjectTypes(ISZ("BTSRootDeclaration", "BTSUnitExtension"))
      t.native match {
        case "BTSRootDeclaration" => val r = parseBTSRootDeclarationT(T); return r
        case "BTSUnitExtension" => val r = parseBTSUnitExtensionT(T); return r
        case _ => val r = parseBTSUnitExtensionT(T); return r
      }
    }

    def parseBTSRootDeclaration(): BTSRootDeclaration = {
      val r = parseBTSRootDeclarationT(F)
      return r
    }

    def parseBTSRootDeclarationT(typeParsed: B): BTSRootDeclaration = {
      if (!typeParsed) {
        parser.parseObjectType("BTSRootDeclaration")
      }
      parser.parseObjectKey("base")
      val base = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("formula")
      val formula = parser.parseOption(parseBTSUnitFormula _)
      parser.parseObjectNext()
      parser.parseObjectKey("kindWords")
      val kindWords = parser.parseISZ(parseName _)
      parser.parseObjectNext()
      parser.parseObjectKey("unitName")
      val unitName = parseBTSUnitName()
      parser.parseObjectNext()
      parser.parseObjectKey("factors")
      val factors = parser.parseISZ(parseBTSUnitFactor _)
      parser.parseObjectNext()
      return BTSRootDeclaration(base, formula, kindWords, unitName, factors)
    }

    def parseBTSUnitExtension(): BTSUnitExtension = {
      val r = parseBTSUnitExtensionT(F)
      return r
    }

    def parseBTSUnitExtensionT(typeParsed: B): BTSUnitExtension = {
      if (!typeParsed) {
        parser.parseObjectType("BTSUnitExtension")
      }
      parser.parseObjectKey("root")
      val root = parseBTSUnitName()
      parser.parseObjectNext()
      parser.parseObjectKey("factors")
      val factors = parser.parseISZ(parseBTSUnitFactor _)
      parser.parseObjectNext()
      return BTSUnitExtension(root, factors)
    }

    def parseBTSUnitName(): BTSUnitName = {
      val r = parseBTSUnitNameT(F)
      return r
    }

    def parseBTSUnitNameT(typeParsed: B): BTSUnitName = {
      if (!typeParsed) {
        parser.parseObjectType("BTSUnitName")
      }
      parser.parseObjectKey("longname")
      val longname = parser.parseISZ(parseName _)
      parser.parseObjectNext()
      parser.parseObjectKey("name")
      val name = parseName()
      parser.parseObjectNext()
      return BTSUnitName(longname, name)
    }

    def parseBTSUnitFormula(): BTSUnitFormula = {
      val r = parseBTSUnitFormulaT(F)
      return r
    }

    def parseBTSUnitFormulaT(typeParsed: B): BTSUnitFormula = {
      if (!typeParsed) {
        parser.parseObjectType("BTSUnitFormula")
      }
      parser.parseObjectKey("top")
      val top = parser.parseISZ(parseBTSUnitName _)
      parser.parseObjectNext()
      parser.parseObjectKey("bottom")
      val bottom = parser.parseISZ(parseBTSUnitName _)
      parser.parseObjectNext()
      return BTSUnitFormula(top, bottom)
    }

    def parseBTSMulDivType(): BTSMulDiv.Type = {
      val r = parseBTSMulDivT(F)
      return r
    }

    def parseBTSMulDivT(typeParsed: B): BTSMulDiv.Type = {
      if (!typeParsed) {
        parser.parseObjectType("BTSMulDiv")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      BTSMulDiv.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for BTSMulDiv.")
          return BTSMulDiv.byOrdinal(0).get
      }
    }

    def parseBTSUnitFactor(): BTSUnitFactor = {
      val r = parseBTSUnitFactorT(F)
      return r
    }

    def parseBTSUnitFactorT(typeParsed: B): BTSUnitFactor = {
      if (!typeParsed) {
        parser.parseObjectType("BTSUnitFactor")
      }
      parser.parseObjectKey("unit")
      val unit = parseBTSUnitName()
      parser.parseObjectNext()
      parser.parseObjectKey("op")
      val op = parseBTSMulDivType()
      parser.parseObjectNext()
      parser.parseObjectKey("factor")
      val factor = parser.parseR()
      parser.parseObjectNext()
      return BTSUnitFactor(unit, op, factor)
    }

    def parseBTSQuantity(): BTSQuantity = {
      val r = parseBTSQuantityT(F)
      return r
    }

    def parseBTSQuantityT(typeParsed: B): BTSQuantity = {
      if (!typeParsed) {
        parser.parseObjectType("BTSQuantity")
      }
      parser.parseObjectKey("number")
      val number = parser.parseR()
      parser.parseObjectNext()
      parser.parseObjectKey("unit")
      val unit = parser.parseOption(parseName _)
      parser.parseObjectNext()
      parser.parseObjectKey("scalar")
      val scalar = parser.parseB()
      parser.parseObjectNext()
      return BTSQuantity(number, unit, scalar)
    }

    def parseBTSExceptionLibrary(): BTSExceptionLibrary = {
      val r = parseBTSExceptionLibraryT(F)
      return r
    }

    def parseBTSExceptionLibraryT(typeParsed: B): BTSExceptionLibrary = {
      if (!typeParsed) {
        parser.parseObjectType("BTSExceptionLibrary")
      }
      parser.parseObjectKey("exc")
      val exc = parser.parseISZ(parseBTSExceptionDeclaration _)
      parser.parseObjectNext()
      return BTSExceptionLibrary(exc)
    }

    def parseBTSExceptionDeclaration(): BTSExceptionDeclaration = {
      val r = parseBTSExceptionDeclarationT(F)
      return r
    }

    def parseBTSExceptionDeclarationT(typeParsed: B): BTSExceptionDeclaration = {
      if (!typeParsed) {
        parser.parseObjectType("BTSExceptionDeclaration")
      }
      parser.parseObjectKey("name")
      val name = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("description")
      val description = parser.parseString()
      parser.parseObjectNext()
      parser.parseObjectKey("code")
      val code = parser.parseOption(parser.parseZ _)
      parser.parseObjectNext()
      return BTSExceptionDeclaration(name, description, code)
    }

    def parseTODO(): TODO = {
      val r = parseTODOT(F)
      return r
    }

    def parseTODOT(typeParsed: B): TODO = {
      if (!typeParsed) {
        parser.parseObjectType("TODO")
      }
      return TODO()
    }

    def parseEmv2Annex(): Emv2Annex = {
      val t = parser.parseObjectTypes(ISZ("ErrorTypeDef", "ErrorAliasDef", "ErrorTypeSetDef", "BehaveStateMachine", "ErrorEvent", "ErrorState", "ErrorTransition", "ConditionTrigger", "AndCondition", "OrCondition", "AllCondition", "OrMoreCondition", "OrLessCondition", "Emv2Clause", "Emv2Propagation", "Emv2Flow", "Emv2BehaviorSection", "ErrorPropagation"))
      t.native match {
        case "ErrorTypeDef" => val r = parseErrorTypeDefT(T); return r
        case "ErrorAliasDef" => val r = parseErrorAliasDefT(T); return r
        case "ErrorTypeSetDef" => val r = parseErrorTypeSetDefT(T); return r
        case "BehaveStateMachine" => val r = parseBehaveStateMachineT(T); return r
        case "ErrorEvent" => val r = parseErrorEventT(T); return r
        case "ErrorState" => val r = parseErrorStateT(T); return r
        case "ErrorTransition" => val r = parseErrorTransitionT(T); return r
        case "ConditionTrigger" => val r = parseConditionTriggerT(T); return r
        case "AndCondition" => val r = parseAndConditionT(T); return r
        case "OrCondition" => val r = parseOrConditionT(T); return r
        case "AllCondition" => val r = parseAllConditionT(T); return r
        case "OrMoreCondition" => val r = parseOrMoreConditionT(T); return r
        case "OrLessCondition" => val r = parseOrLessConditionT(T); return r
        case "Emv2Clause" => val r = parseEmv2ClauseT(T); return r
        case "Emv2Propagation" => val r = parseEmv2PropagationT(T); return r
        case "Emv2Flow" => val r = parseEmv2FlowT(T); return r
        case "Emv2BehaviorSection" => val r = parseEmv2BehaviorSectionT(T); return r
        case "ErrorPropagation" => val r = parseErrorPropagationT(T); return r
        case _ => val r = parseErrorPropagationT(T); return r
      }
    }

    def parseEmv2Lib(): Emv2Lib = {
      val t = parser.parseObjectTypes(ISZ("Emv2Library"))
      t.native match {
        case "Emv2Library" => val r = parseEmv2LibraryT(T); return r
        case _ => val r = parseEmv2LibraryT(T); return r
      }
    }

    def parsePropagationDirectionType(): PropagationDirection.Type = {
      val r = parsePropagationDirectionT(F)
      return r
    }

    def parsePropagationDirectionT(typeParsed: B): PropagationDirection.Type = {
      if (!typeParsed) {
        parser.parseObjectType("PropagationDirection")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      PropagationDirection.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for PropagationDirection.")
          return PropagationDirection.byOrdinal(0).get
      }
    }

    def parseEmv2ElementRef(): Emv2ElementRef = {
      val r = parseEmv2ElementRefT(F)
      return r
    }

    def parseEmv2ElementRefT(typeParsed: B): Emv2ElementRef = {
      if (!typeParsed) {
        parser.parseObjectType("Emv2ElementRef")
      }
      parser.parseObjectKey("kind")
      val kind = parseEmv2ElementKindType()
      parser.parseObjectNext()
      parser.parseObjectKey("name")
      val name = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("errorTypes")
      val errorTypes = parser.parseISZ(parseName _)
      parser.parseObjectNext()
      return Emv2ElementRef(kind, name, errorTypes)
    }

    def parseEmv2ElementKindType(): Emv2ElementKind.Type = {
      val r = parseEmv2ElementKindT(F)
      return r
    }

    def parseEmv2ElementKindT(typeParsed: B): Emv2ElementKind.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Emv2ElementKind")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Emv2ElementKind.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Emv2ElementKind.")
          return Emv2ElementKind.byOrdinal(0).get
      }
    }

    def parseEmv2Library(): Emv2Library = {
      val r = parseEmv2LibraryT(F)
      return r
    }

    def parseEmv2LibraryT(typeParsed: B): Emv2Library = {
      if (!typeParsed) {
        parser.parseObjectType("Emv2Library")
      }
      parser.parseObjectKey("name")
      val name = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("useTypes")
      val useTypes = parser.parseISZ(parser.parseString _)
      parser.parseObjectNext()
      parser.parseObjectKey("errorTypeDef")
      val errorTypeDef = parser.parseISZ(parseErrorTypeDef _)
      parser.parseObjectNext()
      parser.parseObjectKey("errorTypeSetDef")
      val errorTypeSetDef = parser.parseISZ(parseErrorTypeSetDef _)
      parser.parseObjectNext()
      parser.parseObjectKey("alias")
      val alias = parser.parseISZ(parseErrorAliasDef _)
      parser.parseObjectNext()
      parser.parseObjectKey("behaveStateMachine")
      val behaveStateMachine = parser.parseISZ(parseBehaveStateMachine _)
      parser.parseObjectNext()
      return Emv2Library(name, useTypes, errorTypeDef, errorTypeSetDef, alias, behaveStateMachine)
    }

    def parseErrorKindType(): ErrorKind.Type = {
      val r = parseErrorKindT(F)
      return r
    }

    def parseErrorKindT(typeParsed: B): ErrorKind.Type = {
      if (!typeParsed) {
        parser.parseObjectType("ErrorKind")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      ErrorKind.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for ErrorKind.")
          return ErrorKind.byOrdinal(0).get
      }
    }

    def parseErrorTypeDef(): ErrorTypeDef = {
      val r = parseErrorTypeDefT(F)
      return r
    }

    def parseErrorTypeDefT(typeParsed: B): ErrorTypeDef = {
      if (!typeParsed) {
        parser.parseObjectType("ErrorTypeDef")
      }
      parser.parseObjectKey("id")
      val id = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("extendType")
      val extendType = parser.parseOption(parseName _)
      parser.parseObjectNext()
      parser.parseObjectKey("uriFrag")
      val uriFrag = parser.parseString()
      parser.parseObjectNext()
      return ErrorTypeDef(id, extendType, uriFrag)
    }

    def parseErrorAliasDef(): ErrorAliasDef = {
      val r = parseErrorAliasDefT(F)
      return r
    }

    def parseErrorAliasDefT(typeParsed: B): ErrorAliasDef = {
      if (!typeParsed) {
        parser.parseObjectType("ErrorAliasDef")
      }
      parser.parseObjectKey("errorType")
      val errorType = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("aliseType")
      val aliseType = parseName()
      parser.parseObjectNext()
      return ErrorAliasDef(errorType, aliseType)
    }

    def parseErrorTypeSetDef(): ErrorTypeSetDef = {
      val r = parseErrorTypeSetDefT(F)
      return r
    }

    def parseErrorTypeSetDefT(typeParsed: B): ErrorTypeSetDef = {
      if (!typeParsed) {
        parser.parseObjectType("ErrorTypeSetDef")
      }
      parser.parseObjectKey("id")
      val id = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("errorTypes")
      val errorTypes = parser.parseISZ(parseName _)
      parser.parseObjectNext()
      return ErrorTypeSetDef(id, errorTypes)
    }

    def parseBehaveStateMachine(): BehaveStateMachine = {
      val r = parseBehaveStateMachineT(F)
      return r
    }

    def parseBehaveStateMachineT(typeParsed: B): BehaveStateMachine = {
      if (!typeParsed) {
        parser.parseObjectType("BehaveStateMachine")
      }
      parser.parseObjectKey("id")
      val id = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("events")
      val events = parser.parseISZ(parseErrorEvent _)
      parser.parseObjectNext()
      parser.parseObjectKey("states")
      val states = parser.parseISZ(parseErrorState _)
      parser.parseObjectNext()
      parser.parseObjectKey("transitions")
      val transitions = parser.parseISZ(parseErrorTransition _)
      parser.parseObjectNext()
      parser.parseObjectKey("properties")
      val properties = parser.parseISZ(parseProperty _)
      parser.parseObjectNext()
      return BehaveStateMachine(id, events, states, transitions, properties)
    }

    def parseErrorEvent(): ErrorEvent = {
      val r = parseErrorEventT(F)
      return r
    }

    def parseErrorEventT(typeParsed: B): ErrorEvent = {
      if (!typeParsed) {
        parser.parseObjectType("ErrorEvent")
      }
      parser.parseObjectKey("id")
      val id = parseName()
      parser.parseObjectNext()
      return ErrorEvent(id)
    }

    def parseErrorState(): ErrorState = {
      val r = parseErrorStateT(F)
      return r
    }

    def parseErrorStateT(typeParsed: B): ErrorState = {
      if (!typeParsed) {
        parser.parseObjectType("ErrorState")
      }
      parser.parseObjectKey("id")
      val id = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("isInitial")
      val isInitial = parser.parseB()
      parser.parseObjectNext()
      return ErrorState(id, isInitial)
    }

    def parseErrorTransition(): ErrorTransition = {
      val r = parseErrorTransitionT(F)
      return r
    }

    def parseErrorTransitionT(typeParsed: B): ErrorTransition = {
      if (!typeParsed) {
        parser.parseObjectType("ErrorTransition")
      }
      parser.parseObjectKey("id")
      val id = parser.parseOption(parseName _)
      parser.parseObjectNext()
      parser.parseObjectKey("sourceState")
      val sourceState = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("condition")
      val condition = parseErrorCondition()
      parser.parseObjectNext()
      parser.parseObjectKey("targetState")
      val targetState = parseName()
      parser.parseObjectNext()
      return ErrorTransition(id, sourceState, condition, targetState)
    }

    def parseErrorCondition(): ErrorCondition = {
      val t = parser.parseObjectTypes(ISZ("ConditionTrigger", "AndCondition", "OrCondition", "AllCondition", "OrMoreCondition", "OrLessCondition"))
      t.native match {
        case "ConditionTrigger" => val r = parseConditionTriggerT(T); return r
        case "AndCondition" => val r = parseAndConditionT(T); return r
        case "OrCondition" => val r = parseOrConditionT(T); return r
        case "AllCondition" => val r = parseAllConditionT(T); return r
        case "OrMoreCondition" => val r = parseOrMoreConditionT(T); return r
        case "OrLessCondition" => val r = parseOrLessConditionT(T); return r
        case _ => val r = parseOrLessConditionT(T); return r
      }
    }

    def parseConditionTrigger(): ConditionTrigger = {
      val r = parseConditionTriggerT(F)
      return r
    }

    def parseConditionTriggerT(typeParsed: B): ConditionTrigger = {
      if (!typeParsed) {
        parser.parseObjectType("ConditionTrigger")
      }
      parser.parseObjectKey("events")
      val events = parser.parseISZ(parseName _)
      parser.parseObjectNext()
      parser.parseObjectKey("propagationPoints")
      val propagationPoints = parser.parseISZ(parseEmv2Propagation _)
      parser.parseObjectNext()
      return ConditionTrigger(events, propagationPoints)
    }

    def parseAndCondition(): AndCondition = {
      val r = parseAndConditionT(F)
      return r
    }

    def parseAndConditionT(typeParsed: B): AndCondition = {
      if (!typeParsed) {
        parser.parseObjectType("AndCondition")
      }
      parser.parseObjectKey("op")
      val op = parser.parseISZ(parseErrorCondition _)
      parser.parseObjectNext()
      return AndCondition(op)
    }

    def parseOrCondition(): OrCondition = {
      val r = parseOrConditionT(F)
      return r
    }

    def parseOrConditionT(typeParsed: B): OrCondition = {
      if (!typeParsed) {
        parser.parseObjectType("OrCondition")
      }
      parser.parseObjectKey("op")
      val op = parser.parseISZ(parseErrorCondition _)
      parser.parseObjectNext()
      return OrCondition(op)
    }

    def parseAllCondition(): AllCondition = {
      val r = parseAllConditionT(F)
      return r
    }

    def parseAllConditionT(typeParsed: B): AllCondition = {
      if (!typeParsed) {
        parser.parseObjectType("AllCondition")
      }
      parser.parseObjectKey("op")
      val op = parser.parseISZ(parseErrorCondition _)
      parser.parseObjectNext()
      return AllCondition(op)
    }

    def parseOrMoreCondition(): OrMoreCondition = {
      val r = parseOrMoreConditionT(F)
      return r
    }

    def parseOrMoreConditionT(typeParsed: B): OrMoreCondition = {
      if (!typeParsed) {
        parser.parseObjectType("OrMoreCondition")
      }
      parser.parseObjectKey("number")
      val number = parser.parseZ()
      parser.parseObjectNext()
      parser.parseObjectKey("conditions")
      val conditions = parser.parseISZ(parseErrorCondition _)
      parser.parseObjectNext()
      return OrMoreCondition(number, conditions)
    }

    def parseOrLessCondition(): OrLessCondition = {
      val r = parseOrLessConditionT(F)
      return r
    }

    def parseOrLessConditionT(typeParsed: B): OrLessCondition = {
      if (!typeParsed) {
        parser.parseObjectType("OrLessCondition")
      }
      parser.parseObjectKey("number")
      val number = parser.parseZ()
      parser.parseObjectNext()
      parser.parseObjectKey("conditions")
      val conditions = parser.parseISZ(parseErrorCondition _)
      parser.parseObjectNext()
      return OrLessCondition(number, conditions)
    }

    def parseEmv2Clause(): Emv2Clause = {
      val r = parseEmv2ClauseT(F)
      return r
    }

    def parseEmv2ClauseT(typeParsed: B): Emv2Clause = {
      if (!typeParsed) {
        parser.parseObjectType("Emv2Clause")
      }
      parser.parseObjectKey("libraries")
      val libraries = parser.parseISZ(parseName _)
      parser.parseObjectNext()
      parser.parseObjectKey("propagations")
      val propagations = parser.parseISZ(parseEmv2Propagation _)
      parser.parseObjectNext()
      parser.parseObjectKey("flows")
      val flows = parser.parseISZ(parseEmv2Flow _)
      parser.parseObjectNext()
      parser.parseObjectKey("componentBehavior")
      val componentBehavior = parser.parseOption(parseEmv2BehaviorSection _)
      parser.parseObjectNext()
      parser.parseObjectKey("properties")
      val properties = parser.parseISZ(parseProperty _)
      parser.parseObjectNext()
      return Emv2Clause(libraries, propagations, flows, componentBehavior, properties)
    }

    def parseEmv2Propagation(): Emv2Propagation = {
      val r = parseEmv2PropagationT(F)
      return r
    }

    def parseEmv2PropagationT(typeParsed: B): Emv2Propagation = {
      if (!typeParsed) {
        parser.parseObjectType("Emv2Propagation")
      }
      parser.parseObjectKey("direction")
      val direction = parsePropagationDirectionType()
      parser.parseObjectNext()
      parser.parseObjectKey("propagationPoint")
      val propagationPoint = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("errorTokens")
      val errorTokens = parser.parseISZ(parseName _)
      parser.parseObjectNext()
      return Emv2Propagation(direction, propagationPoint, errorTokens)
    }

    def parseEmv2Flow(): Emv2Flow = {
      val r = parseEmv2FlowT(F)
      return r
    }

    def parseEmv2FlowT(typeParsed: B): Emv2Flow = {
      if (!typeParsed) {
        parser.parseObjectType("Emv2Flow")
      }
      parser.parseObjectKey("identifier")
      val identifier = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("kind")
      val kind = parseFlowKindType()
      parser.parseObjectNext()
      parser.parseObjectKey("sourcePropagation")
      val sourcePropagation = parser.parseOption(parseEmv2Propagation _)
      parser.parseObjectNext()
      parser.parseObjectKey("sinkPropagation")
      val sinkPropagation = parser.parseOption(parseEmv2Propagation _)
      parser.parseObjectNext()
      parser.parseObjectKey("uriFrag")
      val uriFrag = parser.parseString()
      parser.parseObjectNext()
      return Emv2Flow(identifier, kind, sourcePropagation, sinkPropagation, uriFrag)
    }

    def parseEmv2BehaviorSection(): Emv2BehaviorSection = {
      val r = parseEmv2BehaviorSectionT(F)
      return r
    }

    def parseEmv2BehaviorSectionT(typeParsed: B): Emv2BehaviorSection = {
      if (!typeParsed) {
        parser.parseObjectType("Emv2BehaviorSection")
      }
      parser.parseObjectKey("events")
      val events = parser.parseISZ(parseErrorEvent _)
      parser.parseObjectNext()
      parser.parseObjectKey("transitions")
      val transitions = parser.parseISZ(parseErrorTransition _)
      parser.parseObjectNext()
      parser.parseObjectKey("propagations")
      val propagations = parser.parseISZ(parseErrorPropagation _)
      parser.parseObjectNext()
      return Emv2BehaviorSection(events, transitions, propagations)
    }

    def parseErrorPropagation(): ErrorPropagation = {
      val r = parseErrorPropagationT(F)
      return r
    }

    def parseErrorPropagationT(typeParsed: B): ErrorPropagation = {
      if (!typeParsed) {
        parser.parseObjectType("ErrorPropagation")
      }
      parser.parseObjectKey("id")
      val id = parser.parseOption(parseName _)
      parser.parseObjectNext()
      parser.parseObjectKey("source")
      val source = parser.parseISZ(parseName _)
      parser.parseObjectNext()
      parser.parseObjectKey("condition")
      val condition = parser.parseOption(parseErrorCondition _)
      parser.parseObjectNext()
      parser.parseObjectKey("target")
      val target = parser.parseISZ(parseEmv2Propagation _)
      parser.parseObjectNext()
      return ErrorPropagation(id, source, condition, target)
    }

    def parseSmfAnnex(): SmfAnnex = {
      val t = parser.parseObjectTypes(ISZ("SmfClause", "SmfClassification", "SmfDeclass", "SmfType"))
      t.native match {
        case "SmfClause" => val r = parseSmfClauseT(T); return r
        case "SmfClassification" => val r = parseSmfClassificationT(T); return r
        case "SmfDeclass" => val r = parseSmfDeclassT(T); return r
        case "SmfType" => val r = parseSmfTypeT(T); return r
        case _ => val r = parseSmfTypeT(T); return r
      }
    }

    def parseSmfLib(): SmfLib = {
      val t = parser.parseObjectTypes(ISZ("SmfLibrary"))
      t.native match {
        case "SmfLibrary" => val r = parseSmfLibraryT(T); return r
        case _ => val r = parseSmfLibraryT(T); return r
      }
    }

    def parseSmfClause(): SmfClause = {
      val r = parseSmfClauseT(F)
      return r
    }

    def parseSmfClauseT(typeParsed: B): SmfClause = {
      if (!typeParsed) {
        parser.parseObjectType("SmfClause")
      }
      parser.parseObjectKey("classification")
      val classification = parser.parseISZ(parseSmfClassification _)
      parser.parseObjectNext()
      parser.parseObjectKey("declass")
      val declass = parser.parseISZ(parseSmfDeclass _)
      parser.parseObjectNext()
      return SmfClause(classification, declass)
    }

    def parseSmfClassification(): SmfClassification = {
      val r = parseSmfClassificationT(F)
      return r
    }

    def parseSmfClassificationT(typeParsed: B): SmfClassification = {
      if (!typeParsed) {
        parser.parseObjectType("SmfClassification")
      }
      parser.parseObjectKey("portName")
      val portName = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("typeName")
      val typeName = parseName()
      parser.parseObjectNext()
      return SmfClassification(portName, typeName)
    }

    def parseSmfDeclass(): SmfDeclass = {
      val r = parseSmfDeclassT(F)
      return r
    }

    def parseSmfDeclassT(typeParsed: B): SmfDeclass = {
      if (!typeParsed) {
        parser.parseObjectType("SmfDeclass")
      }
      parser.parseObjectKey("flowName")
      val flowName = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("srcType")
      val srcType = parser.parseOption(parseName _)
      parser.parseObjectNext()
      parser.parseObjectKey("snkType")
      val snkType = parseName()
      parser.parseObjectNext()
      return SmfDeclass(flowName, srcType, snkType)
    }

    def parseSmfLibrary(): SmfLibrary = {
      val r = parseSmfLibraryT(F)
      return r
    }

    def parseSmfLibraryT(typeParsed: B): SmfLibrary = {
      if (!typeParsed) {
        parser.parseObjectType("SmfLibrary")
      }
      parser.parseObjectKey("types")
      val types = parser.parseISZ(parseSmfType _)
      parser.parseObjectNext()
      return SmfLibrary(types)
    }

    def parseSmfType(): SmfType = {
      val r = parseSmfTypeT(F)
      return r
    }

    def parseSmfTypeT(typeParsed: B): SmfType = {
      if (!typeParsed) {
        parser.parseObjectType("SmfType")
      }
      parser.parseObjectKey("typeName")
      val typeName = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("parentType")
      val parentType = parser.parseISZ(parseName _)
      parser.parseObjectNext()
      return SmfType(typeName, parentType)
    }

    def eof(): B = {
      val r = parser.eof()
      return r
    }

  }

  def to[T](s: String, f: Parser => T): Either[T, Json.ErrorMsg] = {
    val parser = Parser(s)
    val r = f(parser)
    parser.eof()
    parser.errorOpt match {
      case Some(e) => return Either.Right(e)
      case _ => return Either.Left(r)
    }
  }

  def fromAadlInstInfo(o: AadlInstInfo, isCompact: B): String = {
    val st = Printer.printAadlInstInfo(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toAadlInstInfo(s: String): Either[AadlInstInfo, Json.ErrorMsg] = {
    def fAadlInstInfo(parser: Parser): AadlInstInfo = {
      val r = parser.parseAadlInstInfo()
      return r
    }
    val r = to(s, fAadlInstInfo _)
    return r
  }

  def fromAadl(o: Aadl, isCompact: B): String = {
    val st = Printer.printAadl(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toAadl(s: String): Either[Aadl, Json.ErrorMsg] = {
    def fAadl(parser: Parser): Aadl = {
      val r = parser.parseAadl()
      return r
    }
    val r = to(s, fAadl _)
    return r
  }

  def fromName(o: Name, isCompact: B): String = {
    val st = Printer.printName(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toName(s: String): Either[Name, Json.ErrorMsg] = {
    def fName(parser: Parser): Name = {
      val r = parser.parseName()
      return r
    }
    val r = to(s, fName _)
    return r
  }

  def fromComponent(o: Component, isCompact: B): String = {
    val st = Printer.printComponent(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toComponent(s: String): Either[Component, Json.ErrorMsg] = {
    def fComponent(parser: Parser): Component = {
      val r = parser.parseComponent()
      return r
    }
    val r = to(s, fComponent _)
    return r
  }

  def fromClassifier(o: Classifier, isCompact: B): String = {
    val st = Printer.printClassifier(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toClassifier(s: String): Either[Classifier, Json.ErrorMsg] = {
    def fClassifier(parser: Parser): Classifier = {
      val r = parser.parseClassifier()
      return r
    }
    val r = to(s, fClassifier _)
    return r
  }

  def fromFeature(o: Feature, isCompact: B): String = {
    val st = Printer.printFeature(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFeature(s: String): Either[Feature, Json.ErrorMsg] = {
    def fFeature(parser: Parser): Feature = {
      val r = parser.parseFeature()
      return r
    }
    val r = to(s, fFeature _)
    return r
  }

  def fromFeatureEnd(o: FeatureEnd, isCompact: B): String = {
    val st = Printer.printFeatureEnd(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFeatureEnd(s: String): Either[FeatureEnd, Json.ErrorMsg] = {
    def fFeatureEnd(parser: Parser): FeatureEnd = {
      val r = parser.parseFeatureEnd()
      return r
    }
    val r = to(s, fFeatureEnd _)
    return r
  }

  def fromFeatureGroup(o: FeatureGroup, isCompact: B): String = {
    val st = Printer.printFeatureGroup(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFeatureGroup(s: String): Either[FeatureGroup, Json.ErrorMsg] = {
    def fFeatureGroup(parser: Parser): FeatureGroup = {
      val r = parser.parseFeatureGroup()
      return r
    }
    val r = to(s, fFeatureGroup _)
    return r
  }

  def fromFeatureAccess(o: FeatureAccess, isCompact: B): String = {
    val st = Printer.printFeatureAccess(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFeatureAccess(s: String): Either[FeatureAccess, Json.ErrorMsg] = {
    def fFeatureAccess(parser: Parser): FeatureAccess = {
      val r = parser.parseFeatureAccess()
      return r
    }
    val r = to(s, fFeatureAccess _)
    return r
  }

  def fromConnection(o: Connection, isCompact: B): String = {
    val st = Printer.printConnection(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toConnection(s: String): Either[Connection, Json.ErrorMsg] = {
    def fConnection(parser: Parser): Connection = {
      val r = parser.parseConnection()
      return r
    }
    val r = to(s, fConnection _)
    return r
  }

  def fromConnectionInstance(o: ConnectionInstance, isCompact: B): String = {
    val st = Printer.printConnectionInstance(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toConnectionInstance(s: String): Either[ConnectionInstance, Json.ErrorMsg] = {
    def fConnectionInstance(parser: Parser): ConnectionInstance = {
      val r = parser.parseConnectionInstance()
      return r
    }
    val r = to(s, fConnectionInstance _)
    return r
  }

  def fromConnectionReference(o: ConnectionReference, isCompact: B): String = {
    val st = Printer.printConnectionReference(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toConnectionReference(s: String): Either[ConnectionReference, Json.ErrorMsg] = {
    def fConnectionReference(parser: Parser): ConnectionReference = {
      val r = parser.parseConnectionReference()
      return r
    }
    val r = to(s, fConnectionReference _)
    return r
  }

  def fromEndPoint(o: EndPoint, isCompact: B): String = {
    val st = Printer.printEndPoint(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEndPoint(s: String): Either[EndPoint, Json.ErrorMsg] = {
    def fEndPoint(parser: Parser): EndPoint = {
      val r = parser.parseEndPoint()
      return r
    }
    val r = to(s, fEndPoint _)
    return r
  }

  def fromProperty(o: Property, isCompact: B): String = {
    val st = Printer.printProperty(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProperty(s: String): Either[Property, Json.ErrorMsg] = {
    def fProperty(parser: Parser): Property = {
      val r = parser.parseProperty()
      return r
    }
    val r = to(s, fProperty _)
    return r
  }

  def fromElementRef(o: ElementRef, isCompact: B): String = {
    val st = Printer.printElementRef(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toElementRef(s: String): Either[ElementRef, Json.ErrorMsg] = {
    def fElementRef(parser: Parser): ElementRef = {
      val r = parser.parseElementRef()
      return r
    }
    val r = to(s, fElementRef _)
    return r
  }

  def fromAadlElementRef(o: AadlElementRef, isCompact: B): String = {
    val st = Printer.printAadlElementRef(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toAadlElementRef(s: String): Either[AadlElementRef, Json.ErrorMsg] = {
    def fAadlElementRef(parser: Parser): AadlElementRef = {
      val r = parser.parseAadlElementRef()
      return r
    }
    val r = to(s, fAadlElementRef _)
    return r
  }

  def fromPropertyValue(o: PropertyValue, isCompact: B): String = {
    val st = Printer.printPropertyValue(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toPropertyValue(s: String): Either[PropertyValue, Json.ErrorMsg] = {
    def fPropertyValue(parser: Parser): PropertyValue = {
      val r = parser.parsePropertyValue()
      return r
    }
    val r = to(s, fPropertyValue _)
    return r
  }

  def fromClassifierProp(o: ClassifierProp, isCompact: B): String = {
    val st = Printer.printClassifierProp(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toClassifierProp(s: String): Either[ClassifierProp, Json.ErrorMsg] = {
    def fClassifierProp(parser: Parser): ClassifierProp = {
      val r = parser.parseClassifierProp()
      return r
    }
    val r = to(s, fClassifierProp _)
    return r
  }

  def fromRangeProp(o: RangeProp, isCompact: B): String = {
    val st = Printer.printRangeProp(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toRangeProp(s: String): Either[RangeProp, Json.ErrorMsg] = {
    def fRangeProp(parser: Parser): RangeProp = {
      val r = parser.parseRangeProp()
      return r
    }
    val r = to(s, fRangeProp _)
    return r
  }

  def fromRecordProp(o: RecordProp, isCompact: B): String = {
    val st = Printer.printRecordProp(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toRecordProp(s: String): Either[RecordProp, Json.ErrorMsg] = {
    def fRecordProp(parser: Parser): RecordProp = {
      val r = parser.parseRecordProp()
      return r
    }
    val r = to(s, fRecordProp _)
    return r
  }

  def fromReferenceProp(o: ReferenceProp, isCompact: B): String = {
    val st = Printer.printReferenceProp(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toReferenceProp(s: String): Either[ReferenceProp, Json.ErrorMsg] = {
    def fReferenceProp(parser: Parser): ReferenceProp = {
      val r = parser.parseReferenceProp()
      return r
    }
    val r = to(s, fReferenceProp _)
    return r
  }

  def fromUnitProp(o: UnitProp, isCompact: B): String = {
    val st = Printer.printUnitProp(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toUnitProp(s: String): Either[UnitProp, Json.ErrorMsg] = {
    def fUnitProp(parser: Parser): UnitProp = {
      val r = parser.parseUnitProp()
      return r
    }
    val r = to(s, fUnitProp _)
    return r
  }

  def fromValueProp(o: ValueProp, isCompact: B): String = {
    val st = Printer.printValueProp(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toValueProp(s: String): Either[ValueProp, Json.ErrorMsg] = {
    def fValueProp(parser: Parser): ValueProp = {
      val r = parser.parseValueProp()
      return r
    }
    val r = to(s, fValueProp _)
    return r
  }

  def fromMode(o: Mode, isCompact: B): String = {
    val st = Printer.printMode(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMode(s: String): Either[Mode, Json.ErrorMsg] = {
    def fMode(parser: Parser): Mode = {
      val r = parser.parseMode()
      return r
    }
    val r = to(s, fMode _)
    return r
  }

  def fromFlow(o: Flow, isCompact: B): String = {
    val st = Printer.printFlow(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFlow(s: String): Either[Flow, Json.ErrorMsg] = {
    def fFlow(parser: Parser): Flow = {
      val r = parser.parseFlow()
      return r
    }
    val r = to(s, fFlow _)
    return r
  }

  def fromAnnex(o: Annex, isCompact: B): String = {
    val st = Printer.printAnnex(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toAnnex(s: String): Either[Annex, Json.ErrorMsg] = {
    def fAnnex(parser: Parser): Annex = {
      val r = parser.parseAnnex()
      return r
    }
    val r = to(s, fAnnex _)
    return r
  }

  def fromAnnexClause(o: AnnexClause, isCompact: B): String = {
    val st = Printer.printAnnexClause(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toAnnexClause(s: String): Either[AnnexClause, Json.ErrorMsg] = {
    def fAnnexClause(parser: Parser): AnnexClause = {
      val r = parser.parseAnnexClause()
      return r
    }
    val r = to(s, fAnnexClause _)
    return r
  }

  def fromAnnexLib(o: AnnexLib, isCompact: B): String = {
    val st = Printer.printAnnexLib(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toAnnexLib(s: String): Either[AnnexLib, Json.ErrorMsg] = {
    def fAnnexLib(parser: Parser): AnnexLib = {
      val r = parser.parseAnnexLib()
      return r
    }
    val r = to(s, fAnnexLib _)
    return r
  }

  def fromOtherAnnex(o: OtherAnnex, isCompact: B): String = {
    val st = Printer.printOtherAnnex(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOtherAnnex(s: String): Either[OtherAnnex, Json.ErrorMsg] = {
    def fOtherAnnex(parser: Parser): OtherAnnex = {
      val r = parser.parseOtherAnnex()
      return r
    }
    val r = to(s, fOtherAnnex _)
    return r
  }

  def fromOtherLib(o: OtherLib, isCompact: B): String = {
    val st = Printer.printOtherLib(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOtherLib(s: String): Either[OtherLib, Json.ErrorMsg] = {
    def fOtherLib(parser: Parser): OtherLib = {
      val r = parser.parseOtherLib()
      return r
    }
    val r = to(s, fOtherLib _)
    return r
  }

  def fromBLESSAnnex(o: BLESSAnnex, isCompact: B): String = {
    val st = Printer.printBLESSAnnex(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBLESSAnnex(s: String): Either[BLESSAnnex, Json.ErrorMsg] = {
    def fBLESSAnnex(parser: Parser): BLESSAnnex = {
      val r = parser.parseBLESSAnnex()
      return r
    }
    val r = to(s, fBLESSAnnex _)
    return r
  }

  def fromBTSBLESSAnnexClause(o: BTSBLESSAnnexClause, isCompact: B): String = {
    val st = Printer.printBTSBLESSAnnexClause(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSBLESSAnnexClause(s: String): Either[BTSBLESSAnnexClause, Json.ErrorMsg] = {
    def fBTSBLESSAnnexClause(parser: Parser): BTSBLESSAnnexClause = {
      val r = parser.parseBTSBLESSAnnexClause()
      return r
    }
    val r = to(s, fBTSBLESSAnnexClause _)
    return r
  }

  def fromBTSVariableDeclaration(o: BTSVariableDeclaration, isCompact: B): String = {
    val st = Printer.printBTSVariableDeclaration(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSVariableDeclaration(s: String): Either[BTSVariableDeclaration, Json.ErrorMsg] = {
    def fBTSVariableDeclaration(parser: Parser): BTSVariableDeclaration = {
      val r = parser.parseBTSVariableDeclaration()
      return r
    }
    val r = to(s, fBTSVariableDeclaration _)
    return r
  }

  def fromBTSStateDeclaration(o: BTSStateDeclaration, isCompact: B): String = {
    val st = Printer.printBTSStateDeclaration(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSStateDeclaration(s: String): Either[BTSStateDeclaration, Json.ErrorMsg] = {
    def fBTSStateDeclaration(parser: Parser): BTSStateDeclaration = {
      val r = parser.parseBTSStateDeclaration()
      return r
    }
    val r = to(s, fBTSStateDeclaration _)
    return r
  }

  def fromBTSTransition(o: BTSTransition, isCompact: B): String = {
    val st = Printer.printBTSTransition(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSTransition(s: String): Either[BTSTransition, Json.ErrorMsg] = {
    def fBTSTransition(parser: Parser): BTSTransition = {
      val r = parser.parseBTSTransition()
      return r
    }
    val r = to(s, fBTSTransition _)
    return r
  }

  def fromBTSTransitionLabel(o: BTSTransitionLabel, isCompact: B): String = {
    val st = Printer.printBTSTransitionLabel(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSTransitionLabel(s: String): Either[BTSTransitionLabel, Json.ErrorMsg] = {
    def fBTSTransitionLabel(parser: Parser): BTSTransitionLabel = {
      val r = parser.parseBTSTransitionLabel()
      return r
    }
    val r = to(s, fBTSTransitionLabel _)
    return r
  }

  def fromBTSTransitionCondition(o: BTSTransitionCondition, isCompact: B): String = {
    val st = Printer.printBTSTransitionCondition(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSTransitionCondition(s: String): Either[BTSTransitionCondition, Json.ErrorMsg] = {
    def fBTSTransitionCondition(parser: Parser): BTSTransitionCondition = {
      val r = parser.parseBTSTransitionCondition()
      return r
    }
    val r = to(s, fBTSTransitionCondition _)
    return r
  }

  def fromBTSDispatchCondition(o: BTSDispatchCondition, isCompact: B): String = {
    val st = Printer.printBTSDispatchCondition(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSDispatchCondition(s: String): Either[BTSDispatchCondition, Json.ErrorMsg] = {
    def fBTSDispatchCondition(parser: Parser): BTSDispatchCondition = {
      val r = parser.parseBTSDispatchCondition()
      return r
    }
    val r = to(s, fBTSDispatchCondition _)
    return r
  }

  def fromBTSDispatchConjunction(o: BTSDispatchConjunction, isCompact: B): String = {
    val st = Printer.printBTSDispatchConjunction(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSDispatchConjunction(s: String): Either[BTSDispatchConjunction, Json.ErrorMsg] = {
    def fBTSDispatchConjunction(parser: Parser): BTSDispatchConjunction = {
      val r = parser.parseBTSDispatchConjunction()
      return r
    }
    val r = to(s, fBTSDispatchConjunction _)
    return r
  }

  def fromBTSDispatchTrigger(o: BTSDispatchTrigger, isCompact: B): String = {
    val st = Printer.printBTSDispatchTrigger(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSDispatchTrigger(s: String): Either[BTSDispatchTrigger, Json.ErrorMsg] = {
    def fBTSDispatchTrigger(parser: Parser): BTSDispatchTrigger = {
      val r = parser.parseBTSDispatchTrigger()
      return r
    }
    val r = to(s, fBTSDispatchTrigger _)
    return r
  }

  def fromBTSDispatchTriggerStop(o: BTSDispatchTriggerStop, isCompact: B): String = {
    val st = Printer.printBTSDispatchTriggerStop(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSDispatchTriggerStop(s: String): Either[BTSDispatchTriggerStop, Json.ErrorMsg] = {
    def fBTSDispatchTriggerStop(parser: Parser): BTSDispatchTriggerStop = {
      val r = parser.parseBTSDispatchTriggerStop()
      return r
    }
    val r = to(s, fBTSDispatchTriggerStop _)
    return r
  }

  def fromBTSDispatchTriggerPort(o: BTSDispatchTriggerPort, isCompact: B): String = {
    val st = Printer.printBTSDispatchTriggerPort(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSDispatchTriggerPort(s: String): Either[BTSDispatchTriggerPort, Json.ErrorMsg] = {
    def fBTSDispatchTriggerPort(parser: Parser): BTSDispatchTriggerPort = {
      val r = parser.parseBTSDispatchTriggerPort()
      return r
    }
    val r = to(s, fBTSDispatchTriggerPort _)
    return r
  }

  def fromBTSDispatchTriggerTimeout(o: BTSDispatchTriggerTimeout, isCompact: B): String = {
    val st = Printer.printBTSDispatchTriggerTimeout(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSDispatchTriggerTimeout(s: String): Either[BTSDispatchTriggerTimeout, Json.ErrorMsg] = {
    def fBTSDispatchTriggerTimeout(parser: Parser): BTSDispatchTriggerTimeout = {
      val r = parser.parseBTSDispatchTriggerTimeout()
      return r
    }
    val r = to(s, fBTSDispatchTriggerTimeout _)
    return r
  }

  def fromBTSExecuteCondition(o: BTSExecuteCondition, isCompact: B): String = {
    val st = Printer.printBTSExecuteCondition(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSExecuteCondition(s: String): Either[BTSExecuteCondition, Json.ErrorMsg] = {
    def fBTSExecuteCondition(parser: Parser): BTSExecuteCondition = {
      val r = parser.parseBTSExecuteCondition()
      return r
    }
    val r = to(s, fBTSExecuteCondition _)
    return r
  }

  def fromBTSExecuteConditionExp(o: BTSExecuteConditionExp, isCompact: B): String = {
    val st = Printer.printBTSExecuteConditionExp(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSExecuteConditionExp(s: String): Either[BTSExecuteConditionExp, Json.ErrorMsg] = {
    def fBTSExecuteConditionExp(parser: Parser): BTSExecuteConditionExp = {
      val r = parser.parseBTSExecuteConditionExp()
      return r
    }
    val r = to(s, fBTSExecuteConditionExp _)
    return r
  }

  def fromBTSExecuteConditionTimeout(o: BTSExecuteConditionTimeout, isCompact: B): String = {
    val st = Printer.printBTSExecuteConditionTimeout(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSExecuteConditionTimeout(s: String): Either[BTSExecuteConditionTimeout, Json.ErrorMsg] = {
    def fBTSExecuteConditionTimeout(parser: Parser): BTSExecuteConditionTimeout = {
      val r = parser.parseBTSExecuteConditionTimeout()
      return r
    }
    val r = to(s, fBTSExecuteConditionTimeout _)
    return r
  }

  def fromBTSExecuteConditionOtherwise(o: BTSExecuteConditionOtherwise, isCompact: B): String = {
    val st = Printer.printBTSExecuteConditionOtherwise(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSExecuteConditionOtherwise(s: String): Either[BTSExecuteConditionOtherwise, Json.ErrorMsg] = {
    def fBTSExecuteConditionOtherwise(parser: Parser): BTSExecuteConditionOtherwise = {
      val r = parser.parseBTSExecuteConditionOtherwise()
      return r
    }
    val r = to(s, fBTSExecuteConditionOtherwise _)
    return r
  }

  def fromBTSModeCondition(o: BTSModeCondition, isCompact: B): String = {
    val st = Printer.printBTSModeCondition(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSModeCondition(s: String): Either[BTSModeCondition, Json.ErrorMsg] = {
    def fBTSModeCondition(parser: Parser): BTSModeCondition = {
      val r = parser.parseBTSModeCondition()
      return r
    }
    val r = to(s, fBTSModeCondition _)
    return r
  }

  def fromBTSTriggerLogicalExpression(o: BTSTriggerLogicalExpression, isCompact: B): String = {
    val st = Printer.printBTSTriggerLogicalExpression(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSTriggerLogicalExpression(s: String): Either[BTSTriggerLogicalExpression, Json.ErrorMsg] = {
    def fBTSTriggerLogicalExpression(parser: Parser): BTSTriggerLogicalExpression = {
      val r = parser.parseBTSTriggerLogicalExpression()
      return r
    }
    val r = to(s, fBTSTriggerLogicalExpression _)
    return r
  }

  def fromBTSEventTrigger(o: BTSEventTrigger, isCompact: B): String = {
    val st = Printer.printBTSEventTrigger(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSEventTrigger(s: String): Either[BTSEventTrigger, Json.ErrorMsg] = {
    def fBTSEventTrigger(parser: Parser): BTSEventTrigger = {
      val r = parser.parseBTSEventTrigger()
      return r
    }
    val r = to(s, fBTSEventTrigger _)
    return r
  }

  def fromBTSSubcomponentPort(o: BTSSubcomponentPort, isCompact: B): String = {
    val st = Printer.printBTSSubcomponentPort(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSSubcomponentPort(s: String): Either[BTSSubcomponentPort, Json.ErrorMsg] = {
    def fBTSSubcomponentPort(parser: Parser): BTSSubcomponentPort = {
      val r = parser.parseBTSSubcomponentPort()
      return r
    }
    val r = to(s, fBTSSubcomponentPort _)
    return r
  }

  def fromBTSInternalCondition(o: BTSInternalCondition, isCompact: B): String = {
    val st = Printer.printBTSInternalCondition(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSInternalCondition(s: String): Either[BTSInternalCondition, Json.ErrorMsg] = {
    def fBTSInternalCondition(parser: Parser): BTSInternalCondition = {
      val r = parser.parseBTSInternalCondition()
      return r
    }
    val r = to(s, fBTSInternalCondition _)
    return r
  }

  def fromBTSAssertion(o: BTSAssertion, isCompact: B): String = {
    val st = Printer.printBTSAssertion(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSAssertion(s: String): Either[BTSAssertion, Json.ErrorMsg] = {
    def fBTSAssertion(parser: Parser): BTSAssertion = {
      val r = parser.parseBTSAssertion()
      return r
    }
    val r = to(s, fBTSAssertion _)
    return r
  }

  def fromBTSNamedAssertion(o: BTSNamedAssertion, isCompact: B): String = {
    val st = Printer.printBTSNamedAssertion(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSNamedAssertion(s: String): Either[BTSNamedAssertion, Json.ErrorMsg] = {
    def fBTSNamedAssertion(parser: Parser): BTSNamedAssertion = {
      val r = parser.parseBTSNamedAssertion()
      return r
    }
    val r = to(s, fBTSNamedAssertion _)
    return r
  }

  def fromBTSNamedFunction(o: BTSNamedFunction, isCompact: B): String = {
    val st = Printer.printBTSNamedFunction(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSNamedFunction(s: String): Either[BTSNamedFunction, Json.ErrorMsg] = {
    def fBTSNamedFunction(parser: Parser): BTSNamedFunction = {
      val r = parser.parseBTSNamedFunction()
      return r
    }
    val r = to(s, fBTSNamedFunction _)
    return r
  }

  def fromBTSNamedEnumeration(o: BTSNamedEnumeration, isCompact: B): String = {
    val st = Printer.printBTSNamedEnumeration(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSNamedEnumeration(s: String): Either[BTSNamedEnumeration, Json.ErrorMsg] = {
    def fBTSNamedEnumeration(parser: Parser): BTSNamedEnumeration = {
      val r = parser.parseBTSNamedEnumeration()
      return r
    }
    val r = to(s, fBTSNamedEnumeration _)
    return r
  }

  def fromBTSNamelessAssertion(o: BTSNamelessAssertion, isCompact: B): String = {
    val st = Printer.printBTSNamelessAssertion(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSNamelessAssertion(s: String): Either[BTSNamelessAssertion, Json.ErrorMsg] = {
    def fBTSNamelessAssertion(parser: Parser): BTSNamelessAssertion = {
      val r = parser.parseBTSNamelessAssertion()
      return r
    }
    val r = to(s, fBTSNamelessAssertion _)
    return r
  }

  def fromBTSNamelessFunction(o: BTSNamelessFunction, isCompact: B): String = {
    val st = Printer.printBTSNamelessFunction(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSNamelessFunction(s: String): Either[BTSNamelessFunction, Json.ErrorMsg] = {
    def fBTSNamelessFunction(parser: Parser): BTSNamelessFunction = {
      val r = parser.parseBTSNamelessFunction()
      return r
    }
    val r = to(s, fBTSNamelessFunction _)
    return r
  }

  def fromBTSNamelessEnumeration(o: BTSNamelessEnumeration, isCompact: B): String = {
    val st = Printer.printBTSNamelessEnumeration(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSNamelessEnumeration(s: String): Either[BTSNamelessEnumeration, Json.ErrorMsg] = {
    def fBTSNamelessEnumeration(parser: Parser): BTSNamelessEnumeration = {
      val r = parser.parseBTSNamelessEnumeration()
      return r
    }
    val r = to(s, fBTSNamelessEnumeration _)
    return r
  }

  def fromBTSAssertionEnumeration(o: BTSAssertionEnumeration, isCompact: B): String = {
    val st = Printer.printBTSAssertionEnumeration(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSAssertionEnumeration(s: String): Either[BTSAssertionEnumeration, Json.ErrorMsg] = {
    def fBTSAssertionEnumeration(parser: Parser): BTSAssertionEnumeration = {
      val r = parser.parseBTSAssertionEnumeration()
      return r
    }
    val r = to(s, fBTSAssertionEnumeration _)
    return r
  }

  def fromBTSEnumerationPairs(o: BTSEnumerationPairs, isCompact: B): String = {
    val st = Printer.printBTSEnumerationPairs(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSEnumerationPairs(s: String): Either[BTSEnumerationPairs, Json.ErrorMsg] = {
    def fBTSEnumerationPairs(parser: Parser): BTSEnumerationPairs = {
      val r = parser.parseBTSEnumerationPairs()
      return r
    }
    val r = to(s, fBTSEnumerationPairs _)
    return r
  }

  def fromBTSEnumerationPair(o: BTSEnumerationPair, isCompact: B): String = {
    val st = Printer.printBTSEnumerationPair(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSEnumerationPair(s: String): Either[BTSEnumerationPair, Json.ErrorMsg] = {
    def fBTSEnumerationPair(parser: Parser): BTSEnumerationPair = {
      val r = parser.parseBTSEnumerationPair()
      return r
    }
    val r = to(s, fBTSEnumerationPair _)
    return r
  }

  def fromBTSInvocation(o: BTSInvocation, isCompact: B): String = {
    val st = Printer.printBTSInvocation(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSInvocation(s: String): Either[BTSInvocation, Json.ErrorMsg] = {
    def fBTSInvocation(parser: Parser): BTSInvocation = {
      val r = parser.parseBTSInvocation()
      return r
    }
    val r = to(s, fBTSInvocation _)
    return r
  }

  def fromBTSActualParameter(o: BTSActualParameter, isCompact: B): String = {
    val st = Printer.printBTSActualParameter(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSActualParameter(s: String): Either[BTSActualParameter, Json.ErrorMsg] = {
    def fBTSActualParameter(parser: Parser): BTSActualParameter = {
      val r = parser.parseBTSActualParameter()
      return r
    }
    val r = to(s, fBTSActualParameter _)
    return r
  }

  def fromBTSVariable(o: BTSVariable, isCompact: B): String = {
    val st = Printer.printBTSVariable(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSVariable(s: String): Either[BTSVariable, Json.ErrorMsg] = {
    def fBTSVariable(parser: Parser): BTSVariable = {
      val r = parser.parseBTSVariable()
      return r
    }
    val r = to(s, fBTSVariable _)
    return r
  }

  def fromBTSActionAnnexSubclause(o: BTSActionAnnexSubclause, isCompact: B): String = {
    val st = Printer.printBTSActionAnnexSubclause(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSActionAnnexSubclause(s: String): Either[BTSActionAnnexSubclause, Json.ErrorMsg] = {
    def fBTSActionAnnexSubclause(parser: Parser): BTSActionAnnexSubclause = {
      val r = parser.parseBTSActionAnnexSubclause()
      return r
    }
    val r = to(s, fBTSActionAnnexSubclause _)
    return r
  }

  def fromBTSBehaviorActions(o: BTSBehaviorActions, isCompact: B): String = {
    val st = Printer.printBTSBehaviorActions(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSBehaviorActions(s: String): Either[BTSBehaviorActions, Json.ErrorMsg] = {
    def fBTSBehaviorActions(parser: Parser): BTSBehaviorActions = {
      val r = parser.parseBTSBehaviorActions()
      return r
    }
    val r = to(s, fBTSBehaviorActions _)
    return r
  }

  def fromBTSAssertedAction(o: BTSAssertedAction, isCompact: B): String = {
    val st = Printer.printBTSAssertedAction(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSAssertedAction(s: String): Either[BTSAssertedAction, Json.ErrorMsg] = {
    def fBTSAssertedAction(parser: Parser): BTSAssertedAction = {
      val r = parser.parseBTSAssertedAction()
      return r
    }
    val r = to(s, fBTSAssertedAction _)
    return r
  }

  def fromBTSAction(o: BTSAction, isCompact: B): String = {
    val st = Printer.printBTSAction(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSAction(s: String): Either[BTSAction, Json.ErrorMsg] = {
    def fBTSAction(parser: Parser): BTSAction = {
      val r = parser.parseBTSAction()
      return r
    }
    val r = to(s, fBTSAction _)
    return r
  }

  def fromBTSBasicAction(o: BTSBasicAction, isCompact: B): String = {
    val st = Printer.printBTSBasicAction(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSBasicAction(s: String): Either[BTSBasicAction, Json.ErrorMsg] = {
    def fBTSBasicAction(parser: Parser): BTSBasicAction = {
      val r = parser.parseBTSBasicAction()
      return r
    }
    val r = to(s, fBTSBasicAction _)
    return r
  }

  def fromBTSSkipAction(o: BTSSkipAction, isCompact: B): String = {
    val st = Printer.printBTSSkipAction(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSSkipAction(s: String): Either[BTSSkipAction, Json.ErrorMsg] = {
    def fBTSSkipAction(parser: Parser): BTSSkipAction = {
      val r = parser.parseBTSSkipAction()
      return r
    }
    val r = to(s, fBTSSkipAction _)
    return r
  }

  def fromBTSAssignmentAction(o: BTSAssignmentAction, isCompact: B): String = {
    val st = Printer.printBTSAssignmentAction(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSAssignmentAction(s: String): Either[BTSAssignmentAction, Json.ErrorMsg] = {
    def fBTSAssignmentAction(parser: Parser): BTSAssignmentAction = {
      val r = parser.parseBTSAssignmentAction()
      return r
    }
    val r = to(s, fBTSAssignmentAction _)
    return r
  }

  def fromBTSSetMode(o: BTSSetMode, isCompact: B): String = {
    val st = Printer.printBTSSetMode(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSSetMode(s: String): Either[BTSSetMode, Json.ErrorMsg] = {
    def fBTSSetMode(parser: Parser): BTSSetMode = {
      val r = parser.parseBTSSetMode()
      return r
    }
    val r = to(s, fBTSSetMode _)
    return r
  }

  def fromBTSWhenThrow(o: BTSWhenThrow, isCompact: B): String = {
    val st = Printer.printBTSWhenThrow(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSWhenThrow(s: String): Either[BTSWhenThrow, Json.ErrorMsg] = {
    def fBTSWhenThrow(parser: Parser): BTSWhenThrow = {
      val r = parser.parseBTSWhenThrow()
      return r
    }
    val r = to(s, fBTSWhenThrow _)
    return r
  }

  def fromBTSCombinableOperation(o: BTSCombinableOperation, isCompact: B): String = {
    val st = Printer.printBTSCombinableOperation(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSCombinableOperation(s: String): Either[BTSCombinableOperation, Json.ErrorMsg] = {
    def fBTSCombinableOperation(parser: Parser): BTSCombinableOperation = {
      val r = parser.parseBTSCombinableOperation()
      return r
    }
    val r = to(s, fBTSCombinableOperation _)
    return r
  }

  def fromBTSFetchAdd(o: BTSFetchAdd, isCompact: B): String = {
    val st = Printer.printBTSFetchAdd(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSFetchAdd(s: String): Either[BTSFetchAdd, Json.ErrorMsg] = {
    def fBTSFetchAdd(parser: Parser): BTSFetchAdd = {
      val r = parser.parseBTSFetchAdd()
      return r
    }
    val r = to(s, fBTSFetchAdd _)
    return r
  }

  def fromBTSFetchOr(o: BTSFetchOr, isCompact: B): String = {
    val st = Printer.printBTSFetchOr(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSFetchOr(s: String): Either[BTSFetchOr, Json.ErrorMsg] = {
    def fBTSFetchOr(parser: Parser): BTSFetchOr = {
      val r = parser.parseBTSFetchOr()
      return r
    }
    val r = to(s, fBTSFetchOr _)
    return r
  }

  def fromBTSFetchAnd(o: BTSFetchAnd, isCompact: B): String = {
    val st = Printer.printBTSFetchAnd(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSFetchAnd(s: String): Either[BTSFetchAnd, Json.ErrorMsg] = {
    def fBTSFetchAnd(parser: Parser): BTSFetchAnd = {
      val r = parser.parseBTSFetchAnd()
      return r
    }
    val r = to(s, fBTSFetchAnd _)
    return r
  }

  def fromBTSFetchXor(o: BTSFetchXor, isCompact: B): String = {
    val st = Printer.printBTSFetchXor(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSFetchXor(s: String): Either[BTSFetchXor, Json.ErrorMsg] = {
    def fBTSFetchXor(parser: Parser): BTSFetchXor = {
      val r = parser.parseBTSFetchXor()
      return r
    }
    val r = to(s, fBTSFetchXor _)
    return r
  }

  def fromBTSSwap(o: BTSSwap, isCompact: B): String = {
    val st = Printer.printBTSSwap(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSSwap(s: String): Either[BTSSwap, Json.ErrorMsg] = {
    def fBTSSwap(parser: Parser): BTSSwap = {
      val r = parser.parseBTSSwap()
      return r
    }
    val r = to(s, fBTSSwap _)
    return r
  }

  def fromBTSCommunicationAction(o: BTSCommunicationAction, isCompact: B): String = {
    val st = Printer.printBTSCommunicationAction(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSCommunicationAction(s: String): Either[BTSCommunicationAction, Json.ErrorMsg] = {
    def fBTSCommunicationAction(parser: Parser): BTSCommunicationAction = {
      val r = parser.parseBTSCommunicationAction()
      return r
    }
    val r = to(s, fBTSCommunicationAction _)
    return r
  }

  def fromBTSSubprogramCallAction(o: BTSSubprogramCallAction, isCompact: B): String = {
    val st = Printer.printBTSSubprogramCallAction(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSSubprogramCallAction(s: String): Either[BTSSubprogramCallAction, Json.ErrorMsg] = {
    def fBTSSubprogramCallAction(parser: Parser): BTSSubprogramCallAction = {
      val r = parser.parseBTSSubprogramCallAction()
      return r
    }
    val r = to(s, fBTSSubprogramCallAction _)
    return r
  }

  def fromBTSFormalActual(o: BTSFormalActual, isCompact: B): String = {
    val st = Printer.printBTSFormalActual(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSFormalActual(s: String): Either[BTSFormalActual, Json.ErrorMsg] = {
    def fBTSFormalActual(parser: Parser): BTSFormalActual = {
      val r = parser.parseBTSFormalActual()
      return r
    }
    val r = to(s, fBTSFormalActual _)
    return r
  }

  def fromBTSPortOutput(o: BTSPortOutput, isCompact: B): String = {
    val st = Printer.printBTSPortOutput(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSPortOutput(s: String): Either[BTSPortOutput, Json.ErrorMsg] = {
    def fBTSPortOutput(parser: Parser): BTSPortOutput = {
      val r = parser.parseBTSPortOutput()
      return r
    }
    val r = to(s, fBTSPortOutput _)
    return r
  }

  def fromBTSPortInput(o: BTSPortInput, isCompact: B): String = {
    val st = Printer.printBTSPortInput(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSPortInput(s: String): Either[BTSPortInput, Json.ErrorMsg] = {
    def fBTSPortInput(parser: Parser): BTSPortInput = {
      val r = parser.parseBTSPortInput()
      return r
    }
    val r = to(s, fBTSPortInput _)
    return r
  }

  def fromBTSFrozenPortAction(o: BTSFrozenPortAction, isCompact: B): String = {
    val st = Printer.printBTSFrozenPortAction(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSFrozenPortAction(s: String): Either[BTSFrozenPortAction, Json.ErrorMsg] = {
    def fBTSFrozenPortAction(parser: Parser): BTSFrozenPortAction = {
      val r = parser.parseBTSFrozenPortAction()
      return r
    }
    val r = to(s, fBTSFrozenPortAction _)
    return r
  }

  def fromBTSPause(o: BTSPause, isCompact: B): String = {
    val st = Printer.printBTSPause(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSPause(s: String): Either[BTSPause, Json.ErrorMsg] = {
    def fBTSPause(parser: Parser): BTSPause = {
      val r = parser.parseBTSPause()
      return r
    }
    val r = to(s, fBTSPause _)
    return r
  }

  def fromBTSControlAction(o: BTSControlAction, isCompact: B): String = {
    val st = Printer.printBTSControlAction(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSControlAction(s: String): Either[BTSControlAction, Json.ErrorMsg] = {
    def fBTSControlAction(parser: Parser): BTSControlAction = {
      val r = parser.parseBTSControlAction()
      return r
    }
    val r = to(s, fBTSControlAction _)
    return r
  }

  def fromBTSIfBLESSAction(o: BTSIfBLESSAction, isCompact: B): String = {
    val st = Printer.printBTSIfBLESSAction(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSIfBLESSAction(s: String): Either[BTSIfBLESSAction, Json.ErrorMsg] = {
    def fBTSIfBLESSAction(parser: Parser): BTSIfBLESSAction = {
      val r = parser.parseBTSIfBLESSAction()
      return r
    }
    val r = to(s, fBTSIfBLESSAction _)
    return r
  }

  def fromBTSGuardedAction(o: BTSGuardedAction, isCompact: B): String = {
    val st = Printer.printBTSGuardedAction(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSGuardedAction(s: String): Either[BTSGuardedAction, Json.ErrorMsg] = {
    def fBTSGuardedAction(parser: Parser): BTSGuardedAction = {
      val r = parser.parseBTSGuardedAction()
      return r
    }
    val r = to(s, fBTSGuardedAction _)
    return r
  }

  def fromBTSIfBAAction(o: BTSIfBAAction, isCompact: B): String = {
    val st = Printer.printBTSIfBAAction(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSIfBAAction(s: String): Either[BTSIfBAAction, Json.ErrorMsg] = {
    def fBTSIfBAAction(parser: Parser): BTSIfBAAction = {
      val r = parser.parseBTSIfBAAction()
      return r
    }
    val r = to(s, fBTSIfBAAction _)
    return r
  }

  def fromBTSConditionalActions(o: BTSConditionalActions, isCompact: B): String = {
    val st = Printer.printBTSConditionalActions(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSConditionalActions(s: String): Either[BTSConditionalActions, Json.ErrorMsg] = {
    def fBTSConditionalActions(parser: Parser): BTSConditionalActions = {
      val r = parser.parseBTSConditionalActions()
      return r
    }
    val r = to(s, fBTSConditionalActions _)
    return r
  }

  def fromBTSWhileLoop(o: BTSWhileLoop, isCompact: B): String = {
    val st = Printer.printBTSWhileLoop(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSWhileLoop(s: String): Either[BTSWhileLoop, Json.ErrorMsg] = {
    def fBTSWhileLoop(parser: Parser): BTSWhileLoop = {
      val r = parser.parseBTSWhileLoop()
      return r
    }
    val r = to(s, fBTSWhileLoop _)
    return r
  }

  def fromBTSForLoop(o: BTSForLoop, isCompact: B): String = {
    val st = Printer.printBTSForLoop(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSForLoop(s: String): Either[BTSForLoop, Json.ErrorMsg] = {
    def fBTSForLoop(parser: Parser): BTSForLoop = {
      val r = parser.parseBTSForLoop()
      return r
    }
    val r = to(s, fBTSForLoop _)
    return r
  }

  def fromBTSDoUntilLoop(o: BTSDoUntilLoop, isCompact: B): String = {
    val st = Printer.printBTSDoUntilLoop(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSDoUntilLoop(s: String): Either[BTSDoUntilLoop, Json.ErrorMsg] = {
    def fBTSDoUntilLoop(parser: Parser): BTSDoUntilLoop = {
      val r = parser.parseBTSDoUntilLoop()
      return r
    }
    val r = to(s, fBTSDoUntilLoop _)
    return r
  }

  def fromBTSQuantificationActions(o: BTSQuantificationActions, isCompact: B): String = {
    val st = Printer.printBTSQuantificationActions(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSQuantificationActions(s: String): Either[BTSQuantificationActions, Json.ErrorMsg] = {
    def fBTSQuantificationActions(parser: Parser): BTSQuantificationActions = {
      val r = parser.parseBTSQuantificationActions()
      return r
    }
    val r = to(s, fBTSQuantificationActions _)
    return r
  }

  def fromBTSExistentialLatticeQuantification(o: BTSExistentialLatticeQuantification, isCompact: B): String = {
    val st = Printer.printBTSExistentialLatticeQuantification(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSExistentialLatticeQuantification(s: String): Either[BTSExistentialLatticeQuantification, Json.ErrorMsg] = {
    def fBTSExistentialLatticeQuantification(parser: Parser): BTSExistentialLatticeQuantification = {
      val r = parser.parseBTSExistentialLatticeQuantification()
      return r
    }
    val r = to(s, fBTSExistentialLatticeQuantification _)
    return r
  }

  def fromBTSCatchClauseTerm(o: BTSCatchClauseTerm, isCompact: B): String = {
    val st = Printer.printBTSCatchClauseTerm(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSCatchClauseTerm(s: String): Either[BTSCatchClauseTerm, Json.ErrorMsg] = {
    def fBTSCatchClauseTerm(parser: Parser): BTSCatchClauseTerm = {
      val r = parser.parseBTSCatchClauseTerm()
      return r
    }
    val r = to(s, fBTSCatchClauseTerm _)
    return r
  }

  def fromBTSUniversalLatticeQuantification(o: BTSUniversalLatticeQuantification, isCompact: B): String = {
    val st = Printer.printBTSUniversalLatticeQuantification(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSUniversalLatticeQuantification(s: String): Either[BTSUniversalLatticeQuantification, Json.ErrorMsg] = {
    def fBTSUniversalLatticeQuantification(parser: Parser): BTSUniversalLatticeQuantification = {
      val r = parser.parseBTSUniversalLatticeQuantification()
      return r
    }
    val r = to(s, fBTSUniversalLatticeQuantification _)
    return r
  }

  def fromBTSExp(o: BTSExp, isCompact: B): String = {
    val st = Printer.printBTSExp(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSExp(s: String): Either[BTSExp, Json.ErrorMsg] = {
    def fBTSExp(parser: Parser): BTSExp = {
      val r = parser.parseBTSExp()
      return r
    }
    val r = to(s, fBTSExp _)
    return r
  }

  def fromBTSUnaryExp(o: BTSUnaryExp, isCompact: B): String = {
    val st = Printer.printBTSUnaryExp(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSUnaryExp(s: String): Either[BTSUnaryExp, Json.ErrorMsg] = {
    def fBTSUnaryExp(parser: Parser): BTSUnaryExp = {
      val r = parser.parseBTSUnaryExp()
      return r
    }
    val r = to(s, fBTSUnaryExp _)
    return r
  }

  def fromBTSBinaryExp(o: BTSBinaryExp, isCompact: B): String = {
    val st = Printer.printBTSBinaryExp(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSBinaryExp(s: String): Either[BTSBinaryExp, Json.ErrorMsg] = {
    def fBTSBinaryExp(parser: Parser): BTSBinaryExp = {
      val r = parser.parseBTSBinaryExp()
      return r
    }
    val r = to(s, fBTSBinaryExp _)
    return r
  }

  def fromBTSLiteralExp(o: BTSLiteralExp, isCompact: B): String = {
    val st = Printer.printBTSLiteralExp(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSLiteralExp(s: String): Either[BTSLiteralExp, Json.ErrorMsg] = {
    def fBTSLiteralExp(parser: Parser): BTSLiteralExp = {
      val r = parser.parseBTSLiteralExp()
      return r
    }
    val r = to(s, fBTSLiteralExp _)
    return r
  }

  def fromBTSValueName(o: BTSValueName, isCompact: B): String = {
    val st = Printer.printBTSValueName(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSValueName(s: String): Either[BTSValueName, Json.ErrorMsg] = {
    def fBTSValueName(parser: Parser): BTSValueName = {
      val r = parser.parseBTSValueName()
      return r
    }
    val r = to(s, fBTSValueName _)
    return r
  }

  def fromBTSVariableNameExp(o: BTSVariableNameExp, isCompact: B): String = {
    val st = Printer.printBTSVariableNameExp(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSVariableNameExp(s: String): Either[BTSVariableNameExp, Json.ErrorMsg] = {
    def fBTSVariableNameExp(parser: Parser): BTSVariableNameExp = {
      val r = parser.parseBTSVariableNameExp()
      return r
    }
    val r = to(s, fBTSVariableNameExp _)
    return r
  }

  def fromBTSPartialName(o: BTSPartialName, isCompact: B): String = {
    val st = Printer.printBTSPartialName(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSPartialName(s: String): Either[BTSPartialName, Json.ErrorMsg] = {
    def fBTSPartialName(parser: Parser): BTSPartialName = {
      val r = parser.parseBTSPartialName()
      return r
    }
    val r = to(s, fBTSPartialName _)
    return r
  }

  def fromBTSIndexingExp(o: BTSIndexingExp, isCompact: B): String = {
    val st = Printer.printBTSIndexingExp(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSIndexingExp(s: String): Either[BTSIndexingExp, Json.ErrorMsg] = {
    def fBTSIndexingExp(parser: Parser): BTSIndexingExp = {
      val r = parser.parseBTSIndexingExp()
      return r
    }
    val r = to(s, fBTSIndexingExp _)
    return r
  }

  def fromBTSAccessExp(o: BTSAccessExp, isCompact: B): String = {
    val st = Printer.printBTSAccessExp(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSAccessExp(s: String): Either[BTSAccessExp, Json.ErrorMsg] = {
    def fBTSAccessExp(parser: Parser): BTSAccessExp = {
      val r = parser.parseBTSAccessExp()
      return r
    }
    val r = to(s, fBTSAccessExp _)
    return r
  }

  def fromBTSFunctionCall(o: BTSFunctionCall, isCompact: B): String = {
    val st = Printer.printBTSFunctionCall(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSFunctionCall(s: String): Either[BTSFunctionCall, Json.ErrorMsg] = {
    def fBTSFunctionCall(parser: Parser): BTSFunctionCall = {
      val r = parser.parseBTSFunctionCall()
      return r
    }
    val r = to(s, fBTSFunctionCall _)
    return r
  }

  def fromBTSPortValue(o: BTSPortValue, isCompact: B): String = {
    val st = Printer.printBTSPortValue(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSPortValue(s: String): Either[BTSPortValue, Json.ErrorMsg] = {
    def fBTSPortValue(parser: Parser): BTSPortValue = {
      val r = parser.parseBTSPortValue()
      return r
    }
    val r = to(s, fBTSPortValue _)
    return r
  }

  def fromBTSConditionalExpression(o: BTSConditionalExpression, isCompact: B): String = {
    val st = Printer.printBTSConditionalExpression(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSConditionalExpression(s: String): Either[BTSConditionalExpression, Json.ErrorMsg] = {
    def fBTSConditionalExpression(parser: Parser): BTSConditionalExpression = {
      val r = parser.parseBTSConditionalExpression()
      return r
    }
    val r = to(s, fBTSConditionalExpression _)
    return r
  }

  def fromBTSTrue(o: BTSTrue, isCompact: B): String = {
    val st = Printer.printBTSTrue(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSTrue(s: String): Either[BTSTrue, Json.ErrorMsg] = {
    def fBTSTrue(parser: Parser): BTSTrue = {
      val r = parser.parseBTSTrue()
      return r
    }
    val r = to(s, fBTSTrue _)
    return r
  }

  def fromBTSFalse(o: BTSFalse, isCompact: B): String = {
    val st = Printer.printBTSFalse(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSFalse(s: String): Either[BTSFalse, Json.ErrorMsg] = {
    def fBTSFalse(parser: Parser): BTSFalse = {
      val r = parser.parseBTSFalse()
      return r
    }
    val r = to(s, fBTSFalse _)
    return r
  }

  def fromBTSNull(o: BTSNull, isCompact: B): String = {
    val st = Printer.printBTSNull(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSNull(s: String): Either[BTSNull, Json.ErrorMsg] = {
    def fBTSNull(parser: Parser): BTSNull = {
      val r = parser.parseBTSNull()
      return r
    }
    val r = to(s, fBTSNull _)
    return r
  }

  def fromBTSPropertyConstant(o: BTSPropertyConstant, isCompact: B): String = {
    val st = Printer.printBTSPropertyConstant(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSPropertyConstant(s: String): Either[BTSPropertyConstant, Json.ErrorMsg] = {
    def fBTSPropertyConstant(parser: Parser): BTSPropertyConstant = {
      val r = parser.parseBTSPropertyConstant()
      return r
    }
    val r = to(s, fBTSPropertyConstant _)
    return r
  }

  def fromBTSPropertyReference(o: BTSPropertyReference, isCompact: B): String = {
    val st = Printer.printBTSPropertyReference(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSPropertyReference(s: String): Either[BTSPropertyReference, Json.ErrorMsg] = {
    def fBTSPropertyReference(parser: Parser): BTSPropertyReference = {
      val r = parser.parseBTSPropertyReference()
      return r
    }
    val r = to(s, fBTSPropertyReference _)
    return r
  }

  def fromBTSPropertySetProperty(o: BTSPropertySetProperty, isCompact: B): String = {
    val st = Printer.printBTSPropertySetProperty(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSPropertySetProperty(s: String): Either[BTSPropertySetProperty, Json.ErrorMsg] = {
    def fBTSPropertySetProperty(parser: Parser): BTSPropertySetProperty = {
      val r = parser.parseBTSPropertySetProperty()
      return r
    }
    val r = to(s, fBTSPropertySetProperty _)
    return r
  }

  def fromBTSSelfProperty(o: BTSSelfProperty, isCompact: B): String = {
    val st = Printer.printBTSSelfProperty(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSSelfProperty(s: String): Either[BTSSelfProperty, Json.ErrorMsg] = {
    def fBTSSelfProperty(parser: Parser): BTSSelfProperty = {
      val r = parser.parseBTSSelfProperty()
      return r
    }
    val r = to(s, fBTSSelfProperty _)
    return r
  }

  def fromBTSComponentProperty(o: BTSComponentProperty, isCompact: B): String = {
    val st = Printer.printBTSComponentProperty(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSComponentProperty(s: String): Either[BTSComponentProperty, Json.ErrorMsg] = {
    def fBTSComponentProperty(parser: Parser): BTSComponentProperty = {
      val r = parser.parseBTSComponentProperty()
      return r
    }
    val r = to(s, fBTSComponentProperty _)
    return r
  }

  def fromBTSComponent(o: BTSComponent, isCompact: B): String = {
    val st = Printer.printBTSComponent(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSComponent(s: String): Either[BTSComponent, Json.ErrorMsg] = {
    def fBTSComponent(parser: Parser): BTSComponent = {
      val r = parser.parseBTSComponent()
      return r
    }
    val r = to(s, fBTSComponent _)
    return r
  }

  def fromBTSPropertyField(o: BTSPropertyField, isCompact: B): String = {
    val st = Printer.printBTSPropertyField(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSPropertyField(s: String): Either[BTSPropertyField, Json.ErrorMsg] = {
    def fBTSPropertyField(parser: Parser): BTSPropertyField = {
      val r = parser.parseBTSPropertyField()
      return r
    }
    val r = to(s, fBTSPropertyField _)
    return r
  }

  def fromBTSUniversalQuantification(o: BTSUniversalQuantification, isCompact: B): String = {
    val st = Printer.printBTSUniversalQuantification(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSUniversalQuantification(s: String): Either[BTSUniversalQuantification, Json.ErrorMsg] = {
    def fBTSUniversalQuantification(parser: Parser): BTSUniversalQuantification = {
      val r = parser.parseBTSUniversalQuantification()
      return r
    }
    val r = to(s, fBTSUniversalQuantification _)
    return r
  }

  def fromBTSExistentialQuantification(o: BTSExistentialQuantification, isCompact: B): String = {
    val st = Printer.printBTSExistentialQuantification(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSExistentialQuantification(s: String): Either[BTSExistentialQuantification, Json.ErrorMsg] = {
    def fBTSExistentialQuantification(parser: Parser): BTSExistentialQuantification = {
      val r = parser.parseBTSExistentialQuantification()
      return r
    }
    val r = to(s, fBTSExistentialQuantification _)
    return r
  }

  def fromBTSSumQuantification(o: BTSSumQuantification, isCompact: B): String = {
    val st = Printer.printBTSSumQuantification(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSSumQuantification(s: String): Either[BTSSumQuantification, Json.ErrorMsg] = {
    def fBTSSumQuantification(parser: Parser): BTSSumQuantification = {
      val r = parser.parseBTSSumQuantification()
      return r
    }
    val r = to(s, fBTSSumQuantification _)
    return r
  }

  def fromBTSProductQuantification(o: BTSProductQuantification, isCompact: B): String = {
    val st = Printer.printBTSProductQuantification(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSProductQuantification(s: String): Either[BTSProductQuantification, Json.ErrorMsg] = {
    def fBTSProductQuantification(parser: Parser): BTSProductQuantification = {
      val r = parser.parseBTSProductQuantification()
      return r
    }
    val r = to(s, fBTSProductQuantification _)
    return r
  }

  def fromBTSCountingQuantification(o: BTSCountingQuantification, isCompact: B): String = {
    val st = Printer.printBTSCountingQuantification(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSCountingQuantification(s: String): Either[BTSCountingQuantification, Json.ErrorMsg] = {
    def fBTSCountingQuantification(parser: Parser): BTSCountingQuantification = {
      val r = parser.parseBTSCountingQuantification()
      return r
    }
    val r = to(s, fBTSCountingQuantification _)
    return r
  }

  def fromBTSRange(o: BTSRange, isCompact: B): String = {
    val st = Printer.printBTSRange(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSRange(s: String): Either[BTSRange, Json.ErrorMsg] = {
    def fBTSRange(parser: Parser): BTSRange = {
      val r = parser.parseBTSRange()
      return r
    }
    val r = to(s, fBTSRange _)
    return r
  }

  def fromBTSTypeLibrary(o: BTSTypeLibrary, isCompact: B): String = {
    val st = Printer.printBTSTypeLibrary(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSTypeLibrary(s: String): Either[BTSTypeLibrary, Json.ErrorMsg] = {
    def fBTSTypeLibrary(parser: Parser): BTSTypeLibrary = {
      val r = parser.parseBTSTypeLibrary()
      return r
    }
    val r = to(s, fBTSTypeLibrary _)
    return r
  }

  def fromBTSTypeDeclatation(o: BTSTypeDeclatation, isCompact: B): String = {
    val st = Printer.printBTSTypeDeclatation(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSTypeDeclatation(s: String): Either[BTSTypeDeclatation, Json.ErrorMsg] = {
    def fBTSTypeDeclatation(parser: Parser): BTSTypeDeclatation = {
      val r = parser.parseBTSTypeDeclatation()
      return r
    }
    val r = to(s, fBTSTypeDeclatation _)
    return r
  }

  def fromBTSType(o: BTSType, isCompact: B): String = {
    val st = Printer.printBTSType(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSType(s: String): Either[BTSType, Json.ErrorMsg] = {
    def fBTSType(parser: Parser): BTSType = {
      val r = parser.parseBTSType()
      return r
    }
    val r = to(s, fBTSType _)
    return r
  }

  def fromBTSBooleanType(o: BTSBooleanType, isCompact: B): String = {
    val st = Printer.printBTSBooleanType(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSBooleanType(s: String): Either[BTSBooleanType, Json.ErrorMsg] = {
    def fBTSBooleanType(parser: Parser): BTSBooleanType = {
      val r = parser.parseBTSBooleanType()
      return r
    }
    val r = to(s, fBTSBooleanType _)
    return r
  }

  def fromBTSStringType(o: BTSStringType, isCompact: B): String = {
    val st = Printer.printBTSStringType(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSStringType(s: String): Either[BTSStringType, Json.ErrorMsg] = {
    def fBTSStringType(parser: Parser): BTSStringType = {
      val r = parser.parseBTSStringType()
      return r
    }
    val r = to(s, fBTSStringType _)
    return r
  }

  def fromBTSNullType(o: BTSNullType, isCompact: B): String = {
    val st = Printer.printBTSNullType(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSNullType(s: String): Either[BTSNullType, Json.ErrorMsg] = {
    def fBTSNullType(parser: Parser): BTSNullType = {
      val r = parser.parseBTSNullType()
      return r
    }
    val r = to(s, fBTSNullType _)
    return r
  }

  def fromBTSClassifier(o: BTSClassifier, isCompact: B): String = {
    val st = Printer.printBTSClassifier(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSClassifier(s: String): Either[BTSClassifier, Json.ErrorMsg] = {
    def fBTSClassifier(parser: Parser): BTSClassifier = {
      val r = parser.parseBTSClassifier()
      return r
    }
    val r = to(s, fBTSClassifier _)
    return r
  }

  def fromBTSTypeName(o: BTSTypeName, isCompact: B): String = {
    val st = Printer.printBTSTypeName(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSTypeName(s: String): Either[BTSTypeName, Json.ErrorMsg] = {
    def fBTSTypeName(parser: Parser): BTSTypeName = {
      val r = parser.parseBTSTypeName()
      return r
    }
    val r = to(s, fBTSTypeName _)
    return r
  }

  def fromBTSEnumerationType(o: BTSEnumerationType, isCompact: B): String = {
    val st = Printer.printBTSEnumerationType(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSEnumerationType(s: String): Either[BTSEnumerationType, Json.ErrorMsg] = {
    def fBTSEnumerationType(parser: Parser): BTSEnumerationType = {
      val r = parser.parseBTSEnumerationType()
      return r
    }
    val r = to(s, fBTSEnumerationType _)
    return r
  }

  def fromBTSQuantityType(o: BTSQuantityType, isCompact: B): String = {
    val st = Printer.printBTSQuantityType(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSQuantityType(s: String): Either[BTSQuantityType, Json.ErrorMsg] = {
    def fBTSQuantityType(parser: Parser): BTSQuantityType = {
      val r = parser.parseBTSQuantityType()
      return r
    }
    val r = to(s, fBTSQuantityType _)
    return r
  }

  def fromBTSArrayType(o: BTSArrayType, isCompact: B): String = {
    val st = Printer.printBTSArrayType(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSArrayType(s: String): Either[BTSArrayType, Json.ErrorMsg] = {
    def fBTSArrayType(parser: Parser): BTSArrayType = {
      val r = parser.parseBTSArrayType()
      return r
    }
    val r = to(s, fBTSArrayType _)
    return r
  }

  def fromBTSArrayRange(o: BTSArrayRange, isCompact: B): String = {
    val st = Printer.printBTSArrayRange(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSArrayRange(s: String): Either[BTSArrayRange, Json.ErrorMsg] = {
    def fBTSArrayRange(parser: Parser): BTSArrayRange = {
      val r = parser.parseBTSArrayRange()
      return r
    }
    val r = to(s, fBTSArrayRange _)
    return r
  }

  def fromBTSRecordType(o: BTSRecordType, isCompact: B): String = {
    val st = Printer.printBTSRecordType(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSRecordType(s: String): Either[BTSRecordType, Json.ErrorMsg] = {
    def fBTSRecordType(parser: Parser): BTSRecordType = {
      val r = parser.parseBTSRecordType()
      return r
    }
    val r = to(s, fBTSRecordType _)
    return r
  }

  def fromBTSRecordField(o: BTSRecordField, isCompact: B): String = {
    val st = Printer.printBTSRecordField(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSRecordField(s: String): Either[BTSRecordField, Json.ErrorMsg] = {
    def fBTSRecordField(parser: Parser): BTSRecordField = {
      val r = parser.parseBTSRecordField()
      return r
    }
    val r = to(s, fBTSRecordField _)
    return r
  }

  def fromBTSUnitLibrary(o: BTSUnitLibrary, isCompact: B): String = {
    val st = Printer.printBTSUnitLibrary(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSUnitLibrary(s: String): Either[BTSUnitLibrary, Json.ErrorMsg] = {
    def fBTSUnitLibrary(parser: Parser): BTSUnitLibrary = {
      val r = parser.parseBTSUnitLibrary()
      return r
    }
    val r = to(s, fBTSUnitLibrary _)
    return r
  }

  def fromBTSUnitDeclaration(o: BTSUnitDeclaration, isCompact: B): String = {
    val st = Printer.printBTSUnitDeclaration(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSUnitDeclaration(s: String): Either[BTSUnitDeclaration, Json.ErrorMsg] = {
    def fBTSUnitDeclaration(parser: Parser): BTSUnitDeclaration = {
      val r = parser.parseBTSUnitDeclaration()
      return r
    }
    val r = to(s, fBTSUnitDeclaration _)
    return r
  }

  def fromBTSRootDeclaration(o: BTSRootDeclaration, isCompact: B): String = {
    val st = Printer.printBTSRootDeclaration(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSRootDeclaration(s: String): Either[BTSRootDeclaration, Json.ErrorMsg] = {
    def fBTSRootDeclaration(parser: Parser): BTSRootDeclaration = {
      val r = parser.parseBTSRootDeclaration()
      return r
    }
    val r = to(s, fBTSRootDeclaration _)
    return r
  }

  def fromBTSUnitExtension(o: BTSUnitExtension, isCompact: B): String = {
    val st = Printer.printBTSUnitExtension(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSUnitExtension(s: String): Either[BTSUnitExtension, Json.ErrorMsg] = {
    def fBTSUnitExtension(parser: Parser): BTSUnitExtension = {
      val r = parser.parseBTSUnitExtension()
      return r
    }
    val r = to(s, fBTSUnitExtension _)
    return r
  }

  def fromBTSUnitName(o: BTSUnitName, isCompact: B): String = {
    val st = Printer.printBTSUnitName(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSUnitName(s: String): Either[BTSUnitName, Json.ErrorMsg] = {
    def fBTSUnitName(parser: Parser): BTSUnitName = {
      val r = parser.parseBTSUnitName()
      return r
    }
    val r = to(s, fBTSUnitName _)
    return r
  }

  def fromBTSUnitFormula(o: BTSUnitFormula, isCompact: B): String = {
    val st = Printer.printBTSUnitFormula(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSUnitFormula(s: String): Either[BTSUnitFormula, Json.ErrorMsg] = {
    def fBTSUnitFormula(parser: Parser): BTSUnitFormula = {
      val r = parser.parseBTSUnitFormula()
      return r
    }
    val r = to(s, fBTSUnitFormula _)
    return r
  }

  def fromBTSUnitFactor(o: BTSUnitFactor, isCompact: B): String = {
    val st = Printer.printBTSUnitFactor(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSUnitFactor(s: String): Either[BTSUnitFactor, Json.ErrorMsg] = {
    def fBTSUnitFactor(parser: Parser): BTSUnitFactor = {
      val r = parser.parseBTSUnitFactor()
      return r
    }
    val r = to(s, fBTSUnitFactor _)
    return r
  }

  def fromBTSQuantity(o: BTSQuantity, isCompact: B): String = {
    val st = Printer.printBTSQuantity(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSQuantity(s: String): Either[BTSQuantity, Json.ErrorMsg] = {
    def fBTSQuantity(parser: Parser): BTSQuantity = {
      val r = parser.parseBTSQuantity()
      return r
    }
    val r = to(s, fBTSQuantity _)
    return r
  }

  def fromBTSExceptionLibrary(o: BTSExceptionLibrary, isCompact: B): String = {
    val st = Printer.printBTSExceptionLibrary(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSExceptionLibrary(s: String): Either[BTSExceptionLibrary, Json.ErrorMsg] = {
    def fBTSExceptionLibrary(parser: Parser): BTSExceptionLibrary = {
      val r = parser.parseBTSExceptionLibrary()
      return r
    }
    val r = to(s, fBTSExceptionLibrary _)
    return r
  }

  def fromBTSExceptionDeclaration(o: BTSExceptionDeclaration, isCompact: B): String = {
    val st = Printer.printBTSExceptionDeclaration(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSExceptionDeclaration(s: String): Either[BTSExceptionDeclaration, Json.ErrorMsg] = {
    def fBTSExceptionDeclaration(parser: Parser): BTSExceptionDeclaration = {
      val r = parser.parseBTSExceptionDeclaration()
      return r
    }
    val r = to(s, fBTSExceptionDeclaration _)
    return r
  }

  def fromTODO(o: TODO, isCompact: B): String = {
    val st = Printer.printTODO(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toTODO(s: String): Either[TODO, Json.ErrorMsg] = {
    def fTODO(parser: Parser): TODO = {
      val r = parser.parseTODO()
      return r
    }
    val r = to(s, fTODO _)
    return r
  }

  def fromEmv2Annex(o: Emv2Annex, isCompact: B): String = {
    val st = Printer.printEmv2Annex(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEmv2Annex(s: String): Either[Emv2Annex, Json.ErrorMsg] = {
    def fEmv2Annex(parser: Parser): Emv2Annex = {
      val r = parser.parseEmv2Annex()
      return r
    }
    val r = to(s, fEmv2Annex _)
    return r
  }

  def fromEmv2Lib(o: Emv2Lib, isCompact: B): String = {
    val st = Printer.printEmv2Lib(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEmv2Lib(s: String): Either[Emv2Lib, Json.ErrorMsg] = {
    def fEmv2Lib(parser: Parser): Emv2Lib = {
      val r = parser.parseEmv2Lib()
      return r
    }
    val r = to(s, fEmv2Lib _)
    return r
  }

  def fromEmv2ElementRef(o: Emv2ElementRef, isCompact: B): String = {
    val st = Printer.printEmv2ElementRef(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEmv2ElementRef(s: String): Either[Emv2ElementRef, Json.ErrorMsg] = {
    def fEmv2ElementRef(parser: Parser): Emv2ElementRef = {
      val r = parser.parseEmv2ElementRef()
      return r
    }
    val r = to(s, fEmv2ElementRef _)
    return r
  }

  def fromEmv2Library(o: Emv2Library, isCompact: B): String = {
    val st = Printer.printEmv2Library(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEmv2Library(s: String): Either[Emv2Library, Json.ErrorMsg] = {
    def fEmv2Library(parser: Parser): Emv2Library = {
      val r = parser.parseEmv2Library()
      return r
    }
    val r = to(s, fEmv2Library _)
    return r
  }

  def fromErrorTypeDef(o: ErrorTypeDef, isCompact: B): String = {
    val st = Printer.printErrorTypeDef(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toErrorTypeDef(s: String): Either[ErrorTypeDef, Json.ErrorMsg] = {
    def fErrorTypeDef(parser: Parser): ErrorTypeDef = {
      val r = parser.parseErrorTypeDef()
      return r
    }
    val r = to(s, fErrorTypeDef _)
    return r
  }

  def fromErrorAliasDef(o: ErrorAliasDef, isCompact: B): String = {
    val st = Printer.printErrorAliasDef(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toErrorAliasDef(s: String): Either[ErrorAliasDef, Json.ErrorMsg] = {
    def fErrorAliasDef(parser: Parser): ErrorAliasDef = {
      val r = parser.parseErrorAliasDef()
      return r
    }
    val r = to(s, fErrorAliasDef _)
    return r
  }

  def fromErrorTypeSetDef(o: ErrorTypeSetDef, isCompact: B): String = {
    val st = Printer.printErrorTypeSetDef(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toErrorTypeSetDef(s: String): Either[ErrorTypeSetDef, Json.ErrorMsg] = {
    def fErrorTypeSetDef(parser: Parser): ErrorTypeSetDef = {
      val r = parser.parseErrorTypeSetDef()
      return r
    }
    val r = to(s, fErrorTypeSetDef _)
    return r
  }

  def fromBehaveStateMachine(o: BehaveStateMachine, isCompact: B): String = {
    val st = Printer.printBehaveStateMachine(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBehaveStateMachine(s: String): Either[BehaveStateMachine, Json.ErrorMsg] = {
    def fBehaveStateMachine(parser: Parser): BehaveStateMachine = {
      val r = parser.parseBehaveStateMachine()
      return r
    }
    val r = to(s, fBehaveStateMachine _)
    return r
  }

  def fromErrorEvent(o: ErrorEvent, isCompact: B): String = {
    val st = Printer.printErrorEvent(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toErrorEvent(s: String): Either[ErrorEvent, Json.ErrorMsg] = {
    def fErrorEvent(parser: Parser): ErrorEvent = {
      val r = parser.parseErrorEvent()
      return r
    }
    val r = to(s, fErrorEvent _)
    return r
  }

  def fromErrorState(o: ErrorState, isCompact: B): String = {
    val st = Printer.printErrorState(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toErrorState(s: String): Either[ErrorState, Json.ErrorMsg] = {
    def fErrorState(parser: Parser): ErrorState = {
      val r = parser.parseErrorState()
      return r
    }
    val r = to(s, fErrorState _)
    return r
  }

  def fromErrorTransition(o: ErrorTransition, isCompact: B): String = {
    val st = Printer.printErrorTransition(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toErrorTransition(s: String): Either[ErrorTransition, Json.ErrorMsg] = {
    def fErrorTransition(parser: Parser): ErrorTransition = {
      val r = parser.parseErrorTransition()
      return r
    }
    val r = to(s, fErrorTransition _)
    return r
  }

  def fromErrorCondition(o: ErrorCondition, isCompact: B): String = {
    val st = Printer.printErrorCondition(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toErrorCondition(s: String): Either[ErrorCondition, Json.ErrorMsg] = {
    def fErrorCondition(parser: Parser): ErrorCondition = {
      val r = parser.parseErrorCondition()
      return r
    }
    val r = to(s, fErrorCondition _)
    return r
  }

  def fromConditionTrigger(o: ConditionTrigger, isCompact: B): String = {
    val st = Printer.printConditionTrigger(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toConditionTrigger(s: String): Either[ConditionTrigger, Json.ErrorMsg] = {
    def fConditionTrigger(parser: Parser): ConditionTrigger = {
      val r = parser.parseConditionTrigger()
      return r
    }
    val r = to(s, fConditionTrigger _)
    return r
  }

  def fromAndCondition(o: AndCondition, isCompact: B): String = {
    val st = Printer.printAndCondition(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toAndCondition(s: String): Either[AndCondition, Json.ErrorMsg] = {
    def fAndCondition(parser: Parser): AndCondition = {
      val r = parser.parseAndCondition()
      return r
    }
    val r = to(s, fAndCondition _)
    return r
  }

  def fromOrCondition(o: OrCondition, isCompact: B): String = {
    val st = Printer.printOrCondition(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOrCondition(s: String): Either[OrCondition, Json.ErrorMsg] = {
    def fOrCondition(parser: Parser): OrCondition = {
      val r = parser.parseOrCondition()
      return r
    }
    val r = to(s, fOrCondition _)
    return r
  }

  def fromAllCondition(o: AllCondition, isCompact: B): String = {
    val st = Printer.printAllCondition(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toAllCondition(s: String): Either[AllCondition, Json.ErrorMsg] = {
    def fAllCondition(parser: Parser): AllCondition = {
      val r = parser.parseAllCondition()
      return r
    }
    val r = to(s, fAllCondition _)
    return r
  }

  def fromOrMoreCondition(o: OrMoreCondition, isCompact: B): String = {
    val st = Printer.printOrMoreCondition(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOrMoreCondition(s: String): Either[OrMoreCondition, Json.ErrorMsg] = {
    def fOrMoreCondition(parser: Parser): OrMoreCondition = {
      val r = parser.parseOrMoreCondition()
      return r
    }
    val r = to(s, fOrMoreCondition _)
    return r
  }

  def fromOrLessCondition(o: OrLessCondition, isCompact: B): String = {
    val st = Printer.printOrLessCondition(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toOrLessCondition(s: String): Either[OrLessCondition, Json.ErrorMsg] = {
    def fOrLessCondition(parser: Parser): OrLessCondition = {
      val r = parser.parseOrLessCondition()
      return r
    }
    val r = to(s, fOrLessCondition _)
    return r
  }

  def fromEmv2Clause(o: Emv2Clause, isCompact: B): String = {
    val st = Printer.printEmv2Clause(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEmv2Clause(s: String): Either[Emv2Clause, Json.ErrorMsg] = {
    def fEmv2Clause(parser: Parser): Emv2Clause = {
      val r = parser.parseEmv2Clause()
      return r
    }
    val r = to(s, fEmv2Clause _)
    return r
  }

  def fromEmv2Propagation(o: Emv2Propagation, isCompact: B): String = {
    val st = Printer.printEmv2Propagation(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEmv2Propagation(s: String): Either[Emv2Propagation, Json.ErrorMsg] = {
    def fEmv2Propagation(parser: Parser): Emv2Propagation = {
      val r = parser.parseEmv2Propagation()
      return r
    }
    val r = to(s, fEmv2Propagation _)
    return r
  }

  def fromEmv2Flow(o: Emv2Flow, isCompact: B): String = {
    val st = Printer.printEmv2Flow(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEmv2Flow(s: String): Either[Emv2Flow, Json.ErrorMsg] = {
    def fEmv2Flow(parser: Parser): Emv2Flow = {
      val r = parser.parseEmv2Flow()
      return r
    }
    val r = to(s, fEmv2Flow _)
    return r
  }

  def fromEmv2BehaviorSection(o: Emv2BehaviorSection, isCompact: B): String = {
    val st = Printer.printEmv2BehaviorSection(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEmv2BehaviorSection(s: String): Either[Emv2BehaviorSection, Json.ErrorMsg] = {
    def fEmv2BehaviorSection(parser: Parser): Emv2BehaviorSection = {
      val r = parser.parseEmv2BehaviorSection()
      return r
    }
    val r = to(s, fEmv2BehaviorSection _)
    return r
  }

  def fromErrorPropagation(o: ErrorPropagation, isCompact: B): String = {
    val st = Printer.printErrorPropagation(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toErrorPropagation(s: String): Either[ErrorPropagation, Json.ErrorMsg] = {
    def fErrorPropagation(parser: Parser): ErrorPropagation = {
      val r = parser.parseErrorPropagation()
      return r
    }
    val r = to(s, fErrorPropagation _)
    return r
  }

  def fromSmfAnnex(o: SmfAnnex, isCompact: B): String = {
    val st = Printer.printSmfAnnex(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toSmfAnnex(s: String): Either[SmfAnnex, Json.ErrorMsg] = {
    def fSmfAnnex(parser: Parser): SmfAnnex = {
      val r = parser.parseSmfAnnex()
      return r
    }
    val r = to(s, fSmfAnnex _)
    return r
  }

  def fromSmfLib(o: SmfLib, isCompact: B): String = {
    val st = Printer.printSmfLib(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toSmfLib(s: String): Either[SmfLib, Json.ErrorMsg] = {
    def fSmfLib(parser: Parser): SmfLib = {
      val r = parser.parseSmfLib()
      return r
    }
    val r = to(s, fSmfLib _)
    return r
  }

  def fromSmfClause(o: SmfClause, isCompact: B): String = {
    val st = Printer.printSmfClause(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toSmfClause(s: String): Either[SmfClause, Json.ErrorMsg] = {
    def fSmfClause(parser: Parser): SmfClause = {
      val r = parser.parseSmfClause()
      return r
    }
    val r = to(s, fSmfClause _)
    return r
  }

  def fromSmfClassification(o: SmfClassification, isCompact: B): String = {
    val st = Printer.printSmfClassification(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toSmfClassification(s: String): Either[SmfClassification, Json.ErrorMsg] = {
    def fSmfClassification(parser: Parser): SmfClassification = {
      val r = parser.parseSmfClassification()
      return r
    }
    val r = to(s, fSmfClassification _)
    return r
  }

  def fromSmfDeclass(o: SmfDeclass, isCompact: B): String = {
    val st = Printer.printSmfDeclass(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toSmfDeclass(s: String): Either[SmfDeclass, Json.ErrorMsg] = {
    def fSmfDeclass(parser: Parser): SmfDeclass = {
      val r = parser.parseSmfDeclass()
      return r
    }
    val r = to(s, fSmfDeclass _)
    return r
  }

  def fromSmfLibrary(o: SmfLibrary, isCompact: B): String = {
    val st = Printer.printSmfLibrary(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toSmfLibrary(s: String): Either[SmfLibrary, Json.ErrorMsg] = {
    def fSmfLibrary(parser: Parser): SmfLibrary = {
      val r = parser.parseSmfLibrary()
      return r
    }
    val r = to(s, fSmfLibrary _)
    return r
  }

  def fromSmfType(o: SmfType, isCompact: B): String = {
    val st = Printer.printSmfType(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toSmfType(s: String): Either[SmfType, Json.ErrorMsg] = {
    def fSmfType(parser: Parser): SmfType = {
      val r = parser.parseSmfType()
      return r
    }
    val r = to(s, fSmfType _)
    return r
  }

}