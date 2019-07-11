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

// This file is auto-generated from AadlAST.scala

package org.sireum.aadl.ir

import org.sireum._
import org.sireum.Json.Printer._

object JSON {

  object Printer {

    @pure def printAadl(o: Aadl): ST = {
      return printObject(ISZ(
        ("type", st""""Aadl""""),
        ("components", printISZ(F, o.components, printComponent _)),
        ("errorLib", printISZ(F, o.errorLib, printEmv2Library _)),
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
        ("annexes", printISZ(F, o.annexes, printAnnex _))
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
        ("properties", printISZ(F, o.properties, printProperty _))
      ))
    }

    @pure def printFeatureGroup(o: FeatureGroup): ST = {
      return printObject(ISZ(
        ("type", st""""FeatureGroup""""),
        ("identifier", printName(o.identifier)),
        ("features", printISZ(F, o.features, printFeature _)),
        ("isInverse", printB(o.isInverse)),
        ("category", printFeatureCategoryType(o.category)),
        ("properties", printISZ(F, o.properties, printProperty _))
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
        ("properties", printISZ(F, o.properties, printProperty _))
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
        ("properties", printISZ(F, o.properties, printProperty _))
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
        ("propertyValues", printISZ(F, o.propertyValues, printPropertyValue _))
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
        ("source", printOption(F, o.source, printFeature _)),
        ("sink", printOption(F, o.sink, printFeature _))
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
        case o: Emv2Library => return printEmv2Library(o)
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
      }
    }

    @pure def printEmv2Annex(o: Emv2Annex): ST = {
      o match {
        case o: Emv2Library => return printEmv2Library(o)
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
        ("extendType", printOption(F, o.extendType, printName _))
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
        ("componentBehavior", printOption(F, o.componentBehavior, printEmv2BehaviorSection _))
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
        ("sinkPropagation", printOption(F, o.sinkPropagation, printEmv2Propagation _))
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

    @pure def printOtherAnnex(o: OtherAnnex): ST = {
      return printObject(ISZ(
        ("type", st""""OtherAnnex""""),
        ("clause", printString(o.clause))
      ))
    }

    @pure def printBLESSAnnex(o: BLESSAnnex): ST = {
      o match {
        case o: BTSBLESSAnnexClause => return printBTSBLESSAnnexClause(o)
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
        ("arraySize", printOption(F, o.arraySize, printBLESSIntConst _)),
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

    @pure def printBTSType(o: BTSType): ST = {
      o match {
        case o: BTSClassifier => return printBTSClassifier(o)
      }
    }

    @pure def printBTSClassifier(o: BTSClassifier): ST = {
      return printObject(ISZ(
        ("type", st""""BTSClassifier""""),
        ("name", printName(o.name))
      ))
    }

    @pure def printBLESSIntConst(o: BLESSIntConst): ST = {
      return printObject(ISZ(
        ("type", st""""BLESSIntConst"""")
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
        case o: BTSExecuteCondition => return printBTSExecuteCondition(o)
        case o: BTSModeCondition => return printBTSModeCondition(o)
        case o: BTSInternalCondition => return printBTSInternalCondition(o)
      }
    }

    @pure def printBTSDispatchCondition(o: BTSDispatchCondition): ST = {
      return printObject(ISZ(
        ("type", st""""BTSDispatchCondition""""),
        ("dispatchTriggers", printISZ(F, o.dispatchTriggers, printBTSDispatchConjunction _)),
        ("frozenPorts", printISZ(F, o.frozenPorts, printName _))
      ))
    }

    @pure def printBTSDispatchConjunction(o: BTSDispatchConjunction): ST = {
      return printObject(ISZ(
        ("type", st""""BTSDispatchConjunction""""),
        ("conjunction", printISZ(F, o.conjunction, printBTSDispatchTrigger _))
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
        ("port", printName(o.port))
      ))
    }

    @pure def printBTSDispatchTriggerTimeout(o: BTSDispatchTriggerTimeout): ST = {
      return printObject(ISZ(
        ("type", st""""BTSDispatchTriggerTimeout""""),
        ("ports", printISZ(F, o.ports, printName _)),
        ("time", printOption(F, o.time, printBTSBehaviorTime _))
      ))
    }

    @pure def printBTSExecuteCondition(o: BTSExecuteCondition): ST = {
      return printObject(ISZ(
        ("type", st""""BTSExecuteCondition"""")
      ))
    }

    @pure def printBTSModeCondition(o: BTSModeCondition): ST = {
      return printObject(ISZ(
        ("type", st""""BTSModeCondition"""")
      ))
    }

    @pure def printBTSInternalCondition(o: BTSInternalCondition): ST = {
      return printObject(ISZ(
        ("type", st""""BTSInternalCondition"""")
      ))
    }

    @pure def printBTSAssertion(o: BTSAssertion): ST = {
      return printObject(ISZ(
        ("type", st""""BTSAssertion"""")
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
        case o: BTSSubprogramCallAction => return printBTSSubprogramCallAction(o)
        case o: BTSPortOutAction => return printBTSPortOutAction(o)
        case o: BTSPortInAction => return printBTSPortInAction(o)
        case o: BTSFrozenPortAction => return printBTSFrozenPortAction(o)
        case o: BTSIfBLESSAction => return printBTSIfBLESSAction(o)
        case o: BTSIfBAAction => return printBTSIfBAAction(o)
        case o: BTSExistentialLatticeQuantification => return printBTSExistentialLatticeQuantification(o)
        case o: BTSUniversalLatticeQuantification => return printBTSUniversalLatticeQuantification(o)
      }
    }

    @pure def printBTSBasicAction(o: BTSBasicAction): ST = {
      o match {
        case o: BTSSkipAction => return printBTSSkipAction(o)
        case o: BTSAssignmentAction => return printBTSAssignmentAction(o)
        case o: BTSSubprogramCallAction => return printBTSSubprogramCallAction(o)
        case o: BTSPortOutAction => return printBTSPortOutAction(o)
        case o: BTSPortInAction => return printBTSPortInAction(o)
        case o: BTSFrozenPortAction => return printBTSFrozenPortAction(o)
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
        ("lhs", printBTSExp(o.lhs)),
        ("rhs", printBTSExp(o.rhs))
      ))
    }

    @pure def printBTSCommunicationAction(o: BTSCommunicationAction): ST = {
      o match {
        case o: BTSSubprogramCallAction => return printBTSSubprogramCallAction(o)
        case o: BTSPortOutAction => return printBTSPortOutAction(o)
        case o: BTSPortInAction => return printBTSPortInAction(o)
        case o: BTSFrozenPortAction => return printBTSFrozenPortAction(o)
      }
    }

    @pure def printBTSSubprogramCallAction(o: BTSSubprogramCallAction): ST = {
      return printObject(ISZ(
        ("type", st""""BTSSubprogramCallAction""""),
        ("name", printName(o.name)),
        ("params", printISZ(F, o.params, printBTSFormalExpPair _))
      ))
    }

    @pure def printBTSPortOutAction(o: BTSPortOutAction): ST = {
      return printObject(ISZ(
        ("type", st""""BTSPortOutAction""""),
        ("name", printName(o.name)),
        ("exp", printOption(F, o.exp, printBTSExp _))
      ))
    }

    @pure def printBTSPortInAction(o: BTSPortInAction): ST = {
      return printObject(ISZ(
        ("type", st""""BTSPortInAction""""),
        ("name", printName(o.name)),
        ("variable", printBTSExp(o.variable))
      ))
    }

    @pure def printBTSFrozenPortAction(o: BTSFrozenPortAction): ST = {
      return printObject(ISZ(
        ("type", st""""BTSFrozenPortAction""""),
        ("portName", printName(o.portName))
      ))
    }

    @pure def printBTSControlAction(o: BTSControlAction): ST = {
      o match {
        case o: BTSIfBLESSAction => return printBTSIfBLESSAction(o)
        case o: BTSIfBAAction => return printBTSIfBAAction(o)
      }
    }

    @pure def printBTSIfBLESSAction(o: BTSIfBLESSAction): ST = {
      return printObject(ISZ(
        ("type", st""""BTSIfBLESSAction""""),
        ("availability", printOption(T, o.availability, printString _)),
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
        ("timeout", printOption(F, o.timeout, printBTSBehaviorTime _)),
        ("catchClause", printOption(T, o.catchClause, printString _))
      ))
    }

    @pure def printBTSUniversalLatticeQuantification(o: BTSUniversalLatticeQuantification): ST = {
      return printObject(ISZ(
        ("type", st""""BTSUniversalLatticeQuantification""""),
        ("latticeVariables", printISZ(F, o.latticeVariables, printName _)),
        ("range", printOption(T, o.range, printString _)),
        ("elq", printBTSExistentialLatticeQuantification(o.elq))
      ))
    }

    @pure def printBTSExp(o: BTSExp): ST = {
      o match {
        case o: BTSUnaryExp => return printBTSUnaryExp(o)
        case o: BTSBinaryExp => return printBTSBinaryExp(o)
        case o: BTSLiteralExp => return printBTSLiteralExp(o)
        case o: BTSNameExp => return printBTSNameExp(o)
        case o: BTSIndexingExp => return printBTSIndexingExp(o)
        case o: BTSAccessExp => return printBTSAccessExp(o)
        case o: BTSFunctionCall => return printBTSFunctionCall(o)
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
        case BTSBinaryOp.EQ => "EQ"
        case BTSBinaryOp.NEQ => "NEQ"
        case BTSBinaryOp.LT => "LT"
        case BTSBinaryOp.LTE => "LTE"
        case BTSBinaryOp.GT => "GT"
        case BTSBinaryOp.GTE => "GTE"
        case BTSBinaryOp.PLUS => "PLUS"
        case BTSBinaryOp.MINUS => "MINUS"
        case BTSBinaryOp.DIV => "DIV"
        case BTSBinaryOp.MULT => "MULT"
        case BTSBinaryOp.MOD => "MOD"
        case BTSBinaryOp.REM => "REM"
        case BTSBinaryOp.EXP => "EXP"
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
        ("exp", printString(o.exp))
      ))
    }

    @pure def printBTSNameExp(o: BTSNameExp): ST = {
      return printObject(ISZ(
        ("type", st""""BTSNameExp""""),
        ("name", printName(o.name))
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
        ("args", printISZ(F, o.args, printBTSFormalExpPair _))
      ))
    }

    @pure def printBTSFormalExpPair(o: BTSFormalExpPair): ST = {
      return printObject(ISZ(
        ("type", st""""BTSFormalExpPair""""),
        ("paramName", printOption(F, o.paramName, printName _)),
        ("exp", printOption(F, o.exp, printBTSExp _))
      ))
    }

    @pure def printBTSBehaviorTime(o: BTSBehaviorTime): ST = {
      return printObject(ISZ(
        ("type", st""""BTSBehaviorTime"""")
      ))
    }

  }

  @record class Parser(input: String) {
    val parser: Json.Parser = Json.Parser.create(input)

    def errorOpt: Option[Json.ErrorMsg] = {
      return parser.errorOpt
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
      parser.parseObjectKey("errorLib")
      val errorLib = parser.parseISZ(parseEmv2Library _)
      parser.parseObjectNext()
      parser.parseObjectKey("dataComponents")
      val dataComponents = parser.parseISZ(parseComponent _)
      parser.parseObjectNext()
      return Aadl(components, errorLib, dataComponents)
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
      return Component(identifier, category, classifier, features, subComponents, connections, connectionInstances, properties, flows, modes, annexes)
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
      return FeatureEnd(identifier, direction, category, classifier, properties)
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
      return FeatureGroup(identifier, features, isInverse, category, properties)
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
      return FeatureAccess(identifier, category, classifier, accessType, accessCategory, properties)
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
      return Connection(name, src, dst, kind, isBiDirectional, connectionInstances, properties)
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
      return Property(name, propertyValues)
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
      val source = parser.parseOption(parseFeature _)
      parser.parseObjectNext()
      parser.parseObjectKey("sink")
      val sink = parser.parseOption(parseFeature _)
      parser.parseObjectNext()
      return Flow(name, kind, source, sink)
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
      val t = parser.parseObjectTypes(ISZ("Emv2Library", "ErrorTypeDef", "ErrorAliasDef", "ErrorTypeSetDef", "BehaveStateMachine", "ErrorEvent", "ErrorState", "ErrorTransition", "ConditionTrigger", "AndCondition", "OrCondition", "AllCondition", "OrMoreCondition", "OrLessCondition", "Emv2Clause", "Emv2Propagation", "Emv2Flow", "Emv2BehaviorSection", "ErrorPropagation", "OtherAnnex", "BTSBLESSAnnexClause"))
      t.native match {
        case "Emv2Library" => val r = parseEmv2LibraryT(T); return r
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
        case _ => val r = parseBTSBLESSAnnexClauseT(T); return r
      }
    }

    def parseEmv2Annex(): Emv2Annex = {
      val t = parser.parseObjectTypes(ISZ("Emv2Library", "ErrorTypeDef", "ErrorAliasDef", "ErrorTypeSetDef", "BehaveStateMachine", "ErrorEvent", "ErrorState", "ErrorTransition", "ConditionTrigger", "AndCondition", "OrCondition", "AllCondition", "OrMoreCondition", "OrLessCondition", "Emv2Clause", "Emv2Propagation", "Emv2Flow", "Emv2BehaviorSection", "ErrorPropagation"))
      t.native match {
        case "Emv2Library" => val r = parseEmv2LibraryT(T); return r
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
      return ErrorTypeDef(id, extendType)
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
      return Emv2Clause(libraries, propagations, flows, componentBehavior)
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
      return Emv2Flow(identifier, kind, sourcePropagation, sinkPropagation)
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

    def parseBLESSAnnex(): BLESSAnnex = {
      val t = parser.parseObjectTypes(ISZ("BTSBLESSAnnexClause"))
      t.native match {
        case "BTSBLESSAnnexClause" => val r = parseBTSBLESSAnnexClauseT(T); return r
        case _ => val r = parseBTSBLESSAnnexClauseT(T); return r
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
      val arraySize = parser.parseOption(parseBLESSIntConst _)
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

    def parseBTSType(): BTSType = {
      val t = parser.parseObjectTypes(ISZ("BTSClassifier"))
      t.native match {
        case "BTSClassifier" => val r = parseBTSClassifierT(T); return r
        case _ => val r = parseBTSClassifierT(T); return r
      }
    }

    def parseBTSClassifier(): BTSClassifier = {
      val r = parseBTSClassifierT(F)
      return r
    }

    def parseBTSClassifierT(typeParsed: B): BTSClassifier = {
      if (!typeParsed) {
        parser.parseObjectType("BTSClassifier")
      }
      parser.parseObjectKey("name")
      val name = parseName()
      parser.parseObjectNext()
      return BTSClassifier(name)
    }

    def parseBLESSIntConst(): BLESSIntConst = {
      val r = parseBLESSIntConstT(F)
      return r
    }

    def parseBLESSIntConstT(typeParsed: B): BLESSIntConst = {
      if (!typeParsed) {
        parser.parseObjectType("BLESSIntConst")
      }
      return BLESSIntConst()
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
      val t = parser.parseObjectTypes(ISZ("BTSDispatchCondition", "BTSExecuteCondition", "BTSModeCondition", "BTSInternalCondition"))
      t.native match {
        case "BTSDispatchCondition" => val r = parseBTSDispatchConditionT(T); return r
        case "BTSExecuteCondition" => val r = parseBTSExecuteConditionT(T); return r
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
      parser.parseObjectKey("dispatchTriggers")
      val dispatchTriggers = parser.parseISZ(parseBTSDispatchConjunction _)
      parser.parseObjectNext()
      parser.parseObjectKey("frozenPorts")
      val frozenPorts = parser.parseISZ(parseName _)
      parser.parseObjectNext()
      return BTSDispatchCondition(dispatchTriggers, frozenPorts)
    }

    def parseBTSDispatchConjunction(): BTSDispatchConjunction = {
      val r = parseBTSDispatchConjunctionT(F)
      return r
    }

    def parseBTSDispatchConjunctionT(typeParsed: B): BTSDispatchConjunction = {
      if (!typeParsed) {
        parser.parseObjectType("BTSDispatchConjunction")
      }
      parser.parseObjectKey("conjunction")
      val conjunction = parser.parseISZ(parseBTSDispatchTrigger _)
      parser.parseObjectNext()
      return BTSDispatchConjunction(conjunction)
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
      return BTSDispatchTriggerPort(port)
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
      val time = parser.parseOption(parseBTSBehaviorTime _)
      parser.parseObjectNext()
      return BTSDispatchTriggerTimeout(ports, time)
    }

    def parseBTSExecuteCondition(): BTSExecuteCondition = {
      val r = parseBTSExecuteConditionT(F)
      return r
    }

    def parseBTSExecuteConditionT(typeParsed: B): BTSExecuteCondition = {
      if (!typeParsed) {
        parser.parseObjectType("BTSExecuteCondition")
      }
      return BTSExecuteCondition()
    }

    def parseBTSModeCondition(): BTSModeCondition = {
      val r = parseBTSModeConditionT(F)
      return r
    }

    def parseBTSModeConditionT(typeParsed: B): BTSModeCondition = {
      if (!typeParsed) {
        parser.parseObjectType("BTSModeCondition")
      }
      return BTSModeCondition()
    }

    def parseBTSInternalCondition(): BTSInternalCondition = {
      val r = parseBTSInternalConditionT(F)
      return r
    }

    def parseBTSInternalConditionT(typeParsed: B): BTSInternalCondition = {
      if (!typeParsed) {
        parser.parseObjectType("BTSInternalCondition")
      }
      return BTSInternalCondition()
    }

    def parseBTSAssertion(): BTSAssertion = {
      val r = parseBTSAssertionT(F)
      return r
    }

    def parseBTSAssertionT(typeParsed: B): BTSAssertion = {
      if (!typeParsed) {
        parser.parseObjectType("BTSAssertion")
      }
      return BTSAssertion()
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
      val t = parser.parseObjectTypes(ISZ("BTSSkipAction", "BTSAssignmentAction", "BTSSubprogramCallAction", "BTSPortOutAction", "BTSPortInAction", "BTSFrozenPortAction", "BTSIfBLESSAction", "BTSIfBAAction", "BTSExistentialLatticeQuantification", "BTSUniversalLatticeQuantification"))
      t.native match {
        case "BTSSkipAction" => val r = parseBTSSkipActionT(T); return r
        case "BTSAssignmentAction" => val r = parseBTSAssignmentActionT(T); return r
        case "BTSSubprogramCallAction" => val r = parseBTSSubprogramCallActionT(T); return r
        case "BTSPortOutAction" => val r = parseBTSPortOutActionT(T); return r
        case "BTSPortInAction" => val r = parseBTSPortInActionT(T); return r
        case "BTSFrozenPortAction" => val r = parseBTSFrozenPortActionT(T); return r
        case "BTSIfBLESSAction" => val r = parseBTSIfBLESSActionT(T); return r
        case "BTSIfBAAction" => val r = parseBTSIfBAActionT(T); return r
        case "BTSExistentialLatticeQuantification" => val r = parseBTSExistentialLatticeQuantificationT(T); return r
        case "BTSUniversalLatticeQuantification" => val r = parseBTSUniversalLatticeQuantificationT(T); return r
        case _ => val r = parseBTSUniversalLatticeQuantificationT(T); return r
      }
    }

    def parseBTSBasicAction(): BTSBasicAction = {
      val t = parser.parseObjectTypes(ISZ("BTSSkipAction", "BTSAssignmentAction", "BTSSubprogramCallAction", "BTSPortOutAction", "BTSPortInAction", "BTSFrozenPortAction"))
      t.native match {
        case "BTSSkipAction" => val r = parseBTSSkipActionT(T); return r
        case "BTSAssignmentAction" => val r = parseBTSAssignmentActionT(T); return r
        case "BTSSubprogramCallAction" => val r = parseBTSSubprogramCallActionT(T); return r
        case "BTSPortOutAction" => val r = parseBTSPortOutActionT(T); return r
        case "BTSPortInAction" => val r = parseBTSPortInActionT(T); return r
        case "BTSFrozenPortAction" => val r = parseBTSFrozenPortActionT(T); return r
        case _ => val r = parseBTSFrozenPortActionT(T); return r
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
      val lhs = parseBTSExp()
      parser.parseObjectNext()
      parser.parseObjectKey("rhs")
      val rhs = parseBTSExp()
      parser.parseObjectNext()
      return BTSAssignmentAction(lhs, rhs)
    }

    def parseBTSCommunicationAction(): BTSCommunicationAction = {
      val t = parser.parseObjectTypes(ISZ("BTSSubprogramCallAction", "BTSPortOutAction", "BTSPortInAction", "BTSFrozenPortAction"))
      t.native match {
        case "BTSSubprogramCallAction" => val r = parseBTSSubprogramCallActionT(T); return r
        case "BTSPortOutAction" => val r = parseBTSPortOutActionT(T); return r
        case "BTSPortInAction" => val r = parseBTSPortInActionT(T); return r
        case "BTSFrozenPortAction" => val r = parseBTSFrozenPortActionT(T); return r
        case _ => val r = parseBTSFrozenPortActionT(T); return r
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
      val params = parser.parseISZ(parseBTSFormalExpPair _)
      parser.parseObjectNext()
      return BTSSubprogramCallAction(name, params)
    }

    def parseBTSPortOutAction(): BTSPortOutAction = {
      val r = parseBTSPortOutActionT(F)
      return r
    }

    def parseBTSPortOutActionT(typeParsed: B): BTSPortOutAction = {
      if (!typeParsed) {
        parser.parseObjectType("BTSPortOutAction")
      }
      parser.parseObjectKey("name")
      val name = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("exp")
      val exp = parser.parseOption(parseBTSExp _)
      parser.parseObjectNext()
      return BTSPortOutAction(name, exp)
    }

    def parseBTSPortInAction(): BTSPortInAction = {
      val r = parseBTSPortInActionT(F)
      return r
    }

    def parseBTSPortInActionT(typeParsed: B): BTSPortInAction = {
      if (!typeParsed) {
        parser.parseObjectType("BTSPortInAction")
      }
      parser.parseObjectKey("name")
      val name = parseName()
      parser.parseObjectNext()
      parser.parseObjectKey("variable")
      val variable = parseBTSExp()
      parser.parseObjectNext()
      return BTSPortInAction(name, variable)
    }

    def parseBTSFrozenPortAction(): BTSFrozenPortAction = {
      val r = parseBTSFrozenPortActionT(F)
      return r
    }

    def parseBTSFrozenPortActionT(typeParsed: B): BTSFrozenPortAction = {
      if (!typeParsed) {
        parser.parseObjectType("BTSFrozenPortAction")
      }
      parser.parseObjectKey("portName")
      val portName = parseName()
      parser.parseObjectNext()
      return BTSFrozenPortAction(portName)
    }

    def parseBTSControlAction(): BTSControlAction = {
      val t = parser.parseObjectTypes(ISZ("BTSIfBLESSAction", "BTSIfBAAction"))
      t.native match {
        case "BTSIfBLESSAction" => val r = parseBTSIfBLESSActionT(T); return r
        case "BTSIfBAAction" => val r = parseBTSIfBAActionT(T); return r
        case _ => val r = parseBTSIfBAActionT(T); return r
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
      val availability = parser.parseOption(parser.parseString _)
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
      val timeout = parser.parseOption(parseBTSBehaviorTime _)
      parser.parseObjectNext()
      parser.parseObjectKey("catchClause")
      val catchClause = parser.parseOption(parser.parseString _)
      parser.parseObjectNext()
      return BTSExistentialLatticeQuantification(quantifiedVariables, actions, timeout, catchClause)
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
      parser.parseObjectKey("range")
      val range = parser.parseOption(parser.parseString _)
      parser.parseObjectNext()
      parser.parseObjectKey("elq")
      val elq = parseBTSExistentialLatticeQuantification()
      parser.parseObjectNext()
      return BTSUniversalLatticeQuantification(latticeVariables, range, elq)
    }

    def parseBTSExp(): BTSExp = {
      val t = parser.parseObjectTypes(ISZ("BTSUnaryExp", "BTSBinaryExp", "BTSLiteralExp", "BTSNameExp", "BTSIndexingExp", "BTSAccessExp", "BTSFunctionCall"))
      t.native match {
        case "BTSUnaryExp" => val r = parseBTSUnaryExpT(T); return r
        case "BTSBinaryExp" => val r = parseBTSBinaryExpT(T); return r
        case "BTSLiteralExp" => val r = parseBTSLiteralExpT(T); return r
        case "BTSNameExp" => val r = parseBTSNameExpT(T); return r
        case "BTSIndexingExp" => val r = parseBTSIndexingExpT(T); return r
        case "BTSAccessExp" => val r = parseBTSAccessExpT(T); return r
        case "BTSFunctionCall" => val r = parseBTSFunctionCallT(T); return r
        case _ => val r = parseBTSFunctionCallT(T); return r
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
      return BTSLiteralExp(typ, exp)
    }

    def parseBTSNameExp(): BTSNameExp = {
      val r = parseBTSNameExpT(F)
      return r
    }

    def parseBTSNameExpT(typeParsed: B): BTSNameExp = {
      if (!typeParsed) {
        parser.parseObjectType("BTSNameExp")
      }
      parser.parseObjectKey("name")
      val name = parseName()
      parser.parseObjectNext()
      return BTSNameExp(name)
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
      val args = parser.parseISZ(parseBTSFormalExpPair _)
      parser.parseObjectNext()
      return BTSFunctionCall(name, args)
    }

    def parseBTSFormalExpPair(): BTSFormalExpPair = {
      val r = parseBTSFormalExpPairT(F)
      return r
    }

    def parseBTSFormalExpPairT(typeParsed: B): BTSFormalExpPair = {
      if (!typeParsed) {
        parser.parseObjectType("BTSFormalExpPair")
      }
      parser.parseObjectKey("paramName")
      val paramName = parser.parseOption(parseName _)
      parser.parseObjectNext()
      parser.parseObjectKey("exp")
      val exp = parser.parseOption(parseBTSExp _)
      parser.parseObjectNext()
      return BTSFormalExpPair(paramName, exp)
    }

    def parseBTSBehaviorTime(): BTSBehaviorTime = {
      val r = parseBTSBehaviorTimeT(F)
      return r
    }

    def parseBTSBehaviorTimeT(typeParsed: B): BTSBehaviorTime = {
      if (!typeParsed) {
        parser.parseObjectType("BTSBehaviorTime")
      }
      return BTSBehaviorTime()
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

  def fromBLESSIntConst(o: BLESSIntConst, isCompact: B): String = {
    val st = Printer.printBLESSIntConst(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBLESSIntConst(s: String): Either[BLESSIntConst, Json.ErrorMsg] = {
    def fBLESSIntConst(parser: Parser): BLESSIntConst = {
      val r = parser.parseBLESSIntConst()
      return r
    }
    val r = to(s, fBLESSIntConst _)
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

  def fromBTSPortOutAction(o: BTSPortOutAction, isCompact: B): String = {
    val st = Printer.printBTSPortOutAction(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSPortOutAction(s: String): Either[BTSPortOutAction, Json.ErrorMsg] = {
    def fBTSPortOutAction(parser: Parser): BTSPortOutAction = {
      val r = parser.parseBTSPortOutAction()
      return r
    }
    val r = to(s, fBTSPortOutAction _)
    return r
  }

  def fromBTSPortInAction(o: BTSPortInAction, isCompact: B): String = {
    val st = Printer.printBTSPortInAction(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSPortInAction(s: String): Either[BTSPortInAction, Json.ErrorMsg] = {
    def fBTSPortInAction(parser: Parser): BTSPortInAction = {
      val r = parser.parseBTSPortInAction()
      return r
    }
    val r = to(s, fBTSPortInAction _)
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

  def fromBTSNameExp(o: BTSNameExp, isCompact: B): String = {
    val st = Printer.printBTSNameExp(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSNameExp(s: String): Either[BTSNameExp, Json.ErrorMsg] = {
    def fBTSNameExp(parser: Parser): BTSNameExp = {
      val r = parser.parseBTSNameExp()
      return r
    }
    val r = to(s, fBTSNameExp _)
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

  def fromBTSFormalExpPair(o: BTSFormalExpPair, isCompact: B): String = {
    val st = Printer.printBTSFormalExpPair(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSFormalExpPair(s: String): Either[BTSFormalExpPair, Json.ErrorMsg] = {
    def fBTSFormalExpPair(parser: Parser): BTSFormalExpPair = {
      val r = parser.parseBTSFormalExpPair()
      return r
    }
    val r = to(s, fBTSFormalExpPair _)
    return r
  }

  def fromBTSBehaviorTime(o: BTSBehaviorTime, isCompact: B): String = {
    val st = Printer.printBTSBehaviorTime(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBTSBehaviorTime(s: String): Either[BTSBehaviorTime, Json.ErrorMsg] = {
    def fBTSBehaviorTime(parser: Parser): BTSBehaviorTime = {
      val r = parser.parseBTSBehaviorTime()
      return r
    }
    val r = to(s, fBTSBehaviorTime _)
    return r
  }

}